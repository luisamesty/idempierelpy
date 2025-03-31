package org.moli.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
import org.moli.process.MOCommissionCalc;

public class COProcessFactory implements IProcessFactory {

    private final static CLogger log = CLogger.getCLogger(COProcessFactory.class);

    @Override
    public ProcessCall newProcessInstance(String className) {
        ProcessCall process = null;
        log.warning("......COProcessFactory..." + className);
        if (className.equals("org.compiere.process.CommissionCalc")) {
            try {
                process = MOCommissionCalc.class.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                log.severe("Error al instanciar la clase: " + e.getMessage());
            }
        }
        return process;
    }
}
