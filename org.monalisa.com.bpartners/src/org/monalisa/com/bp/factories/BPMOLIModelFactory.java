package org.monalisa.com.bp.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;

public class BPMOLIModelFactory implements IModelFactory {

	private final static CLogger log = CLogger.getCLogger(BPMOLIModelFactory.class);
	
	@Override
	public Class<?> getClass(String tableName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// TODO Auto-generated method stub
		return null;
	}

}