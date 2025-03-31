# META-INF Packs definition

Packs created from Develop data base

## Packs References.

| META-INF   |    PackName            |
|------------|------------------------|
|2Pack_1.0.0 |   MOLI_Tables          |
|2Pack_2.0.0 |   MOLI_CompiereTables  |
|2Pack_3.0.0 |   MOLI_Commission      |

### MOLI_tables:
Pack-Out MOLI_Tables.

|DB Table Name          |    Name                    | Description                                                |
|-----------------------|----------------------------|------------------------------------------------------------|
|MOLI_GeoRefCode        |    Fiscal Geo Reference    |                                                            |    
|MOLI_HS                |    Harmonized System       | Harmonized Commodity Description and Coding System (HS Convention) |
|MOLI_inOutData         | MOLI_inOutData             |                                                            |
|MOLI_invoiceData       |    MOLI_invoiceData_ID     |                                                            |
|MOLI_movementData      |    MOLI_movementData       |                                                            |
|MOLI_PeopleCount       |    People Counting         | People Counting data                                       |
|MOLI_posTransactions   |    MOLI_posTransactions_ID |                                                            |
|MOLI_ProductBrand      | Product Brand              |    Product Brand                                           |
|MOLI_ProductLine       | Product Line               |    Product Line                                            |

MOLI Windows related with tables.


### MOLI Compiere Tables
Pack-Out MOLI_Compiere_Tables.

All changes on standard Application Dictionary.
Tables for Document plugin:
|DB Table Name     |    Name                | Description                                                 |
|------------------|------------------------| ------------------------------------------------------------|
|  MO_InOut        |  Header M_InOut        |                                                             |
|  MO_Invoice      |  Header C_Invoice      |                                                             |
|  MO_Order        |  Header C_Order        |                                                             |
|  MO_Movement     |  Header M_Movement     |                                                             |
|  MO_Product      |  M_product             | Extends X_M_Product                                         |
|  MO_Payment      |  Header C_Payment      | Extends MPayment (X_C_Payment)                              |
|  MO_Sequence_No  |  X_AD_Sequence_No      | Extends X_AD_Sequence_No                                    |
|  MO_Sequence     |  X_AD_Sequence         | Extends MSequence  (X_AD_Sequence)                          |


Tables for Product Import:
|DB Table Name     |    Name                | Description                                                 |
|------------------|------------------------| ------------------------------------------------------------|

|  I_Product       |  Import products table | Replicates all Product fields                               |
|  C_BPartner      |  Business Partners     |                                                             |

### MOLI Commission Tables

Tables for Commission Plugin:
|DB Table Name     |    Name                      | Description                                                 |
|---------------------|---------------------------| ------------------------------------------------------------|
| C_Commission        |  CommissionHeader         |                                                             |
| C_CommissionLine    |  Commission Line          |                                                             |
| C_CommissionRun     |  Commission Run of Process|                                                             |
| C_CommissionAmt     |  Commission Amount        |                                                             |
| C_CommissionDetail  |  Commission Detail        |                                                             |


 
 
 
 
 
