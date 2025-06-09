package org.moli.lpytaxlookup;

import org.compiere.model.MBPartner;
import org.compiere.util.DB;
import java.util.Properties;

public class BPartnerUtil {

    /**
     * Obtiene el socio de negocio (C_BPartner) a partir del C_Location_ID
     * @param ctx contexto
     * @param C_Location_ID ID de ubicación
     * @param trxName nombre de la transacción
     * @return MBPartner o null si no se encuentra
     */
    public static MBPartner getBPartnerByLocation(Properties ctx, int C_Location_ID, String trxName) {
        String sql = "SELECT C_BPartner_ID FROM C_BPartner_Location WHERE C_Location_ID = ? AND IsActive='Y'";
        int C_BPartner_ID = DB.getSQLValue(trxName, sql, C_Location_ID);
        
        if (C_BPartner_ID > 0) {
            return new MBPartner(ctx, C_BPartner_ID, trxName);
        }

        return null; // No se encontró el tercero
    }
}
