package org.moli.lpytaxlookup;

import java.sql.Timestamp;
import java.util.Properties;

import org.adempiere.base.ITaxLookup;
import org.compiere.model.MBPartner;
import org.compiere.model.MBPartnerLocation;
import org.osgi.service.component.annotations.Component;

@Component(
	    service = ITaxLookup.class,
	    property = {
	        "component.name=org.moli.compiere.LPYTaxLookup"
	    }
	)
public class LPYTaxLookup implements ITaxLookup {
	
	/**
	 * default constructor
	 */
	public LPYTaxLookup() {
	}

	//@Override
	public int get(Properties ctx, int M_Product_ID, int C_Charge_ID,  Timestamp billDate, Timestamp shipDate,
			int AD_Org_ID, int M_Warehouse_ID, int billC_BPartner_Location_ID, int shipC_BPartner_Location_ID,
			boolean IsSOTrx, String deliveryViaRule, String trxName) {
		MBPartnerLocation bpl = new MBPartnerLocation(ctx, billC_BPartner_Location_ID, trxName);
		MBPartner bp = new MBPartner(ctx, bpl.getC_BPartner_ID(), trxName);
		String IsBPTaxExempt = "N";
		if ((IsSOTrx && bp.isTaxExempt() ) || (!IsSOTrx && bp.isPOTaxExempt()))
				IsBPTaxExempt = "Y";
		return MO_Tax.get(ctx, M_Product_ID, C_Charge_ID, IsBPTaxExempt, billDate, shipDate, AD_Org_ID, M_Warehouse_ID, billC_BPartner_Location_ID, shipC_BPartner_Location_ID, 
				IsSOTrx, deliveryViaRule, trxName);
	}

	//@Overrides
	public int get(Properties ctx, int C_TaxCategory_ID, boolean IsSOTrx, Timestamp shipDate, int shipFromC_Location_ID,
			int shipToC_Location_ID, Timestamp billDate, int billFromC_Location_ID, int billToC_Location_ID,
			String trxName) {
		MBPartnerLocation bpl = new MBPartnerLocation(ctx, billToC_Location_ID, trxName);
		MBPartner bp = new MBPartner(ctx, bpl.getC_BPartner_ID(), trxName);
		String IsBPTaxExempt = "N";
		if ((IsSOTrx && bp.isTaxExempt() ) || (!IsSOTrx && bp.isPOTaxExempt()))
				IsBPTaxExempt = "Y";
		return MO_Tax.get(ctx, C_TaxCategory_ID, IsSOTrx, IsBPTaxExempt, shipDate, shipFromC_Location_ID, shipToC_Location_ID, billDate, billFromC_Location_ID, billToC_Location_ID, trxName);
	}

}
