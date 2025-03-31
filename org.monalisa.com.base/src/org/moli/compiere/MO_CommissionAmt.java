package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.List;
import java.util.Properties;

import org.compiere.model.I_C_CommissionDetail;
import org.compiere.model.MCommissionDetail;
import org.compiere.model.MCommissionLine;
import org.compiere.model.MCommissionRun;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class MO_CommissionAmt extends X_C_CommissionAmt implements I_C_CommissionAmt {

	private static final long serialVersionUID = 1L;
	
	static CLogger log = CLogger.getCLogger(MO_CommissionAmt.class);
	
	/**
	 * 	Parent Constructor
	 *	@param run parent
	 *	@param C_CommissionLine_ID line
	 */
	public MO_CommissionAmt (MO_CommissionRun run, int C_CommissionLine_ID)
	{
		this (run.getCtx(), 0, run.get_TrxName());
		setClientOrg (run);
		setC_CommissionRun_ID (run.getC_CommissionRun_ID());
		setC_CommissionLine_ID (C_CommissionLine_ID);
	}	//	MO_CommissionAmt
	
	public MO_CommissionAmt(Properties ctx, int C_CommissionAmt_ID, String trxName) {
		super(ctx, C_CommissionAmt_ID, trxName);
		if (C_CommissionAmt_ID == 0)
			setInitialDefaults();
		// 
	}
	
	public MO_CommissionAmt(Properties ctx, int C_CommissionAmt_ID, String trxName, String[] virtualColumns) {
		super(ctx, C_CommissionAmt_ID, trxName, virtualColumns);
		//
	}


	public MO_CommissionAmt(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// 
	}

	public MO_CommissionAmt(Properties ctx, String C_CommissionAmt_UU, String trxName) {
		super(ctx, C_CommissionAmt_UU, trxName);
		// 
	}

	public MO_CommissionAmt(Properties ctx, String C_CommissionAmt_UU, String trxName, String[] virtualColumns) {
		super(ctx, C_CommissionAmt_UU, trxName, virtualColumns);
		// 
	}

	/**
	 * Set the initial defaults for a new record
	 */
	private void setInitialDefaults() {
		setActualQty (Env.ZERO);
		setCommissionAmt (Env.ZERO);
		setConvertedAmt (Env.ZERO);
	}
	
	/**
	 * 	Get Details
	 *	@return array of details
	 */
	public MCommissionDetail[] getDetails()
	{
		final String whereClause = I_C_CommissionDetail.COLUMNNAME_C_CommissionAmt_ID+"=?";
	List<MCommissionDetail> list = new Query(getCtx(),I_C_CommissionDetail.Table_Name, whereClause, get_TrxName())
		.setParameters(getC_CommissionAmt_ID())
		.list();
		//	Convert
		MCommissionDetail[] retValue = new MCommissionDetail[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getDetails

	/**
	 * 	Calculate Commission
	 */
	public void calculateCommission()
	{
		MCommissionDetail[] details = getDetails();
		BigDecimal ConvertedAmt = Env.ZERO;
		BigDecimal ActualQty = Env.ZERO;
		for (int i = 0; i < details.length; i++)
		{
			MCommissionDetail detail = details[i];
			BigDecimal amt = detail.getConvertedAmt();
			if (amt == null)
				amt = Env.ZERO;
			ConvertedAmt = ConvertedAmt.add(amt);
			ActualQty = ActualQty.add(detail.getActualQty());
		}
		setConvertedAmt(ConvertedAmt);
		setActualQty(ActualQty);
		//
		MCommissionLine cl = new MCommissionLine(getCtx(), getC_CommissionLine_ID(), get_TrxName());
		//	Qty
		BigDecimal qty = getActualQty().subtract(cl.getQtySubtract());
		if (cl.isPositiveOnly() && qty.signum() < 0)
			qty = Env.ZERO;
		qty = qty.multiply(cl.getQtyMultiplier());
		//	Amt
		BigDecimal amt = getConvertedAmt().subtract(cl.getAmtSubtract());
		if (cl.isPositiveOnly() && amt.signum() < 0)
			amt = Env.ZERO;
		amt = amt.multiply(cl.getAmtMultiplier());
		//
		setCommissionAmt(amt.add(qty));
	}	//	calculateCommission
		
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
			updateRunHeader();
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
			updateRunHeader();
		return success;
	}	//	afterDelete
	
	/**
	 * 	Update Header (MCommissionRun) amount
	 */
	private void updateRunHeader()
	{
		MCommissionRun run = new MCommissionRun(getCtx(), getC_CommissionRun_ID(),get_TrxName());
		run.updateFromAmt();
		run.saveEx();
	}	//	updateRunHeader

}
