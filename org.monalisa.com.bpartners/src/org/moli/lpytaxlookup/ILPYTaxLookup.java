package org.moli.lpytaxlookup;

import java.sql.Timestamp;
import java.util.Properties;

/**
 * Interface to lookup C_Tax record id (C_Tax_ID)
 * @author hengsin
 */
public interface ILPYTaxLookup {
	
	/**
	 * Find C_Tax_ID by Product/Charge + Warehouse Location + BPartner Location + DeliveryViaRule
	 * @param ctx
	 * @param M_Product_ID
	 * @param C_Charge_ID
	 * @param IstaxExempt,
	 * @param billDate Billing Date
	 * @param shipDate Shipment Date
	 * @param AD_Org_ID
	 * @param M_Warehouse_ID
	 * @param billC_BPartner_Location_ID Bill to location
	 * @param shipC_BPartner_Location_ID Ship to location
	 * @param IsSOTrx
	 * @param deliveryViaRule Order/Invoice's Delivery Via Rule
	 * @param trxName
	 * @return C_Tax_ID
	 */
	public int getLPY (Properties ctx, int M_Product_ID, int C_Charge_ID, String IstaxExempt,
			Timestamp billDate, Timestamp shipDate,
			int AD_Org_ID, int M_Warehouse_ID,
			int billC_BPartner_Location_ID, int shipC_BPartner_Location_ID,
			boolean IsSOTrx, String deliveryViaRule, String trxName);
	
	/**
	 * Find C_Tax_ID
	 * @param ctx
	 * @param C_TaxCategory_ID
	 * @param IsSOTrx
	 * @param IstaxExempt,
	 * @param shipDate Shipment Date
	 * @param shipFromC_Location_ID Shipping from (not use in default lookup implementation)
	 * @param shipToC_Location_ID Shipping to (not use in default lookup implementation)
	 * @param billDate Billing Date
	 * @param billFromC_Location_ID Billing from (Tax Location from)
	 * @param billToC_Location_ID Billing to (Tax Location to)
	 * @param trxName
	 * @return C_Tax_ID
	 */
	public int getLPY (Properties ctx,
			int C_TaxCategory_ID, boolean IsSOTrx,  String IstaxExempt,
			Timestamp shipDate, int shipFromC_Location_ID, int shipToC_Location_ID,
			Timestamp billDate, int billFromC_Location_ID, int billToC_Location_ID, String trxName);
	
}
