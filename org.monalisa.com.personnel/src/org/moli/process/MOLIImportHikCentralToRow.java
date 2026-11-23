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
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;

import org.adempiere.util.IProcessUI;
import org.amerp.amnmodel.MAMN_Payroll_Assist_Row;
import org.compiere.model.MMessage;
import org.compiere.model.MNote;
import org.compiere.process.ProcessInfoParameter;
import org.compiere.process.SvrProcess;
import org.compiere.util.Env;
import org.compiere.util.Msg;
import org.compiere.util.Trx;

public class MOLIImportHikCentralToRow extends SvrProcess {

    private Timestamp p_RefDateIni = null;
    private Timestamp p_RefDateEnd = null;
    private int p_AD_Client_ID = 0;
    private int p_AD_Org_ID = 0;
    private boolean p_IsScheduled = false;

    // Parámetros de conexión a BBDD externa HikCentral
    private String p_DBHost = "localhost";
    private String p_DBPort = "5432";
    private String p_DBName = "hikcentral";
    private String p_DBUser = "postgres";
    private String p_DBPassword = "Sofi@2015"; //"PostgreSQL@2024MO";

    private IProcessUI processMonitor = null;
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
            } else if ("DBHost".equals(paraName) || "Host".equals(paraName) ) {
                p_DBHost = para.getParameterAsString();
            } else if ("DBPort".equals(paraName) || "HostPort".equals(paraName)) {
                p_DBPort = para.getParameterAsString();
            } else if ("DBName".equals(paraName) || "DatabaseInfo".equals(paraName)) {
                p_DBName = para.getParameterAsString();
            } else if ("DBUser".equals(paraName)) {
                p_DBUser = para.getParameterAsString();
            } else if ("DBPassword".equals(paraName) || "Password".equals(paraName) ) {
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

        String batchSql = "SELECT id, pin, event_ts, device_name, device_serial_no, person_name, "
                + "       card_number, status, authentication_type, reader_name, direction, resource_name "
                + "FROM ( "
                + "  SELECT DISTINCT ON (pin, event_ts) "
                + "         id, pin, event_ts, device_name, device_serial_no, person_name, "
                + "         card_number, status, authentication_type, reader_name, direction, resource_name "
                + "  FROM ( "
                + "    SELECT id, TRIM(pin) AS pin, " + EVENT_TS_EXPR + " AS event_ts, "
                + "           device_name, device_serial_no, person_name, "
                + "           card_number, status, authentication_type, reader_name, direction, resource_name "
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
                Trx trx = Trx.get(Trx.createTrxName("HikCentral_To_Row"), true);
                List<MAMN_Payroll_Assist_Row> batchList = new ArrayList<>();
                int batchSavedCount = 0;

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
                                String personName = rs.getString("person_name");
                                String direction = rs.getString("direction");

                                if (!p_IsScheduled && processMonitor != null && rowCount > 0) {
                                    int percent = (int) (100.0 * rowNumber / rowCount);
                                    String msg = String.format("%-8s/%-8s (%3d%%) PIN:%-10s Fecha:%s",
                                            rowNumber, rowCount, percent, pin, eventTs);
                                    processMonitor.statusUpdate(msg);
                                }

                                MAMN_Payroll_Assist_Row assistRow = buildAssistRow(
                                        ctx, p_AD_Client_ID, p_AD_Org_ID,
                                        pin, eventTs, deviceName, readerName, personName, direction,
                                        trx.getTrxName());
                                if (assistRow != null) {
                                    batchList.add(assistRow);
                                }
                            }
                        }
                    }

                    for (MAMN_Payroll_Assist_Row assistRow : batchList) {
                        assistRow.saveEx();
                        batchSavedCount++;
                    }

                    trx.commit();
                    rowsSaved += batchSavedCount;
                } catch (Exception e) {
                    trx.rollback();
                    log.log(Level.SEVERE, "Error guardando lote en AMN_Payroll_Assist_Row desde offset " + offset, e);
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
            log.log(Level.SEVERE, "Error en importación HikCentral -> AMN_Payroll_Assist_Row", e);
            return Msg.getMsg(ctx, "ProcessFailed");
        }

        String summary = paramMsg
                + Msg.translate(ctx, "Row") + "(s) " + Msg.translate(ctx, "Updated") + "(s) = "
                + String.format("%10s", rowsSaved) + "   "
                + Msg.translate(ctx, "Row") + "(s) " + Msg.translate(ctx, "Total") + "(s) = "
                + String.format("%10s", rowCount);

        addLogIFNotScheduled(summary);
        sendNotification(ctx, "N", summary);
        log.warning("AMNImportHikCentralToRow - Notification:\r\n" + summary);

        return "@Processed@ " + rowCount + " - @Updated@ " + rowsSaved;
    }

    private Connection getHikCentralConnection() throws SQLException {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e) {
            // Si ya está registrado en DriverManager por otro bundle, intentamos conectar igual
            try {
                DriverManager.registerDriver(new org.postgresql.Driver());
            } catch (Exception ignored) {
            }
        }
        String url = "jdbc:postgresql://" + p_DBHost + ":" + p_DBPort + "/" + p_DBName;
        return DriverManager.getConnection(url, p_DBUser, p_DBPassword);
    }
    
    private MAMN_Payroll_Assist_Row buildAssistRow(
            Properties ctx,
            int adClientId,
            int adOrgId,
            String pin,
            Timestamp eventTs,
            String deviceName,
            String readerName,
            String personName,
            String direction,
            String trxName) {

        if (pin == null || pin.isBlank() || eventTs == null) {
            return null;
        }

        // Ventana de tiempo: mismo minuto (de :00.000 a :59.999999999)
        Timestamp minuteStart = Timestamp.valueOf(
                eventTs.toLocalDateTime().withSecond(0).withNano(0));
        Timestamp minuteEnd = Timestamp.valueOf(
                eventTs.toLocalDateTime().withSecond(59).withNano(999_999_999));

        String existingSql = "SELECT AMN_Payroll_Assist_Row_ID FROM AMN_Payroll_Assist_Row "
                + "WHERE AD_Client_ID=? AND AD_Org_ID=? AND PIN=? "
                + "AND AMN_DateTime BETWEEN ? AND ?";
        int existingId = org.compiere.util.DB.getSQLValue(
                trxName, existingSql, adClientId, adOrgId, pin, minuteStart, minuteEnd);

        if (existingId > 0) {
            // Ya existe un marcaje para este PIN dentro del mismo minuto: no lo duplicamos
            return null;
        }

        MAMN_Payroll_Assist_Row row = new MAMN_Payroll_Assist_Row(ctx, 0, trxName);
        row.setAD_Org_ID(adOrgId);
        row.setIsActive(true);
        row.setPIN(pin);
        row.setAMN_DateTime(eventTs);
        row.setIsVerified(false);

        return row;
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
            note.setAD_Table_ID(MAMN_Payroll_Assist_Row.Table_ID);
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