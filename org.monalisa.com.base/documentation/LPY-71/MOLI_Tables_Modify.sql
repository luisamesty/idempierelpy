SELECT
	t.tablename,
	t.name AS table_name,
	t.entitytype || ' - ' || et_t.name AS table_entitytype,
	c.columnname,
	c.name AS column_name,
	c.entitytype || ' - ' || et_c.name AS column_entitytype,
	r.name AS reference_type,
	c.fieldlength,
	c.updated AS column_updated,
	ucol.name AS column_updated_by,
	t.updated AS table_updated,
	utbl.name AS table_updated_by
FROM
	ad_table t
JOIN ad_column c
    ON
	c.ad_table_id = t.ad_table_id
LEFT JOIN ad_reference r
    ON
	r.ad_reference_id = c.ad_reference_id
LEFT JOIN ad_entitytype et_t
    ON
	et_t.entitytype = t.entitytype
LEFT JOIN ad_entitytype et_c
    ON
	et_c.entitytype = c.entitytype
LEFT JOIN ad_user ucol
    ON
	ucol.ad_user_id = c.updatedby
LEFT JOIN ad_user utbl
    ON
	utbl.ad_user_id = t.updatedby
WHERE
	t.updated >= DATE '2024-01-01'
	OR c.updated >= DATE '2024-01-01'
ORDER BY
	GREATEST(t.updated, c.updated) DESC,
	t.tablename,
	c.columnname;