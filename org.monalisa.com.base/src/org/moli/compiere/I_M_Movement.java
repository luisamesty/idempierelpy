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
package org.moli.compiere;

import java.math.BigDecimal;
import java.sql.Timestamp;
import org.compiere.model.*;
import org.compiere.util.KeyNamePair;

/** Generated Interface for M_Movement
 *  @author iDempiere (generated) 
 *  @version Release 11
 */
@SuppressWarnings("all")
public interface I_M_Movement 
{

    /** TableName=M_Movement */
    public static final String Table_Name = "M_Movement";

    /** AD_Table_ID=323 */
    public static final int Table_ID = 323;

    KeyNamePair Model = new KeyNamePair(Table_ID, Table_Name);

    /** AccessLevel = 1 - Org 
     */
    BigDecimal accessLevel = BigDecimal.valueOf(1);

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

    /** Column name AD_OrgTrx_ID */
    public static final String COLUMNNAME_AD_OrgTrx_ID = "AD_OrgTrx_ID";

	/** Set Trx Organization.
	  * Performing or initiating organization
	  */
	public void setAD_OrgTrx_ID (int AD_OrgTrx_ID);

	/** Get Trx Organization.
	  * Performing or initiating organization
	  */
	public int getAD_OrgTrx_ID();

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

    /** Column name ApprovalAmt */
    public static final String COLUMNNAME_ApprovalAmt = "ApprovalAmt";

	/** Set Approval Amount.
	  * Document Approval Amount
	  */
	public void setApprovalAmt (BigDecimal ApprovalAmt);

	/** Get Approval Amount.
	  * Document Approval Amount
	  */
	public BigDecimal getApprovalAmt();

    /** Column name C_Activity_ID */
    public static final String COLUMNNAME_C_Activity_ID = "C_Activity_ID";

	/** Set Activity.
	  * Business Activity
	  */
	public void setC_Activity_ID (int C_Activity_ID);

	/** Get Activity.
	  * Business Activity
	  */
	public int getC_Activity_ID();

	public org.compiere.model.I_C_Activity getC_Activity() throws RuntimeException;

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

    /** Column name C_Campaign_ID */
    public static final String COLUMNNAME_C_Campaign_ID = "C_Campaign_ID";

	/** Set Campaign.
	  * Marketing Campaign
	  */
	public void setC_Campaign_ID (int C_Campaign_ID);

	/** Get Campaign.
	  * Marketing Campaign
	  */
	public int getC_Campaign_ID();

	public org.compiere.model.I_C_Campaign getC_Campaign() throws RuntimeException;

    /** Column name C_Charge_ID */
    public static final String COLUMNNAME_C_Charge_ID = "C_Charge_ID";

	/** Set Charge.
	  * Additional document charges
	  */
	public void setC_Charge_ID (int C_Charge_ID);

	/** Get Charge.
	  * Additional document charges
	  */
	public int getC_Charge_ID();

	public org.compiere.model.I_C_Charge getC_Charge() throws RuntimeException;

    /** Column name C_DocType_ID */
    public static final String COLUMNNAME_C_DocType_ID = "C_DocType_ID";

	/** Set Document Type.
	  * Document type or rules
	  */
	public void setC_DocType_ID (int C_DocType_ID);

	/** Get Document Type.
	  * Document type or rules
	  */
	public int getC_DocType_ID();

	public org.compiere.model.I_C_DocType getC_DocType() throws RuntimeException;

    /** Column name ChargeAmt */
    public static final String COLUMNNAME_ChargeAmt = "ChargeAmt";

	/** Set Charge amount.
	  * Charge Amount
	  */
	public void setChargeAmt (BigDecimal ChargeAmt);

	/** Get Charge amount.
	  * Charge Amount
	  */
	public BigDecimal getChargeAmt();

    /** Column name C_Project_ID */
    public static final String COLUMNNAME_C_Project_ID = "C_Project_ID";

	/** Set Project.
	  * Financial Project
	  */
	public void setC_Project_ID (int C_Project_ID);

	/** Get Project.
	  * Financial Project
	  */
	public int getC_Project_ID();

	public org.compiere.model.I_C_Project getC_Project() throws RuntimeException;

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

    /** Column name CreateFrom */
    public static final String COLUMNNAME_CreateFrom = "CreateFrom";

	/** Set Create lines from.
	  * Process which will generate a new document lines based on an existing document
	  */
	public void setCreateFrom (String CreateFrom);

	/** Get Create lines from.
	  * Process which will generate a new document lines based on an existing document
	  */
	public String getCreateFrom();

    /** Column name DateReceived */
    public static final String COLUMNNAME_DateReceived = "DateReceived";

	/** Set Date Received.
	  * Date a product was received
	  */
	public void setDateReceived (Timestamp DateReceived);

	/** Get Date Received.
	  * Date a product was received
	  */
	public Timestamp getDateReceived();

    /** Column name DD_Order_ID */
    public static final String COLUMNNAME_DD_Order_ID = "DD_Order_ID";

	/** Set Distribution Order	  */
	public void setDD_Order_ID (int DD_Order_ID);

	/** Get Distribution Order	  */
	public int getDD_Order_ID();

	public org.eevolution.model.I_DD_Order getDD_Order() throws RuntimeException;

    /** Column name DeliveryRule */
    public static final String COLUMNNAME_DeliveryRule = "DeliveryRule";

	/** Set Delivery Rule.
	  * Defines the timing of Delivery
	  */
	public void setDeliveryRule (String DeliveryRule);

	/** Get Delivery Rule.
	  * Defines the timing of Delivery
	  */
	public String getDeliveryRule();

    /** Column name DeliveryViaRule */
    public static final String COLUMNNAME_DeliveryViaRule = "DeliveryViaRule";

	/** Set Delivery Via.
	  * How the order will be delivered
	  */
	public void setDeliveryViaRule (String DeliveryViaRule);

	/** Get Delivery Via.
	  * How the order will be delivered
	  */
	public String getDeliveryViaRule();

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

    /** Column name DocAction */
    public static final String COLUMNNAME_DocAction = "DocAction";

	/** Set Document Action.
	  * The targeted status of the document
	  */
	public void setDocAction (String DocAction);

	/** Get Document Action.
	  * The targeted status of the document
	  */
	public String getDocAction();

    /** Column name DocStatus */
    public static final String COLUMNNAME_DocStatus = "DocStatus";

	/** Set Document Status.
	  * The current status of the document
	  */
	public void setDocStatus (String DocStatus);

	/** Get Document Status.
	  * The current status of the document
	  */
	public String getDocStatus();

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

    /** Column name DRIVERID */
    public static final String COLUMNNAME_DRIVERID = "DRIVERID";

	/** Set DRIVERID	  */
	public void setDRIVERID (String DRIVERID);

	/** Get DRIVERID	  */
	public String getDRIVERID();

    /** Column name DRIVERNAME */
    public static final String COLUMNNAME_DRIVERNAME = "DRIVERNAME";

	/** Set DRIVERNAME	  */
	public void setDRIVERNAME (String DRIVERNAME);

	/** Get DRIVERNAME	  */
	public String getDRIVERNAME();

    /** Column name FreightAmt */
    public static final String COLUMNNAME_FreightAmt = "FreightAmt";

	/** Set Freight Amount.
	  * Freight Amount 
	  */
	public void setFreightAmt (BigDecimal FreightAmt);

	/** Get Freight Amount.
	  * Freight Amount 
	  */
	public BigDecimal getFreightAmt();

    /** Column name FreightCostRule */
    public static final String COLUMNNAME_FreightCostRule = "FreightCostRule";

	/** Set Freight Cost Rule.
	  * Method for charging Freight
	  */
	public void setFreightCostRule (String FreightCostRule);

	/** Get Freight Cost Rule.
	  * Method for charging Freight
	  */
	public String getFreightCostRule();

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

    /** Column name IsInTransit */
    public static final String COLUMNNAME_IsInTransit = "IsInTransit";

	/** Set In Transit.
	  * Movement is in transit
	  */
	public void setIsInTransit (boolean IsInTransit);

	/** Get In Transit.
	  * Movement is in transit
	  */
	public boolean isInTransit();

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

    /** Column name M_Movement_UU */
    public static final String COLUMNNAME_M_Movement_UU = "M_Movement_UU";

	/** Set M_Movement_UU	  */
	public void setM_Movement_UU (String M_Movement_UU);

	/** Get M_Movement_UU	  */
	public String getM_Movement_UU();

    /** Column name MOLI_Cdc */
    public static final String COLUMNNAME_MOLI_Cdc = "MOLI_Cdc";

	/** Set CDC	  */
	public void setMOLI_Cdc (String MOLI_Cdc);

	/** Get CDC	  */
	public String getMOLI_Cdc();

    /** Column name MOLI_Distancia */
    public static final String COLUMNNAME_MOLI_Distancia = "MOLI_Distancia";

	/** Set Distancia	  */
	public void setMOLI_Distancia (String MOLI_Distancia);

	/** Get Distancia	  */
	public String getMOLI_Distancia();

    /** Column name MOLI_EndTransfer */
    public static final String COLUMNNAME_MOLI_EndTransfer = "MOLI_EndTransfer";

	/** Set End Transfer	  */
	public void setMOLI_EndTransfer (Timestamp MOLI_EndTransfer);

	/** Get End Transfer	  */
	public Timestamp getMOLI_EndTransfer();

    /** Column name MOLI_FiscalDocumentNo */
    public static final String COLUMNNAME_MOLI_FiscalDocumentNo = "MOLI_FiscalDocumentNo";

	/** Set Fiscal Document NO.
	  * Fiscal Document NO
	  */
	public void setMOLI_FiscalDocumentNo (String MOLI_FiscalDocumentNo);

	/** Get Fiscal Document NO.
	  * Fiscal Document NO
	  */
	public String getMOLI_FiscalDocumentNo();

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

    /** Column name MOLI_FsVoidMessage */
    public static final String COLUMNNAME_MOLI_FsVoidMessage = "MOLI_FsVoidMessage";

	/** Set Fs Void Message	  */
	public void setMOLI_FsVoidMessage (String MOLI_FsVoidMessage);

	/** Get Fs Void Message	  */
	public String getMOLI_FsVoidMessage();

    /** Column name MOLI_FsVoidStatus */
    public static final String COLUMNNAME_MOLI_FsVoidStatus = "MOLI_FsVoidStatus";

	/** Set Fs Void Status	  */
	public void setMOLI_FsVoidStatus (String MOLI_FsVoidStatus);

	/** Get Fs Void Status	  */
	public String getMOLI_FsVoidStatus();

    /** Column name MOLI_LinkAuthId */
    public static final String COLUMNNAME_MOLI_LinkAuthId = "MOLI_LinkAuthId";

	/** Set Timbrado Asociado	  */
	public void setMOLI_LinkAuthId (String MOLI_LinkAuthId);

	/** Get Timbrado Asociado	  */
	public String getMOLI_LinkAuthId();

    /** Column name MOLI_LinkInvNo */
    public static final String COLUMNNAME_MOLI_LinkInvNo = "MOLI_LinkInvNo";

	/** Set Factura Asociado	  */
	public void setMOLI_LinkInvNo (String MOLI_LinkInvNo);

	/** Get Factura Asociado	  */
	public String getMOLI_LinkInvNo();

    /** Column name MOLI_PreImpNO */
    public static final String COLUMNNAME_MOLI_PreImpNO = "MOLI_PreImpNO";

	/** Set Pre Imp NO	  */
	public void setMOLI_PreImpNO (String MOLI_PreImpNO);

	/** Get Pre Imp NO	  */
	public String getMOLI_PreImpNO();

    /** Column name MOLI_RucTransportista */
    public static final String COLUMNNAME_MOLI_RucTransportista = "MOLI_RucTransportista";

	/** Set Ruc Transportista	  */
	public void setMOLI_RucTransportista (String MOLI_RucTransportista);

	/** Get Ruc Transportista	  */
	public String getMOLI_RucTransportista();

    /** Column name MOLI_StartTransfer */
    public static final String COLUMNNAME_MOLI_StartTransfer = "MOLI_StartTransfer";

	/** Set Start Transfer	  */
	public void setMOLI_StartTransfer (Timestamp MOLI_StartTransfer);

	/** Get Start Transfer	  */
	public Timestamp getMOLI_StartTransfer();

    /** Column name MOLI_TransportDirection */
    public static final String COLUMNNAME_MOLI_TransportDirection = "MOLI_TransportDirection";

	/** Set Transport Direction	  */
	public void setMOLI_TransportDirection (String MOLI_TransportDirection);

	/** Get Transport Direction	  */
	public String getMOLI_TransportDirection();

    /** Column name MOLI_Transportista */
    public static final String COLUMNNAME_MOLI_Transportista = "MOLI_Transportista";

	/** Set Transportista	  */
	public void setMOLI_Transportista (String MOLI_Transportista);

	/** Get Transportista	  */
	public String getMOLI_Transportista();

    /** Column name MOLI_VehicleType */
    public static final String COLUMNNAME_MOLI_VehicleType = "MOLI_VehicleType";

	/** Set Vehicle Type	  */
	public void setMOLI_VehicleType (String MOLI_VehicleType);

	/** Get Vehicle Type	  */
	public String getMOLI_VehicleType();

    /** Column name MovementDate */
    public static final String COLUMNNAME_MovementDate = "MovementDate";

	/** Set Movement Date.
	  * Date a product was moved in or out of inventory
	  */
	public void setMovementDate (Timestamp MovementDate);

	/** Get Movement Date.
	  * Date a product was moved in or out of inventory
	  */
	public Timestamp getMovementDate();

    /** Column name M_Shipper_ID */
    public static final String COLUMNNAME_M_Shipper_ID = "M_Shipper_ID";

	/** Set Shipper.
	  * Method or manner of product delivery
	  */
	public void setM_Shipper_ID (int M_Shipper_ID);

	/** Get Shipper.
	  * Method or manner of product delivery
	  */
	public int getM_Shipper_ID();

	public org.compiere.model.I_M_Shipper getM_Shipper() throws RuntimeException;

    /** Column name M_Warehouse_ID */
    public static final String COLUMNNAME_M_Warehouse_ID = "M_Warehouse_ID";

	/** Set Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public void setM_Warehouse_ID (int M_Warehouse_ID);

	/** Get Warehouse.
	  * Storage Warehouse and Service Point
	  */
	public int getM_Warehouse_ID();

	public org.compiere.model.I_M_Warehouse getM_Warehouse() throws RuntimeException;

    /** Column name M_WarehouseTo_ID */
    public static final String COLUMNNAME_M_WarehouseTo_ID = "M_WarehouseTo_ID";

	/** Set Warehouse To.
	  * To Storage Warehouse and Service Point
	  */
	public void setM_WarehouseTo_ID (int M_WarehouseTo_ID);

	/** Get Warehouse To.
	  * To Storage Warehouse and Service Point
	  */
	public int getM_WarehouseTo_ID();

	public org.compiere.model.I_M_Warehouse getM_WarehouseTo() throws RuntimeException;

    /** Column name POReference */
    public static final String COLUMNNAME_POReference = "POReference";

	/** Set Order Reference.
	  * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public void setPOReference (String POReference);

	/** Get Order Reference.
	  * Transaction Reference Number (Sales Order, Purchase Order) of your Business Partner
	  */
	public String getPOReference();

    /** Column name Posted */
    public static final String COLUMNNAME_Posted = "Posted";

	/** Set Posted.
	  * Posting status
	  */
	public void setPosted (boolean Posted);

	/** Get Posted.
	  * Posting status
	  */
	public boolean isPosted();

    /** Column name PriorityRule */
    public static final String COLUMNNAME_PriorityRule = "PriorityRule";

	/** Set Priority.
	  * Priority of a document
	  */
	public void setPriorityRule (String PriorityRule);

	/** Get Priority.
	  * Priority of a document
	  */
	public String getPriorityRule();

    /** Column name Processed */
    public static final String COLUMNNAME_Processed = "Processed";

	/** Set Processed.
	  * The document has been processed
	  */
	public void setProcessed (boolean Processed);

	/** Get Processed.
	  * The document has been processed
	  */
	public boolean isProcessed();

    /** Column name ProcessedOn */
    public static final String COLUMNNAME_ProcessedOn = "ProcessedOn";

	/** Set Processed On.
	  * The date+time (expressed in decimal format) when the document has been processed
	  */
	public void setProcessedOn (BigDecimal ProcessedOn);

	/** Get Processed On.
	  * The date+time (expressed in decimal format) when the document has been processed
	  */
	public BigDecimal getProcessedOn();

    /** Column name Processing */
    public static final String COLUMNNAME_Processing = "Processing";

	/** Set Process Now	  */
	public void setProcessing (boolean Processing);

	/** Get Process Now	  */
	public boolean isProcessing();

    /** Column name Reversal_ID */
    public static final String COLUMNNAME_Reversal_ID = "Reversal_ID";

	/** Set Reversal ID.
	  * ID of document reversal
	  */
	public void setReversal_ID (int Reversal_ID);

	/** Get Reversal ID.
	  * ID of document reversal
	  */
	public int getReversal_ID();

	public org.compiere.model.I_M_Movement getReversal() throws RuntimeException;

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

    /** Column name User1_ID */
    public static final String COLUMNNAME_User1_ID = "User1_ID";

	/** Set User Element List 1.
	  * User defined list element #1
	  */
	public void setUser1_ID (int User1_ID);

	/** Get User Element List 1.
	  * User defined list element #1
	  */
	public int getUser1_ID();

	public org.compiere.model.I_C_ElementValue getUser1() throws RuntimeException;

    /** Column name User2_ID */
    public static final String COLUMNNAME_User2_ID = "User2_ID";

	/** Set User Element List 2.
	  * User defined list element #2
	  */
	public void setUser2_ID (int User2_ID);

	/** Get User Element List 2.
	  * User defined list element #2
	  */
	public int getUser2_ID();

	public org.compiere.model.I_C_ElementValue getUser2() throws RuntimeException;

    /** Column name VEHICLE */
    public static final String COLUMNNAME_VEHICLE = "VEHICLE";

	/** Set VEHICLE	  */
	public void setVEHICLE (String VEHICLE);

	/** Get VEHICLE	  */
	public String getVEHICLE();

    /** Column name VEHICLEID */
    public static final String COLUMNNAME_VEHICLEID = "VEHICLEID";

	/** Set VEHICLEID	  */
	public void setVEHICLEID (String VEHICLEID);

	/** Get VEHICLEID	  */
	public String getVEHICLEID();
}
