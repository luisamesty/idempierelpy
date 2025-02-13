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

/** Generated Model for MOLI_ProductBrand
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_ProductBrand")
public class X_MOLI_ProductBrand extends PO implements I_MOLI_ProductBrand, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_ProductBrand (Properties ctx, int MOLI_ProductBrand_ID, String trxName)
    {
      super (ctx, MOLI_ProductBrand_ID, trxName);
      /** if (MOLI_ProductBrand_ID == 0)
        {
			setMOLI_BrandSymbol (null);
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_ProductBrand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductBrand (Properties ctx, int MOLI_ProductBrand_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_ProductBrand_ID, trxName, virtualColumns);
      /** if (MOLI_ProductBrand_ID == 0)
        {
			setMOLI_BrandSymbol (null);
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_ProductBrand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductBrand (Properties ctx, String MOLI_ProductBrand_UU, String trxName)
    {
      super (ctx, MOLI_ProductBrand_UU, trxName);
      /** if (MOLI_ProductBrand_UU == null)
        {
			setMOLI_BrandSymbol (null);
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_ProductBrand_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductBrand (Properties ctx, String MOLI_ProductBrand_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_ProductBrand_UU, trxName, virtualColumns);
      /** if (MOLI_ProductBrand_UU == null)
        {
			setMOLI_BrandSymbol (null);
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_ProductBrand_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_MOLI_ProductBrand (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_ProductBrand[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
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

	/** Set Brand Symbol.
		@param MOLI_BrandSymbol Brand Symbol
	*/
	public void setMOLI_BrandSymbol (String MOLI_BrandSymbol)
	{
		set_Value (COLUMNNAME_MOLI_BrandSymbol, MOLI_BrandSymbol);
	}

	/** Get Brand Symbol.
		@return Brand Symbol
	  */
	public String getMOLI_BrandSymbol()
	{
		return (String)get_Value(COLUMNNAME_MOLI_BrandSymbol);
	}

	/** Set Requiere Approval.
		@param MOLI_isApproval Requiere Approval
	*/
	public void setMOLI_isApproval (boolean MOLI_isApproval)
	{
		set_Value (COLUMNNAME_MOLI_isApproval, Boolean.valueOf(MOLI_isApproval));
	}

	/** Get Requiere Approval.
		@return Requiere Approval
	  */
	public boolean isMOLI_isApproval()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_isApproval);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Whole Sale.
		@param MOLI_isWHS Whole Sale
	*/
	public void setMOLI_isWHS (boolean MOLI_isWHS)
	{
		set_Value (COLUMNNAME_MOLI_isWHS, Boolean.valueOf(MOLI_isWHS));
	}

	/** Get Whole Sale.
		@return Whole Sale
	  */
	public boolean isMOLI_isWHS()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_isWHS);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Product Brand.
		@param MOLI_ProductBrand_ID Product Brand
	*/
	public void setMOLI_ProductBrand_ID (int MOLI_ProductBrand_ID)
	{
		if (MOLI_ProductBrand_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_ProductBrand_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_ProductBrand_ID, Integer.valueOf(MOLI_ProductBrand_ID));
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

	/** Set Product Brand UU.
		@param MOLI_ProductBrand_UU Product Brand UU
	*/
	public void setMOLI_ProductBrand_UU (String MOLI_ProductBrand_UU)
	{
		set_Value (COLUMNNAME_MOLI_ProductBrand_UU, MOLI_ProductBrand_UU);
	}

	/** Get Product Brand UU.
		@return Product Brand UU	  */
	public String getMOLI_ProductBrand_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_ProductBrand_UU);
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
}