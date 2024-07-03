package org.moli.factories;


import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
import org.moli.process.MOLIImportProduct;

public class MAMOLIProcessFactory implements IProcessFactory {
	private final static CLogger log = CLogger.getCLogger(MAMOLIProcessFactory.class);

	@Override
	public ProcessCall newProcessInstance(String p_className) {
    	
		ProcessCall process = null;
    	
    	// Process MOLIImportProduct;
    	if(p_className.equals("org.monalisa.com.mmprocess.MOLIImportProduct")) {
    		try {
    			process =   (ProcessCall) MOLIImportProduct.class.newInstance();
    		} catch (Exception e) {}
    	}
		return null;
	}
	
}
