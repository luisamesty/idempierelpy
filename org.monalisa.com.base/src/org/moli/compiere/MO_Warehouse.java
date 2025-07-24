package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.CLogger;

public class MO_Warehouse extends X_M_Warehouse implements I_M_Warehouse{

	private static final long serialVersionUID = 1568461674208511266L;
	static CLogger log = CLogger.getCLogger(MO_Warehouse.class);
	
	public MO_Warehouse(Properties ctx, int M_Warehouse_ID, String trxName) {
		super(ctx, M_Warehouse_ID, trxName);
		// 
	}

	public MO_Warehouse(Properties ctx, int M_Warehouse_ID, String trxName, String[] virtualColumns) {
		super(ctx, M_Warehouse_ID, trxName, virtualColumns);
		// 
	}

	public MO_Warehouse(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		//
	}

	public MO_Warehouse(Properties ctx, String M_Warehouse_UU, String trxName) {
		super(ctx, M_Warehouse_UU, trxName);
		//
	}

	public MO_Warehouse(Properties ctx, String M_Warehouse_UU, String trxName, String[] virtualColumns) {
		super(ctx, M_Warehouse_UU, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}
	
}
