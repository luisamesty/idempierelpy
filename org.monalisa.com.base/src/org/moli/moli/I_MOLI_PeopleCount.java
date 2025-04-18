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

/** Generated Interface for MOLI_PeopleCount
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_PeopleCount 
{

    /** TableName=MOLI_PeopleCount */
    public static final String Table_Name = "MOLI_PeopleCount";

    /** AD_Table_ID=1000077 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

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

    /** Column name M_Locator_ID */
    public static final String COLUMNNAME_M_Locator_ID = "M_Locator_ID";

	/** Set Locator.
	  * Warehouse Locator
	  */
	public void setM_Locator_ID (int M_Locator_ID);

	/** Get Locator.
	  * Warehouse Locator
	  */
	public int getM_Locator_ID();

	public I_M_Locator getM_Locator() throws RuntimeException;

    /** Column name MOLI_PeopleCount_ID */
    public static final String COLUMNNAME_MOLI_PeopleCount_ID = "MOLI_PeopleCount_ID";

	/** Set People Counting.
	  * People Counting data
	  */
	public void setMOLI_PeopleCount_ID (int MOLI_PeopleCount_ID);

	/** Get People Counting.
	  * People Counting data
	  */
	public int getMOLI_PeopleCount_ID();

    /** Column name MOLI_PeopleCount_UU */
    public static final String COLUMNNAME_MOLI_PeopleCount_UU = "MOLI_PeopleCount_UU";

	/** Set MOLI_PeopleCount_UU	  */
	public void setMOLI_PeopleCount_UU (String MOLI_PeopleCount_UU);

	/** Get MOLI_PeopleCount_UU	  */
	public String getMOLI_PeopleCount_UU();

    /** Column name MOLI_QtyVistiors */
    public static final String COLUMNNAME_MOLI_QtyVistiors = "MOLI_QtyVistiors";

	/** Set Qty Visitors.
	  * Qty Visitors
	  */
	public void setMOLI_QtyVistiors (BigDecimal MOLI_QtyVistiors);

	/** Get Qty Visitors.
	  * Qty Visitors
	  */
	public BigDecimal getMOLI_QtyVistiors();

    /** Column name MOLI_TimeEnd */
    public static final String COLUMNNAME_MOLI_TimeEnd = "MOLI_TimeEnd";

	/** Set Time End.
	  * Time End
	  */
	public void setMOLI_TimeEnd (Timestamp MOLI_TimeEnd);

	/** Get Time End.
	  * Time End
	  */
	public Timestamp getMOLI_TimeEnd();

    /** Column name MOLI_TimeStart */
    public static final String COLUMNNAME_MOLI_TimeStart = "MOLI_TimeStart";

	/** Set Time Start.
	  * Time Starting
	  */
	public void setMOLI_TimeStart (Timestamp MOLI_TimeStart);

	/** Get Time Start.
	  * Time Starting
	  */
	public Timestamp getMOLI_TimeStart();

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
