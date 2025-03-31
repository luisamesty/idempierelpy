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

/** Generated Interface for MOLI_movementData
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_movementData 
{

    /** TableName=MOLI_movementData */
    public static final String Table_Name = "MOLI_movementData";

    /** AD_Table_ID=1000070 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Client.
	  * Client/Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name AD_Org_ID */
    public static final String COLUMNNAME_AD_Org_ID = "AD_Org_ID";

	/** Set Organization.
	  * Organizational entity within client
	  */
	public void setAD_Org_ID (int AD_Org_ID);

	/** Get Organization.
	  * Organizational entity within client
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

    /** Column name M_Movement_ID */
    public static final String COLUMNNAME_M_Movement_ID = "M_Movement_ID";

	/** Set Inventory Move.
	  * Movement of Inventory
	  */
	public void setM_Movement_ID (int M_Movement_ID);

	/** Get Inventory Move.
	  * Movement of Inventory
	  */
	public int getM_Movement_ID();

	public org.compiere.model.I_M_Movement getM_Movement() throws RuntimeException;

    /** Column name MOLI_Cdc */
    public static final String COLUMNNAME_MOLI_Cdc = "MOLI_Cdc";

	/** Set CDC	  */
	public void setMOLI_Cdc (String MOLI_Cdc);

	/** Get CDC	  */
	public String getMOLI_Cdc();

    /** Column name MOLI_FsError */
    public static final String COLUMNNAME_MOLI_FsError = "MOLI_FsError";

	/** Set Fs Error	  */
	public void setMOLI_FsError (String MOLI_FsError);

	/** Get Fs Error	  */
	public String getMOLI_FsError();

    /** Column name MOLI_FsMessage */
    public static final String COLUMNNAME_MOLI_FsMessage = "MOLI_FsMessage";

	/** Set Fs Message	  */
	public void setMOLI_FsMessage (String MOLI_FsMessage);

	/** Get Fs Message	  */
	public String getMOLI_FsMessage();

    /** Column name MOLI_FsPaused */
    public static final String COLUMNNAME_MOLI_FsPaused = "MOLI_FsPaused";

	/** Set Fs Paused	  */
	public void setMOLI_FsPaused (String MOLI_FsPaused);

	/** Get Fs Paused	  */
	public String getMOLI_FsPaused();

    /** Column name MOLI_FsStatus */
    public static final String COLUMNNAME_MOLI_FsStatus = "MOLI_FsStatus";

	/** Set Fs Status	  */
	public void setMOLI_FsStatus (String MOLI_FsStatus);

	/** Get Fs Status	  */
	public String getMOLI_FsStatus();

    /** Column name MOLI_movementData_ID */
    public static final String COLUMNNAME_MOLI_movementData_ID = "MOLI_movementData_ID";

	/** Set MOLI_movementData	  */
	public void setMOLI_movementData_ID (int MOLI_movementData_ID);

	/** Get MOLI_movementData	  */
	public int getMOLI_movementData_ID();

    /** Column name MOLI_movementData_UU */
    public static final String COLUMNNAME_MOLI_movementData_UU = "MOLI_movementData_UU";

	/** Set MOLI_movementData_UU	  */
	public void setMOLI_movementData_UU (String MOLI_movementData_UU);

	/** Get MOLI_movementData_UU	  */
	public String getMOLI_movementData_UU();

    /** Column name MOLI_Name */
    public static final String COLUMNNAME_MOLI_Name = "MOLI_Name";

	/** Set Name	  */
	public void setMOLI_Name (String MOLI_Name);

	/** Get Name	  */
	public String getMOLI_Name();

    /** Column name MOLI_Value */
    public static final String COLUMNNAME_MOLI_Value = "MOLI_Value";

	/** Set Value	  */
	public void setMOLI_Value (String MOLI_Value);

	/** Get Value	  */
	public String getMOLI_Value();

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
