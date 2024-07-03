package org.moli.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;

public class BPMOLIProcessFactory implements IProcessFactory {
	
	private final static CLogger log = CLogger.getCLogger(BPMOLIProcessFactory.class);

	@Override
	public ProcessCall newProcessInstance(String className) {
		// 
		return null;
	}

}