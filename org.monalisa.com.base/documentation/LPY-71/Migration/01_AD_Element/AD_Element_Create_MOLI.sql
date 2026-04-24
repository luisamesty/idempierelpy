-- AD_Element_Create_MOLI
-- Elementos de las tablas MOLI
SELECT 
--    'SELECT amf_upsert_ad_element(''' 
    'CALL amf_run_upsert_ad_element(''' 
    || columnname || ''','''
    || ad_element_uu || ''','''
    || REPLACE(name,'''','''''') || ''','''
    || REPLACE(printname,'''','''''') || ''','''
	|| COALESCE(REPLACE(regexp_replace(description, '[^a-zA-Z0-9 ]', '', 'g'), '''', ''''''), '') || ''','''
	|| COALESCE(REPLACE(regexp_replace(help, '[^a-zA-Z0-9 ]', '', 'g'), '''', ''''''), '') || ''','''
    || entitytype || ''');' AS upserts
FROM (
	SELECT DISTINCT
		string_agg(t.TableName, ', ' ORDER BY t.TableName) AS Tablas,
	    string_agg(t.ad_table_id::text, ', ' ORDER BY t.ad_table_id) AS AD_Table_IDs,
	    e.AD_Element_ID,
	    e.ColumnName AS ColumnName,
	    e.AD_Element_UU,
	    e.name, 
	    e.printname,
	    e.description,
	    e.help,
	    e.entitytype
	FROM AD_Element e
	JOIN AD_Column c ON (e.AD_Element_ID = c.AD_Element_ID)
	JOIN AD_Table t ON (c.AD_Table_ID = t.AD_Table_ID)
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
	AND c.EntityType <> 'D'
	AND e.IsActive = 'Y'
	GROUP BY 
	    e.ColumnName, e.AD_Element_ID, e.AD_Element_UU, 
	    e.Name, e.PrintName, e.Description, e.EntityType
	ORDER BY e.ColumnName
) AS elements
;

