package org.moli.factories;


import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.moli.compiere.MO_Warehouse;
import org.moli.model.MOLI_I_Product;


public class MAMOLIModelFactory implements IModelFactory {

	private final static CLogger log = CLogger.getCLogger(MAMOLIModelFactory.class);

	@Override
	public Class<?> getClass(String tableName) {
		// MOLI_I_Product
		if(tableName.equalsIgnoreCase(MOLI_I_Product.Table_Name))
			return MOLI_I_Product.class;
		// MO_Warehouse
		if(tableName.equalsIgnoreCase(MO_Warehouse.Table_Name))
			return MO_Warehouse.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// MOLI_I_Product
		if(tableName.equalsIgnoreCase(MOLI_I_Product.Table_Name))
			return new MOLI_I_Product(Env.getCtx(),Record_ID, trxName);
		// MO_Warehouse
		if(tableName.equalsIgnoreCase(MO_Warehouse.Table_Name))
			return new MO_Warehouse(Env.getCtx(),Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// MOLI_I_Product
		if(tableName.equalsIgnoreCase(MOLI_I_Product.Table_Name))
			return new MOLI_I_Product(Env.getCtx(),rs, trxName);
		// MO_Warehouse
		if(tableName.equalsIgnoreCase(MO_Warehouse.Table_Name))
			return new MO_Warehouse(Env.getCtx(),rs, trxName);
		return null;
	}
}