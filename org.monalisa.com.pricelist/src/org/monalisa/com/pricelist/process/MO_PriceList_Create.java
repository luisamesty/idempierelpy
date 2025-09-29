package org.monalisa.com.pricelist.process;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Vector;
import java.util.logging.Level;
import java.util.stream.Collectors;

import org.compiere.model.MAcctSchema;
import org.compiere.model.MClientInfo;
import org.compiere.model.MDiscountSchema;
import org.compiere.model.MDiscountSchemaLine;
import org.compiere.model.MMailText;
import org.compiere.model.MPriceList;
import org.compiere.model.MPriceListVersion;
import org.compiere.model.MProcessPara;
import org.compiere.model.MProduct;
import org.compiere.model.MProductPO;
import org.compiere.model.MProductPrice;
import org.compiere.model.MTable;
import org.compiere.model.MUser;
import org.compiere.model.ProductCost;
import org.compiere.model.Query;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.AdempiereSystemError;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.DB;
import org.compiere.util.Util;
import org.moli.moli.X_MOLI_ProductBrand;
import org.moli.moli.X_MOLI_ProductLine;
import org.monalisa.com.pricelist.model.MO_T_UpdateProductPrice;
import org.monalisa.com.pricelist.utils.EmailUtils;

/**
 * Update Price List Create process update
 */
@org.adempiere.base.annotation.Process
public class MO_PriceList_Create extends SvrProcess {
	/** Half Rounding of 50, 100 */
	public static final String		LIST_ROUNDING_HalfHundred_50100	= "H";
	/** Quarter Rounding of 25, 50, 75, 100 */
	public static final String		LIST_ROUNDING_Quarter_255075100	= "q";
	/** CSV Filename with date format */
	public static SimpleDateFormat	sdf								= new SimpleDateFormat("yyyyMMddHHmmss");

	/** Price List Version */
	private int						p_PriceList_Version_ID			= 0;
	/** User ID used for sending email notifications of updated product prices */
	private String					p_User_Email					= null;
	/** Delete Old Prices */
	private boolean					p_DeleteOld						= false;

	private int						m_AD_PInstance_ID				= 0;

	/** Price List Version */
	private MPriceListVersion		m_plv							= null;
	/** CSV file */
	private File					m_csvfile						= null;

	/**
	 * Prepare - e.g., get Parameters.
	 */
	protected void prepare() {
		for (ProcessInfoParameter para : getParameter()) {
			String name = para.getParameterName();
			if (para.getParameter() == null)
				;
			else if (name.equals("DeleteOld"))
				p_DeleteOld = para.getParameterAsBoolean();
			else if (name.equals(MUser.COLUMNNAME_EMail))
				p_User_Email = para.getParameterAsString();
			else
				MProcessPara.validateUnknownParameter(getProcessInfo().getAD_Process_ID(), para);
		}
		p_PriceList_Version_ID = getRecord_ID();
		m_AD_PInstance_ID = getAD_PInstance_ID();
	} //*prepare*/

	/**
	 * Process
	 * 
	 * @return message
	 * @throws Exception
	 */
	protected String doIt() throws Exception {
		log.info ("M_PriceList_Version_ID=" + p_PriceList_Version_ID 
				+ ", DeleteOld=" + p_DeleteOld);
		m_plv = new MPriceListVersion (getCtx(), p_PriceList_Version_ID, get_TrxName());
		if (m_plv.get_ID() == 0 || m_plv.get_ID() != p_PriceList_Version_ID)
			throw new AdempiereUserError("@NotFound@  @M_PriceList_Version_ID@=" + p_PriceList_Version_ID);
		//	
		String error = checkPrerequisites();
		if (error != null && error.length() > 0)
			throw new AdempiereUserError(error);
		return create();
	}	//	doIt

	/**
	 * 	Prepare Calculations
	 *	@return error message
	 */
	private String checkPrerequisites() {
		Object[] clientParam = new Object[] {m_plv.getAD_Client_ID()};
		//PO Prices must exists
		DB.executeUpdateEx(
				"UPDATE M_Product_PO SET PriceList = 0 WHERE PriceList IS NULL AND AD_Client_ID=?",
				clientParam, get_TrxName());
		DB.executeUpdateEx(
				"UPDATE M_Product_PO SET PriceLastPO = 0 WHERE PriceLastPO IS NULL AND AD_Client_ID=?",
				clientParam, get_TrxName());
		DB.executeUpdateEx(
				"UPDATE M_Product_PO SET PricePO = PriceLastPO WHERE (PricePO IS NULL OR PricePO = 0) AND PriceLastPO <> 0 AND AD_Client_ID=?",
				clientParam, get_TrxName());
		DB.executeUpdateEx(
				"UPDATE	M_Product_PO SET PricePO = 0 WHERE PricePO IS NULL AND AD_Client_ID=?",
				clientParam, get_TrxName());
		//  Set default current vendor
		DB.executeUpdateEx(
				"UPDATE M_Product_PO p SET IsCurrentVendor = 'Y' "
						+ "WHERE IsCurrentVendor = 'N'"
						+ " AND NOT EXISTS "
						+ "(SELECT pp.M_Product_ID FROM M_Product_PO pp "
						+ "WHERE pp.M_Product_ID=p.M_Product_ID "
						+ "GROUP BY pp.M_Product_ID HAVING COUNT(*) > 1) "
						+ "AND AD_Client_ID=?",
						clientParam, get_TrxName());

		/**
		 *	Make sure that we have only one active product vendor
		 */
		String whereClause = "IsCurrentVendor='Y' AND IsActive='Y'"
								+ " AND EXISTS (SELECT M_Product_ID FROM M_Product_PO x "
								+ "WHERE x.M_Product_ID=M_Product_PO.M_Product_ID"
								+ " AND IsCurrentVendor='Y' AND IsActive='Y' "
								+ "GROUP BY M_Product_ID HAVING COUNT(*) > 1)";
		String orderByClause = "M_Product_ID, Created";
		List<MProductPO> pos = new Query(getCtx(), MProductPO.Table_Name, whereClause, get_TrxName())
				.setClient_ID()
				.setOrderBy(orderByClause)
				.list();
		int success = 0;
		int errors = 0;
		int M_Product_ID = 0;
		for (MProductPO po : pos) {
			if (M_Product_ID != po.getM_Product_ID()) {
				M_Product_ID = po.getM_Product_ID();
				continue;
			}
			po.setIsCurrentVendor (false);
			if (po.save())
				success++;
			else {
				errors++;
				log.warning("Not updated " + po);
			}
		}
		log.info ("Current Vendor - Changes=" + success + ", Errors=" + errors);
		return null;

	}	//	checkPrerequisites

	/**
	 * 	Create Price List
	 *	@return info message
	 */
	private String create() throws Exception {
		StringBuffer info = new StringBuffer();

		/**	Delete Old Data	*/
		if (p_DeleteOld) {
			int no = DB.executeUpdateEx("DELETE FROM M_ProductPrice WHERE M_PriceList_Version_ID=?",
					new Object[] {p_PriceList_Version_ID}, get_TrxName());
			log.info("Deleted=" + no);
			info.append("@Deleted@=").append(no).append(" - ");
		}

		int M_Pricelist_Version_Base_ID = m_plv.getM_Pricelist_Version_Base_ID();
		MPriceList pl = m_plv.getPriceList();

		/**
		 *	For All Discount Lines in Sequence
		 */
		MDiscountSchema ds = new MDiscountSchema(getCtx(), m_plv.getM_DiscountSchema_ID(), get_TrxName());
		MDiscountSchemaLine[] dsl = ds.getLines(false);
		for (MDiscountSchemaLine dsLine : dsl) {
			// ignore inactive discount schema lines
			if( !dsLine.isActive() )
				continue;

			String message = "#" + dsLine.getSeqNo();
			String dd = dsLine.getDescription();
			if (dd != null && dd.length() > 0)
				message += " " + dd;

			// Clear Temporary Table
			DB.executeUpdateEx("DELETE FROM T_Selection WHERE AD_PInstance_ID=?", new Object[] { m_AD_PInstance_ID }, get_TrxName());

			//	Create Selection in Temporary Table
			StringBuilder sqlb = new StringBuilder("INSERT INTO T_Selection (AD_PInstance_ID, T_Selection_ID) ");
			int M_DiscountSchemaLine_ID = dsLine.getM_DiscountSchemaLine_ID();
			int p2 = M_Pricelist_Version_Base_ID;
			if (p2 == 0) { //	Create from PO	**
				p2 = dsLine.getAD_Client_ID();
				sqlb.append(
							"SELECT DISTINCT ?, po.M_Product_ID " // #1
							+ "FROM M_Product_PO po "
							+ " INNER JOIN M_Product p ON (p.M_Product_ID=po.M_Product_ID)"
							+ " INNER JOIN M_DiscountSchemaLine dl ON (dl.M_DiscountSchemaLine_ID=?) " // #2
							+ "WHERE p.AD_Client_ID IN (?, 0)" // #3
							+ " AND p.IsActive='Y' AND po.IsActive='Y'"
							// Optional Restrictions
							+ " AND (dl.Group1 IS NULL OR p.Group1=dl.Group1)"
							+ " AND (dl.Group2 IS NULL OR p.Group2=dl.Group2)"
							+ " AND (dl.C_BPartner_ID IS NULL OR po.C_BPartner_ID=dl.C_BPartner_ID)"
							+ " AND (dl.VendorCategory IS NULL OR po.VendorCategory=dl.VendorCategory)"
							+ " AND (dl.IsIgnoreIsCurrentVendor='Y' OR po.IsCurrentVendor='Y')"
							+ " AND (dl.M_Product_ID IS NULL OR p.M_Product_ID=dl.M_Product_ID)");
				if (dsLine.getM_Product_Category_ID() > 0) {
					sqlb.append(" AND p.M_Product_Category_ID IN (")
						.append(getSubCategoryWhereClause(dsLine.getM_Product_Category_ID()))
						.append(")");
				}
			} else { //	Create from Price List **
				sqlb.append(
							"SELECT DISTINCT ?, p.M_Product_ID " // #1
							+ "FROM M_ProductPrice pp"
							+ " INNER JOIN M_Product p ON (p.M_Product_ID=pp.M_Product_ID)"
							+ " INNER JOIN M_DiscountSchemaLine dl ON (dl.M_DiscountSchemaLine_ID=?) " // #2
							+ "WHERE pp.M_PriceList_Version_ID=?" // #3 PriceList_Version_Base_ID
							+ " AND p.IsActive='Y' AND pp.IsActive='Y'"
							// Optional Restrictions
							+ " AND (dl.Group1 IS NULL OR p.Group1=dl.Group1)"
							+ " AND (dl.Group2 IS NULL OR p.Group2=dl.Group2)"
							+ " AND ((dl.C_BPartner_ID IS NULL AND dl.VendorCategory IS NULL) OR EXISTS "
							+ "(SELECT * FROM M_Product_PO po"
							+ " WHERE po.M_Product_ID=p.M_Product_ID"
							+ "   AND (dl.C_BPartner_ID IS NULL OR po.C_BPartner_ID=dl.C_BPartner_ID)"
							+ "   AND (dl.VendorCategory IS NULL OR po.VendorCategory=dl.VendorCategory)))"
							+ " AND (dl.M_Product_ID IS NULL OR p.M_Product_ID=dl.M_Product_ID)");
				if (dsLine.getM_Product_Category_ID() > 0) {
					sqlb.append(" AND p.M_Product_Category_ID IN (")
						.append(getSubCategoryWhereClause(dsLine.getM_Product_Category_ID()))
						.append(")");
				}
			}

			// Select Product from Process Instance
			int noSelected = DB.executeUpdateEx(sqlb.toString(),
					new Object[] {m_AD_PInstance_ID, M_DiscountSchemaLine_ID, p2}, get_TrxName());
			message += ": @Selected@=" + noSelected;
			String sql = null;

			List<List<Object>> dataProductPrice = null;
			//
			if (M_Pricelist_Version_Base_ID == p_PriceList_Version_ID)
				sql = null; // We have Prices already
			else if (M_Pricelist_Version_Base_ID == 0)
			{
				/** Copy and Convert from Product_PO */
				sql = "SELECT plv.M_PriceList_Version_ID, po.M_Product_ID,"
						+ " plv.AD_Client_ID, plv.AD_Org_ID, plv.UpdatedBy, plv.UpdatedBy,"
						// Price List
						+ " COALESCE(currencyConvert(po.PriceList,"
						+ " po.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0),"
						// Price Std
						+ " COALESCE(currencyConvert(po.PriceList,"
						+ "	po.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0),"
						//	Price Limit
						+ " COALESCE(currencyConvert(po.PricePO,"
						+ " po.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0) "
						+ " FROM M_Product_PO po "
						+ " INNER JOIN M_PriceList_Version plv ON (plv.M_PriceList_Version_ID=?)" // #1
						+ " INNER JOIN M_PriceList pl ON (pl.M_PriceList_ID=plv.M_PriceList_ID)"
						+ " INNER JOIN M_DiscountSchemaLine dl ON (dl.M_DiscountSchemaLine_ID=?) " // #2
						//
						+ "WHERE EXISTS (SELECT * FROM T_Selection s WHERE s.AD_PInstance_ID=? AND po.M_Product_ID=s.T_Selection_ID)" // #3
						+ " AND ((dl.C_BPartner_ID IS NULL AND po.IsCurrentVendor='Y')"
						+ "      OR (po.C_BPartner_ID=dl.C_BPartner_ID AND (dl.IsIgnoreIsCurrentVendor='Y' OR po.IsCurrentVendor='Y')))"
						+ " AND po.IsActive='Y'";
			}
			else
			{
				/** Copy and Convert from other PriceList_Version */
				sql = "SELECT plv.M_PriceList_Version_ID, pp.M_Product_ID, "
						+ " plv.AD_Client_ID, plv.AD_Org_ID, plv.UpdatedBy, plv.UpdatedBy,"
						// Price List
						+ " COALESCE(currencyConvert(pp.PriceList,"
						+ " bpl.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0),"
						// Price Std
						+ " COALESCE(currencyConvert(pp.PriceStd,"
						+ " bpl.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0)," 
						//	Price Limit
						+ " COALESCE(currencyConvert(pp.PriceLimit,"
						+ " bpl.C_Currency_ID, pl.C_Currency_ID, dl.ConversionDate, dl.C_ConversionType_ID, plv.AD_Client_ID, plv.AD_Org_ID), 0) "
						+ " FROM M_ProductPrice pp"
						+ " INNER JOIN M_PriceList_Version plv ON (plv.M_PriceList_Version_ID=?)" // #1
						+ " INNER JOIN M_PriceList pl ON (pl.M_PriceList_ID=plv.M_PriceList_ID)"
						+ " INNER JOIN M_PriceList_Version bplv ON (pp.M_PriceList_Version_ID=bplv.M_PriceList_Version_ID)"
						+ " INNER JOIN M_PriceList bpl ON (bplv.M_PriceList_ID=bpl.M_PriceList_ID)"
						+ " INNER JOIN M_DiscountSchemaLine dl ON (dl.M_DiscountSchemaLine_ID=?) " // #2
						//
						+ " WHERE 		pp.M_PriceList_Version_ID=?" // #3 M_PriceList_Version_Base_ID
						+ " 		AND EXISTS (SELECT * FROM T_Selection s WHERE s.AD_PInstance_ID=? AND pp.M_Product_ID=s.T_Selection_ID)" // #4
						+ " 			AND pp.IsActive='Y'";
			}
			if (sql != null) {
				Object[] params;
				if (M_Pricelist_Version_Base_ID == 0)
					params = new Object[] { p_PriceList_Version_ID, M_DiscountSchemaLine_ID, m_AD_PInstance_ID };
				else
					params = new Object[] { p_PriceList_Version_ID, M_DiscountSchemaLine_ID, M_Pricelist_Version_Base_ID, m_AD_PInstance_ID };
				dataProductPrice = DB.getSQLArrayObjectsEx(get_TrxName(), sql, params);
			}

			if (dataProductPrice != null && dataProductPrice.size() > 0)
			{
				Map<BigDecimal, List<Object>> result = dataProductPrice	.stream()
																		.collect(Collectors.toMap(	list -> (BigDecimal) list.get(1),
																									list -> list, (existing, replacement) -> replacement));
				info.append(createOrUpdateProductPriceList(result, dsLine, pl.getStandardPrecision()));
			}

			if (!Util.isEmpty(p_User_Email, true))
				sendUpdateProductMail();
			addLog(message);
		} // for all lines

		int deleteCount = 0;
		// Clear Temporary Table
		deleteCount = DB.executeUpdateEx("DELETE FROM T_UpdatedProduct_Price WHERE Created > NOW() - INTERVAL '1W' ", get_TrxName());
		if (deleteCount > 0)
		{
			log.info(deleteCount + ", Record is delete from Update Product Price temporary Table");
			deleteCount = 0;
		}

		// Clear Temporary Table
		deleteCount = DB.executeUpdateEx("DELETE FROM T_Selection WHERE AD_PInstance_ID=?", new Object[] { m_AD_PInstance_ID }, get_TrxName());
		if (deleteCount > 0)
			log.info(deleteCount + ", Record is delete from Selection temporary Table");

		//
		MProductPrice[] pp = m_plv.getProductPrice(true);
		info.append(" - @Records@=").append(pp.length);
		return info.toString();
	}	//	create

	/**
	 * 	Calculate Price
	 *	@param base rule
	 *	@param list price
	 *	@param std price
	 *	@param limit price
	 *	@param fix amount
	 *	@param add amount
	 *	@param discount percent
	 *	@param round rule
	 *  @param M_Product_ID 
	 *	@return calculated price
	 */
	private BigDecimal calculate (String base, 
			BigDecimal list, BigDecimal std, BigDecimal limit, BigDecimal fix, 
			BigDecimal add, BigDecimal discount, String round, int curPrecision, int M_Product_ID) {
		BigDecimal calc = null;
		double dd = 0.0;
		if (MDiscountSchemaLine.LIST_BASE_ListPrice.equals(base))
			dd = list.doubleValue();
		else if (MDiscountSchemaLine.LIST_BASE_StandardPrice.equals(base))
			dd = std.doubleValue();
		else if (MDiscountSchemaLine.LIST_BASE_LimitPOPrice.equals(base))
			dd = limit.doubleValue();
		else if (MDiscountSchemaLine.LIST_BASE_FixedPrice.equals(base))
			calc = fix;
		else if (MDiscountSchemaLine.LIST_BASE_ProductCost.equals(base)) {
			MAcctSchema as = MClientInfo.get(getCtx(), m_plv.getAD_Client_ID()).getMAcctSchema1();
			ProductCost m_productCost = new ProductCost(getCtx(), M_Product_ID, 0, get_TrxName());
			m_productCost.setQty(BigDecimal.ONE);
			BigDecimal costs = m_productCost.getProductCosts(as, m_plv.getAD_Org_ID(), null, 0, false);	
			if (costs == null || costs.signum() == 0) { //	zero costs OK
				MProduct product = new MProduct(getCtx(), M_Product_ID, get_TrxName());
				if (product.isStocked())
					log.log(Level.WARNING, "No Costs for " + product.getName());
			}
			calc = costs;
		} else
			throw new IllegalArgumentException("Unknown Base=" + base);

		if (calc == null) {
			if (add.signum() != 0)
				dd += add.doubleValue();
			if (discount.signum() != 0)
				dd *= 1 - (discount.doubleValue()/100.0);
			calc = new BigDecimal(dd);
		}

		//	Rounding
		if (MDiscountSchemaLine.LIST_ROUNDING_CurrencyPrecision.equals(round))
			calc = calc.setScale(curPrecision, RoundingMode.HALF_UP);
		else if (MDiscountSchemaLine.LIST_ROUNDING_Dime102030.equals(round))
			calc = calc.setScale(1, RoundingMode.HALF_UP);
		else if (MDiscountSchemaLine.LIST_ROUNDING_Hundred.equals(round))
			calc = calc.setScale(-2, RoundingMode.HALF_UP);
		else if (MDiscountSchemaLine.LIST_ROUNDING_Nickel051015.equals(round)) {
			BigDecimal mm = new BigDecimal(20);
			calc = calc.multiply(mm); 
			calc = calc.setScale(0, RoundingMode.HALF_UP);
			calc = calc.divide(mm, 2, RoundingMode.HALF_UP);
		}
		else if (MDiscountSchemaLine.LIST_ROUNDING_NoRounding.equals(round))
			;
		else if (MDiscountSchemaLine.LIST_ROUNDING_Quarter255075.equals(round)) {
			BigDecimal mm = new BigDecimal(4);
			calc = calc.multiply(mm); 
			calc = calc.setScale(0, RoundingMode.HALF_UP);
			calc = calc.divide(mm, 2, RoundingMode.HALF_UP);
		}
		else if (MDiscountSchemaLine.LIST_ROUNDING_Ten10002000.equals(round))
			calc = calc.setScale(-1, RoundingMode.HALF_UP);
		else if (MDiscountSchemaLine.LIST_ROUNDING_Thousand.equals(round))
			calc = calc.setScale(-3, RoundingMode.HALF_UP);
		else if (MDiscountSchemaLine.LIST_ROUNDING_WholeNumber00.equals(round))
			calc = calc.setScale(0, RoundingMode.HALF_UP);
		else if (LIST_ROUNDING_Quarter_255075100.equals(round))
			calc = calc.divide(BigDecimal.valueOf(25), 0, RoundingMode.UP).multiply(BigDecimal.valueOf(25));
		else if (LIST_ROUNDING_HalfHundred_50100.equals(round))
			calc = calc.divide(BigDecimal.valueOf(50), 0, RoundingMode.UP).multiply(BigDecimal.valueOf(50));

		return calc;
	}	//	calculate

	/**
	 * Returns a sql where string with the given category id and all of its subcategory ids.
	 * It is used as restriction in MQuery.
	 * @param productCategoryId
	 * @return
	 * @throws  
	 */
	private String getSubCategoryWhereClause(int productCategoryId) throws SQLException, AdempiereSystemError {
		//if a node with this id is found later in the search we have a loop in the tree
		int subTreeRootParentId = 0;
		StringBuilder retString = new StringBuilder();
		String sql = " SELECT M_Product_Category_ID, M_Product_Category_Parent_ID FROM M_Product_Category";
		final Vector<SimpleTreeNode> categories = new Vector<SimpleTreeNode>(100);
		Statement stmt = null;
		ResultSet rs = null;
		try {
			stmt = DB.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				if(rs.getInt(1)==productCategoryId) {
					subTreeRootParentId = rs.getInt(2);
				}
				categories.add(new SimpleTreeNode(rs.getInt(1), rs.getInt(2)));
			}
			retString.append(getSubCategoriesString(productCategoryId, categories, subTreeRootParentId));
		} catch (SQLException e) {
			throw e;
		} finally {
			DB.close(rs, stmt);
			rs = null; stmt = null;
		}
		return retString.toString();
	}

	/**
	 * Recursive search for subcategories with loop detection.
	 * @param productCategoryId
	 * @param categories
	 * @param loopIndicatorId
	 * @return comma separated list of category ids
	 * @throws AdempiereSystemError if a loop is detected
	 */
	private String getSubCategoriesString(int productCategoryId, Vector<SimpleTreeNode> categories, int loopIndicatorId) throws AdempiereSystemError {
		StringBuilder ret = new StringBuilder();
		final Iterator<SimpleTreeNode> iter = categories.iterator();
		while (iter.hasNext()) {
			SimpleTreeNode node = iter.next();
			if (node.getParentId() == productCategoryId) {
				if (node.getNodeId() == loopIndicatorId) {
					throw new AdempiereSystemError("The product category tree contains a loop on categoryId: " + loopIndicatorId);
				}
				ret.append(getSubCategoriesString(node.getNodeId(), categories, loopIndicatorId));
				ret.append(",");
			}
		}
		if (log.isLoggable(Level.FINE)) log.fine(ret.toString());
		return ret.toString() + productCategoryId;
	}

	/**
	 * Simple tree node class for product category tree search.
	 * @author Karsten Thiemann, kthiemann@adempiere.org
	 *
	 */
	private static class SimpleTreeNode {

		private int nodeId;

		private int parentId;

		public SimpleTreeNode(int nodeId, int parentId) {
			this.nodeId = nodeId;
			this.parentId = parentId;
		}

		public int getNodeId() {
			return nodeId;
		}

		public int getParentId() {
			return parentId;
		}
	}

	private String createOrUpdateProductPriceList(Map<BigDecimal, List<Object>> dataProductPrice, MDiscountSchemaLine dsLine, int currPrecision)
	{
		StringBuilder info = new StringBuilder();
		/** Calculations **/
		MProductPrice[] pp = m_plv.getProductPrice(	" AND EXISTS (	SELECT * FROM T_Selection s "
													+ "				WHERE s.AD_PInstance_ID = " + m_AD_PInstance_ID
													+ "				AND s.T_Selection_ID=M_ProductPrice.M_Product_ID)");
		int count = 0;
		for (MProductPrice price : pp)
		{
			count+= updatePrice(price, dsLine, currPrecision, dataProductPrice.get(new BigDecimal(price.getM_Product_ID())));
			dataProductPrice.remove(new BigDecimal(price.getM_Product_ID()));
		} // for all products
		if (count > 0)
			info.append(" @Updated@ - " + count);

		if (dataProductPrice.size() > 0)
			info.append(createProductPrice(dataProductPrice, dsLine, currPrecision));
		return info.toString();
	} // createOrUpdateProductPriceList

	private String createProductPrice(Map<BigDecimal, List<Object>> dataProductPrice, MDiscountSchemaLine dsLine, int currPrecision)
	{
		int count = 0;
		for (Entry<BigDecimal, List<Object>> data : dataProductPrice.entrySet())
		{
			MProductPrice price = (MProductPrice) MTable.get(getCtx(), MProductPrice.Table_ID).getPO(0, get_TrxName());
			List<Object> list = data.getValue();
			price.setM_PriceList_Version_ID(((BigDecimal) list.get(0)).intValue());
			price.setM_Product_ID(((BigDecimal) list.get(1)).intValue());
			price.setAD_Org_ID(((BigDecimal) list.get(3)).intValue());
			price.setPriceList((BigDecimal) list.get(6));
			price.setPriceStd((BigDecimal) list.get(7));
			price.setPriceLimit((BigDecimal) list.get(8));

			updatePrice(price, dsLine, currPrecision, null);
			count++;
		}
		return " - @Created@=" + count;
	} // createProductPrice

	/**
	 * Update Price based on list
	 * 
	 * @param price
	 * @param dsLine
	 * @param curPrecision
	 * @param list         if Price is update than list is Object initial list
	 */
	private int updatePrice(MProductPrice price, MDiscountSchemaLine dsLine, int curPrecision, List<Object> list)
	{
		boolean isUpdate = !Objects.isNull(list);
		BigDecimal priceList = isUpdate ? (BigDecimal) list.get(6) : price.getPriceList();
		BigDecimal priceStd = isUpdate ? (BigDecimal) list.get(7) : price.getPriceStd();
		BigDecimal priceLimit = isUpdate ? (BigDecimal) list.get(8) : price.getPriceLimit();

		//
		price.setPriceList(calculate(	dsLine.getList_Base(),
										priceList, priceStd, priceLimit, dsLine.getList_Fixed(),
										dsLine.getList_AddAmt(), dsLine.getList_Discount(),
										dsLine.getList_Rounding(), curPrecision, price.getM_Product_ID()));
		price.setPriceStd(calculate(dsLine.getStd_Base(),
									priceList, priceStd, priceLimit, dsLine.getStd_Fixed(),
									dsLine.getStd_AddAmt(), dsLine.getStd_Discount(),
									dsLine.getStd_Rounding(), curPrecision, price.getM_Product_ID()));
		price.setPriceLimit(calculate(	dsLine.getLimit_Base(),
										priceList, priceStd, priceLimit, dsLine.getLimit_Fixed(),
										dsLine.getLimit_AddAmt(), dsLine.getLimit_Discount(),
										dsLine.getLimit_Rounding(), curPrecision, price.getM_Product_ID()));
		int count = 0;
		if (isUpdate && (price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceList)
							|| price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceStd)
							|| price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceLimit)))
		{
			count++;
			if (!Util.isEmpty(p_User_Email, true))
				addProductRow(price);
		}
		price.saveEx();
		return count;
	} // updatePrice

	private void addProductRow(MProductPrice price)
	{
		MProduct prod = (MProduct) price.getM_Product();

		//
		MO_T_UpdateProductPrice updatedPrice = (MO_T_UpdateProductPrice) MTable.get(getCtx(), MO_T_UpdateProductPrice.Table_Name).getPO(0, get_TrxName());
		updatedPrice.setSKU(prod.getSKU());
		updatedPrice.setUPC(prod.getUPC());
		updatedPrice.setProductName(prod.getName());
		updatedPrice.setDate1(price.getM_PriceList_Version().getValidFrom());
		updatedPrice.setVersionName(price.getM_PriceList_Version().getName());
		updatedPrice.setM_PriceList_Version_ID(price.getM_PriceList_Version_ID());

		// logic for PriceList changes
		boolean isChange = price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceList);
		updatedPrice.setOldPriceList(isChange ? (BigDecimal) price.get_ValueOld(MProductPrice.COLUMNNAME_PriceList) : null);
		updatedPrice.setPriceList(isChange ? price.getPriceList() : null);

		// logic for PriceStd changes
		isChange = price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceStd);
		updatedPrice.setOldPriceStd(isChange ? (BigDecimal) price.get_ValueOld(MProductPrice.COLUMNNAME_PriceStd) : null);
		updatedPrice.setPriceStd(isChange ? price.getPriceStd() : null);

		// logic for PriceLimit changes
		isChange = price.is_ValueChanged(MProductPrice.COLUMNNAME_PriceLimit);
		updatedPrice.setOldPriceLimit(isChange ? (BigDecimal) price.get_ValueOld(MProductPrice.COLUMNNAME_PriceLimit) : null);
		updatedPrice.setPriceLimit(isChange ? price.getPriceLimit() : null);

		int productBrand_ID = prod.get_ValueAsInt(X_MOLI_ProductBrand.COLUMNNAME_MOLI_ProductBrand_ID);
		if (productBrand_ID > 0)
		{
			updatedPrice.setBrandName(MTable.get(getCtx(), X_MOLI_ProductBrand.Table_Name)
											.getPO(productBrand_ID, get_TrxName())
											.get_ValueAsString("Name"));
		}

		int productLine_ID = prod.get_ValueAsInt(X_MOLI_ProductLine.COLUMNNAME_MOLI_ProductLine_ID);
		if (productLine_ID > 0)
		{
			updatedPrice.setLineName(MTable	.get(getCtx(), X_MOLI_ProductLine.Table_Name)
											.getPO(productLine_ID, get_TrxName())
											.get_ValueAsString("Name"));
		}
		updatedPrice.setCategoryName(prod.getM_Product_Category().getName());
		updatedPrice.setAD_PInstance_ID(m_AD_PInstance_ID);
		updatedPrice.save(get_TrxName());
	} // addProductRow

	private void sendUpdateProductMail()
	{
		// Get Mail Template
		MMailText mailText = new Query(getCtx(), MMailText.Table_Name, " Name Like 'PriceList_Update' ", get_TrxName()).setOnlyActiveRecords(true).first();
		if (mailText == null)
			throw new IllegalStateException("Mail template for 'PriceList_Update' is not found");
		String emailMSG = mailText.getMailText(true);
		StringBuilder row = new StringBuilder();

		Query query = new Query(getCtx(), MO_T_UpdateProductPrice.Table_Name, " AD_PInstance_ID = ? ", get_TrxName());
		query.setParameters(m_AD_PInstance_ID);
		query.setOrderBy("ORDER BY BrandName, LineName, CategoryName ");
		List<MO_T_UpdateProductPrice> prodPriceList = query.list();

		if (prodPriceList.size() > 0)
		{
			m_csvfile = new File(System.getProperty("java.io.tmpdir") + "/" + getFileName("UpdatePriceList") + ".csv");

			try (FileWriter writer = new FileWriter(m_csvfile))
			{
				String[] headers = {
										"Date",
											"Pricelist Version",
											"Brand",
											"Line",
											"Category",
											"SKU",
											"UPC",
											"Product",
											"Old List Price",
											"New List Price",
											"Old Standard Price",
											"New Standard Price",
											"Old Limit Price",
											"New Limit Price"
				};

				SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
				String style = "style=\" border: 1px solid; padding: 2.5px; \"";
				row.append("<TABLE " + style + "> 			");

				// Table Header
				row.append("		<THEAD><TR>				");
				for (String column : headers)
				{
					row.append("		<TH " + style + ">	");
					row.append(column);
					row.append("		</TH>				");
				}
				row.append("		</TR></THEAD>			");

				// CSV file Header file
				writer.append(String.join(",", headers));
				writer.append("\n");

				// Table Body
				row.append("		<TBODY>					");
				for (MO_T_UpdateProductPrice productPrice : prodPriceList)
				{
					List<String> columns = new ArrayList<String>();
					columns.add(sdf.format(new Date(productPrice.getDate1().getTime())));
					columns.add(productPrice.getVersionName());
					columns.add(productPrice.getBrandName());
					columns.add(productPrice.getLineName());
					columns.add(productPrice.getCategoryName());
					columns.add(productPrice.getSKU());
					columns.add(productPrice.getUPC());
					columns.add(productPrice.getProductName());
					addPriceChangeColumns(columns, productPrice.getOldPriceList(), productPrice.getPriceList());
					addPriceChangeColumns(columns, productPrice.getOldPriceStd(), productPrice.getPriceStd());
					addPriceChangeColumns(columns, productPrice.getOldPriceLimit(), productPrice.getPriceLimit());

					// table Row inserted
					row.append("	<TR>					");
					for (String column : columns)
					{
						row.append("	<TD " + style + ">	");
						row.append(column);
						row.append("	</TD>				");
					}
					row.append("	</TR>					");

					// CSV Row inserted
					String csvLine = String.join(",", columns);
					writer.append(csvLine);
					writer.append("\n");
				}
				row.append("	</TBODY>					");
				row.append("</TABLE> 						");

				writer.flush();
			}
			catch (IOException e)
			{
				log.severe("CSV file is not created due to :" + e.getLocalizedMessage());
			}

			//
			EmailUtils.sendEmail(	getCtx(), List.of(m_csvfile), getEmails(p_User_Email), null, true, mailText.getMailHeader(),
									emailMSG + " <br/><br/> " + row.toString());
		}
	} // sendUpdateProductMail

	private ArrayList<String> getEmails(String userEmail)
	{
		String[] userEmails = userEmail.split("[,:]");
		userEmails = Arrays	.stream(userEmails)
							.map(String::trim)
							.filter(s -> !s.isEmpty())
							.toArray(String[]::new);
		// Return as ArrayList instead of List.of (immutable)
		return new ArrayList<>(Arrays.asList(userEmails));
	} // getEmails

	private void addPriceChangeColumns(List<String> columns, BigDecimal oldValue, BigDecimal newValue)
	{
		if (oldValue.compareTo(newValue) != 0)
		{
			columns.add(oldValue.toString());
			columns.add(newValue.toString());
		}
		else
		{
			columns.add("");
			columns.add("");
		}
	} // addPriceChangeColumns

	/**
	 * Get File Name for Product Price List
	 * 
	 * @return File Name
	 */
	private String getFileName(String prefix)
	{
		return prefix + "_" + m_AD_PInstance_ID + "_" + sdf.format(Calendar.getInstance().getTime());
	} // getFileName

} // M_PriceList_Create