-- AD_Column_Compiere_Create_UPSERTS.sql
-- -- AD_Column_Compiere_Create_UPSERTS.sql
-- 
SELECT 
t.TableName,
'INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
' ||
STRING_AGG(
'(' ||
c.AD_Column_ID || ',' ||
COALESCE(c.SeqNoSelection,0) || ',' ||
'''' || c.IsSyncDatabase || ''',' ||
COALESCE(c.Version,0) || ',' ||
'''' || c.IsMandatory || ''',' ||
'''' || c.IsTranslated || ''',' ||
'''' || c.IsIdentifier || ''',' ||
COALESCE(c.SeqNo,0) || ',' ||
'''' || c.IsParent || ''',' ||
COALESCE(c.FieldLength,0) || ',' ||
'''' || c.IsSelectionColumn || ''',' ||
'''' || c.IsKey || ''',' ||
'''' || c.IsAutocomplete || ''',' ||
'''' || c.IsAllowLogging || ''',' ||
'''' || c.AD_Column_UU || ''',' ||
'NOW(),' ||
'''' || c.IsUpdateable || ''',' ||
'''' || c.ColumnName || ''',' ||
'''' || REPLACE(c.Name,'''','''''') || ''',' ||
'''' || c.IsAllowCopy || ''',' ||
'''' || c.IsActive || ''',' ||
c.CreatedBy || ',' ||
c.UpdatedBy || ',' ||
'''' || c.IsToolbarButton || ''',' ||
'''' || c.IsAlwaysUpdateable || ''',' ||
c.AD_Client_ID || ',' ||
c.AD_Org_ID || ',' ||
'NOW(),' ||
'''' || c.EntityType || ''',' ||
'''' || c.IsEncrypted || ''',' ||
'''' || c.IsSecure || ''',' ||
COALESCE('''' || c.FKConstraintType || '''','NULL') || ',' ||
'( SELECT AD_Element_ID FROM AD_Element WHERE columnname = ' || '''' || c.columnname ||''')' || ',' ||
c.AD_Reference_ID || ',' ||
c.AD_Table_ID ||
')'
, ',' || E'\n'
ORDER BY c.AD_Column_ID
)
|| E'\nON CONFLICT (AD_Column_UU)\nDO UPDATE SET\n' ||
'        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;'
AS sql_script
FROM AD_Column c
JOIN AD_Table t ON t.AD_Table_ID = c.AD_Table_ID
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
	    'M_ProductPrice', 'M_RMA', 'M_RMALine', 'M_Warehouse', 'Regulation_Form_Line', 
	    'Regulation_Form_Product'
) 
AND c.EntityType <> 'D'
AND c.IsActive = 'Y'
GROUP BY t.TableName
ORDER BY t.TableName;
SELECT 
t.TableName,
'INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
' ||
STRING_AGG(
'(' ||
c.AD_Column_ID || ',' ||
COALESCE(c.SeqNoSelection,0) || ',' ||
'''' || c.IsSyncDatabase || ''',' ||
COALESCE(c.Version,0) || ',' ||
'''' || c.IsMandatory || ''',' ||
'''' || c.IsTranslated || ''',' ||
'''' || c.IsIdentifier || ''',' ||
COALESCE(c.SeqNo,0) || ',' ||
'''' || c.IsParent || ''',' ||
COALESCE(c.FieldLength,0) || ',' ||
'''' || c.IsSelectionColumn || ''',' ||
'''' || c.IsKey || ''',' ||
'''' || c.IsAutocomplete || ''',' ||
'''' || c.IsAllowLogging || ''',' ||
'''' || c.AD_Column_UU || ''',' ||
'NOW(),' ||
'''' || c.IsUpdateable || ''',' ||
'''' || c.ColumnName || ''',' ||
'''' || REPLACE(c.Name,'''','''''') || ''',' ||
'''' || c.IsAllowCopy || ''',' ||
'''' || c.IsActive || ''',' ||
c.CreatedBy || ',' ||
c.UpdatedBy || ',' ||
'''' || c.IsToolbarButton || ''',' ||
'''' || c.IsAlwaysUpdateable || ''',' ||
c.AD_Client_ID || ',' ||
c.AD_Org_ID || ',' ||
'NOW(),' ||
'''' || c.EntityType || ''',' ||
'''' || c.IsEncrypted || ''',' ||
'''' || c.IsSecure || ''',' ||
COALESCE('''' || c.FKConstraintType || '''','NULL') || ',' ||
( SELECT AD_Element_ID FROM AD_Element WHERE columnname = c.columnname) || ',' ||
c.AD_Reference_ID || ',' ||
c.AD_Table_ID ||
')'
, ',' || E'\n'
ORDER BY c.AD_Column_ID
)
|| E'\nON CONFLICT (AD_Column_UU)\nDO UPDATE SET\n' ||
'        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;'
AS sql_script
FROM AD_Column c
JOIN AD_Table t ON t.AD_Table_ID = c.AD_Table_ID
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
	    'M_ProductPrice', 'M_RMA', 'M_RMALine', 'M_Warehouse', 'Regulation_Form_Line', 
	    'Regulation_Form_Product'
) 
AND c.EntityType <> 'D'
AND c.IsActive = 'Y'
GROUP BY t.TableName
ORDER BY t.TableName;