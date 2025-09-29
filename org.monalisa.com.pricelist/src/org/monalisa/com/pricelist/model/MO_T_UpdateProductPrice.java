package org.monalisa.com.pricelist.model;

import java.sql.ResultSet;
import java.util.Properties;

public class MO_T_UpdateProductPrice extends X_T_UpdatedProduct_Price
{
	private static final long serialVersionUID = -8320297040498269087L;

	public MO_T_UpdateProductPrice(Properties ctx, int T_UpdatedProduct_Price_ID, String trxName)
	{
		super(ctx, T_UpdatedProduct_Price_ID, trxName);
	}

	public MO_T_UpdateProductPrice(Properties ctx, int T_UpdatedProduct_Price_ID, String trxName, String[] virtualColumns)
	{
		super(ctx, T_UpdatedProduct_Price_ID, trxName, virtualColumns);
	}

	public MO_T_UpdateProductPrice(Properties ctx, ResultSet rs, String trxName)
	{
		super(ctx, rs, trxName);
	}

	public MO_T_UpdateProductPrice(Properties ctx, String T_UpdatedProduct_Price_UU, String trxName)
	{
		super(ctx, T_UpdatedProduct_Price_UU, trxName);
	}

	public MO_T_UpdateProductPrice(Properties ctx, String T_UpdatedProduct_Price_UU, String trxName, String[] virtualColumns)
	{
		super(ctx, T_UpdatedProduct_Price_UU, trxName, virtualColumns);
	}

}
