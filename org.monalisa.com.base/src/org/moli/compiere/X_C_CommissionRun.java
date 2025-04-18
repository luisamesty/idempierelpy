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

/** Generated Model for C_CommissionRun
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="C_CommissionRun")
public class X_C_CommissionRun extends PO implements I_C_CommissionRun, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250217L;

    /** Standard Constructor */
    public X_C_CommissionRun (Properties ctx, int C_CommissionRun_ID, String trxName)
    {
      super (ctx, C_CommissionRun_ID, trxName);
      /** if (C_CommissionRun_ID == 0)
        {
			setC_Commission_ID (0);
			setC_CommissionRun_ID (0);
			setDocumentNo (null);
			setGrandTotal (Env.ZERO);
			setProcessed (false);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionRun (Properties ctx, int C_CommissionRun_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CommissionRun_ID, trxName, virtualColumns);
      /** if (C_CommissionRun_ID == 0)
        {
			setC_Commission_ID (0);
			setC_CommissionRun_ID (0);
			setDocumentNo (null);
			setGrandTotal (Env.ZERO);
			setProcessed (false);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionRun (Properties ctx, String C_CommissionRun_UU, String trxName)
    {
      super (ctx, C_CommissionRun_UU, trxName);
      /** if (C_CommissionRun_UU == null)
        {
			setC_Commission_ID (0);
			setC_CommissionRun_ID (0);
			setDocumentNo (null);
			setGrandTotal (Env.ZERO);
			setProcessed (false);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Standard Constructor */
    public X_C_CommissionRun (Properties ctx, String C_CommissionRun_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, C_CommissionRun_UU, trxName, virtualColumns);
      /** if (C_CommissionRun_UU == null)
        {
			setC_Commission_ID (0);
			setC_CommissionRun_ID (0);
			setDocumentNo (null);
			setGrandTotal (Env.ZERO);
			setProcessed (false);
			setStartDate (new Timestamp( System.currentTimeMillis() ));
        } */
    }

    /** Load Constructor */
    public X_C_CommissionRun (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 1 - Org
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
      StringBuilder sb = new StringBuilder ("X_C_CommissionRun[")
        .append(get_ID()).append("]");
      return sb.toString();
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

	/** Set Commission Run.
		@param C_CommissionRun_ID Commission Run or Process
	*/
	public void setC_CommissionRun_ID (int C_CommissionRun_ID)
	{
		if (C_CommissionRun_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_CommissionRun_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_CommissionRun_ID, Integer.valueOf(C_CommissionRun_ID));
	}

	/** Get Commission Run.
		@return Commission Run or Process
	  */
	public int getC_CommissionRun_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_CommissionRun_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set C_CommissionRun_UU.
		@param C_CommissionRun_UU C_CommissionRun_UU
	*/
	public void setC_CommissionRun_UU (String C_CommissionRun_UU)
	{
		set_Value (COLUMNNAME_C_CommissionRun_UU, C_CommissionRun_UU);
	}

	/** Get C_CommissionRun_UU.
		@return C_CommissionRun_UU	  */
	public String getC_CommissionRun_UU()
	{
		return (String)get_Value(COLUMNNAME_C_CommissionRun_UU);
	}

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException
	{
		return (org.compiere.model.I_C_DocType)MTable.get(getCtx(), org.compiere.model.I_C_DocType.Table_ID)
			.getPO(getC_DocType_ID(), get_TrxName());
	}

	/** Set Document Type.
		@param C_DocType_ID Document type or rules
	*/
	public void setC_DocType_ID (int C_DocType_ID)
	{
		if (C_DocType_ID < 0)
			set_Value (COLUMNNAME_C_DocType_ID, null);
		else
			set_Value (COLUMNNAME_C_DocType_ID, Integer.valueOf(C_DocType_ID));
	}

	/** Get Document Type.
		@return Document type or rules
	  */
	public int getC_DocType_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_DocType_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
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

	/** Set Document No.
		@param DocumentNo Document sequence number of the document
	*/
	public void setDocumentNo (String DocumentNo)
	{
		set_Value (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

    /** Get Record ID/ColumnName
        @return ID/ColumnName pair
      */
    public KeyNamePair getKeyNamePair()
    {
        return new KeyNamePair(get_ID(), getDocumentNo());
    }

	/** Set Grand Total.
		@param GrandTotal Total amount of document
	*/
	public void setGrandTotal (BigDecimal GrandTotal)
	{
		set_ValueNoCheck (COLUMNNAME_GrandTotal, GrandTotal);
	}

	/** Get Grand Total.
		@return Total amount of document
	  */
	public BigDecimal getGrandTotal()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_GrandTotal);
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

	/** Set Start Date.
		@param StartDate First effective day (inclusive)
	*/
	public void setStartDate (Timestamp StartDate)
	{
		set_Value (COLUMNNAME_StartDate, StartDate);
	}

	/** Get Start Date.
		@return First effective day (inclusive)
	  */
	public Timestamp getStartDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_StartDate);
	}
}