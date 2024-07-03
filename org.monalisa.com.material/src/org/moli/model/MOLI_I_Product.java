package org.moli.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MOLI_I_Product extends X_I_Product_Moli {

	private static final long serialVersionUID = 1L;

	public MOLI_I_Product(Properties ctx, int I_Product_ID, String trxName) {
		super(ctx, I_Product_ID, trxName);
	}

	public MOLI_I_Product(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
	}

}
