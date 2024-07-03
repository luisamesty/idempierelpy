package org.monalisa.com.mm.model;

import java.sql.ResultSet;
import java.util.Properties;

import org.compiere.model.I_M_Product;
import org.compiere.model.X_M_Product;

public class X_I_Product_Moli extends X_M_Product implements I_M_Product {

	private static final long serialVersionUID = 1L;

	public X_I_Product_Moli(Properties ctx, int I_Product_ID, String trxName) {
		super(ctx, I_Product_ID, trxName);
		// 
	}
	
	public X_I_Product_Moli(Properties ctx, ResultSet rs, String trxName) {
		super(ctx, rs, trxName);
		
	}
	/** Set Tax Category.
	@param C_TaxCategory_ID Tax Category
	*/
	public void setC_TaxCategory_ID (int C_TaxCategory_ID)
	{
		if (C_TaxCategory_ID < 1)
			set_Value (COLUMNNAME_C_TaxCategory_ID, null);
		else
			set_Value (COLUMNNAME_C_TaxCategory_ID, Integer.valueOf(C_TaxCategory_ID));
	}
	
	/** Get Tax Category.
		@return Tax Category
	  */
	public int getC_TaxCategory_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_TaxCategory_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}


	
}
