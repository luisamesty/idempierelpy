INSERT INTO AD_Val_Rule (
    AD_Client_ID,
    AD_Org_ID,
    IsActive,
    Created,
    CreatedBy,
    Updated,
    UpdatedBy,
    Name,
    EntityType,
    Type,
    Code,
    AD_Val_Rule_ID,
    AD_Val_Rule_UU
)
VALUES
-- 1 MOLI_ProductLine
(0,0,'Y',NOW(),100,NOW(),100,
 'MOLI_ProductLine (Product)','U','S',
 'MOLI_ProductLine.IsActive=''Y'' AND MOLI_ProductLine.MOLI_ProductBrand_ID = @MOLI_ProductBrand_ID@',
 1000265,'f5209141-ea69-4dbe-87b4-6f9220b61d68'),
-- 2 C_DocType Payroll
(0,0,'Y',NOW(),100,NOW(),100,
 'C_DocType Payroll','EE02','S',
 'C_DocType.DocBaseType=''HRP''',
 52021,'917f9c62-9581-4373-b9e5-b1cfe1f10cbb'),
-- 3 M_Locator
(0,0,'Y',NOW(),100,NOW(),100,
 'M_Locator (OnHandOnly)','U','S',
 'M_Locator.IsActive = ''Y'' AND (EXISTS (
    SELECT 1 FROM M_Storage
    WHERE M_Storage.M_Locator_ID = M_Locator.M_Locator_ID
    AND M_Storage.M_Product_ID = @M_Product_ID@
    AND M_Storage.QtyOnHand != 0
 ) OR M_Locator.M_Locator_ID IN (''1000005'',''1000003'',''1018641'',''1022392''))',
 1000268,'19220dec-696c-4434-9bc8-f9ecb3d3a158'),
-- 4 MOLI_ProductBrand
(0,0,'Y',NOW(),100,NOW(),100,
 'MOLI_ProductBrand (Product)','U','S',
 'MOLI_ProductBrand.IsActive=''Y''',
 1000264,'8c33fbe5-ac46-439f-8364-5f8432e6da43'),
-- 5 C_BPartner_Loc - Relation
(0,0,'Y',NOW(),100,NOW(),100,
 'C_BPartner_Loc - Relation','D','S',
 'C_BPartner_Location.C_BPartner_ID=@C_BPartnerRelation_ID@',
 188,'a4740a50-5262-4ee2-9d2a-3d4eb04091dd'),
-- 6 MOLI_HS
(0,0,'Y',NOW(),100,NOW(),100,
 'MOLI_HS (Product)','U','S',
 'MOLI_HS.IsActive=''Y''',
 1000266,'467bc809-7f57-4340-aedd-baf49c7af8e0')
ON CONFLICT (AD_Val_Rule_UU)
DO UPDATE SET
    Name        = EXCLUDED.Name,
    EntityType  = EXCLUDED.EntityType,
    Type        = EXCLUDED.Type,
    Code        = EXCLUDED.Code,
    AD_Val_Rule_UU = EXCLUDED.AD_Val_Rule_UU,
    IsActive    = 'Y',
    Updated     = NOW(),
    UpdatedBy   = 100;
--
-- UPDATES SEquence for AD_Val_Rule
UPDATE AD_Sequence
SET CurrentNext = (
    SELECT MAX(AD_Val_Rule_ID) + 1
    FROM AD_Val_Rule
)
WHERE Name = 'AD_Val_Rule';