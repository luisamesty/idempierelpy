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
package org.moli.moli;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for MOLI_RegFormLine
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_RegFormLine 
{

    /** TableName=MOLI_RegFormLine */
    public static final String Table_Name = "MOLI_RegFormLine";

    /** AD_Table_ID=1000086 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 6 - System - Client 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(6);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within tenant
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within tenant
	  */
	public int getAD_Org_ID();

    /** Column name Created */
    public static final String COLUMNNAME_Created = "Created";

	/** Get Created.
	  * Date this record was created
	  */
	public Timestamp getCreated();

    /** Column name CreatedBy */
    public static final String COLUMNNAME_CreatedBy = "CreatedBy";

	/** Get Created By.
	  * User who created this records
	  */
	public int getCreatedBy();

    /** Column name Date1 */
    public static final String COLUMNNAME_Date1 = "Date1";

	/** Set Date.
	  * Date when business is not conducted
	  */
	public void setDate1 (Timestamp Date1);

	/** Get Date.
	  * Date when business is not conducted
	  */
	public Timestamp getDate1();

    /** Column name DateTrx */
    public static final String COLUMNNAME_DateTrx = "DateTrx";

	/** Set Transaction Date.
	  * Transaction Date
	  */
	public void setDateTrx (Timestamp DateTrx);

	/** Get Transaction Date.
	  * Transaction Date
	  */
	public Timestamp getDateTrx();

    /** Column name Description */
    public static final String COLUMNNAME_Description = "Description";

	/** Set Description.
	  * Optional short description of the record
	  */
	public void setDescription (String Description);

	/** Get Description.
	  * Optional short description of the record
	  */
	public String getDescription();

    /** Column name DocumentNo */
    public static final String COLUMNNAME_DocumentNo = "DocumentNo";

	/** Set Document No.
	  * Document sequence number of the document
	  */
	public void setDocumentNo (String DocumentNo);

	/** Get Document No.
	  * Document sequence number of the document
	  */
	public String getDocumentNo();

    /** Column name Help */
    public static final String COLUMNNAME_Help = "Help";

	/** Set Comment/Help.
	  * Comment or Hint
	  */
	public void setHelp (String Help);

	/** Get Comment/Help.
	  * Comment or Hint
	  */
	public String getHelp();

    /** Column name IsActive */
    public static final String COLUMNNAME_IsActive = "IsActive";

	/** Set Active.
	  * The record is active in the system
	  */
	public void setIsActive (boolean IsActive);

	/** Get Active.
	  * The record is active in the system
	  */
	public boolean isActive();

    /** Column name MOLI_ActionRequired */
    public static final String COLUMNNAME_MOLI_ActionRequired = "MOLI_ActionRequired";

	/** Set Accion Requerida	  */
	public void setMOLI_ActionRequired (boolean MOLI_ActionRequired);

	/** Get Accion Requerida	  */
	public boolean isMOLI_ActionRequired();

    /** Column name MOLI_DateCDAR */
    public static final String COLUMNNAME_MOLI_DateCDAR = "MOLI_DateCDAR";

	/** Set Fecah CDAR	  */
	public void setMOLI_DateCDAR (Timestamp MOLI_DateCDAR);

	/** Get Fecah CDAR	  */
	public Timestamp getMOLI_DateCDAR();

    /** Column name MOLI_DateCLV */
    public static final String COLUMNNAME_MOLI_DateCLV = "MOLI_DateCLV";

	/** Set Fecha CLV	  */
	public void setMOLI_DateCLV (Timestamp MOLI_DateCLV);

	/** Get Fecha CLV	  */
	public Timestamp getMOLI_DateCLV();

    /** Column name MOLI_DateCP */
    public static final String COLUMNNAME_MOLI_DateCP = "MOLI_DateCP";

	/** Set Fecha CP	  */
	public void setMOLI_DateCP (Timestamp MOLI_DateCP);

	/** Get Fecha CP	  */
	public Timestamp getMOLI_DateCP();

    /** Column name MOLI_DateFormula */
    public static final String COLUMNNAME_MOLI_DateFormula = "MOLI_DateFormula";

	/** Set Fecha Formula	  */
	public void setMOLI_DateFormula (Timestamp MOLI_DateFormula);

	/** Get Fecha Formula	  */
	public Timestamp getMOLI_DateFormula();

    /** Column name MOLI_DateGMP */
    public static final String COLUMNNAME_MOLI_DateGMP = "MOLI_DateGMP";

	/** Set Fecha GMP	  */
	public void setMOLI_DateGMP (Timestamp MOLI_DateGMP);

	/** Get Fecha GMP	  */
	public Timestamp getMOLI_DateGMP();

    /** Column name MOLI_DateKBIS */
    public static final String COLUMNNAME_MOLI_DateKBIS = "MOLI_DateKBIS";

	/** Set Fecha KBISS	  */
	public void setMOLI_DateKBIS (Timestamp MOLI_DateKBIS);

	/** Get Fecha KBISS	  */
	public Timestamp getMOLI_DateKBIS();

    /** Column name MOLI_IsCartaPoder */
    public static final String COLUMNNAME_MOLI_IsCartaPoder = "MOLI_IsCartaPoder";

	/** Set Es carta Poder	  */
	public void setMOLI_IsCartaPoder (boolean MOLI_IsCartaPoder);

	/** Get Es carta Poder	  */
	public boolean isMOLI_IsCartaPoder();

    /** Column name MOLI_IsCDAR */
    public static final String COLUMNNAME_MOLI_IsCDAR = "MOLI_IsCDAR";

	/** Set Es CDAR	  */
	public void setMOLI_IsCDAR (boolean MOLI_IsCDAR);

	/** Get Es CDAR	  */
	public boolean isMOLI_IsCDAR();

    /** Column name MOLI_IsCLV */
    public static final String COLUMNNAME_MOLI_IsCLV = "MOLI_IsCLV";

	/** Set Es CLV	  */
	public void setMOLI_IsCLV (boolean MOLI_IsCLV);

	/** Get Es CLV	  */
	public boolean isMOLI_IsCLV();

    /** Column name MOLI_IsFormula */
    public static final String COLUMNNAME_MOLI_IsFormula = "MOLI_IsFormula";

	/** Set Es Formula	  */
	public void setMOLI_IsFormula (boolean MOLI_IsFormula);

	/** Get Es Formula	  */
	public boolean isMOLI_IsFormula();

    /** Column name MOLI_IsGMP */
    public static final String COLUMNNAME_MOLI_IsGMP = "MOLI_IsGMP";

	/** Set Es GMP	  */
	public void setMOLI_IsGMP (boolean MOLI_IsGMP);

	/** Get Es GMP	  */
	public boolean isMOLI_IsGMP();

    /** Column name MOLI_IsKBIS */
    public static final String COLUMNNAME_MOLI_IsKBIS = "MOLI_IsKBIS";

	/** Set Es KBISS	  */
	public void setMOLI_IsKBIS (boolean MOLI_IsKBIS);

	/** Get Es KBISS	  */
	public boolean isMOLI_IsKBIS();

    /** Column name MOLI_RegForm_ID */
    public static final String COLUMNNAME_MOLI_RegForm_ID = "MOLI_RegForm_ID";

	/** Set Regulation Form ID	  */
	public void setMOLI_RegForm_ID (int MOLI_RegForm_ID);

	/** Get Regulation Form ID	  */
	public int getMOLI_RegForm_ID();

	public I_MOLI_RegForm getMOLI_RegForm() throws RuntimeException;

    /** Column name MOLI_RegFormLine_ID */
    public static final String COLUMNNAME_MOLI_RegFormLine_ID = "MOLI_RegFormLine_ID";

	/** Set Regulation Form Line.
	  * Regulation Form Line
	  */
	public void setMOLI_RegFormLine_ID (int MOLI_RegFormLine_ID);

	/** Get Regulation Form Line.
	  * Regulation Form Line
	  */
	public int getMOLI_RegFormLine_ID();

    /** Column name MOLI_RegFormLine_UU */
    public static final String COLUMNNAME_MOLI_RegFormLine_UU = "MOLI_RegFormLine_UU";

	/** Set Regulation_Form_Line_UU	  */
	public void setMOLI_RegFormLine_UU (String MOLI_RegFormLine_UU);

	/** Get Regulation_Form_Line_UU	  */
	public String getMOLI_RegFormLine_UU();

    /** Column name MOLI_RgmStatus */
    public static final String COLUMNNAME_MOLI_RgmStatus = "MOLI_RgmStatus";

	/** Set Rgm Status	  */
	public void setMOLI_RgmStatus (String MOLI_RgmStatus);

	/** Get Rgm Status	  */
	public String getMOLI_RgmStatus();

    /** Column name MOLI_StatusType */
    public static final String COLUMNNAME_MOLI_StatusType = "MOLI_StatusType";

	/** Set Tipo de Estado	  */
	public void setMOLI_StatusType (String MOLI_StatusType);

	/** Get Tipo de Estado	  */
	public String getMOLI_StatusType();

    /** Column name Name */
    public static final String COLUMNNAME_Name = "Name";

	/** Set Name.
	  * Alphanumeric identifier of the entity
	  */
	public void setName (String Name);

	/** Get Name.
	  * Alphanumeric identifier of the entity
	  */
	public String getName();

    /** Column name Updated */
    public static final String COLUMNNAME_Updated = "Updated";

	/** Get Updated.
	  * Date this record was updated
	  */
	public Timestamp getUpdated();

    /** Column name UpdatedBy */
    public static final String COLUMNNAME_UpdatedBy = "UpdatedBy";

	/** Get Updated By.
	  * User who updated this records
	  */
	public int getUpdatedBy();
}
