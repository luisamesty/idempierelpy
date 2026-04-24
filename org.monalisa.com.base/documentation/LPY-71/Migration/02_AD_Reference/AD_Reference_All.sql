-- AD_Reference_All
-- All tables MOLI and Compiere
SELECT DISTINCT
    t.TableName,
    t.AD_Table_ID,
    c.ColumnName,
    c.AD_Column_ID,
    r.AD_Reference_ID,
    r.Name AS ReferenceName,
    r.ValidationType,
    r.EntityType
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
    'M_ProductPrice', 'M_RMA', 'M_RMALine', 'M_Warehouse',
    	    'MOLI_BrandUSP', 
	    'MOLI_C_InvoicePayment', 
	    'MOLI_GeoRefCode', 
	    'MOLI_HS', 
	    'MOLI_inOutData', 
	    'MOLI_invoiceData', 
	    'MOLI_movementData', 
	    'MOLI_PeopleCount', 
	    'MOLI_posTransactions', 
	    'MOLI_ProductBrand', 
	    'MOLI_ProductLine', 
	    'MOLI_RegForm', 
	    'MOLI_RegFormLine', 
	    'MOLI_RegFormProduct', 
	    'MOLI_SKULabel'
) AND r.AD_Reference_ID NOT IN (
 14, 37, 18, 21, 31, 200231, 28, 11, 200012, 10, 19, 17, 34, 25, 12, 40, 33, 200173, 22, 13, 16, 
 1000000, 15, 20, 200135, 32, 29, 200133, 200202, 30, 200240, 35
)
AND c.IsActive = 'Y'
ORDER BY t.TableName, c.ColumnName;