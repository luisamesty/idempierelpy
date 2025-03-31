package org.moli.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.Env;
import org.moli.compiere.MO_Commission;
import org.moli.compiere.MO_CommissionLine;
import org.moli.compiere.MO_CommissionRun;
import org.moli.compiere.MO_Sequence;

public class COModelFactory implements IModelFactory{

	@Override
	public Class<?> getClass(String tableName) {
		// log.warning("=====COModelFactory getClass========= Table:"+tableName);
		// MO_Commission
		if(tableName.equalsIgnoreCase(MO_Commission.Table_Name))
			return MO_Commission.class;
		// MO_CommissionLine
		if(tableName.equalsIgnoreCase(MO_CommissionLine.Table_Name))
			return MO_CommissionLine.class;	
		// MO_CommissionRun
		if(tableName.equalsIgnoreCase(MO_CommissionRun.Table_Name))
			return MO_CommissionRun.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// log.warning("=====COModelFactory getPO  ========= Table:"+tableName);
		// MO_Commission
		if(tableName.equalsIgnoreCase(MO_Commission.Table_Name))
			return new MO_Commission(Env.getCtx(),Record_ID, trxName);	
		// MO_CommissionLine
		if(tableName.equalsIgnoreCase(MO_CommissionLine.Table_Name))
			return new MO_CommissionLine(Env.getCtx(),Record_ID, trxName);	
		// MO_CommissionRun
		if(tableName.equalsIgnoreCase(MO_CommissionRun.Table_Name))
			return new MO_CommissionRun(Env.getCtx(),Record_ID, trxName);	
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// log.warning("=====COModelFactory getPO rs ========= Table:"+tableName);
		// MO_Commission
		if(tableName.equalsIgnoreCase(MO_Commission.Table_Name))
			return new MO_Commission(Env.getCtx(),rs, trxName);
		// MO_CommissionLine
		if(tableName.equalsIgnoreCase(MO_CommissionLine.Table_Name))
			return new MO_CommissionLine(Env.getCtx(),rs, trxName);
		// MO_CommissionRun
		if(tableName.equalsIgnoreCase(MO_CommissionRun.Table_Name))
			return new MO_CommissionRun(Env.getCtx(),rs, trxName);
		return null;
	}

}
