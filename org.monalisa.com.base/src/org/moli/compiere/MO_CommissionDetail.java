package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;

import org.compiere.model.MCommissionAmt;
import org.compiere.model.MConversionRate;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class MO_CommissionDetail extends X_C_CommissionDetail implements I_C_CommissionDetail{
	
	private static final long serialVersionUID = 1L;
	
	static CLogger log = CLogger.getCLogger(MO_CommissionDetail.class);
	
	public MO_CommissionDetail(Properties ctx, int C_CommissionDetail_ID, String trxName) {
		super(ctx, C_CommissionDetail_ID, trxName);
		if (C_CommissionDetail_ID != 0)
			throw new IllegalArgumentException("Multi-Key");
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * 	Parent Constructor
	 *	@param amt commission amt
	 *	@param C_Currency_ID currency
	 *	@param Amt amount
	 *	@param Qty quantity
	 */
	public MO_CommissionDetail (MO_CommissionAmt amt, int C_Currency_ID,
		BigDecimal Amt, BigDecimal Qty)
	{
		super (amt.getCtx(), 0, amt.get_TrxName());
		setClientOrg(amt);
		setC_CommissionAmt_ID(amt.getC_CommissionAmt_ID());
		setC_Currency_ID (C_Currency_ID);
		setActualAmt (Amt);
		setActualQty (Qty);
		setConvertedAmt (Env.ZERO);
	}	//	MO_CommissionDetail
	
	/**
	 * @param ctx
	 * @param C_CommissionDetail_ID
	 * @param trxName
	 * @param virtualColumns
	 */
	public MO_CommissionDetail(Properties ctx, int C_CommissionDetail_ID, String trxName, String... virtualColumns) {
		super(ctx, C_CommissionDetail_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionDetail(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionDetail(Properties ctx, String C_CommissionDetail_UU, String trxName) {
		super(ctx, C_CommissionDetail_UU, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionDetail(Properties ctx, String C_CommissionDetail_UU, String trxName, String[] virtualColumns) {
		super(ctx, C_CommissionDetail_UU, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 	Set Line IDs
	 *	@param C_OrderLine_ID order
	 *	@param C_InvoiceLine_ID invoice
	 */
	public void setLineIDs (int C_OrderLine_ID, int C_InvoiceLine_ID)
	{
		if (C_OrderLine_ID != 0)
			setC_OrderLine_ID(C_OrderLine_ID);
		if (C_InvoiceLine_ID != 0)
			setC_InvoiceLine_ID(C_InvoiceLine_ID);
	}	//	setLineIDs

	
	/**
	 * 	Set Converted Amt
	 *	@param date for conversion
	 */
	public void setConvertedAmt (Timestamp date)
	{
		BigDecimal amt = MConversionRate.convertBase(getCtx(), 
			getActualAmt(), getC_Currency_ID(), date, 0, 	//	type
			getAD_Client_ID(), getAD_Org_ID());
		if (amt != null)
			setConvertedAmt(amt);
	}	//	setConvertedAmt

	
	/**
	 * 	After Save
	 *	@param newRecord new
	 *	@param success success
	 *	@return success
	 */
	@Override
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		if (!success)
			return success;
		if (!newRecord)
			updateAmtHeader();
		return success;
	}	//	afterSave
	
	/**
	 * 	After Delete
	 *	@param success success
	 *	@return success
	 */
	@Override
	protected boolean afterDelete (boolean success)
	{
		if (success)
			updateAmtHeader();
		return success;
	}	//	afterDelete
	
	/**
	 * 	Update Header (MCommissionAmt) amount
	 */
	private void updateAmtHeader()
	{
		MO_CommissionAmt amt = new MO_CommissionAmt(getCtx(), getC_CommissionAmt_ID(), get_TrxName());
		amt.calculateCommission();
		amt.saveEx();
	}	//	updateAmtHeader

}
