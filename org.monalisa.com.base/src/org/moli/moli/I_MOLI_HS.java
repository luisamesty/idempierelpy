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

/** Generated Interface for MOLI_HS
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_HS 
{

    /** TableName=MOLI_HS */
    public static final String Table_Name = "MOLI_HS";

    /** AD_Table_ID=1000074 */
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

    /** Column name MOLI_HSChapter */
    public static final String COLUMNNAME_MOLI_HSChapter = "MOLI_HSChapter";

	/** Set HS Chapter.
	  * HS Chapter
	  */
	public void setMOLI_HSChapter (String MOLI_HSChapter);

	/** Get HS Chapter.
	  * HS Chapter
	  */
	public String getMOLI_HSChapter();

    /** Column name MOLI_HSHeading */
    public static final String COLUMNNAME_MOLI_HSHeading = "MOLI_HSHeading";

	/** Set HS Heading.
	  * HS Heading
	  */
	public void setMOLI_HSHeading (String MOLI_HSHeading);

	/** Get HS Heading.
	  * HS Heading
	  */
	public String getMOLI_HSHeading();

    /** Column name MOLI_HS_ID */
    public static final String COLUMNNAME_MOLI_HS_ID = "MOLI_HS_ID";

	/** Set Harmonized System.
	  * Harmonized Commodity Description and Coding System (HS Convention) 
	  */
	public void setMOLI_HS_ID (int MOLI_HS_ID);

	/** Get Harmonized System.
	  * Harmonized Commodity Description and Coding System (HS Convention) 
	  */
	public int getMOLI_HS_ID();

    /** Column name MOLI_HSIncomeCharge */
    public static final String COLUMNNAME_MOLI_HSIncomeCharge = "MOLI_HSIncomeCharge";

	/** Set HS Income Charge.
	  * HS Income Charge
	  */
	public void setMOLI_HSIncomeCharge (BigDecimal MOLI_HSIncomeCharge);

	/** Get HS Income Charge.
	  * HS Income Charge
	  */
	public BigDecimal getMOLI_HSIncomeCharge();

    /** Column name MOLI_HSIncomeTax */
    public static final String COLUMNNAME_MOLI_HSIncomeTax = "MOLI_HSIncomeTax";

	/** Set HS IncomeTax.
	  * HS IncomeTax
	  */
	public void setMOLI_HSIncomeTax (BigDecimal MOLI_HSIncomeTax);

	/** Get HS IncomeTax.
	  * HS IncomeTax
	  */
	public BigDecimal getMOLI_HSIncomeTax();

    /** Column name MOLI_HSOtherTax */
    public static final String COLUMNNAME_MOLI_HSOtherTax = "MOLI_HSOtherTax";

	/** Set HS OtherTax.
	  * HS OtherTax
	  */
	public void setMOLI_HSOtherTax (BigDecimal MOLI_HSOtherTax);

	/** Get HS OtherTax.
	  * HS OtherTax
	  */
	public BigDecimal getMOLI_HSOtherTax();

    /** Column name MOLI_HSSalesTax */
    public static final String COLUMNNAME_MOLI_HSSalesTax = "MOLI_HSSalesTax";

	/** Set HS SalesTax.
	  * HS SalesTax
	  */
	public void setMOLI_HSSalesTax (BigDecimal MOLI_HSSalesTax);

	/** Get HS SalesTax.
	  * HS SalesTax
	  */
	public BigDecimal getMOLI_HSSalesTax();

    /** Column name MOLI_HSSelectiveTax */
    public static final String COLUMNNAME_MOLI_HSSelectiveTax = "MOLI_HSSelectiveTax";

	/** Set HS Selective Tax.
	  * HS Selective Tax
	  */
	public void setMOLI_HSSelectiveTax (BigDecimal MOLI_HSSelectiveTax);

	/** Get HS Selective Tax.
	  * HS Selective Tax
	  */
	public BigDecimal getMOLI_HSSelectiveTax();

    /** Column name MOLI_HSSelectiveTaxSND */
    public static final String COLUMNNAME_MOLI_HSSelectiveTaxSND = "MOLI_HSSelectiveTaxSND";

	/** Set HS Selective Tax SND.
	  * HS Selective Tax SND
	  */
	public void setMOLI_HSSelectiveTaxSND (BigDecimal MOLI_HSSelectiveTaxSND);

	/** Get HS Selective Tax SND.
	  * HS Selective Tax SND
	  */
	public BigDecimal getMOLI_HSSelectiveTaxSND();

    /** Column name MOLI_HSSubHeading */
    public static final String COLUMNNAME_MOLI_HSSubHeading = "MOLI_HSSubHeading";

	/** Set HS SubHeading.
	  * HS SubHeading
	  */
	public void setMOLI_HSSubHeading (String MOLI_HSSubHeading);

	/** Get HS SubHeading.
	  * HS SubHeading
	  */
	public String getMOLI_HSSubHeading();

    /** Column name MOLI_HSSubHeadingExt */
    public static final String COLUMNNAME_MOLI_HSSubHeadingExt = "MOLI_HSSubHeadingExt";

	/** Set HS SubHeading Ext.
	  * HS SubHeading Ext
	  */
	public void setMOLI_HSSubHeadingExt (String MOLI_HSSubHeadingExt);

	/** Get HS SubHeading Ext.
	  * HS SubHeading Ext
	  */
	public String getMOLI_HSSubHeadingExt();

    /** Column name MOLI_HSTariff */
    public static final String COLUMNNAME_MOLI_HSTariff = "MOLI_HSTariff";

	/** Set HS Tariff.
	  * HS Tariff
	  */
	public void setMOLI_HSTariff (BigDecimal MOLI_HSTariff);

	/** Get HS Tariff.
	  * HS Tariff
	  */
	public BigDecimal getMOLI_HSTariff();

    /** Column name MOLI_HSTariffN */
    public static final String COLUMNNAME_MOLI_HSTariffN = "MOLI_HSTariffN";

	/** Set HS Tariff N.
	  * HS Tariff N
	  */
	public void setMOLI_HSTariffN (BigDecimal MOLI_HSTariffN);

	/** Get HS Tariff N.
	  * HS Tariff N
	  */
	public BigDecimal getMOLI_HSTariffN();

    /** Column name MOLI_HS_UU */
    public static final String COLUMNNAME_MOLI_HS_UU = "MOLI_HS_UU";

	/** Set HS UU	  */
	public void setMOLI_HS_UU (String MOLI_HS_UU);

	/** Get HS UU	  */
	public String getMOLI_HS_UU();

    /** Column name MOLI_HSVat */
    public static final String COLUMNNAME_MOLI_HSVat = "MOLI_HSVat";

	/** Set HS Vat.
	  * HS Vat
	  */
	public void setMOLI_HSVat (BigDecimal MOLI_HSVat);

	/** Get HS Vat.
	  * HS Vat
	  */
	public BigDecimal getMOLI_HSVat();

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
