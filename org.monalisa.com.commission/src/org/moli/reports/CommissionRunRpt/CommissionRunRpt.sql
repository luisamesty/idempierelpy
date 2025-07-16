-- CommissionRunRpt
-- Commission Run Report
-- Report for Commission Run
SELECT *
FROM (
    SELECT
        cli.ad_client_id AS "rep_client_id",
        CASE WHEN ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0) THEN 0 ELSE $P{AD_Org_ID} END AS "rep_org_id",
        CASE WHEN ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0)
            THEN COALESCE(cli.name, cli.value) || ' - Todas las Organizaciones'
            ELSE COALESCE(orgh.name, orgh.value, '') END AS "rep_name",
        CASE WHEN ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0)
            THEN COALESCE(cli.description, cli.name) || ' - Todas las Organizaciones'
            ELSE COALESCE(orgh.description, orgh.name, orgh.value, '') END AS "rep_description",
        CASE WHEN ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0)
            THEN '' ELSE COALESCE(orginfo.taxid, '') END AS "rep_taxid",
        CASE WHEN ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0)
            THEN img1.binarydata ELSE img2.binarydata END AS "rep_logo",
        1 AS "imp_header"
    FROM adempiere.ad_client cli
    INNER JOIN adempiere.ad_org orgh ON orgh.ad_client_id = cli.ad_client_id
    INNER JOIN adempiere.ad_clientinfo cliinfo ON cli.ad_client_id = cliinfo.ad_client_id
    LEFT JOIN adempiere.ad_image img1 ON cliinfo.logoreport_id = img1.ad_image_id
    INNER JOIN adempiere.ad_orginfo orginfo ON orgh.ad_org_id = orginfo.ad_org_id
    LEFT JOIN adempiere.ad_image img2 ON orginfo.logo_id = img2.ad_image_id
    WHERE cli.ad_client_id = $P{AD_Client_ID}
      AND ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0 OR orgh.ad_org_id = $P{AD_Org_ID})
) header_info
FULL JOIN (
	SELECT
	    cr.AD_Client_ID AS "ad_client_id",
	    cr.AD_Org_ID AS "ad_org_id",
	    orgh.value AS "org_header",
	    curr1.iso_code || '-' || currt1.cursymbol || '-' || COALESCE(currt1.description,curr1.iso_code,curr1.cursymbol,'') AS "moneda",
	    cr.C_Commission_ID AS "c_commission_id",
	    cr.C_CommissionRun_ID AS "c_commissionrun_id",
	    cr.DocumentNo AS "commissionrun_documentno",
	    cr.Description AS "commissionrun_description",
	    cr.Startdate AS "startdate",
	    cr.Processed AS "commissionRun_processed",
	    cr.IsActive AS "commissionRun_isactive",
	    cr.grandtotal AS "grandtotal",
	    ca.C_CommissionLine_ID AS "c_commissionline_id",
	    cl.line AS "line",
        cl.org_id AS "org_id",
        COALESCE(orgl.value,' ') AS "org_line",
        cl.Description AS "line_description",
        cl.M_Product_ID AS "m_product_id",
        cl.M_Product_Category_ID AS "m_product_category_id",
        cl.MOLI_ProductBrand_ID AS "moli_productbrand_id",
        cl.MOLI_ProductLine_ID AS "moli_productline_id",
        COALESCE(p.Name, ' ') AS "product_name",
        COALESCE(pc.Name, ' ') AS "productcategory_name",
        COALESCE(pb.Name, ' ') AS "productbrand_name",
        COALESCE(pl.Name, ' ') AS "productline_name",
        CASE c.DocBasisType
            WHEN 'I' THEN 'Invoice'
            WHEN 'O' THEN 'Order'
            WHEN 'R' THEN 'Receipt'
            ELSE 'Unknown' END AS "docbasistypename",
        CASE c.FrequencyType
            WHEN 'D' THEN 'Daily'
            WHEN 'M' THEN 'Monthly'
            WHEN 'Q' THEN 'Quarterly'
            WHEN 'W' THEN 'Weekly'
            WHEN 'Y' THEN 'Yearly'
            ELSE 'Unknown' END AS "frequencytypename",
        cl.QtySubtract AS "qtysubtract",
        cl.QtyMultiplier AS "qtymultiplier",
        cl.AmtSubtract AS "amtsubtract",
        cl.AmtMultiplier AS "amtmultiplier",
        cl.MOLI_CommGoal AS "moli_commgoal",
        cl.MOLI_CommGoalMiltiplier AS "moli_commgoalmultiplier",
        cl.MOLI_CommGoalBase AS "moli_commgoalbase",
        cl.MOLI_CommGoalBaseMultiplier AS "moli_commgoalbasemultiplier",
	    ca.ConvertedAmt AS "ca_convertedamt",
	    ca.ActualQty AS "ca_actualqty",
	    ca.CommissionAmt AS "ca_commissionamt",
	    c.C_BPartner_ID AS "c_bpartner_id",
	    c.ValidFrom AS "validfrom",
        c.ValidTo AS "validto",
	    ca.IsActive AS "commissionamt_isactive",
	    cd.C_CommissionDetail_ID AS "commissiondetail_id",
	    cd.reference AS "reference",
	    cd.C_OrderLine_ID AS "c_orderline_id",
	    cd.C_InvoiceLine_ID AS "c_invoiceline_id",
	    cd.ActualQty AS "cd_actualqty",
	    cd.ActualAmt AS "cd_actualamt",
	    cd.convertedamt AS "cd_convertedamt",
	    cd.IsActive AS "commissiondetail_isactive",
	    CASE WHEN cd.C_InvoiceLine_ID IS NOT NULL THEN
		        TRIM(i.DocumentNo) || '_' ||
		        TO_CHAR(i.DateInvoiced, 'DD/MM/YYYY') || '_' ||
		        TRIM(TO_CHAR(il.LineNetAmt, '99999990.99')) || '_' ||
		        TRIM(TO_CHAR(il.QtyInvoiced, '99999990.##')) || '_' ||
		        TRIM(TO_CHAR(il.LineNetAmt * il.QtyInvoiced, '99999990.99'))
		    ELSE '' END AS "line_invoice",
		CASE  WHEN cd.C_OrderLine_ID IS NOT NULL THEN
			        TRIM(o.DocumentNo) || '_' ||
			        TO_CHAR(o.DateOrdered, 'DD/MM/YYYY') || '_' ||
			        TRIM(TO_CHAR(ol.LineNetAmt, '99999990.99')) || '_' ||
			        TRIM(TO_CHAR(ol.QtyOrdered, '99999990.##')) || '_' ||
			        TRIM(TO_CHAR(ol.LineNetAmt * ol.QtyOrdered, '99999990.99'))
			    ELSE '' END AS "line_order"
	FROM C_CommissionRun cr
	INNER JOIN (
	    SELECT C_Commission_ID, MAX(C_CommissionRun_ID) AS last_commissionrun_id
	    FROM C_CommissionRun
	    WHERE AD_Client_ID = $P{AD_Client_ID}
	    GROUP BY C_Commission_ID
	) last_runs ON cr.C_CommissionRun_ID = last_runs.last_commissionrun_id
	INNER JOIN C_Commission c ON c.c_commission_id = cr.c_commission_id
	INNER JOIN C_CommissionAmt ca ON cr.C_CommissionRun_ID = ca.C_CommissionRun_ID
	INNER JOIN C_CommissionLine cl ON cl.c_commissionline_id = ca.c_commissionline_id
	LEFT JOIN  C_CommissionDetail cd ON ca.C_CommissionAmt_ID = cd.C_CommissionAmt_ID
    INNER JOIN (
      SELECT ad_client_id, c_period_id, periodno, name, startdate , enddate
      FROM C_Period
      WHERE AD_Client_ID = $P{AD_Client_ID} AND c_period_ID = $P{C_Period_ID}
    ) comper  ON comper.ad_client_id = c.ad_client_id
		     AND c.ValidFrom >= comper.startdate
		     AND c.ValidTo <= comper.enddate
    LEFT JOIN AD_Org orgh ON orgh.ad_org_id = c.ad_org_id
    LEFT JOIN AD_Org orgl ON orgl.ad_org_id = cl.org_id
    LEFT JOIN M_Product p ON cl.M_Product_ID = p.M_Product_ID
    LEFT JOIN M_Product_Category pc ON cl.M_Product_Category_ID = pc.M_Product_Category_ID
    LEFT JOIN MOLI_ProductBrand pb ON cl.MOLI_ProductBrand_ID = pb.MOLI_ProductBrand_ID
    LEFT JOIN MOLI_ProductLine pl ON cl.MOLI_ProductLine_ID = pl.MOLI_ProductLine_ID
    LEFT JOIN C_InvoiceLine il ON cd.C_InvoiceLine_ID = il.C_InvoiceLine_ID
	LEFT JOIN C_Invoice i ON il.C_Invoice_ID = i.C_Invoice_ID
	LEFT JOIN C_OrderLine ol ON cd.C_OrderLine_ID = ol.C_OrderLine_ID
	LEFT JOIN C_Order o ON ol.C_Order_ID = o.C_Order_ID
    INNER JOIN c_currency curr1 ON c.c_currency_id = curr1.c_currency_id
    LEFT JOIN c_currency_trl currt1 ON curr1.c_currency_id = currt1.c_currency_id
        AND currt1.ad_language = (SELECT AD_Language FROM AD_Client WHERE AD_Client_ID=$P{AD_Client_ID})
	WHERE cr.AD_Client_ID = $P{AD_Client_ID}
		AND ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0 OR cr.AD_Org_ID = $P{AD_Org_ID})
      	AND ($P{C_Commission_ID} IS NULL OR $P{C_Commission_ID} = 0 OR cr.C_Commission_ID = $P{C_Commission_ID})
) commr ON 1=0
ORDER BY commr.commissionrun_documentno, commr.line, commr.reference


