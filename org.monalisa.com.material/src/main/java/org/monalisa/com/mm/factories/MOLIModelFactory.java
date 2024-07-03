package org.monalisa.com.mm.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.monalisa.com.mm.model.I_I_Product_Moli;
import org.monalisa.com.mm.model.MOLI_I_Product;

public class MOLIModelFactory implements IModelFactory {

	private final static CLogger log = CLogger.getCLogger(MOLIModelFactory.class);

	@Override
	public Class<?> getClass(String tableName) {
		if(tableName.equalsIgnoreCase(I_I_Product_Moli.Table_Name))
			return MOLI_I_Product.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		if(tableName.equalsIgnoreCase(MOLI_I_Product.Table_Name))
			return new MOLI_I_Product(Env.getCtx(),Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		if(tableName.equalsIgnoreCase(MOLI_I_Product.Table_Name))
			return new MOLI_I_Product(Env.getCtx(),rs, trxName);
		return null;
	}
}
