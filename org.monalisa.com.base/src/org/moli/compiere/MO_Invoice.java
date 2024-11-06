package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.exceptions.AdempiereException;
import org.compiere.model.MAllocationHdr;
import org.compiere.model.MAllocationLine;
import org.compiere.model.MBPartner;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceBatch;
import org.compiere.model.MInvoiceBatchLine;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MMatchInv;
import org.compiere.model.MMatchPO;
import org.compiere.model.MOrder;
import org.compiere.model.MOrg;
import org.compiere.model.MPeriod;
import org.compiere.model.MRMA;
import org.compiere.model.MSequence;
import org.compiere.model.MSysConfig;
import org.compiere.model.MatchPOAutoMatch;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.process.DocAction;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;

public class MO_Invoice extends MInvoice {

	private static final long serialVersionUID = 1L;

	/**	Process Message 			*/
	private String		am_processMsg = null;
	/**	Process Message 			*/
	private String		m_processMsg = null;
	
	static CLogger log = CLogger.getCLogger(MO_Invoice.class);
	
	public MO_Invoice(MInOut ship, Timestamp invoiceDate) {
		super(ship, invoiceDate);
		// 
	}

	public MO_Invoice(MInvoice copy) {
		super(copy);
		// 
	}

	public MO_Invoice(MInvoiceBatch batch, MInvoiceBatchLine line) {
		super(batch, line);
		// 
	}

	public MO_Invoice(MOrder order, int C_DocTypeTarget_ID, Timestamp invoiceDate) {
		super(order, C_DocTypeTarget_ID, invoiceDate);
		// 
	}
	
	public MO_Invoice(Properties ctx, int C_Invoice_ID, String trxName) {
		super(ctx, C_Invoice_ID, trxName);
		// 
	}

	public MO_Invoice(Properties ctx, int C_Invoice_ID, String trxName, String[] virtualColumns) {
		super(ctx, C_Invoice_ID, trxName, virtualColumns);
		// 
	}

	public MO_Invoice(Properties ctx, MInvoice copy) {
		super(ctx, copy);
		// TODO Auto-generated constructor stub
	}


	public MO_Invoice(Properties ctx, MInvoice copy, String trxName) {
		super(ctx, copy, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Invoice(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Invoice(Properties ctx, String C_Invoice_UU, String trxName) {
		super(ctx, C_Invoice_UU, trxName);
		// TODO Auto-generated constructor stub
	}



	public String getAm_processMsg() {
		return am_processMsg;
	}

	public void setAm_processMsg(String am_processMsg) {
		this.am_processMsg = am_processMsg;
	}
	
	/**
	 * 	Called after Save for Post-Save Operation
	 * 	@param newRecord new record
	 *	@param success true if save operation was success
	 *	@return if save was a success
	 */
	protected boolean afterSave (boolean newRecord, boolean success)
	{
		// log.warning("---- MO_Invoice afterSave ------ newRecord="+newRecord );
		// Set DocumentNo Field 
		if(newRecord) {
			String OrgDocumentNo = getAD_Sequence_No( getCtx(), getC_DocTypeTarget_ID(), getAD_Org_ID());
			// log.warning("---- MO_Invoice afterSave ------ OrgDocumentNo="+OrgDocumentNo );
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
	 * updateDocumentNoOrg
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE C_Invoice Set DocumentNo='"+DocumentNoOrg+"' WHERE C_Invoice_ID=").append(getC_Invoice_ID());
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
		StringBuilder msgdb = new StringBuilder("UPDATE C_Invoice Set MOLI_FiscalDocumentNo='"+DocumentNoOrg+"' WHERE C_Invoice_ID=").append(getC_Invoice_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
	// NEW REVERSE METHODS
	/**
	 * 	Reverse Correction - same date
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

		MO_Invoice reversal = reverse(false);
		if (reversal == null)
			return false;

		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		m_processMsg = reversal.getDocumentNo();
		
		return true;
	}	//	reverseCorrectIt
	
	/**
	 * Reverse this document
	 * @param accrual true to use current date, false to use this document's accounting date
	 * @return reversal invoice document
	 */
	private MO_Invoice reverse(boolean accrual) {
		Timestamp reversalDate = accrual ? Env.getContextAsDate(getCtx(), Env.DATE) : getDateAcct();
		if (reversalDate == null) {
			reversalDate = new Timestamp(System.currentTimeMillis());
		}
		Timestamp reversalDateInvoiced = accrual ? reversalDate : getDateInvoiced();
		
		MPeriod.testPeriodOpen(getCtx(), reversalDate, getC_DocType_ID(), getAD_Org_ID());
		//
		reverseAllocations(accrual, getC_Invoice_ID());
		//	Reverse/Delete Matching
		if (!isSOTrx())
		{
			MatchPOAutoMatch.unmatch(getCtx(), getC_Invoice_ID(), get_TrxName());
			
			MMatchInv[] mInv = MMatchInv.getInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
			for (int i = 0; i < mInv.length; i++)
			{
				if (mInv[i].getReversal_ID() > 0)
					continue;
				
				if (!mInv[i].reverse(reversalDate)) 
				{
					m_processMsg = "Could not Reverse MatchInv";
					return null;
				}
				addDocsPostProcess(new MMatchInv(Env.getCtx(), mInv[i].getReversal_ID(), get_TrxName()));
			}			
			
			MMatchPO[] mPO = MMatchPO.getInvoice(getCtx(), getC_Invoice_ID(), get_TrxName());
			for (int i = 0; i < mPO.length; i++)
			{
				if (mPO[i].getReversal_ID() > 0)
					continue;
				
				if (mPO[i].getM_InOutLine_ID() == 0)
				{
					if(mPO[i].isPosted())
					{
						if (!mPO[i].reverse(reversalDate)) 
						{
							m_processMsg = "Could not Reverse MatchPO";
							return null;
						}
						addDocsPostProcess(new MMatchPO(Env.getCtx(), mPO[i].getReversal_ID(), get_TrxName()));
					} 
					else
					{
						mPO[i].deleteEx(true);						
					}
				}
				else
				{
					mPO[i].setC_InvoiceLine_ID(null);
					mPO[i].saveEx(get_TrxName());
				}
			}
		}
		//
		load(get_TrxName());	//	reload allocation reversal info

		//	Deep Copy
		MO_Invoice reversal = null;
		if (MSysConfig.getBooleanValue(MSysConfig.Invoice_ReverseUseNewNumber, true, getAD_Client_ID()))
			reversal = copyFrom (this, reversalDateInvoiced, reversalDate, getC_DocType_ID(), isSOTrx(), false, get_TrxName(), true);
		else 
			reversal = copyFrom (this, reversalDateInvoiced, reversalDate, getC_DocType_ID(), isSOTrx(), false, get_TrxName(), true, getDocumentNo()+"^");
		if (reversal == null)
		{
			m_processMsg = "Could not create Invoice Reversal";
			return null;
		}
		reversal.setReversal(true);

		//	Reverse Line Qty
		MInvoiceLine[] oLines = getLines(false);
		MInvoiceLine[] rLines = reversal.getLines(true);
		for (int i = 0; i < rLines.length; i++)
		{
			MInvoiceLine rLine = rLines[i];
			rLine.getParent().setReversal(true);
			MInvoiceLine oLine = oLines[i];
			rLine.setQtyEntered(oLine.getQtyEntered().negate());
			rLine.setQtyInvoiced(oLine.getQtyInvoiced().negate());
			rLine.setLineNetAmt(oLine.getLineNetAmt().negate());
			rLine.setTaxAmt(oLine.getTaxAmt().negate());
			rLine.setLineTotalAmt(oLine.getLineTotalAmt().negate());
			rLine.setPriceActual(oLine.getPriceActual());
			rLine.setPriceList(oLine.getPriceList());
			rLine.setPriceLimit(oLine.getPriceLimit());
			rLine.setPriceEntered(oLine.getPriceEntered());
			rLine.setC_UOM_ID(oLine.getC_UOM_ID());
			if (!rLine.save(get_TrxName()))
			{
				m_processMsg = "Could not correct Invoice Reversal Line";
				return null;
			}
		}
		reversal.setC_Order_ID(getC_Order_ID());
		StringBuilder msgadd = new StringBuilder("{->").append(getDocumentNo()).append(")");
		reversal.addDescription(msgadd.toString());
		//FR1948157
		reversal.setReversal_ID(getC_Invoice_ID());
		reversal.saveEx(get_TrxName());
		//
		reversal.docsPostProcess = this.docsPostProcess;
		this.docsPostProcess = new ArrayList<PO>();
		//
		if (!reversal.processIt(DocAction.ACTION_Complete))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return null;
		}
		//
		reverseAllocations(accrual, reversal.getC_Invoice_ID());

		reversal.setC_Payment_ID(0);
		reversal.setIsPaid(true);
		reversal.closeIt();
		reversal.setProcessing (false);
		reversal.setDocStatus(DOCSTATUS_Reversed);
		reversal.setDocAction(DOCACTION_None);
		reversal.saveEx(get_TrxName());
		//
		msgadd = new StringBuilder("(").append(reversal.getDocumentNo()).append("<-)");
		addDescription(msgadd.toString());

		//	Clean up Reversed (this)
		MInvoiceLine[] iLines = getLines(false);
		for (int i = 0; i < iLines.length; i++)
		{
			MInvoiceLine iLine = iLines[i];
			if (iLine.getM_InOutLine_ID() != 0)
			{
				MInOutLine ioLine = new MInOutLine(getCtx(), iLine.getM_InOutLine_ID(), get_TrxName());
				ioLine.setIsInvoiced(false);
				ioLine.saveEx(get_TrxName());
				//	Reconsiliation
				iLine.setM_InOutLine_ID(0);
				iLine.saveEx(get_TrxName());
			}
        }
		setProcessed(true);
		//FR1948157
		setReversal_ID(reversal.getC_Invoice_ID());
		setDocStatus(DOCSTATUS_Reversed);	//	may come from void
		setDocAction(DOCACTION_None);
		setC_Payment_ID(0);
		setIsPaid(true);

		//	Create Allocation
		StringBuilder msgall = new StringBuilder().append(Msg.translate(getCtx(), "C_Invoice_ID")).append(": ").append(getDocumentNo()).append("/").append(reversal.getDocumentNo());
		MAllocationHdr alloc = new MAllocationHdr(getCtx(), false, reversalDate,
			getC_Currency_ID(),
			msgall.toString(),
			get_TrxName());
		alloc.setAD_Org_ID(getAD_Org_ID());
		alloc.saveEx();
		//	Amount
		BigDecimal gt = getGrandTotal(true);
		if (!isSOTrx())
			gt = gt.negate();
		//	Orig Line
		MAllocationLine aLine = new MAllocationLine (alloc, gt,
				Env.ZERO, Env.ZERO, Env.ZERO);
		aLine.setC_Invoice_ID(getC_Invoice_ID());
		aLine.saveEx();
		//	Reversal Line
		MAllocationLine rLine = new MAllocationLine (alloc, gt.negate(),
				Env.ZERO, Env.ZERO, Env.ZERO);
		rLine.setC_Invoice_ID(reversal.getC_Invoice_ID());
		rLine.saveEx();
		// added AdempiereException by zuhri
		if (!alloc.processIt(DocAction.ACTION_Complete))
			throw new AdempiereException(Msg.getMsg(getCtx(), "FailedProcessingDocument") + " - " + alloc.getProcessMsg());
		// end added
		alloc.saveEx();
		
		return reversal;
	}
	
	/**
	 * Reverse allocations
	 * @param accrual
	 * @param invoiceID
	 */
	private void reverseAllocations(boolean accrual, int invoiceID) {
		for (MAllocationHdr allocation : MAllocationHdr.getOfInvoice(getCtx(), invoiceID, get_TrxName())) {
			if (accrual) {
				allocation.setDocAction(DocAction.ACTION_Reverse_Accrual);
				allocation.reverseAccrualIt();
			} else {
				allocation.setDocAction(DocAction.ACTION_Reverse_Correct);
				allocation.reverseCorrectIt();
			}
			allocation.saveEx(get_TrxName());
		}
	}
	
	/**
	 * 	Reverse Accrual - use current date
	 * 	@return false
	 */
	@Override
	public boolean reverseAccrualIt()
	{
		if (log.isLoggable(Level.INFO)) log.info(toString());
		// Before reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
	
		MO_Invoice reversal = reverse(true);
		if (reversal == null)
			return false;
		
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
	
		m_processMsg = reversal.getDocumentNo();
		
		return true;
	}	//	reverseAccrualIt

	/* Save array of documents to process AFTER completing this one */
	protected ArrayList<PO> docsPostProcess = new ArrayList<PO>();

	/**
	 * Add doc for post processing (after processing of document action)
	 * @param doc
	 */
	private void addDocsPostProcess(PO doc) {
		docsPostProcess.add(doc);
	}

	@Override
	public List<PO> getDocsPostProcess() {
		return docsPostProcess;
	}
	
	/**
	 * 	Create new Invoice by copying
	 * 	@param from invoice
	 * 	@param dateDoc date of the document date
	 *  @param dateAcct original account date 
	 * 	@param C_DocTypeTarget_ID target doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set Order links
	 *	@return Invoice
	 */
	public static MO_Invoice copyFrom (MO_Invoice from, Timestamp dateDoc, Timestamp dateAcct,
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter,
		String trxName, boolean setOrder)
	{
		return copyFrom (from, dateDoc, dateAcct,
				C_DocTypeTarget_ID, isSOTrx, counter,
				trxName, setOrder,null);
	}

	/**
	 * 	Create new Invoice by copying
	 * 	@param from invoice
	 * 	@param dateDoc date of the document date
	 *  @param dateAcct original account date 
	 * 	@param C_DocTypeTarget_ID target doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set Order links
	 *  @param documentNo Document Number for reversed invoices
	 *	@return Invoice
	 */
	public static MO_Invoice copyFrom (MO_Invoice from, Timestamp dateDoc, Timestamp dateAcct,
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter,
		String trxName, boolean setOrder, String documentNo)
	{
		MO_Invoice to = new MO_Invoice (from.getCtx(), 0, trxName);
		PO.copyValues (from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("C_Invoice_ID", I_ZERO);
		to.set_ValueNoCheck ("DocumentNo", documentNo);
		//
		to.setDocStatus (DOCSTATUS_Drafted);		//	Draft
		to.setDocAction(DOCACTION_Complete);
		//
		to.setC_DocType_ID(0);
		to.setC_DocTypeTarget_ID (C_DocTypeTarget_ID);
		to.setIsSOTrx(isSOTrx);
		//
		to.setDateInvoiced (dateDoc);
		to.setDateAcct (dateAcct);
		to.setDatePrinted(null);
		to.setIsPrinted (false);
		//
		to.setIsApproved (false);
		to.setC_Payment_ID(0);
		to.setC_CashLine_ID(0);
		to.setIsPaid (false);
		to.setIsInDispute(false);
		//
		//	Amounts are updated by trigger when adding lines
		to.setGrandTotal(Env.ZERO);
		to.setTotalLines(Env.ZERO);
		//
		to.setIsTransferred (false);
		to.setPosted (false);
		to.setProcessed (false);
		//[ 1633721 ] Reverse Documents- Processing=Y
		to.setProcessing(false);
		//	delete references
		to.setIsSelfService(false);
		if (!setOrder)
			to.setC_Order_ID(0);
		if (counter)
		{
			to.setRef_Invoice_ID(from.getC_Invoice_ID());
			MOrg org = MOrg.get(from.getAD_Org_ID());
			int counterC_BPartner_ID = org.getLinkedC_BPartner_ID(trxName);
			if (counterC_BPartner_ID == 0)
				return null;
			to.setBPartner(MBPartner.get(from.getCtx(), counterC_BPartner_ID));
			//	Try to find Order link
			if (from.getC_Order_ID() != 0)
			{
				MOrder peer = new MOrder (from.getCtx(), from.getC_Order_ID(), from.get_TrxName());
				if (peer.getRef_Order_ID() != 0)
					to.setC_Order_ID(peer.getRef_Order_ID());
			}
			// Try to find RMA link
			if (from.getM_RMA_ID() != 0)
			{
				MRMA peer = new MRMA (from.getCtx(), from.getM_RMA_ID(), from.get_TrxName());
				if (peer.getRef_RMA_ID() > 0)
					to.setM_RMA_ID(peer.getRef_RMA_ID());
			}
			//
		}
		else
			to.setRef_Invoice_ID(0);

		to.saveEx(trxName);
		if (counter)
			from.setRef_Invoice_ID(to.getC_Invoice_ID());

		//	Lines
		if (to.copyLinesFrom(from, counter, setOrder) == 0)
			throw new IllegalStateException("Could not create Invoice Lines");

		return to;
	}
	
	/** 
	 *  @deprecated
	 * 	Create new Invoice by copying
	 * 	@param from invoice
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocTypeTarget_ID target doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set Order links
	 *	@return Invoice
	 */
	@Deprecated
	public static MO_Invoice copyFrom (MO_Invoice from, Timestamp dateDoc,
		int C_DocTypeTarget_ID, boolean isSOTrx, boolean counter,
		String trxName, boolean setOrder)
	{
		MO_Invoice to = copyFrom ( from, dateDoc, dateDoc,
				 C_DocTypeTarget_ID, isSOTrx, counter,
				trxName, setOrder);
		return to;
	}	//	copyFrom

	
}
