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
package org.moli.moli;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for MOLI_ProductBrand
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_ProductBrand 
{

    /** TableName=MOLI_ProductBrand */
    public static final String Table_Name = "MOLI_ProductBrand";

    /** AD_Table_ID=1000072 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
	  */
	public int getAD_Org_ID();

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

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

    /** Column name MOLI_BrandSymbol */
    public static final String COLUMNNAME_MOLI_BrandSymbol = "MOLI_BrandSymbol";

	/** Set Brand Symbol.
	  * Brand Symbol
	  */
	public void setMOLI_BrandSymbol (String MOLI_BrandSymbol);

	/** Get Brand Symbol.
	  * Brand Symbol
	  */
	public String getMOLI_BrandSymbol();

    /** Column name MOLI_isApproval */
    public static final String COLUMNNAME_MOLI_isApproval = "MOLI_isApproval";

	/** Set Requiere Approval.
	  * Requiere Approval
	  */
	public void setMOLI_isApproval (boolean MOLI_isApproval);

	/** Get Requiere Approval.
	  * Requiere Approval
	  */
	public boolean isMOLI_isApproval();

    /** Column name MOLI_isWHS */
    public static final String COLUMNNAME_MOLI_isWHS = "MOLI_isWHS";

	/** Set Whole Sale.
	  * Whole Sale
	  */
	public void setMOLI_isWHS (boolean MOLI_isWHS);

	/** Get Whole Sale.
	  * Whole Sale
	  */
	public boolean isMOLI_isWHS();

    /** Column name MOLI_ProductBrand_ID */
    public static final String COLUMNNAME_MOLI_ProductBrand_ID = "MOLI_ProductBrand_ID";

	/** Set Product Brand.
	  * Product Brand
	  */
	public void setMOLI_ProductBrand_ID (int MOLI_ProductBrand_ID);

	/** Get Product Brand.
	  * Product Brand
	  */
	public int getMOLI_ProductBrand_ID();

    /** Column name MOLI_ProductBrand_UU */
    public static final String COLUMNNAME_MOLI_ProductBrand_UU = "MOLI_ProductBrand_UU";

	/** Set Product Brand UU	  */
	public void setMOLI_ProductBrand_UU (String MOLI_ProductBrand_UU);

	/** Get Product Brand UU	  */
	public String getMOLI_ProductBrand_UU();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

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
}
