SELECT 
'INSERT INTO AD_Table (
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
' ||
STRING_AGG(
'-- ' || t.AD_Table_ID || ' ' || t.TableName || E'\n' ||
'(' ||
'0,0,' ||
'''' || t.IsActive || ''',' ||
'NOW(),' ||
t.CreatedBy || ',' ||
'NOW(),' ||
t.UpdatedBy || ',' ||
-- TableName
'''' || t.TableName || ''',' ||
-- Name
'''' || REPLACE(COALESCE(t.Name,''),'''','''''') || ''',' ||
-- Description
CASE 
    WHEN t.Description IS NULL THEN 'NULL'
    ELSE '''' || REPLACE(t.Description,'''','''''') || ''''
END || ',' ||
-- Help
CASE 
    WHEN t.Help IS NULL THEN 'NULL'
    ELSE '''' || REPLACE(t.Help,'''','''''') || ''''
END || ',' ||
-- AccessLevel
'''' || t.AccessLevel || ''',' ||
-- Flags
'''' || t.IsView || ''',' ||
'''' || t.IsChangeLog || ''',' ||
'''' || t.IsCentrallyMaintained || ''',' ||
'''' || t.IsShowInDrillOptions || ''',' ||
'''' || t.IsHighVolume || ''',' ||
-- EntityType
'''' || t.EntityType || ''',' ||
-- IDs
t.AD_Table_ID || ',' ||
'''' || t.AD_Table_UU || '''' ||
')'
, ',' || E'\n'
ORDER BY t.AD_Table_ID
)
|| E'\nON CONFLICT (AD_Table_UU)\nDO UPDATE SET\n' ||
'    Name                    = EXCLUDED.Name,
    Description             = EXCLUDED.Description,
    Help                    = EXCLUDED.Help,
    AccessLevel             = EXCLUDED.AccessLevel,
    IsView                  = EXCLUDED.IsView,
    IsChangeLog             = EXCLUDED.IsChangeLog,
    IsCentrallyMaintained   = EXCLUDED.IsCentrallyMaintained,
    IsShowInDrillOptions    = EXCLUDED.IsShowInDrillOptions,
    IsHighVolume            = EXCLUDED.IsHighVolume,
    EntityType              = EXCLUDED.EntityType,
    IsActive                = ''Y'',
    Updated                 = NOW(),
    UpdatedBy               = 100;'
AS sql_script
FROM AD_Table t
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
AND t.IsActive = 'Y';