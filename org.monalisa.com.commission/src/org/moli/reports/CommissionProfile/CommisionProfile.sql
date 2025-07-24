-- CommissionProfile V2
-- Commission Profile Report
-- Report for Commission profile
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
        c.AD_Client_ID AS "ad_client_id",
        c.AD_Org_ID AS "ad_org_id",
        orgh.value AS "org_header",
        c.C_Commission_ID AS "c_commission_id",
        c.Name AS "commission_name",
        c.Description AS "commission_description",
        c.ValidFrom AS "validfrom",
        c.ValidTo AS "validto",
        c.C_Currency_ID AS "c_currency_id",
        c.C_BPartner_ID AS "salesrep_id",
        c.IsActive AS "isactive",
        c.DocBasisType AS "docbasistype",
        c.FrequencyType AS "frequencytype",
        curr1.iso_code || '-' || currt1.cursymbol || '-' || COALESCE(currt1.description,curr1.iso_code,curr1.cursymbol,'') AS "moneda",
        cl.C_CommissionLine_ID AS "c_commissionline_id",
        cl.Line AS "line",
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
        cl.MOLI_CommGoalBaseMultiplier AS "moli_commgoalbasemultiplier"
    FROM C_Commission c
    INNER JOIN C_CommissionLine cl ON c.C_Commission_ID = cl.C_Commission_ID
    LEFT JOIN AD_Org orgh ON orgh.ad_org_id = c.ad_org_id
    LEFT JOIN AD_Org orgl ON orgl.ad_org_id = cl.org_id
    LEFT JOIN M_Product p ON cl.M_Product_ID = p.M_Product_ID
    LEFT JOIN M_Product_Category pc ON cl.M_Product_Category_ID = pc.M_Product_Category_ID
    LEFT JOIN MOLI_ProductBrand pb ON cl.MOLI_ProductBrand_ID = pb.MOLI_ProductBrand_ID
    LEFT JOIN MOLI_ProductLine pl ON cl.MOLI_ProductLine_ID = pl.MOLI_ProductLine_ID
    INNER JOIN c_currency curr1 ON c.c_currency_id = curr1.c_currency_id
    LEFT JOIN c_currency_trl currt1 ON curr1.c_currency_id = currt1.c_currency_id
        AND currt1.ad_language = (SELECT AD_Language FROM AD_Client WHERE AD_Client_ID=$P{AD_Client_ID})
    WHERE c.AD_Client_ID = $P{AD_Client_ID}
      AND ($P{AD_Org_ID} IS NULL OR $P{AD_Org_ID} = 0 OR c.AD_Org_ID = $P{AD_Org_ID})
      AND ($P{C_Commission_ID} IS NULL OR $P{C_Commission_ID} = 0 OR c.C_Commission_ID = $P{C_Commission_ID})
      AND ($P{C_BPartner_ID} IS NULL OR $P{C_BPartner_ID} = 0 OR c.C_BPartner_ID = $P{C_BPartner_ID})
      AND c.ValidFrom >= CAST($P{DateFrom} AS Timestamp)
      AND c.ValidTo <= CAST($P{DateTo} AS Timestamp)
) comm ON 1=0
ORDER BY comm."ad_org_id", comm."salesrep_id", comm."line";