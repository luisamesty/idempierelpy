-- AD__Reference_STD
-- STANDARD References to be ignored
SELECT DISTINCT
    r.AD_Reference_ID
FROM AD_Column c
JOIN AD_Table t ON t.AD_Table_ID = c.AD_Table_ID
JOIN AD_Reference r ON r.AD_Reference_ID = c.AD_Reference_ID
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
AND c.IsActive = 'Y'
;