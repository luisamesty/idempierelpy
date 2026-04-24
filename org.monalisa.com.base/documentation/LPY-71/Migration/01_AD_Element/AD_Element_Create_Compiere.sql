-- AD_Element_Create_Compiere
-- Elementos de las tablas que utilizan campos MOLI
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
	AND e.IsActive = 'Y'
	GROUP BY 
	    e.ColumnName, e.AD_Element_ID, e.AD_Element_UU, 
	    e.Name, e.PrintName, e.Description, e.EntityType
	ORDER BY  e.ColumnName
) AS elements
;


