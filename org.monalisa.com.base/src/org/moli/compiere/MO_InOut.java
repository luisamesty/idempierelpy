package org.moli.compiere;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.exceptions.DBException;
import org.compiere.model.MAsset;
import org.compiere.model.MClient;
import org.compiere.model.MDocType;
import org.compiere.model.MInOut;
import org.compiere.model.MInOutLine;
import org.compiere.model.MInOutLineMA;
import org.compiere.model.MInvoice;
import org.compiere.model.MInvoiceLine;
import org.compiere.model.MMatchInv;
import org.compiere.model.MMatchPO;
import org.compiere.model.MOrder;
import org.compiere.model.MOrderLine;
import org.compiere.model.MPeriod;
import org.compiere.model.MProduct;
import org.compiere.model.MRMA;
import org.compiere.model.MSequence;
import org.compiere.model.MStorageOnHand;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.model.PO;
import org.compiere.process.DocAction;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MO_InOut extends MInOut{

	private static final long serialVersionUID = 3900680924929341732L;

	static CLogger log = CLogger.getCLogger(MO_InOut.class);
	
	public MO_InOut(MO_InOut original, int C_DocTypeShipment_ID, Timestamp movementDate) {
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
		// log.warning("---- MO_InOut afterSave ------ newRecord="+newRecord );
		// Set DocumentNo Field 
		if(newRecord) {
			String OrgDocumentNo = getAD_Sequence_No( getCtx(), getC_DocType_ID(), getAD_Org_ID());
			// log.warning("---- MO_InOut afterSave ------ OrgDocumentNo="+OrgDocumentNo );
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

		MO_InOut reversal = reverse(false);
		if (reversal == null)
			return false;

		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;

		m_processMsg = reversal.getDocumentNo();
		setProcessed(true);
		setDocStatus(DOCSTATUS_Reversed);		//	 may come from void
		setDocAction(DOCACTION_None);
		return true;
	}	//	reverseCorrectionIt

	/**
	 * Reverse this document
	 * @param accrual true to create reversal document using current date, false to use the accounting date of this document
	 * @return reversal MO_InOut
	 */
	protected MO_InOut reverse(boolean accrual) {
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		Timestamp reversalDate = accrual ? Env.getContextAsDate(getCtx(), Env.DATE) : getDateAcct();
		if (reversalDate == null) {
			reversalDate = new Timestamp(System.currentTimeMillis());
		}
		Timestamp reversalMovementDate = accrual ? reversalDate : getMovementDate();
		if (!MPeriod.isOpen(getCtx(), reversalDate, dt.getDocBaseType(), getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return null;
		}

		//	Reverse/Delete Matching
		if (!isSOTrx())
		{
			if (!reverseMatching(reversalDate))
				return null;			
		}

		//	Deep Copy
		MO_InOut reversal = copyFrom (this, reversalMovementDate, reversalDate,
			getC_DocType_ID(), isSOTrx(), false, get_TrxName(), true);
		if (reversal == null)
		{
			m_processMsg = "Could not create Ship Reversal";
			return null;
		}
		reversal.setReversal(true);

		//	Reverse Line Qty
		MInOutLine[] sLines = getLines(false);
		MInOutLine[] rLines = reversal.getLines(false);
		for (int i = 0; i < rLines.length; i++)
		{
			MInOutLine rLine = rLines[i];
			rLine.setQtyEntered(rLine.getQtyEntered().negate());
			rLine.setMovementQty(rLine.getMovementQty().negate());
			rLine.setM_AttributeSetInstance_ID(sLines[i].getM_AttributeSetInstance_ID());
			// Goodwill: store original (voided/reversed) document line
			rLine.setReversalLine_ID(sLines[i].getM_InOutLine_ID());
			if (!rLine.save(get_TrxName()))
			{
				m_processMsg = "Could not correct Ship Reversal Line";
				return null;
			}
			//	We need to copy MA
			if (rLine.getM_AttributeSetInstance_ID() == 0)
			{
				MInOutLineMA mas[] = MInOutLineMA.get(getCtx(),
					sLines[i].getM_InOutLine_ID(), get_TrxName());
				for (int j = 0; j < mas.length; j++)
				{
					MInOutLineMA ma = new MInOutLineMA (rLine,
						mas[j].getM_AttributeSetInstance_ID(),
						mas[j].getMovementQty().negate(),mas[j].getDateMaterialPolicy(),mas[j].isAutoGenerated());
					ma.saveEx();
				}
			}
			//	De-Activate Asset
			MAsset asset = MAsset.getFromShipment(getCtx(), sLines[i].getM_InOutLine_ID(), get_TrxName());
			if (asset != null)
			{
				asset.setIsActive(false);
				asset.setDescription(asset.getDescription() + " (" + reversal.getDocumentNo() + " #" + rLine.getLine() + "<-)");
				asset.saveEx();
			}
			// Un-Link inoutline to Invoiceline
			String sql = "SELECT C_InvoiceLine_ID FROM C_InvoiceLine WHERE M_InOutLine_ID=?";
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try
			{
				pstmt = DB.prepareStatement(sql, get_TrxName());
				pstmt.setInt(1, sLines[i].getM_InOutLine_ID());
				rs = pstmt.executeQuery();
				while (rs.next())
				{
					int invoiceLineId = rs.getInt(1);
					if (invoiceLineId > 0 ){
						MInvoiceLine iLine = new MInvoiceLine(getCtx(),invoiceLineId , get_TrxName());
						iLine.setM_InOutLine_ID(0);
						iLine.saveEx();
					}
				}
			}
			catch (SQLException e)
			{
				throw new DBException(e, sql);
			}
			finally
			{
				DB.close(rs, pstmt);
				rs = null; pstmt = null;
			}
		}
		reversal.setC_Order_ID(getC_Order_ID());
		// Set M_RMA_ID
		reversal.setM_RMA_ID(getM_RMA_ID());
		StringBuilder msgadd = new StringBuilder("{->").append(getDocumentNo()).append(")");
		reversal.addDescription(msgadd.toString());
		reversal.setReversal_ID(getM_InOut_ID());
		reversal.saveEx(get_TrxName());
		//
		reversal.docsPostProcess = this.docsPostProcess;
		this.docsPostProcess = new ArrayList<PO>();
		//
		if (!reversal.processIt(DocAction.ACTION_Complete)
			|| !reversal.getDocStatus().equals(DocAction.STATUS_Completed))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return null;
		}
		reversal.closeIt();
		reversal.setProcessing (false);
		reversal.setDocStatus(DOCSTATUS_Reversed);
		reversal.setDocAction(DOCACTION_None);
		reversal.saveEx(get_TrxName());
		//
		msgadd = new StringBuilder("(").append(reversal.getDocumentNo()).append("<-)");
		addDescription(msgadd.toString());
		
		//
		// Void Confirmations
		setDocStatus(DOCSTATUS_Reversed); // need to set & save docstatus to be able to check it in MInOutConfirm.voidIt()
		saveEx();
		this.setReversal_ID(reversal.getM_InOut_ID());
		voidConfirmations();
		return reversal;
	}

	/**
	 * Reverse match invoice and match PO.
	 * @param reversalDate
	 * @return false if there errors, true otherwise
	 */
	protected boolean reverseMatching(Timestamp reversalDate) {
		MMatchInv[] mInv = MMatchInv.getInOut(getCtx(), getM_InOut_ID(), get_TrxName());
		for (MMatchInv mMatchInv : mInv)
		{		
			if (mMatchInv.getReversal_ID() > 0)
				continue;
			
			String description = mMatchInv.getDescription();
			if (description == null || !description.endsWith("<-)"))
			{
				if (!mMatchInv.reverse(reversalDate))
				{
					log.log(Level.SEVERE, "Failed to create reversal for match invoice " + mMatchInv.getDocumentNo());
					return false;
				}
				addDocsPostProcess(new MMatchInv(Env.getCtx(), mMatchInv.getReversal_ID(), get_TrxName()));
			}
		}
		MMatchPO[] mMatchPOList = MMatchPO.getInOut(getCtx(), getM_InOut_ID(), get_TrxName());
		for (MMatchPO mMatchPO : mMatchPOList) 
		{
			if (mMatchPO.getReversal_ID() > 0)
				continue;
			
			String description = mMatchPO.getDescription();
			if (description == null || !description.endsWith("<-)"))
			{
				if (!mMatchPO.reverse(reversalDate))
				{
					log.log(Level.SEVERE, "Failed to create reversal for match purchase order " + mMatchPO.getDocumentNo());
					return false;
				}
				addDocsPostProcess(new MMatchPO(Env.getCtx(), mMatchPO.getReversal_ID(), get_TrxName()));
			}
		}
		return true;
	}

	/**
	 * 	Reverse Accrual - current date
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

		MO_InOut reversal = reverse(true);
		if (reversal == null)
			return false;
		
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;

		m_processMsg = reversal.getDocumentNo();
		setProcessed(true);
		setDocStatus(DOCSTATUS_Reversed);		//	 may come from void
		setDocAction(DOCACTION_None);
		return true;
	}	//	reverseAccrualIt
	
	/**
	 * 	Create Shipment From Order
	 *	@param order order
	 *	@param movementDate optional movement date
	 *	@param forceDelivery ignore order delivery rule
	 *	@param allAttributeInstances if true, all attribute set instances
	 *	@param minGuaranteeDate optional minimum guarantee date if all attribute instances
	 *	@param complete complete document (Process if false, Complete if true)
	 *	@param trxName transaction
	 *	@return Shipment or null
	 */
	public static MO_InOut createFrom (MOrder order, Timestamp movementDate,
			boolean forceDelivery, boolean allAttributeInstances, Timestamp minGuaranteeDate,
			boolean complete, String trxName)
	{		
		if (order == null)
			throw new IllegalArgumentException("No Order");
		//
		if (!forceDelivery && DELIVERYRULE_CompleteLine.equals(order.getDeliveryRule()))
		{
			return null;
		}

		//	Create Header
		MO_InOut retValue = new MO_InOut (order, 0, movementDate);
		retValue.setDocAction(complete ? DOCACTION_Complete : DOCACTION_Prepare);

		//	Check if we can create the lines
		MOrderLine[] oLines = order.getLines(true, "M_Product_ID");
		for (int i = 0; i < oLines.length; i++)
		{
			// Calculate how much is left to deliver (ordered - delivered)
			BigDecimal qty = oLines[i].getQtyOrdered().subtract(oLines[i].getQtyDelivered());
			//	Nothing to deliver
			if (qty.signum() == 0)
				continue;
			//	Stock Info
			MStorageOnHand[] storages = null;
			MProduct product = oLines[i].getProduct();
			if (product != null && product.get_ID() != 0 && product.isStocked())
			{
				String MMPolicy = product.getMMPolicy();
				storages = MStorageOnHand.getWarehouse (order.getCtx(), order.getM_Warehouse_ID(),
					oLines[i].getM_Product_ID(), oLines[i].getM_AttributeSetInstance_ID(),
					minGuaranteeDate, MClient.MMPOLICY_FiFo.equals(MMPolicy), true, 0, trxName);
			} else {
				continue;
			}

			if (!forceDelivery)
			{
				BigDecimal maxQty = Env.ZERO;
				for (int ll = 0; ll < storages.length; ll++)
					maxQty = maxQty.add(storages[ll].getQtyOnHand());
				if (DELIVERYRULE_Availability.equals(order.getDeliveryRule()))
				{
					if (maxQty.compareTo(qty) < 0)
						qty = maxQty;
				}
				else if (DELIVERYRULE_CompleteLine.equals(order.getDeliveryRule()))
				{
					if (maxQty.compareTo(qty) < 0)
						continue;
				}
			}
			//	Create Line
			if (retValue.get_ID() == 0)	//	not saved yet
				retValue.saveEx(trxName);
			//	Create a line until qty is reached
			for (int ll = 0; ll < storages.length; ll++)
			{
				BigDecimal lineQty = storages[ll].getQtyOnHand();
				if (lineQty.compareTo(qty) > 0)
					lineQty = qty;
				MInOutLine line = new MInOutLine (retValue);
				line.setOrderLine(oLines[i], storages[ll].getM_Locator_ID(),
					order.isSOTrx() ? lineQty : Env.ZERO);
				line.setQty(lineQty);	//	Correct UOM for QtyEntered
				if (oLines[i].getQtyEntered().compareTo(oLines[i].getQtyOrdered()) != 0)
					line.setQtyEntered(lineQty
						.multiply(oLines[i].getQtyEntered())
						.divide(oLines[i].getQtyOrdered(), 12, RoundingMode.HALF_UP));
				line.setC_Project_ID(oLines[i].getC_Project_ID());
				line.saveEx(trxName);
				//	Delivered everything ?
				qty = qty.subtract(lineQty);

				if (qty.signum() == 0)
					break;
			}
		}	//	for all order lines

		//	No Lines saved
		if (retValue.get_ID() == 0)
			return null;

		return retValue;
		
	}

	/**
	 * 	Create new Shipment by copying
	 * 	@param from shipment
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocType_ID doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set the order link
	 *	@return Shipment
	 */
	public static MO_InOut copyFrom (MO_InOut from, Timestamp dateDoc, Timestamp dateAcct,
		int C_DocType_ID, boolean isSOTrx, boolean counter, String trxName, boolean setOrder)
	{
		MO_InOut to = new MO_InOut (from.getCtx(), 0, null);
		to.set_TrxName(trxName);
		copyValues(from, to, from.getAD_Client_ID(), from.getAD_Org_ID());
		to.set_ValueNoCheck ("M_InOut_ID", I_ZERO);
		to.set_ValueNoCheck ("DocumentNo", null);
		//
		to.setDocStatus (DOCSTATUS_Drafted);		//	Draft
		to.setDocAction(DOCACTION_Complete);
		//
		to.setC_DocType_ID (C_DocType_ID);
		to.setIsSOTrx(isSOTrx);
		if (counter)
		{
			to.setMovementType();
		}

		//
		to.setDateOrdered (dateDoc);
		to.setDateAcct (dateAcct);
		to.setMovementDate(dateDoc);
		to.setDatePrinted(null);
		to.setIsPrinted (false);
		to.setDateReceived(null);
		to.setNoPackages(0);
		to.setShipDate(null);
		to.setPickDate(null);
		to.setIsInTransit(false);
		//
		to.setIsApproved (false);
		to.setC_Invoice_ID(0);
		to.setTrackingNo(null);
		to.setIsInDispute(false);
		//
		to.setPosted (false);
		to.setProcessed (false);
		//[ 1633721 ] Reverse Documents- Processing=Y
		to.setProcessing(false);
		to.setC_Order_ID(0);	//	Overwritten by setOrder
		to.setM_RMA_ID(0);      //  Overwritten by setOrder
		if (counter)
		{
			to.setC_Order_ID(0);
			to.setRef_InOut_ID(from.getM_InOut_ID());
			//	Try to find Order/Invoice link
			if (from.getC_Order_ID() != 0)
			{
				MOrder peer = new MOrder (from.getCtx(), from.getC_Order_ID(), from.get_TrxName());
				if (peer.getRef_Order_ID() != 0)
					to.setC_Order_ID(peer.getRef_Order_ID());
			}
			if (from.getC_Invoice_ID() != 0)
			{
				MInvoice peer = new MInvoice (from.getCtx(), from.getC_Invoice_ID(), from.get_TrxName());
				if (peer.getRef_Invoice_ID() != 0)
					to.setC_Invoice_ID(peer.getRef_Invoice_ID());
			}
			//find RMA link
			if (from.getM_RMA_ID() != 0)
			{
				MRMA peer = new MRMA (from.getCtx(), from.getM_RMA_ID(), from.get_TrxName());
				if (peer.getRef_RMA_ID() > 0)
					to.setM_RMA_ID(peer.getRef_RMA_ID());
			}
		}
		else
		{
			to.setRef_InOut_ID(0);
			if (setOrder)
			{
				to.setC_Order_ID(from.getC_Order_ID());
				to.setM_RMA_ID(from.getM_RMA_ID()); // Copy also RMA
			}
		}
		//
		if (!to.save(trxName))
			throw new IllegalStateException("Could not create Shipment");
		if (counter)
			from.setRef_InOut_ID(to.getM_InOut_ID());

		if (to.copyLinesFrom(from, counter, setOrder) <= 0)
			throw new IllegalStateException("Could not create Shipment Lines");

		return to;
	}	//	copyFrom

	/**
	 * 	Create new Shipment by copying
	 * 	@param from shipment
	 * 	@param dateDoc date of the document date
	 * 	@param C_DocType_ID doc type
	 * 	@param isSOTrx sales order
	 * 	@param counter create counter links
	 * 	@param trxName trx
	 * 	@param setOrder set the order link
	 *	@return Shipment
	 *  @deprecated
	 */
	@Deprecated
	public static MO_InOut copyFrom (MO_InOut from, Timestamp dateDoc,
		int C_DocType_ID, boolean isSOTrx, boolean counter, String trxName, boolean setOrder)
	{
		MO_InOut to = copyFrom ( from, dateDoc, dateDoc,
				C_DocType_ID, isSOTrx, counter,
				trxName, setOrder);
		return to;

	}

}
