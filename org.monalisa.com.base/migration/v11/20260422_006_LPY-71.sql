-- 20260422_006_LPY-71.sql
-- AD_Column_MOLI_UPSERTS.sql
-- Table
-- MOLI_BrandUSP OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003337,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e5cbbd41-7632-4204-b480-737dfc6e6932',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000124),
(1003338,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','604884f9-9f1f-43d1-ba0e-b7b05223be84',NOW(),'N','AD_Org_ID','Organization','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000124),
(1003339,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','97164c84-748b-4204-ae63-63d0fc41db7a',NOW(),'N','Created','Created','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000124),
(1003340,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','c9b1d50d-2d5e-4e4b-9541-bd30a0f48483',NOW(),'N','CreatedBy','Created By','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000124),
(1003341,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','cee8841a-b659-4ccd-ac7d-9416e5ac4704',NOW(),'N','Updated','Updated','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000124),
(1003342,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','808e5f86-24d0-4de4-859f-85b422f6d06c',NOW(),'N','UpdatedBy','Updated By','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000124),
(1003343,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','c49c9182-1576-4719-bbf1-5782d63192f7',NOW(),'Y','IsActive','Active','N','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000124),
(1003344,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','61876582-6cb0-4573-b642-8de0b27be8d3',NOW(),'N','MOLI_BrandUSP_ID','Brand USP','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_BrandUSP_ID'),13,1000124),
(1003345,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','229da8d6-c946-4550-a74e-408421114c61',NOW(),'Y','MOLI_BrandUSP_UU','MOLI_BrandUSP_UU','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_BrandUSP_UU'),200231,1000124),
(1003346,0,'Y',0.0,'N','N','N',0,'N',255,'N','N','N','Y','9a4b1ebd-1ff7-44be-972f-e3cc4c33aeac',NOW(),'Y','Description','Description','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000124),
(1003347,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','999e480a-7e33-4d75-8d92-e8b4237fd265',NOW(),'Y','SalesRep_ID','Sales Representative','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SalesRep_ID'),30,1000124),
(1003348,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','02b2c2e1-c317-4525-aca8-12fcc36f49c6',NOW(),'Y','MOLI_ProductBrand_ID','Product Brand','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),19,1000124),
(1003349,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','d31dc15f-e7db-4f14-986a-db5433ccf311',NOW(),'Y','AD_OrgTrx_ID','Trx Organization','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_OrgTrx_ID'),18,1000124),
(1003350,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','a1d25bbe-60e5-4d51-a772-1a235d98594f',NOW(),'Y','M_Product_Category_ID','Product Category','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Product_Category_ID'),19,1000124),
(1003351,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','c2ba9c09-cb48-4327-8731-de3c35374883',NOW(),'Y','MOLI_BrandUSP','BrandUSP','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_BrandUSP'),10,1000124),
(1003353,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','16a47cd8-4e9d-4984-a903-cbb2118585a3',NOW(),'Y','C_BPartner_ID','Business Partner','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_ID'),30,1000124),
(1003354,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','6f1f592b-9fce-46e8-8510-b43be474efc8',NOW(),'Y','C_BPartner_Location_ID','Partner Location','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_Location_ID'),19,1000124),
(1003355,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','d0da69fd-baae-4d05-8cf8-34fab84a966d',NOW(),'Y','Bill_BPartner_ID','Invoice Partner','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Bill_BPartner_ID'),30,1000124),
(1003356,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','3c500b23-772e-416d-95c8-0699fd50d630',NOW(),'Y','Bill_Location_ID','Invoice Location','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Bill_Location_ID'),18,1000124),
(1003357,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','91462e32-b853-4ce6-9426-c5eb55d4db74',NOW(),'Y','SOPOType','SO/PO Type','Y','Y',100,0,'N','Y',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SOPOType'),17,1000124)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_C_InvoicePayment OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003187,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','bdb60c6f-f334-40a9-9b61-0397d3ad3b64',NOW(),'N','AD_Client_ID','Tenant','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),19,1000121),
(1003188,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','9ccbef32-e64c-4096-a64f-b130dbea372b',NOW(),'N','AD_Org_ID','Organization','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000121),
(1003189,0,'N',0.0,'N','N','N',0,'N',29,'N','N','N','Y','bed14319-95b2-40c8-a9a9-7d02ee60708e',NOW(),'N','DateInvoiced','Date Invoiced','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DateInvoiced'),15,1000121),
(1003190,10,'N',0.0,'N','N','N',0,'N',30,'Y','N','N','Y','fc1790e4-a2d3-4b9b-b779-a88fb800229b',NOW(),'N','DocumentNo','Document No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocumentNo'),10,1000121),
(1003191,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','74a5f720-a5b2-4902-a502-973c3fe199cb',NOW(),'N','MOLI_DocType','DocumentType','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DocType'),10,1000121),
(1003192,0,'N',0.0,'Y','N','N',0,'N',2147483647,'N','N','N','Y','58fd0697-3a66-457a-b909-3d4e6da422a2',NOW(),'N','IsSOTrx','Sales Transaction','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsSOTrx'),20,1000121),
(1003193,0,'N',0.0,'N','N','N',0,'N',2,'N','N','N','Y','f07177c1-085e-4a85-a414-176343df56af',NOW(),'N','DocStatus','Document Status','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocStatus'),17,1000121),
(1003194,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','526b4bff-3689-4a60-a411-d94a395b9296',NOW(),'N','C_BPartner_ID','Business Partner','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_ID'),30,1000121),
(1003195,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','6a90b151-8f74-4257-aa45-73f73eafe086',NOW(),'N','C_Currency_ID','Currency','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Currency_ID'),19,1000121),
(1003196,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','f8a3fb6e-cdd5-479f-a28b-e32fcdbf615e',NOW(),'N','Multiplier','Multiplier','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Multiplier'),11,1000121),
(1003197,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','684afdea-5ffe-4a6a-bbe1-5e0f1c9cea16',NOW(),'N','GrandTotal','Grand Total','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'GrandTotal'),12,1000121),
(1003198,0,'N',0.0,'N','N','N',0,'N',255,'N','N','N','Y','099a3f62-e656-44b4-88af-b744ae58a603',NOW(),'N','MOLI_PayRuleText','PayRuleText','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PayRuleText'),14,1000121),
(1003199,0,'N',0.0,'Y','N','N',0,'N',2147483647,'N','N','N','Y','6174a3c2-e58c-4bb2-847a-1ee178543e2c',NOW(),'N','IsPaid','Paid','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsPaid'),20,1000121),
(1003200,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','68729b2b-eda6-40b7-b677-6b291965b991',NOW(),'N','C_Order_ID','Order','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Order_ID'),30,1000121),
(1003201,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','c0ae431e-4dbf-4377-b1bc-85378a009b13',NOW(),'N','AllocatedAmt','Allocated Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AllocatedAmt'),12,1000121),
(1003202,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','cf4f5f47-f04f-4200-b837-4893f876507d',NOW(),'N','DiscountAmt','Discount Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DiscountAmt'),12,1000121),
(1003203,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','20c4bad7-bf07-4cfd-836f-724954731b21',NOW(),'N','WriteOffAmt','Write-off Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'WriteOffAmt'),12,1000121),
(1003204,0,'N',0.0,'N','N','N',0,'N',2147483647,'N','N','N','Y','dadb27ca-af1d-4501-9319-f92d23afa490',NOW(),'N','ReferenceNo','Reference No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ReferenceNo'),10,1000121),
(1003206,0,'N',0.0,'N','N','N',0,'N',14,'N','N','N','Y','176a6cd8-20fb-4bc8-a55d-35c21380b826',NOW(),'N','MOLI_Accum_OpenAmt','Accumulate OpenAmt','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Accum_OpenAmt'),12,1000121)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_GeoRefCode OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001518,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','529c2bfd-53fd-4e2c-9a32-4a74d7c5e6af',NOW(),'Y','MOLI_GeoRefCode_DepartmentKey','Geo Ref Code Department Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_DepartmentKey'),10,1000068),
(1001520,10,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','2358c543-4310-41f5-a57c-b6108ffd3120',NOW(),'Y','MOLI_GeoRefCode_DepartmentName','Geo Ref Code Department Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_DepartmentName'),10,1000068),
(1001521,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','c7ffbc3f-d799-450e-8b76-8566752dd868',NOW(),'Y','MOLI_GeoRefCode_SectionKey','Geo Ref Code Section Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_SectionKey'),10,1000068),
(1001522,20,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','eecf3f75-9153-48ea-8ae1-bb17fb15b675',NOW(),'Y','MOLI_GeoRefCode_SectionName','Geo Ref Code Section Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_SectionName'),10,1000068),
(1001523,30,'Y',0,'N','N','Y',0,'N',60,'Y','N','N','Y','d306726a-1d39-41a0-b7f6-9105424aebad',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000068),
(1001524,40,'Y',0,'N','N','N',0,'N',40,'Y','N','N','Y','e8c2f215-ec34-4c7e-9520-4bc2d26ca168',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000068),
(1001762,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','4404a734-8d60-4a04-a620-f4fef05dcf5d',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000068),
(1001763,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','529e3ed8-8d25-45a0-95f4-bbd0657f9bda',NOW(),'N','AD_Org_ID','Organization','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000068),
(1001764,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','f30b1831-fccf-4cf6-a996-90bbe0f79d5f',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000068),
(1001765,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','d136406d-1a6c-4cdc-b2c9-e9c31d6f8cb1',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000068),
(1001766,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','0eb87220-c2c3-4de1-9ca9-8304281d5a47',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000068),
(1001767,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','d3418f9f-739a-405d-9152-29bb0dbf554c',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000068),
(1001768,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','223d3cd1-7261-4a74-9dac-855e6781c557',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000068),
(1001769,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','c2a7740d-cb01-40e5-9cff-52283ff95ee9',NOW(),'N','MOLI_GeoRefCode_ID','Geo Ref Code ID','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_ID'),13,1000068),
(1001770,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','416d8200-b85b-40bf-b4d4-b611e06aff51',NOW(),'Y','MOLI_GeoRefCode_UU','Geo Ref Code UUID','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_UU'),200231,1000068)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_HS OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001686,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e803821f-ad88-4ee6-a9dd-ed1dd0d7458e',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000074),
(1001687,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','6d949c9f-1c04-458c-81d9-75b59de81ef9',NOW(),'N','AD_Org_ID','Organization','N','Y',100,0,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000074),
(1001688,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','f739658d-f84f-415e-9ca6-d6d7a540f4ca',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000074),
(1001689,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','0e1f72db-e812-4113-a859-b4525f06cd27',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000074),
(1001690,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','d91b41c4-a391-4dd4-94d1-f403351abd36',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000074),
(1001691,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','0cc8a22c-efbf-47b9-bc6e-f367afe236cf',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000074),
(1001692,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','87c8c6e9-33cd-40a3-8c17-f7d000c204b5',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000074),
(1001693,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','0d613c2d-80b7-4755-8399-6a61a29e04c7',NOW(),'N','MOLI_HS_ID','Harmonized System','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HS_ID'),13,1000074),
(1001694,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','277875a3-47cc-4f2e-bf5a-e097811512fd',NOW(),'Y','MOLI_HS_UU','HS UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HS_UU'),200231,1000074),
(1001695,10,'Y',0.0,'N','N','N',0,'N',40,'Y','N','N','Y','72cef2b2-9226-4377-a155-db8a6bfca6d9',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000074),
(1001696,20,'Y',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','508584e7-f654-4ee6-8be0-ca2421cd63bb',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000074),
(1001697,0,'Y',0.0,'N','N','N',0,'N',255,'N','N','N','Y','3ceb0d6c-6b62-46b0-9a16-d927a6e00350',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000074),
(1001698,0,'Y',0.0,'N','N','N',0,'N',2000,'N','N','N','Y','b3bf0c14-19d9-4234-8665-6f9cc6eb764d',NOW(),'Y','Help','Comment/Help','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Help'),10,1000074),
(1001699,0,'Y',1,'N','N','N',0,'N',2000,'N','N','N','Y','b5c54086-c700-43d3-8a32-8554f93c50f1',NOW(),'Y','MOLI_HSChapter','HS Chapter','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSChapter'),10,1000074),
(1001700,0,'Y',1,'N','N','N',0,'N',2000,'N','N','N','Y','5aa8cc11-3c10-4b4e-8479-63b3450bf265',NOW(),'Y','MOLI_HSHeading','HS Heading','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSHeading'),10,1000074),
(1001701,0,'Y',1,'N','N','N',0,'N',2000,'N','N','N','Y','817f2e53-aa36-437b-a764-eae4493f7037',NOW(),'Y','MOLI_HSSubHeading','HS SubHeading','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSSubHeading'),10,1000074),
(1001702,0,'Y',1,'N','N','N',0,'N',2000,'N','N','N','Y','875ce70e-7e5a-4c84-a6ed-8d06494e7225',NOW(),'Y','MOLI_HSSubHeadingExt','HS SubHeading Ext','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSSubHeadingExt'),10,1000074),
(1001703,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','e4a59fed-bdba-4db5-ac4a-65564ad0d8a3',NOW(),'Y','MOLI_HSTariff','HS Tariff','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSTariff'),22,1000074),
(1001704,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','0f81f1cc-a8b1-4c8b-a406-67c06bdb0cd8',NOW(),'Y','MOLI_HSTariffN','HS Tariff N','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSTariffN'),22,1000074),
(1001705,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','9d53620b-6d4b-43f7-ab62-8bdd0928fd9c',NOW(),'Y','MOLI_HSVat','HS Vat','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSVat'),22,1000074),
(1001706,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','71dad211-d4b5-4adc-967b-2edd38275901',NOW(),'Y','MOLI_HSSalesTax','HS SalesTax','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSSalesTax'),22,1000074),
(1001707,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','1c00995c-91cd-4e14-a8b4-a6620cd7412c',NOW(),'Y','MOLI_HSIncomeTax','HS IncomeTax','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSIncomeTax'),22,1000074),
(1001708,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','463f6b31-0699-4bd5-ad82-90a635b46eab',NOW(),'Y','MOLI_HSIncomeCharge','HS Income Charge','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSIncomeCharge'),22,1000074),
(1001709,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','8f327d45-3c2b-482a-8b2c-124af3d46993',NOW(),'Y','MOLI_HSSelectiveTax','HS Selective Tax','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSSelectiveTax'),22,1000074),
(1001710,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','0c739e1e-a4a1-4485-89ed-70f48a58ca1d',NOW(),'Y','MOLI_HSSelectiveTaxSND','HS Selective Tax SND','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSSelectiveTaxSND'),22,1000074),
(1001711,0,'Y',1,'N','N','N',0,'N',10,'N','N','N','Y','567ff98b-14eb-4150-9023-34fc5cca38bd',NOW(),'Y','MOLI_HSOtherTax','HS OtherTax','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HSOtherTax'),22,1000074)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_inOutData OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001527,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','6f2f2aed-c761-4fae-9907-d53a05d803c7',NOW(),'N','M_InOut_ID','Shipment/Receipt','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_InOut_ID'),30,1000069),
(1001528,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','7b51be9a-995d-4401-8150-53d08d7436e9',NOW(),'Y','MOLI_Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Name'),10,1000069),
(1001529,0,'Y',0,'N','N','N',0,'N',20000,'N','N','N','Y','e41afd70-6cee-4a47-bdf9-ad786b5275df',NOW(),'Y','MOLI_Value','Value','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Value'),14,1000069),
(1001810,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','5a46c5cc-5dc4-438f-b589-0a350df91d9a',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000069),
(1001811,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','29472db7-4cc3-4326-9cdc-09a946d457fd',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000069),
(1001812,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','39d144ef-8345-4433-8555-9b1e0fdbeace',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000069),
(1001813,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','815944a3-698b-4ed1-a91e-c81c05623b7b',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000069),
(1001814,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','f7421039-a4fc-41d3-a513-93de59005f87',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000069),
(1001815,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','8a06453b-8990-4cba-a91a-3779cdc71ccf',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000069),
(1001816,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','b124f09d-5fd9-4a39-944d-3da644d35cef',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000069),
(1001817,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','e9a67e5a-11b5-427b-a2b4-d850d4340be7',NOW(),'N','MOLI_inOutData_ID','MOLI_inOutData','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_inOutData_ID'),13,1000069),
(1001818,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','de1f3940-dddc-46eb-8245-cb87f8181796',NOW(),'Y','MOLI_inOutData_UU','MOLI_inOutData_UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_inOutData_UU'),200231,1000069)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_invoiceData OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001511,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','4c242b90-def3-4ab3-b6be-588862a48aca',NOW(),'N','C_Invoice_ID','Invoice','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Invoice_ID'),30,1000067),
(1001512,0,'Y',0,'Y','N','N',0,'N',22,'N','Y','N','Y','19207dad-f4e6-49dc-bb54-5d290cea0b10',NOW(),'N','MOLI_InvoiceData_ID','Invoice Data ID','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvoiceData_ID'),13,1000067),
(1001513,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','005dd9f9-ba79-42d5-b653-6f351d32a69f',NOW(),'Y','MOLI_Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Name'),10,1000067),
(1001514,0,'Y',0,'N','N','N',0,'N',20000,'N','N','N','Y','aec3efad-80f4-48e5-8b30-b7cef890c8a6',NOW(),'Y','MOLI_Value','Value','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Value'),14,1000067),
(1001819,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','778c0d7f-6533-4b7f-a050-5d0c1cb2a49f',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000067),
(1001820,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','b8012a40-008f-4f69-a15e-73c0d5d6aec0',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000067),
(1001821,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','a9be13c5-44be-425d-8e58-a627e5e69f52',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000067),
(1001822,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','1a4f6856-bd01-4293-8a0a-2b38150df446',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000067),
(1001823,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','ed915fce-e3a5-4ccd-bf5c-f8e27640bc65',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000067),
(1001824,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','eac8a43c-b604-49f3-a854-2fd4d0b22609',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000067),
(1001825,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','0d56a614-fccf-474d-a49a-59682b5aa2fa',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000067),
(1001826,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','85b85cec-5516-41a1-bfc6-af9a3d79a0c1',NOW(),'Y','MOLI_invoiceData_UU','MOLI_invoiceData_UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_invoiceData_UU'),200231,1000067)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_movementData OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001530,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','a092a61d-882a-4f6a-8811-e0a79eb136d7',NOW(),'N','M_Movement_ID','Inventory Move','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Movement_ID'),30,1000070),
(1001531,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','9c63fb30-52bd-403a-a659-aba513fe051b',NOW(),'Y','MOLI_Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Name'),10,1000070),
(1001532,0,'Y',0,'N','N','N',0,'N',20000,'N','N','N','Y','dd563674-d2ee-453c-a41f-a94ffc0a2177',NOW(),'Y','MOLI_Value','Value','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Value'),14,1000070),
(1001533,0,'Y',0,'N','N','N',0,'N',4000,'N','N','N','Y','bcfcdf98-3000-4c52-8d81-b81ec84485e4',NOW(),'Y','MOLI_FsMessage','Fs Message','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsMessage'),10,1000070),
(1001534,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','980c4387-2ce8-45bd-8931-1160f52e8e09',NOW(),'Y','MOLI_FsPaused','Fs Paused','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsPaused'),17,1000070),
(1001535,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','6806e4a8-e6ee-44a1-a271-602223c80b19',NOW(),'Y','MOLI_FsStatus','Fs Status','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsStatus'),17,1000070),
(1001536,0,'Y',0,'N','N','N',0,'N',44,'N','N','N','Y','5d97fbd7-218b-40ad-aded-d4712afb3842',NOW(),'Y','MOLI_Cdc','CDC','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Cdc'),10,1000070),
(1001537,0,'Y',0,'N','N','N',0,'N',4000,'N','N','N','Y','237b66e9-f10c-411f-874d-a5d86ff6b6fc',NOW(),'Y','MOLI_FsError','Fs Error','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsError'),10,1000070),
(1001827,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','62f8af2b-2c99-4955-aed4-b4b6a165792a',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000070),
(1001828,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','07c7bc3b-f9de-41a5-b825-264f88cdb94e',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000070),
(1001829,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','b1d72ca7-72d7-40b8-a71b-b462b0cab420',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000070),
(1001830,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','0c91caa7-521b-43ac-a0bc-29637f12e5c9',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000070),
(1001831,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','db38e9de-15ec-400b-8791-e2ccfad7fac2',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000070),
(1001832,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','1dd15d68-937f-4576-93aa-a1df5614f4f2',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000070),
(1001833,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','03cb5724-c3c5-4d43-9291-28da89b16cce',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000070),
(1001834,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','91c51f03-038f-4b05-a6fa-b6aef406a2c2',NOW(),'N','MOLI_movementData_ID','MOLI_movementData','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_movementData_ID'),13,1000070),
(1001835,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','a58970c5-d918-4001-a95d-a4e7e71707ea',NOW(),'Y','MOLI_movementData_UU','MOLI_movementData_UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_movementData_UU'),200231,1000070)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_PeopleCount OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001841,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e48cadf4-e4e6-4b58-ac2a-634f03e213fe',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000077),
(1001842,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','8b8e382e-d7bb-430b-8845-79e10a48c094',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000077),
(1001843,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','1b3a0e99-b396-4135-947b-0dcac11c1ef4',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000077),
(1001844,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e32b8caa-b1c2-4eca-8b3e-c10a2ace2bb2',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000077),
(1001845,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','613cd755-1fae-407e-be9a-49401c04157a',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000077),
(1001846,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','88a67f50-ca77-4001-af64-b62e4a9113da',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000077),
(1001847,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','1a556396-bcc5-4779-a50b-1430aeea0c79',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000077),
(1001848,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','be6acdf0-3722-42c7-bce8-d3b89026f133',NOW(),'N','MOLI_PeopleCount_ID','People Counting','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PeopleCount_ID'),13,1000077),
(1001849,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','c6fce6b8-18b4-4f5e-a0ca-9f1f8a726d71',NOW(),'Y','MOLI_PeopleCount_UU','MOLI_PeopleCount_UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PeopleCount_UU'),200231,1000077),
(1001850,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','8b2cd65f-c5cc-41a1-a68e-4c09c48e41b1',NOW(),'Y','MOLI_TimeStart','Time Start','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TimeStart'),16,1000077),
(1001851,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','3c4c7807-a98b-4eb9-8b55-9d36d22ac6a3',NOW(),'Y','MOLI_TimeEnd','Time End','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TimeEnd'),16,1000077),
(1001852,0,'Y',0,'N','N','N',0,'N',14,'N','N','N','Y','c5f8449d-59b0-4611-9a67-47920e2694db',NOW(),'Y','MOLI_QtyVistiors','Qty Visitors','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_QtyVistiors'),29,1000077),
(1001853,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','8cd0e73f-a4ae-4a71-9212-e3d151e662fe',NOW(),'N','M_Locator_ID','Locator','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Locator_ID'),31,1000077)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_posTransactions OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001573,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','6b460d4e-dd84-4471-94ec-a74864d67884',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),19,1000071),
(1001574,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','bf5f6cb2-2085-4644-bf06-cfea5581397d',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000071),
(1001575,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','5a3f5400-d86d-4209-84a7-9ce8b2d27e16',NOW(),'N','C_Invoice_ID','Invoice','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Invoice_ID'),30,1000071),
(1001576,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','b2c3ee4c-edfc-4d1d-976e-b050bd90185d',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000071),
(1001577,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','fcd906cf-98a1-4a93-9127-7f5b66c96758',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000071),
(1001578,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','aebc90eb-8769-4fa7-889d-ec07c462dfb9',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000071),
(1001579,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','32dee0b7-ef04-4446-9b60-d7cc3b3eba2e',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000071),
(1001580,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','70ae2967-0a12-4edf-ad75-ba77276f09af',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000071),
(1001581,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','2ddfb242-7f05-4f08-9bf6-5c598ee445be',NOW(),'Y','MOLI_Amount','Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Amount'),29,1000071),
(1001582,0,'Y',0,'N','N','N',0,'N',120,'N','N','N','Y','ab700f73-f753-4703-866e-b745eb1fd32b',NOW(),'Y','MOLI_CardAid','Card Aid','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardAid'),10,1000071),
(1001583,0,'Y',0,'N','N','N',0,'N',120,'N','N','N','Y','b4e55c57-b173-4a0a-9ceb-5ce6de004449',NOW(),'Y','MOLI_CardArqc','Card Arqc','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardArqc'),10,1000071),
(1001584,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','54c3b1d2-7c71-434d-9622-524231b51b79',NOW(),'Y','MOLI_CardAuthCode','Card Auth Code','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardAuthCode'),10,1000071),
(1001585,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','0dc83d95-dda5-46c7-947d-51e4e369cdf2',NOW(),'Y','MOLI_CardBalanceAmount','Card Balance Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardBalanceAmount'),29,1000071),
(1001586,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','2a8a9508-c557-4779-bb46-983ffb200e1e',NOW(),'Y','MOLI_CardBin','Card Bin','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardBin'),10,1000071),
(1001587,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','11631403-1501-495c-a3d0-c4fab7808597',NOW(),'Y','MOLI_CardCashBackAmount','Card Cash Back Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardCashBackAmount'),29,1000071),
(1001588,0,'Y',0,'N','N','N',0,'N',255,'N','N','N','Y','ed8226be-bebc-4c1e-9cd3-ab2ad0ca31db',NOW(),'Y','MOLI_CardExtData','Card Ext Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardExtData'),10,1000071),
(1001589,10,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','9c499017-2b40-40f0-b18a-473c7af87fbf',NOW(),'Y','MOLI_CardHolderName','Card Holder Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardHolderName'),10,1000071),
(1001590,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','9f2d9926-945e-493b-a160-5de2824f375d',NOW(),'Y','MOLI_CardMerchantGateway','Card Merchant Gateway','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardMerchantGateway'),10,1000071),
(1001591,20,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','9a05cfa3-19e9-43e8-9a21-692698db2291',NOW(),'Y','MOLI_CardName','Card Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardName'),10,1000071),
(1001592,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','05d4460d-d31d-44b7-8016-05a1d5dbf4c7',NOW(),'Y','MOLI_CardNsu','Card NSU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardNsu'),10,1000071),
(1001593,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','c5d28c83-b8d5-4da1-92d0-019ddd7e495e',NOW(),'Y','MOLI_CardNumber','Card Number','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardNumber'),10,1000071),
(1001594,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','fed47a62-559f-44a6-9db2-6da97fd2d9af',NOW(),'Y','MOLI_CardReader','Card Reader','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardReader'),10,1000071),
(1001595,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','ccb13291-4f19-4625-9b31-ba247b8b1dc8',NOW(),'Y','MOLI_CardTradeCode','Card Trade Code','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardTradeCode'),10,1000071),
(1001596,0,'Y',0,'N','N','N',0,'N',255,'N','N','N','Y','99971bdc-64ad-4655-b0c3-9d3e6ea3f296',NOW(),'Y','MOLI_CardTransactionId','Card Transaction ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardTransactionId'),10,1000071),
(1001597,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','17b34eb5-f6bd-4f31-94af-4849cda6d889',NOW(),'Y','MOLI_CardType','Card Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CardType'),10,1000071),
(1001598,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','f384d49c-3cc9-4f1d-8eaa-26e9570def48',NOW(),'Y','MOLI_CustomPaymentCashPayment','Custom Payment Cash Payment','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymentCashPayment'),10,1000071),
(1001599,30,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','6bec3806-e418-4373-86ab-53fa7749ce42',NOW(),'Y','MOLI_CustomPaymentFieldName','Custom Payment Field Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymentFieldName'),10,1000071),
(1001600,40,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','16fd4ad3-10d3-4117-b198-6a682e48e56f',NOW(),'Y','MOLI_CustomPaymentName','Custom Payment Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymentName'),10,1000071),
(1001601,0,'Y',0,'N','N','N',0,'N',120,'N','N','N','Y','cbb882c8-2c2d-4c29-865d-5320f7916c23',NOW(),'Y','MOLI_CustomPaymentRef','Custom Payment Ref','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymentRef'),10,1000071),
(1001602,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','bc8962cb-3138-43cc-a850-7a4103fcc81d',NOW(),'Y','MOLI_CustomPaymRefItemId','Custom Paym Ref Item ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymRefItemId'),11,1000071),
(1001603,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','55ac4421-0d85-489d-83b2-26ba1da3e875',NOW(),'Y','MOLI_CustomPaymRefPrintFormat','Custom Paym Ref Print Format','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymRefPrintFormat'),10,1000071),
(1001604,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','81f4ba87-40dc-481c-ad60-055bff40ff10',NOW(),'Y','MOLI_CustomPaymRefTicketId','Custom Paym Ref Ticket ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CustomPaymRefTicketId'),11,1000071),
(1001605,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','92156914-e123-4a3c-bb3d-4acd6dbb60cf',NOW(),'Y','MOLI_DocumentType','Document Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DocumentType'),11,1000071),
(1001606,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','0ed41f9b-283e-419f-8cf4-748271324a64',NOW(),'Y','MOLI_GiftCertCashBackAmount','Gift Cert Cash Back Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertCashBackAmount'),29,1000071),
(1001607,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','47acb838-c8cc-4b79-ba22-6d1971fda77c',NOW(),'Y','MOLI_GiftCertFaceValue','Gift Cert Face Value','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertFaceValue'),29,1000071),
(1001608,0,'Y',0,'N','N','N',0,'N',64,'N','N','N','Y','68f2b4f7-11e0-4e3a-baac-2ccc60ebb348',NOW(),'Y','MOLI_GiftCertNumber','Gift Cert Number','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertNumber'),10,1000071),
(1001609,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','f911c66d-526c-492b-87db-8eda9937453c',NOW(),'Y','MOLI_GiftCertPaidAmount','Gift Cert Paid Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertPaidAmount'),29,1000071),
(1001610,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','b060f90d-ca9e-44e3-868e-f1c93f1fe64e',NOW(),'Y','MOLI_GiftCertRefundItemId','Gift Cert Refund Item ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertRefundItemId'),11,1000071),
(1001611,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','c983f252-6a8f-45d9-a666-9b3e6e310214',NOW(),'Y','MOLI_GiftCertRefundTicketID','Gift Cert Refund Ticket ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GiftCertRefundTicketID'),11,1000071),
(1001612,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','2fd20ea1-c866-4920-9672-1ef4267c785a',NOW(),'Y','MOLI_GlobalID','Global ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GlobalID'),10,1000071),
(1001613,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','cb671888-c3be-41b7-ae79-17b572260608',NOW(),'Y','MOLI_PaymentSubType','Payment Sub Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PaymentSubType'),10,1000071),
(1001614,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','b2bc31ef-c882-4913-ad26-565680aba536',NOW(),'Y','MOLI_Payment_Type','Payment Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Payment_Type'),10,1000071),
(1001615,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','f0ab9b39-26a8-4aa8-be74-54ace70024da',NOW(),'Y','MOLI_PaymentType','Payment Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PaymentType'),10,1000071),
(1001616,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','fa161a88-9e5a-4f6d-8ae6-615622059897',NOW(),'Y','MOLI_PayoutReasonID','Payout Reason ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PayoutReasonID'),11,1000071),
(1001617,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','d04200af-6cb7-45f9-aed9-bbf23167a318',NOW(),'Y','MOLI_PayoutRecepientID','Payout Recepient ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PayoutRecepientID'),11,1000071),
(1001618,0,'Y',0,'N','N','N',0,'N',22,'N','Y','N','Y','9b964313-4a70-49d0-894b-9a13391b6f3d',NOW(),'N','MOLI_PosTransactions_ID','Pos Transactions ID','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PosTransactions_ID'),13,1000071),
(1001619,0,'Y',0,'N','N','N',0,'N',3000,'N','N','N','Y','39f14bd1-4744-49da-a883-822e4d2a4169',NOW(),'Y','MOLI_Properties','Properties','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Properties'),14,1000071),
(1001620,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','a17190d3-d06f-499b-8b44-8c5077d8fa74',NOW(),'Y','MOLI_TenderAmount','Tender Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TenderAmount'),29,1000071),
(1001621,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','fae511c5-3cf7-403b-bbc2-e93ccbb76680',NOW(),'Y','MOLI_TicketId','Ticket ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TicketId'),10,1000071),
(1001622,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','ab12de50-9d84-4de6-b7af-c6fc0611f751',NOW(),'Y','MOLI_TransactionTime','Transaction Time','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TransactionTime'),15,1000071),
(1001623,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','a823cb92-e58b-497f-a71b-aea73af19a57',NOW(),'Y','MOLI_TransactionType','Transaction Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TransactionType'),10,1000071),
(1001836,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','ff79bdeb-f9ac-45f1-86ec-7c68155c26df',NOW(),'Y','MOLI_posTransactions_UU','MOLI_posTransactions_UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_posTransactions_UU'),200231,1000071)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_ProductBrand OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001657,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','56b0c5b5-5d62-4fee-9001-46042672ebf5',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000072),
(1001658,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','12b4599e-078c-4fbe-894e-5f616799fff8',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000072),
(1001659,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','ffc5677b-fabe-4820-9c26-581b7b097690',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000072),
(1001660,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','b02ea87b-0aa7-4024-8c96-1d564cfddbae',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000072),
(1001661,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','1f081726-9d23-45f2-a3b7-b7887368af65',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000072),
(1001662,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','c80af7f7-7ee7-4170-9493-4a32fa559b34',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000072),
(1001663,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','29c505c5-6f01-4aba-aeb8-177e42abc9c3',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000072),
(1001664,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','f7165a3b-68d3-47bc-8d16-53cd8a6ed7fa',NOW(),'N','MOLI_ProductBrand_ID','Product Brand','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),13,1000072),
(1001665,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','c8b772db-0228-40f8-b95b-babe5c31494f',NOW(),'Y','MOLI_ProductBrand_UU','Product Brand UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_UU'),200231,1000072),
(1001666,10,'Y',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','1d8223db-4f3b-4f94-bff2-13c3240d4c7a',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000072),
(1001667,0,'Y',1,'Y','N','N',0,'N',4,'N','N','N','Y','07ea9fc7-c27e-407a-995c-b89a06a33a34',NOW(),'Y','MOLI_BrandSymbol','Brand Symbol','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_BrandSymbol'),10,1000072),
(1001668,0,'Y',1,'N','N','N',0,'N',22,'N','N','N','Y','f69b1d54-257a-4f24-923f-d55e7e38d3cd',NOW(),'N','C_BPartner_ID','Business Partner','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_ID'),30,1000072),
(1001669,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','12d0019f-5d6a-4d86-9fad-b158cc0c12d3',NOW(),'Y','MOLI_isWHS','Whole Sale','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_isWHS'),20,1000072),
(1001670,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','7c563a07-60fb-4e6d-b7aa-45c480a7c00e',NOW(),'Y','MOLI_isApproval','Requiere Approval','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_isApproval'),20,1000072)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_ProductLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001671,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','1b20e658-97aa-45f4-9db5-61299a0d8818',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000073),
(1001672,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','00598e7f-39c6-44f5-a1f6-b932bf64608d',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000073),
(1001673,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','760050e9-0b1f-494f-bfc1-79950c1bf66f',NOW(),'N','Created','Created','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000073),
(1001674,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','01266f22-561a-4dfe-a364-7bbf0ae47a3c',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000073),
(1001675,0,'Y',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','5cc94eea-9a8e-47e8-bd60-b36741b56ac3',NOW(),'N','Updated','Updated','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000073),
(1001676,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','59509db0-a559-43cf-bc43-f6f5bdc3d9b6',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000073),
(1001677,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','9623d33c-42ec-4cfc-9cff-c57daef53f57',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000073),
(1001678,0,'Y',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','f3729b61-b7e4-4624-a010-9a796898958a',NOW(),'N','MOLI_ProductLine_ID','Product Line','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductLine_ID'),13,1000073),
(1001679,0,'Y',0.0,'N','N','N',0,'N',36,'N','N','N','Y','317fbf85-596f-442b-92f7-128bb52d9f0a',NOW(),'Y','MOLI_ProductLine_UU','Product Line UU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductLine_UU'),200231,1000073),
(1001680,10,'Y',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','2418dca9-94df-4840-abd2-5812ad36ad11',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000073),
(1001681,0,'Y',1,'Y','N','N',0,'N',22,'N','N','N','Y','08ea03e8-de1f-4d7b-aa2e-cb0cd6c4d88a',NOW(),'N','MOLI_ProductBrand_ID','Product Brand','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),30,1000073),
(1001682,0,'Y',1,'Y','N','N',0,'N',2,'N','N','N','Y','a191f0b6-fe87-42bc-bbcb-ef2165848df6',NOW(),'Y','MOLI_LineSymbol','MOLI_LineSymbol','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LineSymbol'),10,1000073),
(1001683,0,'Y',1,'N','N','N',0,'N',4,'N','N','N','Y','2a2b025a-8ef2-449f-b442-8a135398e7c7',NOW(),'Y','MOLI_SKUGroup','SKU Group','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKUGroup'),10,1000073),
(1001684,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','303c02ae-c103-4a72-a805-f61adf3f5aba',NOW(),'Y','MOLI_isApproval','Requiere Approval','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_isApproval'),20,1000073),
(1001685,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','65844ff8-217b-470b-972f-87ccb70dcc3b',NOW(),'Y','MOLI_isWHS','Whole Sale','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_isWHS'),20,1000073),
(1002969,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','dfd18491-f5f7-4160-94c6-481276566a92',NOW(),'Y','MOLI_IsLocalVendor','Local Vendor','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsLocalVendor'),20,1000073),
(1002970,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','68772e72-8e0b-49f2-be35-6ecf4745efcc',NOW(),'Y','MOLI_LocalVendorRate','Local Vendor Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LocalVendorRate'),12,1000073),
(1002971,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','66c3220c-c897-4f2b-b4a8-3bb5f632cf60',NOW(),'Y','MOLI_RTLCommissionRate','RTL Commission Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RTLCommissionRate'),12,1000073),
(1002972,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','f1b8cd17-3723-470f-b5d8-82b46b2ae58d',NOW(),'Y','MOLI_WHSCommissionRate','WHS Commission Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_WHSCommissionRate'),12,1000073)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_RegForm OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002327,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','69e88c6f-5210-4950-8f35-ec6e55b74c3f',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000084),
(1002328,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','3fd33067-23ef-42fd-90ff-a21400704264',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000084),
(1002329,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','7ca76bb1-cddd-41fe-8151-183786e1003a',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000084),
(1002330,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','8b8c1783-fe2d-46c0-a8c3-c7134e490b99',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000084),
(1002331,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','8b8c5e59-f2f4-4760-8097-77e94612bd65',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000084),
(1002332,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','cc83c088-894c-4205-8d25-a5e04d1c9a7d',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000084),
(1002333,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','179cb47a-1e80-41d2-b584-9cc50fa490b5',NOW(),'Y','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000084),
(1002334,0,'N',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','3ffe780f-6bab-4d76-afb8-e4f7c4a8c52a',NOW(),'N','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),13,1000084),
(1002335,0,'N',0.0,'N','N','N',0,'N',36,'N','N','N','Y','fb55614b-917c-4f09-b447-e73250dfffeb',NOW(),'Y','MOLI_RegForm_UU','Regulation Form_UU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_UU'),200231,1000084),
(1002336,10,'N',0.0,'N','N','N',0,'N',40,'Y','N','N','Y','7a34b634-c1a8-4b32-acbc-7180d8057f6f',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000084),
(1002384,0,'N',0,'Y','N','N',0,'N',22,'N','N','N','Y','e21b87a1-2664-4240-9fb1-a1379f44a10b',NOW(),'Y','SalesRep_ID','Sales Representative','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SalesRep_ID'),18,1000084),
(1002385,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','28a9a147-63da-4e2a-aff1-e1b1c80dcff6',NOW(),'N','Address1','Address 1','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Address1'),10,1000084),
(1002386,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','4b0e25f9-eeb3-43c0-ab7d-0abf27501832',NOW(),'N','Address2','Address 2','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Address2'),10,1000084),
(1002387,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','508ffb03-afcc-4670-90ee-86011fddcd2a',NOW(),'Y','AD_User_ID','User/Contact','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_User_ID'),30,1000084),
(1002388,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','11a21378-8d7e-452b-ba1d-d877671be556',NOW(),'N','C_BPartner_ID','Business Partner','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_ID'),30,1000084),
(1002389,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','97d7bdf4-4969-43da-8c38-5d762cbe9799',NOW(),'N','C_BPartner_Location_ID','Partner Location','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_Location_ID'),18,1000084),
(1002390,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','73a3cef7-ca24-4fa2-8475-678cd06c11c4',NOW(),'Y','C_BPartnerRelation_ID','Related Partner','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartnerRelation_ID'),30,1000084),
(1002391,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','e9844385-0edd-40e5-a144-49e42eb88da2',NOW(),'Y','C_BPartnerRelation_Location_ID','Related Partner Location','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartnerRelation_Location_ID'),18,1000084),
(1002392,20,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','1b60db11-53d7-47e9-8dce-4e72d2cac158',NOW(),'N','CountryName','Country','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CountryName'),10,1000084),
(1002393,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','440f06eb-d19a-4fff-9240-936929e314d6',NOW(),'Y','Date1','Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Date1'),15,1000084),
(1002394,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','3b983435-5854-4332-bcd6-38ac018b25a4',NOW(),'Y','DateDoc','Document Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DateDoc'),15,1000084),
(1002395,30,'N',0,'N','N','N',0,'N',255,'Y','N','N','Y','e1c5f858-67df-4bb9-a1c3-7b7f959a0e9a',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000084),
(1002396,40,'N',0,'N','N','N',0,'N',30,'Y','N','N','Y','9ad9c580-4a07-4d0d-986b-954688658494',NOW(),'N','DocumentNo','Document No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocumentNo'),10,1000084),
(1002397,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','4537124b-fbbb-4b0c-923c-e02ddfc98666',NOW(),'N','EMail','EMail Address','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'EMail'),10,1000084),
(1002398,0,'N',0,'N','N','N',0,'N',2000,'N','N','N','Y','b8406ed4-ad53-4573-a57c-7be01e4b77cf',NOW(),'Y','Help','Comment/Help','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Help'),14,1000084),
(1002399,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','7e58018d-be3d-494a-96ed-0d4fcf03f3ca',NOW(),'N','IsApproved','Approved','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsApproved'),20,1000084),
(1002400,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','2046ef74-ad87-4903-b03c-480a290e4cff',NOW(),'Y','MailText','Mail Text','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MailText'),14,1000084),
(1002401,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','a1f5d582-c7a0-4bbc-a9ff-5d1a358de3c9',NOW(),'Y','MOLI_Activity','Actividad','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Activity'),17,1000084),
(1002402,0,'N',0,'N','N','N',0,'N',255,'N','N','N','Y','6444e2f1-8c9b-446b-a8d0-7d98ee9ef1e1',NOW(),'Y','MOLI_AltMaker','Proveedor Alternativo','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AltMaker'),10,1000084),
(1002403,0,'N',0,'N','N','Y',0,'N',30,'N','N','N','Y','373d5bc9-8e98-4ed1-8275-5531b41853de',NOW(),'Y','MOLI_CertNum','Certificado No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CertNum'),10,1000084),
(1002404,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','1332c876-ed1d-4f9c-93b9-f82714287410',NOW(),'Y','MOLI_ConcessionDate','Concession Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ConcessionDate'),15,1000084),
(1002405,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','38e60bce-44f1-4197-ab61-fddbddae378c',NOW(),'N','MOLI_Dias_Concesion','Dias Concesion','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Dias_Concesion'),10,1000084),
(1002406,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','3dc0ed2b-0b25-4411-96bc-36ea2d0d76a3',NOW(),'Y','MOLI_ExpirationDate','Fecha de Vencimiento','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ExpirationDate'),15,1000084),
(1002407,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','e0944cdd-500e-4955-829c-422ba56a253c',NOW(),'Y','MOLI_MadeIn','Hecho En','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_MadeIn'),10,1000084),
(1002408,0,'N',0,'N','N','N',0,'N',255,'N','N','N','Y','3d95feaf-c3b2-4cb2-8710-fe76cf170890',NOW(),'Y','MOLI_MainMaker','Proveedor Principal','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_MainMaker'),10,1000084),
(1002409,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','1a50d721-5248-47da-826b-f1ec579d3f60',NOW(),'Y','MOLI_NumMesaEntrada','Numero Mesa de Entrada','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_NumMesaEntrada'),10,1000084),
(1002410,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','2ea95df5-6228-4588-943b-5812f29a5ccb',NOW(),'Y','MOLI_NumRE','Numero RE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_NumRE'),10,1000084),
(1002411,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','39f7f261-9d3a-4469-851e-8c8a816e9301',NOW(),'Y','MOLI_NumRE1','Numero RE1','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_NumRE1'),10,1000084),
(1002412,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','7d4f2ddc-05b0-4dc8-badd-111eb9d2336b',NOW(),'Y','MOLI_Num_RSPA','Numero RSPA','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Num_RSPA'),10,1000084),
(1002413,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','8edd87f5-9a40-4f32-971b-7177a0d19bd8',NOW(),'Y','MOLI_ProductData','Data Producto','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductData'),17,1000084),
(1002414,50,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','3e2d9319-4061-4d5b-a71d-92a58c957951',NOW(),'Y','MOLI_RegCommName','Reg Comm Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegCommName'),10,1000084),
(1002415,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','e8f1a880-c29a-4d09-b904-6f193b09d8d9',NOW(),'Y','MOLI_RegFormType','Reg Form Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormType'),17,1000084),
(1002416,60,'N',0,'N','N','N',0,'N',255,'Y','N','N','Y','41e1416a-ab1f-4b11-a652-f35cdfe2491a',NOW(),'Y','MOLI_RegGenName','Reg Gen Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegGenName'),10,1000084),
(1002417,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','91803cef-a651-45aa-9fb6-26c06b20fc96',NOW(),'Y','MOLI_RegPresentationForm','Reg Presentation Form','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegPresentationForm'),14,1000084),
(1002418,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','191c994f-d171-47e1-843b-5a3606d54fad',NOW(),'N','MOLI_RUC','RUC','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RUC'),10,1000084),
(1002419,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','9294bc5d-8825-4d0c-9076-4f09f61f3481',NOW(),'Y','MOLI_SellPerm','Sell Perm','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SellPerm'),10,1000084),
(1002420,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','eab7e7a8-b88d-46fd-8faf-df67c576a11d',NOW(),'Y','MOLI_SIMESE','SIMESE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SIMESE'),10,1000084),
(1002421,70,'N',0,'N','N','Y',1,'N',60,'Y','N','N','Y','7edd741d-fbf8-4429-ae07-1a3d81a0bd85',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000084),
(1002422,0,'N',0,'N','N','N',0,'N',40,'N','N','N','Y','2bc9a2de-3cb1-4f48-a363-5a93fc9bd08f',NOW(),'N','Phone','Phone','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Phone'),10,1000084),
(1002423,0,'N',0,'N','N','N',0,'N',40,'N','N','N','Y','4d541e1d-d04d-4ca0-abf3-3c9e9d3ca115',NOW(),'N','Phone2','2nd Phone','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Phone2'),10,1000084),
(1002424,80,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','f73646d4-70ca-40bc-8cbd-353c55bb6165',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,1000084),
(1002425,0,'N',0,'N','N','N',0,'N',20,'N','N','N','Y','6316c7d1-9336-4441-8366-86d162a45372',NOW(),'N','TaxID','Tax ID','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'TaxID'),10,1000084),
(1003181,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','5140a762-126f-41b3-b875-7c0303acbf08',NOW(),'Y','MOLI_RegGrade','Product Grade','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegGrade'),10,1000084),
(1003182,0,'N',0,'N','N','N',0,'N',1000,'N','N','N','Y','ee55aad2-aaf2-4fb3-87b9-be37726ca7a8',NOW(),'Y','MOLI_RegVariety','Product Variety','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegVariety'),10,1000084)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_RegFormLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002347,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','56040749-ffdf-4e9c-ab33-c5089bef758a',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000086),
(1002348,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','ca82e242-848d-4bb4-a2b8-c27e73bf12fc',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000086),
(1002349,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','01491958-f4a0-4a2e-bed6-b76bae36243e',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000086),
(1002350,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','f909619e-ae38-4d3e-bbdf-5cc2ec314454',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000086),
(1002351,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','480539ac-4a33-4142-9903-51ae367ec039',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000086),
(1002352,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','fe341763-b39c-4ebb-8a6b-0e859e7041eb',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000086),
(1002353,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','8e1be4d0-a0c7-4b14-94c9-bfceaf159e66',NOW(),'Y','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000086),
(1002354,0,'N',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','c6d3400d-20ef-4463-b878-1dd5c3118d7c',NOW(),'N','MOLI_RegFormLine_ID','Regulation Form Line','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormLine_ID'),13,1000086),
(1002355,0,'N',0.0,'N','N','N',0,'N',36,'N','N','N','Y','486df68f-8db6-4866-b83a-650b2419392a',NOW(),'Y','MOLI_RegFormLine_UU','Regulation_Form_Line_UU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormLine_UU'),200231,1000086),
(1002356,10,'N',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','08308384-5b5d-4f50-987f-e1ce67a64e66',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000086),
(1002357,0,'N',0.0,'N','N','N',0,'N',255,'N','N','N','Y','e89af4f1-83b4-409d-8022-a9097a2d7c78',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000086),
(1002358,0,'N',0.0,'N','N','N',0,'N',7,'N','N','N','Y','c5f02ca4-1334-42c7-bc56-a33fcb8ff263',NOW(),'Y','DateTrx','Transaction Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DateTrx'),15,1000086),
(1002359,20,'N',0.0,'N','N','N',0,'N',30,'Y','N','N','Y','29583c1d-fd10-48e4-b3d8-2c40ca8324f6',NOW(),'Y','DocumentNo','Document No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocumentNo'),10,1000086),
(1002360,0,'N',0,'Y','N','N',0,'Y',22,'N','N','N','Y','b9895120-68e0-4e3c-ba1a-581f95b2fb27',NOW(),'N','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),19,1000086),
(1002361,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','543212a9-f136-4c4a-a9c7-cea1df503ef8',NOW(),'Y','Date1','Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Date1'),15,1000086),
(1002362,0,'N',0,'N','N','N',0,'N',2000,'N','N','N','Y','df3c63c1-c636-4b08-b7fb-7e6a7f542437',NOW(),'Y','Help','Comment/Help','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Help'),14,1000086),
(1002363,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','9a770c5f-f6e6-4af6-8e0c-4eb1e8aecbf9',NOW(),'Y','MOLI_ActionRequired','Accion Requerida','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ActionRequired'),20,1000086),
(1002364,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','82f45c2d-f500-441b-b0e1-b7c34e19833a',NOW(),'Y','MOLI_DateCDAR','Fecah CDAR','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCDAR'),16,1000086),
(1002365,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','68956b1d-8036-4881-9f93-8754efad1902',NOW(),'Y','MOLI_DateCLV','Fecha CLV','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCLV'),16,1000086),
(1002366,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','a124c60f-18bf-4dcc-aab8-8edcddfccc1d',NOW(),'Y','MOLI_DateCP','Fecha CP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCP'),16,1000086),
(1002367,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','5e7ac9b4-d771-481d-bf43-680445ae34f0',NOW(),'Y','MOLI_DateFormula','Fecha Formula','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateFormula'),16,1000086),
(1002368,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','64472a75-5c4d-4ced-85b6-137a8e9ef4af',NOW(),'Y','MOLI_DateGMP','Fecha GMP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateGMP'),16,1000086),
(1002369,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','9efc89d2-8458-4e3f-8c15-a23a2536a4cb',NOW(),'Y','MOLI_DateKBIS','Fecha KBISS','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateKBIS'),16,1000086),
(1002370,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','7175e1c8-6c97-41af-91af-d723e3bcf777',NOW(),'Y','MOLI_IsCartaPoder','Es carta Poder','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCartaPoder'),20,1000086),
(1002371,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','b1ac3f37-4da6-46ef-94fd-eaebb0f40f4b',NOW(),'Y','MOLI_IsCDAR','Es CDAR','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCDAR'),20,1000086),
(1002372,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','94d1619f-3139-41d9-a0f8-9b5c7eef2fd5',NOW(),'Y','MOLI_IsCLV','Es CLV','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCLV'),20,1000086),
(1002373,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','30c6af65-240b-4d78-818d-1e91d468b071',NOW(),'Y','MOLI_IsFormula','Es Formula','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsFormula'),20,1000086),
(1002374,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','495c82bd-e54f-41e6-a2a3-62ae69f6db91',NOW(),'Y','MOLI_IsGMP','Es GMP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsGMP'),20,1000086),
(1002375,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','aff69f5e-3463-4fa0-be77-13cb095361ae',NOW(),'Y','MOLI_IsKBIS','Es KBISS','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsKBIS'),20,1000086),
(1002376,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','93f2b023-ad38-4de6-be45-f61569efbb33',NOW(),'Y','MOLI_RgmStatus','Rgm Status','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RgmStatus'),17,1000086),
(1002377,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','ca3eba06-0cc5-49a5-97d8-7ae19b0635dd',NOW(),'Y','MOLI_StatusType','Tipo de Estado','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_StatusType'),17,1000086)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_RegFormProduct OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002337,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','28f3978e-2453-4d98-a2eb-7ecd307bb593',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000085),
(1002338,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','5661a951-c5b7-42f1-be0a-630de0faa2ed',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000085),
(1002339,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','7f4608ff-67b2-4dab-826c-8b98022d6b6b',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000085),
(1002340,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e8cf18f6-7b42-4448-a177-8b6b1989a63c',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000085),
(1002341,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','2bcc4ed6-2c6d-41f2-9455-db4a2a336c8a',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000085),
(1002342,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','edb1e3d0-d1e1-467b-ace3-7bf721845eee',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000085),
(1002343,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','9274c575-d255-4248-a0e3-a83a6079a1a3',NOW(),'Y','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000085),
(1002344,0,'N',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','05edc003-820e-4df4-ac5c-e3ea689c37c9',NOW(),'N','MOLI_RegFormProduct_ID','Regulation Form Product','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormProduct_ID'),13,1000085),
(1002345,0,'N',0.0,'N','N','N',0,'N',36,'N','N','N','Y','0bb68e0f-3074-4f04-aecb-a6fffdcc0c81',NOW(),'Y','MOLI_RegFormProduct_UU','MOLI_RegFormProduct_UU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormProduct_UU'),200231,1000085),
(1002346,0,'N',0,'Y','N','N',0,'Y',22,'N','N','N','Y','29359085-cc84-4d17-a16b-b2ab4a651cab',NOW(),'N','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),19,1000085),
(1002426,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','7c549869-5c91-4f12-97e5-d8dd8d70a7e4',NOW(),'Y','M_Product_ID','Product','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Product_ID'),30,1000085),
(1002427,10,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','b8ca0155-29ed-48a2-944f-0039cee65148',NOW(),'N','Name2','Name 2','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name2'),10,1000085),
(1002428,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','d919d889-23b5-485e-bae9-51c8dee17652',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,1000085),
(1002429,20,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','9b1bb3f1-3e36-44e7-9b05-de70c7c71f0d',NOW(),'N','CategoryName','Category Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CategoryName'),10,1000085),
(1002430,0,'N',0,'N','N','N',0,'N',40,'N','N','N','Y','d0304d34-7d9d-4a0e-ba1f-f8bbe602e581',NOW(),'N','ProductBrand_Value','ProductBrand  Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductBrand_Value'),10,1000085)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- MOLI_SKULabel OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003244,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','21eff5d7-4452-4d80-ac5a-0de25f2fbc47',NOW(),'N','AD_Client_ID','Tenant','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),19,1000122),
(1003245,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','bc735126-6a3b-4841-9ad5-d6c88aabaa92',NOW(),'N','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),19,1000122),
(1003246,0,'N',0.0,'N','N','N',0,'Y',10,'N','N','N','Y','505ce451-ff7c-410d-ab5d-78d9fbd12f52',NOW(),'N','M_Product_ID','Product','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Product_ID'),30,1000122),
(1003247,0,'N',0.0,'N','N','N',0,'Y',30,'N','N','N','Y','63b43586-18dc-4a9f-9ef8-143bf9298e01',NOW(),'N','ProductSKU','ProductSKU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductSKU'),10,1000122),
(1003248,0,'N',0.0,'N','N','N',0,'Y',30,'N','N','N','Y','ed236162-5e32-4c3f-ab06-a165ed48607f',NOW(),'N','ProductUPC','ProductUPC','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductUPC'),10,1000122),
(1003249,10,'N',0.0,'N','N','N',0,'N',120,'Y','N','N','Y','76114b58-7d92-45c1-872e-a51c23a81781',NOW(),'N','ProductName','Product Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,1000122),
(1003250,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','03ec8c04-a2e6-48b8-b124-3b5a80c7db5a',NOW(),'N','ProductCategoryBrandLine','ProductCategoryBrandLine','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductCategoryBrandLine'),10,1000122),
(1003251,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','7a9379aa-b418-4d69-9198-1fa28fdc3c6f',NOW(),'N','ProductCategoryBrand','ProductCategoryBrand','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductCategoryBrand'),10,1000122),
(1003252,20,'N',0.0,'N','N','N',0,'N',60,'Y','N','N','Y','d44731b1-f414-4d6a-af20-669532882c28',NOW(),'N','CategoryName','Category Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CategoryName'),10,1000122),
(1003253,30,'N',0.0,'N','N','N',0,'N',60,'Y','N','N','Y','05138ba2-1f4a-4966-9c60-4f035f7a1bdc',NOW(),'N','BrandName','BrandName','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'BrandName'),10,1000122),
(1003254,40,'N',0.0,'N','N','N',0,'N',60,'Y','N','N','Y','70608fc8-e135-45b4-a0a0-bc97d583ac2c',NOW(),'N','LineName','LineName','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LineName'),10,1000122),
(1003255,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','5128db88-52bc-4a0c-879c-7b972347ddb2',NOW(),'N','MOLI_SKULabel_Registrant','Registrant','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_Registrant'),10,1000122),
(1003256,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','b6af8ac2-1660-46d5-8bdf-a475e9e7f7bd',NOW(),'N','DocumentNote','Document Note','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocumentNote'),10,1000122),
(1003257,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','44865360-6c27-4123-95cc-fc014c05ea76',NOW(),'N','moli_skulabel_expiere','moli_skulabel_expiere','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'moli_skulabel_expiere'),10,1000122),
(1003258,0,'N',0.0,'N','N','N',0,'N',255,'N','N','N','Y','904a57d3-1d18-4f12-84e7-243819c58c67',NOW(),'N','Address','Address','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Address'),10,1000122),
(1003259,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','100d8e94-7272-4e06-a0c2-1495f34ab6d3',NOW(),'N','City','City','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'City'),10,1000122),
(1003260,0,'N',0.0,'N','N','N',0,'N',30,'N','N','N','Y','bcbd111f-0f0e-48bd-a2e0-c81e2cd1c18e',NOW(),'N','Phone','Phone','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Phone'),10,1000122),
(1003261,0,'N',0.0,'N','N','N',0,'N',20,'N','N','N','Y','f236f97f-67b6-4966-89e6-038f99cf6eba',NOW(),'N','TaxID','Tax ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'TaxID'),10,1000122),
(1003262,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','fa187f95-cc4a-4b50-8eb0-082e6d4f6cc7',NOW(),'N','MOLI_SKULabel_RE','RE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_RE'),10,1000122),
(1003263,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','75b0bb03-4f68-41a8-a301-bd4d93d7e40b',NOW(),'N','MOLI_SKULabel_RP','RP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_RP'),10,1000122),
(1003264,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','22a2d72d-55fb-4c22-941e-0184f3c8e51d',NOW(),'N','MOLI_SKULabel_Reg','Reg','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_Reg'),10,1000122),
(1003265,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','c1051be7-8437-42a4-9c8f-fa48d1af2060',NOW(),'N','MOLI_SKULabel_RegAgent','RegAgent','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_RegAgent'),10,1000122),
(1003266,0,'N',0.0,'N','N','N',0,'N',29,'N','N','N','Y','c18ddae0-d677-4088-861a-785acaa7478c',NOW(),'N','MOLI_SKULabel_ExpireDate','ExpireDate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_ExpireDate'),16,1000122),
(1003267,0,'N',0.0,'N','N','N',0,'N',2,'N','N','N','Y','a48fda98-3e1c-42de-a886-90726ae308d9',NOW(),'N','MOLI_SKULabel_FormType','FormType','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_FormType'),10,1000122),
(1003268,0,'N',0.0,'N','N','N',0,'N',2,'N','N','N','Y','e73712f8-a7d2-46f6-91ba-040b633784ed',NOW(),'N','MOLI_SKULabel_ProductionType','ProductionType','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_ProductionType'),10,1000122),
(1003269,0,'N',0.0,'N','N','N',0,'N',22,'N','N','N','Y','222ddab6-fc50-4e54-a859-4328135be275',NOW(),'N','PriceList','List Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceList'),12,1000122),
(1003270,0,'N',0.0,'N','N','N',0,'N',22,'N','N','N','Y','224ad659-e8e4-40ec-8509-fda66a75a7cc',NOW(),'N','PriceStd','Standard Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceStd'),12,1000122),
(1003271,0,'N',0.0,'N','N','N',0,'N',22,'N','N','N','Y','60361d2d-7125-4181-b3ef-021d7e9341bb',NOW(),'N','PriceLimit','Limit Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceLimit'),12,1000122),
(1003272,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','c20ee0df-35ca-4580-99b9-8d1169228826',NOW(),'N','MOLI_SKULabel_LabelQuantity','LabelQuantity','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_LabelQuantity'),11,1000122),
(1003273,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','f588bfaa-275d-4580-8232-4d4d2268c49c',NOW(),'N','TaxCategory','TaxCategory','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'TaxCategory'),10,1000122),
(1003274,0,'N',0.0,'N','N','N',0,'N',22,'N','N','N','Y','714aadc1-fa26-469c-ab4a-41eb2def9e66',NOW(),'N','MOLI_SKULabel_PriceListRT','PriceListRT','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_PriceListRT'),12,1000122),
(1003276,0,'N',0.0,'N','N','N',0,'N',60,'N','N','N','Y','372bad79-5dca-40ad-8f91-c7418829d195',NOW(),'N','MOLI_SKULabel_MatchRegFormRule','MatchRegFormRule','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_MatchRegFormRule'),10,1000122),
(1003277,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','b7cbfd76-aeb3-4b6c-98cf-c40aa994c096',NOW(),'N','AD_Org_ID','Organization','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000122),
(1003278,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','b95506a1-c9fe-4c7e-938d-125ade5bc9b7',NOW(),'N','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000122),
(1003279,0,'N',0.0,'N','N','N',0,'N',29,'N','N','N','Y','f2f94ff6-feac-484a-a2c1-66fa53ba8f86',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000122),
(1003280,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','5bb8fe64-0ef6-464b-8eb4-5672b51ebe7b',NOW(),'N','CreatedBy','Created By','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000122),
(1003281,0,'N',0.0,'N','N','N',0,'N',29,'N','N','N','Y','aae62199-4b5f-44b7-bff9-52f3107b4d05',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000122),
(1003282,0,'N',0.0,'N','N','N',0,'N',10,'N','N','N','Y','4b2d6328-7a10-42c3-ae51-a99c4785c6a9',NOW(),'N','UpdatedBy','Updated By','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000122),
(1003283,0,'N',0.0,'N','N','N',0,'N',120,'N','N','N','Y','eb7baaad-57a8-444c-8a58-0e7bce3fc512',NOW(),'N','DescriptionURL','Description URL','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DescriptionURL'),10,1000122),
(1003284,0,'N',0.0,'N','N','N',0,'N',120,'N','N','N','Y','87182aa5-45dd-449e-9200-85cee40198ec',NOW(),'N','ImageURL','Image URL','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ImageURL'),10,1000122),
(1003288,0,'N',0,'N','N','N',0,'N',255,'N','N','N','Y','f27f6a04-75ef-44c6-92af-c0626c5192ca',NOW(),'Y','MOLI_DescriptionURL','DescriptionURL','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DescriptionURL'),10,1000122),
(1003289,0,'N',0,'N','N','N',0,'N',255,'N','N','N','Y','5d3f4106-0620-44ed-addd-8aeabf47bb91',NOW(),'Y','MOLI_ImageURL','ImageURL','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ImageURL'),10,1000122),
(1003290,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','1f471670-0a33-44cd-8f61-4601dcd8dcb3',NOW(),'Y','M_PriceList_ID','Price List','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_PriceList_ID'),19,1000122),
(1003291,50,'N',0,'N','N','N',0,'N',255,'Y','N','N','Y','b8acc48b-145f-4c4d-93f7-f7dbb6a19c4f',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000122),
(1003292,0,'N',0,'N','N','N',0,'N',2000,'N','N','N','Y','dcbee277-0702-42ed-b672-e93c9e7eb844',NOW(),'Y','Help','Comment/Help','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Help'),14,1000122),
(1003293,0,'N',0,'N','N','N',0,'N',2000,'N','N','N','Y','0e38b37b-7032-4a70-88eb-97678b0a84c1',NOW(),'Y','MOLI_TagLabelExt','TagLabel Extended','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TagLabelExt'),14,1000122)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
   Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- 
-- SEQUENCE
-- UPDATES SEquence for AD_Table
UPDATE AD_Sequence
SET CurrentNext = (
    SELECT MAX(AD_Column_ID) + 1
    FROM AD_Column
)
WHERE Name = 'AD_Column';
--
-- EOF
--
