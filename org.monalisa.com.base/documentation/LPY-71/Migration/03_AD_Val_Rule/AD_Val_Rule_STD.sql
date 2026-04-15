-- AD_VAl_Rule_STD
-- Executed on Seed Database
-- 104, 105, 115, 116, 119, 120, 123, 124, 125, 126, 127, 129, 130, 131, 132, 133, 148, 149, 153, 155, 
-- 158, 161, 167, 168, 189, 191, 192, 200, 201, 203, 204, 210, 213, 218, 220, 227, 230, 231, 232, 235, 
-- 236, 243, 262, 263, 271, 52000, 52001, 52022, 52029, 52030, 52033, 52034, 52045, 52055, 52067, 52068, 
-- 52084, 52098, 52100, 200007, 200012, 200016, 200017, 200025, 200053, 200057, 200058, 200065, 200074, 
-- 200075, 200093, 200096, 200097, 200135, 200140, 200141, 1000062, 1000063

SELECT DISTINCT
    vr.AD_Val_Rule_ID
FROM AD_Column c
JOIN AD_Table t ON t.AD_Table_ID = c.AD_Table_ID
JOIN AD_Val_Rule vr ON vr.AD_Val_Rule_ID = c.AD_Val_Rule_ID
WHERE t.TableName IN (
    'AD_Org', 'AD_OrgInfo', 'AD_PInstance', 'AD_PInstance_Log', 'AD_Private_Access',
    'AD_Scheduler', 'AD_Sequence', 'AD_Sequence_No', 'AD_TableValRule', 'AD_User',
    'AD_User_Roles', 'AD_UserDef_Info_Column', 'AD_UserDef_Info_Related', 'AD_UserPreference',
    'C_AcctSchema_GL', 'C_Bank', 'C_BankAccount', 'C_BP_BankAccount', 'C_BP_Group',
    'C_BPartner', 'C_BPartner_Location', 'C_Charge', 'C_Commission', 'C_CommissionLine',
    'C_CommissionRun', 'C_Community', 'C_DocType', 'C_Invoice', 'C_InvoiceLine',
    'C_Location', 'C_Location_Org_V', 'C_Order', 'C_Order_LineTax_v', 'C_OrderLine',
    'C_Payment', 'C_PaymentTerm', 'C_PaySelection', 'C_PaySelection_Check_v',
    'C_PaySelection_Check_vt', 'C_Tax', 'C_TaxCategory', 'Fact_Acct', 'I_Product',
    'M_InOut', 'M_InOutLine', 'M_InOutLineConfirm', 'M_InventoryLine', 'M_Locator',
    'M_Movement', 'M_MovementLine', 'M_PriceList', 'M_PriceList_Version', 'M_Product',
    'M_ProductPrice', 'M_RMA', 'M_RMALine', 'M_Warehouse'
)
AND c.AD_Val_Rule_ID IS NOT NULL
AND c.IsActive = 'Y'
;