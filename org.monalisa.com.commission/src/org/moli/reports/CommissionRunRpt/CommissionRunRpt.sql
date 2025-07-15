SELECT
    cr.AD_Client_ID,
    cr.AD_Org_ID,
    cr.C_CommissionRun_ID,
    cr.DocumentNo AS CommissionRun_DocumentNo,
    cr.Description AS CommissionRun_Description,
    cr.DateTrx,
    cr.DateAcct,
    cr.Processed AS CommissionRun_Processed,
    cr.IsActive AS CommissionRun_IsActive,
    ca.C_CommissionAmt_ID,
    ca.C_Commission_ID,
    ca.C_BPartner_ID,
    ca.ActualAmt,
    ca.CommissionAmt,
    ca.Processed AS CommissionAmt_Processed,
    ca.IsActive AS CommissionAmt_IsActive,
    cd.C_CommissionDetail_ID,
    cd.C_OrderLine_ID,
    cd.M_Product_ID,
    cd.C_Charge_ID,
    cd.C_InvoiceLine_ID,
    cd.Qty,
    cd.Price,
    cd.Amt AS CommissionDetail_Amt,
    cd.Processed AS CommissionDetail_Processed,
    cd.IsActive AS CommissionDetail_IsActive
FROM
    C_CommissionRun cr
JOIN
    C_CommissionAmt ca ON cr.C_CommissionRun_ID = ca.C_CommissionRun_ID
LEFT JOIN
    C_CommissionDetail cd ON ca.C_CommissionAmt_ID = cd.C_CommissionAmt_ID
WHERE
    cr.AD_Client_ID = @AD_Client_ID@
AND
    cr.AD_Org_ID = @AD_Org_ID@
ORDER BY
    cr.DocumentNo, ca.C_BPartner_ID, cd.C_CommissionDetail_ID;