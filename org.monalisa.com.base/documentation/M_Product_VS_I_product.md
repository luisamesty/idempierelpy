# Comparación de la Tabla `M_Product`

| Columna | WORK ON | Columna Instancia 2 | Tipo de Dato Tabla 1 | Tipo de Dato Tabla 2 | Longitud Tabla 1 | Longitud Tabla 2 | Obligatorio Tabla 1 | Obligatorio Tabla 2 | Clave Primaria Tabla 1 | Clave Primaria Tabla 2 | Valor por Defecto Tabla 1 | Valor por Defecto Tabla 2 |
|---------|---------|----------------------|-----------------------|-----------------------|-------------------|-------------------|----------------------|----------------------|-------------------------|-------------------------|---------------------------|---------------------------|
| AD_Client_ID |  | AD_Client_ID | 19 | 19 | 22 | 22 | Y | N | N | N | @#AD_Client_ID@ | @#AD_Client_ID@ |
| AD_Org_ID |  | AD_Org_ID | 19 | 19 | 22 | 22 | Y | N | N | N | @#AD_Org_ID@ | @#AD_Org_ID@ |
| Classification |  | Classification | 10 | 10 | 12 | 1 | N | N | N | N |  |  |
| CopyFrom | NO, call Product Procedure |  | 28 |  | 1 |  | N |  | N |  |  |  |
| CostStandard | NO, INACTIVE |  | 12 |  | 10 |  | N |  | N |  |  |  |
| Created |  | Created | 16 | 16 | 7 | 7 | Y | Y | N | N | SYSDATE | SYSDATE |
| CreatedBy |  | CreatedBy | 30 | 30 | 22 | 22 | Y | N | N | N |  |  |
| C_RevenueRecognition_ID | SI Agregado | C_RevenueRecognition_ID | 19 |  | 22 |  | N | N |  |  |  |  |
| C_SubscriptionType_ID | SI Agregado | C_SubscriptionType_ID | 19 |  | 22 |  | N | N |  |  |  |  |
| C_TaxCategory_ID | SI Agregado | C_TaxCategory_ID | 19 |  | 22 |  | Y | N |  |  |  |  |
| | SI Creado Elemento | TaxCategory Value | | | | | | | | | | |
| C_UOM_ID | | C_UOM_ID | 19 | 19 | 22 | 22 | Y | N | N | N | | |
| | SI Creado Elemento | UOM_Value | | | | | | | | | | |
| CustomsTariffNumber | | CustomsTariffNumber | 10 | 10 | 20 | 20 | N | N | N | N | | |
| Description | | Description | 10 | 10 | 255 | 255 | N | N | N | N | | |
| DescriptionURL | | DescriptionURL | 40 | 40 | 120 | 120 | N | N | N | N | | |
| Discontinued | | Discontinued | 20 | 20 | 1 | 1 | N | N | N | N | | |
| DiscontinuedAt | | DiscontinuedAt | 15 | 15 | 7 | 7 | N | N | N | N | | |
| DocumentNote | | DocumentNote | 14 | 14 | 2000 | 2000 | N | N | N | N | | |
| Group1 | | Group1 | 10 | 10 | 255 | 255 | N | N | N | N | | |
| Group2 | | Group2 | 10 | 10 | 255 | 255 | N | N | N | N | | |
| GuaranteeDays | SI Agregado | GuaranteeDays | 11 | | 22 | | N | N | | | | |
| GuaranteeDaysMin | SI Agregado | GuaranteeDaysMin | 11 | | 22 | | N | N | | | | |
| Help | | Help | 14 | 14 | 2000 | 2000 | N | N | N | N | | |
| ImageURL | | ImageURL | 40 | 40 | 120 | 120 | N | N | N | N | | |
| IsActive | | IsActive | 20 | 20 | 1 | 1 | Y | N | N | N | Y | Y |
| IsAutoProduce | SI Agregado | IsAutoProduce | 20 | | 1 | | Y | N | N | | | |
| IsBOM | SI Agregado | IsBOM | 20 | | 1 | | Y | N | N | | | |
| IsDropShip | SI Agregado | IsDropShip | 20 | | 1 | | Y | N | | | | |
| IsExcludeAutoDelivery | SI Agregado | IsExcludeAutoDelivery | 20 | | 1 | | Y | N | N | | | |
| IsInvoicePrintDetails | SI Agregado | IsInvoicePrintDetails | 20 | | 1 | | Y | N | | | | |
| IsKanban | SI Agregado | IsKanban | 20 | | 1 | | Y | N | N | | | |
| IsManufactured | SI Agregado | IsManufactured | 20 | | 1 | | Y | N | N | | | |
| IsOwnBox | SI Agregado | IsOwnBox | 20 | | 1 | | Y | N | N | | | |
| IsPhantom | SI Agregado | IsPhantom | 20 | | 1 | | Y | N | N | | | |
| IsPickListPrintDetails | SI Agregado | IsPickListPrintDetails | 20 | | 1 | | Y | N | | | | |
| IsPurchased | SI Agregado | IsPurchased | 20 | | 1 | | Y | N | Y | | | |
| IsSelfService | SI Agregado | IsSelfService | 20 | | 1 | | Y | N | Y | | | |
| IsSold | SI Agregado | IsSold | 20 | | 1 | | Y | N | Y | | | |
| IsStocked | SI Agregado | IsStocked | 20 | | 1 | | Y | N | Y | | | |
| IsSummary | SI Agregado | IsSummary | 20 | | 1 | | Y | N | | | | |
| IsVerified | SI Agregado | IsVerified | 20 | | 1 | | Y | N | N | | | |
| IsWebStoreFeatured | SI Agregado | IsWebStoreFeatured | 20 | | 1 | | Y | N | | | | |
| LowLevel | SI Agregado | LowLevel | 11 | | 8 | | Y | N | | | 0 | |
| M_AttributeSet_ID | | M_AttributeSet_ID | 19 | 19 | 22 | 22 | N | N | N | N | | |
| | SI Creado Elemento | AttributeSet Value (Memo 200) | | | | | | | | | | |
| M_AttributeSetInstance_ID | SI Agregado | M_AttributeSetInstance_ID | 35 | | 22 | | Y | N | | | | |
| M_FreightCategory_ID | SI Agregado | M_FreightCategory_ID | 19 | | 22 | | N | N | | | | |
| M_Locator_ID | SI Agregado | M_Locator_ID | 31 | | 22 | | N | N | | | | |
| MOLI_HS_ID | SI Agregado | MOLI_HS_ID | 30 | | 22 | | N | N | | | | |
| MOLI_M_Product_ID | SI Agregado | MOLI_M_Product_ID | 11 | | 10 | | N | N | | | | |
| MOLI_ProductBrand_ID | SI Agregado | MOLI_ProductBrand_ID | 30 | | 22 | | N | N | | | | |
| | SI Creado Elemento | ProductBrand_Value | | | | | | | | | | |
| MOLI_ProductLine_ID | SI Agregado | MOLI_ProductLine_ID | 19 | | 22 | | N | N | | | | |
| | SI Creado Elemento | ProdctLine_Value | | | | | | | | | | |
| MOLI_SyncPrefix | | | 10 | | 50 | | N | N | | | | |
| M_PartType_ID | | | 19 | | 10 | | N | N | | | | |
| M_Product_Category_ID | | M_Product_Category_ID | 19 | 19 | 22 | 22 | Y | N | N | N | | |
| M_Product_ID | | M_Product_ID | 13 | 30 | 22 | 22 | Y | N | Y | N | | |
| M_Product_UU | N/A | | 200231 | | 36 | | N | N | N | | | |
| Name | | Name | 10 | 10 | 60 | 60 | Y | N | | | | |
| Packing | | | 10 | | 255 | | N | | | | | |
| PODCode | SI Agregado | PODCode | 10 | | 200 | | N | N | | | | |
| Print | SI Agregado | Print | 10 | | 200 | | N | N | | | | |
| Processing | | Processing | 20 | 20 | 1 | 1 | N | N | N | N | N | |
| ProductType | | ProductType | 10 | 10 | 255 | 255 | Y | N | | | | |
| R_RevenueRecognition_ID | | R_RevenueRecognition_ID | 19 | 19 | 22 | 22 | N | N | N | N | | |
| RevRecogName | | RevRecogName | 10 | 10 | 255 | 255 | N | N | | | | |
| S_ExpenseType_ID | SI Agregado | S_ExpenseType_ID | 30 | | 22 | | N | N | | | | |
| S_Resource_ID | SI Agregado | S_Resource_ID | 30 | | 22 | | N | N | | | | |
| SKU | SI Agregado | SKU | 10 | | 50 | | N | N | | | | |
| UnitsPerPallet | | UnitsPerPallet | 30 | 30 | 22 | 22 | N | N | | | | |
| UPC | | UPC | 10 | 10 | 50 | 50 | N | N | | | | |
| Updated | | Updated | 16 | 16 | 7 | 7 | Y | Y | | | SYSDATE | SYSDATE |
| UpdatedBy | | UpdatedBy | 30 | 30 | 22 | 22 | Y | N | | | | |
| Value | | Value | 10 | 10 | 40 | 40 | Y | N | | | | |
| VersionNo | | VersionNo | 10 | 10 | 40 | 40 | N | N | | | | |
