package org.moli.compiere;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.base.Core;
import org.adempiere.base.ICreditManager;
import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MPayment;
import org.compiere.model.MPeriod;
import org.compiere.model.MSequence;
import org.compiere.model.MSysConfig;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.process.DocAction;
import org.compiere.process.DocumentEngine;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class MO_Payment extends MPayment{

	
	private static final long serialVersionUID = 7475967646708838523L;


	static CLogger log = CLogger.getCLogger(MO_Payment.class);
	
	public MO_Payment(Properties ctx, int C_Payment_ID, String trxName) {
		super(ctx, C_Payment_ID, trxName);
		// 
	}
	
	public MO_Payment(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// 
	}

	public MO_Payment(Properties ctx, String C_Payment_UU, String trxName) {
		super(ctx, C_Payment_UU, trxName);
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
		// log.warning("---- MO_Payment afterSave ------ newRecord="+newRecord );
		// Set DocumentNo Field 
		if(newRecord) {
			String OrgDocumentNo = getAD_Sequence_No( getCtx(), getC_DocType_ID(), getAD_Org_ID());
			// log.warning("---- MO_Payment afterSave ------ OrgDocumentNo="+OrgDocumentNo );
			if (OrgDocumentNo.compareToIgnoreCase("?") != 0) {
				updateDocumentNoOrg(OrgDocumentNo);
				updateMOLIDocumentNoOrg(OrgDocumentNo);
				this.setDocumentNo(OrgDocumentNo);
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
	 * updateDocumentNoOrg on C_Payment
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE C_Payment Set DocumentNo='"+DocumentNoOrg+"' WHERE C_Payment_ID=").append(getC_Payment_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
	/**
	 * updateMOLIDocumentNoOrg on C_Payment
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateMOLIDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE C_Payment Set MOLI_FiscalDocumentNo='"+DocumentNoOrg+"' WHERE C_Payment_ID=").append(getC_Payment_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
	/**
	 * 	Reverse Correction
	 * 	@return true if success 
	 */
	@Override
	public boolean reverseCorrectIt()
	{
		if (log.isLoggable(Level.INFO)) log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		StringBuilder info = reverse(false);
		if (info == null) {
			return false;
		}
		
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		m_processMsg = info.toString();
		return true;
	}	//	reverseCorrectionIt

	/**
	 * Reverse this payment
	 * @param accrual true to use current date, false to use this document's accounting date
	 * @return process message or null if there's error
	 */
	protected StringBuilder reverse(boolean accrual) {
		if (!voidOnlinePayment())
			return null;
		
		//	Std Period open?
		Timestamp dateAcct = accrual ? Env.getContextAsDate(getCtx(), Env.DATE) : getDateAcct();
		if (dateAcct == null) {
			dateAcct = new Timestamp(System.currentTimeMillis());
		}
		MPeriod.testPeriodOpen(getCtx(), dateAcct, getC_DocType_ID(), getAD_Org_ID());
		
		if (getC_BankStatementLine_ID() > 0 && isReconciled()) {
			boolean allow = MSysConfig.getBooleanValue(MSysConfig.ALLOW_REVERSAL_OF_RECONCILED_PAYMENT, true, Env.getAD_Client_ID(getCtx()));
			if (!allow) {
				m_processMsg = Msg.getMsg(getCtx(), "NotAllowReversalOfReconciledPayment");
				return null;
			}
		}
		
		//	Create Reversal
		MO_Payment reversal = new MO_Payment (getCtx(), 0, get_TrxName());
		copyValues(this, reversal);
		reversal.setClientOrg(this);
		// reversal.setC_Order_ID(0); // IDEMPIERE-1764
		reversal.setC_Invoice_ID(0);
		reversal.setDateAcct(dateAcct);
		//
		reversal.setDocumentNo(getDocumentNo() + REVERSE_INDICATOR);	//	indicate reversals
		reversal.setDocStatus(DOCSTATUS_Drafted);
		reversal.setDocAction(DOCACTION_Complete);
		//
		reversal.setPayAmt(getPayAmt().negate());
		reversal.setDiscountAmt(getDiscountAmt().negate());
		reversal.setWriteOffAmt(getWriteOffAmt().negate());
		reversal.setOverUnderAmt(getOverUnderAmt().negate());
		//
		reversal.setIsAllocated(true);
		reversal.setIsReconciled(false);
		reversal.setIsOnline(false);
		reversal.setIsApproved(true); 
		reversal.setR_PnRef(null);
		reversal.setR_Result(null);
		reversal.setR_RespMsg(null);
		reversal.setR_AuthCode(null);
		reversal.setR_Info(null);
		reversal.setProcessing(false);
		reversal.setOProcessing("N");
		reversal.setProcessed(false);
		reversal.setPosted(false);
		reversal.setDescription(getDescription());
		reversal.addDescription("{->" + getDocumentNo() + ")");
		//FR [ 1948157  ] 
		reversal.setReversal_ID(getC_Payment_ID());
		reversal.saveEx(get_TrxName());
		//	Post Reversal
		if (!reversal.processIt(DocAction.ACTION_Complete))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return null;
		}
		reversal.closeIt();
		reversal.setDocStatus(DOCSTATUS_Reversed);
		reversal.setDocAction(DOCACTION_None);
		reversal.saveEx(get_TrxName());

		//	Unlink & De-Allocate
		deAllocate(accrual);
		setIsAllocated (true);	//	the allocation below is overwritten
		//	Set Status 
		addDescription("(" + reversal.getDocumentNo() + "<-)");
		setDocStatus(DOCSTATUS_Reversed);
		setDocAction(DOCACTION_None);
		setProcessed(true);
		//FR [ 1948157  ] 
		setReversal_ID(reversal.getC_Payment_ID());
		
		StringBuilder info = new StringBuilder(reversal.getDocumentNo());

		//	Create automatic Allocation
		MAllocationHdr alloc = new MAllocationHdr (getCtx(), false, 
			getDateTrx(), 
			getC_Currency_ID(),
			Msg.translate(getCtx(), "C_Payment_ID")	+ ": " + reversal.getDocumentNo(), get_TrxName());
		alloc.setAD_Org_ID(getAD_Org_ID());
		alloc.setDateAcct(dateAcct); // dateAcct variable already take into account the accrual parameter
		alloc.saveEx(get_TrxName());

		//	Original Allocation
		MAllocationLine aLine = new MAllocationLine (alloc, getPayAmt(true), 
			Env.ZERO, Env.ZERO, Env.ZERO);
		aLine.setDocInfo(getC_BPartner_ID(), 0, 0);
		aLine.setPaymentInfo(getC_Payment_ID(), 0);
		if (!aLine.save(get_TrxName()))
			log.warning("Automatic allocation - line not saved");
		//	Reversal Allocation
		aLine = new MAllocationLine (alloc, reversal.getPayAmt(true), 
			Env.ZERO, Env.ZERO, Env.ZERO);
		aLine.setDocInfo(reversal.getC_BPartner_ID(), 0, 0);
		aLine.setPaymentInfo(reversal.getC_Payment_ID(), 0, reversal.getC_BankTransfer_ID());
		if (!aLine.save(get_TrxName()))
			log.warning("Automatic allocation - reversal line not saved");
		
		//do not post immediate alloc
		alloc.set_Attribute(DocumentEngine.DOCUMENT_POST_IMMEDIATE_AFTER_COMPLETE, Boolean.FALSE);
		// added AdempiereException by zuhri
		if (!alloc.processIt(DocAction.ACTION_Complete))
			throw new AdempiereException(Msg.getMsg(getCtx(), "FailedProcessingDocument") + " - " + alloc.getProcessMsg());
		addDocsPostProcess(alloc);
		// end added
		alloc.saveEx(get_TrxName());
		//			
		info.append(" - @C_AllocationHdr_ID@: ").append(alloc.getDocumentNo());
		
		ICreditManager creditManager = Core.getCreditManager(this);
		//	Update BPartner
		if (creditManager != null)
			creditManager.checkCreditStatus(accrual ? DOCACTION_Reverse_Accrual : DOCACTION_Reverse_Correct);
		
		return info;
	}

}
