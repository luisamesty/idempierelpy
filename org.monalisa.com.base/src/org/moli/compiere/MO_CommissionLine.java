package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.CLogger;
import org.compiere.util.Env;

public class MO_CommissionLine extends X_C_CommissionLine implements I_C_CommissionLine {

	private static final long serialVersionUID = 1L;
	
	static CLogger log = CLogger.getCLogger(MO_CommissionLine.class);
	
	public MO_CommissionLine(Properties ctx, int C_CommissionLine_ID, String trxName, String[] virtualColumns) {
		super(ctx, C_CommissionLine_ID, trxName, virtualColumns);
		// 
	}
	
	public MO_CommissionLine(Properties ctx, int C_CommissionLine_ID, String trxName) {
		super(ctx, C_CommissionLine_ID, trxName);
		if (C_CommissionLine_ID == 0)
			setInitialDefaults();
	}

	public MO_CommissionLine(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// 
	}


	public MO_CommissionLine(Properties ctx, String C_CommissionLine_UU, String trxName) {
		super(ctx, C_CommissionLine_UU, trxName);
		// 
	}

	/**
	 * Set the initial defaults for a new record
	 */
	private void setInitialDefaults() {
		setLine (0);	// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
		setAmtMultiplier (Env.ZERO);
		setAmtSubtract (Env.ZERO);
		setCommissionOrders (false);
		setIsPositiveOnly (false);
		setQtyMultiplier (Env.ZERO);
		setQtySubtract (Env.ZERO);
	}
	

}
