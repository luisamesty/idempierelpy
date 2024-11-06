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

import java.math.BigDecimal;
import java.sql.ResultSet;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for MOLI_HS
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_HS")
public class X_MOLI_HS extends PO implements I_MOLI_HS, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241111L;

    /** Standard Constructor */
    public X_MOLI_HS (Properties ctx, int MOLI_HS_ID, String trxName)
    {
      super (ctx, MOLI_HS_ID, trxName);
      /** if (MOLI_HS_ID == 0)
        {
			setMOLI_HS_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_HS (Properties ctx, int MOLI_HS_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_HS_ID, trxName, virtualColumns);
      /** if (MOLI_HS_ID == 0)
        {
			setMOLI_HS_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_HS (Properties ctx, String MOLI_HS_UU, String trxName)
    {
      super (ctx, MOLI_HS_UU, trxName);
      /** if (MOLI_HS_UU == null)
        {
			setMOLI_HS_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_HS (Properties ctx, String MOLI_HS_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_HS_UU, trxName, virtualColumns);
      /** if (MOLI_HS_UU == null)
        {
			setMOLI_HS_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_MOLI_HS (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_HS[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set HS Chapter.
		@param MOLI_HSChapter HS Chapter
	*/
	public void setMOLI_HSChapter (String MOLI_HSChapter)
	{
		set_Value (COLUMNNAME_MOLI_HSChapter, MOLI_HSChapter);
	}

	/** Get HS Chapter.
		@return HS Chapter
	  */
	public String getMOLI_HSChapter()
	{
		return (String)get_Value(COLUMNNAME_MOLI_HSChapter);
	}

	/** Set HS Heading.
		@param MOLI_HSHeading HS Heading
	*/
	public void setMOLI_HSHeading (String MOLI_HSHeading)
	{
		set_Value (COLUMNNAME_MOLI_HSHeading, MOLI_HSHeading);
	}

	/** Get HS Heading.
		@return HS Heading
	  */
	public String getMOLI_HSHeading()
	{
		return (String)get_Value(COLUMNNAME_MOLI_HSHeading);
	}

	/** Set Harmonized System.
		@param MOLI_HS_ID Harmonized Commodity Description and Coding System (HS Convention) 
	*/
	public void setMOLI_HS_ID (int MOLI_HS_ID)
	{
		if (MOLI_HS_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_HS_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_HS_ID, Integer.valueOf(MOLI_HS_ID));
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

	/** Set HS Income Charge.
		@param MOLI_HSIncomeCharge HS Income Charge
	*/
	public void setMOLI_HSIncomeCharge (BigDecimal MOLI_HSIncomeCharge)
	{
		set_Value (COLUMNNAME_MOLI_HSIncomeCharge, MOLI_HSIncomeCharge);
	}

	/** Get HS Income Charge.
		@return HS Income Charge
	  */
	public BigDecimal getMOLI_HSIncomeCharge()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSIncomeCharge);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS IncomeTax.
		@param MOLI_HSIncomeTax HS IncomeTax
	*/
	public void setMOLI_HSIncomeTax (BigDecimal MOLI_HSIncomeTax)
	{
		set_Value (COLUMNNAME_MOLI_HSIncomeTax, MOLI_HSIncomeTax);
	}

	/** Get HS IncomeTax.
		@return HS IncomeTax
	  */
	public BigDecimal getMOLI_HSIncomeTax()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSIncomeTax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS OtherTax.
		@param MOLI_HSOtherTax HS OtherTax
	*/
	public void setMOLI_HSOtherTax (BigDecimal MOLI_HSOtherTax)
	{
		set_Value (COLUMNNAME_MOLI_HSOtherTax, MOLI_HSOtherTax);
	}

	/** Get HS OtherTax.
		@return HS OtherTax
	  */
	public BigDecimal getMOLI_HSOtherTax()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSOtherTax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS SalesTax.
		@param MOLI_HSSalesTax HS SalesTax
	*/
	public void setMOLI_HSSalesTax (BigDecimal MOLI_HSSalesTax)
	{
		set_Value (COLUMNNAME_MOLI_HSSalesTax, MOLI_HSSalesTax);
	}

	/** Get HS SalesTax.
		@return HS SalesTax
	  */
	public BigDecimal getMOLI_HSSalesTax()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSSalesTax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS Selective Tax.
		@param MOLI_HSSelectiveTax HS Selective Tax
	*/
	public void setMOLI_HSSelectiveTax (BigDecimal MOLI_HSSelectiveTax)
	{
		set_Value (COLUMNNAME_MOLI_HSSelectiveTax, MOLI_HSSelectiveTax);
	}

	/** Get HS Selective Tax.
		@return HS Selective Tax
	  */
	public BigDecimal getMOLI_HSSelectiveTax()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSSelectiveTax);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS Selective Tax SND.
		@param MOLI_HSSelectiveTaxSND HS Selective Tax SND
	*/
	public void setMOLI_HSSelectiveTaxSND (BigDecimal MOLI_HSSelectiveTaxSND)
	{
		set_Value (COLUMNNAME_MOLI_HSSelectiveTaxSND, MOLI_HSSelectiveTaxSND);
	}

	/** Get HS Selective Tax SND.
		@return HS Selective Tax SND
	  */
	public BigDecimal getMOLI_HSSelectiveTaxSND()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSSelectiveTaxSND);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS SubHeading.
		@param MOLI_HSSubHeading HS SubHeading
	*/
	public void setMOLI_HSSubHeading (String MOLI_HSSubHeading)
	{
		set_Value (COLUMNNAME_MOLI_HSSubHeading, MOLI_HSSubHeading);
	}

	/** Get HS SubHeading.
		@return HS SubHeading
	  */
	public String getMOLI_HSSubHeading()
	{
		return (String)get_Value(COLUMNNAME_MOLI_HSSubHeading);
	}

	/** Set HS SubHeading Ext.
		@param MOLI_HSSubHeadingExt HS SubHeading Ext
	*/
	public void setMOLI_HSSubHeadingExt (String MOLI_HSSubHeadingExt)
	{
		set_Value (COLUMNNAME_MOLI_HSSubHeadingExt, MOLI_HSSubHeadingExt);
	}

	/** Get HS SubHeading Ext.
		@return HS SubHeading Ext
	  */
	public String getMOLI_HSSubHeadingExt()
	{
		return (String)get_Value(COLUMNNAME_MOLI_HSSubHeadingExt);
	}

	/** Set HS Tariff.
		@param MOLI_HSTariff HS Tariff
	*/
	public void setMOLI_HSTariff (BigDecimal MOLI_HSTariff)
	{
		set_Value (COLUMNNAME_MOLI_HSTariff, MOLI_HSTariff);
	}

	/** Get HS Tariff.
		@return HS Tariff
	  */
	public BigDecimal getMOLI_HSTariff()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSTariff);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS Tariff N.
		@param MOLI_HSTariffN HS Tariff N
	*/
	public void setMOLI_HSTariffN (BigDecimal MOLI_HSTariffN)
	{
		set_Value (COLUMNNAME_MOLI_HSTariffN, MOLI_HSTariffN);
	}

	/** Get HS Tariff N.
		@return HS Tariff N
	  */
	public BigDecimal getMOLI_HSTariffN()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSTariffN);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set HS UU.
		@param MOLI_HS_UU HS UU
	*/
	public void setMOLI_HS_UU (String MOLI_HS_UU)
	{
		set_Value (COLUMNNAME_MOLI_HS_UU, MOLI_HS_UU);
	}

	/** Get HS UU.
		@return HS UU	  */
	public String getMOLI_HS_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_HS_UU);
	}

	/** Set HS Vat.
		@param MOLI_HSVat HS Vat
	*/
	public void setMOLI_HSVat (BigDecimal MOLI_HSVat)
	{
		set_Value (COLUMNNAME_MOLI_HSVat, MOLI_HSVat);
	}

	/** Get HS Vat.
		@return HS Vat
	  */
	public BigDecimal getMOLI_HSVat()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_HSVat);
		if (bd == null)
			 return Env.ZERO;
		return bd;
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
}