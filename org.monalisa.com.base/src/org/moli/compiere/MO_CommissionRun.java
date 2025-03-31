package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.MCommission;
import org.compiere.util.CLogger;

public class MO_CommissionRun extends X_C_CommissionRun implements I_C_CommissionRun{


	private static final long serialVersionUID = 1L;
	
	static CLogger log = CLogger.getCLogger(MO_CommissionRun.class);
	
	public MO_CommissionRun(Properties ctx, int C_CommissionRun_ID, String trxName) {
		super(ctx, C_CommissionRun_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionRun(Properties ctx, int C_CommissionRun_ID, String trxName, String[] virtualColumns) {
		super(ctx, C_CommissionRun_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionRun(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}


	public MO_CommissionRun(Properties ctx, String C_CommissionRun_UU, String trxName) {
		super(ctx, C_CommissionRun_UU, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_CommissionRun (MO_Commission commission)
	{
		this (commission.getCtx(), 0, commission.get_TrxName());
		setClientOrg (commission);
		setC_Commission_ID (commission.getC_Commission_ID());
	}

}
