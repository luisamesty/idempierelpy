package org.moli.process;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;

import org.compiere.model.MCommission;
import org.compiere.model.MCommissionAmt;
import org.compiere.model.MCommissionDetail;
import org.compiere.model.MCommissionLine;
import org.compiere.model.MCommissionRun;
import org.compiere.model.MCurrency;
import org.compiere.model.MProcessPara;
import org.compiere.model.MUser;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.AdempiereSystemError;
import org.compiere.util.AdempiereUserError;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Language;
import org.compiere.util.Msg;
import org.moli.compiere.MO_Commission;
import org.moli.compiere.MO_CommissionAmt;
import org.moli.compiere.MO_CommissionDetail;
import org.moli.compiere.MO_CommissionLine;
import org.moli.compiere.MO_CommissionRun;

public class MOCommissionCalc extends SvrProcess {

	protected Timestamp		p_StartDate;
	protected int 			p_C_DocType_ID;
	//
	protected Timestamp		m_EndDate;
	protected MO_Commission		m_com;
	//
	protected Timestamp		m_StartDateOvr;  // Overrrided Start Date
	
	/**
	 *  Prepare - e.g., get Parameters.
	 */
	protected void prepare()
	{
		ProcessInfoParameter[] para = getParameter();
		for (int i = 0; i < para.length; i++)
		{
			String name = para[i].getParameterName();
			if (para[i].getParameter() == null)
				;
			else if (name.equals("StartDate"))
				p_StartDate = para[i].getParameterAsTimestamp();
			else if (name.equals("C_DocType_ID"))
				p_C_DocType_ID = para[i].getParameterAsInt();
			else
				MProcessPara.validateUnknownParameter(getProcessInfo().getAD_Process_ID(), para[i]);
		}
	}	//	prepare

	/**
	 *  Perform process.
	 *  @return Message (text with variables)
	 *  @throws Exception if not successful
	 */
	protected String doIt() throws Exception
	{
		checkParameters();
		setStartEndDate();
		if ( p_C_DocType_ID == 0) {
			StringBuilder msgreturn = new StringBuilder(Msg.translate(getCtx(), "InvalidArguments"));
				msgreturn.append("\r\n" );
				msgreturn.append(Msg.translate(getCtx(), "StartDate") + "="+p_StartDate+"\r\n");
				msgreturn.append(Msg.translate(getCtx(), "C_DocType_ID") + "="+p_C_DocType_ID+"\r\n");
			addLog(msgreturn.toString());
			return "@KO@";
		}
		// 
		MO_CommissionRun comRun = createCommissionRun(p_C_DocType_ID);
		
		for (MO_CommissionLine commissionLine : m_com.getLines())
		{
			//	Amt for Line - Updated By Trigger
			MO_CommissionAmt comAmt = new MO_CommissionAmt(comRun, commissionLine.getC_CommissionLine_ID());
			comAmt.saveEx();

			String sql = getCommissionCalculationSQL(commissionLine);
			if (log.isLoggable(Level.FINE)) log.fine("Line=" + commissionLine.getLine() + " - " + sql);

			createDetail(sql, comAmt);
			comAmt.calculateCommission();
			comAmt.saveEx();
		}	//	for all commission lines
		
		//	Save Last Run
		m_com.setDateLastRun (p_StartDate);
		m_com.saveEx();
		StringBuilder msgreturn = new StringBuilder("@C_CommissionRun_ID@ = ").append(comRun.getDocumentNo()) 
				.append(" - ").append(comRun.getDescription());
		addLog(comRun.getC_CommissionRun_ID(), null, null, msgreturn.toString(), MCommissionRun.Table_ID, comRun.getC_CommissionRun_ID());
		return "@OK@";
	}	//	doIt
	
	/**
	 *  Check if the process parameters are valid
	 *  @throws Exception if the commission record is not valid
	 */
	protected void checkParameters() {
		if (log.isLoggable(Level.INFO)) log.info("C_Commission_ID=" + getRecord_ID() + ", StartDate=" + p_StartDate);
		if (p_StartDate == null)
			p_StartDate = new Timestamp (System.currentTimeMillis());
		m_com = new MO_Commission (getCtx(), getRecord_ID(), get_TrxName());
		if (m_com.get_ID() == 0)
			throw new AdempiereUserError ("No Commission");
	}
	
	/**
	 *  Creates the Commission run with the parameter start date
	 *  and sets the description
	 *  parameter p_C_DocType_ID
	 *  @return MCommissionRun
	 */
	protected MO_CommissionRun createCommissionRun(int p_C_DocType_ID) {
		MO_CommissionRun comRun = new MO_CommissionRun(m_com);
		comRun.setStartDate(p_StartDate);
		comRun.setDescription(getCommissionRunDescription());
		comRun.setC_DocType_ID(p_C_DocType_ID);
		comRun.saveEx();
		return comRun;
	}
	
	/**
	 *  Returns the String that will be used for the description column
	 *  in the Commission Run
	 *  @return Description String
	 */
	protected String getCommissionRunDescription() {
		// 01-Jan-2000 - 31-Jan-2001 - USD
		SimpleDateFormat format = DisplayType.getDateFormat(DisplayType.Date);
		StringBuilder description = new StringBuilder().append(format.format(p_StartDate))
				.append(" - ").append(format.format(m_EndDate))
				.append(" - ").append(MCurrency.getISO_Code(getCtx(), m_com.getC_Currency_ID()));
		return description.toString();
	}
	
	/**
	 *  Creates the SQL statement string that is used to generate the
	 *  Commission detail records 
	 *  @param commissionLine MCommissionLine
	 *  @return SQL statement
	 */
	protected String getCommissionCalculationSQL(MO_CommissionLine commissionLine) {
		StringBuilder sql = new StringBuilder();
		if (MO_Commission.DOCBASISTYPE_Receipt.equals(m_com.getDocBasisType()))
		{
			sql.append(getPaymentCommissionSQL());
		}
		else if (MO_Commission.DOCBASISTYPE_Order.equals(m_com.getDocBasisType()))
		{
			sql.append(getOrderCommissionSQL());
		}
		else 	//	Invoice Basis
		{
			sql.append(getInvoiceCommissionSQL());
		}
		sql.append(getCommissionLineWhereClause(commissionLine));
		// LPY 36 Nuevos campos agregados
		// ValidFrom: Overrides Header  ValidFrom
		// ValidTo: Overrides Header ValidTo 
		if (commissionLine.getValidFrom()!= null && commissionLine.getValidTo()!= null) {
			setStartEndDateCommissionLine(commissionLine);
		} else {
			m_StartDateOvr = p_StartDate;
		}
		// LPY 36 Nuevos campos agregados
		//	Grouping
		if (!m_com.isListDetails())
			sql.append(" GROUP BY h.C_Currency_ID");
		
		return sql.toString();
	}
	
	/**
	 *  Creates the SQL statement for payments (C_Payment)
	 *  @return SQL statement
	 */
	protected String getPaymentCommissionSQL() {
		StringBuilder sql = new StringBuilder();
		if (m_com.isListDetails())
		{
			sql.append("SELECT h.C_Currency_ID, CASE WHEN h.GrandTotal <> 0 ")
				.append(" 		THEN (l.LineNetAmt*al.Amount/h.GrandTotal) ")
				.append("		ELSE 0 END AS Amt,")
				.append(" CASE WHEN h.GrandTotal <> 0 ")
				.append("		THEN (l.QtyInvoiced*al.Amount/h.GrandTotal) ")
				.append("		ELSE 0 END AS Qty,")
				.append(" NULL, l.C_InvoiceLine_ID, p.DocumentNo||'_'||h.DocumentNo,")
				.append(" COALESCE(prd.Value,l.Description), h.DateInvoiced ")
				.append("FROM C_Payment p")
				.append(" INNER JOIN C_AllocationLine al ON (p.C_Payment_ID=al.C_Payment_ID)")
				.append(" INNER JOIN C_Invoice h ON (al.C_Invoice_ID = h.C_Invoice_ID)")
				.append(" INNER JOIN C_InvoiceLine l ON (h.C_Invoice_ID = l.C_Invoice_ID) ")
				.append(" LEFT OUTER JOIN M_Product prd ON (l.M_Product_ID = prd.M_Product_ID) ")
				.append("WHERE p.DocStatus IN ('CL','CO','RE')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND p.AD_Client_ID = ?")
				.append(" AND p.DateTrx BETWEEN ? AND ?");
		}
		else
		{
			sql.append("SELECT h.C_Currency_ID, ")
				.append(" SUM(CASE WHEN h.GrandTotal <> 0 ")
				.append("		THEN l.LineNetAmt*al.Amount/h.GrandTotal ELSE 0 END) AS Amt,")
				.append(" SUM(CASE WHEN h.GrandTotal <> 0 ")
				.append("		THEN l.QtyInvoiced*al.Amount/h.GrandTotal ELSE 0 END) AS Qty,")
				.append(" NULL, NULL, NULL, NULL, MAX(h.DateInvoiced) ")
				.append("FROM C_Payment p")
				.append(" INNER JOIN C_AllocationLine al ON (p.C_Payment_ID=al.C_Payment_ID)")
				.append(" INNER JOIN C_Invoice h ON (al.C_Invoice_ID = h.C_Invoice_ID)")
				.append(" INNER JOIN C_InvoiceLine l ON (h.C_Invoice_ID = l.C_Invoice_ID) ")
				.append("WHERE p.DocStatus IN ('CL','CO','RE')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND p.AD_Client_ID = ?")
				.append(" AND p.DateTrx BETWEEN ? AND ?");
		}
		return sql.toString();
	}
	
	/**
	 *  Creates the SQL statement for orders (C_Order)
	 *  @return SQL statement
	 */
	protected String getOrderCommissionSQL() {
		StringBuilder sql = new StringBuilder();
		if (m_com.isListDetails())
		{
			sql.append("SELECT h.C_Currency_ID, l.LineNetAmt, l.QtyOrdered, ")
				.append("l.C_OrderLine_ID, NULL, h.DocumentNo,")
				.append(" COALESCE(prd.Value,l.Description),h.DateOrdered ")
				.append("FROM C_Order h")
				.append(" INNER JOIN C_OrderLine l ON (h.C_Order_ID = l.C_Order_ID)")
				.append(" LEFT OUTER JOIN M_Product prd ON (l.M_Product_ID = prd.M_Product_ID) ")
				.append("WHERE h.DocStatus IN ('CL','CO')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND h.AD_Client_ID = ?")
				.append(" AND h.DateOrdered BETWEEN ? AND ?");
		}
		else
		{
			sql.append("SELECT h.C_Currency_ID, SUM(l.LineNetAmt) AS Amt,")
				.append(" SUM(l.QtyOrdered) AS Qty, ")
				.append("NULL, NULL, NULL, NULL, MAX(h.DateOrdered) ")
				.append("FROM C_Order h")
				.append(" INNER JOIN C_OrderLine l ON (h.C_Order_ID = l.C_Order_ID) ")
				.append("WHERE h.DocStatus IN ('CL','CO')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND h.AD_Client_ID = ?")
				.append(" AND h.DateOrdered BETWEEN ? AND ?");
		}
		return sql.toString();
	}
	
	/**
	 *  Creates the SQL statement for invoices (C_Invoice)
	 *  @return SQL statement
	 */
	protected String getInvoiceCommissionSQL() {
		StringBuilder sql = new StringBuilder();
		if (m_com.isListDetails())
		{
			sql.append("SELECT h.C_Currency_ID, l.LineNetAmt, l.QtyInvoiced, ")
				.append("NULL, l.C_InvoiceLine_ID, h.DocumentNo,")
				.append(" COALESCE(prd.Value,l.C_InvoiceLine_Description),h.DateInvoiced ")
				.append("FROM RV_C_Invoice h")
				.append(" INNER JOIN RV_C_InvoiceLine l ON (h.C_Invoice_ID = l.C_Invoice_ID)")
				.append(" LEFT OUTER JOIN M_Product prd ON (l.M_Product_ID = prd.M_Product_ID) ")
				.append("WHERE h.DocStatus IN ('CL','CO','RE')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND h.AD_Client_ID = ?")
				.append(" AND h.DateInvoiced BETWEEN ? AND ?");
		}
		else
		{
			sql.append("SELECT h.C_Currency_ID, SUM(l.LineNetAmt) AS Amt,")
				.append(" SUM(l.QtyInvoiced) AS Qty, ")
				.append("NULL, NULL, NULL, NULL, MAX(h.DateInvoiced) ")
				.append("FROM RV_C_Invoice h")
				.append(" INNER JOIN RV_C_InvoiceLine l ON (h.C_Invoice_ID = l.C_Invoice_ID) ")
				.append("WHERE h.DocStatus IN ('CL','CO','RE')")
				.append(" AND h.IsSOTrx='Y'")
				.append(" AND h.AD_Client_ID = ?")
				.append(" AND h.DateInvoiced BETWEEN ? AND ?");
		}
		return sql.toString();
	}
	
	/**
	 *  Creates the SQL WHERE clause based on the field values 
	 *  defined in the Commission Lien record
	 *  @return SQL statement
	 */
	protected String getCommissionLineWhereClause(MO_CommissionLine commissionLine) {
		StringBuilder sql = new StringBuilder();
		//		CommissionOrders/Invoices
		if (commissionLine.isCommissionOrders())
		{
			MUser[] users = MUser.getOfBPartner(getCtx(), m_com.getC_BPartner_ID(), get_TrxName());
			if (users == null || users.length == 0)
				throw new AdempiereUserError ("Commission Business Partner has no Users/Contact");
			if (users.length == 1)
			{
				int SalesRep_ID = users[0].getAD_User_ID();
				sql.append(" AND h.SalesRep_ID=").append(SalesRep_ID);
			}
			else
			{
				log.warning("Not 1 User/Contact for C_BPartner_ID=" 
						+ m_com.getC_BPartner_ID() + " but " + users.length);
				sql.append(" AND h.SalesRep_ID IN (SELECT AD_User_ID FROM AD_User WHERE C_BPartner_ID=")
				.append(m_com.getC_BPartner_ID()).append(")");
			}
		}
		//		Organization
		if (commissionLine.getOrg_ID() != 0)
			sql.append(" AND h.AD_Org_ID=").append(commissionLine.getOrg_ID());
		//	BPartner
		if (commissionLine.getC_BPartner_ID() != 0)
			sql.append(" AND h.C_BPartner_ID=").append(commissionLine.getC_BPartner_ID());
		//	BPartner Group
		if (commissionLine.getC_BP_Group_ID() != 0)
			sql.append(" AND h.C_BPartner_ID IN ")
			.append("(SELECT C_BPartner_ID FROM C_BPartner WHERE C_BP_Group_ID=").append(commissionLine.getC_BP_Group_ID()).append(")");
		//	Sales Region
		if (commissionLine.getC_SalesRegion_ID() != 0)
			sql.append(" AND h.C_BPartner_Location_ID IN ")
			.append("(SELECT C_BPartner_Location_ID FROM C_BPartner_Location WHERE C_SalesRegion_ID=").append(commissionLine.getC_SalesRegion_ID()).append(")");
		//	Product
		if (commissionLine.getM_Product_ID() != 0)
			sql.append(" AND l.M_Product_ID=").append(commissionLine.getM_Product_ID());
		//	Product Category
		if (commissionLine.getM_Product_Category_ID() != 0)
			sql.append(" AND l.M_Product_ID IN ")
			.append("(SELECT M_Product_ID FROM M_Product WHERE M_Product_Category_ID=").append(commissionLine.getM_Product_Category_ID()).append(")");
		//	Payment Rule
		if (commissionLine.getPaymentRule() != null)
			sql.append(" AND h.PaymentRule='").append(commissionLine.getPaymentRule()).append("'");
		
		// LPY 36 Nuevos campos agregados
		// C_Bpartner_Location: Business Partner Location. Condicionado a que se incluya C_Bpartner_ID.
		if (commissionLine.getC_BPartner_Location_ID() != 0)
			sql.append(" AND h.C_BPartner_Location_ID IN ")
			.append("(SELECT C_BPartner_Location_ID FROM C_BPartner_Location WHERE C_BPartner_Location_ID=").append(commissionLine.getC_BPartner_Location_ID()).append(")");
		// MOLI_C_BP_Group_ID: Vendor Group
		if (commissionLine.getMOLI_C_BP_Group_ID() != 0)
			sql.append(" AND h.C_BPartner_ID IN ")
			.append("(SELECT C_BPartner_ID FROM C_BPartner WHERE C_BP_Group_ID=").append(commissionLine.getMOLI_C_BP_Group_ID()).append(")");
		// LPY 36 Nuevos campos agregados
		return sql.toString();
	}

	/**
	 * 	Set Start and End Date
	 */
	protected void setStartEndDate()
	{
		GregorianCalendar cal = new GregorianCalendar(Language.getLoginLanguage().getLocale());
		cal.setTimeInMillis(p_StartDate.getTime());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		//	Yearly
		if (MCommission.FREQUENCYTYPE_Yearly.equals(m_com.getFrequencyType()))
		{
			cal.set(Calendar.DAY_OF_YEAR, 1);
			p_StartDate = new Timestamp (cal.getTimeInMillis());
			//
			cal.add(Calendar.YEAR, 1);
			cal.add(Calendar.DAY_OF_YEAR, -1); 
			m_EndDate = new Timestamp (cal.getTimeInMillis());
			
		}
		//	Quarterly
		else if (MCommission.FREQUENCYTYPE_Quarterly.equals(m_com.getFrequencyType()))
		{
			cal.set(Calendar.DAY_OF_MONTH, 1);
			int month = cal.get(Calendar.MONTH);
			if (month < Calendar.APRIL)
				cal.set(Calendar.MONTH, Calendar.JANUARY);
			else if (month < Calendar.JULY)
				cal.set(Calendar.MONTH, Calendar.APRIL);
			else if (month < Calendar.OCTOBER)
				cal.set(Calendar.MONTH, Calendar.JULY);
			else
				cal.set(Calendar.MONTH, Calendar.OCTOBER);
			p_StartDate = new Timestamp (cal.getTimeInMillis());
			//
			cal.add(Calendar.MONTH, 3);
			cal.add(Calendar.DAY_OF_YEAR, -1); 
			m_EndDate = new Timestamp (cal.getTimeInMillis());
		}
		//	Weekly
		else if (MCommission.FREQUENCYTYPE_Weekly.equals(m_com.getFrequencyType()))
		{
			cal.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
			p_StartDate = new Timestamp (cal.getTimeInMillis());
			//
			cal.add(Calendar.DAY_OF_YEAR, 7); 
			m_EndDate = new Timestamp (cal.getTimeInMillis());
		}
		//	Monthly
		else if (MCommission.FREQUENCYTYPE_Monthly.equals(m_com.getFrequencyType()))
		{
			cal.set(Calendar.DAY_OF_MONTH, 1);
			p_StartDate = new Timestamp (cal.getTimeInMillis());
			//
			cal.add(Calendar.MONTH, 1);
			cal.add(Calendar.DAY_OF_YEAR, -1); 
			m_EndDate = new Timestamp (cal.getTimeInMillis());
		}
		//	Daily LPY-29 Daily Option included
		else if (MCommission.FREQUENCYTYPE_Daily.equals(m_com.getFrequencyType()))
		{
			p_StartDate = new Timestamp(cal.getTimeInMillis());
			m_EndDate = new Timestamp(cal.getTimeInMillis());
		}
		if (log.isLoggable(Level.FINE)) log.fine("setStartEndDate = " + p_StartDate + " - " + m_EndDate);
		
	}	//	setStartEndDate

	/**
	 * 	Set Start and End Date Overrides if Commission Line 
	 *  ValidFrom: Overrides Header  ValidFrom
	 *  ValidTo: Overrides Header ValidTo 
	 */
	protected void setStartEndDateCommissionLine(MO_CommissionLine commissionLine)
	{
		GregorianCalendar cal = new GregorianCalendar(Language.getLoginLanguage().getLocale());
		// Get ValidFrom from Commission Line
		cal.setTimeInMillis(commissionLine.getValidFrom().getTime());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		// Set p_StartDate
		m_StartDateOvr = new Timestamp(cal.getTimeInMillis());
		// Get ValidTo from Commission Line
		cal.setTimeInMillis(commissionLine.getValidTo().getTime());
		cal.set(Calendar.HOUR_OF_DAY, 0);
		cal.set(Calendar.MINUTE, 0);
		cal.set(Calendar.SECOND, 0);
		cal.set(Calendar.MILLISECOND, 0);
		// Set m_EndDate
		m_EndDate = new Timestamp(cal.getTimeInMillis());
	}
	/**
	 * 	Create Commission Detail
	 *	@param sql sql statement
	 *	@param comAmt parent
	 * @throws Exception 
	 */
	protected void createDetail (String sql, MO_CommissionAmt comAmt) throws Exception
	{
		try (PreparedStatement pstmt = DB.prepareStatement(sql, get_TrxName());)
		{
			pstmt.setInt(1, m_com.getAD_Client_ID());
			// Verify if ValidFrom Overrides p_StartDate
			if (m_StartDateOvr!=p_StartDate)
				pstmt.setTimestamp(2, m_StartDateOvr);
			else 
				pstmt.setTimestamp(2, p_StartDate);
			// Set EndDate
			pstmt.setTimestamp(3, m_EndDate);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next())
			{
				//	CommissionAmount, C_Currency_ID, Amt, Qty,
				MO_CommissionDetail cd = new MO_CommissionDetail (comAmt,
					rs.getInt(1), rs.getBigDecimal(2), rs.getBigDecimal(3));
					
				//	C_OrderLine_ID, C_InvoiceLine_ID,
				cd.setLineIDs(rs.getInt(4), rs.getInt(5));
				
				//	Reference, Info,
				String s = rs.getString(6);
				if (s != null)
					cd.setReference(s);
				s = rs.getString(7);
				if (s != null)
					cd.setInfo(s);
				
				//	Date
				Timestamp date = rs.getTimestamp(8);
				cd.setConvertedAmt(date);
				
				//
				if (!cd.save())
					throw new IllegalArgumentException ("CommissionCalc - Detail Not saved");
			}
		}
		catch (Exception e)
		{
			throw new AdempiereSystemError("System Error: " + e.getLocalizedMessage(), e);
		}
	}	//	createDetail

}
