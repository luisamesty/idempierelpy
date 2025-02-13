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

/** Generated Model for MOLI_movementData
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_movementData")
public class X_MOLI_movementData extends PO implements I_MOLI_movementData, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_movementData (Properties ctx, int MOLI_movementData_ID, String trxName)
    {
      super (ctx, MOLI_movementData_ID, trxName);
      /** if (MOLI_movementData_ID == 0)
        {
			setMOLI_movementData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_movementData (Properties ctx, int MOLI_movementData_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_movementData_ID, trxName, virtualColumns);
      /** if (MOLI_movementData_ID == 0)
        {
			setMOLI_movementData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_movementData (Properties ctx, String MOLI_movementData_UU, String trxName)
    {
      super (ctx, MOLI_movementData_UU, trxName);
      /** if (MOLI_movementData_UU == null)
        {
			setMOLI_movementData_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_movementData (Properties ctx, String MOLI_movementData_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_movementData_UU, trxName, virtualColumns);
      /** if (MOLI_movementData_UU == null)
        {
			setMOLI_movementData_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_movementData (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_movementData[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_M_Movement getM_Movement() throws RuntimeException
	{
		return (org.compiere.model.I_M_Movement)MTable.get(getCtx(), org.compiere.model.I_M_Movement.Table_ID)
			.getPO(getM_Movement_ID(), get_TrxName());
	}

	/** Set Inventory Move.
		@param M_Movement_ID Movement of Inventory
	*/
	public void setM_Movement_ID (int M_Movement_ID)
	{
		if (M_Movement_ID < 1)
			set_ValueNoCheck (COLUMNNAME_M_Movement_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_M_Movement_ID, Integer.valueOf(M_Movement_ID));
	}

	/** Get Inventory Move.
		@return Movement of Inventory
	  */
	public int getM_Movement_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_M_Movement_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set CDC.
		@param MOLI_Cdc CDC
	*/
	public void setMOLI_Cdc (String MOLI_Cdc)
	{
		set_Value (COLUMNNAME_MOLI_Cdc, MOLI_Cdc);
	}

	/** Get CDC.
		@return CDC	  */
	public String getMOLI_Cdc()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Cdc);
	}

	/** Set Fs Error.
		@param MOLI_FsError Fs Error
	*/
	public void setMOLI_FsError (String MOLI_FsError)
	{
		set_Value (COLUMNNAME_MOLI_FsError, MOLI_FsError);
	}

	/** Get Fs Error.
		@return Fs Error	  */
	public String getMOLI_FsError()
	{
		return (String)get_Value(COLUMNNAME_MOLI_FsError);
	}

	/** Set Fs Message.
		@param MOLI_FsMessage Fs Message
	*/
	public void setMOLI_FsMessage (String MOLI_FsMessage)
	{
		set_Value (COLUMNNAME_MOLI_FsMessage, MOLI_FsMessage);
	}

	/** Get Fs Message.
		@return Fs Message	  */
	public String getMOLI_FsMessage()
	{
		return (String)get_Value(COLUMNNAME_MOLI_FsMessage);
	}

	/** -- = 00 */
	public static final String MOLI_FSPAUSED___ = "00";
	/** Pausado = 01 */
	public static final String MOLI_FSPAUSED_Pausado = "01";
	/** Set Fs Paused.
		@param MOLI_FsPaused Fs Paused
	*/
	public void setMOLI_FsPaused (String MOLI_FsPaused)
	{

		set_Value (COLUMNNAME_MOLI_FsPaused, MOLI_FsPaused);
	}

	/** Get Fs Paused.
		@return Fs Paused	  */
	public String getMOLI_FsPaused()
	{
		return (String)get_Value(COLUMNNAME_MOLI_FsPaused);
	}

	/** Generado = 00 */
	public static final String MOLI_FSSTATUS_Generado = "00";
	/** Enviado en un Lote = 01 */
	public static final String MOLI_FSSTATUS_EnviadoEnUnLote = "01";
	/** Aprobado = 02 */
	public static final String MOLI_FSSTATUS_Aprobado = "02";
	/** Aprobado con observación = 03 */
	public static final String MOLI_FSSTATUS_AprobadoConObservación = "03";
	/** Rechazado = 04 */
	public static final String MOLI_FSSTATUS_Rechazado = "04";
	/** Borrador = -1 */
	public static final String MOLI_FSSTATUS_Borrador = "-1";
	/** Inutilizado = 97 */
	public static final String MOLI_FSSTATUS_Inutilizado = "97";
	/** Inexistente = 98 */
	public static final String MOLI_FSSTATUS_Inexistente = "98";
	/** Cancelado = 99 */
	public static final String MOLI_FSSTATUS_Cancelado = "99";
	/** Set Fs Status.
		@param MOLI_FsStatus Fs Status
	*/
	public void setMOLI_FsStatus (String MOLI_FsStatus)
	{

		set_Value (COLUMNNAME_MOLI_FsStatus, MOLI_FsStatus);
	}

	/** Get Fs Status.
		@return Fs Status	  */
	public String getMOLI_FsStatus()
	{
		return (String)get_Value(COLUMNNAME_MOLI_FsStatus);
	}

	/** Set MOLI_movementData.
		@param MOLI_movementData_ID MOLI_movementData
	*/
	public void setMOLI_movementData_ID (int MOLI_movementData_ID)
	{
		if (MOLI_movementData_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_movementData_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_movementData_ID, Integer.valueOf(MOLI_movementData_ID));
	}

	/** Get MOLI_movementData.
		@return MOLI_movementData	  */
	public int getMOLI_movementData_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_movementData_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_movementData_UU.
		@param MOLI_movementData_UU MOLI_movementData_UU
	*/
	public void setMOLI_movementData_UU (String MOLI_movementData_UU)
	{
		set_Value (COLUMNNAME_MOLI_movementData_UU, MOLI_movementData_UU);
	}

	/** Get MOLI_movementData_UU.
		@return MOLI_movementData_UU	  */
	public String getMOLI_movementData_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_movementData_UU);
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