package org.moli.factories;

import java.sql.ResultSet;

import org.adempiere.base.IModelFactory;
import org.compiere.model.PO;
import org.compiere.util.CLogger;
import org.compiere.util.Env;
import org.moli.compiere.MO_Invoice;
import org.moli.compiere.MO_Sequence;
import org.moli.compiere.MO_Sequence_No;



public class DOModelFactory implements IModelFactory {
	
	CLogger log = CLogger.getCLogger(DOModelFactory.class);

	@Override
	public Class<?> getClass(String tableName) {
		// log.warning("=====AMDModelFactory getClass========= Table:"+tableName);
		// MAD_Sequence
		if(tableName.equalsIgnoreCase(MO_Sequence.Table_Name))
			return MO_Sequence.class;
		// MAD_Sequence_No
		if(tableName.equalsIgnoreCase(MO_Sequence_No.Table_Name))
			return MO_Sequence_No.class;
		// MO_Invoice
		if(tableName.equalsIgnoreCase(MO_Invoice.Table_Name))
			return MO_Invoice.class;
		return null;
	}

	@Override
	public PO getPO(String tableName, int Record_ID, String trxName) {
		// log.warning("=====AMDModelFactory getPO  ========= Table:"+tableName);
		// MAD_Sequence
		if(tableName.equalsIgnoreCase(MO_Sequence.Table_Name))
			return new MO_Sequence(Env.getCtx(),Record_ID, trxName);		
		// MAD_Sequence_No
		if(tableName.equalsIgnoreCase(MO_Sequence_No.Table_Name))
			return new MO_Sequence_No(Env.getCtx(),Record_ID, trxName);
		// MO_Invoice
		if(tableName.equalsIgnoreCase(MO_Invoice.Table_Name))
			return new MO_Invoice(Env.getCtx(),Record_ID, trxName);
		return null;
	}

	@Override
	public PO getPO(String tableName, ResultSet rs, String trxName) {
		// log.warning("=====AMDModelFactory getPO rs ========= Table:"+tableName);
		// MAD_Sequence
		if(tableName.equalsIgnoreCase(MO_Sequence.Table_Name))
			return new MO_Sequence(Env.getCtx(),rs, trxName);
		// MAD_Sequence_No
		if(tableName.equalsIgnoreCase(MO_Sequence_No.Table_Name))
			return new MO_Sequence_No(Env.getCtx(),rs, trxName);
		// MO_Invoice
		if(tableName.equalsIgnoreCase(MO_Invoice.Table_Name))
			return new MO_Invoice(Env.getCtx(),rs, trxName);
		return null;
	}

}
