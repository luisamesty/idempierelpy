package org.moli.model;

import org.compiere.model.I_I_Product;

public interface I_I_Product_Moli extends I_I_Product {
	
    /** Column name C_TaxCategory_ID */
    public static final String COLUMNNAME_C_TaxCategory_ID = "C_TaxCategory_ID";

	/** Set Tax Category.
	  * Tax Category
	  */
	public void setC_TaxCategory_ID (int C_TaxCategory_ID);

	/** Get Tax Category.
	  * Tax Category
	  */
	public int getC_TaxCategory_ID();

	public org.compiere.model.I_C_TaxCategory getC_TaxCategory() throws RuntimeException;
	
}
