package org.moli.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;


public class PEMOLIModelFactory implements IModelFactory {

	private final static CLogger log = CLogger.getCLogger(PEMOLIModelFactory.class);
	
	@Override
	public Class<?> getClass(String tableName) {
		// 
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// 
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// 
		return null;
	}

}
