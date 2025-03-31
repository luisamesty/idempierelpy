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

/** Generated Model for I_Product
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="I_Product")
public class X_I_Product extends PO implements I_I_Product, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241111L;

    /** Standard Constructor */
    public X_I_Product (Properties ctx, int I_Product_ID, String trxName)
    {
      super (ctx, I_Product_ID, trxName);
      /** if (I_Product_ID == 0)
        {
			setC_TaxCategory_ID (0);
			setI_IsImported (false);
			setI_Product_ID (0);
			setIsAutoProduce (false);
// N
			setIsBOM (false);
// N
			setIsDropShip (false);
// N
			setIsExcludeAutoDelivery (false);
// N
			setIsInvoicePrintDetails (false);
// N
			setIsKanban (false);
// N
			setIsManufactured (false);
// N
			setIsOwnBox (false);
// N
			setIsPhantom (false);
// N
			setIsPickListPrintDetails (false);
// N
			setIsPurchased (false);
// N
			setIsSelfService (false);
// N
			setIsSold (false);
// N
			setIsStocked (true);
// Y
			setIsSummary (false);
// N
			setIsVerified (false);
// N
			setIsWebStoreFeatured (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_I_Product (Properties ctx, int I_Product_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, I_Product_ID, trxName, virtualColumns);
      /** if (I_Product_ID == 0)
        {
			setC_TaxCategory_ID (0);
			setI_IsImported (false);
			setI_Product_ID (0);
			setIsAutoProduce (false);
// N
			setIsBOM (false);
// N
			setIsDropShip (false);
// N
			setIsExcludeAutoDelivery (false);
// N
			setIsInvoicePrintDetails (false);
// N
			setIsKanban (false);
// N
			setIsManufactured (false);
// N
			setIsOwnBox (false);
// N
			setIsPhantom (false);
// N
			setIsPickListPrintDetails (false);
// N
			setIsPurchased (false);
// N
			setIsSelfService (false);
// N
			setIsSold (false);
// N
			setIsStocked (true);
// Y
			setIsSummary (false);
// N
			setIsVerified (false);
// N
			setIsWebStoreFeatured (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_I_Product (Properties ctx, String I_Product_UU, String trxName)
    {
      super (ctx, I_Product_UU, trxName);
      /** if (I_Product_UU == null)
        {
			setC_TaxCategory_ID (0);
			setI_IsImported (false);
			setI_Product_ID (0);
			setIsAutoProduce (false);
// N
			setIsBOM (false);
// N
			setIsDropShip (false);
// N
			setIsExcludeAutoDelivery (false);
// N
			setIsInvoicePrintDetails (false);
// N
			setIsKanban (false);
// N
			setIsManufactured (false);
// N
			setIsOwnBox (false);
// N
			setIsPhantom (false);
// N
			setIsPickListPrintDetails (false);
// N
			setIsPurchased (false);
// N
			setIsSelfService (false);
// N
			setIsSold (false);
// N
			setIsStocked (true);
// Y
			setIsSummary (false);
// N
			setIsVerified (false);
// N
			setIsWebStoreFeatured (false);
// N
        } */
    }

    /** Standard Constructor */
    public X_I_Product (Properties ctx, String I_Product_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, I_Product_UU, trxName, virtualColumns);
      /** if (I_Product_UU == null)
        {
			setC_TaxCategory_ID (0);
			setI_IsImported (false);
			setI_Product_ID (0);
			setIsAutoProduce (false);
// N
			setIsBOM (false);
// N
			setIsDropShip (false);
// N
			setIsExcludeAutoDelivery (false);
// N
			setIsInvoicePrintDetails (false);
// N
			setIsKanban (false);
// N
			setIsManufactured (false);
// N
			setIsOwnBox (false);
// N
			setIsPhantom (false);
// N
			setIsPickListPrintDetails (false);
// N
			setIsPurchased (false);
// N
			setIsSelfService (false);
// N
			setIsSold (false);
// N
			setIsStocked (true);
// Y
			setIsSummary (false);
// N
			setIsVerified (false);
// N
			setIsWebStoreFeatured (false);
// N
        } */
    }

    /** Load Constructor */
    public X_I_Product (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 2 - Client
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
      StringBuilder sb = new StringBuilder ("X_I_Product[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set AttributeSet Key.
		@param AttributeSet_Value AttributeSet Descriptor in JSON
	*/
	public void setAttributeSet_Value (String AttributeSet_Value)
	{
		set_Value (COLUMNNAME_AttributeSet_Value, AttributeSet_Value);
	}

	/** Get AttributeSet Key.
		@return AttributeSet Descriptor in JSON
	  */
	public String getAttributeSet_Value()
	{
		return (String)get_Value(COLUMNNAME_AttributeSet_Value);
	}

	/** Set Business Partner Key.
		@param BPartner_Value The Key of the Business Partner
	*/
	public void setBPartner_Value (String BPartner_Value)
	{
		set_Value (COLUMNNAME_BPartner_Value, BPartner_Value);
	}

	/** Get Business Partner Key.
		@return The Key of the Business Partner
	  */
	public String getBPartner_Value()
	{
		return (String)get_Value(COLUMNNAME_BPartner_Value);
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

	public org.compiere.model.I_C_Currency getC_Currency() throws RuntimeException
	{
		return (org.compiere.model.I_C_Currency)MTable.get(getCtx(), org.compiere.model.I_C_Currency.Table_ID)
			.getPO(getC_Currency_ID(), get_TrxName());
	}

	/** Set Currency.
		@param C_Currency_ID The Currency for this record
	*/
	public void setC_Currency_ID (int C_Currency_ID)
	{
		if (C_Currency_ID < 1)
			set_Value (COLUMNNAME_C_Currency_ID, null);
		else
			set_Value (COLUMNNAME_C_Currency_ID, Integer.valueOf(C_Currency_ID));
	}

	/** Get Currency.
		@return The Currency for this record
	  */
	public int getC_Currency_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Currency_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Classification.
		@param Classification Classification for grouping
	*/
	public void setClassification (String Classification)
	{
		set_Value (COLUMNNAME_Classification, Classification);
	}

	/** Get Classification.
		@return Classification for grouping
	  */
	public String getClassification()
	{
		return (String)get_Value(COLUMNNAME_Classification);
	}

	/** Set Cost per Order.
		@param CostPerOrder Fixed Cost Per Order
	*/
	public void setCostPerOrder (BigDecimal CostPerOrder)
	{
		set_Value (COLUMNNAME_CostPerOrder, CostPerOrder);
	}

	/** Get Cost per Order.
		@return Fixed Cost Per Order
	  */
	public BigDecimal getCostPerOrder()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_CostPerOrder);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	public org.compiere.model.I_C_RevenueRecognition getC_RevenueRecognition() throws RuntimeException
	{
		return (org.compiere.model.I_C_RevenueRecognition)MTable.get(getCtx(), org.compiere.model.I_C_RevenueRecognition.Table_ID)
			.getPO(getC_RevenueRecognition_ID(), get_TrxName());
	}

	/** Set Revenue Recognition.
		@param C_RevenueRecognition_ID Method for recording revenue
	*/
	public void setC_RevenueRecognition_ID (int C_RevenueRecognition_ID)
	{
		if (C_RevenueRecognition_ID < 1)
			set_Value (COLUMNNAME_C_RevenueRecognition_ID, null);
		else
			set_Value (COLUMNNAME_C_RevenueRecognition_ID, Integer.valueOf(C_RevenueRecognition_ID));
	}

	/** Get Revenue Recognition.
		@return Method for recording revenue
	  */
	public int getC_RevenueRecognition_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_RevenueRecognition_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_SubscriptionType getC_SubscriptionType() throws RuntimeException
	{
		return (org.compiere.model.I_C_SubscriptionType)MTable.get(getCtx(), org.compiere.model.I_C_SubscriptionType.Table_ID)
			.getPO(getC_SubscriptionType_ID(), get_TrxName());
	}

	/** Set Subscription Type.
		@param C_SubscriptionType_ID Type of subscription
	*/
	public void setC_SubscriptionType_ID (int C_SubscriptionType_ID)
	{
		if (C_SubscriptionType_ID < 1)
			set_Value (COLUMNNAME_C_SubscriptionType_ID, null);
		else
			set_Value (COLUMNNAME_C_SubscriptionType_ID, Integer.valueOf(C_SubscriptionType_ID));
	}

	/** Get Subscription Type.
		@return Type of subscription
	  */
	public int getC_SubscriptionType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_SubscriptionType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_TaxCategory getC_TaxCategory() throws RuntimeException
	{
		return (org.compiere.model.I_C_TaxCategory)MTable.get(getCtx(), org.compiere.model.I_C_TaxCategory.Table_ID)
			.getPO(getC_TaxCategory_ID(), get_TrxName());
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

	public org.compiere.model.I_C_UOM getC_UOM() throws RuntimeException
	{
		return (org.compiere.model.I_C_UOM)MTable.get(getCtx(), org.compiere.model.I_C_UOM.Table_ID)
			.getPO(getC_UOM_ID(), get_TrxName());
	}

	/** Set UOM.
		@param C_UOM_ID Unit of Measure
	*/
	public void setC_UOM_ID (int C_UOM_ID)
	{
		if (C_UOM_ID < 1)
			set_Value (COLUMNNAME_C_UOM_ID, null);
		else
			set_Value (COLUMNNAME_C_UOM_ID, Integer.valueOf(C_UOM_ID));
	}

	/** Get UOM.
		@return Unit of Measure
	  */
	public int getC_UOM_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_UOM_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Customs Tariff Number.
		@param CustomsTariffNumber Customs Tariff Number, usually the HS-Code
	*/
	public void setCustomsTariffNumber (String CustomsTariffNumber)
	{
		set_Value (COLUMNNAME_CustomsTariffNumber, CustomsTariffNumber);
	}

	/** Get Customs Tariff Number.
		@return Customs Tariff Number, usually the HS-Code
	  */
	public String getCustomsTariffNumber()
	{
		return (String)get_Value(COLUMNNAME_CustomsTariffNumber);
	}

	/** Set Promised Delivery Time.
		@param DeliveryTime_Promised Promised days between order and delivery
	*/
	public void setDeliveryTime_Promised (int DeliveryTime_Promised)
	{
		set_Value (COLUMNNAME_DeliveryTime_Promised, Integer.valueOf(DeliveryTime_Promised));
	}

	/** Get Promised Delivery Time.
		@return Promised days between order and delivery
	  */
	public int getDeliveryTime_Promised()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_DeliveryTime_Promised);
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

	/** Set Description URL.
		@param DescriptionURL URL for the description
	*/
	public void setDescriptionURL (String DescriptionURL)
	{
		set_Value (COLUMNNAME_DescriptionURL, DescriptionURL);
	}

	/** Get Description URL.
		@return URL for the description
	  */
	public String getDescriptionURL()
	{
		return (String)get_Value(COLUMNNAME_DescriptionURL);
	}

	/** Set Discontinued.
		@param Discontinued This product is no longer available
	*/
	public void setDiscontinued (boolean Discontinued)
	{
		set_Value (COLUMNNAME_Discontinued, Boolean.valueOf(Discontinued));
	}

	/** Get Discontinued.
		@return This product is no longer available
	  */
	public boolean isDiscontinued()
	{
		Object oo = get_Value(COLUMNNAME_Discontinued);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Discontinued At.
		@param DiscontinuedAt Discontinued At indicates Date when product was discontinued
	*/
	public void setDiscontinuedAt (Timestamp DiscontinuedAt)
	{
		set_Value (COLUMNNAME_DiscontinuedAt, DiscontinuedAt);
	}

	/** Get Discontinued At.
		@return Discontinued At indicates Date when product was discontinued
	  */
	public Timestamp getDiscontinuedAt()
	{
		return (Timestamp)get_Value(COLUMNNAME_DiscontinuedAt);
	}

	/** Set Document Note.
		@param DocumentNote Additional information for a Document
	*/
	public void setDocumentNote (String DocumentNote)
	{
		set_Value (COLUMNNAME_DocumentNote, DocumentNote);
	}

	/** Get Document Note.
		@return Additional information for a Document
	  */
	public String getDocumentNote()
	{
		return (String)get_Value(COLUMNNAME_DocumentNote);
	}

	/** Set Group1.
		@param Group1 Group1
	*/
	public void setGroup1 (String Group1)
	{
		set_Value (COLUMNNAME_Group1, Group1);
	}

	/** Get Group1.
		@return Group1	  */
	public String getGroup1()
	{
		return (String)get_Value(COLUMNNAME_Group1);
	}

	/** Set Group2.
		@param Group2 Group2
	*/
	public void setGroup2 (String Group2)
	{
		set_Value (COLUMNNAME_Group2, Group2);
	}

	/** Get Group2.
		@return Group2	  */
	public String getGroup2()
	{
		return (String)get_Value(COLUMNNAME_Group2);
	}

	/** Set Guarantee Days.
		@param GuaranteeDays Number of days the product is guaranteed or available
	*/
	public void setGuaranteeDays (int GuaranteeDays)
	{
		set_Value (COLUMNNAME_GuaranteeDays, Integer.valueOf(GuaranteeDays));
	}

	/** Get Guarantee Days.
		@return Number of days the product is guaranteed or available
	  */
	public int getGuaranteeDays()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GuaranteeDays);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Min Guarantee Days.
		@param GuaranteeDaysMin Minimum number of guarantee days
	*/
	public void setGuaranteeDaysMin (int GuaranteeDaysMin)
	{
		set_Value (COLUMNNAME_GuaranteeDaysMin, Integer.valueOf(GuaranteeDaysMin));
	}

	/** Get Min Guarantee Days.
		@return Minimum number of guarantee days
	  */
	public int getGuaranteeDaysMin()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_GuaranteeDaysMin);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Comment/Help.
		@param Help Comment or Hint
	*/
	public void setHelp (String Help)
	{
		set_Value (COLUMNNAME_Help, Help);
	}

	/** Get Comment/Help.
		@return Comment or Hint
	  */
	public String getHelp()
	{
		return (String)get_Value(COLUMNNAME_Help);
	}

	/** Set Import Error Message.
		@param I_ErrorMsg Messages generated from import process
	*/
	public void setI_ErrorMsg (String I_ErrorMsg)
	{
		set_Value (COLUMNNAME_I_ErrorMsg, I_ErrorMsg);
	}

	/** Get Import Error Message.
		@return Messages generated from import process
	  */
	public String getI_ErrorMsg()
	{
		return (String)get_Value(COLUMNNAME_I_ErrorMsg);
	}

	/** Set Imported.
		@param I_IsImported Has this import been processed
	*/
	public void setI_IsImported (boolean I_IsImported)
	{
		set_Value (COLUMNNAME_I_IsImported, Boolean.valueOf(I_IsImported));
	}

	/** Get Imported.
		@return Has this import been processed
	  */
	public boolean isI_IsImported()
	{
		Object oo = get_Value(COLUMNNAME_I_IsImported);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Image URL.
		@param ImageURL URL of  image
	*/
	public void setImageURL (String ImageURL)
	{
		set_Value (COLUMNNAME_ImageURL, ImageURL);
	}

	/** Get Image URL.
		@return URL of  image
	  */
	public String getImageURL()
	{
		return (String)get_Value(COLUMNNAME_ImageURL);
	}

	/** Set Import Product.
		@param I_Product_ID Import Item or Service
	*/
	public void setI_Product_ID (int I_Product_ID)
	{
		if (I_Product_ID < 1)
			set_ValueNoCheck (COLUMNNAME_I_Product_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_I_Product_ID, Integer.valueOf(I_Product_ID));
	}

	/** Get Import Product.
		@return Import Item or Service
	  */
	public int getI_Product_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_I_Product_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set I_Product_UU.
		@param I_Product_UU I_Product_UU
	*/
	public void setI_Product_UU (String I_Product_UU)
	{
		set_Value (COLUMNNAME_I_Product_UU, I_Product_UU);
	}

	/** Get I_Product_UU.
		@return I_Product_UU	  */
	public String getI_Product_UU()
	{
		return (String)get_Value(COLUMNNAME_I_Product_UU);
	}

	/** Set Auto Produce.
		@param IsAutoProduce Auto create production to fulfill shipment
	*/
	public void setIsAutoProduce (boolean IsAutoProduce)
	{
		set_Value (COLUMNNAME_IsAutoProduce, Boolean.valueOf(IsAutoProduce));
	}

	/** Get Auto Produce.
		@return Auto create production to fulfill shipment
	  */
	public boolean isAutoProduce()
	{
		Object oo = get_Value(COLUMNNAME_IsAutoProduce);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Bill of Materials.
		@param IsBOM Bill of Materials
	*/
	public void setIsBOM (boolean IsBOM)
	{
		set_Value (COLUMNNAME_IsBOM, Boolean.valueOf(IsBOM));
	}

	/** Get Bill of Materials.
		@return Bill of Materials
	  */
	public boolean isBOM()
	{
		Object oo = get_Value(COLUMNNAME_IsBOM);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Drop Shipment.
		@param IsDropShip Drop Shipments are sent directly to the Drop Shipment Location
	*/
	public void setIsDropShip (boolean IsDropShip)
	{
		set_Value (COLUMNNAME_IsDropShip, Boolean.valueOf(IsDropShip));
	}

	/** Get Drop Shipment.
		@return Drop Shipments are sent directly to the Drop Shipment Location
	  */
	public boolean isDropShip()
	{
		Object oo = get_Value(COLUMNNAME_IsDropShip);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Exclude Auto Delivery.
		@param IsExcludeAutoDelivery Exclude from automatic Delivery
	*/
	public void setIsExcludeAutoDelivery (boolean IsExcludeAutoDelivery)
	{
		set_Value (COLUMNNAME_IsExcludeAutoDelivery, Boolean.valueOf(IsExcludeAutoDelivery));
	}

	/** Get Exclude Auto Delivery.
		@return Exclude from automatic Delivery
	  */
	public boolean isExcludeAutoDelivery()
	{
		Object oo = get_Value(COLUMNNAME_IsExcludeAutoDelivery);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Print detail records on invoice.
		@param IsInvoicePrintDetails Print detail BOM elements on the invoice
	*/
	public void setIsInvoicePrintDetails (boolean IsInvoicePrintDetails)
	{
		set_Value (COLUMNNAME_IsInvoicePrintDetails, Boolean.valueOf(IsInvoicePrintDetails));
	}

	/** Get Print detail records on invoice.
		@return Print detail BOM elements on the invoice
	  */
	public boolean isInvoicePrintDetails()
	{
		Object oo = get_Value(COLUMNNAME_IsInvoicePrintDetails);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Kanban controlled.
		@param IsKanban This part is Kanban controlled
	*/
	public void setIsKanban (boolean IsKanban)
	{
		set_Value (COLUMNNAME_IsKanban, Boolean.valueOf(IsKanban));
	}

	/** Get Kanban controlled.
		@return This part is Kanban controlled
	  */
	public boolean isKanban()
	{
		Object oo = get_Value(COLUMNNAME_IsKanban);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Manufactured.
		@param IsManufactured This product is manufactured
	*/
	public void setIsManufactured (boolean IsManufactured)
	{
		set_Value (COLUMNNAME_IsManufactured, Boolean.valueOf(IsManufactured));
	}

	/** Get Manufactured.
		@return This product is manufactured
	  */
	public boolean isManufactured()
	{
		Object oo = get_Value(COLUMNNAME_IsManufactured);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ISO Currency Code.
		@param ISO_Code Three letter ISO 4217 Code of the Currency
	*/
	public void setISO_Code (String ISO_Code)
	{
		set_Value (COLUMNNAME_ISO_Code, ISO_Code);
	}

	/** Get ISO Currency Code.
		@return Three letter ISO 4217 Code of the Currency
	  */
	public String getISO_Code()
	{
		return (String)get_Value(COLUMNNAME_ISO_Code);
	}

	/** Set Own Box.
		@param IsOwnBox Own Box
	*/
	public void setIsOwnBox (boolean IsOwnBox)
	{
		set_Value (COLUMNNAME_IsOwnBox, Boolean.valueOf(IsOwnBox));
	}

	/** Get Own Box.
		@return Own Box	  */
	public boolean isOwnBox()
	{
		Object oo = get_Value(COLUMNNAME_IsOwnBox);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Phantom.
		@param IsPhantom Phantom Component
	*/
	public void setIsPhantom (boolean IsPhantom)
	{
		set_Value (COLUMNNAME_IsPhantom, Boolean.valueOf(IsPhantom));
	}

	/** Get Phantom.
		@return Phantom Component
	  */
	public boolean isPhantom()
	{
		Object oo = get_Value(COLUMNNAME_IsPhantom);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Print detail records on pick list.
		@param IsPickListPrintDetails Print detail BOM elements on the pick list
	*/
	public void setIsPickListPrintDetails (boolean IsPickListPrintDetails)
	{
		set_Value (COLUMNNAME_IsPickListPrintDetails, Boolean.valueOf(IsPickListPrintDetails));
	}

	/** Get Print detail records on pick list.
		@return Print detail BOM elements on the pick list
	  */
	public boolean isPickListPrintDetails()
	{
		Object oo = get_Value(COLUMNNAME_IsPickListPrintDetails);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Purchased.
		@param IsPurchased Organization purchases this product
	*/
	public void setIsPurchased (boolean IsPurchased)
	{
		set_Value (COLUMNNAME_IsPurchased, Boolean.valueOf(IsPurchased));
	}

	/** Get Purchased.
		@return Organization purchases this product
	  */
	public boolean isPurchased()
	{
		Object oo = get_Value(COLUMNNAME_IsPurchased);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Self-Service.
		@param IsSelfService This is a Self-Service entry or this entry can be changed via Self-Service
	*/
	public void setIsSelfService (boolean IsSelfService)
	{
		set_Value (COLUMNNAME_IsSelfService, Boolean.valueOf(IsSelfService));
	}

	/** Get Self-Service.
		@return This is a Self-Service entry or this entry can be changed via Self-Service
	  */
	public boolean isSelfService()
	{
		Object oo = get_Value(COLUMNNAME_IsSelfService);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Sold.
		@param IsSold Organization sells this product
	*/
	public void setIsSold (boolean IsSold)
	{
		set_Value (COLUMNNAME_IsSold, Boolean.valueOf(IsSold));
	}

	/** Get Sold.
		@return Organization sells this product
	  */
	public boolean isSold()
	{
		Object oo = get_Value(COLUMNNAME_IsSold);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Stocked.
		@param IsStocked Organization stocks this product
	*/
	public void setIsStocked (boolean IsStocked)
	{
		set_ValueNoCheck (COLUMNNAME_IsStocked, Boolean.valueOf(IsStocked));
	}

	/** Get Stocked.
		@return Organization stocks this product
	  */
	public boolean isStocked()
	{
		Object oo = get_Value(COLUMNNAME_IsStocked);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Summary Level.
		@param IsSummary This is a summary entity
	*/
	public void setIsSummary (boolean IsSummary)
	{
		set_Value (COLUMNNAME_IsSummary, Boolean.valueOf(IsSummary));
	}

	/** Get Summary Level.
		@return This is a summary entity
	  */
	public boolean isSummary()
	{
		Object oo = get_Value(COLUMNNAME_IsSummary);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Verified.
		@param IsVerified The BOM configuration has been verified
	*/
	public void setIsVerified (boolean IsVerified)
	{
		set_Value (COLUMNNAME_IsVerified, Boolean.valueOf(IsVerified));
	}

	/** Get Verified.
		@return The BOM configuration has been verified
	  */
	public boolean isVerified()
	{
		Object oo = get_Value(COLUMNNAME_IsVerified);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Featured in Web Store.
		@param IsWebStoreFeatured If selected, the product is displayed in the initial or any empty search
	*/
	public void setIsWebStoreFeatured (boolean IsWebStoreFeatured)
	{
		set_Value (COLUMNNAME_IsWebStoreFeatured, Boolean.valueOf(IsWebStoreFeatured));
	}

	/** Get Featured in Web Store.
		@return If selected, the product is displayed in the initial or any empty search
	  */
	public boolean isWebStoreFeatured()
	{
		Object oo = get_Value(COLUMNNAME_IsWebStoreFeatured);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Low Level.
		@param LowLevel The Low Level is used to calculate the material plan and determines if a net requirement should be exploited
	*/
	public void setLowLevel (int LowLevel)
	{
		set_Value (COLUMNNAME_LowLevel, Integer.valueOf(LowLevel));
	}

	/** Get Low Level.
		@return The Low Level is used to calculate the material plan and determines if a net requirement should be exploited
	  */
	public int getLowLevel()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_LowLevel);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Manufacturer.
		@param Manufacturer Manufacturer of the Product
	*/
	public void setManufacturer (String Manufacturer)
	{
		set_Value (COLUMNNAME_Manufacturer, Manufacturer);
	}

	/** Get Manufacturer.
		@return Manufacturer of the Product
	  */
	public String getManufacturer()
	{
		return (String)get_Value(COLUMNNAME_Manufacturer);
	}

	public org.compiere.model.I_M_AttributeSet getM_AttributeSet() throws RuntimeException
	{
		return (org.compiere.model.I_M_AttributeSet)MTable.get(getCtx(), org.compiere.model.I_M_AttributeSet.Table_ID)
			.getPO(getM_AttributeSet_ID(), get_TrxName());
	}

	/** Set Attribute Set.
		@param M_AttributeSet_ID Product Attribute Set
	*/
	public void setM_AttributeSet_ID (int M_AttributeSet_ID)
	{
		if (M_AttributeSet_ID < 0)
			set_Value (COLUMNNAME_M_AttributeSet_ID, null);
		else
			set_Value (COLUMNNAME_M_AttributeSet_ID, Integer.valueOf(M_AttributeSet_ID));
	}

	/** Get Attribute Set.
		@return Product Attribute Set
	  */
	public int getM_AttributeSet_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSet_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public I_M_AttributeSetInstance getM_AttributeSetInstance() throws RuntimeException
	{
		return (I_M_AttributeSetInstance)MTable.get(getCtx(), I_M_AttributeSetInstance.Table_ID)
			.getPO(getM_AttributeSetInstance_ID(), get_TrxName());
	}

	/** Set Attribute Set Instance.
		@param M_AttributeSetInstance_ID Product Attribute Set Instance
	*/
	public void setM_AttributeSetInstance_ID (int M_AttributeSetInstance_ID)
	{
		if (M_AttributeSetInstance_ID < 0)
			set_Value (COLUMNNAME_M_AttributeSetInstance_ID, null);
		else
			set_Value (COLUMNNAME_M_AttributeSetInstance_ID, Integer.valueOf(M_AttributeSetInstance_ID));
	}

	/** Get Attribute Set Instance.
		@return Product Attribute Set Instance
	  */
	public int getM_AttributeSetInstance_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_AttributeSetInstance_ID);
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

	/** Set Name.
		@param Name Alphanumeric identifier of the entity
	*/
	public void setName (String Name)
	{
		set_Value (COLUMNNAME_Name, Name);
	}

	/** Get Name.
		@return Alphanumeric identifier of the entity
	  */
	public String getName()
	{
		return (String)get_Value(COLUMNNAME_Name);
	}

	/** Set Minimum Order Qty.
		@param Order_Min Minimum order quantity in UOM
	*/
	public void setOrder_Min (int Order_Min)
	{
		set_Value (COLUMNNAME_Order_Min, Integer.valueOf(Order_Min));
	}

	/** Get Minimum Order Qty.
		@return Minimum order quantity in UOM
	  */
	public int getOrder_Min()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Order_Min);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Order Pack Qty.
		@param Order_Pack Package order size in UOM (e.g. order set of 5 units)
	*/
	public void setOrder_Pack (int Order_Pack)
	{
		set_Value (COLUMNNAME_Order_Pack, Integer.valueOf(Order_Pack));
	}

	/** Get Order Pack Qty.
		@return Package order size in UOM (e.g. order set of 5 units)
	  */
	public int getOrder_Pack()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_Order_Pack);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Price effective.
		@param PriceEffective Effective Date of Price
	*/
	public void setPriceEffective (Timestamp PriceEffective)
	{
		set_Value (COLUMNNAME_PriceEffective, PriceEffective);
	}

	/** Get Price effective.
		@return Effective Date of Price
	  */
	public Timestamp getPriceEffective()
	{
		return (Timestamp)get_Value(COLUMNNAME_PriceEffective);
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

	/** Set PO Price.
		@param PricePO Price based on a purchase order
	*/
	public void setPricePO (BigDecimal PricePO)
	{
		set_Value (COLUMNNAME_PricePO, PricePO);
	}

	/** Get PO Price.
		@return Price based on a purchase order
	  */
	public BigDecimal getPricePO()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_PricePO);
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

	/** Set Processed.
		@param Processed The document has been processed
	*/
	public void setProcessed (boolean Processed)
	{
		set_Value (COLUMNNAME_Processed, Boolean.valueOf(Processed));
	}

	/** Get Processed.
		@return The document has been processed
	  */
	public boolean isProcessed()
	{
		Object oo = get_Value(COLUMNNAME_Processed);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Process Now.
		@param Processing Process Now
	*/
	public void setProcessing (boolean Processing)
	{
		set_Value (COLUMNNAME_Processing, Boolean.valueOf(Processing));
	}

	/** Get Process Now.
		@return Process Now	  */
	public boolean isProcessing()
	{
		Object oo = get_Value(COLUMNNAME_Processing);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set ProductBrand  Key.
		@param ProductBrand_Value ProductBrand Value for search
	*/
	public void setProductBrand_Value (String ProductBrand_Value)
	{
		set_Value (COLUMNNAME_ProductBrand_Value, ProductBrand_Value);
	}

	/** Get ProductBrand  Key.
		@return ProductBrand Value for search
	  */
	public String getProductBrand_Value()
	{
		return (String)get_Value(COLUMNNAME_ProductBrand_Value);
	}

	/** Set Product Category Key.
		@param ProductCategory_Value Product Category Key
	*/
	public void setProductCategory_Value (String ProductCategory_Value)
	{
		set_Value (COLUMNNAME_ProductCategory_Value, ProductCategory_Value);
	}

	/** Get Product Category Key.
		@return Product Category Key	  */
	public String getProductCategory_Value()
	{
		return (String)get_Value(COLUMNNAME_ProductCategory_Value);
	}

	/** Set ProductLine  Key.
		@param ProductLine_Value ProductLine Value for search
	*/
	public void setProductLine_Value (String ProductLine_Value)
	{
		set_Value (COLUMNNAME_ProductLine_Value, ProductLine_Value);
	}

	/** Get ProductLine  Key.
		@return ProductLine Value for search
	  */
	public String getProductLine_Value()
	{
		return (String)get_Value(COLUMNNAME_ProductLine_Value);
	}

	/** ProductType AD_Reference_ID=270 */
	public static final int PRODUCTTYPE_AD_Reference_ID=270;
	/** Asset = A */
	public static final String PRODUCTTYPE_Asset = "A";
	/** Expense type = E */
	public static final String PRODUCTTYPE_ExpenseType = "E";
	/** Item = I */
	public static final String PRODUCTTYPE_Item = "I";
	/** Online = O */
	public static final String PRODUCTTYPE_Online = "O";
	/** Resource = R */
	public static final String PRODUCTTYPE_Resource = "R";
	/** Service = S */
	public static final String PRODUCTTYPE_Service = "S";
	/** Set Product Type.
		@param ProductType Type of product
	*/
	public void setProductType (String ProductType)
	{

		set_Value (COLUMNNAME_ProductType, ProductType);
	}

	/** Get Product Type.
		@return Type of product
	  */
	public String getProductType()
	{
		return (String)get_Value(COLUMNNAME_ProductType);
	}

	/** Set Royalty Amount.
		@param RoyaltyAmt (Included) Amount for copyright, etc.
	*/
	public void setRoyaltyAmt (BigDecimal RoyaltyAmt)
	{
		set_Value (COLUMNNAME_RoyaltyAmt, RoyaltyAmt);
	}

	/** Get Royalty Amount.
		@return (Included) Amount for copyright, etc.
	  */
	public BigDecimal getRoyaltyAmt()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_RoyaltyAmt);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shelf Depth.
		@param ShelfDepth Shelf depth required
	*/
	public void setShelfDepth (int ShelfDepth)
	{
		set_Value (COLUMNNAME_ShelfDepth, Integer.valueOf(ShelfDepth));
	}

	/** Get Shelf Depth.
		@return Shelf depth required
	  */
	public int getShelfDepth()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfDepth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Shelf Height.
		@param ShelfHeight Shelf height required
	*/
	public void setShelfHeight (BigDecimal ShelfHeight)
	{
		set_Value (COLUMNNAME_ShelfHeight, ShelfHeight);
	}

	/** Get Shelf Height.
		@return Shelf height required
	  */
	public BigDecimal getShelfHeight()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_ShelfHeight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Shelf Width.
		@param ShelfWidth Shelf width required
	*/
	public void setShelfWidth (int ShelfWidth)
	{
		set_Value (COLUMNNAME_ShelfWidth, Integer.valueOf(ShelfWidth));
	}

	/** Get Shelf Width.
		@return Shelf width required
	  */
	public int getShelfWidth()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_ShelfWidth);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set SKU.
		@param SKU Stock Keeping Unit
	*/
	public void setSKU (String SKU)
	{
		set_Value (COLUMNNAME_SKU, SKU);
	}

	/** Get SKU.
		@return Stock Keeping Unit
	  */
	public String getSKU()
	{
		return (String)get_Value(COLUMNNAME_SKU);
	}

	/** Set Tax Category Key.
		@param TaxCategory_Value Tax Category Key
	*/
	public void setTaxCategory_Value (String TaxCategory_Value)
	{
		set_Value (COLUMNNAME_TaxCategory_Value, TaxCategory_Value);
	}

	/** Get Tax Category Key.
		@return Tax Category Key	  */
	public String getTaxCategory_Value()
	{
		return (String)get_Value(COLUMNNAME_TaxCategory_Value);
	}

	/** Set Units Per Pallet.
		@param UnitsPerPallet Units Per Pallet
	*/
	public void setUnitsPerPallet (int UnitsPerPallet)
	{
		set_Value (COLUMNNAME_UnitsPerPallet, Integer.valueOf(UnitsPerPallet));
	}

	/** Get Units Per Pallet.
		@return Units Per Pallet
	  */
	public int getUnitsPerPallet()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_UnitsPerPallet);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set UOM Key.
		@param UOM_Value UOM Key
	*/
	public void setUOM_Value (String UOM_Value)
	{
		set_Value (COLUMNNAME_UOM_Value, UOM_Value);
	}

	/** Get UOM Key.
		@return UOM Key	  */
	public String getUOM_Value()
	{
		return (String)get_Value(COLUMNNAME_UOM_Value);
	}

	/** Set UPC/EAN.
		@param UPC Bar Code (Universal Product Code or its superset European Article Number)
	*/
	public void setUPC (String UPC)
	{
		set_Value (COLUMNNAME_UPC, UPC);
	}

	/** Get UPC/EAN.
		@return Bar Code (Universal Product Code or its superset European Article Number)
	  */
	public String getUPC()
	{
		return (String)get_Value(COLUMNNAME_UPC);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getValue());
    }

	/** Set Partner Category.
		@param VendorCategory Product Category of the Business Partner
	*/
	public void setVendorCategory (String VendorCategory)
	{
		set_Value (COLUMNNAME_VendorCategory, VendorCategory);
	}

	/** Get Partner Category.
		@return Product Category of the Business Partner
	  */
	public String getVendorCategory()
	{
		return (String)get_Value(COLUMNNAME_VendorCategory);
	}

	/** Set Partner Product Key.
		@param VendorProductNo Product Key of the Business Partner
	*/
	public void setVendorProductNo (String VendorProductNo)
	{
		set_Value (COLUMNNAME_VendorProductNo, VendorProductNo);
	}

	/** Get Partner Product Key.
		@return Product Key of the Business Partner
	  */
	public String getVendorProductNo()
	{
		return (String)get_Value(COLUMNNAME_VendorProductNo);
	}

	/** Set Volume.
		@param Volume Volume of a product
	*/
	public void setVolume (BigDecimal Volume)
	{
		set_Value (COLUMNNAME_Volume, Volume);
	}

	/** Get Volume.
		@return Volume of a product
	  */
	public BigDecimal getVolume()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Volume);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Weight.
		@param Weight Weight of a product
	*/
	public void setWeight (BigDecimal Weight)
	{
		set_Value (COLUMNNAME_Weight, Weight);
	}

	/** Get Weight.
		@return Weight of a product
	  */
	public BigDecimal getWeight()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_Weight);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set UOM Code.
		@param X12DE355 UOM EDI X12 Code
	*/
	public void setX12DE355 (String X12DE355)
	{
		set_Value (COLUMNNAME_X12DE355, X12DE355);
	}

	/** Get UOM Code.
		@return UOM EDI X12 Code
	  */
	public String getX12DE355()
	{
		return (String)get_Value(COLUMNNAME_X12DE355);
	}
}