package org.moli.compiere;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.util.CLogger;

public class MO_Product extends X_M_Product{
	
	private static final long serialVersionUID = -336740627086150455L;

	static CLogger log = CLogger.getCLogger(MO_Product.class);
	
	public MO_Product(Properties ctx, int M_Product_ID, String trxName) {
		super(ctx, M_Product_ID, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Product(Properties ctx, int M_Product_ID, String trxName, String[] virtualColumns) {
		super(ctx, M_Product_ID, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

	public MO_Product(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Product(Properties ctx, String M_Product_UU, String trxName) {
		super(ctx, M_Product_UU, trxName);
		// TODO Auto-generated constructor stub
	}

	public MO_Product(Properties ctx, String M_Product_UU, String trxName, String[] virtualColumns) {
		super(ctx, M_Product_UU, trxName, virtualColumns);
		// TODO Auto-generated constructor stub
	}

}
