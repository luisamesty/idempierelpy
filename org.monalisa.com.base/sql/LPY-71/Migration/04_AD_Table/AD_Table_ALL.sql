-- AD_Table_All
-- All Affected tables
SELECT 
    t.TableName,
    t.Name,
    t.Description,
    t.Help,
    t.AD_Table_ID,
    t.EntityType,
    t.AccessLevel,
    t.IsActive,
    t.IsView,
    t.IsChangeLog,
    t.isCentrallyMaintained ,
    t.isshowindrilloptions ,
    t.ishighvolume ,
    t.created ,
    t.createdby ,
    t.updated ,
    t.updatedby,
    t.ad_table_uu 
FROM AD_Table t
JOIN AD_Column c 
    ON c.AD_Table_ID = t.AD_Table_ID
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
AND t.IsActive = 'Y'
GROUP BY 
    t.TableName,
    t.AD_Table_ID,
    t.EntityType,
    t.AccessLevel,
    t.IsActive
ORDER BY t.TableName;