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

/** Generated Interface for MOLI_RegForm
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_RegForm 
{

    /** TableName=MOLI_RegForm */
    public static final String Table_Name = "MOLI_RegForm";

    /** AD_Table_ID=1000084 */
    public static final int Table_ID = MTable.getTable_ID(Table_Name);

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 3 - Client - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(3);

    /** Load Meta Data */

    /** Column name AD_Client_ID */
    public static final String COLUMNNAME_AD_Client_ID = "AD_Client_ID";

	/** Get Tenant.
	  * Tenant for this installation.
	  */
	public int getAD_Client_ID();

    /** Column name Address1 */
    public static final String COLUMNNAME_Address1 = "Address1";

	/** Set Address 1.
	  * Address line 1 for this location
	  */
	public void setAddress1 (String Address1);

	/** Get Address 1.
	  * Address line 1 for this location
	  */
	public String getAddress1();

    /** Column name Address2 */
    public static final String COLUMNNAME_Address2 = "Address2";

	/** Set Address 2.
	  * Address line 2 for this location
	  */
	public void setAddress2 (String Address2);

	/** Get Address 2.
	  * Address line 2 for this location
	  */
	public String getAddress2();

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

    /** Column name AD_User_ID */
    public static final String COLUMNNAME_AD_User_ID = "AD_User_ID";

	/** Set User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public void setAD_User_ID (int AD_User_ID);

	/** Get User/Contact.
	  * User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID();

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException;

    /** Column name C_BPartner_ID */
    public static final String COLUMNNAME_C_BPartner_ID = "C_BPartner_ID";

	/** Set Business Partner.
	  * Identifies a Business Partner
	  */
	public void setC_BPartner_ID (int C_BPartner_ID);

	/** Get Business Partner.
	  * Identifies a Business Partner
	  */
	public int getC_BPartner_ID();

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException;

    /** Column name C_BPartner_Location_ID */
    public static final String COLUMNNAME_C_BPartner_Location_ID = "C_BPartner_Location_ID";

	/** Set Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID);

	/** Get Partner Location.
	  * Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException;

    /** Column name C_BPartnerRelation_ID */
    public static final String COLUMNNAME_C_BPartnerRelation_ID = "C_BPartnerRelation_ID";

	/** Set Related Partner.
	  * Related Business Partner
	  */
	public void setC_BPartnerRelation_ID (int C_BPartnerRelation_ID);

	/** Get Related Partner.
	  * Related Business Partner
	  */
	public int getC_BPartnerRelation_ID();

	public org.compiere.model.I_C_BPartner getC_BPartnerRelation() throws RuntimeException;

    /** Column name C_BPartnerRelation_Location_ID */
    public static final String COLUMNNAME_C_BPartnerRelation_Location_ID = "C_BPartnerRelation_Location_ID";

	/** Set Related Partner Location.
	  * Location of the related Business Partner
	  */
	public void setC_BPartnerRelation_Location_ID (int C_BPartnerRelation_Location_ID);

	/** Get Related Partner Location.
	  * Location of the related Business Partner
	  */
	public int getC_BPartnerRelation_Location_ID();

	public org.compiere.model.I_C_BPartner_Location getC_BPartnerRelation_Location() throws RuntimeException;

    /** Column name CountryName */
    public static final String COLUMNNAME_CountryName = "CountryName";

	/** Set Country.
	  * Country Name
	  */
	public void setCountryName (String CountryName);

	/** Get Country.
	  * Country Name
	  */
	public String getCountryName();

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

    /** Column name DateDoc */
    public static final String COLUMNNAME_DateDoc = "DateDoc";

	/** Set Document Date.
	  * Date of the Document
	  */
	public void setDateDoc (Timestamp DateDoc);

	/** Get Document Date.
	  * Date of the Document
	  */
	public Timestamp getDateDoc();

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

    /** Column name EMail */
    public static final String COLUMNNAME_EMail = "EMail";

	/** Set EMail Address.
	  * Electronic Mail Address
	  */
	public void setEMail (String EMail);

	/** Get EMail Address.
	  * Electronic Mail Address
	  */
	public String getEMail();

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

    /** Column name IsApproved */
    public static final String COLUMNNAME_IsApproved = "IsApproved";

	/** Set Approved.
	  * Indicates if this document requires approval
	  */
	public void setIsApproved (boolean IsApproved);

	/** Get Approved.
	  * Indicates if this document requires approval
	  */
	public boolean isApproved();

    /** Column name MailText */
    public static final String COLUMNNAME_MailText = "MailText";

	/** Set Mail Text.
	  * Text used for Mail message
	  */
	public void setMailText (String MailText);

	/** Get Mail Text.
	  * Text used for Mail message
	  */
	public String getMailText();

    /** Column name MOLI_Activity */
    public static final String COLUMNNAME_MOLI_Activity = "MOLI_Activity";

	/** Set Actividad	  */
	public void setMOLI_Activity (String MOLI_Activity);

	/** Get Actividad	  */
	public String getMOLI_Activity();

    /** Column name MOLI_AltMaker */
    public static final String COLUMNNAME_MOLI_AltMaker = "MOLI_AltMaker";

	/** Set Proveedor Alternativo	  */
	public void setMOLI_AltMaker (String MOLI_AltMaker);

	/** Get Proveedor Alternativo	  */
	public String getMOLI_AltMaker();

    /** Column name MOLI_CertNum */
    public static final String COLUMNNAME_MOLI_CertNum = "MOLI_CertNum";

	/** Set Certificado No	  */
	public void setMOLI_CertNum (String MOLI_CertNum);

	/** Get Certificado No	  */
	public String getMOLI_CertNum();

    /** Column name MOLI_ConcessionDate */
    public static final String COLUMNNAME_MOLI_ConcessionDate = "MOLI_ConcessionDate";

	/** Set Concession Date	  */
	public void setMOLI_ConcessionDate (Timestamp MOLI_ConcessionDate);

	/** Get Concession Date	  */
	public Timestamp getMOLI_ConcessionDate();

    /** Column name MOLI_Dias_Concesion */
    public static final String COLUMNNAME_MOLI_Dias_Concesion = "MOLI_Dias_Concesion";

	/** Set Dias Concesion	  */
	public void setMOLI_Dias_Concesion (String MOLI_Dias_Concesion);

	/** Get Dias Concesion	  */
	public String getMOLI_Dias_Concesion();

    /** Column name MOLI_ExpirationDate */
    public static final String COLUMNNAME_MOLI_ExpirationDate = "MOLI_ExpirationDate";

	/** Set Fecha de Vencimiento	  */
	public void setMOLI_ExpirationDate (Timestamp MOLI_ExpirationDate);

	/** Get Fecha de Vencimiento	  */
	public Timestamp getMOLI_ExpirationDate();

    /** Column name MOLI_MadeIn */
    public static final String COLUMNNAME_MOLI_MadeIn = "MOLI_MadeIn";

	/** Set Hecho En	  */
	public void setMOLI_MadeIn (String MOLI_MadeIn);

	/** Get Hecho En	  */
	public String getMOLI_MadeIn();

    /** Column name MOLI_MainMaker */
    public static final String COLUMNNAME_MOLI_MainMaker = "MOLI_MainMaker";

	/** Set Proveedor Principal	  */
	public void setMOLI_MainMaker (String MOLI_MainMaker);

	/** Get Proveedor Principal	  */
	public String getMOLI_MainMaker();

    /** Column name MOLI_NumMesaEntrada */
    public static final String COLUMNNAME_MOLI_NumMesaEntrada = "MOLI_NumMesaEntrada";

	/** Set Numero Mesa de Entrada	  */
	public void setMOLI_NumMesaEntrada (String MOLI_NumMesaEntrada);

	/** Get Numero Mesa de Entrada	  */
	public String getMOLI_NumMesaEntrada();

    /** Column name MOLI_NumRE */
    public static final String COLUMNNAME_MOLI_NumRE = "MOLI_NumRE";

	/** Set Numero RE	  */
	public void setMOLI_NumRE (String MOLI_NumRE);

	/** Get Numero RE	  */
	public String getMOLI_NumRE();

    /** Column name MOLI_NumRE1 */
    public static final String COLUMNNAME_MOLI_NumRE1 = "MOLI_NumRE1";

	/** Set Numero RE1	  */
	public void setMOLI_NumRE1 (String MOLI_NumRE1);

	/** Get Numero RE1	  */
	public String getMOLI_NumRE1();

    /** Column name MOLI_Num_RSPA */
    public static final String COLUMNNAME_MOLI_Num_RSPA = "MOLI_Num_RSPA";

	/** Set Numero RSPA	  */
	public void setMOLI_Num_RSPA (String MOLI_Num_RSPA);

	/** Get Numero RSPA	  */
	public String getMOLI_Num_RSPA();

    /** Column name MOLI_ProductData */
    public static final String COLUMNNAME_MOLI_ProductData = "MOLI_ProductData";

	/** Set Data Producto	  */
	public void setMOLI_ProductData (String MOLI_ProductData);

	/** Get Data Producto	  */
	public String getMOLI_ProductData();

    /** Column name MOLI_RegCommName */
    public static final String COLUMNNAME_MOLI_RegCommName = "MOLI_RegCommName";

	/** Set Reg Comm Name	  */
	public void setMOLI_RegCommName (String MOLI_RegCommName);

	/** Get Reg Comm Name	  */
	public String getMOLI_RegCommName();

    /** Column name MOLI_RegForm_ID */
    public static final String COLUMNNAME_MOLI_RegForm_ID = "MOLI_RegForm_ID";

	/** Set Regulation Form ID	  */
	public void setMOLI_RegForm_ID (int MOLI_RegForm_ID);

	/** Get Regulation Form ID	  */
	public int getMOLI_RegForm_ID();

    /** Column name MOLI_RegFormType */
    public static final String COLUMNNAME_MOLI_RegFormType = "MOLI_RegFormType";

	/** Set Reg Form Type	  */
	public void setMOLI_RegFormType (String MOLI_RegFormType);

	/** Get Reg Form Type	  */
	public String getMOLI_RegFormType();

    /** Column name MOLI_RegForm_UU */
    public static final String COLUMNNAME_MOLI_RegForm_UU = "MOLI_RegForm_UU";

	/** Set Regulation Form_UU	  */
	public void setMOLI_RegForm_UU (String MOLI_RegForm_UU);

	/** Get Regulation Form_UU	  */
	public String getMOLI_RegForm_UU();

    /** Column name MOLI_RegGenName */
    public static final String COLUMNNAME_MOLI_RegGenName = "MOLI_RegGenName";

	/** Set Reg Gen Name	  */
	public void setMOLI_RegGenName (String MOLI_RegGenName);

	/** Get Reg Gen Name	  */
	public String getMOLI_RegGenName();

    /** Column name MOLI_RegPresentationForm */
    public static final String COLUMNNAME_MOLI_RegPresentationForm = "MOLI_RegPresentationForm";

	/** Set Reg Presentation Form	  */
	public void setMOLI_RegPresentationForm (String MOLI_RegPresentationForm);

	/** Get Reg Presentation Form	  */
	public String getMOLI_RegPresentationForm();

    /** Column name MOLI_RUC */
    public static final String COLUMNNAME_MOLI_RUC = "MOLI_RUC";

	/** Set RUC	  */
	public void setMOLI_RUC (String MOLI_RUC);

	/** Get RUC	  */
	public String getMOLI_RUC();

    /** Column name MOLI_SellPerm */
    public static final String COLUMNNAME_MOLI_SellPerm = "MOLI_SellPerm";

	/** Set Sell Perm	  */
	public void setMOLI_SellPerm (String MOLI_SellPerm);

	/** Get Sell Perm	  */
	public String getMOLI_SellPerm();

    /** Column name MOLI_SIMESE */
    public static final String COLUMNNAME_MOLI_SIMESE = "MOLI_SIMESE";

	/** Set SIMESE	  */
	public void setMOLI_SIMESE (String MOLI_SIMESE);

	/** Get SIMESE	  */
	public String getMOLI_SIMESE();

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

    /** Column name Phone */
    public static final String COLUMNNAME_Phone = "Phone";

	/** Set Phone.
	  * Identifies a telephone number
	  */
	public void setPhone (String Phone);

	/** Get Phone.
	  * Identifies a telephone number
	  */
	public String getPhone();

    /** Column name Phone2 */
    public static final String COLUMNNAME_Phone2 = "Phone2";

	/** Set 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public void setPhone2 (String Phone2);

	/** Get 2nd Phone.
	  * Identifies an alternate telephone number.
	  */
	public String getPhone2();

    /** Column name ProductName */
    public static final String COLUMNNAME_ProductName = "ProductName";

	/** Set Product Name.
	  * Name of the Product
	  */
	public void setProductName (String ProductName);

	/** Get Product Name.
	  * Name of the Product
	  */
	public String getProductName();

    /** Column name SalesRep_ID */
    public static final String COLUMNNAME_SalesRep_ID = "SalesRep_ID";

	/** Set Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public void setSalesRep_ID (int SalesRep_ID);

	/** Get Sales Representative.
	  * Sales Representative or Company Agent
	  */
	public int getSalesRep_ID();

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException;

    /** Column name TaxID */
    public static final String COLUMNNAME_TaxID = "TaxID";

	/** Set Tax ID.
	  * Tax Identification
	  */
	public void setTaxID (String TaxID);

	/** Get Tax ID.
	  * Tax Identification
	  */
	public String getTaxID();

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
