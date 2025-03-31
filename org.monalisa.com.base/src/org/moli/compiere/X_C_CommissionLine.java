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
package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;
import org.compiere.util.KeyNamePair;
import org.moli.moli.I_MOLI_HS;
import org.moli.moli.I_MOLI_ProductBrand;
import org.moli.moli.I_MOLI_ProductLine;

/** Generated Model for C_CommissionLine
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="C_CommissionLine")
public class X_C_CommissionLine extends PO implements I_C_CommissionLine, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250217L;

    /** Standard Constructor */
    public X_C_CommissionLine (Properties ctx, int C_CommissionLine_ID, String trxName)
    {
      super (ctx, C_CommissionLine_ID, trxName);
      /** if (C_CommissionLine_ID == 0)
        {
			setAmtMultiplier (Env.ZERO);
			setAmtSubtract (Env.ZERO);
			setC_Commission_ID (0);
			setC_CommissionLine_ID (0);
			setCommissionOrders (false);
			setIsPositiveOnly (false);
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
			setMOLI_CommGoal (Env.ZERO);
// 0
			setMOLI_CommGoalBase (Env.ZERO);
// 0
			setMOLI_CommGoalBaseMultiplier (Env.ZERO);
// 0
			setMOLI_CommGoalMiltiplier (Env.ZERO);
// 0
			setQtyMultiplier (Env.ZERO);
			setQtySubtract (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionLine (Properties ctx, int C_CommissionLine_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CommissionLine_ID, trxName, virtualColumns);
      /** if (C_CommissionLine_ID == 0)
        {
			setAmtMultiplier (Env.ZERO);
			setAmtSubtract (Env.ZERO);
			setC_Commission_ID (0);
			setC_CommissionLine_ID (0);
			setCommissionOrders (false);
			setIsPositiveOnly (false);
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
			setMOLI_CommGoal (Env.ZERO);
// 0
			setMOLI_CommGoalBase (Env.ZERO);
// 0
			setMOLI_CommGoalBaseMultiplier (Env.ZERO);
// 0
			setMOLI_CommGoalMiltiplier (Env.ZERO);
// 0
			setQtyMultiplier (Env.ZERO);
			setQtySubtract (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionLine (Properties ctx, String C_CommissionLine_UU, String trxName)
    {
      super (ctx, C_CommissionLine_UU, trxName);
      /** if (C_CommissionLine_UU == null)
        {
			setAmtMultiplier (Env.ZERO);
			setAmtSubtract (Env.ZERO);
			setC_Commission_ID (0);
			setC_CommissionLine_ID (0);
			setCommissionOrders (false);
			setIsPositiveOnly (false);
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
			setMOLI_CommGoal (Env.ZERO);
// 0
			setMOLI_CommGoalBase (Env.ZERO);
// 0
			setMOLI_CommGoalBaseMultiplier (Env.ZERO);
// 0
			setMOLI_CommGoalMiltiplier (Env.ZERO);
// 0
			setQtyMultiplier (Env.ZERO);
			setQtySubtract (Env.ZERO);
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionLine (Properties ctx, String C_CommissionLine_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CommissionLine_UU, trxName, virtualColumns);
      /** if (C_CommissionLine_UU == null)
        {
			setAmtMultiplier (Env.ZERO);
			setAmtSubtract (Env.ZERO);
			setC_Commission_ID (0);
			setC_CommissionLine_ID (0);
			setCommissionOrders (false);
			setIsPositiveOnly (false);
			setLine (0);
// @SQL=SELECT NVL(MAX(Line),0)+10 AS DefaultValue FROM C_CommissionLine WHERE C_Commission_ID=@C_Commission_ID@
			setMOLI_CommGoal (Env.ZERO);
// 0
			setMOLI_CommGoalBase (Env.ZERO);
// 0
			setMOLI_CommGoalBaseMultiplier (Env.ZERO);
// 0
			setMOLI_CommGoalMiltiplier (Env.ZERO);
// 0
			setQtyMultiplier (Env.ZERO);
			setQtySubtract (Env.ZERO);
        } */
    }

    /** Load Constructor */
    public X_C_CommissionLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_C_CommissionLine[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	/** Set Multiplier Amount.
		@param AmtMultiplier Multiplier Amount for generating commissions
	*/
	public void setAmtMultiplier (BigDecimal AmtMultiplier)
	{
		set_Value (COLUMNNAME_AmtMultiplier, AmtMultiplier);
	}

	/** Get Multiplier Amount.
		@return Multiplier Amount for generating commissions
	  */
	public BigDecimal getAmtMultiplier()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtMultiplier);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Subtract Amount.
		@param AmtSubtract Subtract Amount for generating commissions
	*/
	public void setAmtSubtract (BigDecimal AmtSubtract)
	{
		set_Value (COLUMNNAME_AmtSubtract, AmtSubtract);
	}

	/** Get Subtract Amount.
		@return Subtract Amount for generating commissions
	  */
	public BigDecimal getAmtSubtract()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_AmtSubtract);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());
	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner
	*/
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1)
			set_Value (COLUMNNAME_C_BPartner_Location_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BP_Group getC_BP_Group() throws RuntimeException
	{
		return (org.compiere.model.I_C_BP_Group)MTable.get(getCtx(), org.compiere.model.I_C_BP_Group.Table_ID)
			.getPO(getC_BP_Group_ID(), get_TrxName());
	}

	/** Set Business Partner Group.
		@param C_BP_Group_ID Business Partner Group
	*/
	public void setC_BP_Group_ID (int C_BP_Group_ID)
	{
		if (C_BP_Group_ID < 1)
			set_Value (COLUMNNAME_C_BP_Group_ID, null);
		else
			set_Value (COLUMNNAME_C_BP_Group_ID, Integer.valueOf(C_BP_Group_ID));
	}

	/** Get Business Partner Group.
		@return Business Partner Group
	  */
	public int getC_BP_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BP_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_Commission getC_Commission() throws RuntimeException
	{
		return (org.compiere.model.I_C_Commission)MTable.get(getCtx(), org.compiere.model.I_C_Commission.Table_ID)
			.getPO(getC_Commission_ID(), get_TrxName());
	}

	/** Set Commission.
		@param C_Commission_ID Commission
	*/
	public void setC_Commission_ID (int C_Commission_ID)
	{
		if (C_Commission_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Commission_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Commission_ID, Integer.valueOf(C_Commission_ID));
	}

	/** Get Commission.
		@return Commission
	  */
	public int getC_Commission_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Commission_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), String.valueOf(getC_Commission_ID()));
    }

	/** Set Commission Line.
		@param C_CommissionLine_ID Commission Line
	*/
	public void setC_CommissionLine_ID (int C_CommissionLine_ID)
	{
		if (C_CommissionLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_CommissionLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_CommissionLine_ID, Integer.valueOf(C_CommissionLine_ID));
	}

	/** Get Commission Line.
		@return Commission Line
	  */
	public int getC_CommissionLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_CommissionLine_UU.
		@param C_CommissionLine_UU C_CommissionLine_UU
	*/
	public void setC_CommissionLine_UU (String C_CommissionLine_UU)
	{
		set_Value (COLUMNNAME_C_CommissionLine_UU, C_CommissionLine_UU);
	}

	/** Get C_CommissionLine_UU.
		@return C_CommissionLine_UU	  */
	public String getC_CommissionLine_UU()
	{
		return (String)get_Value(COLUMNNAME_C_CommissionLine_UU);
	}

	/** Set Commission only specified Orders.
		@param CommissionOrders Commission only Orders or Invoices, where this Sales Rep is entered
	*/
	public void setCommissionOrders (boolean CommissionOrders)
	{
		set_Value (COLUMNNAME_CommissionOrders, Boolean.valueOf(CommissionOrders));
	}

	/** Get Commission only specified Orders.
		@return Commission only Orders or Invoices, where this Sales Rep is entered
	  */
	public boolean isCommissionOrders()
	{
		Object oo = get_Value(COLUMNNAME_CommissionOrders);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public org.compiere.model.I_C_SalesRegion getC_SalesRegion() throws RuntimeException
	{
		return (org.compiere.model.I_C_SalesRegion)MTable.get(getCtx(), org.compiere.model.I_C_SalesRegion.Table_ID)
			.getPO(getC_SalesRegion_ID(), get_TrxName());
	}

	/** Set Sales Region.
		@param C_SalesRegion_ID Sales coverage region
	*/
	public void setC_SalesRegion_ID (int C_SalesRegion_ID)
	{
		if (C_SalesRegion_ID < 1)
			set_Value (COLUMNNAME_C_SalesRegion_ID, null);
		else
			set_Value (COLUMNNAME_C_SalesRegion_ID, Integer.valueOf(C_SalesRegion_ID));
	}

	/** Get Sales Region.
		@return Sales coverage region
	  */
	public int getC_SalesRegion_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_SalesRegion_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Description.
		@param Description Optional short description of the record
	*/
	public void setDescription (String Description)
	{
		set_Value (COLUMNNAME_Description, Description);
	}

	/** Get Description.
		@return Optional short description of the record
	  */
	public String getDescription()
	{
		return (String)get_Value(COLUMNNAME_Description);
	}

	/** Set Positive only.
		@param IsPositiveOnly Do not generate negative commissions
	*/
	public void setIsPositiveOnly (boolean IsPositiveOnly)
	{
		set_Value (COLUMNNAME_IsPositiveOnly, Boolean.valueOf(IsPositiveOnly));
	}

	/** Get Positive only.
		@return Do not generate negative commissions
	  */
	public boolean isPositiveOnly()
	{
		Object oo = get_Value(COLUMNNAME_IsPositiveOnly);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Line No.
		@param Line Unique line for this document
	*/
	public void setLine (int Line)
	{
		set_Value (COLUMNNAME_Line, Integer.valueOf(Line));
	}

	/** Get Line No.
		@return Unique line for this document
	  */
	public int getLine()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Line);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BP_Group getMOLI_C_BP_Group() throws RuntimeException
	{
		return (org.compiere.model.I_C_BP_Group)MTable.get(getCtx(), org.compiere.model.I_C_BP_Group.Table_ID)
			.getPO(getMOLI_C_BP_Group_ID(), get_TrxName());
	}

	/** Set C_BP_Group(ID).
		@param MOLI_C_BP_Group_ID C_BP_Group(ID)
	*/
	public void setMOLI_C_BP_Group_ID (int MOLI_C_BP_Group_ID)
	{
		if (MOLI_C_BP_Group_ID < 1)
			set_Value (COLUMNNAME_MOLI_C_BP_Group_ID, null);
		else
			set_Value (COLUMNNAME_MOLI_C_BP_Group_ID, Integer.valueOf(MOLI_C_BP_Group_ID));
	}

	/** Get C_BP_Group(ID).
		@return C_BP_Group(ID)	  */
	public int getMOLI_C_BP_Group_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_C_BP_Group_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comm Goal.
		@param MOLI_CommGoal Comm Goal
	*/
	public void setMOLI_CommGoal (BigDecimal MOLI_CommGoal)
	{
		set_Value (COLUMNNAME_MOLI_CommGoal, MOLI_CommGoal);
	}

	/** Get Comm Goal.
		@return Comm Goal
	  */
	public BigDecimal getMOLI_CommGoal()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CommGoal);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Comm Goal Base.
		@param MOLI_CommGoalBase Comm Goal Base
	*/
	public void setMOLI_CommGoalBase (BigDecimal MOLI_CommGoalBase)
	{
		set_Value (COLUMNNAME_MOLI_CommGoalBase, MOLI_CommGoalBase);
	}

	/** Get Comm Goal Base.
		@return Comm Goal Base
	  */
	public BigDecimal getMOLI_CommGoalBase()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CommGoalBase);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Comm Goal Base Multiplier.
		@param MOLI_CommGoalBaseMultiplier Comm Goal Base Multiplier
	*/
	public void setMOLI_CommGoalBaseMultiplier (BigDecimal MOLI_CommGoalBaseMultiplier)
	{
		set_Value (COLUMNNAME_MOLI_CommGoalBaseMultiplier, MOLI_CommGoalBaseMultiplier);
	}

	/** Get Comm Goal Base Multiplier.
		@return Comm Goal Base Multiplier
	  */
	public BigDecimal getMOLI_CommGoalBaseMultiplier()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CommGoalBaseMultiplier);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Comm Goal Miltiplier.
		@param MOLI_CommGoalMiltiplier Comm Goal Miltiplier
	*/
	public void setMOLI_CommGoalMiltiplier (BigDecimal MOLI_CommGoalMiltiplier)
	{
		set_Value (COLUMNNAME_MOLI_CommGoalMiltiplier, MOLI_CommGoalMiltiplier);
	}

	/** Get Comm Goal Miltiplier.
		@return Comm Goal Miltiplier
	  */
	public BigDecimal getMOLI_CommGoalMiltiplier()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CommGoalMiltiplier);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public I_MOLI_HS getMOLI_HS() throws RuntimeException
	{
		return (I_MOLI_HS)MTable.get(getCtx(), I_MOLI_HS.Table_ID)
			.getPO(getMOLI_HS_ID(), get_TrxName());
	}

	/** Set Harmonized System.
		@param MOLI_HS_ID Harmonized Commodity Description and Coding System (HS Convention) 
	*/
	public void setMOLI_HS_ID (int MOLI_HS_ID)
	{
		if (MOLI_HS_ID < 1)
			set_Value (COLUMNNAME_MOLI_HS_ID, null);
		else
			set_Value (COLUMNNAME_MOLI_HS_ID, Integer.valueOf(MOLI_HS_ID));
	}

	/** Get Harmonized System.
		@return Harmonized Commodity Description and Coding System (HS Convention) 
	  */
	public int getMOLI_HS_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_HS_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** MOLI_IsLocalVendor AD_Reference_ID=319 */
	public static final int MOLI_ISLOCALVENDOR_AD_Reference_ID=319;
	/** No = N */
	public static final String MOLI_ISLOCALVENDOR_No = "N";
	/** Yes = Y */
	public static final String MOLI_ISLOCALVENDOR_Yes = "Y";
	/** Set Local Vendor.
		@param MOLI_IsLocalVendor Local Vendor
	*/
	public void setMOLI_IsLocalVendor (String MOLI_IsLocalVendor)
	{

		set_Value (COLUMNNAME_MOLI_IsLocalVendor, MOLI_IsLocalVendor);
	}

	/** Get Local Vendor.
		@return Local Vendor	  */
	public String getMOLI_IsLocalVendor()
	{
		return (String)get_Value(COLUMNNAME_MOLI_IsLocalVendor);
	}

	public I_MOLI_ProductBrand getMOLI_ProductBrand() throws RuntimeException
	{
		return (I_MOLI_ProductBrand)MTable.get(getCtx(), I_MOLI_ProductBrand.Table_ID)
			.getPO(getMOLI_ProductBrand_ID(), get_TrxName());
	}

	/** Set Product Brand.
		@param MOLI_ProductBrand_ID Product Brand
	*/
	public void setMOLI_ProductBrand_ID (int MOLI_ProductBrand_ID)
	{
		if (MOLI_ProductBrand_ID < 1)
			set_Value (COLUMNNAME_MOLI_ProductBrand_ID, null);
		else
			set_Value (COLUMNNAME_MOLI_ProductBrand_ID, Integer.valueOf(MOLI_ProductBrand_ID));
	}

	/** Get Product Brand.
		@return Product Brand
	  */
	public int getMOLI_ProductBrand_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_ProductBrand_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_MOLI_ProductLine getMOLI_ProductLine() throws RuntimeException
	{
		return (I_MOLI_ProductLine)MTable.get(getCtx(), I_MOLI_ProductLine.Table_ID)
			.getPO(getMOLI_ProductLine_ID(), get_TrxName());
	}

	/** Set Product Line.
		@param MOLI_ProductLine_ID Product Line
	*/
	public void setMOLI_ProductLine_ID (int MOLI_ProductLine_ID)
	{
		if (MOLI_ProductLine_ID < 1)
			set_Value (COLUMNNAME_MOLI_ProductLine_ID, null);
		else
			set_Value (COLUMNNAME_MOLI_ProductLine_ID, Integer.valueOf(MOLI_ProductLine_ID));
	}

	/** Get Product Line.
		@return Product Line
	  */
	public int getMOLI_ProductLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_ProductLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_M_Product_Category getM_Product_Category() throws RuntimeException
	{
		return (org.compiere.model.I_M_Product_Category)MTable.get(getCtx(), org.compiere.model.I_M_Product_Category.Table_ID)
			.getPO(getM_Product_Category_ID(), get_TrxName());
	}

	/** Set Product Category.
		@param M_Product_Category_ID Category of a Product
	*/
	public void setM_Product_Category_ID (int M_Product_Category_ID)
	{
		if (M_Product_Category_ID < 1)
			set_Value (COLUMNNAME_M_Product_Category_ID, null);
		else
			set_Value (COLUMNNAME_M_Product_Category_ID, Integer.valueOf(M_Product_Category_ID));
	}

	/** Get Product Category.
		@return Category of a Product
	  */
	public int getM_Product_Category_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Product_Category_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Organization.
		@param Org_ID Organizational entity within tenant
	*/
	public void setOrg_ID (int Org_ID)
	{
		if (Org_ID < 1)
			set_Value (COLUMNNAME_Org_ID, null);
		else
			set_Value (COLUMNNAME_Org_ID, Integer.valueOf(Org_ID));
	}

	/** Get Organization.
		@return Organizational entity within tenant
	  */
	public int getOrg_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Org_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** PaymentRule AD_Reference_ID=195 */
	public static final int PAYMENTRULE_AD_Reference_ID=195;
	/** Cash = B */
	public static final String PAYMENTRULE_Cash = "B";
	/** Direct Debit = D */
	public static final String PAYMENTRULE_DirectDebit = "D";
	/** Credit Card = K */
	public static final String PAYMENTRULE_CreditCard = "K";
	/** Mixed POS Payment = M */
	public static final String PAYMENTRULE_MixedPOSPayment = "M";
	/** On Credit = P */
	public static final String PAYMENTRULE_OnCredit = "P";
	/** Check = S */
	public static final String PAYMENTRULE_Check = "S";
	/** Direct Deposit = T */
	public static final String PAYMENTRULE_DirectDeposit = "T";
	/** Set Payment Rule.
		@param PaymentRule How you pay the invoice
	*/
	public void setPaymentRule (String PaymentRule)
	{

		set_Value (COLUMNNAME_PaymentRule, PaymentRule);
	}

	/** Get Payment Rule.
		@return How you pay the invoice
	  */
	public String getPaymentRule()
	{
		return (String)get_Value(COLUMNNAME_PaymentRule);
	}

	/** Set Multiplier Quantity.
		@param QtyMultiplier Value to multiply quantities by for generating commissions.
	*/
	public void setQtyMultiplier (BigDecimal QtyMultiplier)
	{
		set_Value (COLUMNNAME_QtyMultiplier, QtyMultiplier);
	}

	/** Get Multiplier Quantity.
		@return Value to multiply quantities by for generating commissions.
	  */
	public BigDecimal getQtyMultiplier()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtyMultiplier);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Subtract Quantity.
		@param QtySubtract Quantity to subtract when generating commissions
	*/
	public void setQtySubtract (BigDecimal QtySubtract)
	{
		set_Value (COLUMNNAME_QtySubtract, QtySubtract);
	}

	/** Get Subtract Quantity.
		@return Quantity to subtract when generating commissions
	  */
	public BigDecimal getQtySubtract()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_QtySubtract);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Valid from.
		@param ValidFrom Valid from including this date (first day)
	*/
	public void setValidFrom (Timestamp ValidFrom)
	{
		set_Value (COLUMNNAME_ValidFrom, ValidFrom);
	}

	/** Get Valid from.
		@return Valid from including this date (first day)
	  */
	public Timestamp getValidFrom()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidFrom);
	}

	/** Set Valid to.
		@param ValidTo Valid to including this date (last day)
	*/
	public void setValidTo (Timestamp ValidTo)
	{
		set_Value (COLUMNNAME_ValidTo, ValidTo);
	}

	/** Get Valid to.
		@return Valid to including this date (last day)
	  */
	public Timestamp getValidTo()
	{
		return (Timestamp)get_Value(COLUMNNAME_ValidTo);
	}
}