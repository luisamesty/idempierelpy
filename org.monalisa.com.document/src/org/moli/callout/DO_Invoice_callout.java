package org.moli.callout;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.base.IColumnCallout;
import org.compiere.model.GridField;
import org.compiere.model.GridTab;
import org.compiere.model.MInvoice;
import org.compiere.model.MPriceList;
import org.compiere.model.MSequence;
import org.compiere.model.X_C_Invoice;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.DisplayType;
import org.compiere.util.Env;

public class DO_Invoice_callout  implements IColumnCallout {
	
	CLogger log = CLogger.getCLogger(DO_Invoice_callout.class);

	@Override
	public String start(Properties ctx, int WindowNo, GridTab mTab,
			GridField mField, Object value, Object oldValue) {
		// C_DocTypeTarget_ID AND AD_Org_ID
		if (mTab.getValue(MInvoice.COLUMNNAME_C_DocTypeTarget_ID) != null &&
				mTab.getValue(MInvoice.COLUMNNAME_AD_Org_ID) != null ) {
			log.warning("--C_Invoice_callout -- value="+value);
			docType (Env.getCtx(), WindowNo, mTab, mField, value);
	 	}

		return null;
	}
	
	/**
	 *	Invoice Header - DocType.
	 *		- PaymentRule
	 *		- temporary Document
	 *  Context:
	 *  	- DocSubTypeSO
	 *		- HasCharges
	 *	- (re-sets Business Partner info of required)
	 *	@param ctx context
	 *	@param WindowNo window no
	 *	@param mTab tab
	 *	@param mField field
	 *	@param value value
	 *	@return null or error message
	 */
	public String docType (Properties ctx, int WindowNo, GridTab mTab, GridField mField, Object value)
	{
		Integer C_DocType_ID = (Integer) mTab.getValue(MInvoice.COLUMNNAME_C_DocTypeTarget_ID);
		Integer AD_Org_ID = (Integer) mTab.getValue(MInvoice.COLUMNNAME_AD_Org_ID);
		String DocumentNo = "";
		String  OrgDocumentNo = "";
		
		if (C_DocType_ID == null || C_DocType_ID.intValue() == 0
				|| AD_Org_ID == null || AD_Org_ID.intValue() == 0)
			return "";

		String sql = "SELECT d.HasCharges,d.IsDocNoControlled," // 1..2
			+ "d.DocBaseType, " // 3
			+ "s.AD_Sequence_ID " //4
			+ "FROM C_DocType d "
			+ "LEFT OUTER JOIN AD_Sequence s ON (d.DocNoSequence_ID=s.AD_Sequence_ID) "
			+ "WHERE C_DocType_ID=?";		//	1
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			pstmt = DB.prepareStatement(sql, null);
			pstmt.setInt(1, C_DocType_ID.intValue());
			rs = pstmt.executeQuery();
			if (rs.next())
			{
				//	Charges - Set Context
				Env.setContext(ctx, WindowNo, "HasCharges", rs.getString("HasCharges"));
				//	DocumentNo
				if (rs.getString("IsDocNoControlled").equals("Y"))
				{
					int AD_Sequence_ID = rs.getInt("AD_Sequence_ID");
					DocumentNo = MSequence.getPreliminaryNo(mTab, AD_Sequence_ID);
					//mTab.setValue("DocumentNo", MSequence.getPreliminaryNo(mTab, AD_Sequence_ID));
				}
				//  DocBaseType - Set Context
				String s = rs.getString("DocBaseType");
				Env.setContext(ctx, WindowNo, "DocBaseType", s);
				//  AP Check & AR Credit Memo
				if (s.startsWith("AP"))
					mTab.setValue("PaymentRule", X_C_Invoice.PAYMENTRULE_Check);
				else if (s.endsWith("C"))
					mTab.setValue("PaymentRule", X_C_Invoice.PAYMENTRULE_OnCredit);
			}
		}
		catch (SQLException e)
		{
			log.log(Level.SEVERE, sql, e);
			return e.getLocalizedMessage();
		}
		finally
		{
			DB.close(rs, pstmt);
			rs = null; pstmt = null;
		}
		// Set DocumentNo Field 
		OrgDocumentNo = getAD_Sequence_No(ctx, C_DocType_ID, AD_Org_ID);
		if (OrgDocumentNo.compareToIgnoreCase("?") != 0)
			mTab.setValue("DocumentNo", OrgDocumentNo);
		else
			mTab.setValue("DocumentNo", DocumentNo);
		//
		return "";
	}	//	docType
	
	/**
	 * getAD_Sequence_No
	 * @param ctx
	 * @param C_DocType_ID
	 * @param AD_Org_ID
	 * @return
	 */
	private String getAD_Sequence_No(Properties ctx,  Integer C_DocType_ID, Integer AD_Org_ID ) {
		
		String Prefix = "";
		String Suffix = "";
		String DocumentNo = "?";
		Integer AD_Sequence_No = 0;
		Integer AD_Sequence_ID = 0;
		String retValue ="";
		
		String sql = "SELECT "
				+ "sno.AD_Sequence_ID, "
				+ "sno.prefix, "
				+ "sno.suffix , sno.currentnext "
				+ " FROM C_DocType docu "
				+ " LEFT OUTER JOIN AD_Sequence seq ON (docu.DocNoSequence_ID=seq.AD_Sequence_ID) "
				+ " LEFT OUTER JOIN AD_Sequence_No sno ON (sno.AD_Sequence_ID = seq.AD_Sequence_ID) "
				+ " WHERE docu.C_DocType_ID=? "
				+ " AND sno.AD_Org_ID= ?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, null);
				pstmt.setInt(1, C_DocType_ID.intValue());
				pstmt.setInt(2, AD_Org_ID.intValue());
				rs = pstmt.executeQuery();
				if (rs.next())
				{
					AD_Sequence_ID = rs.getInt("AD_Sequence_ID");
					Prefix = rs.getString("Prefix");
					Suffix = rs.getString("Suffix");
					AD_Sequence_No = rs.getInt("currentnext");
				}
			}
			catch (SQLException e)
			{
				log.log(Level.SEVERE, sql, e);
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null; pstmt = null;
			}
			// Final DocumentNo
			if (AD_Sequence_No >0) {
				// Prepare DocumentNo 
				MSequence seq = new MSequence(Env.getCtx(), AD_Sequence_ID, null);
				String decimalPattern = seq.getDecimalPattern();
				if (decimalPattern != null && decimalPattern.length() > 0)
					DocumentNo = new DecimalFormat(decimalPattern).format(AD_Sequence_No);
				else
					DocumentNo = String.valueOf(AD_Sequence_No);
				if (DocumentNo == null)
					DocumentNo = "?????";
				retValue= Prefix+DocumentNo+Suffix;
			} else {
				retValue= DocumentNo;
			}
			//	
			return retValue;
	}
}
