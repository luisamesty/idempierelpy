-- AD_Column_MOLI_Create_UPSERTS.sql
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
'   Name                = EXCLUDED.Name,
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
)
GROUP BY t.TableName
ORDER BY t.TableName;