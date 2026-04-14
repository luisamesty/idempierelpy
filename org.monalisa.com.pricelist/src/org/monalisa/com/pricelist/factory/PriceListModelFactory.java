package org.monalisa.com.pricelist.factory;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.monalisa.com.pricelist.model.MO_T_UpdateProductPrice;

public class PriceListModelFactory implements IModelFactory
{
	@Override
	public Class<?> getClass(String tableName)
	{
		if (MO_T_UpdateProductPrice.Table_Name.equals(tableName))
			return MO_T_UpdateProductPrice.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName)
	{
		if (MO_T_UpdateProductPrice.Table_Name.equals(tableName))
			return new MO_T_UpdateProductPrice(Env.getCtx(), Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName)
	{
		if (MO_T_UpdateProductPrice.Table_Name.equals(tableName))
			return new MO_T_UpdateProductPrice(Env.getCtx(), rs, trxName);
		return null;
	}

}
