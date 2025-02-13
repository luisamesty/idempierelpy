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

/** Generated Model for MOLI_invoiceData
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_invoiceData")
public class X_MOLI_invoiceData extends PO implements I_MOLI_invoiceData, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_invoiceData (Properties ctx, int MOLI_invoiceData_ID, String trxName)
    {
      super (ctx, MOLI_invoiceData_ID, trxName);
      /** if (MOLI_invoiceData_ID == 0)
        {
			setMOLI_InvoiceData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_invoiceData (Properties ctx, int MOLI_invoiceData_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_invoiceData_ID, trxName, virtualColumns);
      /** if (MOLI_invoiceData_ID == 0)
        {
			setMOLI_InvoiceData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_invoiceData (Properties ctx, String MOLI_invoiceData_UU, String trxName)
    {
      super (ctx, MOLI_invoiceData_UU, trxName);
      /** if (MOLI_invoiceData_UU == null)
        {
			setMOLI_InvoiceData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_invoiceData (Properties ctx, String MOLI_invoiceData_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_invoiceData_UU, trxName, virtualColumns);
      /** if (MOLI_invoiceData_UU == null)
        {
			setMOLI_InvoiceData_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_invoiceData (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 4 - System
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
      StringBuilder sb = new StringBuilder ("X_MOLI_invoiceData[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
	{
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_ID)
			.getPO(getC_Invoice_ID(), get_TrxName());
	}

	/** Set Invoice.
		@param C_Invoice_ID Invoice Identifier
	*/
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Invoice Data ID.
		@param MOLI_InvoiceData_ID Invoice Data ID
	*/
	public void setMOLI_InvoiceData_ID (int MOLI_InvoiceData_ID)
	{
		if (MOLI_InvoiceData_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_InvoiceData_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_InvoiceData_ID, Integer.valueOf(MOLI_InvoiceData_ID));
	}

	/** Get Invoice Data ID.
		@return Invoice Data ID	  */
	public int getMOLI_InvoiceData_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_InvoiceData_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_invoiceData_UU.
		@param MOLI_invoiceData_UU MOLI_invoiceData_UU
	*/
	public void setMOLI_invoiceData_UU (String MOLI_invoiceData_UU)
	{
		set_Value (COLUMNNAME_MOLI_invoiceData_UU, MOLI_invoiceData_UU);
	}

	/** Get MOLI_invoiceData_UU.
		@return MOLI_invoiceData_UU	  */
	public String getMOLI_invoiceData_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_invoiceData_UU);
	}

	/** Set Name.
		@param MOLI_Name Name
	*/
	public void setMOLI_Name (String MOLI_Name)
	{
		set_Value (COLUMNNAME_MOLI_Name, MOLI_Name);
	}

	/** Get Name.
		@return Name	  */
	public String getMOLI_Name()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Name);
	}

	/** Set Value.
		@param MOLI_Value Value
	*/
	public void setMOLI_Value (String MOLI_Value)
	{
		set_Value (COLUMNNAME_MOLI_Value, MOLI_Value);
	}

	/** Get Value.
		@return Value	  */
	public String getMOLI_Value()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Value);
	}
}