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
package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;
import org.moli.moli.I_MOLI_HS;
import org.moli.moli.I_MOLI_ProductBrand;
import org.moli.moli.I_MOLI_ProductLine;

/** Generated Interface for C_CommissionLine
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_C_CommissionLine 
{

    /** TableName=C_CommissionLine */
    public static final String Table_Name = "C_CommissionLine";

    /** AD_Table_ID=431 */
    public static final int Table_ID = 431;

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

    /** Column name AmtMultiplier */
    public static final String COLUMNNAME_AmtMultiplier = "AmtMultiplier";

	/** Set Multiplier Amount.
	  * Multiplier Amount for generating commissions
	  */
	public void setAmtMultiplier (BigDecimal AmtMultiplier);

	/** Get Multiplier Amount.
	  * Multiplier Amount for generating commissions
	  */
	public BigDecimal getAmtMultiplier();

    /** Column name AmtSubtract */
    public static final String COLUMNNAME_AmtSubtract = "AmtSubtract";

	/** Set Subtract Amount.
	  * Subtract Amount for generating commissions
	  */
	public void setAmtSubtract (BigDecimal AmtSubtract);

	/** Get Subtract Amount.
	  * Subtract Amount for generating commissions
	  */
	public BigDecimal getAmtSubtract();

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

    /** Column name C_BPartner_Location_ID */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

	/** Set Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID);

	/** Get Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /** Column name C_BP_Group_ID */
    public static final String COLUMNNAME_C_BP_Group_ID = "C_BP_Group_ID";

	/** Set Business Partner Group.
	  * Business Partner Group
	  */
	public void setC_BP_Group_ID (int C_BP_Group_ID);

	/** Get Business Partner Group.
	  * Business Partner Group
	  */
	public int getC_BP_Group_ID();

	public org.compiere.model.I_C_BP_Group getC_BP_Group() throws RuntimeException;

    /** Column name C_Commission_ID */
    public static final String COLUMNNAME_C_Commission_ID = "C_Commission_ID";

	/** Set Commission.
	  * Commission
	  */
	public void setC_Commission_ID (int C_Commission_ID);

	/** Get Commission.
	  * Commission
	  */
	public int getC_Commission_ID();

	public org.compiere.model.I_C_Commission getC_Commission() throws RuntimeException;

    /** Column name C_CommissionLine_ID */
    public static final String COLUMNNAME_C_CommissionLine_ID = "C_CommissionLine_ID";

	/** Set Commission Line.
	  * Commission Line
	  */
	public void setC_CommissionLine_ID (int C_CommissionLine_ID);

	/** Get Commission Line.
	  * Commission Line
	  */
	public int getC_CommissionLine_ID();

    /** Column name C_CommissionLine_UU */
    public static final String COLUMNNAME_C_CommissionLine_UU = "C_CommissionLine_UU";

	/** Set C_CommissionLine_UU	  */
	public void setC_CommissionLine_UU (String C_CommissionLine_UU);

	/** Get C_CommissionLine_UU	  */
	public String getC_CommissionLine_UU();

    /** Column name CommissionOrders */
    public static final String COLUMNNAME_CommissionOrders = "CommissionOrders";

	/** Set Commission only specified Orders.
	  * Commission only Orders or Invoices, where this Sales Rep is entered
	  */
	public void setCommissionOrders (boolean CommissionOrders);

	/** Get Commission only specified Orders.
	  * Commission only Orders or Invoices, where this Sales Rep is entered
	  */
	public boolean isCommissionOrders();

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

    /** Column name C_SalesRegion_ID */
    public static final String COLUMNNAME_C_SalesRegion_ID = "C_SalesRegion_ID";

	/** Set Sales Region.
	  * Sales coverage region
	  */
	public void setC_SalesRegion_ID (int C_SalesRegion_ID);

	/** Get Sales Region.
	  * Sales coverage region
	  */
	public int getC_SalesRegion_ID();

	public org.compiere.model.I_C_SalesRegion getC_SalesRegion() throws RuntimeException;

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

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

    /** Column name IsPositiveOnly */
    public static final String COLUMNNAME_IsPositiveOnly = "IsPositiveOnly";

	/** Set Positive only.
	  * Do not generate negative commissions
	  */
	public void setIsPositiveOnly (boolean IsPositiveOnly);

	/** Get Positive only.
	  * Do not generate negative commissions
	  */
	public boolean isPositiveOnly();

    /** Column name Line */
    public static final String COLUMNNAME_Line = "Line";

	/** Set Line No.
	  * Unique line for this document
	  */
	public void setLine (int Line);

	/** Get Line No.
	  * Unique line for this document
	  */
	public int getLine();

    /** Column name MOLI_C_BP_Group_ID */
    public static final String COLUMNNAME_MOLI_C_BP_Group_ID = "MOLI_C_BP_Group_ID";

	/** Set C_BP_Group(ID)	  */
	public void setMOLI_C_BP_Group_ID (int MOLI_C_BP_Group_ID);

	/** Get C_BP_Group(ID)	  */
	public int getMOLI_C_BP_Group_ID();

	public org.compiere.model.I_C_BP_Group getMOLI_C_BP_Group() throws RuntimeException;

    /** Column name MOLI_CommGoal */
    public static final String COLUMNNAME_MOLI_CommGoal = "MOLI_CommGoal";

	/** Set Comm Goal.
	  * Comm Goal
	  */
	public void setMOLI_CommGoal (BigDecimal MOLI_CommGoal);

	/** Get Comm Goal.
	  * Comm Goal
	  */
	public BigDecimal getMOLI_CommGoal();

    /** Column name MOLI_CommGoalBase */
    public static final String COLUMNNAME_MOLI_CommGoalBase = "MOLI_CommGoalBase";

	/** Set Comm Goal Base.
	  * Comm Goal Base
	  */
	public void setMOLI_CommGoalBase (BigDecimal MOLI_CommGoalBase);

	/** Get Comm Goal Base.
	  * Comm Goal Base
	  */
	public BigDecimal getMOLI_CommGoalBase();

    /** Column name MOLI_CommGoalBaseMultiplier */
    public static final String COLUMNNAME_MOLI_CommGoalBaseMultiplier = "MOLI_CommGoalBaseMultiplier";

	/** Set Comm Goal Base Multiplier.
	  * Comm Goal Base Multiplier
	  */
	public void setMOLI_CommGoalBaseMultiplier (BigDecimal MOLI_CommGoalBaseMultiplier);

	/** Get Comm Goal Base Multiplier.
	  * Comm Goal Base Multiplier
	  */
	public BigDecimal getMOLI_CommGoalBaseMultiplier();

    /** Column name MOLI_CommGoalMiltiplier */
    public static final String COLUMNNAME_MOLI_CommGoalMiltiplier = "MOLI_CommGoalMiltiplier";

	/** Set Comm Goal Miltiplier.
	  * Comm Goal Miltiplier
	  */
	public void setMOLI_CommGoalMiltiplier (BigDecimal MOLI_CommGoalMiltiplier);

	/** Get Comm Goal Miltiplier.
	  * Comm Goal Miltiplier
	  */
	public BigDecimal getMOLI_CommGoalMiltiplier();

    /** Column name MOLI_HS_ID */
    public static final String COLUMNNAME_MOLI_HS_ID = "MOLI_HS_ID";

	/** Set Harmonized System.
	  * Harmonized Commodity Description and Coding System (HS Convention) 
	  */
	public void setMOLI_HS_ID (int MOLI_HS_ID);

	/** Get Harmonized System.
	  * Harmonized Commodity Description and Coding System (HS Convention) 
	  */
	public int getMOLI_HS_ID();

	public I_MOLI_HS getMOLI_HS() throws RuntimeException;

    /** Column name MOLI_IsLocalVendor */
    public static final String COLUMNNAME_MOLI_IsLocalVendor = "MOLI_IsLocalVendor";

	/** Set Local Vendor	  */
	public void setMOLI_IsLocalVendor (String MOLI_IsLocalVendor);

	/** Get Local Vendor	  */
	public String getMOLI_IsLocalVendor();

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

	public I_MOLI_ProductBrand getMOLI_ProductBrand() throws RuntimeException;

    /** Column name MOLI_ProductLine_ID */
    public static final String COLUMNNAME_MOLI_ProductLine_ID = "MOLI_ProductLine_ID";

	/** Set Product Line.
	  * Product Line
	  */
	public void setMOLI_ProductLine_ID (int MOLI_ProductLine_ID);

	/** Get Product Line.
	  * Product Line
	  */
	public int getMOLI_ProductLine_ID();

	public I_MOLI_ProductLine getMOLI_ProductLine() throws RuntimeException;

    /** Column name M_Product_Category_ID */
    public static final String COLUMNNAME_M_Product_Category_ID = "M_Product_Category_ID";

	/** Set Product Category.
	  * Category of a Product
	  */
	public void setM_Product_Category_ID (int M_Product_Category_ID);

	/** Get Product Category.
	  * Category of a Product
	  */
	public int getM_Product_Category_ID();

	public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException;

    /** Column name M_Product_ID */
    public static final String COLUMNNAME_M_Product_ID = "M_Product_ID";

	/** Set Product.
	  * Product, Service, Item
	  */
	public void setM_Product_ID (int M_Product_ID);

	/** Get Product.
	  * Product, Service, Item
	  */
	public int getM_Product_ID();

	public org.compiere.model.I_M_Product getM_Product() throws RuntimeException;

    /** Column name Org_ID */
    public static final String COLUMNNAME_Org_ID = "Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setOrg_ID (int Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getOrg_ID();

    /** Column name PaymentRule */
    public static final String COLUMNNAME_PaymentRule = "PaymentRule";

	/** Set Payment Rule.
	  * How you pay the invoice
	  */
	public void setPaymentRule (String PaymentRule);

	/** Get Payment Rule.
	  * How you pay the invoice
	  */
	public String getPaymentRule();

    /** Column name QtyMultiplier */
    public static final String COLUMNNAME_QtyMultiplier = "QtyMultiplier";

	/** Set Multiplier Quantity.
	  * Value to multiply quantities by for generating commissions.
	  */
	public void setQtyMultiplier (BigDecimal QtyMultiplier);

	/** Get Multiplier Quantity.
	  * Value to multiply quantities by for generating commissions.
	  */
	public BigDecimal getQtyMultiplier();

    /** Column name QtySubtract */
    public static final String COLUMNNAME_QtySubtract = "QtySubtract";

	/** Set Subtract Quantity.
	  * Quantity to subtract when generating commissions
	  */
	public void setQtySubtract (BigDecimal QtySubtract);

	/** Get Subtract Quantity.
	  * Quantity to subtract when generating commissions
	  */
	public BigDecimal getQtySubtract();

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

    /** Column name ValidFrom */
    public static final String COLUMNNAME_ValidFrom = "ValidFrom";

	/** Set Valid from.
	  * Valid from including this date (first day)
	  */
	public void setValidFrom (Timestamp ValidFrom);

	/** Get Valid from.
	  * Valid from including this date (first day)
	  */
	public Timestamp getValidFrom();

    /** Column name ValidTo */
    public static final String COLUMNNAME_ValidTo = "ValidTo";

	/** Set Valid to.
	  * Valid to including this date (last day)
	  */
	public void setValidTo (Timestamp ValidTo);

	/** Get Valid to.
	  * Valid to including this date (last day)
	  */
	public Timestamp getValidTo();
}
