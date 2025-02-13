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

/** Generated Model for MOLI_inOutData
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_inOutData")
public class X_MOLI_inOutData extends PO implements I_MOLI_inOutData, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_inOutData (Properties ctx, int MOLI_inOutData_ID, String trxName)
    {
      super (ctx, MOLI_inOutData_ID, trxName);
      /** if (MOLI_inOutData_ID == 0)
        {
			setMOLI_inOutData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_inOutData (Properties ctx, int MOLI_inOutData_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_inOutData_ID, trxName, virtualColumns);
      /** if (MOLI_inOutData_ID == 0)
        {
			setMOLI_inOutData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_inOutData (Properties ctx, String MOLI_inOutData_UU, String trxName)
    {
      super (ctx, MOLI_inOutData_UU, trxName);
      /** if (MOLI_inOutData_UU == null)
        {
			setMOLI_inOutData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_inOutData (Properties ctx, String MOLI_inOutData_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_inOutData_UU, trxName, virtualColumns);
      /** if (MOLI_inOutData_UU == null)
        {
			setMOLI_inOutData_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_inOutData (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_inOutData[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_M_InOut getM_InOut() throws RuntimeException
	{
		return (org.compiere.model.I_M_InOut)MTable.get(getCtx(), org.compiere.model.I_M_InOut.Table_ID)
			.getPO(getM_InOut_ID(), get_TrxName());
	}

	/** Set Shipment/Receipt.
		@param M_InOut_ID Material Shipment Document
	*/
	public void setM_InOut_ID (int M_InOut_ID)
	{
		if (M_InOut_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_InOut_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_InOut_ID, Integer.valueOf(M_InOut_ID));
	}

	/** Get Shipment/Receipt.
		@return Material Shipment Document
	  */
	public int getM_InOut_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_InOut_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_inOutData.
		@param MOLI_inOutData_ID MOLI_inOutData
	*/
	public void setMOLI_inOutData_ID (int MOLI_inOutData_ID)
	{
		if (MOLI_inOutData_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_inOutData_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_inOutData_ID, Integer.valueOf(MOLI_inOutData_ID));
	}

	/** Get MOLI_inOutData.
		@return MOLI_inOutData	  */
	public int getMOLI_inOutData_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_inOutData_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_inOutData_UU.
		@param MOLI_inOutData_UU MOLI_inOutData_UU
	*/
	public void setMOLI_inOutData_UU (String MOLI_inOutData_UU)
	{
		set_Value (COLUMNNAME_MOLI_inOutData_UU, MOLI_inOutData_UU);
	}

	/** Get MOLI_inOutData_UU.
		@return MOLI_inOutData_UU	  */
	public String getMOLI_inOutData_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_inOutData_UU);
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