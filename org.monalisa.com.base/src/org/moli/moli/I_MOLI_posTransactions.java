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

/** Generated Interface for MOLI_posTransactions
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_MOLI_posTransactions 
{

    /** TableName=MOLI_posTransactions */
    public static final String Table_Name = "MOLI_posTransactions";

    /** AD_Table_ID=1000071 */
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

    /** Column name C_Invoice_ID */
    public static final String COLUMNNAME_C_Invoice_ID = "C_Invoice_ID";

	/** Set Invoice.
	  * Invoice Identifier
	  */
	public void setC_Invoice_ID (int C_Invoice_ID);

	/** Get Invoice.
	  * Invoice Identifier
	  */
	public int getC_Invoice_ID();

	public org.compiere.model.I_C_Invoice getC_Invoice() throws RuntimeException;

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

    /** Column name MOLI_Amount */
    public static final String COLUMNNAME_MOLI_Amount = "MOLI_Amount";

	/** Set Amount	  */
	public void setMOLI_Amount (BigDecimal MOLI_Amount);

	/** Get Amount	  */
	public BigDecimal getMOLI_Amount();

    /** Column name MOLI_CardAid */
    public static final String COLUMNNAME_MOLI_CardAid = "MOLI_CardAid";

	/** Set Card Aid	  */
	public void setMOLI_CardAid (String MOLI_CardAid);

	/** Get Card Aid	  */
	public String getMOLI_CardAid();

    /** Column name MOLI_CardArqc */
    public static final String COLUMNNAME_MOLI_CardArqc = "MOLI_CardArqc";

	/** Set Card Arqc	  */
	public void setMOLI_CardArqc (String MOLI_CardArqc);

	/** Get Card Arqc	  */
	public String getMOLI_CardArqc();

    /** Column name MOLI_CardAuthCode */
    public static final String COLUMNNAME_MOLI_CardAuthCode = "MOLI_CardAuthCode";

	/** Set Card Auth Code	  */
	public void setMOLI_CardAuthCode (String MOLI_CardAuthCode);

	/** Get Card Auth Code	  */
	public String getMOLI_CardAuthCode();

    /** Column name MOLI_CardBalanceAmount */
    public static final String COLUMNNAME_MOLI_CardBalanceAmount = "MOLI_CardBalanceAmount";

	/** Set Card Balance Amount	  */
	public void setMOLI_CardBalanceAmount (BigDecimal MOLI_CardBalanceAmount);

	/** Get Card Balance Amount	  */
	public BigDecimal getMOLI_CardBalanceAmount();

    /** Column name MOLI_CardBin */
    public static final String COLUMNNAME_MOLI_CardBin = "MOLI_CardBin";

	/** Set Card Bin	  */
	public void setMOLI_CardBin (String MOLI_CardBin);

	/** Get Card Bin	  */
	public String getMOLI_CardBin();

    /** Column name MOLI_CardCashBackAmount */
    public static final String COLUMNNAME_MOLI_CardCashBackAmount = "MOLI_CardCashBackAmount";

	/** Set Card Cash Back Amount	  */
	public void setMOLI_CardCashBackAmount (BigDecimal MOLI_CardCashBackAmount);

	/** Get Card Cash Back Amount	  */
	public BigDecimal getMOLI_CardCashBackAmount();

    /** Column name MOLI_CardExtData */
    public static final String COLUMNNAME_MOLI_CardExtData = "MOLI_CardExtData";

	/** Set Card Ext Data	  */
	public void setMOLI_CardExtData (String MOLI_CardExtData);

	/** Get Card Ext Data	  */
	public String getMOLI_CardExtData();

    /** Column name MOLI_CardHolderName */
    public static final String COLUMNNAME_MOLI_CardHolderName = "MOLI_CardHolderName";

	/** Set Card Holder Name	  */
	public void setMOLI_CardHolderName (String MOLI_CardHolderName);

	/** Get Card Holder Name	  */
	public String getMOLI_CardHolderName();

    /** Column name MOLI_CardMerchantGateway */
    public static final String COLUMNNAME_MOLI_CardMerchantGateway = "MOLI_CardMerchantGateway";

	/** Set Card Merchant Gateway	  */
	public void setMOLI_CardMerchantGateway (String MOLI_CardMerchantGateway);

	/** Get Card Merchant Gateway	  */
	public String getMOLI_CardMerchantGateway();

    /** Column name MOLI_CardName */
    public static final String COLUMNNAME_MOLI_CardName = "MOLI_CardName";

	/** Set Card Name	  */
	public void setMOLI_CardName (String MOLI_CardName);

	/** Get Card Name	  */
	public String getMOLI_CardName();

    /** Column name MOLI_CardNsu */
    public static final String COLUMNNAME_MOLI_CardNsu = "MOLI_CardNsu";

	/** Set Card NSU	  */
	public void setMOLI_CardNsu (String MOLI_CardNsu);

	/** Get Card NSU	  */
	public String getMOLI_CardNsu();

    /** Column name MOLI_CardNumber */
    public static final String COLUMNNAME_MOLI_CardNumber = "MOLI_CardNumber";

	/** Set Card Number	  */
	public void setMOLI_CardNumber (String MOLI_CardNumber);

	/** Get Card Number	  */
	public String getMOLI_CardNumber();

    /** Column name MOLI_CardReader */
    public static final String COLUMNNAME_MOLI_CardReader = "MOLI_CardReader";

	/** Set Card Reader	  */
	public void setMOLI_CardReader (String MOLI_CardReader);

	/** Get Card Reader	  */
	public String getMOLI_CardReader();

    /** Column name MOLI_CardTradeCode */
    public static final String COLUMNNAME_MOLI_CardTradeCode = "MOLI_CardTradeCode";

	/** Set Card Trade Code	  */
	public void setMOLI_CardTradeCode (String MOLI_CardTradeCode);

	/** Get Card Trade Code	  */
	public String getMOLI_CardTradeCode();

    /** Column name MOLI_CardTransactionId */
    public static final String COLUMNNAME_MOLI_CardTransactionId = "MOLI_CardTransactionId";

	/** Set Card Transaction ID	  */
	public void setMOLI_CardTransactionId (String MOLI_CardTransactionId);

	/** Get Card Transaction ID	  */
	public String getMOLI_CardTransactionId();

    /** Column name MOLI_CardType */
    public static final String COLUMNNAME_MOLI_CardType = "MOLI_CardType";

	/** Set Card Type	  */
	public void setMOLI_CardType (String MOLI_CardType);

	/** Get Card Type	  */
	public String getMOLI_CardType();

    /** Column name MOLI_CustomPaymentCashPayment */
    public static final String COLUMNNAME_MOLI_CustomPaymentCashPayment = "MOLI_CustomPaymentCashPayment";

	/** Set Custom Payment Cash Payment	  */
	public void setMOLI_CustomPaymentCashPayment (String MOLI_CustomPaymentCashPayment);

	/** Get Custom Payment Cash Payment	  */
	public String getMOLI_CustomPaymentCashPayment();

    /** Column name MOLI_CustomPaymentFieldName */
    public static final String COLUMNNAME_MOLI_CustomPaymentFieldName = "MOLI_CustomPaymentFieldName";

	/** Set Custom Payment Field Name	  */
	public void setMOLI_CustomPaymentFieldName (String MOLI_CustomPaymentFieldName);

	/** Get Custom Payment Field Name	  */
	public String getMOLI_CustomPaymentFieldName();

    /** Column name MOLI_CustomPaymentName */
    public static final String COLUMNNAME_MOLI_CustomPaymentName = "MOLI_CustomPaymentName";

	/** Set Custom Payment Name	  */
	public void setMOLI_CustomPaymentName (String MOLI_CustomPaymentName);

	/** Get Custom Payment Name	  */
	public String getMOLI_CustomPaymentName();

    /** Column name MOLI_CustomPaymentRef */
    public static final String COLUMNNAME_MOLI_CustomPaymentRef = "MOLI_CustomPaymentRef";

	/** Set Custom Payment Ref	  */
	public void setMOLI_CustomPaymentRef (String MOLI_CustomPaymentRef);

	/** Get Custom Payment Ref	  */
	public String getMOLI_CustomPaymentRef();

    /** Column name MOLI_CustomPaymRefItemId */
    public static final String COLUMNNAME_MOLI_CustomPaymRefItemId = "MOLI_CustomPaymRefItemId";

	/** Set Custom Paym Ref Item ID	  */
	public void setMOLI_CustomPaymRefItemId (int MOLI_CustomPaymRefItemId);

	/** Get Custom Paym Ref Item ID	  */
	public int getMOLI_CustomPaymRefItemId();

    /** Column name MOLI_CustomPaymRefPrintFormat */
    public static final String COLUMNNAME_MOLI_CustomPaymRefPrintFormat = "MOLI_CustomPaymRefPrintFormat";

	/** Set Custom Paym Ref Print Format	  */
	public void setMOLI_CustomPaymRefPrintFormat (String MOLI_CustomPaymRefPrintFormat);

	/** Get Custom Paym Ref Print Format	  */
	public String getMOLI_CustomPaymRefPrintFormat();

    /** Column name MOLI_CustomPaymRefTicketId */
    public static final String COLUMNNAME_MOLI_CustomPaymRefTicketId = "MOLI_CustomPaymRefTicketId";

	/** Set Custom Paym Ref Ticket ID	  */
	public void setMOLI_CustomPaymRefTicketId (int MOLI_CustomPaymRefTicketId);

	/** Get Custom Paym Ref Ticket ID	  */
	public int getMOLI_CustomPaymRefTicketId();

    /** Column name MOLI_DocumentType */
    public static final String COLUMNNAME_MOLI_DocumentType = "MOLI_DocumentType";

	/** Set Document Type	  */
	public void setMOLI_DocumentType (int MOLI_DocumentType);

	/** Get Document Type	  */
	public int getMOLI_DocumentType();

    /** Column name MOLI_GiftCertCashBackAmount */
    public static final String COLUMNNAME_MOLI_GiftCertCashBackAmount = "MOLI_GiftCertCashBackAmount";

	/** Set Gift Cert Cash Back Amount	  */
	public void setMOLI_GiftCertCashBackAmount (BigDecimal MOLI_GiftCertCashBackAmount);

	/** Get Gift Cert Cash Back Amount	  */
	public BigDecimal getMOLI_GiftCertCashBackAmount();

    /** Column name MOLI_GiftCertFaceValue */
    public static final String COLUMNNAME_MOLI_GiftCertFaceValue = "MOLI_GiftCertFaceValue";

	/** Set Gift Cert Face Value	  */
	public void setMOLI_GiftCertFaceValue (BigDecimal MOLI_GiftCertFaceValue);

	/** Get Gift Cert Face Value	  */
	public BigDecimal getMOLI_GiftCertFaceValue();

    /** Column name MOLI_GiftCertNumber */
    public static final String COLUMNNAME_MOLI_GiftCertNumber = "MOLI_GiftCertNumber";

	/** Set Gift Cert Number	  */
	public void setMOLI_GiftCertNumber (String MOLI_GiftCertNumber);

	/** Get Gift Cert Number	  */
	public String getMOLI_GiftCertNumber();

    /** Column name MOLI_GiftCertPaidAmount */
    public static final String COLUMNNAME_MOLI_GiftCertPaidAmount = "MOLI_GiftCertPaidAmount";

	/** Set Gift Cert Paid Amount	  */
	public void setMOLI_GiftCertPaidAmount (BigDecimal MOLI_GiftCertPaidAmount);

	/** Get Gift Cert Paid Amount	  */
	public BigDecimal getMOLI_GiftCertPaidAmount();

    /** Column name MOLI_GiftCertRefundItemId */
    public static final String COLUMNNAME_MOLI_GiftCertRefundItemId = "MOLI_GiftCertRefundItemId";

	/** Set Gift Cert Refund Item ID	  */
	public void setMOLI_GiftCertRefundItemId (int MOLI_GiftCertRefundItemId);

	/** Get Gift Cert Refund Item ID	  */
	public int getMOLI_GiftCertRefundItemId();

    /** Column name MOLI_GiftCertRefundTicketID */
    public static final String COLUMNNAME_MOLI_GiftCertRefundTicketID = "MOLI_GiftCertRefundTicketID";

	/** Set Gift Cert Refund Ticket ID	  */
	public void setMOLI_GiftCertRefundTicketID (int MOLI_GiftCertRefundTicketID);

	/** Get Gift Cert Refund Ticket ID	  */
	public int getMOLI_GiftCertRefundTicketID();

    /** Column name MOLI_GlobalID */
    public static final String COLUMNNAME_MOLI_GlobalID = "MOLI_GlobalID";

	/** Set Global ID	  */
	public void setMOLI_GlobalID (String MOLI_GlobalID);

	/** Get Global ID	  */
	public String getMOLI_GlobalID();

    /** Column name MOLI_PaymentSubType */
    public static final String COLUMNNAME_MOLI_PaymentSubType = "MOLI_PaymentSubType";

	/** Set Payment Sub Type	  */
	public void setMOLI_PaymentSubType (String MOLI_PaymentSubType);

	/** Get Payment Sub Type	  */
	public String getMOLI_PaymentSubType();

    /** Column name MOLI_Payment_Type */
    public static final String COLUMNNAME_MOLI_Payment_Type = "MOLI_Payment_Type";

	/** Set Payment Type	  */
	public void setMOLI_Payment_Type (String MOLI_Payment_Type);

	/** Get Payment Type	  */
	public String getMOLI_Payment_Type();

    /** Column name MOLI_PaymentType */
    public static final String COLUMNNAME_MOLI_PaymentType = "MOLI_PaymentType";

	/** Set Payment Type	  */
	public void setMOLI_PaymentType (String MOLI_PaymentType);

	/** Get Payment Type	  */
	public String getMOLI_PaymentType();

    /** Column name MOLI_PayoutReasonID */
    public static final String COLUMNNAME_MOLI_PayoutReasonID = "MOLI_PayoutReasonID";

	/** Set Payout Reason ID	  */
	public void setMOLI_PayoutReasonID (int MOLI_PayoutReasonID);

	/** Get Payout Reason ID	  */
	public int getMOLI_PayoutReasonID();

    /** Column name MOLI_PayoutRecepientID */
    public static final String COLUMNNAME_MOLI_PayoutRecepientID = "MOLI_PayoutRecepientID";

	/** Set Payout Recepient ID	  */
	public void setMOLI_PayoutRecepientID (int MOLI_PayoutRecepientID);

	/** Get Payout Recepient ID	  */
	public int getMOLI_PayoutRecepientID();

    /** Column name MOLI_PosTransactions_ID */
    public static final String COLUMNNAME_MOLI_PosTransactions_ID = "MOLI_PosTransactions_ID";

	/** Set Pos Transactions ID	  */
	public void setMOLI_PosTransactions_ID (int MOLI_PosTransactions_ID);

	/** Get Pos Transactions ID	  */
	public int getMOLI_PosTransactions_ID();

    /** Column name MOLI_posTransactions_UU */
    public static final String COLUMNNAME_MOLI_posTransactions_UU = "MOLI_posTransactions_UU";

	/** Set MOLI_posTransactions_UU	  */
	public void setMOLI_posTransactions_UU (String MOLI_posTransactions_UU);

	/** Get MOLI_posTransactions_UU	  */
	public String getMOLI_posTransactions_UU();

    /** Column name MOLI_Properties */
    public static final String COLUMNNAME_MOLI_Properties = "MOLI_Properties";

	/** Set Properties	  */
	public void setMOLI_Properties (String MOLI_Properties);

	/** Get Properties	  */
	public String getMOLI_Properties();

    /** Column name MOLI_TenderAmount */
    public static final String COLUMNNAME_MOLI_TenderAmount = "MOLI_TenderAmount";

	/** Set Tender Amount	  */
	public void setMOLI_TenderAmount (BigDecimal MOLI_TenderAmount);

	/** Get Tender Amount	  */
	public BigDecimal getMOLI_TenderAmount();

    /** Column name MOLI_TicketId */
    public static final String COLUMNNAME_MOLI_TicketId = "MOLI_TicketId";

	/** Set Ticket ID	  */
	public void setMOLI_TicketId (String MOLI_TicketId);

	/** Get Ticket ID	  */
	public String getMOLI_TicketId();

    /** Column name MOLI_TransactionTime */
    public static final String COLUMNNAME_MOLI_TransactionTime = "MOLI_TransactionTime";

	/** Set Transaction Time	  */
	public void setMOLI_TransactionTime (Timestamp MOLI_TransactionTime);

	/** Get Transaction Time	  */
	public Timestamp getMOLI_TransactionTime();

    /** Column name MOLI_TransactionType */
    public static final String COLUMNNAME_MOLI_TransactionType = "MOLI_TransactionType";

	/** Set Transaction Type	  */
	public void setMOLI_TransactionType (String MOLI_TransactionType);

	/** Get Transaction Type	  */
	public String getMOLI_TransactionType();

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
