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
package org.monalisa.com.pricelist.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for T_UpdatedProduct_Price
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_T_UpdatedProduct_Price 
{

    /** TableName=T_UpdatedProduct_Price */
    public static final String Table_Name = "T_UpdatedProduct_Price";

    /** AD_Table_ID=1000125 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name AD_PInstance_ID */
    public static final String COLUMNNAME_AD_PInstance_ID = "AD_PInstance_ID";

	/** Set Process Instance.
	  * Instance of the process
	  */
	public void setAD_PInstance_ID (int AD_PInstance_ID);

	/** Get Process Instance.
	  * Instance of the process
	  */
	public int getAD_PInstance_ID();

	public org.compiere.model.I_AD_PInstance getAD_PInstance() throws RuntimeException;

    /** Column name BrandName */
    public static final String COLUMNNAME_BrandName = "BrandName";

	/** Set BrandName	  */
	public void setBrandName (String BrandName);

	/** Get BrandName	  */
	public String getBrandName();

    /** Column name CategoryName */
    public static final String COLUMNNAME_CategoryName = "CategoryName";

	/** Set Category Name.
	  * Name of the Category
	  */
	public void setCategoryName (String CategoryName);

	/** Get Category Name.
	  * Name of the Category
	  */
	public String getCategoryName();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Date1 */
    public static final String COLUMNNAME_Date1 = "Date1";

	/** Set Date.
	  * Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1);

	/** Get Date.
	  * Date when business is not conducted
	  */
	public Timestamp getDate1();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name LineName */
    public static final String COLUMNNAME_LineName = "LineName";

	/** Set LineName	  */
	public void setLineName (String LineName);

	/** Get LineName	  */
	public String getLineName();

    /** Column name M_PriceList_Version_ID */
    public static final String COLUMNNAME_M_PriceList_Version_ID = "M_PriceList_Version_ID";

	/** Set Price List Version.
	  * Identifies a unique instance of a Price List
	  */
	public void setM_PriceList_Version_ID (int M_PriceList_Version_ID);

	/** Get Price List Version.
	  * Identifies a unique instance of a Price List
	  */
	public int getM_PriceList_Version_ID();

	public org.compiere.model.I_M_PriceList_Version getM_PriceList_Version() throws RuntimeException;

    /** Column name OldPriceLimit */
    public static final String COLUMNNAME_OldPriceLimit = "OldPriceLimit";

	/** Set Old Limit Price.
	  * Old Lowest price for a product
	  */
	public void setOldPriceLimit (BigDecimal OldPriceLimit);

	/** Get Old Limit Price.
	  * Old Lowest price for a product
	  */
	public BigDecimal getOldPriceLimit();

    /** Column name OldPriceList */
    public static final String COLUMNNAME_OldPriceList = "OldPriceList";

	/** Set Old List Price.
	  * Old List Price
	  */
	public void setOldPriceList (BigDecimal OldPriceList);

	/** Get Old List Price.
	  * Old List Price
	  */
	public BigDecimal getOldPriceList();

    /** Column name OldPriceStd */
    public static final String COLUMNNAME_OldPriceStd = "OldPriceStd";

	/** Set Old Standard Price.
	  * Old Standard Price
	  */
	public void setOldPriceStd (BigDecimal OldPriceStd);

	/** Get Old Standard Price.
	  * Old Standard Price
	  */
	public BigDecimal getOldPriceStd();

    /** Column name PriceLimit */
    public static final String COLUMNNAME_PriceLimit = "PriceLimit";

	/** Set Limit Price.
	  * Lowest price for a product
	  */
	public void setPriceLimit (BigDecimal PriceLimit);

	/** Get Limit Price.
	  * Lowest price for a product
	  */
	public BigDecimal getPriceLimit();

    /** Column name PriceList */
    public static final String COLUMNNAME_PriceList = "PriceList";

	/** Set List Price.
	  * List Price
	  */
	public void setPriceList (BigDecimal PriceList);

	/** Get List Price.
	  * List Price
	  */
	public BigDecimal getPriceList();

    /** Column name PriceStd */
    public static final String COLUMNNAME_PriceStd = "PriceStd";

	/** Set Standard Price.
	  * Standard Price
	  */
	public void setPriceStd (BigDecimal PriceStd);

	/** Get Standard Price.
	  * Standard Price
	  */
	public BigDecimal getPriceStd();

    /** Column name ProductName */
    public static final String COLUMNNAME_ProductName = "ProductName";

	/** Set Product Name.
	  * Name of the Product
	  */
	public void setProductName (String ProductName);

	/** Get Product Name.
	  * Name of the Product
	  */
	public String getProductName();

    /** Column name SKU */
    public static final String COLUMNNAME_SKU = "SKU";

	/** Set SKU.
	  * Stock Keeping Unit
	  */
	public void setSKU (String SKU);

	/** Get SKU.
	  * Stock Keeping Unit
	  */
	public String getSKU();

    /** Column name T_UpdatedProduct_Price_ID */
    public static final String COLUMNNAME_T_UpdatedProduct_Price_ID = "T_UpdatedProduct_Price_ID";

	/** Set Updated Product Price ID	  */
	public void setT_UpdatedProduct_Price_ID (int T_UpdatedProduct_Price_ID);

	/** Get Updated Product Price ID	  */
	public int getT_UpdatedProduct_Price_ID();

    /** Column name T_UpdatedProduct_Price_UU */
    public static final String COLUMNNAME_T_UpdatedProduct_Price_UU = "T_UpdatedProduct_Price_UU";

	/** Set Updated Product Price UU	  */
	public void setT_UpdatedProduct_Price_UU (String T_UpdatedProduct_Price_UU);

	/** Get Updated Product Price UU	  */
	public String getT_UpdatedProduct_Price_UU();

    /** Column name UPC */
    public static final String COLUMNNAME_UPC = "UPC";

	/** Set UPC/EAN.
	  * Bar Code (Universal Product Code or its superset European Article Number)
	  */
	public void setUPC (String UPC);

	/** Get UPC/EAN.
	  * Bar Code (Universal Product Code or its superset European Article Number)
	  */
	public String getUPC();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();

    /** Column name VersionName */
    public static final String COLUMNNAME_VersionName = "VersionName";

	/** Set Price List Version Name	  */
	public void setVersionName (String VersionName);

	/** Get Price List Version Name	  */
	public String getVersionName();
}
