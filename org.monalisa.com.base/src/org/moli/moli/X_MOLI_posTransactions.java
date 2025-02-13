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

/** Generated Model for MOLI_posTransactions
 *  @author iDempiere (generated)
 *  @version Release 11 - $Id$ */
@org.adempiere.base.Model(table="MOLI_posTransactions")
public class X_MOLI_posTransactions extends PO implements I_MOLI_posTransactions, I_Persistent
{

	/**
	 *
	 */
	private static final long serialVersionUID = 20241111L;

    /** Standard Constructor */
    public X_MOLI_posTransactions (Properties ctx, int MOLI_posTransactions_ID, String trxName)
    {
      super (ctx, MOLI_posTransactions_ID, trxName);
      /** if (MOLI_posTransactions_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_MOLI_posTransactions (Properties ctx, int MOLI_posTransactions_ID, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_posTransactions_ID, trxName, virtualColumns);
      /** if (MOLI_posTransactions_ID == 0)
        {
        } */
    }

    /** Standard Constructor */
    public X_MOLI_posTransactions (Properties ctx, String MOLI_posTransactions_UU, String trxName)
    {
      super (ctx, MOLI_posTransactions_UU, trxName);
      /** if (MOLI_posTransactions_UU == null)
        {
        } */
    }

    /** Standard Constructor */
    public X_MOLI_posTransactions (Properties ctx, String MOLI_posTransactions_UU, String trxName, String ... virtualColumns)
    {
      super (ctx, MOLI_posTransactions_UU, trxName, virtualColumns);
      /** if (MOLI_posTransactions_UU == null)
        {
        } */
    }

    /** Load Constructor */
    public X_MOLI_posTransactions (Properties ctx, ResultSet rs, String trxName)
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
      StringBuilder sb = new StringBuilder ("X_MOLI_posTransactions[")
        .append(get_ID()).append("]");
      return sb.toString();
    }

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException
	{
		return (org.compiere.model.I_C_Invoice)MTable.get(getCtx(), org.compiere.model.I_C_Invoice.Table_ID)
			.getPO(getC_Invoice_ID(), get_TrxName());
	}

	/** Set Invoice.
		@param C_Invoice_ID Invoice Identifier
	*/
	public void setC_Invoice_ID (int C_Invoice_ID)
	{
		if (C_Invoice_ID < 1)
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_C_Invoice_ID, Integer.valueOf(C_Invoice_ID));
	}

	/** Get Invoice.
		@return Invoice Identifier
	  */
	public int getC_Invoice_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_C_Invoice_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Amount.
		@param MOLI_Amount Amount
	*/
	public void setMOLI_Amount (BigDecimal MOLI_Amount)
	{
		set_Value (COLUMNNAME_MOLI_Amount, MOLI_Amount);
	}

	/** Get Amount.
		@return Amount	  */
	public BigDecimal getMOLI_Amount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_Amount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Card Aid.
		@param MOLI_CardAid Card Aid
	*/
	public void setMOLI_CardAid (String MOLI_CardAid)
	{
		set_Value (COLUMNNAME_MOLI_CardAid, MOLI_CardAid);
	}

	/** Get Card Aid.
		@return Card Aid	  */
	public String getMOLI_CardAid()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardAid);
	}

	/** Set Card Arqc.
		@param MOLI_CardArqc Card Arqc
	*/
	public void setMOLI_CardArqc (String MOLI_CardArqc)
	{
		set_Value (COLUMNNAME_MOLI_CardArqc, MOLI_CardArqc);
	}

	/** Get Card Arqc.
		@return Card Arqc	  */
	public String getMOLI_CardArqc()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardArqc);
	}

	/** Set Card Auth Code.
		@param MOLI_CardAuthCode Card Auth Code
	*/
	public void setMOLI_CardAuthCode (String MOLI_CardAuthCode)
	{
		set_Value (COLUMNNAME_MOLI_CardAuthCode, MOLI_CardAuthCode);
	}

	/** Get Card Auth Code.
		@return Card Auth Code	  */
	public String getMOLI_CardAuthCode()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardAuthCode);
	}

	/** Set Card Balance Amount.
		@param MOLI_CardBalanceAmount Card Balance Amount
	*/
	public void setMOLI_CardBalanceAmount (BigDecimal MOLI_CardBalanceAmount)
	{
		set_Value (COLUMNNAME_MOLI_CardBalanceAmount, MOLI_CardBalanceAmount);
	}

	/** Get Card Balance Amount.
		@return Card Balance Amount	  */
	public BigDecimal getMOLI_CardBalanceAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CardBalanceAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Card Bin.
		@param MOLI_CardBin Card Bin
	*/
	public void setMOLI_CardBin (String MOLI_CardBin)
	{
		set_Value (COLUMNNAME_MOLI_CardBin, MOLI_CardBin);
	}

	/** Get Card Bin.
		@return Card Bin	  */
	public String getMOLI_CardBin()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardBin);
	}

	/** Set Card Cash Back Amount.
		@param MOLI_CardCashBackAmount Card Cash Back Amount
	*/
	public void setMOLI_CardCashBackAmount (BigDecimal MOLI_CardCashBackAmount)
	{
		set_Value (COLUMNNAME_MOLI_CardCashBackAmount, MOLI_CardCashBackAmount);
	}

	/** Get Card Cash Back Amount.
		@return Card Cash Back Amount	  */
	public BigDecimal getMOLI_CardCashBackAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_CardCashBackAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Card Ext Data.
		@param MOLI_CardExtData Card Ext Data
	*/
	public void setMOLI_CardExtData (String MOLI_CardExtData)
	{
		set_Value (COLUMNNAME_MOLI_CardExtData, MOLI_CardExtData);
	}

	/** Get Card Ext Data.
		@return Card Ext Data	  */
	public String getMOLI_CardExtData()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardExtData);
	}

	/** Set Card Holder Name.
		@param MOLI_CardHolderName Card Holder Name
	*/
	public void setMOLI_CardHolderName (String MOLI_CardHolderName)
	{
		set_Value (COLUMNNAME_MOLI_CardHolderName, MOLI_CardHolderName);
	}

	/** Get Card Holder Name.
		@return Card Holder Name	  */
	public String getMOLI_CardHolderName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardHolderName);
	}

	/** Set Card Merchant Gateway.
		@param MOLI_CardMerchantGateway Card Merchant Gateway
	*/
	public void setMOLI_CardMerchantGateway (String MOLI_CardMerchantGateway)
	{
		set_Value (COLUMNNAME_MOLI_CardMerchantGateway, MOLI_CardMerchantGateway);
	}

	/** Get Card Merchant Gateway.
		@return Card Merchant Gateway	  */
	public String getMOLI_CardMerchantGateway()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardMerchantGateway);
	}

	/** Set Card Name.
		@param MOLI_CardName Card Name
	*/
	public void setMOLI_CardName (String MOLI_CardName)
	{
		set_Value (COLUMNNAME_MOLI_CardName, MOLI_CardName);
	}

	/** Get Card Name.
		@return Card Name	  */
	public String getMOLI_CardName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardName);
	}

	/** Set Card NSU.
		@param MOLI_CardNsu Card NSU
	*/
	public void setMOLI_CardNsu (String MOLI_CardNsu)
	{
		set_Value (COLUMNNAME_MOLI_CardNsu, MOLI_CardNsu);
	}

	/** Get Card NSU.
		@return Card NSU	  */
	public String getMOLI_CardNsu()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardNsu);
	}

	/** Set Card Number.
		@param MOLI_CardNumber Card Number
	*/
	public void setMOLI_CardNumber (String MOLI_CardNumber)
	{
		set_Value (COLUMNNAME_MOLI_CardNumber, MOLI_CardNumber);
	}

	/** Get Card Number.
		@return Card Number	  */
	public String getMOLI_CardNumber()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardNumber);
	}

	/** Set Card Reader.
		@param MOLI_CardReader Card Reader
	*/
	public void setMOLI_CardReader (String MOLI_CardReader)
	{
		set_Value (COLUMNNAME_MOLI_CardReader, MOLI_CardReader);
	}

	/** Get Card Reader.
		@return Card Reader	  */
	public String getMOLI_CardReader()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardReader);
	}

	/** Set Card Trade Code.
		@param MOLI_CardTradeCode Card Trade Code
	*/
	public void setMOLI_CardTradeCode (String MOLI_CardTradeCode)
	{
		set_Value (COLUMNNAME_MOLI_CardTradeCode, MOLI_CardTradeCode);
	}

	/** Get Card Trade Code.
		@return Card Trade Code	  */
	public String getMOLI_CardTradeCode()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardTradeCode);
	}

	/** Set Card Transaction ID.
		@param MOLI_CardTransactionId Card Transaction ID
	*/
	public void setMOLI_CardTransactionId (String MOLI_CardTransactionId)
	{
		set_Value (COLUMNNAME_MOLI_CardTransactionId, MOLI_CardTransactionId);
	}

	/** Get Card Transaction ID.
		@return Card Transaction ID	  */
	public String getMOLI_CardTransactionId()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardTransactionId);
	}

	/** Set Card Type.
		@param MOLI_CardType Card Type
	*/
	public void setMOLI_CardType (String MOLI_CardType)
	{
		set_Value (COLUMNNAME_MOLI_CardType, MOLI_CardType);
	}

	/** Get Card Type.
		@return Card Type	  */
	public String getMOLI_CardType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CardType);
	}

	/** Set Custom Payment Cash Payment.
		@param MOLI_CustomPaymentCashPayment Custom Payment Cash Payment
	*/
	public void setMOLI_CustomPaymentCashPayment (String MOLI_CustomPaymentCashPayment)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymentCashPayment, MOLI_CustomPaymentCashPayment);
	}

	/** Get Custom Payment Cash Payment.
		@return Custom Payment Cash Payment	  */
	public String getMOLI_CustomPaymentCashPayment()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CustomPaymentCashPayment);
	}

	/** Set Custom Payment Field Name.
		@param MOLI_CustomPaymentFieldName Custom Payment Field Name
	*/
	public void setMOLI_CustomPaymentFieldName (String MOLI_CustomPaymentFieldName)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymentFieldName, MOLI_CustomPaymentFieldName);
	}

	/** Get Custom Payment Field Name.
		@return Custom Payment Field Name	  */
	public String getMOLI_CustomPaymentFieldName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CustomPaymentFieldName);
	}

	/** Set Custom Payment Name.
		@param MOLI_CustomPaymentName Custom Payment Name
	*/
	public void setMOLI_CustomPaymentName (String MOLI_CustomPaymentName)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymentName, MOLI_CustomPaymentName);
	}

	/** Get Custom Payment Name.
		@return Custom Payment Name	  */
	public String getMOLI_CustomPaymentName()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CustomPaymentName);
	}

	/** Set Custom Payment Ref.
		@param MOLI_CustomPaymentRef Custom Payment Ref
	*/
	public void setMOLI_CustomPaymentRef (String MOLI_CustomPaymentRef)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymentRef, MOLI_CustomPaymentRef);
	}

	/** Get Custom Payment Ref.
		@return Custom Payment Ref	  */
	public String getMOLI_CustomPaymentRef()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CustomPaymentRef);
	}

	/** Set Custom Paym Ref Item ID.
		@param MOLI_CustomPaymRefItemId Custom Paym Ref Item ID
	*/
	public void setMOLI_CustomPaymRefItemId (int MOLI_CustomPaymRefItemId)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymRefItemId, Integer.valueOf(MOLI_CustomPaymRefItemId));
	}

	/** Get Custom Paym Ref Item ID.
		@return Custom Paym Ref Item ID	  */
	public int getMOLI_CustomPaymRefItemId()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_CustomPaymRefItemId);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Custom Paym Ref Print Format.
		@param MOLI_CustomPaymRefPrintFormat Custom Paym Ref Print Format
	*/
	public void setMOLI_CustomPaymRefPrintFormat (String MOLI_CustomPaymRefPrintFormat)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymRefPrintFormat, MOLI_CustomPaymRefPrintFormat);
	}

	/** Get Custom Paym Ref Print Format.
		@return Custom Paym Ref Print Format	  */
	public String getMOLI_CustomPaymRefPrintFormat()
	{
		return (String)get_Value(COLUMNNAME_MOLI_CustomPaymRefPrintFormat);
	}

	/** Set Custom Paym Ref Ticket ID.
		@param MOLI_CustomPaymRefTicketId Custom Paym Ref Ticket ID
	*/
	public void setMOLI_CustomPaymRefTicketId (int MOLI_CustomPaymRefTicketId)
	{
		set_Value (COLUMNNAME_MOLI_CustomPaymRefTicketId, Integer.valueOf(MOLI_CustomPaymRefTicketId));
	}

	/** Get Custom Paym Ref Ticket ID.
		@return Custom Paym Ref Ticket ID	  */
	public int getMOLI_CustomPaymRefTicketId()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_CustomPaymRefTicketId);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Document Type.
		@param MOLI_DocumentType Document Type
	*/
	public void setMOLI_DocumentType (int MOLI_DocumentType)
	{
		set_Value (COLUMNNAME_MOLI_DocumentType, Integer.valueOf(MOLI_DocumentType));
	}

	/** Get Document Type.
		@return Document Type	  */
	public int getMOLI_DocumentType()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_DocumentType);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gift Cert Cash Back Amount.
		@param MOLI_GiftCertCashBackAmount Gift Cert Cash Back Amount
	*/
	public void setMOLI_GiftCertCashBackAmount (BigDecimal MOLI_GiftCertCashBackAmount)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertCashBackAmount, MOLI_GiftCertCashBackAmount);
	}

	/** Get Gift Cert Cash Back Amount.
		@return Gift Cert Cash Back Amount	  */
	public BigDecimal getMOLI_GiftCertCashBackAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_GiftCertCashBackAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Gift Cert Face Value.
		@param MOLI_GiftCertFaceValue Gift Cert Face Value
	*/
	public void setMOLI_GiftCertFaceValue (BigDecimal MOLI_GiftCertFaceValue)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertFaceValue, MOLI_GiftCertFaceValue);
	}

	/** Get Gift Cert Face Value.
		@return Gift Cert Face Value	  */
	public BigDecimal getMOLI_GiftCertFaceValue()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_GiftCertFaceValue);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Gift Cert Number.
		@param MOLI_GiftCertNumber Gift Cert Number
	*/
	public void setMOLI_GiftCertNumber (String MOLI_GiftCertNumber)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertNumber, MOLI_GiftCertNumber);
	}

	/** Get Gift Cert Number.
		@return Gift Cert Number	  */
	public String getMOLI_GiftCertNumber()
	{
		return (String)get_Value(COLUMNNAME_MOLI_GiftCertNumber);
	}

	/** Set Gift Cert Paid Amount.
		@param MOLI_GiftCertPaidAmount Gift Cert Paid Amount
	*/
	public void setMOLI_GiftCertPaidAmount (BigDecimal MOLI_GiftCertPaidAmount)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertPaidAmount, MOLI_GiftCertPaidAmount);
	}

	/** Get Gift Cert Paid Amount.
		@return Gift Cert Paid Amount	  */
	public BigDecimal getMOLI_GiftCertPaidAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_GiftCertPaidAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Gift Cert Refund Item ID.
		@param MOLI_GiftCertRefundItemId Gift Cert Refund Item ID
	*/
	public void setMOLI_GiftCertRefundItemId (int MOLI_GiftCertRefundItemId)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertRefundItemId, Integer.valueOf(MOLI_GiftCertRefundItemId));
	}

	/** Get Gift Cert Refund Item ID.
		@return Gift Cert Refund Item ID	  */
	public int getMOLI_GiftCertRefundItemId()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_GiftCertRefundItemId);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Gift Cert Refund Ticket ID.
		@param MOLI_GiftCertRefundTicketID Gift Cert Refund Ticket ID
	*/
	public void setMOLI_GiftCertRefundTicketID (int MOLI_GiftCertRefundTicketID)
	{
		set_Value (COLUMNNAME_MOLI_GiftCertRefundTicketID, Integer.valueOf(MOLI_GiftCertRefundTicketID));
	}

	/** Get Gift Cert Refund Ticket ID.
		@return Gift Cert Refund Ticket ID	  */
	public int getMOLI_GiftCertRefundTicketID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_GiftCertRefundTicketID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Global ID.
		@param MOLI_GlobalID Global ID
	*/
	public void setMOLI_GlobalID (String MOLI_GlobalID)
	{
		set_Value (COLUMNNAME_MOLI_GlobalID, MOLI_GlobalID);
	}

	/** Get Global ID.
		@return Global ID	  */
	public String getMOLI_GlobalID()
	{
		return (String)get_Value(COLUMNNAME_MOLI_GlobalID);
	}

	/** Set Payment Sub Type.
		@param MOLI_PaymentSubType Payment Sub Type
	*/
	public void setMOLI_PaymentSubType (String MOLI_PaymentSubType)
	{
		set_Value (COLUMNNAME_MOLI_PaymentSubType, MOLI_PaymentSubType);
	}

	/** Get Payment Sub Type.
		@return Payment Sub Type	  */
	public String getMOLI_PaymentSubType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_PaymentSubType);
	}

	/** Set Payment Type.
		@param MOLI_Payment_Type Payment Type
	*/
	public void setMOLI_Payment_Type (String MOLI_Payment_Type)
	{
		set_Value (COLUMNNAME_MOLI_Payment_Type, MOLI_Payment_Type);
	}

	/** Get Payment Type.
		@return Payment Type	  */
	public String getMOLI_Payment_Type()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Payment_Type);
	}

	/** Set Payment Type.
		@param MOLI_PaymentType Payment Type
	*/
	public void setMOLI_PaymentType (String MOLI_PaymentType)
	{
		set_Value (COLUMNNAME_MOLI_PaymentType, MOLI_PaymentType);
	}

	/** Get Payment Type.
		@return Payment Type	  */
	public String getMOLI_PaymentType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_PaymentType);
	}

	/** Set Payout Reason ID.
		@param MOLI_PayoutReasonID Payout Reason ID
	*/
	public void setMOLI_PayoutReasonID (int MOLI_PayoutReasonID)
	{
		set_Value (COLUMNNAME_MOLI_PayoutReasonID, Integer.valueOf(MOLI_PayoutReasonID));
	}

	/** Get Payout Reason ID.
		@return Payout Reason ID	  */
	public int getMOLI_PayoutReasonID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_PayoutReasonID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Payout Recepient ID.
		@param MOLI_PayoutRecepientID Payout Recepient ID
	*/
	public void setMOLI_PayoutRecepientID (int MOLI_PayoutRecepientID)
	{
		set_Value (COLUMNNAME_MOLI_PayoutRecepientID, Integer.valueOf(MOLI_PayoutRecepientID));
	}

	/** Get Payout Recepient ID.
		@return Payout Recepient ID	  */
	public int getMOLI_PayoutRecepientID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_PayoutRecepientID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set Pos Transactions ID.
		@param MOLI_PosTransactions_ID Pos Transactions ID
	*/
	public void setMOLI_PosTransactions_ID (int MOLI_PosTransactions_ID)
	{
		if (MOLI_PosTransactions_ID < 1)
			set_ValueNoCheck (COLUMNNAME_MOLI_PosTransactions_ID, null);
		else
			set_ValueNoCheck (COLUMNNAME_MOLI_PosTransactions_ID, Integer.valueOf(MOLI_PosTransactions_ID));
	}

	/** Get Pos Transactions ID.
		@return Pos Transactions ID	  */
	public int getMOLI_PosTransactions_ID()
	{
		Integer ii = (Integer)get_Value(COLUMNNAME_MOLI_PosTransactions_ID);
		if (ii == null)
			 return 0;
		return ii.intValue();
	}

	/** Set MOLI_posTransactions_UU.
		@param MOLI_posTransactions_UU MOLI_posTransactions_UU
	*/
	public void setMOLI_posTransactions_UU (String MOLI_posTransactions_UU)
	{
		set_Value (COLUMNNAME_MOLI_posTransactions_UU, MOLI_posTransactions_UU);
	}

	/** Get MOLI_posTransactions_UU.
		@return MOLI_posTransactions_UU	  */
	public String getMOLI_posTransactions_UU()
	{
		return (String)get_Value(COLUMNNAME_MOLI_posTransactions_UU);
	}

	/** Set Properties.
		@param MOLI_Properties Properties
	*/
	public void setMOLI_Properties (String MOLI_Properties)
	{
		set_Value (COLUMNNAME_MOLI_Properties, MOLI_Properties);
	}

	/** Get Properties.
		@return Properties	  */
	public String getMOLI_Properties()
	{
		return (String)get_Value(COLUMNNAME_MOLI_Properties);
	}

	/** Set Tender Amount.
		@param MOLI_TenderAmount Tender Amount
	*/
	public void setMOLI_TenderAmount (BigDecimal MOLI_TenderAmount)
	{
		set_Value (COLUMNNAME_MOLI_TenderAmount, MOLI_TenderAmount);
	}

	/** Get Tender Amount.
		@return Tender Amount	  */
	public BigDecimal getMOLI_TenderAmount()
	{
		BigDecimal bd = (BigDecimal)get_Value(COLUMNNAME_MOLI_TenderAmount);
		if (bd == null)
			 return Env.ZERO;
		return bd;
	}

	/** Set Ticket ID.
		@param MOLI_TicketId Ticket ID
	*/
	public void setMOLI_TicketId (String MOLI_TicketId)
	{
		set_Value (COLUMNNAME_MOLI_TicketId, MOLI_TicketId);
	}

	/** Get Ticket ID.
		@return Ticket ID	  */
	public String getMOLI_TicketId()
	{
		return (String)get_Value(COLUMNNAME_MOLI_TicketId);
	}

	/** Set Transaction Time.
		@param MOLI_TransactionTime Transaction Time
	*/
	public void setMOLI_TransactionTime (Timestamp MOLI_TransactionTime)
	{
		set_Value (COLUMNNAME_MOLI_TransactionTime, MOLI_TransactionTime);
	}

	/** Get Transaction Time.
		@return Transaction Time	  */
	public Timestamp getMOLI_TransactionTime()
	{
		return (Timestamp)get_Value(COLUMNNAME_MOLI_TransactionTime);
	}

	/** Set Transaction Type.
		@param MOLI_TransactionType Transaction Type
	*/
	public void setMOLI_TransactionType (String MOLI_TransactionType)
	{
		set_Value (COLUMNNAME_MOLI_TransactionType, MOLI_TransactionType);
	}

	/** Get Transaction Type.
		@return Transaction Type	  */
	public String getMOLI_TransactionType()
	{
		return (String)get_Value(COLUMNNAME_MOLI_TransactionType);
	}
}