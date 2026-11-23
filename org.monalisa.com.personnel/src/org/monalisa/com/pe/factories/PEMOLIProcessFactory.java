package org.monalisa.com.pe.factories;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.adempiere.base.IProcessFactory;
import org.compiere.process.ProcessCall;
import org.compiere.util.CLogger;
import org.moli.process.MOLIImportHikCentralLogs;
import org.moli.process.MOLIImportHikCentralToRow;

public class PEMOLIProcessFactory implements IProcessFactory {

    private static final CLogger log = CLogger.getCLogger(PEMOLIProcessFactory.class);
    private static final Map<String, Class<? extends ProcessCall>> processClasses = new HashMap<>();

    static {
        // Map the class names to the actual Class objects
    	// MOLIImportHikCentralLogs
        processClasses.put("org.moli.process.MOLIImportHikCentralLogs", MOLIImportHikCentralLogs.class);
        // MOLIImportHikCentralToRow
        processClasses.put("org.moli.process.MOLIImportHikCentralToRow", MOLIImportHikCentralToRow.class);
    }

    @Override
    public ProcessCall newProcessInstance(String p_className) {
        Class<? extends ProcessCall> clazz = processClasses.get(p_className);
        if (clazz == null) {
            return null;
        }

        try {
            Constructor<? extends ProcessCall> constructor = clazz.getDeclaredConstructor();
            return constructor.newInstance();
        } catch (Exception e) {
            // Log the error for better debugging
            log.warning("Could not instantiate process class " + p_className + ": " + e.getMessage());
            e.printStackTrace();
            return null;
        }
    }

}
