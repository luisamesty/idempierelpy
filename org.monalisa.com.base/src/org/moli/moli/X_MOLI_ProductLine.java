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

/** Generated Model for MOLI_ProductLine
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_ProductLine")
public class X_MOLI_ProductLine extends PO implements I_MOLI_ProductLine, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241111L;

    /** Standard Constructor */
    public X_MOLI_ProductLine (Properties ctx, int MOLI_ProductLine_ID, String trxName)
    {
      super (ctx, MOLI_ProductLine_ID, trxName);
      /** if (MOLI_ProductLine_ID == 0)
        {
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_LineSymbol (null);
			setMOLI_ProductBrand_ID (0);
			setMOLI_ProductLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductLine (Properties ctx, int MOLI_ProductLine_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_ProductLine_ID, trxName, virtualColumns);
      /** if (MOLI_ProductLine_ID == 0)
        {
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_LineSymbol (null);
			setMOLI_ProductBrand_ID (0);
			setMOLI_ProductLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductLine (Properties ctx, String MOLI_ProductLine_UU, String trxName)
    {
      super (ctx, MOLI_ProductLine_UU, trxName);
      /** if (MOLI_ProductLine_UU == null)
        {
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_LineSymbol (null);
			setMOLI_ProductBrand_ID (0);
			setMOLI_ProductLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_ProductLine (Properties ctx, String MOLI_ProductLine_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_ProductLine_UU, trxName, virtualColumns);
      /** if (MOLI_ProductLine_UU == null)
        {
			setMOLI_isApproval (false);
// N
			setMOLI_isWHS (false);
// N
			setMOLI_LineSymbol (null);
			setMOLI_ProductBrand_ID (0);
			setMOLI_ProductLine_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_MOLI_ProductLine (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_ProductLine[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
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

	/** Set MOLI_LineSymbol.
		@param MOLI_LineSymbol MOLI_LineSymbol
	*/
	public void setMOLI_LineSymbol (String MOLI_LineSymbol)
	{
		set_Value (COLUMNNAME_MOLI_LineSymbol, MOLI_LineSymbol);
	}

	/** Get MOLI_LineSymbol.
		@return MOLI_LineSymbol	  */
	public String getMOLI_LineSymbol()
	{
		return (String)get_Value(COLUMNNAME_MOLI_LineSymbol);
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

	/** Set Product Line.
		@param MOLI_ProductLine_ID Product Line
	*/
	public void setMOLI_ProductLine_ID (int MOLI_ProductLine_ID)
	{
		if (MOLI_ProductLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_ProductLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_ProductLine_ID, Integer.valueOf(MOLI_ProductLine_ID));
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

	/** Set Product Line UU.
		@param MOLI_ProductLine_UU Product Line UU
	*/
	public void setMOLI_ProductLine_UU (String MOLI_ProductLine_UU)
	{
		set_Value (COLUMNNAME_MOLI_ProductLine_UU, MOLI_ProductLine_UU);
	}

	/** Get Product Line UU.
		@return Product Line UU	  */
	public String getMOLI_ProductLine_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_ProductLine_UU);
	}

	/** Set SKU Group.
		@param MOLI_SKUGroup SKU Group
	*/
	public void setMOLI_SKUGroup (String MOLI_SKUGroup)
	{
		set_Value (COLUMNNAME_MOLI_SKUGroup, MOLI_SKUGroup);
	}

	/** Get SKU Group.
		@return SKU Group
	  */
	public String getMOLI_SKUGroup()
	{
		return (String)get_Value(COLUMNNAME_MOLI_SKUGroup);
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