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

/** Generated Model for MOLI_RegForm
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_RegForm")
public class X_MOLI_RegForm extends PO implements I_MOLI_RegForm, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20250213L;

    /** Standard Constructor */
    public X_MOLI_RegForm (Properties ctx, int MOLI_RegForm_ID, String trxName)
    {
      super (ctx, MOLI_RegForm_ID, trxName);
      /** if (MOLI_RegForm_ID == 0)
        {
			setIsApproved (false);
// N
			setMOLI_RegForm_ID (0);
			setSalesRep_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegForm (Properties ctx, int MOLI_RegForm_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegForm_ID, trxName, virtualColumns);
      /** if (MOLI_RegForm_ID == 0)
        {
			setIsApproved (false);
// N
			setMOLI_RegForm_ID (0);
			setSalesRep_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegForm (Properties ctx, String MOLI_RegForm_UU, String trxName)
    {
      super (ctx, MOLI_RegForm_UU, trxName);
      /** if (MOLI_RegForm_UU == null)
        {
			setIsApproved (false);
// N
			setMOLI_RegForm_ID (0);
			setSalesRep_ID (0);
        } */
    }

    /** Standard Constructor */
    public X_MOLI_RegForm (Properties ctx, String MOLI_RegForm_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_RegForm_UU, trxName, virtualColumns);
      /** if (MOLI_RegForm_UU == null)
        {
			setIsApproved (false);
// N
			setMOLI_RegForm_ID (0);
			setSalesRep_ID (0);
        } */
    }

    /** Load Constructor */
    public X_MOLI_RegForm (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_RegForm[")
        .append(get_ID()).append(",Name=").append(getName()).append("]");
      return sb.toString();
    }

	/** Set Address 1.
		@param Address1 Address line 1 for this location
	*/
	public void setAddress1 (String Address1)
	{
		throw new IllegalArgumentException ("Address1 is virtual column");	}

	/** Get Address 1.
		@return Address line 1 for this location
	  */
	public String getAddress1()
	{
		return (String)get_Value(COLUMNNAME_Address1);
	}

	/** Set Address 2.
		@param Address2 Address line 2 for this location
	*/
	public void setAddress2 (String Address2)
	{
		throw new IllegalArgumentException ("Address2 is virtual column");	}

	/** Get Address 2.
		@return Address line 2 for this location
	  */
	public String getAddress2()
	{
		return (String)get_Value(COLUMNNAME_Address2);
	}

	public org.compiere.model.I_AD_User getAD_User() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getAD_User_ID(), get_TrxName());
	}

	/** Set User/Contact.
		@param AD_User_ID User within the system - Internal or Business Partner Contact
	*/
	public void setAD_User_ID (int AD_User_ID)
	{
		if (AD_User_ID < 1)
			set_Value (COLUMNNAME_AD_User_ID, null);
		else
			set_Value (COLUMNNAME_AD_User_ID, Integer.valueOf(AD_User_ID));
	}

	/** Get User/Contact.
		@return User within the system - Internal or Business Partner Contact
	  */
	public int getAD_User_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_AD_User_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartner() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartner_ID(), get_TrxName());
	}

	/** Set Business Partner.
		@param C_BPartner_ID Identifies a Business Partner
	*/
	public void setC_BPartner_ID (int C_BPartner_ID)
	{
		if (C_BPartner_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_ID, Integer.valueOf(C_BPartner_ID));
	}

	/** Get Business Partner.
		@return Identifies a Business Partner
	  */
	public int getC_BPartner_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getC_BPartner_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartner_Location_ID(), get_TrxName());
	}

	/** Set Partner Location.
		@param C_BPartner_Location_ID Identifies the (ship to) address for this Business Partner
	*/
	public void setC_BPartner_Location_ID (int C_BPartner_Location_ID)
	{
		if (C_BPartner_Location_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Location_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_BPartner_Location_ID, Integer.valueOf(C_BPartner_Location_ID));
	}

	/** Get Partner Location.
		@return Identifies the (ship to) address for this Business Partner
	  */
	public int getC_BPartner_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartner_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner getC_BPartnerRelation() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner)MTable.get(getCtx(), org.compiere.model.I_C_BPartner.Table_ID)
			.getPO(getC_BPartnerRelation_ID(), get_TrxName());
	}

	/** Set Related Partner.
		@param C_BPartnerRelation_ID Related Business Partner
	*/
	public void setC_BPartnerRelation_ID (int C_BPartnerRelation_ID)
	{
		if (C_BPartnerRelation_ID < 1)
			set_Value (COLUMNNAME_C_BPartnerRelation_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartnerRelation_ID, Integer.valueOf(C_BPartnerRelation_ID));
	}

	/** Get Related Partner.
		@return Related Business Partner
	  */
	public int getC_BPartnerRelation_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerRelation_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	public org.compiere.model.I_C_BPartner_Location getC_BPartnerRelation_Location() throws RuntimeException
	{
		return (org.compiere.model.I_C_BPartner_Location)MTable.get(getCtx(), org.compiere.model.I_C_BPartner_Location.Table_ID)
			.getPO(getC_BPartnerRelation_Location_ID(), get_TrxName());
	}

	/** Set Related Partner Location.
		@param C_BPartnerRelation_Location_ID Location of the related Business Partner
	*/
	public void setC_BPartnerRelation_Location_ID (int C_BPartnerRelation_Location_ID)
	{
		if (C_BPartnerRelation_Location_ID < 1)
			set_Value (COLUMNNAME_C_BPartnerRelation_Location_ID, null);
		else
			set_Value (COLUMNNAME_C_BPartnerRelation_Location_ID, Integer.valueOf(C_BPartnerRelation_Location_ID));
	}

	/** Get Related Partner Location.
		@return Location of the related Business Partner
	  */
	public int getC_BPartnerRelation_Location_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_BPartnerRelation_Location_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Country.
		@param CountryName Country Name
	*/
	public void setCountryName (String CountryName)
	{
		throw new IllegalArgumentException ("CountryName is virtual column");	}

	/** Get Country.
		@return Country Name
	  */
	public String getCountryName()
	{
		return (String)get_Value(COLUMNNAME_CountryName);
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

	/** Set Document Date.
		@param DateDoc Date of the Document
	*/
	public void setDateDoc (Timestamp DateDoc)
	{
		set_Value (COLUMNNAME_DateDoc, DateDoc);
	}

	/** Get Document Date.
		@return Date of the Document
	  */
	public Timestamp getDateDoc()
	{
		return (Timestamp)get_Value(COLUMNNAME_DateDoc);
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
		set_ValueNoCheck (COLUMNNAME_DocumentNo, DocumentNo);
	}

	/** Get Document No.
		@return Document sequence number of the document
	  */
	public String getDocumentNo()
	{
		return (String)get_Value(COLUMNNAME_DocumentNo);
	}

	/** Set EMail Address.
		@param EMail Electronic Mail Address
	*/
	public void setEMail (String EMail)
	{
		throw new IllegalArgumentException ("EMail is virtual column");	}

	/** Get EMail Address.
		@return Electronic Mail Address
	  */
	public String getEMail()
	{
		return (String)get_Value(COLUMNNAME_EMail);
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

	/** Set Approved.
		@param IsApproved Indicates if this document requires approval
	*/
	public void setIsApproved (boolean IsApproved)
	{
		set_ValueNoCheck (COLUMNNAME_IsApproved, Boolean.valueOf(IsApproved));
	}

	/** Get Approved.
		@return Indicates if this document requires approval
	  */
	public boolean isApproved()
	{
		Object oo = get_Value(COLUMNNAME_IsApproved);
		if (oo != null)
		{
			 if (oo instanceof Boolean)
				 return ((Boolean)oo).booleanValue();
			return "Y".equals(oo);
		}
		return false;
	}

	/** Set Mail Text.
		@param MailText Text used for Mail message
	*/
	public void setMailText (String MailText)
	{
		set_Value (COLUMNNAME_MailText, MailText);
	}

	/** Get Mail Text.
		@return Text used for Mail message
	  */
	public String getMailText()
	{
		return (String)get_Value(COLUMNNAME_MailText);
	}

	/** Cambio de país de origen = CP */
	public static final String MOLI_ACTIVITY_CambioDePaísDeOrigen = "CP";
	/** Modificación de composición = MC */
	public static final String MOLI_ACTIVITY_ModificaciónDeComposición = "MC";
	/** Nuevo Registro = NR */
	public static final String MOLI_ACTIVITY_NuevoRegistro = "NR";
	/** Renovación de Registro = RR */
	public static final String MOLI_ACTIVITY_RenovaciónDeRegistro = "RR";
	/** Set Actividad.
		@param MOLI_Activity Actividad
	*/
	public void setMOLI_Activity (String MOLI_Activity)
	{

		set_Value (COLUMNNAME_MOLI_Activity, MOLI_Activity);
	}

	/** Get Actividad.
		@return Actividad	  */
	public String getMOLI_Activity()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Activity);
	}

	/** Set Proveedor Alternativo.
		@param MOLI_AltMaker Proveedor Alternativo
	*/
	public void setMOLI_AltMaker (String MOLI_AltMaker)
	{
		set_Value (COLUMNNAME_MOLI_AltMaker, MOLI_AltMaker);
	}

	/** Get Proveedor Alternativo.
		@return Proveedor Alternativo	  */
	public String getMOLI_AltMaker()
	{
		return (String)get_Value(COLUMNNAME_MOLI_AltMaker);
	}

	/** Set Certificado No.
		@param MOLI_CertNum Certificado No
	*/
	public void setMOLI_CertNum (String MOLI_CertNum)
	{
		set_Value (COLUMNNAME_MOLI_CertNum, MOLI_CertNum);
	}

	/** Get Certificado No.
		@return Certificado No	  */
	public String getMOLI_CertNum()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CertNum);
	}

	/** Set Concession Date.
		@param MOLI_ConcessionDate Concession Date
	*/
	public void setMOLI_ConcessionDate (Timestamp MOLI_ConcessionDate)
	{
		set_Value (COLUMNNAME_MOLI_ConcessionDate, MOLI_ConcessionDate);
	}

	/** Get Concession Date.
		@return Concession Date	  */
	public Timestamp getMOLI_ConcessionDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_ConcessionDate);
	}

	/** Set Dias Concesion.
		@param MOLI_Dias_Concesion Dias Concesion
	*/
	public void setMOLI_Dias_Concesion (String MOLI_Dias_Concesion)
	{
		set_ValueNoCheck (COLUMNNAME_MOLI_Dias_Concesion, MOLI_Dias_Concesion);
	}

	/** Get Dias Concesion.
		@return Dias Concesion	  */
	public String getMOLI_Dias_Concesion()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Dias_Concesion);
	}

	/** Set Fecha de Vencimiento.
		@param MOLI_ExpirationDate Fecha de Vencimiento
	*/
	public void setMOLI_ExpirationDate (Timestamp MOLI_ExpirationDate)
	{
		set_Value (COLUMNNAME_MOLI_ExpirationDate, MOLI_ExpirationDate);
	}

	/** Get Fecha de Vencimiento.
		@return Fecha de Vencimiento	  */
	public Timestamp getMOLI_ExpirationDate()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_ExpirationDate);
	}

	/** Set Hecho En.
		@param MOLI_MadeIn Hecho En
	*/
	public void setMOLI_MadeIn (String MOLI_MadeIn)
	{
		set_Value (COLUMNNAME_MOLI_MadeIn, MOLI_MadeIn);
	}

	/** Get Hecho En.
		@return Hecho En	  */
	public String getMOLI_MadeIn()
	{
		return (String)get_Value(COLUMNNAME_MOLI_MadeIn);
	}

	/** Set Proveedor Principal.
		@param MOLI_MainMaker Proveedor Principal
	*/
	public void setMOLI_MainMaker (String MOLI_MainMaker)
	{
		set_Value (COLUMNNAME_MOLI_MainMaker, MOLI_MainMaker);
	}

	/** Get Proveedor Principal.
		@return Proveedor Principal	  */
	public String getMOLI_MainMaker()
	{
		return (String)get_Value(COLUMNNAME_MOLI_MainMaker);
	}

	/** Set Numero Mesa de Entrada.
		@param MOLI_NumMesaEntrada Numero Mesa de Entrada
	*/
	public void setMOLI_NumMesaEntrada (String MOLI_NumMesaEntrada)
	{
		set_Value (COLUMNNAME_MOLI_NumMesaEntrada, MOLI_NumMesaEntrada);
	}

	/** Get Numero Mesa de Entrada.
		@return Numero Mesa de Entrada	  */
	public String getMOLI_NumMesaEntrada()
	{
		return (String)get_Value(COLUMNNAME_MOLI_NumMesaEntrada);
	}

	/** Set Numero RE.
		@param MOLI_NumRE Numero RE
	*/
	public void setMOLI_NumRE (String MOLI_NumRE)
	{
		set_Value (COLUMNNAME_MOLI_NumRE, MOLI_NumRE);
	}

	/** Get Numero RE.
		@return Numero RE	  */
	public String getMOLI_NumRE()
	{
		return (String)get_Value(COLUMNNAME_MOLI_NumRE);
	}

	/** Set Numero RE1.
		@param MOLI_NumRE1 Numero RE1
	*/
	public void setMOLI_NumRE1 (String MOLI_NumRE1)
	{
		set_Value (COLUMNNAME_MOLI_NumRE1, MOLI_NumRE1);
	}

	/** Get Numero RE1.
		@return Numero RE1	  */
	public String getMOLI_NumRE1()
	{
		return (String)get_Value(COLUMNNAME_MOLI_NumRE1);
	}

	/** Set Numero RSPA.
		@param MOLI_Num_RSPA Numero RSPA
	*/
	public void setMOLI_Num_RSPA (String MOLI_Num_RSPA)
	{
		set_Value (COLUMNNAME_MOLI_Num_RSPA, MOLI_Num_RSPA);
	}

	/** Get Numero RSPA.
		@return Numero RSPA	  */
	public String getMOLI_Num_RSPA()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Num_RSPA);
	}

	/** Elaboracion = EL */
	public static final String MOLI_PRODUCTDATA_Elaboracion = "EL";
	/** Fraccionamiento = FR */
	public static final String MOLI_PRODUCTDATA_Fraccionamiento = "FR";
	/** Importacion = IM */
	public static final String MOLI_PRODUCTDATA_Importacion = "IM";
	/** Tercerizacion = TR */
	public static final String MOLI_PRODUCTDATA_Tercerizacion = "TR";
	/** Set Data Producto.
		@param MOLI_ProductData Data Producto
	*/
	public void setMOLI_ProductData (String MOLI_ProductData)
	{

		set_Value (COLUMNNAME_MOLI_ProductData, MOLI_ProductData);
	}

	/** Get Data Producto.
		@return Data Producto	  */
	public String getMOLI_ProductData()
	{
		return (String)get_Value(COLUMNNAME_MOLI_ProductData);
	}

	/** Set Reg Comm Name.
		@param MOLI_RegCommName Reg Comm Name
	*/
	public void setMOLI_RegCommName (String MOLI_RegCommName)
	{
		set_Value (COLUMNNAME_MOLI_RegCommName, MOLI_RegCommName);
	}

	/** Get Reg Comm Name.
		@return Reg Comm Name	  */
	public String getMOLI_RegCommName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegCommName);
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

	/** DNVS = DN */
	public static final String MOLI_REGFORMTYPE_DNVS = "DN";
	/** INAN = IN */
	public static final String MOLI_REGFORMTYPE_INAN = "IN";
	/** INTN = IT */
	public static final String MOLI_REGFORMTYPE_INTN = "IT";
	/** Set Reg Form Type.
		@param MOLI_RegFormType Reg Form Type
	*/
	public void setMOLI_RegFormType (String MOLI_RegFormType)
	{

		set_Value (COLUMNNAME_MOLI_RegFormType, MOLI_RegFormType);
	}

	/** Get Reg Form Type.
		@return Reg Form Type	  */
	public String getMOLI_RegFormType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegFormType);
	}

	/** Set Regulation Form_UU.
		@param MOLI_RegForm_UU Regulation Form_UU
	*/
	public void setMOLI_RegForm_UU (String MOLI_RegForm_UU)
	{
		set_Value (COLUMNNAME_MOLI_RegForm_UU, MOLI_RegForm_UU);
	}

	/** Get Regulation Form_UU.
		@return Regulation Form_UU	  */
	public String getMOLI_RegForm_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegForm_UU);
	}

	/** Set Reg Gen Name.
		@param MOLI_RegGenName Reg Gen Name
	*/
	public void setMOLI_RegGenName (String MOLI_RegGenName)
	{
		set_Value (COLUMNNAME_MOLI_RegGenName, MOLI_RegGenName);
	}

	/** Get Reg Gen Name.
		@return Reg Gen Name	  */
	public String getMOLI_RegGenName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegGenName);
	}

	/** Set Reg Presentation Form.
		@param MOLI_RegPresentationForm Reg Presentation Form
	*/
	public void setMOLI_RegPresentationForm (String MOLI_RegPresentationForm)
	{
		set_Value (COLUMNNAME_MOLI_RegPresentationForm, MOLI_RegPresentationForm);
	}

	/** Get Reg Presentation Form.
		@return Reg Presentation Form	  */
	public String getMOLI_RegPresentationForm()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RegPresentationForm);
	}

	/** Set RUC.
		@param MOLI_RUC RUC
	*/
	public void setMOLI_RUC (String MOLI_RUC)
	{
		throw new IllegalArgumentException ("MOLI_RUC is virtual column");	}

	/** Get RUC.
		@return RUC	  */
	public String getMOLI_RUC()
	{
		return (String)get_Value(COLUMNNAME_MOLI_RUC);
	}

	/** Set Sell Perm.
		@param MOLI_SellPerm Sell Perm
	*/
	public void setMOLI_SellPerm (String MOLI_SellPerm)
	{
		set_Value (COLUMNNAME_MOLI_SellPerm, MOLI_SellPerm);
	}

	/** Get Sell Perm.
		@return Sell Perm	  */
	public String getMOLI_SellPerm()
	{
		return (String)get_Value(COLUMNNAME_MOLI_SellPerm);
	}

	/** Set SIMESE.
		@param MOLI_SIMESE SIMESE
	*/
	public void setMOLI_SIMESE (String MOLI_SIMESE)
	{
		set_Value (COLUMNNAME_MOLI_SIMESE, MOLI_SIMESE);
	}

	/** Get SIMESE.
		@return SIMESE	  */
	public String getMOLI_SIMESE()
	{
		return (String)get_Value(COLUMNNAME_MOLI_SIMESE);
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

	/** Set Phone.
		@param Phone Identifies a telephone number
	*/
	public void setPhone (String Phone)
	{
		throw new IllegalArgumentException ("Phone is virtual column");	}

	/** Get Phone.
		@return Identifies a telephone number
	  */
	public String getPhone()
	{
		return (String)get_Value(COLUMNNAME_Phone);
	}

	/** Set 2nd Phone.
		@param Phone2 Identifies an alternate telephone number.
	*/
	public void setPhone2 (String Phone2)
	{
		throw new IllegalArgumentException ("Phone2 is virtual column");	}

	/** Get 2nd Phone.
		@return Identifies an alternate telephone number.
	  */
	public String getPhone2()
	{
		return (String)get_Value(COLUMNNAME_Phone2);
	}

	/** Set Product Name.
		@param ProductName Name of the Product
	*/
	public void setProductName (String ProductName)
	{
		throw new IllegalArgumentException ("ProductName is virtual column");	}

	/** Get Product Name.
		@return Name of the Product
	  */
	public String getProductName()
	{
		return (String)get_Value(COLUMNNAME_ProductName);
	}

	public org.compiere.model.I_AD_User getSalesRep() throws RuntimeException
	{
		return (org.compiere.model.I_AD_User)MTable.get(getCtx(), org.compiere.model.I_AD_User.Table_ID)
			.getPO(getSalesRep_ID(), get_TrxName());
	}

	/** Set Sales Representative.
		@param SalesRep_ID Sales Representative or Company Agent
	*/
	public void setSalesRep_ID (int SalesRep_ID)
	{
		if (SalesRep_ID < 1)
			set_Value (COLUMNNAME_SalesRep_ID, null);
		else
			set_Value (COLUMNNAME_SalesRep_ID, Integer.valueOf(SalesRep_ID));
	}

	/** Get Sales Representative.
		@return Sales Representative or Company Agent
	  */
	public int getSalesRep_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_SalesRep_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Tax ID.
		@param TaxID Tax Identification
	*/
	public void setTaxID (String TaxID)
	{
		throw new IllegalArgumentException ("TaxID is virtual column");	}

	/** Get Tax ID.
		@return Tax Identification
	  */
	public String getTaxID()
	{
		return (String)get_Value(COLUMNNAME_TaxID);
	}

	/** Set Search Key.
		@param Value Search key for the record in the format required - must be unique
	*/
	public void setValue (String Value)
	{
		set_Value (COLUMNNAME_Value, Value);
	}

	/** Get Search Key.
		@return Search key for the record in the format required - must be unique
	  */
	public String getValue()
	{
		return (String)get_Value(COLUMNNAME_Value);
	}
}