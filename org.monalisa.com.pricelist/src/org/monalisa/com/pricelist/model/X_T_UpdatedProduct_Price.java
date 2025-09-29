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
package org.monalisa.com.pricelist.model;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for T_UpdatedProduct_Price
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="T_UpdatedProduct_Price")
public class X_T_UpdatedProduct_Price extends PO implements I_T_UpdatedProduct_Price, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250923L;

    /** Standard Constructor */
    public X_T_UpdatedProduct_Price (Properties ctx, int T_UpdatedProduct_Price_ID, String trxName)
    {
      super (ctx, T_UpdatedProduct_Price_ID, trxName);
      /** if (T_UpdatedProduct_Price_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_T_UpdatedProduct_Price (Properties ctx, int T_UpdatedProduct_Price_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, T_UpdatedProduct_Price_ID, trxName, virtualColumns);
      /** if (T_UpdatedProduct_Price_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_T_UpdatedProduct_Price (Properties ctx, String T_UpdatedProduct_Price_UU, String trxName)
    {
      super (ctx, T_UpdatedProduct_Price_UU, trxName);
      /** if (T_UpdatedProduct_Price_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_T_UpdatedProduct_Price (Properties ctx, String T_UpdatedProduct_Price_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, T_UpdatedProduct_Price_UU, trxName, virtualColumns);
      /** if (T_UpdatedProduct_Price_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_T_UpdatedProduct_Price (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_T_UpdatedProduct_Price[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException
	{
		return (org.compiere.model.I_AD_PInstance)MTable.get(getCtx(), org.compiere.model.I_AD_PInstance.Table_ID)
			.getPO(getAD_PInstance_ID(), get_TrxName());
	}

	/** Set Process Instance.
		@param AD_PInstance_ID Instance of the process
	*/
	public void setAD_PInstance_ID (int AD_PInstance_ID)
	{
		if (AD_PInstance_ID < 1)
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_AD_PInstance_ID, Integer.valueOf(AD_PInstance_ID));
	}

	/** Get Process Instance.
		@return Instance of the process
	  */
	public int getAD_PInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_PInstance_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set BrandName.
		@param BrandName BrandName
	*/
	public void setBrandName (String BrandName)
	{
		set_ValueNoCheck (COLUMNNAME_BrandName, BrandName);
	}

	/** Get BrandName.
		@return BrandName	  */
	public String getBrandName()
	{
		return (String)get_Value(COLUMNNAME_BrandName);
	}

	/** Set Category Name.
		@param CategoryName Name of the Category
	*/
	public void setCategoryName (String CategoryName)
	{
		set_ValueNoCheck (COLUMNNAME_CategoryName, CategoryName);
	}

	/** Get Category Name.
		@return Name of the Category
	  */
	public String getCategoryName()
	{
		return (String)get_Value(COLUMNNAME_CategoryName);
	}

	/** Set Date.
		@param Date1 Date when business is not conducted
	*/
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1()
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set LineName.
		@param LineName LineName
	*/
	public void setLineName (String LineName)
	{
		set_ValueNoCheck (COLUMNNAME_LineName, LineName);
	}

	/** Get LineName.
		@return LineName	  */
	public String getLineName()
	{
		return (String)get_Value(COLUMNNAME_LineName);
	}

	public org.compiere.model.I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException
	{
		return (org.compiere.model.I_M_PriceList_Version)MTable.get(getCtx(), org.compiere.model.I_M_PriceList_Version.Table_ID)
			.getPO(getM_PriceList_Version_ID(), get_TrxName());
	}

	/** Set Price List Version.
		@param M_PriceList_Version_ID Identifies a unique instance of a Price List
	*/
	public void setM_PriceList_Version_ID (int M_PriceList_Version_ID)
	{
		if (M_PriceList_Version_ID < 1)
			set_Value (COLUMNNAME_M_PriceList_Version_ID, null);
		else
			set_Value (COLUMNNAME_M_PriceList_Version_ID, Integer.valueOf(M_PriceList_Version_ID));
	}

	/** Get Price List Version.
		@return Identifies a unique instance of a Price List
	  */
	public int getM_PriceList_Version_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_PriceList_Version_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Old Limit Price.
		@param OldPriceLimit Old Lowest price for a product
	*/
	public void setOldPriceLimit (BigDecimal OldPriceLimit)
	{
		set_Value (COLUMNNAME_OldPriceLimit, OldPriceLimit);
	}

	/** Get Old Limit Price.
		@return Old Lowest price for a product
	  */
	public BigDecimal getOldPriceLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OldPriceLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Old List Price.
		@param OldPriceList Old List Price
	*/
	public void setOldPriceList (BigDecimal OldPriceList)
	{
		set_Value (COLUMNNAME_OldPriceList, OldPriceList);
	}

	/** Get Old List Price.
		@return Old List Price
	  */
	public BigDecimal getOldPriceList()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OldPriceList);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Old Standard Price.
		@param OldPriceStd Old Standard Price
	*/
	public void setOldPriceStd (BigDecimal OldPriceStd)
	{
		set_Value (COLUMNNAME_OldPriceStd, OldPriceStd);
	}

	/** Get Old Standard Price.
		@return Old Standard Price
	  */
	public BigDecimal getOldPriceStd()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_OldPriceStd);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Limit Price.
		@param PriceLimit Lowest price for a product
	*/
	public void setPriceLimit (BigDecimal PriceLimit)
	{
		set_Value (COLUMNNAME_PriceLimit, PriceLimit);
	}

	/** Get Limit Price.
		@return Lowest price for a product
	  */
	public BigDecimal getPriceLimit()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceLimit);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set List Price.
		@param PriceList List Price
	*/
	public void setPriceList (BigDecimal PriceList)
	{
		set_Value (COLUMNNAME_PriceList, PriceList);
	}

	/** Get List Price.
		@return List Price
	  */
	public BigDecimal getPriceList()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceList);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Standard Price.
		@param PriceStd Standard Price
	*/
	public void setPriceStd (BigDecimal PriceStd)
	{
		set_Value (COLUMNNAME_PriceStd, PriceStd);
	}

	/** Get Standard Price.
		@return Standard Price
	  */
	public BigDecimal getPriceStd()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PriceStd);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Product Name.
		@param ProductName Name of the Product
	*/
	public void setProductName (String ProductName)
	{
		set_ValueNoCheck (COLUMNNAME_ProductName, ProductName);
	}

	/** Get Product Name.
		@return Name of the Product
	  */
	public String getProductName()
	{
		return (String)get_Value(COLUMNNAME_ProductName);
	}

	/** Set SKU.
		@param SKU Stock Keeping Unit
	*/
	public void setSKU (String SKU)
	{
		set_ValueNoCheck (COLUMNNAME_SKU, SKU);
	}

	/** Get SKU.
		@return Stock Keeping Unit
	  */
	public String getSKU()
	{
		return (String)get_Value(COLUMNNAME_SKU);
	}

	/** Set Updated Product Price ID.
		@param T_UpdatedProduct_Price_ID Updated Product Price ID
	*/
	public void setT_UpdatedProduct_Price_ID (int T_UpdatedProduct_Price_ID)
	{
		if (T_UpdatedProduct_Price_ID < 1)
			set_ValueNoCheck (COLUMNNAME_T_UpdatedProduct_Price_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_T_UpdatedProduct_Price_ID, Integer.valueOf(T_UpdatedProduct_Price_ID));
	}

	/** Get Updated Product Price ID.
		@return Updated Product Price ID	  */
	public int getT_UpdatedProduct_Price_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_T_UpdatedProduct_Price_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Updated Product Price UU.
		@param T_UpdatedProduct_Price_UU Updated Product Price UU
	*/
	public void setT_UpdatedProduct_Price_UU (String T_UpdatedProduct_Price_UU)
	{
		set_ValueNoCheck (COLUMNNAME_T_UpdatedProduct_Price_UU, T_UpdatedProduct_Price_UU);
	}

	/** Get Updated Product Price UU.
		@return Updated Product Price UU	  */
	public String getT_UpdatedProduct_Price_UU()
	{
		return (String)get_Value(COLUMNNAME_T_UpdatedProduct_Price_UU);
	}

	/** Set UPC/EAN.
		@param UPC Bar Code (Universal Product Code or its superset European Article Number)
	*/
	public void setUPC (String UPC)
	{
		set_ValueNoCheck (COLUMNNAME_UPC, UPC);
	}

	/** Get UPC/EAN.
		@return Bar Code (Universal Product Code or its superset European Article Number)
	  */
	public String getUPC()
	{
		return (String)get_Value(COLUMNNAME_UPC);
	}

	/** Set Price List Version Name.
		@param VersionName Price List Version Name
	*/
	public void setVersionName (String VersionName)
	{
		set_Value (COLUMNNAME_VersionName, VersionName);
	}

	/** Get Price List Version Name.
		@return Price List Version Name	  */
	public String getVersionName()
	{
		return (String)get_Value(COLUMNNAME_VersionName);
	}
}