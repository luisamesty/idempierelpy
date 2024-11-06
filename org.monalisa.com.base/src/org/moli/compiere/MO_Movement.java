package org.moli.compiere;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.DecimalFormat;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MDocType;
import org.compiere.model.MMovement;
import org.compiere.model.MMovementLine;
import org.compiere.model.MMovementLineMA;
import org.compiere.model.MPeriod;
import org.compiere.model.MSequence;
import org.compiere.model.ModelValidationEngine;
import org.compiere.model.ModelValidator;
import org.compiere.process.DocAction;
import org.compiere.util.CLogger;
import org.compiere.util.DB;
import org.compiere.util.Env;

public class MO_Movement extends MMovement{


	private static final long serialVersionUID = -2490571497815079272L;

	static CLogger log = CLogger.getCLogger(MO_Movement.class);
	
	public MO_Movement(Properties ctx, int M_Movement_ID, String trxName) {
		super(ctx, M_Movement_ID, trxName);
		// 
	}

	public MO_Movement(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// 
	}

	public MO_Movement(Properties ctx, String M_Movement_UU, String trxName) {
		super(ctx, M_Movement_UU, trxName);
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
		// log.warning("---- MO_Movement afterSave ------ newRecord="+newRecord );
		// Set DocumentNo Field 
		if(newRecord) {
			String OrgDocumentNo ="";
			if (isReversal()) {
				OrgDocumentNo = this.getDocumentNo();
			} else {
				OrgDocumentNo = getAD_Sequence_No( getCtx(), getC_DocType_ID(), getAD_Org_ID());
			}
			// log.warning("---- MO_Movement afterSave ------ OrgDocumentNo="+OrgDocumentNo );
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
	 * updateDocumentNoOrg on M_Movement
	 * @param DocumentNoOrg
	 * @return
	 */
	private int updateDocumentNoOrg(String DocumentNoOrg)
	{
		// Update DocumentNo for definitive Prefix + DocuemntNo+ Suffix
		if (DocumentNoOrg == null || DocumentNoOrg.isEmpty())
			return 0;
		// Update
		StringBuilder msgdb = new StringBuilder("UPDATE M_Movement Set DocumentNo='"+DocumentNoOrg+"' WHERE M_Movement_ID=").append(getM_Movement_ID());
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
		StringBuilder msgdb = new StringBuilder("UPDATE M_Movement Set MOLI_FiscalDocumentNo='"+DocumentNoOrg+"' WHERE M_Movement_ID=").append(getM_Movement_ID());
		return DB.executeUpdateEx(msgdb.toString(), get_TrxName());
	}	//	updateDocumentNoOrg
	
	/**
	 * 	Reverse Correction
	 * 	@return false 
	 */
	@Override
	public boolean reverseCorrectIt()
	{
		if (log.isLoggable(Level.INFO)) log.info(toString());
		// Before reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_BEFORE_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		MO_Movement reversal = reverse(false);
		if (reversal == null)
			return false;
		
		m_processMsg = reversal.getDocumentNo();
		
		// After reverseCorrect
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSECORRECT);
		if (m_processMsg != null)
			return false;
		
		return true;
	}	//	reverseCorrectionIt
	
	/**
	 * Reverse this movement document 
	 * @param accrual true to use current date, false to use movement date of this document
	 * @return reversal movement document
	 */
	protected MO_Movement reverse(boolean accrual)
	{
		Timestamp reversalDate = accrual ? Env.getContextAsDate(getCtx(), Env.DATE) : getMovementDate();
		if (reversalDate == null) {
			reversalDate = new Timestamp(System.currentTimeMillis());
		}
		
		MDocType dt = MDocType.get(getCtx(), getC_DocType_ID());
		if (!MPeriod.isOpen(getCtx(), reversalDate, dt.getDocBaseType(), getAD_Org_ID()))
		{
			m_processMsg = "@PeriodClosed@";
			return null;
		}

		//	Deep Copy
		MO_Movement reversal = new MO_Movement(getCtx(), 0, get_TrxName());
		copyValues(this, reversal, getAD_Client_ID(), getAD_Org_ID());
		reversal.setDocStatus(DOCSTATUS_Drafted);
		reversal.setDocAction(DOCACTION_Complete);
		reversal.setIsApproved (false);
		reversal.setIsInTransit (false);
		reversal.setPosted(false);
		reversal.setProcessed(false);
		reversal.setMovementDate(reversalDate);
		reversal.setDocumentNo(getDocumentNo() + REVERSE_INDICATOR);	//	indicate reversals
		reversal.addDescription("{->" + getDocumentNo() + ")");
		//FR [ 1948157  ]
		reversal.setReversal_ID(getM_Movement_ID());
		reversal.setReversal(true);
		if (!reversal.save())
		{
			m_processMsg = "Could not create Movement Reversal";
			return null;
		}
		//reversal.setReversal(true);
		//	Reverse Line Qty
		MMovementLine[] oLines = getLines(true);
		for (int i = 0; i < oLines.length; i++)
		{
			MMovementLine oLine = oLines[i];
			MMovementLine rLine = new MMovementLine(getCtx(), 0, get_TrxName());
			copyValues(oLine, rLine, oLine.getAD_Client_ID(), oLine.getAD_Org_ID());
			rLine.setM_Movement_ID(reversal.getM_Movement_ID());
			// store original (voided/reversed) document line
			rLine.setReversalLine_ID(oLine.getM_MovementLine_ID());
			//
			rLine.setMovementQty(rLine.getMovementQty().negate());
			rLine.setTargetQty(Env.ZERO);
			rLine.setScrappedQty(Env.ZERO);
			rLine.setConfirmedQty(Env.ZERO);
			rLine.setProcessed(false);
			if (!rLine.save())
			{
				m_processMsg = "Could not create Movement Reversal Line for @Line@ " + rLine.getLine() + ", @M_Product_ID@=" + rLine.getProduct().getValue();
				return null;
			}
			
			//We need to copy MA
			if (rLine.getM_AttributeSetInstance_ID() == 0)
			{
				MMovementLineMA mas[] = MMovementLineMA.get(getCtx(),
						oLine.getM_MovementLine_ID(), get_TrxName());
				for (int j = 0; j < mas.length; j++)
				{
					MMovementLineMA ma = new MMovementLineMA (rLine, 
							mas[j].getM_AttributeSetInstance_ID(),
							mas[j].getMovementQty().negate(),mas[j].getDateMaterialPolicy(),true);
					ma.saveEx();
				}
			}
			
		}
		//
		if (!reversal.processIt(DocAction.ACTION_Complete))
		{
			m_processMsg = "Reversal ERROR: " + reversal.getProcessMsg();
			return null;
		}
		reversal.closeIt();
		reversal.setDocStatus(DOCSTATUS_Reversed);
		reversal.setDocAction(DOCACTION_None);
		reversal.saveEx();
		
		//	Update Reversed (this)
		addDescription("(" + reversal.getDocumentNo() + "<-)");
		//FR [ 1948157  ]
		setReversal_ID(reversal.getM_Movement_ID());
		setProcessed(true);
		setDocStatus(DOCSTATUS_Reversed);	//	may come from void
		setDocAction(DOCACTION_None);
			
		return reversal;
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
		
		MO_Movement reversal = reverse(true);
		if (reversal == null)
			return false;
		
		m_processMsg = reversal.getDocumentNo();
		
		// After reverseAccrual
		m_processMsg = ModelValidationEngine.get().fireDocValidate(this,ModelValidator.TIMING_AFTER_REVERSEACCRUAL);
		if (m_processMsg != null)
			return false;
		
		return true;
	}	//	reverseAccrualIt
}
