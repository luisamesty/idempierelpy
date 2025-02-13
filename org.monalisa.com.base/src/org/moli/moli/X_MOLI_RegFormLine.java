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
import java.sql.Timestamp;
import java.util.Properties;
import org.compiere.model.*;

/** Generated Model for MOLI_RegFormLine
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_RegFormLine")
public class X_MOLI_RegFormLine extends PO implements I_MOLI_RegFormLine, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_RegFormLine (Properties ctx, int MOLI_RegFormLine_ID, String trxName)
    {
      super (ctx, MOLI_RegFormLine_ID, trxName);
      /** if (MOLI_RegFormLine_ID == 0)
        {
			setMOLI_ActionRequired (false);
// N
			setMOLI_IsCartaPoder (false);
// N
			setMOLI_IsCDAR (false);
// N
			setMOLI_IsCLV (false);
// N
			setMOLI_IsFormula (false);
// N
			setMOLI_IsGMP (false);
// N
			setMOLI_IsKBIS (false);
// N
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormLine (Properties ctx, int MOLI_RegFormLine_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegFormLine_ID, trxName, virtualColumns);
      /** if (MOLI_RegFormLine_ID == 0)
        {
			setMOLI_ActionRequired (false);
// N
			setMOLI_IsCartaPoder (false);
// N
			setMOLI_IsCDAR (false);
// N
			setMOLI_IsCLV (false);
// N
			setMOLI_IsFormula (false);
// N
			setMOLI_IsGMP (false);
// N
			setMOLI_IsKBIS (false);
// N
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormLine (Properties ctx, String MOLI_RegFormLine_UU, String trxName)
    {
      super (ctx, MOLI_RegFormLine_UU, trxName);
      /** if (MOLI_RegFormLine_UU == null)
        {
			setMOLI_ActionRequired (false);
// N
			setMOLI_IsCartaPoder (false);
// N
			setMOLI_IsCDAR (false);
// N
			setMOLI_IsCLV (false);
// N
			setMOLI_IsFormula (false);
// N
			setMOLI_IsGMP (false);
// N
			setMOLI_IsKBIS (false);
// N
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormLine_ID (0);
			setName (null);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegFormLine (Properties ctx, String MOLI_RegFormLine_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegFormLine_UU, trxName, virtualColumns);
      /** if (MOLI_RegFormLine_UU == null)
        {
			setMOLI_ActionRequired (false);
// N
			setMOLI_IsCartaPoder (false);
// N
			setMOLI_IsCDAR (false);
// N
			setMOLI_IsCLV (false);
// N
			setMOLI_IsFormula (false);
// N
			setMOLI_IsGMP (false);
// N
			setMOLI_IsKBIS (false);
// N
			setMOLI_RegForm_ID (0);
			setMOLI_RegFormLine_ID (0);
			setName (null);
        } */
    }

    /** Load Constructor */
    public X_MOLI_RegFormLine (Properties ctx, ResultSet rs, String trxName)
    {
      super (ctx, rs, trxName);
    }

    /** AccessLevel
      * @return 6 - System - Client
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
      StringBuilder sb = new StringBuilder ("X_MOLI_RegFormLine[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Date.
		@param Date1 Date when business is not conducted
	*/
	public void setDate1 (Timestamp Date1)
	{
		set_Value (COLUMNNAME_Date1, Date1);
	}

	/** Get Date.
		@return Date when business is not conducted
	  */
	public Timestamp getDate1()
	{
		return (Timestamp)get_Value(COLUMNNAME_Date1);
	}

	/** Set Transaction Date.
		@param DateTrx Transaction Date
	*/
	public void setDateTrx (Timestamp DateTrx)
	{
		set_Value (COLUMNNAME_DateTrx, DateTrx);
	}

	/** Get Transaction Date.
		@return Transaction Date
	  */
	public Timestamp getDateTrx()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateTrx);
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

	/** Set Accion Requerida.
		@param MOLI_ActionRequired Accion Requerida
	*/
	public void setMOLI_ActionRequired (boolean MOLI_ActionRequired)
	{
		set_Value (COLUMNNAME_MOLI_ActionRequired, Boolean.valueOf(MOLI_ActionRequired));
	}

	/** Get Accion Requerida.
		@return Accion Requerida	  */
	public boolean isMOLI_ActionRequired()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_ActionRequired);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Fecah CDAR.
		@param MOLI_DateCDAR Fecah CDAR
	*/
	public void setMOLI_DateCDAR (Timestamp MOLI_DateCDAR)
	{
		set_Value (COLUMNNAME_MOLI_DateCDAR, MOLI_DateCDAR);
	}

	/** Get Fecah CDAR.
		@return Fecah CDAR	  */
	public Timestamp getMOLI_DateCDAR()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateCDAR);
	}

	/** Set Fecha CLV.
		@param MOLI_DateCLV Fecha CLV
	*/
	public void setMOLI_DateCLV (Timestamp MOLI_DateCLV)
	{
		set_Value (COLUMNNAME_MOLI_DateCLV, MOLI_DateCLV);
	}

	/** Get Fecha CLV.
		@return Fecha CLV	  */
	public Timestamp getMOLI_DateCLV()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateCLV);
	}

	/** Set Fecha CP.
		@param MOLI_DateCP Fecha CP
	*/
	public void setMOLI_DateCP (Timestamp MOLI_DateCP)
	{
		set_Value (COLUMNNAME_MOLI_DateCP, MOLI_DateCP);
	}

	/** Get Fecha CP.
		@return Fecha CP	  */
	public Timestamp getMOLI_DateCP()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateCP);
	}

	/** Set Fecha Formula.
		@param MOLI_DateFormula Fecha Formula
	*/
	public void setMOLI_DateFormula (Timestamp MOLI_DateFormula)
	{
		set_Value (COLUMNNAME_MOLI_DateFormula, MOLI_DateFormula);
	}

	/** Get Fecha Formula.
		@return Fecha Formula	  */
	public Timestamp getMOLI_DateFormula()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateFormula);
	}

	/** Set Fecha GMP.
		@param MOLI_DateGMP Fecha GMP
	*/
	public void setMOLI_DateGMP (Timestamp MOLI_DateGMP)
	{
		set_Value (COLUMNNAME_MOLI_DateGMP, MOLI_DateGMP);
	}

	/** Get Fecha GMP.
		@return Fecha GMP	  */
	public Timestamp getMOLI_DateGMP()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateGMP);
	}

	/** Set Fecha KBISS.
		@param MOLI_DateKBIS Fecha KBISS
	*/
	public void setMOLI_DateKBIS (Timestamp MOLI_DateKBIS)
	{
		set_Value (COLUMNNAME_MOLI_DateKBIS, MOLI_DateKBIS);
	}

	/** Get Fecha KBISS.
		@return Fecha KBISS	  */
	public Timestamp getMOLI_DateKBIS()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_DateKBIS);
	}

	/** Set Es carta Poder.
		@param MOLI_IsCartaPoder Es carta Poder
	*/
	public void setMOLI_IsCartaPoder (boolean MOLI_IsCartaPoder)
	{
		set_Value (COLUMNNAME_MOLI_IsCartaPoder, Boolean.valueOf(MOLI_IsCartaPoder));
	}

	/** Get Es carta Poder.
		@return Es carta Poder	  */
	public boolean isMOLI_IsCartaPoder()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsCartaPoder);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Es CDAR.
		@param MOLI_IsCDAR Es CDAR
	*/
	public void setMOLI_IsCDAR (boolean MOLI_IsCDAR)
	{
		set_Value (COLUMNNAME_MOLI_IsCDAR, Boolean.valueOf(MOLI_IsCDAR));
	}

	/** Get Es CDAR.
		@return Es CDAR	  */
	public boolean isMOLI_IsCDAR()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsCDAR);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Es CLV.
		@param MOLI_IsCLV Es CLV
	*/
	public void setMOLI_IsCLV (boolean MOLI_IsCLV)
	{
		set_Value (COLUMNNAME_MOLI_IsCLV, Boolean.valueOf(MOLI_IsCLV));
	}

	/** Get Es CLV.
		@return Es CLV	  */
	public boolean isMOLI_IsCLV()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsCLV);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Es Formula.
		@param MOLI_IsFormula Es Formula
	*/
	public void setMOLI_IsFormula (boolean MOLI_IsFormula)
	{
		set_Value (COLUMNNAME_MOLI_IsFormula, Boolean.valueOf(MOLI_IsFormula));
	}

	/** Get Es Formula.
		@return Es Formula	  */
	public boolean isMOLI_IsFormula()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsFormula);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Es GMP.
		@param MOLI_IsGMP Es GMP
	*/
	public void setMOLI_IsGMP (boolean MOLI_IsGMP)
	{
		set_Value (COLUMNNAME_MOLI_IsGMP, Boolean.valueOf(MOLI_IsGMP));
	}

	/** Get Es GMP.
		@return Es GMP	  */
	public boolean isMOLI_IsGMP()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsGMP);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Es KBISS.
		@param MOLI_IsKBIS Es KBISS
	*/
	public void setMOLI_IsKBIS (boolean MOLI_IsKBIS)
	{
		set_Value (COLUMNNAME_MOLI_IsKBIS, Boolean.valueOf(MOLI_IsKBIS));
	}

	/** Get Es KBISS.
		@return Es KBISS	  */
	public boolean isMOLI_IsKBIS()
	{
		Object oo = get_Value(COLUMNNAME_MOLI_IsKBIS);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	public I_MOLI_RegForm getMOLI_RegForm() throws RuntimeException
	{
		return (I_MOLI_RegForm)MTable.get(getCtx(), I_MOLI_RegForm.Table_ID)
			.getPO(getMOLI_RegForm_ID(), get_TrxName());
	}

	/** Set Regulation Form ID.
		@param MOLI_RegForm_ID Regulation Form ID
	*/
	public void setMOLI_RegForm_ID (int MOLI_RegForm_ID)
	{
		if (MOLI_RegForm_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_RegForm_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_RegForm_ID, Integer.valueOf(MOLI_RegForm_ID));
	}

	/** Get Regulation Form ID.
		@return Regulation Form ID	  */
	public int getMOLI_RegForm_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_RegForm_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Regulation Form Line.
		@param MOLI_RegFormLine_ID Regulation Form Line
	*/
	public void setMOLI_RegFormLine_ID (int MOLI_RegFormLine_ID)
	{
		if (MOLI_RegFormLine_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_RegFormLine_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_RegFormLine_ID, Integer.valueOf(MOLI_RegFormLine_ID));
	}

	/** Get Regulation Form Line.
		@return Regulation Form Line
	  */
	public int getMOLI_RegFormLine_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_RegFormLine_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Regulation_Form_Line_UU.
		@param MOLI_RegFormLine_UU Regulation_Form_Line_UU
	*/
	public void setMOLI_RegFormLine_UU (String MOLI_RegFormLine_UU)
	{
		set_Value (COLUMNNAME_MOLI_RegFormLine_UU, MOLI_RegFormLine_UU);
	}

	/** Get Regulation_Form_Line_UU.
		@return Regulation_Form_Line_UU	  */
	public String getMOLI_RegFormLine_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegFormLine_UU);
	}

	/** Applyed Process = AP */
	public static final String MOLI_RGMSTATUS_ApplyedProcess = "AP";
	/** Cancelled = CA */
	public static final String MOLI_RGMSTATUS_Cancelled = "CA";
	/** Correction = CO */
	public static final String MOLI_RGMSTATUS_Correction = "CO";
	/** Denied = DN */
	public static final String MOLI_RGMSTATUS_Denied = "DN";
	/** Draft = DR */
	public static final String MOLI_RGMSTATUS_Draft = "DR";
	/** Expired = EX */
	public static final String MOLI_RGMSTATUS_Expired = "EX";
	/** Issued = IS */
	public static final String MOLI_RGMSTATUS_Issued = "IS";
	/** OK = OK */
	public static final String MOLI_RGMSTATUS_OK = "OK";
	/** Pending = PE */
	public static final String MOLI_RGMSTATUS_Pending = "PE";
	/** Renewed = RE */
	public static final String MOLI_RGMSTATUS_Renewed = "RE";
	/** Set Rgm Status.
		@param MOLI_RgmStatus Rgm Status
	*/
	public void setMOLI_RgmStatus (String MOLI_RgmStatus)
	{

		set_Value (COLUMNNAME_MOLI_RgmStatus, MOLI_RgmStatus);
	}

	/** Get Rgm Status.
		@return Rgm Status	  */
	public String getMOLI_RgmStatus()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RgmStatus);
	}

	/** Prerequisito Exportador = PE */
	public static final String MOLI_STATUSTYPE_PrerequisitoExportador = "PE";
	/** Prerequisito Fabricante = PF */
	public static final String MOLI_STATUSTYPE_PrerequisitoFabricante = "PF";
	/** Prerequisito Importador = PI */
	public static final String MOLI_STATUSTYPE_PrerequisitoImportador = "PI";
	/** Prerequisito Otros = PO */
	public static final String MOLI_STATUSTYPE_PrerequisitoOtros = "PO";
	/** Proceso = PR */
	public static final String MOLI_STATUSTYPE_Proceso = "PR";
	/** Proceso Renovacion = RE */
	public static final String MOLI_STATUSTYPE_ProcesoRenovacion = "RE";
	/** Set Tipo de Estado.
		@param MOLI_StatusType Tipo de Estado
	*/
	public void setMOLI_StatusType (String MOLI_StatusType)
	{

		set_Value (COLUMNNAME_MOLI_StatusType, MOLI_StatusType);
	}

	/** Get Tipo de Estado.
		@return Tipo de Estado	  */
	public String getMOLI_StatusType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_StatusType);
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