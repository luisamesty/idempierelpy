package org.moli.compiere;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.compiere.model.MCommission;
import org.compiere.model.MCommissionLine;
import org.compiere.model.MTable;
import org.compiere.model.PO;
import org.compiere.model.Query;
import org.compiere.util.CLogger;
import org.compiere.util.Msg;

public class MO_Commission extends X_C_Commission implements I_C_Commission{

	private static final long serialVersionUID = 1L;
	
	static CLogger log = CLogger.getCLogger(MO_Commission.class);
	
	public MO_Commission(Properties ctx, int C_Commission_ID, String trxName) {
		super(ctx, C_Commission_ID, trxName);
		if (C_Commission_ID == 0)
			setInitialDefaults();
		// TODO Auto-generated constructor stub
	}
	
	public MO_Commission(Properties ctx, int C_Commission_ID, String trxName, String[] virtualColumns) {
		super(ctx, C_Commission_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}
	
	public MO_Commission(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Commission(Properties ctx, String C_Commission_UU, String trxName) {
		super(ctx, C_Commission_UU, trxName);
		// TODO Auto-generated constructor stub
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}
	

	/**
	 * Set the initial defaults for a new record
	 */
	private void setInitialDefaults() {
		setDocBasisType (DOCBASISTYPE_Invoice);	// I
		setFrequencyType (FREQUENCYTYPE_Monthly);	// M
		setListDetails (false);
	}

	/**
	 * 	Get Lines
	 *	@return array of lines
	 */
	public MO_CommissionLine[] getLines()
	{
		//[ 1867477 ]
		//FR: [ 2214883 ] Remove SQL code and Replace for Query - red1
		final String whereClause = "IsActive='Y' AND C_Commission_ID=?";
		List<MO_CommissionLine> list  = new Query(getCtx(), MO_CommissionLine.Table_Name, whereClause, get_TrxName())
		.setParameters(getC_Commission_ID())
		.setOrderBy("Line,C_CommissionLine_ID")
		.list();	
		//	Convert
		MO_CommissionLine[] retValue = new MO_CommissionLine[list.size()];
		list.toArray(retValue);
		return retValue;
	}	//	getLines

	/**
	 * 	Set Date Last Run
	 *	@param DateLastRun date
	 */
	@Override
	public void setDateLastRun (Timestamp DateLastRun)
	{
		if (DateLastRun != null)
			super.setDateLastRun(DateLastRun);
	}	//	setDateLastRun

	/**
	 * 	Copy Lines From other Commission
	 *	@param otherCom commission
	 *	@return number of lines copied
	 */
	public int copyLinesFrom (MO_Commission otherCom)
	{
		if (otherCom == null)
			return 0;
		MO_CommissionLine[] fromLines = otherCom.getLines ();
		int count = 0;
		for (int i = 0; i < fromLines.length; i++)
		{
			MO_CommissionLine line = new MO_CommissionLine (getCtx(), 0, get_TrxName());
			PO.copyValues(fromLines[i], line, getAD_Client_ID(), getAD_Org_ID());
			line.setC_Commission_ID (getC_Commission_ID());
			if (line.save())
				count++;
		}
		if (fromLines.length != count)
			log.log(Level.SEVERE, "copyLinesFrom - Line difference - From=" + fromLines.length + " <> Saved=" + count);
		return count;
	}	//	copyLinesFrom

	/**
	 * Validations before saving record
	 */
	@Override
	protected boolean beforeSave(boolean newRecord) {
		if (getC_Charge_ID() == 0 && getM_Product_ID() == 0) {
			log.saveError("FillMandatory", Msg.translate(getCtx(), "ChargeOrProductMandatory"));
			return false;
		}
		return true;
	}
}
