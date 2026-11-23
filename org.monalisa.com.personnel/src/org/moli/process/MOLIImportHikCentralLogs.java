package org.moli.process;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.util.IProcessUI;
import org.amerp.amnmodel.MAMN_Employee;
import org.amerp.amnmodel.MAMN_Payroll_Assist;
import org.amerp.amnmodel.MAMN_Payroll_Assist_Row;
import org.amerp.amnmodel.MAMN_Payroll_Assist_Unit;
import org.amerp.amnutilities.PayrollAssistRowImport;
import org.compiere.model.MMessage;
import org.compiere.model.MNote;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.DB;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;

public class MOLIImportHikCentralLogs extends SvrProcess {

    private Timestamp p_RefDateIni = null;
    private Timestamp p_RefDateEnd = null;
    private int p_AD_Client_ID = 0;
    private int p_AD_Org_ID = 0;
    private boolean p_IsScheduled = false;

    // Parámetros de conexión a BBDD externa HikCentral
    private String p_DBHost = "localhost";
    private String p_DBPort = "5432";
    private String p_DBName = "hikcentral";
    private String p_DBUser = "";
    private String p_DBPassword = "";

    private IProcessUI processMonitor = null;
    private final List<PayrollAssistRowImport> payrollAssistRejected = new ArrayList<>();
    private final Map<String, Integer> pinToEmployeeMap = new HashMap<>();
    private String paramMsg = "";

    private static final String EVENT_TS_EXPR = "COALESCE(datetime, (datetrx + timetrx))";

    @Override
    protected void prepare() {
        ProcessInfoParameter[] paras = getParameter();
        for (ProcessInfoParameter para : paras) {
            String paraName = para.getParameterName();
            if ("AD_Client_ID".equals(paraName)) {
                p_AD_Client_ID = para.getParameterAsInt();
            } else if ("AD_Org_ID".equals(paraName)) {
                p_AD_Org_ID = para.getParameterAsInt();
            } else if ("RefDateIni".equals(paraName)) {
                p_RefDateIni = para.getParameterAsTimestamp();
            } else if ("RefDateEnd".equals(paraName)) {
                p_RefDateEnd = para.getParameterAsTimestamp();
            } else if ("IsScheduled".equals(paraName)) {
                p_IsScheduled = para.getParameterAsBoolean();
            } else if ("DBHost".equals(paraName)) {
                p_DBHost = para.getParameterAsString();
            } else if ("DBPort".equals(paraName)) {
                p_DBPort = para.getParameterAsString();
            } else if ("DBName".equals(paraName)) {
                p_DBName = para.getParameterAsString();
            } else if ("DBUser".equals(paraName)) {
                p_DBUser = para.getParameterAsString();
            } else if ("DBPassword".equals(paraName)) {
                p_DBPassword = para.getParameterAsString();
            } else {
                log.log(Level.SEVERE, "Unknown Parameter: " + paraName);
            }
        }

        if (p_AD_Client_ID == 0) {
            p_AD_Client_ID = Env.getAD_Client_ID(getCtx());
        }
        if (p_AD_Org_ID == 0) {
            p_AD_Org_ID = Env.getAD_Org_ID(getCtx());
        }

        if (p_RefDateIni == null) {
            LocalDate firstDayOfMonth = LocalDate.now().withDayOfMonth(1);
            p_RefDateIni = Timestamp.valueOf(firstDayOfMonth.atStartOfDay());
            paramMsg += ">>> RefDateIni no recibido. Se asigna primer día del mes actual: " + p_RefDateIni + "\r\n";
        }

        if (p_RefDateEnd == null) {
            LocalDate today = LocalDate.now();
            p_RefDateEnd = Timestamp.valueOf(today.atStartOfDay());
            paramMsg += ">>> RefDateEnd no recibido. Se asigna fecha actual sin hora: " + p_RefDateEnd + "\r\n";
        }

        paramMsg += "Parámetros enviados: AD_Client_ID=" + p_AD_Client_ID
                + " | AD_Org_ID=" + p_AD_Org_ID
                + " | DateIni=" + p_RefDateIni
                + " | DateEnd=" + p_RefDateEnd
                + " | HikCentralDB=" + p_DBHost + ":" + p_DBPort + "/" + p_DBName
                + " | Schedule=" + p_IsScheduled + "\r\n";
        log.warning(paramMsg);
    }

    private Connection getHikCentralConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        String url = "jdbc:postgresql://" + p_DBHost + ":" + p_DBPort + "/" + p_DBName;
        return DriverManager.getConnection(url, p_DBUser, p_DBPassword);
    }

    @Override
    protected String doIt() throws Exception {
        Properties ctx = getCtx();
        int rowsSaved = 0;
        int rowCount = 0;

        Calendar cal = Calendar.getInstance();
        cal.setTime(p_RefDateIni);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        p_RefDateIni = new Timestamp(cal.getTimeInMillis());

        cal.setTime(p_RefDateEnd);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);
        cal.set(Calendar.MILLISECOND, 999);
        p_RefDateEnd = new Timestamp(cal.getTimeInMillis());

        // 1. Cargar mapa PIN -> AMN_Employee_ID desde la BBDD principal
        String pinQuery = "SELECT PIN, AMN_Employee_ID FROM amn_employee WHERE IsActive='Y' AND PIN IS NOT NULL";
        try (PreparedStatement pinStmt = DB.prepareStatement(pinQuery, get_TrxName());
             ResultSet pinRs = pinStmt.executeQuery()) {
            while (pinRs.next()) {
                pinToEmployeeMap.put(pinRs.getString("PIN").trim(), pinRs.getInt("AMN_Employee_ID"));
            }
        }

        // 2. Consultar y procesar por lotes desde HikCentral
        String countSql = "SELECT COUNT(*) FROM ( "
                + "SELECT DISTINCT ON (pin, event_ts) id "
                + "FROM ( "
                + "  SELECT id, TRIM(pin) AS pin, " + EVENT_TS_EXPR + " AS event_ts "
                + "  FROM public.hik_central_logs "
                + "  WHERE pin IS NOT NULL AND TRIM(pin) <> '' "
                + "    AND " + EVENT_TS_EXPR + " >= ? "
                + "    AND " + EVENT_TS_EXPR + " <= ? "
                + ") base "
                + "WHERE event_ts IS NOT NULL "
                + "ORDER BY pin, event_ts, id "
                + ") dedup";

        String batchSql = "SELECT id, pin, event_ts, device_name, device_serial_no, reader_name, direction, status "
                + "FROM ( "
                + "  SELECT DISTINCT ON (pin, event_ts) "
                + "    id, pin, event_ts, device_name, device_serial_no, reader_name, direction, status "
                + "  FROM ( "
                + "    SELECT id, TRIM(pin) AS pin, " + EVENT_TS_EXPR + " AS event_ts, "
                + "           device_name, device_serial_no, reader_name, direction, status "
                + "    FROM public.hik_central_logs "
                + "    WHERE pin IS NOT NULL AND TRIM(pin) <> '' "
                + "      AND " + EVENT_TS_EXPR + " >= ? "
                + "      AND " + EVENT_TS_EXPR + " <= ? "
                + "  ) base "
                + "  WHERE event_ts IS NOT NULL "
                + "  ORDER BY pin, event_ts, id "
                + ") dedup "
                + "ORDER BY pin, event_ts, id "
                + "LIMIT ? OFFSET ?";

        processMonitor = Env.getProcessUI(ctx);

        try (Connection hikConn = getHikCentralConnection()) {
            try (PreparedStatement countStmt = hikConn.prepareStatement(countSql)) {
                countStmt.setTimestamp(1, p_RefDateIni);
                countStmt.setTimestamp(2, p_RefDateEnd);
                try (ResultSet countRs = countStmt.executeQuery()) {
                    if (countRs.next()) {
                        rowCount = countRs.getInt(1);
                    }
                }
            }

            int batchSize = 1000;
            int offset = 0;
            int rowNumber = 0;

            while (offset < rowCount) {
                Trx trx = Trx.get(Trx.createTrxName("HikCentral_Assist_Imp"), true);
                List<MAMN_Payroll_Assist> batchList = new ArrayList<>();
                int batchProcessedCount = 0;

                try {
                    try (PreparedStatement pstmt = hikConn.prepareStatement(batchSql)) {
                        pstmt.setTimestamp(1, p_RefDateIni);
                        pstmt.setTimestamp(2, p_RefDateEnd);
                        pstmt.setInt(3, batchSize);
                        pstmt.setInt(4, offset);

                        try (ResultSet rs = pstmt.executeQuery()) {
                            while (rs.next()) {
                                rowNumber++;
                                String pin = rs.getString("pin").trim();
                                Timestamp eventTs = rs.getTimestamp("event_ts");
                                String deviceName = rs.getString("device_name");
                                String readerName = rs.getString("reader_name");
                                String direction = rs.getString("direction");

                                if (!p_IsScheduled && processMonitor != null && rowCount > 0) {
                                    int percent = (int) (100.0 * rowNumber / rowCount);
                                    String msg = String.format("%-8s/%-8s (%3d%%) PIN:%-10s Fecha:%s",
                                            rowNumber, rowCount, percent, pin, eventTs);
                                    processMonitor.statusUpdate(msg);
                                }

                                Integer employeeId = pinToEmployeeMap.get(pin);
                                if (employeeId != null) {
                                    MAMN_Employee employee = new MAMN_Employee(ctx, employeeId, trx.getTrxName());
                                    MAMN_Payroll_Assist assist = createAssistFromHikLog(
                                            ctx, p_AD_Client_ID, p_AD_Org_ID,
                                            employee, eventTs, deviceName, readerName, direction,
                                            trx.getTrxName());
                                    if (assist != null) {
                                        batchList.add(assist);
                                    }
                                } else {
                                    String unitLabel = (deviceName != null && !deviceName.isBlank())
                                            ? deviceName.trim()
                                            : "HikCentral";
                                    PayrollAssistRowImport found = PayrollAssistRowImport.searchByPin(payrollAssistRejected, pin);
                                    if (found == null) {
                                        payrollAssistRejected.add(new PayrollAssistRowImport(pin, unitLabel, 1));
                                    } else {
                                        PayrollAssistRowImport.incrementQtyByPin(payrollAssistRejected, pin);
                                    }
                                }
                            }
                        }
                    }

                    for (MAMN_Payroll_Assist assist : batchList) {
                        assist.saveEx();
                        batchProcessedCount++;
                    }

                    trx.commit();
                    rowsSaved += batchProcessedCount;
                } catch (Exception e) {
                    trx.rollback();
                    log.log(Level.SEVERE, "Error procesando lote desde offset " + offset, e);
                    throw e;
                } finally {
                    trx.close();
                }

                offset += batchSize;

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        } catch (Exception e) {
            log.log(Level.SEVERE, "Error en proceso de importación HikCentral", e);
            return Msg.getMsg(ctx, "ProcessFailed");
        }

        String summary = paramMsg
                + Msg.getElement(ctx, "PIN") + "(s) " + Msg.translate(ctx, "NotFound") + "\r\n"
                + Msg.translate(ctx, "Row") + "(s) " + Msg.translate(ctx, "Updated") + "(s) = "
                + String.format("%10s", rowsSaved) + "   "
                + Msg.translate(ctx, "Row") + "(s) " + Msg.translate(ctx, "Total") + "(s) = "
                + String.format("%10s", rowCount) + "\r\n"
                + String.format("%15s  %30s %15s",
                        Msg.getElement(ctx, MAMN_Payroll_Assist_Row.COLUMNNAME_PIN),
                        Msg.getElement(ctx, MAMN_Payroll_Assist_Unit.COLUMNNAME_Name),
                        Msg.getElement(ctx, "Qty"));

        addLogIFNotScheduled(summary);

        for (PayrollAssistRowImport unit : payrollAssistRejected) {
            String line = String.format("%15s  %30s %15s",
                    unit.getPin(), unit.getAMN_Payroll_Assist_Unit(), unit.getQty());
            addLogIFNotScheduled(line);
            summary += "\r\n" + line;
        }

        sendNotification(ctx, "N", summary);
        log.warning("AMNImportHikCentralLogs - Notification:\r\n" + summary);

        return "@Processed@ " + rowCount + " - @Updated@ " + rowsSaved;
    }

    private MAMN_Payroll_Assist createAssistFromHikLog(
            Properties ctx,
            int adClientId,
            int adOrgId,
            MAMN_Employee employee,
            Timestamp eventTs,
            String deviceName,
            String readerName,
            String direction,
            String trxName) {

        if (employee == null || eventTs == null) {
            return null;
        }

        String description = employee.getValue() + "-" + employee.getName().trim();
        String deviceInfo = (deviceName != null && !deviceName.isBlank())
                ? deviceName.trim()
                : ((readerName != null && !readerName.isBlank()) ? readerName.trim() : null);
        if (deviceInfo != null) {
            description = "U" + deviceInfo + " " + description;
        }

        MAMN_Payroll_Assist assist = MAMN_Payroll_Assist.findByEmployeeAndDateTime(
                ctx, employee.getAMN_Employee_ID(), eventTs, trxName);
        if (assist == null) {
            assist = new MAMN_Payroll_Assist(ctx, adClientId, adOrgId, trxName);
            assist.setAD_Org_ID(adOrgId);
            assist.setIsActive(true);
        }

        String assistRecord = MAMN_Payroll_Assist.getPayrollAssist_DayofWeek(eventTs) + "-"
                + MAMN_Payroll_Assist.getPayrollAssist_DayofWeekName(eventTs) + "-"
                + eventTs.toString();

        String eventType = "I";
        if (direction != null && !direction.isBlank()) {
            String dirUpper = direction.trim().toUpperCase();
            if (dirUpper.startsWith("O") || dirUpper.contains("OUT") || dirUpper.contains("SAL")) {
                eventType = "O";
            }
        }

        assist.setDescription(description);
        assist.setAMN_Employee_ID(employee.getAMN_Employee_ID());
        assist.setAMN_Shift_ID(employee.getAMN_Shift_ID());
        assist.setdayofweek(MAMN_Payroll_Assist.getPayrollAssist_DayofWeek(eventTs));
        assist.setDescanso(false);
        assist.setEvent_Date(eventTs);
        assist.setEvent_Time(eventTs);
        assist.setEvent_Type(eventType);
        assist.setBioCode(employee.getBioCode());
        assist.setAMN_AssistRecord(assistRecord);

        return assist;
    }

    private void sendNotification(Properties ctx, String notificationType, String notificationMessage) {
        if ("N".equalsIgnoreCase(notificationType)) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            MNote note = new MNote(ctx, "ImportAttendance", getAD_User_ID(), null);
            note.setTextMsg(notificationMessage);
            note.setDescription(MMessage.get(ctx, "ImportAttendance")
                    + Msg.translate(ctx, "From") + " "
                    + Msg.getElement(ctx, "RefDateIni") + ":" + dateFormat.format(p_RefDateIni) + " "
                    + Msg.translate(ctx, "To") + " "
                    + Msg.getElement(ctx, "RefDateEnd") + ":" + dateFormat.format(p_RefDateEnd));
            note.setAD_Table_ID(MAMN_Payroll_Assist.Table_ID);
            note.setRecord_ID(0);
            note.setAD_Org_ID(0);
            note.setAD_User_ID(getAD_User_ID());
            note.saveEx();
        }
    }

    private void addLogIFNotScheduled(String message) {
        if (!p_IsScheduled) {
            addLog(message);
        }
    }
}