package org.moli.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.BankStatementPayment;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
import org.moli.process.MOBankStatementPayment;
import org.moli.process.MOInOutGenerate;
import org.moli.process.MOInvoiceGenerate;

public class DOProcessFactory implements IProcessFactory {

	private final static CLogger log = CLogger.getCLogger(DOProcessFactory.class);
	
	@Override
	public ProcessCall newProcessInstance(String p_className) {
		
	   	ProcessCall process = null;
    	// log.warning("......DOProcessFactory..."+p_className);
	   	// org.compiere.process.InOutGenerate
    	if (p_className.equals("org.compiere.process.InOutGenerate"))
    		try {
				process =   MOInOutGenerate.class.newInstance();
			} catch (Exception e) {}
    	//return new MOInOutGenerate();
	   	// org.compiere.process.InvoiceGenerate
    	if (p_className.equals("org.compiere.process.InvoiceGenerate"))
    		try {
				process =   MOInvoiceGenerate.class.newInstance();
			} catch (Exception e) {}
    	//return new InvoiceGenerate();
	   	// org.compiere.process.BankStatementPayment
    	if (p_className.equals("org.compiere.process.BankStatementPayment"))
    		try {
				process =   MOBankStatementPayment.class.newInstance();
			} catch (Exception e) {}
    	//return new BankStatementPayment();    	
    	return process;
	}

}
