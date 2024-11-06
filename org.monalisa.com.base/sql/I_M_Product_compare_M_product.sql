WITH table1 AS (
    SELECT 
        c.AD_Column_ID,
        c.ColumnName,
        c.AD_Reference_ID,
        c.AD_Reference_Value_ID,
        c.FieldLength,
        c.IsMandatory,
        c.IsKey,
        c.DefaultValue
    FROM 
        adempiere.AD_Table t
    JOIN 
        adempiere.AD_Column c ON t.AD_Table_ID = c.AD_Table_ID
    WHERE 
        t.TableName = 'M_Product'  -- Cambia por el nombre de la primera tabla
        ORDER BY  c.ColumnName
),
table2 AS (
    SELECT 
        c.AD_Column_ID,
        c.ColumnName,
        c.AD_Reference_ID,
        c.AD_Reference_Value_ID,
        c.FieldLength,
        c.IsMandatory,
        c.IsKey,
        c.DefaultValue
    FROM 
        adempiere.AD_Table t
    JOIN 
        adempiere.AD_Column c ON t.AD_Table_ID = c.AD_Table_ID
    WHERE 
        t.TableName = 'I_Product'  -- Cambia por el nombre de la segunda tabla
         ORDER BY  c.ColumnName
)
-- Comparar estructura de las columnas entre ambas tablas
SELECT 
    t1.ColumnName AS columna1, t2.ColumnName AS columna2,
    t1.AD_Reference_ID AS tipo_dato_tabla1,
    t2.AD_Reference_ID AS tipo_dato_tabla2,
    t1.FieldLength AS longitud_tabla1,
    t2.FieldLength AS longitud_tabla2,
    t1.IsMandatory AS obligatorio_tabla1,
    t2.IsMandatory AS obligatorio_tabla2,
    t1.IsKey AS clave_primaria_tabla1,
    t2.IsKey AS clave_primaria_tabla2,
    t1.DefaultValue AS valor_por_defecto_tabla1,
    t2.DefaultValue AS valor_por_defecto_tabla2
FROM 
    table1 t1
FULL OUTER JOIN 
    table2 t2 ON t1.ColumnName = t2.ColumnName
WHERE 
    t1.AD_Reference_ID IS DISTINCT FROM t2.AD_Reference_ID
    OR t1.FieldLength IS DISTINCT FROM t2.FieldLength
    OR t1.IsMandatory IS DISTINCT FROM t2.IsMandatory
    OR t1.IsKey IS DISTINCT FROM t2.IsKey
    OR t1.DefaultValue IS DISTINCT FROM t2.DefaultValue
    OR t1.ColumnName = t2.ColumnName
ORDER BY 
    columna1;
