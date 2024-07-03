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
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for MOLI_GEOREFCODE
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_GeoRefCode 
{

    /** TableName=MOLI_GEOREFCODE */
    public static final String Table_Name = "MOLI_GEOREFCODE";

    /** AD_Table_ID=1000068 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 4 - System 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(4);

    /** Load Meta Data */

    /** Column name MOLI_GeoRefCode_DepartmentKey */
    public static final String COLUMNNAME_MOLI_GeoRefCode_DepartmentKey = "MOLI_GeoRefCode_DepartmentKey";

	/** Set Geo Ref Code Department Key	  */
	public void setMOLI_GeoRefCode_DepartmentKey (String MOLI_GeoRefCode_DepartmentKey);

	/** Get Geo Ref Code Department Key	  */
	public String getMOLI_GeoRefCode_DepartmentKey();

    /** Column name MOLI_GeoRefCode_DepartmentName */
    public static final String COLUMNNAME_MOLI_GeoRefCode_DepartmentName = "MOLI_GeoRefCode_DepartmentName";

	/** Set Geo Ref Code Department Name	  */
	public void setMOLI_GeoRefCode_DepartmentName (String MOLI_GeoRefCode_DepartmentName);

	/** Get Geo Ref Code Department Name	  */
	public String getMOLI_GeoRefCode_DepartmentName();

    /** Column name MOLI_GeoRefCode_Id */
    public static final String COLUMNNAME_MOLI_GeoRefCode_Id = "MOLI_GeoRefCode_Id";

	/** Set Geo Ref Code ID	  */
	public void setMOLI_GeoRefCode_Id (int MOLI_GeoRefCode_Id);

	/** Get Geo Ref Code ID	  */
	public int getMOLI_GeoRefCode_Id();

    /** Column name MOLI_GeoRefCode_SectionKey */
    public static final String COLUMNNAME_MOLI_GeoRefCode_SectionKey = "MOLI_GeoRefCode_SectionKey";

	/** Set Geo Ref Code Section Key	  */
	public void setMOLI_GeoRefCode_SectionKey (String MOLI_GeoRefCode_SectionKey);

	/** Get Geo Ref Code Section Key	  */
	public String getMOLI_GeoRefCode_SectionKey();

    /** Column name MOLI_GeoRefCode_SectionName */
    public static final String COLUMNNAME_MOLI_GeoRefCode_SectionName = "MOLI_GeoRefCode_SectionName";

	/** Set Geo Ref Code Section Name	  */
	public void setMOLI_GeoRefCode_SectionName (String MOLI_GeoRefCode_SectionName);

	/** Get Geo Ref Code Section Name	  */
	public String getMOLI_GeoRefCode_SectionName();

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

    /** Column name Value */
    public static final String COLUMNNAME_Value = "Value";

	/** Set Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public void setValue (String Value);

	/** Get Search Key.
	  * Search key for the record in the format required - must be unique
	  */
	public String getValue();
}
