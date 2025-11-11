package org.moli.factories;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
import org.moli.process.MOCommissionCalc;
import org.moli.reports.CommissionProfile.CommissionProfile;
import org.moli.reports.CommissionRunRpt.CommissionRunRpt;

public class COProcessFactory implements IProcessFactory {

    private final static CLogger log = CLogger.getCLogger(COProcessFactory.class);

    @Override
    public ProcessCall newProcessInstance(String className) {
        ProcessCall process = null;
        // Processes
        if (className.equals("org.compiere.process.CommissionCalc")) {
            try {
                process = MOCommissionCalc.class.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                log.severe("Error al instanciar la clase: " + e.getMessage());
            }
        }
        // Reports
        // Commission Profile Report
        if (className.equals("org.moli.reports.CommissionProfile")) {
            try {
                process = CommissionProfile.class.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                log.severe("Error al instanciar la clase: " + e.getMessage());
            }
        }
        // Commission Run Report
        if (className.equals("org.moli.reports.CommissionRunRpt")) {
            try {
                process = CommissionRunRpt.class.getDeclaredConstructor().newInstance();
            } catch (Exception e) {
                log.severe("Error al instanciar la clase: " + e.getMessage());
            }
        }
        return process;
    }
}
