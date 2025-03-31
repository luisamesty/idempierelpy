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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;
import org.compiere.util.Env;

/** Generated Model for MOLI_PeopleCount
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_PeopleCount")
public class X_MOLI_PeopleCount extends PO implements I_MOLI_PeopleCount, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_PeopleCount (Properties ctx, int MOLI_PeopleCount_ID, String trxName)
    {
      super (ctx, MOLI_PeopleCount_ID, trxName);
      /** if (MOLI_PeopleCount_ID == 0)
        {
			setMOLI_PeopleCount_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_PeopleCount (Properties ctx, int MOLI_PeopleCount_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_PeopleCount_ID, trxName, virtualColumns);
      /** if (MOLI_PeopleCount_ID == 0)
        {
			setMOLI_PeopleCount_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_PeopleCount (Properties ctx, String MOLI_PeopleCount_UU, String trxName)
    {
      super (ctx, MOLI_PeopleCount_UU, trxName);
      /** if (MOLI_PeopleCount_UU == null)
        {
			setMOLI_PeopleCount_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_PeopleCount (Properties ctx, String MOLI_PeopleCount_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_PeopleCount_UU, trxName, virtualColumns);
      /** if (MOLI_PeopleCount_UU == null)
        {
			setMOLI_PeopleCount_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_PeopleCount (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_PeopleCount[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public I_M_Locator getM_Locator() throws RuntimeException
	{
		return (I_M_Locator)MTable.get(getCtx(), I_M_Locator.Table_ID)
			.getPO(getM_Locator_ID(), get_TrxName());
	}

	/** Set Locator.
		@param M_Locator_ID Warehouse Locator
	*/
	public void setM_Locator_ID (int M_Locator_ID)
	{
		if (M_Locator_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Locator_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Locator_ID, Integer.valueOf(M_Locator_ID));
	}

	/** Get Locator.
		@return Warehouse Locator
	  */
	public int getM_Locator_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Locator_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set People Counting.
		@param MOLI_PeopleCount_ID People Counting data
	*/
	public void setMOLI_PeopleCount_ID (int MOLI_PeopleCount_ID)
	{
		if (MOLI_PeopleCount_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_PeopleCount_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_PeopleCount_ID, Integer.valueOf(MOLI_PeopleCount_ID));
	}

	/** Get People Counting.
		@return People Counting data
	  */
	public int getMOLI_PeopleCount_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_PeopleCount_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_PeopleCount_UU.
		@param MOLI_PeopleCount_UU MOLI_PeopleCount_UU
	*/
	public void setMOLI_PeopleCount_UU (String MOLI_PeopleCount_UU)
	{
		set_Value (COLUMNNAME_MOLI_PeopleCount_UU, MOLI_PeopleCount_UU);
	}

	/** Get MOLI_PeopleCount_UU.
		@return MOLI_PeopleCount_UU	  */
	public String getMOLI_PeopleCount_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_PeopleCount_UU);
	}

	/** Set Qty Visitors.
		@param MOLI_QtyVistiors Qty Visitors
	*/
	public void setMOLI_QtyVistiors (BigDecimal MOLI_QtyVistiors)
	{
		set_Value (COLUMNNAME_MOLI_QtyVistiors, MOLI_QtyVistiors);
	}

	/** Get Qty Visitors.
		@return Qty Visitors
	  */
	public BigDecimal getMOLI_QtyVistiors()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_QtyVistiors);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Time End.
		@param MOLI_TimeEnd Time End
	*/
	public void setMOLI_TimeEnd (Timestamp MOLI_TimeEnd)
	{
		set_Value (COLUMNNAME_MOLI_TimeEnd, MOLI_TimeEnd);
	}

	/** Get Time End.
		@return Time End
	  */
	public Timestamp getMOLI_TimeEnd()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_TimeEnd);
	}

	/** Set Time Start.
		@param MOLI_TimeStart Time Starting
	*/
	public void setMOLI_TimeStart (Timestamp MOLI_TimeStart)
	{
		set_Value (COLUMNNAME_MOLI_TimeStart, MOLI_TimeStart);
	}

	/** Get Time Start.
		@return Time Starting
	  */
	public Timestamp getMOLI_TimeStart()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_TimeStart);
	}
}