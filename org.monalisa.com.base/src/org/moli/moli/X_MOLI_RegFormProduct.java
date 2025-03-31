/******************************************************************************
 * Product: iDempiere ERP & CRM Smart Business Solution                       *
 * Copyright (C) 1999-2012 ComPiere, Inc. All Rights Reserved.                *
 * This program is free software, you can redistribute it and/or modify it    *
 * under the terms version 2 of the GNU General Public License as published   *
 * by the Free Software Foundation. This program is distributed in the hope   *
 * that it will be useful, but WITHOUT ANY WARRANTY, without even the implied *
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.           *
 * See the GNU General Public License for more details.                       *
 * You should have received a copy of the GNU General Public License along    *
 * with this program, if not, write to the Free Software Foundation, Inc.,    *
 * 59 Temple Place, Suite 330, Boston, MA 02111-1307 USA.                     *
 * For the text or an alternative of this public license, you may reach us    *
 * ComPiere, Inc., 2620 Augustine Dr. #245, Santa Clara, CA 95054, USA        *
 * or via info@compiere.org or http://www.compiere.org/license.html           *
 *****************************************************************************/
/** Generated Model - DO NOT CHANGE */
package org.moli.moli;

import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for MOLI_RegFormProduct
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_RegFormProduct")
public class X_MOLI_RegFormProduct extends PO implements I_MOLI_RegFormProduct, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_RegFormProduct (Properties ctx, int MOLI_RegFormProduct_ID, String trxName)
    {
      super (ctx, MOLI_RegFormProduct_ID, trxName);
      /** if (MOLI_RegFormProduct_ID == 0)
        {
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormProduct (Properties ctx, int MOLI_RegFormProduct_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegFormProduct_ID, trxName, virtualColumns);
      /** if (MOLI_RegFormProduct_ID == 0)
        {
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormProduct (Properties ctx, String MOLI_RegFormProduct_UU, String trxName)
    {
      super (ctx, MOLI_RegFormProduct_UU, trxName);
      /** if (MOLI_RegFormProduct_UU == null)
        {
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormProduct_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormProduct (Properties ctx, String MOLI_RegFormProduct_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegFormProduct_UU, trxName, virtualColumns);
      /** if (MOLI_RegFormProduct_UU == null)
        {
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormProduct_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_RegFormProduct (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 3 - Client - Org
      */
    protected int get_AccessLevel()
    {
      return accessLevel.intValue();
    }

    /** Load Meta Data */
    protected POInfo initPO (Properties ctx)
    {
      POInfo poi = POInfo.getPOInfo (ctx, Table_ID, get_TrxName());
      return poi;
    }

    public String toString()
    {
      StringBuilder sb = new StringBuilder ("X_MOLI_RegFormProduct[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Category Name.
		@param CategoryName Name of the Category
	*/
	public void setCategoryName (String CategoryName)
	{
		throw new IllegalArgumentException ("CategoryName is virtual column");	}

	/** Get Category Name.
		@return Name of the Category
	  */
	public String getCategoryName()
	{
		return (String)get_Value(COLUMNNAME_CategoryName);
	}

	public I_MOLI_RegForm getMOLI_RegForm() throws RuntimeException
	{
		return (I_MOLI_RegForm)MTable.get(getCtx(), I_MOLI_RegForm.Table_ID)
			.getPO(getMOLI_RegForm_ID(), get_TrxName());
	}

	/** Set Regulation Form ID.
		@param MOLI_RegForm_ID Regulation Form ID
	*/
	public void setMOLI_RegForm_ID (int MOLI_RegForm_ID)
	{
		if (MOLI_RegForm_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_RegForm_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_RegForm_ID, Integer.valueOf(MOLI_RegForm_ID));
	}

	/** Get Regulation Form ID.
		@return Regulation Form ID	  */
	public int getMOLI_RegForm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_RegForm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Regulation Form Product.
		@param MOLI_RegFormProduct_ID Regulation Form Product
	*/
	public void setMOLI_RegFormProduct_ID (int MOLI_RegFormProduct_ID)
	{
		if (MOLI_RegFormProduct_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_RegFormProduct_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_RegFormProduct_ID, Integer.valueOf(MOLI_RegFormProduct_ID));
	}

	/** Get Regulation Form Product.
		@return Regulation Form Product	  */
	public int getMOLI_RegFormProduct_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_RegFormProduct_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_RegFormProduct_UU.
		@param MOLI_RegFormProduct_UU MOLI_RegFormProduct_UU
	*/
	public void setMOLI_RegFormProduct_UU (String MOLI_RegFormProduct_UU)
	{
		set_Value (COLUMNNAME_MOLI_RegFormProduct_UU, MOLI_RegFormProduct_UU);
	}

	/** Get MOLI_RegFormProduct_UU.
		@return MOLI_RegFormProduct_UU	  */
	public String getMOLI_RegFormProduct_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegFormProduct_UU);
	}

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product)MTable.get(getCtx(), org.compiere.model.I_M_Product.Table_ID)
			.getPO(getM_Product_ID(), get_TrxName());
	}

	/** Set Product.
		@param M_Product_ID Product, Service, Item
	*/
	public void setM_Product_ID (int M_Product_ID)
	{
		if (M_Product_ID < 1)
			set_Value (COLUMNNAME_M_Product_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_ID, Integer.valueOf(M_Product_ID));
	}

	/** Get Product.
		@return Product, Service, Item
	  */
	public int getM_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Name 2.
		@param Name2 Additional Name
	*/
	public void setName2 (String Name2)
	{
		set_ValueNoCheck (COLUMNNAME_Name2, Name2);
	}

	/** Get Name 2.
		@return Additional Name
	  */
	public String getName2()
	{
		return (String)get_Value(COLUMNNAME_Name2);
	}

	/** Set ProductBrand  Key.
		@param ProductBrand_Value ProductBrand Value for search
	*/
	public void setProductBrand_Value (String ProductBrand_Value)
	{
		set_ValueNoCheck (COLUMNNAME_ProductBrand_Value, ProductBrand_Value);
	}

	/** Get ProductBrand  Key.
		@return ProductBrand Value for search
	  */
	public String getProductBrand_Value()
	{
		return (String)get_Value(COLUMNNAME_ProductBrand_Value);
	}

	/** Set SKU.
		@param SKU Stock Keeping Unit
	*/
	public void setSKU (String SKU)
	{
		throw new IllegalArgumentException ("SKU is virtual column");	}

	/** Get SKU.
		@return Stock Keeping Unit
	  */
	public String getSKU()
	{
		return (String)get_Value(COLUMNNAME_SKU);
	}
}