package org.moli.compiere;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MInOut;
import org.compiere.model.MInvoice;
import org.compiere.model.MOrder;
import org.compiere.model.MSequence;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MO_InOut extends MInOut{

	private static final long serialVersionUID = 3900680924929341732L;

	static CLogger log = CLogger.getCLogger(MO_InOut.class);
	
	public MO_InOut(MInOut original, int C_DocTypeShipment_ID, Timestamp movementDate) {
		super(original, C_DocTypeShipment_ID, movementDate);
		// 
	}
	
	public MO_InOut(MInvoice invoice, int C_DocTypeShipment_ID, Timestamp movementDate, int M_Warehouse_ID) {
		super(invoice, C_DocTypeShipment_ID, movementDate, M_Warehouse_ID);
		// 
	}
	
	public MO_InOut(MOrder order, int C_DocTypeShipment_ID, Timestamp movementDate) {
		super(order, C_DocTypeShipment_ID, movementDate);
		// 
	}


	public MO_InOut(Properties ctx, int M_InOut_ID, String trxName) {
		super(ctx, M_InOut_ID, trxName);
		// 
	}


	public MO_InOut(Properties ctx, int M_InOut_ID, String trxName, String[] virtualColumns) {
		super(ctx, M_InOut_ID, trxName, virtualColumns);
		// 
	}


	public MO_InOut(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// 
	}

	public MO_InOut(Properties ctx, String M_InOut_UU, String trxName) {
		super(ctx, M_InOut_UU, trxName);
		//
	}

	/**
	 * 	Called after Save for Post-Save Operation
	 * 	@param newRecord new record
	 *	@param success true if save operation was success
	 *	@return if save was a success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		log.warning("---- MO_InOut afterSave ------ newRecord="+newRecord );
		// Set DocumentNo Field 
		if(newRecord) {
			String OrgDocumentNo = getAD_Sequence_No( getCtx(), getC_DocType_ID(), getAD_Org_ID());
			log.warning("---- MO_InOut afterSave ------ OrgDocumentNo="+OrgDocumentNo );
			if (OrgDocumentNo.compareToIgnoreCase("?") != 0) {
				updateDocumentNoOrg(OrgDocumentNo);
				updateMOLIDocumentNoOrg(OrgDocumentNo);
			}
		}
		return success;
	}	//	afterSave
	
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
				// COncatenate Prefix and Suffix When not null
				if (Prefix !=null && !Prefix.isEmpty())
					retValue= Prefix+DocumentNo;
				if (Suffix !=null && !Suffix.isEmpty())
					retValue= retValue+Suffix;
			} else {
				// Default AD_Sequence Number when no Org Sequence is found
				retValue= DocumentNo;
			}
			//	
			return retValue;
	}
	
	/**
	 * updateDocumentNoOrg on M_InOut
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE M_InOut Set DocumentNo='"+DocumentNoOrg+"' WHERE M_InOut_ID=").append(getM_InOut_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
	/**
	 * updateMOLIDocumentNoOrg
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateMOLIDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE M_InOut Set MOLI_FiscalDocumentNo='"+DocumentNoOrg+"' WHERE M_InOut_ID=").append(getM_InOut_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
}
