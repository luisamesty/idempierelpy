-- AD_Table UPSERTS MOLI
INSERT INTO AD_Table (
    AD_Client_ID,
    AD_Org_ID,
    IsActive,
    Created,
    CreatedBy,
    Updated,
    UpdatedBy,
    TableName,
    Name,
    Description,
    Help,
    AccessLevel,
    IsView,
    IsChangeLog,
    IsCentrallyMaintained,
    IsShowInDrillOptions,
    IsHighVolume,
    EntityType,
    AD_Table_ID,
    AD_Table_UU
)
VALUES
-- 1000067 MOLI_invoiceData
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_invoiceData','MOLI_invoiceData_ID',NULL,NULL,'4','N','Y','Y','N','N','U',1000067,'16fedd97-1f0b-42ba-9524-0af9ce6ffb2a'),
-- 1000068 MOLI_GeoRefCode
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_GeoRefCode','Geo Ref Code ID',NULL,NULL,'3','N','Y','Y','N','N','U',1000068,'ca677d9a-f26c-454f-b6cf-2a1eefc13e36'),
-- 1000069 MOLI_inOutData
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_inOutData','MOLI_inOutData',NULL,NULL,'4','N','Y','Y','N','N','U',1000069,'4fdc1ba2-c70f-496f-aed4-ff290afd3b88'),
-- 1000070 MOLI_movementData
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_movementData','MOLI_movementData',NULL,NULL,'4','N','Y','Y','N','N','U',1000070,'0f95c311-8c37-47d8-9371-9ebd22cccdb3'),
-- 1000071 MOLI_posTransactions
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_posTransactions','MOLI_posTransactions_ID',NULL,NULL,'4','N','Y','Y','N','N','U',1000071,'0dbb1936-6d5e-416f-a61d-85d30c3f6ba0'),
-- 1000072 MOLI_ProductBrand
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_ProductBrand','Product Brand','Product Brand','Product Brand','3','N','Y','Y','Y','N','U',1000072,'804e921a-97ae-4293-a4a0-8a9a6a41fef3'),
-- 1000073 MOLI_ProductLine
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_ProductLine','Product Line','Product Line',NULL,'3','N','Y','Y','Y','N','U',1000073,'5b1abcdc-3f1a-4478-8baa-7e4835d1583c'),
-- 1000074 MOLI_HS
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_HS','Harmonized System','Harmonized Commodity Description and Coding System (HS Convention) ','Harmonized Commodity Description and Coding System (HS Convention) ','3','N','Y','Y','N','N','U',1000074,'7fcab178-4598-43b4-984c-c210c60a4e3f'),
-- 1000077 MOLI_PeopleCount
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_PeopleCount','People Counting','People Counting data','People Counting data','3','N','Y','Y','N','N','U',1000077,'80d0f1a3-a325-4b0f-9188-19393c683bba'),
-- 1000084 MOLI_RegForm
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_RegForm','Regulation Form ID',NULL,'Regulation Form','3','N','Y','Y','N','N','U',1000084,'415e09e7-db49-4186-a1bf-ee2b01e90f8b'),
-- 1000085 MOLI_RegFormProduct
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_RegFormProduct','Regulation Form Product',NULL,'Regulations Form Products','3','N','Y','Y','N','N','U',1000085,'d957dd66-5345-4c7e-b9df-1a50982d67c3'),
-- 1000086 MOLI_RegFormLine
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_RegFormLine','Regulation Form Line','Regulation Form Line','Regulations Form Lines','6','N','Y','Y','N','N','U',1000086,'c0ddfbbb-4405-4646-9ed7-a4aeded1f68d'),
-- 1000121 MOLI_C_InvoicePayment
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_C_InvoicePayment','Invoice Payment',NULL,NULL,'3','Y','N','Y','Y','N','U',1000121,'5abf9885-33ea-4f3d-b6a4-675d2bdb7d01'),
-- 1000122 MOLI_SKULabel
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_SKULabel','SKULabel',NULL,NULL,'3','Y','N','Y','Y','Y','U',1000122,'57eb07c8-e775-49a1-be78-a35de6b82cab'),
-- 1000124 MOLI_BrandUSP
(0,0,'Y',NOW(),100,NOW(),100,'MOLI_BrandUSP','Brand USP','Brand USP','Brand USP','6','N','Y','Y','N','N','U',1000124,'c50e9c75-5065-4239-a552-f6892277af18')
ON CONFLICT (AD_Table_UU)
DO UPDATE SET
    Name                    = EXCLUDED.Name,
    Description             = EXCLUDED.Description,
    Help                    = EXCLUDED.Help,
    AccessLevel             = EXCLUDED.AccessLevel,
    IsView                  = EXCLUDED.IsView,
    IsChangeLog             = EXCLUDED.IsChangeLog,
    IsCentrallyMaintained   = EXCLUDED.IsCentrallyMaintained,
    IsShowInDrillOptions    = EXCLUDED.IsShowInDrillOptions,
    IsHighVolume            = EXCLUDED.IsHighVolume,
    EntityType              = EXCLUDED.EntityType,
    IsActive                = 'Y',
    Updated                 = NOW(),
    UpdatedBy               = 100;
--
-- UPDATES SEquence for AD_Table
UPDATE AD_Sequence
SET CurrentNext = (
    SELECT MAX(AD_Table_ID) + 1
    FROM AD_Table
)
WHERE Name = 'AD_Table';
