-- 20260422_007_LPY-71.sql
-- AD_Column_Compiere_UPSERTS.sql
-- Table
-- AD_Org OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001757,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','4c6a2eae-013d-42af-a226-64cbaa8449b4',NOW(),'N','MOLI_AD_Org_ID','AD_Org(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AD_Org_ID'),11,155)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- AD_Sequence_No OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001777,0,'Y',0,'N','N','N',0,'N',255,'N','N','N','Y','68d388ce-76ef-406c-a735-46cbf87cbf13',NOW(),'Y','Prefix','Prefix','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Prefix'),10,122),
(1001778,0,'Y',0,'N','N','N',0,'N',255,'N','N','N','Y','9090bee7-1b70-4dd2-a8a9-9918fc9dae39',NOW(),'Y','Suffix','Suffix','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Suffix'),10,122)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
--AD_User OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(56294,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','779ec08e-e7f7-4303-9418-94f1d0a0305f',NOW(),'Y','IsInPayroll','Is In Payroll','Y','Y',0,100,'N','N',0,0,NOW(),'EE02','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsInPayroll'),20,114),
(1001094,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','7c2bcf11-5d7e-4293-ae03-01db1d218dc9',NOW(),'Y','Percentage','Percentage','Y','Y',0,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Percentage'),12,114)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- AD_UserPreference OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001499,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','b3910be1-b3c6-420c-bb74-b83a5863be45',NOW(),'Y','KDB_KanbanBoard_ID','Kanban Board','Y','Y',0,0,'N','Y',0,0,NOW(),'KDB','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'KDB_KanbanBoard_ID'),19,200174)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- AD_User_Roles OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001809,10,'Y',0,'N','N','Y',0,'N',60,'Y','N','N','Y','4c85835c-7c75-4a7f-9dc0-6043b6725be1',NOW(),'N','Name','Name','N','Y',100,100,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,157)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Bank OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001749,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','02e23080-fd1f-432d-964b-f713318d1762',NOW(),'N','MOLI_C_Bank_ID','C_Bank(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_Bank_ID'),11,296)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table OK
-- C_BankAccount
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001760,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','723e12fd-4241-4c0e-83f2-2a71b7b1fe0e',NOW(),'N','MOLI_C_BankAccount_ID','C_BankAccount(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_BankAccount_ID'),11,297),
(1003294,0,'N',0,'N','N','N',0,'N',20,'N','N','N','Y','2deb0749-20fe-4b63-a1a3-6c36a8933bc4',NOW(),'N','SwiftCode','Swift code','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SwiftCode'),10,297)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_BPartner OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(2902,200,'Y',0,'Y','N','Y',1,'N',120,'Y','N','N','Y','f4ab1a70-8fd4-471e-a8da-0acd0b998c4b',NOW(),'Y','Name','Name','Y','Y',0,100,'N','N',0,0,NOW(),'QSS_LCO','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,291),
(54463,0,'N',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','6a97efbb-6151-44f3-b286-9aae8e58eaa8',NOW(),'Y','C_TaxGroup_ID','Tax Group','Y','Y',0,0,'N','N',0,0,NOW(),'EE04','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_TaxGroup_ID'),19,291),
(1001128,900,'Y',0.0,'N','N','N',0,'N',22,'Y','N','N','Y','9b0c80cf-3f56-4e2c-afaf-003c21e6a1fb',NOW(),'Y','C_BP_Channel_ID','Business Partner Channel','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BP_Channel_ID'),19,291),
(1001129,0,'Y',0.0,'N','N','N',0,'N',22,'N','N','N','Y','4599335b-f8ba-4158-90ca-0779002ab0f3',NOW(),'Y','C_BP_Holding_ID','Business Partner Holding Group','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BP_Holding_ID'),19,291),
(1001130,800,'Y',0,'Y','N','N',0,'N',1,'Y','N','N','Y','dd644762-1ee7-4148-b019-5f715582e13a',NOW(),'Y','isVip','isVip','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'isVip'),20,291),
(1001131,0,'Y',0.0,'N','N','N',0,'N',10,'N','N','N','Y','1a245eb5-99c0-481a-8625-71de5edfb69b',NOW(),'Y','amerp_actionbuton','SENIAT Validation','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_actionbuton'),28,291),
(1001132,50,'Y',0.0,'N','N','N',0,'N',60,'N','N','N','Y','0b9ccefa-95ca-421f-83b2-2e2c87d4ec99',NOW(),'Y','amerp_nameseniat','Name by SENIAT','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_nameseniat'),10,291),
(1001133,0,'Y',0.0,'N','N','N',0,'N',12,'N','N','N','Y','9028cf72-6d80-4d18-a7bf-c57047b0f034',NOW(),'Y','amerp_rifseniat','RIF by SENIAT','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_rifseniat'),10,291),
(1001134,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','f95fb668-3329-4c4a-94e9-f5cf3cebc666',NOW(),'Y','amerp_isvalidationseniat','WEB SENIAT Verified','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_isvalidationseniat'),20,291),
(1001135,0,'Y',0.0,'N','N','N',0,'N',2000,'N','N','N','Y','9d0be06f-1010-4be9-9a7b-9fa9ada0a403',NOW(),'Y','amerp_descriptionseniat','Description by WEB SENIAT','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_descriptionseniat'),14,291),
(1001136,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','319c66bb-3de6-4af4-9903-8ff83b8dbbd0',NOW(),'Y','amerp_withholdingagent','VAT WithHolding Agent','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_withholdingagent'),20,291),
(1001137,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','47f27087-3d60-4a0d-9e1f-0e368ccc72db',NOW(),'Y','amerp_ivataxpayer','VAT Tax Payer','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_ivataxpayer'),20,291),
(1001138,0,'Y',0.0,'N','N','N',0,'N',10,'N','N','N','Y','81e21081-d9f1-4f9c-8bbb-1eedfced77a8',NOW(),'Y','amerp_withholdingrate','VAT WithHolding Rate','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'amerp_withholdingrate'),22,291),
(1001139,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','c892f0db-21ff-47fc-a29d-89e1dc0619b9',NOW(),'Y','LCO_ISIC_ID','ISIC','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LCO_ISIC_ID'),30,291),
(1001140,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','532c532d-3c97-4a18-9152-973cab91613c',NOW(),'Y','LCO_TaxPayerType_ID','Tax Payer Type','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LCO_TaxPayerType_ID'),19,291),
(1001141,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','dcef2253-0a3c-44cf-93fc-fbc34fd995dc',NOW(),'Y','LCO_TaxIdType_ID','Tax ID Type','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LCO_TaxIdType_ID'),19,291),
(1001142,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','76aa8346-0103-4eb3-9590-4ce5d0842ef1',NOW(),'Y','TaxIdDigit','Tax ID Digit','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'TaxIdDigit'),10,291),
(1001143,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','73481522-3250-4c0f-b19a-496050780ffe',NOW(),'Y','IsUseTaxIdDigit','Use Tax Id Digit','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsUseTaxIdDigit'),20,291),
(1001144,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','de2ced72-6f5b-4ab0-9710-122412f89970',NOW(),'Y','IsDetailedNames','Detailed Names','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsDetailedNames'),20,291),
(1001145,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','9be788e7-e121-4020-907b-2da073ca45bc',NOW(),'Y','FirstName1','First Name 1','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'FirstName1'),10,291),
(1001146,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','422ae05d-0408-4a14-ace4-169e88a8be35',NOW(),'Y','FirstName2','First Name 2','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'FirstName2'),10,291),
(1001147,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','865d46f8-44bb-4b8d-babe-ff27d977785d',NOW(),'Y','LastName1','Last Name 1','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LastName1'),10,291),
(1001148,0,'Y',0,'N','N','N',0,'N',60,'N','N','N','Y','a164a720-07cc-4eeb-a358-ed4eebe6d4f9',NOW(),'Y','LastName2','Last Name 2','Y','Y',0,0,'N','N',0,0,NOW(),'QSS_LCO','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LastName2'),10,291),
(1001516,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','125174e3-78da-4369-8934-dd34176d17b6',NOW(),'Y','MOLI_BPARTNERTYPE','MOLI_BPARTNERTYPE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_BPARTNERTYPE'),17,291),
(1001517,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','e1098d34-1759-43a3-9947-baf873a1d524',NOW(),'Y','MOLI_PHOTOID','MOLI_PHOTOID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PHOTOID'),10,291),
(1001630,0,'Y',0,'N','N','N',0,'N',50,'N','N','N','Y','68070d18-9548-45ad-8426-0f5fe3a97a2b',NOW(),'Y','MOLI_SyncPrefix','Sync Prefix','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SyncPrefix'),10,291),
(1001632,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','c7448814-aae7-4e6a-b973-166f262e959a',NOW(),'Y','MOLI_DocumentType','Document Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DocumentType'),17,291),
(1001753,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','f729fcb5-c10a-46d8-abb0-cf3285cf0c62',NOW(),'N','MOLI_C_BPartner_ID','C_BPartner(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_BPartner_ID'),11,291),
(1001837,0,'Y',1,'N','N','N',0,'N',30,'N','N','N','Y','51f7c13b-94dd-4bc3-bf90-20d7bb636586',NOW(),'Y','MOLI_NroCedula','Nro Cedula','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_NroCedula'),10,291),
(1002100,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','ccbb02aa-bbfb-42b6-a38a-b56c1c71605e',NOW(),'Y','Commision','Commision','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Commision'),12,291),
(1002101,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','aceface7-6028-4b5d-b180-d8ea561e816b',NOW(),'Y','CommissionsGroup','COMMISSIONSGROUP','Y','Y',100,100,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CommissionsGroup'),10,291),
(1002102,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','baac3828-1192-4bcb-9daf-8a222c81d379',NOW(),'Y','FIRSTHIREDATE','FIRSTHIREDATE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'FIRSTHIREDATE'),10,291),
(1002103,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','0ed5c5be-a3e6-4dd7-95ef-4e00dd5a7953',NOW(),'Y','HIREDATE','HIREDATE','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'HIREDATE'),10,291),
(1002104,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','6dba93fe-3b4e-47a0-b44a-2d952e4cee14',NOW(),'Y','IDCardAux','IDCardAux','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IDCardAux'),10,291),
(1002105,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','905ba832-3bc8-4dd2-aefa-dba564a26ffc',NOW(),'Y','IDCardNo','IDCardNo','Y','Y',100,100,'N','N',0,0,NOW(),'MOLI','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IDCardNo'),10,291),
(1002106,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','87f6693d-e1c3-45e9-8fb3-9f13c910dd70',NOW(),'Y','IDNumber','IDNumber','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IDNumber'),10,291),
(1002107,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','e6d8ef7f-a3db-4d2d-b927-1fff20bb4068',NOW(),'Y','IDType','IDType','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IDType'),10,291),
(1002108,0,'Y',0,'N','N','N',0,'N',120,'N','N','N','Y','ae7c42cf-779b-43f3-8224-330193bbfbb4',NOW(),'N','ImageURL','Image URL','Y','Y',100,100,'N','N',0,0,NOW(),'MOLI','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ImageURL'),10,291),
(1002109,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','168f1c3b-e992-46b0-93ea-dcd0dfea7135',NOW(),'Y','SocialSecurityNO','SocialSecurityNO','Y','Y',100,100,'N','N',0,0,NOW(),'MOLI','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SocialSecurityNO'),10,291),
(1002110,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','5b620160-b7ec-41ba-bc48-c17bc186895e',NOW(),'Y','isSocialSecurity','isSocialSecurity','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'isSocialSecurity'),20,291),
(1002111,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','b53db13d-4538-4133-aa87-96e40c5b984d',NOW(),'Y','OrgSectorValue','OrgSectorValue','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'OrgSectorValue'),10,291),
(1002112,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','6ebacbf6-40f0-4b30-89b4-b23b34e0cc38',NOW(),'Y','PIN','PIN','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PIN'),10,291),
(1002113,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','1dcacfa3-f9bb-4a86-9599-8d072078939d',NOW(),'Y','Commission','Commission %','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Commission'),22,291),
(1002114,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','9c83fbf5-d748-4f1e-bb50-41cb41895874',NOW(),'Y','OrgSector','OrgSector','Y','Y',100,100,'N','N',0,0,NOW(),'MOLI','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'OrgSector'),17,291),
(1002115,0,'Y',0,'N','N','N',0,'N',15,'N','N','N','Y','21761d32-47cc-47bb-b949-6b19275307d4',NOW(),'Y','JobRemuneration','JobRemuneration','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'JobRemuneration'),12,291),
(1002194,910,'Y',0,'Y','N','N',0,'N',1,'Y','N','N','Y','942afa10-9153-4ae2-b85b-dfa0ee481a7f',NOW(),'Y','MOLI_IsEDI','EDI Enabled','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsEDI'),20,291),
(1002434,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','64d0af2e-cda7-4f94-87a1-ff82b88f10e4',NOW(),'Y','MOLI_GMRKenzo_ID','BP GMR Kenzo','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GMRKenzo_ID'),18,291),
(1002435,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','8af1092c-cdb9-4891-8dfc-423904a86521',NOW(),'Y','MOLI_IsGMRKenzo','Is GMR Kenzo','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsGMRKenzo'),20,291),
(1002439,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','bbafe77d-de5a-4cbe-8c08-b3bb0eddfbaa',NOW(),'Y','MOLI_GMRKenzoBarcode','GMR Kenzo Barcode','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GMRKenzoBarcode'),10,291),
(1002440,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','1c5b5578-a961-463d-a100-64d5179c7b27',NOW(),'Y','MOLI_IsPromoter','Promoter','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsPromoter'),20,291)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table OK
-- C_BPartner_Location
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001525,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','d09c944f-36a1-4931-b30c-80a98eac2e5a',NOW(),'N','MOLI_GeoRefCode_ID','Geo Ref Code ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_ID'),19,293),
(1001754,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','a55bc427-eb47-4d6c-92f0-c6d3392a7f22',NOW(),'N','MOLI_C_BPartner_Location_ID','C_BPartner_Location(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_BPartner_Location_ID'),11,293)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_BP_BankAccount OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003295,0,'Y',0,'N','N','N',0,'N',20,'N','N','N','Y','6f885ec6-8102-49e5-a64f-724734d1613c',NOW(),'N','SwiftCode','Swift code','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SwiftCode'),10,298)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_BP_Group OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001758,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','ac262180-417e-4319-b667-e4da71d86c31',NOW(),'N','MOLI_C_BPartner_Location_ID','C_BPartner_Location(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_BPartner_Location_ID'),11,394)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Charge OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001750,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','b87c129e-54c3-4c07-8481-e62742100691',NOW(),'N','MOLI_C_Charge_ID','C_Charge(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_Charge_ID'),11,313)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Commission OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002187,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','f71db0ee-ade7-43c6-aacd-949fd98efcac',NOW(),'Y','ValidFrom','Valid from','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ValidFrom'),15,429),
(1002188,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','03da6e86-9bc4-4a38-a037-21239a2cb973',NOW(),'Y','ValidTo','Valid to','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ValidTo'),15,429),
(1003162,0,'Y',0,'N','N','Y',0,'N',22,'N','N','N','Y','b4816cb5-5afe-4d13-9739-cdac22e67bb2',NOW(),'Y','C_DocType_ID','Document Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_DocType_ID'),19,429)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table 
-- C_CommissionLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003144,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','60ef3f9b-181e-4461-8ddb-c2681711e14c',NOW(),'Y','MOLI_C_BP_Group_ID','C_BP_Group(ID)','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_BP_Group_ID'),18,431),
(1003145,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','9b65f246-2b60-423e-b632-06802e5c2fee',NOW(),'Y','MOLI_ProductBrand_ID','Product Brand','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),30,431),
(1003146,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','45b4d03c-764a-4fe3-b541-c2152615a73d',NOW(),'Y','MOLI_ProductLine_ID','Product Line','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductLine_ID'),30,431),
(1003147,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','e8f54898-3786-4774-8fdf-f0a0d71ce1a3',NOW(),'Y','MOLI_HS_ID','Harmonized System','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HS_ID'),30,431),
(1003148,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','9000128f-7eae-4029-8cf4-7d5634096e20',NOW(),'Y','ValidFrom','Valid from','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ValidFrom'),15,431),
(1003149,0,'Y',0,'N','N','N',0,'N',7,'N','N','N','Y','de4fba3a-69a8-4953-8848-1d5efa69e588',NOW(),'Y','ValidTo','Valid to','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ValidTo'),15,431),
(1003150,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','761644c4-b791-4ebb-9b52-662bcfe9bb66',NOW(),'Y','C_BPartner_Location_ID','Partner Location','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_Location_ID'),19,431),
(1003151,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','fe1f605b-e057-45ec-9a00-f0c766beffe3',NOW(),'Y','MOLI_IsLocalVendor','Local Vendor','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsLocalVendor'),17,431),
(1003152,0,'Y',0,'Y','N','N',0,'N',22,'N','N','N','Y','6607867e-0abc-4ce4-a94f-97fa97bfeb09',NOW(),'Y','MOLI_CommGoalBase','Comm Goal Base','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CommGoalBase'),12,431),
(1003153,0,'Y',0,'Y','N','N',0,'N',22,'N','N','N','Y','11f88551-2ed8-4691-be32-44ba21941160',NOW(),'Y','MOLI_CommGoal','Comm Goal','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CommGoal'),12,431),
(1003154,0,'Y',0,'Y','N','N',0,'N',22,'N','N','N','Y','a27d2f1f-4ca6-4a86-b31a-5572f77c345d',NOW(),'Y','MOLI_CommGoalMiltiplier','Comm Goal Miltiplier','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CommGoalMiltiplier'),12,431),
(1003155,0,'Y',0,'Y','N','N',0,'N',22,'N','N','N','Y','647d48d5-573b-4159-a553-79cc35772c7e',NOW(),'Y','MOLI_CommGoalBaseMultiplier','Comm Goal Base Multiplier','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CommGoalBaseMultiplier'),12,431)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_CommissionRun OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003156,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','ba5fd500-e1f0-429b-9b7a-6f8af7506f95',NOW(),'Y','C_DocType_ID','Document Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_DocType_ID'),19,436)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Community OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1000004,0,'Y',0.0,'Y','N','N',0,'N',10,'N','Y','N','Y','de4aad24-d6fd-4e63-aa42-1fce0da7364b',NOW(),'N','C_Community_ID','Community','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Community_ID'),13,1000000),
(1000005,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','98759bb3-ba27-4b70-8ca9-b963aed65119',NOW(),'N','AD_Client_ID','Tenant','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),19,1000000),
(1000006,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e615ffc8-ff4d-4330-875d-cde774ccc632',NOW(),'N','AD_Org_ID','Organization','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000000),
(1000007,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','a6e8f39d-06c2-49d2-84d3-013df429d525',NOW(),'Y','IsActive','Active','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000000),
(1000008,0,'Y',0.0,'Y','N','N',0,'N',29,'N','N','N','Y','8af3eb47-65c3-48b4-ad56-b6723ed74511',NOW(),'N','Created','Created','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000000),
(1000009,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','3496f3d4-e318-4b9f-8db2-b366d0cd1670',NOW(),'N','CreatedBy','Created By','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),18,1000000),
(1000010,0,'Y',0.0,'Y','N','N',0,'N',29,'N','N','N','Y','270530ae-9fc9-43c4-9c66-5d2dcef7a52a',NOW(),'N','Updated','Updated','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000000),
(1000011,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','47b63c04-8e78-4e69-b790-a124828ea454',NOW(),'N','UpdatedBy','Updated By','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),18,1000000),
(1000012,30,'Y',0.0,'Y','N','Y',1,'N',60,'Y','N','N','Y','46ca3a64-f815-49a0-bcea-1ca0f403587e',NOW(),'Y','Name','Name','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000000),
(1000013,40,'Y',0.0,'N','N','N',0,'N',255,'Y','N','N','Y','b72bcb21-1659-4c35-8ca6-495489a5e621',NOW(),'Y','Description','Description','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000000),
(1000014,0,'Y',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','ec160086-71e4-44a4-bfc4-7cc151203c1c',NOW(),'N','C_Country_ID','Country','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Country_ID'),18,1000000),
(1000015,0,'Y',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','0e0432ab-a354-452a-ae3f-c0c72467b82f',NOW(),'Y','IsDefault','Default','Y','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsDefault'),20,1000000),
(1000016,0,'Y',0,'N','N','N',0,'N',36,'N','N','N','Y','fd38df82-b63f-4489-a5d5-dfee557f285f',NOW(),'Y','C_Community_UU','C_Community_UU','N','Y',0,0,'N','N',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Community_UU'),10,1000000)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_DocType OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001759,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','31e5dbf2-1f2e-4ace-a9c4-b67c0dcb0249',NOW(),'N','MOLI_C_DocType_ID','C_DocType(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_DocType_ID'),11,217)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Invoice OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001362,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','f2137102-7ee0-4add-94f2-ca16520a7634',NOW(),'Y','MOLI_FiscalDocumentNo','Fiscal Document NO','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FiscalDocumentNo'),10,318),
(1001501,0,'Y',0,'N','N','N',0,'N',44,'N','N','N','Y','a7f36362-b981-49e5-bcd8-24a02e46e604',NOW(),'Y','MOLI_Cdc','CDC','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Cdc'),10,318),
(1001502,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','dcc1da6c-18d3-4d72-829e-21b4decb53b7',NOW(),'Y','MOLI_AuthNo','Auth No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AuthNo'),10,318),
(1001503,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','1442a68b-d45e-4000-8bf2-f0ade75f4f2d',NOW(),'Y','MOLI_InvoiceNo','Invoice NO','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvoiceNo'),10,318),
(1001504,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','6240fcea-1a14-4355-9fac-25ad04974d59',NOW(),'Y','MOLI_FsStatus','Fs Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsStatus'),17,318),
(1001505,0,'Y',0,'N','N','N',0,'N',4000,'N','N','N','Y','a3cb5078-0393-44c4-9f52-1a9a0245161e',NOW(),'Y','MOLI_FsError','Fs Error','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsError'),10,318),
(1001506,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','5a9fde95-3ea1-4709-ba78-227c83a7cab3',NOW(),'Y','MOLI_FsPaused','Fs Paused','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsPaused'),17,318),
(1001507,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','d0b9c297-943f-4d4f-bab5-cbe2c9993ae0',NOW(),'Y','MOLI_CreditNoteReason','Credit Note Reason','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CreditNoteReason'),17,318),
(1001508,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','e955bc8d-2efa-41c7-a9e5-fa628efb186f',NOW(),'Y','MOLI_PreImpNO','Pre Imp NO','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PreImpNO'),10,318),
(1001509,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','c5a715ab-8f77-4140-b8a8-7e20621d9400',NOW(),'Y','MOLI_FsVoidStatus','Fs Void Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidStatus'),17,318),
(1001510,0,'Y',0,'N','N','N',0,'N',4000,'N','N','N','Y','70a4bce6-5da1-416a-b3d8-5e6baa37ccb1',NOW(),'Y','MOLI_FsVoidMessage','Fs Void Message','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidMessage'),10,318),
(1001624,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','ce1d68cb-5ce5-4a34-8f11-765acf9905b5',NOW(),'Y','MOLI_CurrencyRate','Currency Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_CurrencyRate'),29,318),
(1001625,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','bebee018-8219-47af-a546-f3bcd37f31bc',NOW(),'Y','MOLI_LinkAuthId','Timbrado Asociado','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LinkAuthId'),10,318),
(1001626,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','f58e099e-79df-4864-b455-18f23dea7193',NOW(),'Y','MOLI_LinkInvNo','Factura Asociado','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LinkInvNo'),10,318),
(1001627,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','96313dcb-e1e0-4788-b811-8beaba430ac6',NOW(),'Y','MOLI_InvAuth','Numero de Timbrado','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvAuth'),10,318),
(1002062,0,'Y',1,'Y','N','N',0,'N',1,'N','N','N','Y','a836e0e8-5fdc-42e5-bd34-056394263d2c',NOW(),'Y','MOL_IsVerified','Invoice Verified','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOL_IsVerified'),20,318),
(1002182,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','d1e73934-1329-4115-b73f-65358d57cf8d',NOW(),'Y','MOLI_TaxCLBase','Tax Base','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TaxCLBase'),12,318),
(1002183,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','79e5c447-c211-4ab1-a535-8939be2e87e1',NOW(),'N','MOLI_AmtIVA0','Amt IVA0','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AmtIVA0'),12,318),
(1002184,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','4735c888-b81c-454f-9e15-a5e5b1791269',NOW(),'N','MOLI_AmtIVA5','Amt IVA5','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AmtIVA5'),12,318),
(1002185,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','8e4424b3-bc99-46b3-b615-6f3c9b5d98f9',NOW(),'N','MOLI_AmtIVA10','Amt IVA10','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_AmtIVA10'),12,318),
(1002431,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','d7f5125b-2a72-4b32-8d3a-c9961e2251fb',NOW(),'Y','MOLI_InvoiceReference','Invoice Reference','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvoiceReference'),10,318),
(1002451,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','e1292219-2f36-43cd-bd52-62efc904dfda',NOW(),'Y','MOLI_IsExcluded','Excluded','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsExcluded'),20,318),
(1003161,0,'Y',0,'N','N','N',0,'N',14,'N','N','N','Y','3300a63d-ea5e-4f61-ad02-bb23966cfa19',NOW(),'N','MOLI_C_Invoice_ID','MOLI_C_Invoice(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_Invoice_ID'),11,318)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_InvoiceLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002145,10,'Y',0,'N','N','N',0,'N',60,'Y','N','N','Y','fa444583-033b-4d15-89f9-19e4244e9382',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,333),
(1002146,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','b32890a5-5ee8-4059-aa0b-b32b174b27a9',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,333),
(1002147,0,'Y',0,'N','N','N',0,'N',30,'N','N','N','Y','16f36494-0bab-4129-a674-654ad56216db',NOW(),'N','UPC','UPC/EAN','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UPC'),10,333),
(1002853,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','403df343-c965-4436-97af-e3c28b59ac42',NOW(),'N','MOLI_ProductBrand_ID','Product Brand','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),19,333),
(1002854,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','d58f24b5-7565-4fb1-aea9-d3bc6a19c9df',NOW(),'N','MOLI_ProductLine_ID','Product Line','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductLine_ID'),19,333),
(1002855,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','2d011242-dac0-4c0d-b0ec-917eca0bb3f0',NOW(),'N','M_Product_Category_ID','Product Category','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Product_Category_ID'),19,333),
(1003307,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','44a02a74-3c3b-4ae2-8955-f37086e99341',NOW(),'N','MOLI_HS_ID','Harmonized System','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HS_ID'),10,333)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Location OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1000050,0,'Y',0.0,'N','N','N',0,'N',10,'N','N','N','Y','98210f11-5662-4f49-a389-901e2303873e',NOW(),'Y','C_Municipality_ID','C_Municipality','Y','Y',0,0,'N','Y',0,0,NOW(),'AMERP','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Municipality_ID'),18,162),
(1000051,0,'Y',0.0,'N','N','N',0,'N',10,'N','N','N','Y','fd94c7cd-5831-42b8-998f-9f7dfa94c6bd',NOW(),'Y','C_Parish_ID','C_Parish','Y','Y',0,0,'N','Y',0,0,NOW(),'AMERP','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Parish_ID'),18,162)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Location_Org_V OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003076,0,'Y',0,'N','N','N',0,'N',22,'N','Y','N','Y','69ca5357-ab18-45ab-baa0-b450680a1a7a',NOW(),'N','C_Location_ID','Address','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Location_ID'),19,1000119),
(1003077,10,'Y',0,'N','N','N',0,'N',40,'Y','N','N','Y','97c19db1-b34f-4c67-9a21-f31837f5c2bc',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000119),
(1003078,20,'Y',0,'N','N','Y',0,'N',60,'Y','N','N','Y','ae82fb03-55a6-460f-b459-1ae339e7e39b',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000119),
(1003079,30,'Y',0,'N','N','N',0,'N',255,'Y','N','N','Y','0ef51be1-a819-4529-a0f4-0f734c01f985',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000119),
(1003080,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','7cb2edf0-39b6-43fc-9aef-8b25bc5c6586',NOW(),'Y','IsSummary','Summary Level','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsSummary'),20,1000119),
(1003081,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','de765743-fb24-4da3-b106-35c8ea77d11b',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),19,1000119),
(1003082,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','caaf4281-361b-459b-aaa2-b4b1338f5d7b',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000119),
(1003083,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','26c54395-e699-4f25-86cb-6aa1d4c72844',NOW(),'Y','IsActive','Active','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000119)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
--C_Order OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001500,0,'N',0,'N','N','N',0,'N',44,'N','N','N','Y','a8fde973-7a35-439a-9aeb-3b2268a9e430',NOW(),'Y','MOLI_Cdc','CDC','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Cdc'),10,259),
(1001634,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','782a9ac5-f22a-420f-a001-c2ef8b9345a3',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,259),
(1002963,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','09b03254-ffa5-4061-bc3f-e63042996ed8',NOW(),'Y','MOLI_GMRKenzo_ID','BP GMR Kenzo','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GMRKenzo_ID'),18,259),
(1003095,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','1383ad6d-0bd4-4730-b87d-16a93d96bb34',NOW(),'Y','IsOverrideCurrencyRate','Override Currency Conversion Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsOverrideCurrencyRate'),20,259),
(1003096,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','c9edbd9b-1d0e-4371-acaf-f2204031702f',NOW(),'Y','CurrencyRate','Rate','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CurrencyRate'),22,259)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_OrderLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(56532,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','7dc07571-126b-4c03-93f2-d5d2da82b4ba',NOW(),'Y','PP_Cost_Collector_ID','Manufacturing Cost Collector','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PP_Cost_Collector_ID'),30,260),
(1001635,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','203cf9ab-036e-444c-86b3-89afff1dd694',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,260),
(1002142,10,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','c72d35dd-4d1a-4db3-b45a-339f0ca905e9',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,260),
(1002143,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','69b84a3e-b0f4-4dbb-83eb-58c04c69b32b',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,260),
(1002144,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','59229d59-cffe-4918-ad81-9e022978277c',NOW(),'N','UPC','UPC/EAN','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UPC'),10,260)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Order_LineTax_v OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003310,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','1599aa08-9b70-4238-8f26-066a9542c772',NOW(),'N','MOLI_SKULabel_RP','RP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SKULabel_RP'),10,497)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Payment OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001637,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','b9de5ed6-e2cc-4f66-9a76-1946294785ca',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,335),
(1001715,0,'N',1,'N','N','N',0,'N',7,'N','N','N','Y','28a22af7-969e-4f8d-860a-8573ee443c84',NOW(),'Y','MOLI_PostDatedCheck','PostDated Check','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PostDatedCheck'),15,335),
(1001780,0,'N',1,'N','N','N',0,'N',30,'N','N','N','Y','7314b690-1d0f-4205-a382-4f5bd0c6e8e0',NOW(),'Y','MOLI_FiscalDocumentNo','Fiscal Document NO','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FiscalDocumentNo'),10,335),
(1003163,0,'N',0,'N','N','N',0,'N',14,'N','N','N','Y','8d08a063-68de-41a7-abf1-51ca3160694a',NOW(),'N','MOLI_C_Payment_ID','MOLI_C_Payment(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_Payment_ID'),11,335)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_PaymentTerm OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001761,0,'N',1,'N','N','N',0,'N',10,'N','N','N','Y','50afbca6-f40f-4f0b-ba33-d1d3280d3a4f',NOW(),'N','MOLI_C_PaymentTerm_ID','C_PaymentTerm(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','D',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_PaymentTerm_ID'),11,113)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_PaySelection OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001716,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','9f8101dc-9d79-4bcd-a737-f35085ea2d56',NOW(),'Y','MOLI_PostDatedCheck','PostDated Check','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PostDatedCheck'),15,426)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_PaySelection_Check_v OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001717,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','9b19e37b-bb8a-4e01-8014-fde370da4391',NOW(),'Y','MOLI_PostDatedCheck','PostDated Check','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PostDatedCheck'),15,498)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_Tax OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(54408,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','af482a4d-eaed-40d5-a40a-26f4455deff7',NOW(),'Y','AD_Rule_ID','Rule','Y','Y',0,0,'N','N',0,0,NOW(),'EE04','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Rule_ID'),19,261),
(1001751,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','1074362b-66b1-4d76-80f3-3d7993366aa9',NOW(),'N','MOLI_C_Tax_ID','C_Tax(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_Tax_ID'),11,261)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- C_TaxCategory OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001752,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','20cf85b8-7ba7-47d9-a7e7-c0cbdba1d8b0',NOW(),'N','MOLI_C_TaxCategory_ID','C_TaxCategory(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_C_TaxCategory_ID'),11,252)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- I_Product OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002153,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','7c18b2e4-57dc-49fe-bfc3-a65d9c750df7',NOW(),'Y','C_RevenueRecognition_ID','Revenue Recognition','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_RevenueRecognition_ID'),19,532),
(1002154,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','fe02a383-59df-4a8b-85cf-e1077b08694f',NOW(),'Y','C_SubscriptionType_ID','Subscription Type','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_SubscriptionType_ID'),19,532),
(1002155,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','6d3fdaaf-c51b-48ce-a2de-bf886beff583',NOW(),'Y','C_TaxCategory_ID','Tax Category','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_TaxCategory_ID'),19,532),
(1002156,0,'Y',1,'N','N','N',0,'N',40,'N','N','N','N','108dbd97-cff0-48be-bcd3-fd30d33e7efe',NOW(),'Y','TaxCategory_Value','Tax Category Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'TaxCategory_Value'),10,532),
(1002157,0,'Y',1,'N','N','N',0,'N',40,'N','N','N','N','7c14d9b8-5118-435b-a373-496a47907e95',NOW(),'Y','UOM_Value','UOM Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UOM_Value'),10,532),
(1002158,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','f57c1a13-f21d-4557-8976-78f670f27a08',NOW(),'Y','GuaranteeDays','Guarantee Days','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'GuaranteeDays'),11,532),
(1002159,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','93459587-5b01-4a6b-97cb-29045d6fc879',NOW(),'Y','GuaranteeDaysMin','Min Guarantee Days','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'GuaranteeDaysMin'),11,532),
(1002160,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','ded04729-08f0-4fa5-b6fa-e9af6ddc37e5',NOW(),'Y','IsAutoProduce','Auto Produce','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsAutoProduce'),20,532),
(1002161,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','d396a348-1868-4a12-8451-dc87c0d4d1b6',NOW(),'Y','IsBOM','Bill of Materials','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsBOM'),20,532),
(1002162,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','2b4cb40b-46f1-48ed-ac93-609e579b3b5d',NOW(),'Y','IsDropShip','Drop Shipment','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsDropShip'),20,532),
(1002163,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','119571d4-9610-4ed7-9214-8547900ed5bd',NOW(),'Y','IsExcludeAutoDelivery','Exclude Auto Delivery','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsExcludeAutoDelivery'),20,532),
(1002164,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','83ebcec5-1e64-4db7-9974-a25ed8925cda',NOW(),'Y','IsInvoicePrintDetails','Print detail records on invoice','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsInvoicePrintDetails'),20,532),
(1002165,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','deb55782-606a-41ff-b9a5-4c59f32bf483',NOW(),'Y','IsKanban','Kanban controlled','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsKanban'),20,532),
(1002166,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','7ee81d68-f788-42f6-8653-b3b82c8546e6',NOW(),'Y','IsManufactured','Manufactured','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsManufactured'),20,532),
(1002167,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','5f3164af-6fa2-462c-9463-996ab457aa04',NOW(),'Y','IsOwnBox','Own Box','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsOwnBox'),20,532),
(1002168,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','9c20ecd1-aa2d-412a-a74c-006c57a50565',NOW(),'Y','IsPhantom','Phantom','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsPhantom'),20,532),
(1002169,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','f3465ba8-868d-41f9-ae10-8c20c1972530',NOW(),'Y','IsPickListPrintDetails','Print detail records on pick list','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsPickListPrintDetails'),20,532),
(1002170,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','e7c8a68b-3339-418b-95ca-59c5bcdcdfb2',NOW(),'Y','IsPurchased','Purchased','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsPurchased'),20,532),
(1002171,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','aada53e3-ec59-4b09-8b4d-44cfeb2e74c0',NOW(),'Y','IsSelfService','Self-Service','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsSelfService'),20,532),
(1002172,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','434b3941-dfb3-42eb-92ba-949c41fe3373',NOW(),'Y','IsSold','Sold','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsSold'),20,532),
(1002173,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','d89eef68-6534-438b-8043-1d47aada5773',NOW(),'N','IsStocked','Stocked','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsStocked'),20,532),
(1002174,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','2fb2cf29-067d-4ae1-b1e5-a546b83f81ca',NOW(),'Y','IsSummary','Summary Level','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsSummary'),20,532),
(1002175,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','88fc6042-c68d-426b-b48b-9018a44bec5c',NOW(),'Y','IsVerified','Verified','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsVerified'),20,532),
(1002176,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','be31c6cf-8925-475e-bec4-2ae2c5aa258f',NOW(),'Y','IsWebStoreFeatured','Featured in Web Store','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsWebStoreFeatured'),20,532),
(1002177,0,'Y',0,'N','N','N',0,'N',8,'N','N','N','Y','01baae50-4918-492f-97f2-e3f545b3dfcf',NOW(),'Y','LowLevel','Low Level','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LowLevel'),11,532),
(1002178,0,'Y',0,'N','N','N',0,'N',22,'N','N','N','Y','8e6fd69b-ec00-42e9-9b99-dd6985e7f988',NOW(),'Y','M_AttributeSetInstance_ID','Attribute Set Instance','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_AttributeSetInstance_ID'),35,532),
(1002179,0,'Y',0,'N','N','N',0,'N',4000,'N','N','N','Y','223103bc-a007-4ff3-ade3-1e499e094d0a',NOW(),'Y','AttributeSet_Value','AttributeSet Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AttributeSet_Value'),34,532),
(1002180,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','c2512d9d-5903-40e3-9fd0-79f51d815bf1',NOW(),'Y','ProductBrand_Value','ProductBrand  Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductBrand_Value'),10,532),
(1002181,0,'Y',0,'N','N','N',0,'N',40,'N','N','N','Y','52466cc2-1f2d-49bb-90f4-ad4e5bd8257c',NOW(),'Y','ProductLine_Value','ProductLine  Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductLine_Value'),10,532)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_InOut OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001538,0,'N',0,'N','N','N',0,'N',44,'N','N','N','Y','b85913f3-e0a1-4f7f-9828-4160316fd2d0',NOW(),'Y','MOLI_Cdc','CDC','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Cdc'),10,319),
(1001539,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','bc8dd767-a32e-419f-8a63-67a89b2c763c',NOW(),'Y','MOLI_FsStatus','Fs Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsStatus'),17,319),
(1001540,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','a709bf64-83b5-4c24-a7aa-8a089f203823',NOW(),'Y','MOLI_FsError','Fs Error','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsError'),10,319),
(1001541,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','afbcd47b-41d0-4d0d-b810-1312c933c749',NOW(),'Y','MOLI_FsPaused','Fs Paused','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsPaused'),17,319),
(1001542,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','a96f4d09-e5d5-4a9b-99b7-31ba2144d7ca',NOW(),'Y','MOLI_VehicleType','Vehicle Type','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_VehicleType'),10,319),
(1001543,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','9c6a2b50-af4d-425a-b327-597d7f616423',NOW(),'Y','DRIVERNAME','DRIVERNAME','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DRIVERNAME'),10,319),
(1001544,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','12382d37-f9f7-47aa-a71d-01a8d6fa1027',NOW(),'Y','MOLI_TransportDirection','Transport Direction','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TransportDirection'),10,319),
(1001545,0,'N',0,'N','N','N',0,'N',20,'N','N','N','Y','3e7d7bef-9c82-4cf8-b97f-26ad70ceb613',NOW(),'Y','MOLI_RucTransportista','Ruc Transportista','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RucTransportista'),10,319),
(1001546,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','7bd8b3de-2908-4df2-a6ab-fa7fe9ba6f49',NOW(),'Y','DRIVERID','DRIVERID','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DRIVERID'),10,319),
(1001547,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','e14aa48b-965b-43fc-a217-be644ad47e4c',NOW(),'Y','MOLI_Distancia','Distancia','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Distancia'),10,319),
(1001548,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','74bca025-530b-4267-962b-57cf1c61acae',NOW(),'Y','VEHICLE','VEHICLE','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'VEHICLE'),10,319),
(1001549,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','cc103267-c0f3-4031-8099-796bae1bab68',NOW(),'Y','VEHICLEID','VEHICLEID','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'VEHICLEID'),10,319),
(1001550,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','b5cbed92-a3f6-43f9-bda2-508f03f7d982',NOW(),'Y','MOLI_EndTransfer','End Transfer','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_EndTransfer'),15,319),
(1001551,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','55a5ee68-45d7-48ab-bb76-ab23fb788133',NOW(),'Y','MOLI_StartTransfer','Start Transfer','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_StartTransfer'),15,319),
(1001552,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','43ba552f-b6e7-4943-a302-ee0d52be8082',NOW(),'Y','MOLI_FsVoidStatus','Fs Void Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidStatus'),17,319),
(1001553,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','24c476c1-8ce3-4639-af45-a96d0a26fbda',NOW(),'Y','MOLI_FsVoidMessage','Fs Void Message','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidMessage'),10,319),
(1001633,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','6d5d48ab-1493-44c8-b39c-7ba744461a4c',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,319),
(1001776,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','42fa4a5a-b2fd-4dac-afc2-9c222969ec78',NOW(),'Y','MOLI_Transportista','Transportista','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Transportista'),10,319),
(1001779,0,'N',1,'N','N','N',0,'N',30,'N','N','N','Y','72cd26a5-fab6-4168-96a9-aa6003f0f5c1',NOW(),'Y','MOLI_FiscalDocumentNo','Fiscal Document NO','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FiscalDocumentNo'),10,319),
(1002432,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','98a839cb-f942-45a3-a21e-5801df736d38',NOW(),'Y','MOLI_InvoiceReference','Invoice Reference','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvoiceReference'),10,319)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_InOutLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001636,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','7f3e214a-7f4f-4b03-9fb2-63491a5836cf',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,320),
(1002137,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','6f06cf96-6dd4-492e-b09b-f09ecdb8e4af',NOW(),'N','UPC','UPC/EAN','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UPC'),10,320),
(1002138,10,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','28fa49ba-38bc-47cc-864e-779e37d085e7',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,320),
(1002139,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','9e2000ca-6001-42da-97ed-7545443a281f',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,320)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_InOutLineConfirm OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003298,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','737d99c6-7d07-4b2e-ab2b-0d7635b8e1f0',NOW(),'N','UPC','UPC/EAN','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UPC'),10,728)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_InventoryLine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003208,10,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','6a36ec63-149f-4643-a6c1-c2c0bb0d6cac',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,322),
(1003210,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','95cc4350-efcd-495d-9b6e-dadc28a9ac4b',NOW(),'N','Moli_InventoryLine_ID','Phys.Inventory','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Moli_InventoryLine_ID'),11,322),
(1003297,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','aa7ac71b-db2f-4907-a089-12649dca9d0f',NOW(),'N','Moli_MovementQty','Moli_MovementQty','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Moli_MovementQty'),29,322),
(1003359,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','2bdaecf4-cb27-4638-9870-fc5f87c1002c',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,322)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_Locator OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001775,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','136cde27-972f-42de-bafb-ebfc4aaca5d4',NOW(),'N','MOLI_GeoRefCode_ID','Geo Ref Code ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_ID'),19,207)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_Movement KO
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(53969,0,'Y',1.000000000000,'N','N','N',0,'N',1,'N','N','N','Y','36757128-0b9c-43f3-a997-f99d315118c5',NOW(),'Y','FreightCostRule','Freight Cost Rule','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'FreightCostRule'),17,323),
(53970,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','ff9f5c8f-aeec-4147-9558-17d433a36906',NOW(),'Y','M_Shipper_ID','Shipper','Y','Y',0,100,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Shipper_ID'),18,323),
(53971,0,'Y',1.000000000000,'N','N','N',0,'N',1,'N','N','N','Y','bf41fd4a-3aeb-4808-9076-0d7ddbc05308',NOW(),'Y','PriorityRule','Priority','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriorityRule'),17,323),
(53972,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','f5481d36-a4aa-41a0-bd50-9fe8c927a7fc',NOW(),'Y','SalesRep_ID','Sales Representative','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SalesRep_ID'),18,323),
(53973,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','37353257-303a-4f3a-b150-e9fafbbfd828',NOW(),'Y','AD_User_ID','User/Contact','Y','Y',0,100,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_User_ID'),19,323),
(53974,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','daf61fdd-e5db-4ae2-94cc-388174344171',NOW(),'Y','C_BPartner_ID','Business Partner','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_ID'),30,323),
(53975,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','b4891a9a-e5fc-4bf7-a286-ec7173483035',NOW(),'Y','C_BPartner_Location_ID','Partner Location','Y','Y',0,100,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_BPartner_Location_ID'),19,323),
(53976,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','453484ce-28d9-4f3d-af03-b3d24c749f24',NOW(),'Y','C_Charge_ID','Charge','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'C_Charge_ID'),19,323),
(53977,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','84280560-9959-4d77-a62e-6a911f8c490e',NOW(),'Y','ChargeAmt','Charge amount','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ChargeAmt'),12,323),
(53978,0,'Y',0,'N','N','N',0,'N',1,'N','N','N','Y','cd361e28-bd1a-4646-a190-145efbe3357b',NOW(),'Y','CreateFrom','Create lines from','Y','Y',0,0,'Y','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreateFrom'),28,323),
(53979,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','0881e67a-de2a-41fe-8be9-73a63fcb260c',NOW(),'N','DD_Order_ID','Distribution Order','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DD_Order_ID'),30,323),
(53980,0,'Y',1.000000000000,'N','N','N',0,'N',1,'N','N','N','Y','30d45f93-954c-4fdc-8fd2-ff352cee0958',NOW(),'Y','DeliveryRule','Delivery Rule','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DeliveryRule'),17,323),
(53981,0,'Y',1.000000000000,'N','N','N',0,'N',1,'N','N','N','Y','71ad2667-2323-4b67-8021-65b19e54e85d',NOW(),'Y','DeliveryViaRule','Delivery Via','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DeliveryViaRule'),17,323),
(53982,0,'Y',1.000000000000,'N','N','N',0,'N',10,'N','N','N','Y','e3e60101-af74-4cb1-9cf8-089db254edee',NOW(),'Y','FreightAmt','Freight Amount','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'FreightAmt'),12,323),
(56246,0,'N',0,'N','N','N',0,'N',20,'N','N','N','Y','42f7f738-6a2a-4f54-9dfc-67192a928b20',NOW(),'Y','POReference','Order Reference','Y','Y',100,100,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'POReference'),10,323)
--(1001554,0,'N',0,'N','N','N',0,'N',44,'N','N','N','Y','554c4281-a00d-4353-a235-baa8213e043a',NOW(),'Y','MOLI_Cdc','CDC','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Cdc'),10,323),
--(1001555,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','e8602a75-3e1d-48d4-8558-5db599417b09',NOW(),'Y','MOLI_FsStatus','Fs Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsStatus'),17,323),
--(1001556,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','4e77b5ef-329a-450b-9fb7-36a524bedf66',NOW(),'Y','MOLI_FsError','Fs Error','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsError'),10,323),
--(1001557,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','7704f43f-6f78-43dd-a0fe-729bea41a6d5',NOW(),'Y','MOLI_FsPaused','Fs Paused','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsPaused'),17,323),
--(1001558,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','1e712697-6848-4699-8e09-8723b7a35035',NOW(),'Y','MOLI_VehicleType','Vehicle Type','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_VehicleType'),10,323),
--(1001559,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','4dbc09a9-6798-4bdc-851d-064c43efb6be',NOW(),'Y','DRIVERID','DRIVERID','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DRIVERID'),10,323),
--(1001560,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','6a49ff69-af6a-4f0b-a142-895b8640cb99',NOW(),'Y','DRIVERNAME','DRIVERNAME','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DRIVERNAME'),10,323),
--(1001561,0,'N',0,'N','N','N',0,'N',20,'N','N','N','Y','eacba16a-be09-4fd1-89f1-85b1df7458db',NOW(),'Y','MOLI_RucTransportista','Ruc Transportista','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RucTransportista'),10,323),
--(1001562,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','c3af30f0-9ec1-4864-8fc0-cf575bcab01b',NOW(),'Y','MOLI_TransportDirection','Transport Direction','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TransportDirection'),10,323),
--(1001563,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','15b0492a-f7d2-4afc-ad10-4ed8383b1931',NOW(),'Y','MOLI_Distancia','Distancia','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Distancia'),10,323),
--(1001564,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','1f25bd0c-8f6b-4c96-8b1d-ba360e39ca8c',NOW(),'Y','VEHICLE','VEHICLE','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'VEHICLE'),10,323),
--(1001565,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','eb3bf65d-f236-4a8a-974a-f2c4ee915852',NOW(),'Y','VEHICLEID','VEHICLEID','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'VEHICLEID'),10,323),
--(1001566,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','fc3ea739-6080-4409-b6bf-599d80f553fc',NOW(),'Y','MOLI_StartTransfer','Start Transfer','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_StartTransfer'),15,323),
--(1001567,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','e12d94e6-385f-47a5-8bd2-8e9f1025b19d',NOW(),'Y','MOLI_EndTransfer','End Transfer','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_EndTransfer'),15,323),
--(1001568,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','1e145af5-047d-4544-8864-e225e8ea8444',NOW(),'Y','MOLI_PreImpNO','Pre Imp NO','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_PreImpNO'),10,323),
--(1001569,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','80cd0199-186b-4b54-bd7e-9ad73a0ce597',NOW(),'Y','MOLI_FsVoidStatus','Fs Void Status','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidStatus'),17,323),
--(1001570,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','d42226cc-6093-4edd-ba16-5bcb0cd7e55d',NOW(),'Y','MOLI_FsVoidMessage','Fs Void Message','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsVoidMessage'),10,323),
--(1001628,0,'N',0,'N','N','N',0,'N',4000,'N','N','N','Y','de7b647b-7ef6-4203-b788-c22ffa0f6ae9',NOW(),'Y','MOLI_FsMessage','Fs Message','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FsMessage'),10,323),
--(1001655,0,'N',0,'N','N','N',0,'N',60,'N','N','N','Y','ee6e2875-76cb-4581-8aea-a3d881334686',NOW(),'Y','MOLI_Transportista','Transportista','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Transportista'),10,323),
--(1001771,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','842c727d-1438-4200-9c40-f03163cf3f6b',NOW(),'Y','MOLI_FiscalDocumentNo','Fiscal Document NO','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_FiscalDocumentNo'),10,323),
--(1001772,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','5d6a4163-8771-4dfe-bd86-5599f311251f',NOW(),'Y','MOLI_LinkAuthId','Timbrado Asociado','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LinkAuthId'),10,323),
--(1001773,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','1ba2d46e-28c1-4183-9005-c4c494c8e0f3',NOW(),'Y','MOLI_LinkInvNo','Factura Asociado','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_LinkInvNo'),10,323),
--(1002063,0,'N',1,'N','N','N',0,'N',22,'N','N','N','Y','7b38a60f-a498-470d-a9a0-d25f6ef94b76',NOW(),'Y','M_PriceList_ID','Price List','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_PriceList_ID'),19,323),
--(1002962,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','4348063f-a52b-4e8c-a815-c21f3fe7752e',NOW(),'Y','MOLI_InvoiceReference','Invoice Reference','Y','Y',100,100,'N','Y',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_InvoiceReference'),10,323)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_MovementLine KO
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(53968,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','6f6afe56-0ca6-4dd6-9169-ae13b958cd21',NOW(),'Y','DD_OrderLine_ID','Distribution Order Line','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DD_OrderLine_ID'),19,324),
--(1001629,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','60a232c7-df69-4b89-a68c-c48755eef6ba',NOW(),'N','PriceEntered','Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceEntered'),37,324),
(1002057,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','5594522f-d6c9-4e63-b67f-60a69c1a2032',NOW(),'Y','PriceList','List Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceList'),37,324),
(1002058,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','2c49e61a-d8b2-4e31-b511-6500ea0d9a9c',NOW(),'N','PriceActual','Unit Price','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'PriceActual'),37,324),
(1002059,0,'N',0,'N','N','Y',3,'N',30,'N','N','N','Y','0dceb453-8a4e-40bb-95ca-c2bbd5c86b83',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,324),
(1002060,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','652b84de-8f0e-4ef1-84e4-6a283fe52416',NOW(),'N','UPC','UPC/EAN','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UPC'),10,324),
(1002061,10,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','b5d082cf-855c-4d18-88df-18966efc53a8',NOW(),'N','ProductName','Product Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductName'),10,324),
(1002152,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','07ff8cc0-1c48-4465-a202-d3cd6642507c',NOW(),'N','LineNetAmt','Line Amount','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LineNetAmt'),12,324)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
--M_PriceList OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001756,0,'N',0,'N','N','N',0,'N',10,'N','N','N','Y','e1485b04-af54-40d7-a95d-f3c8eaefb1a7',NOW(),'N','MOLI_M_PriceList_ID','M_PriceList(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_M_PriceList_ID'),11,255)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_Product OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(53408,0,'Y',0,'Y','N','N',0,'N',8,'N','N','N','Y','135d46c3-2a46-47bd-8707-422a8a51541c',NOW(),'Y','LowLevel','Low Level','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'LowLevel'),11,208),
(1001631,0,'Y',0,'N','N','N',0,'N',50,'N','N','N','Y','0db27462-855d-49f2-b7d7-545132abba8d',NOW(),'Y','MOLI_SyncPrefix','Sync Prefix','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_SyncPrefix'),10,208),
(1001712,20,'Y',1,'N','N','N',0,'N',22,'Y','N','N','Y','0929e5fe-5317-4546-860b-7aab647d4f6c',NOW(),'Y','MOLI_ProductBrand_ID','Product Brand','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),30,208),
(1001713,30,'Y',1,'N','N','N',0,'N',22,'Y','N','N','Y','05587095-a70e-4d17-8705-5052386f43ff',NOW(),'Y','MOLI_ProductLine_ID','Product Line','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductLine_ID'),19,208),
(1001714,40,'Y',1,'N','N','N',0,'N',22,'Y','N','N','Y','9f44fa15-699e-4ba7-848a-2020401d3312',NOW(),'Y','MOLI_HS_ID','Harmonized System','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_HS_ID'),30,208),
(1001755,0,'Y',0,'N','N','N',0,'N',10,'N','N','N','Y','0034acc0-5c01-4605-8c91-da7c3fbacdbf',NOW(),'N','MOLI_M_Product_ID','M_Product(ID)','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_M_Product_ID'),11,208),
(1002453,0,'Y',1,'N','N','N',0,'N',22,'N','N','N','Y','df207773-19a9-426e-9dcf-2147ea3714ae',NOW(),'Y','MOLI_ProductSize','Product Size','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductSize'),22,208),
(1002454,0,'Y',0,'N','N','N',0,'N',2,'N','N','N','Y','70518ae9-1f18-444c-91d6-d5b19df72de5',NOW(),'Y','MOLI_ProductSizeUOM','Product Size UOM','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductSizeUOM'),17,208),
(1003119,0,'Y',0,'Y','N','N',0,'N',1,'N','N','N','Y','f41156a6-9084-4147-8dbf-6f6199f13203',NOW(),'Y','MOLI_IsLocalVendor','Local Vendor','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsLocalVendor'),20,208),
(1003183,0,'N',1,'N','N','N',0,'N',255,'N','N','N','Y','53ebca62-2113-41c9-b961-278e48a02654',NOW(),'Y','MOLI_TagLabel','TagLabel','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TagLabel'),10,208),
(1003184,0,'N',1,'N','N','N',0,'N',2000,'N','N','N','Y','fde2f510-82d4-41b4-aec0-e3b4136352ed',NOW(),'Y','MOLI_TagLabelExt','TagLabel Extended','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_TagLabelExt'),14,208),
(1003308,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','02495830-5959-461e-9c68-6044dd34bc0f',NOW(),'Y','MOLI_ConfigurableSKU','Configurable SKU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ConfigurableSKU'),10,208),
(1003360,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','ecf122cf-1fb2-4c8a-bf61-2664a2ebdcd3',NOW(),'Y','MOLI_IsConsignment','Is Consignment','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsConsignment'),20,208)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_ProductPrice OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1003306,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','1ee41202-94d3-4ca9-8179-5f9cbbc6b5f5',NOW(),'N','MOLI_ProductBrand_ID','Product Brand','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ProductBrand_ID'),10,251)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_RMA OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001638,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','7522de23-9c0f-495e-9e16-df173c8aab04',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,661)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_RMALine OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1001639,0,'N',0,'N','N','N',0,'N',10000,'N','N','N','Y','e6b9887f-3cc2-4bb2-bc87-cc0d16bbce2e',NOW(),'Y','MOLI_Floreant_Data','Floreant Data','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_Floreant_Data'),14,660)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- M_Warehouse KO
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(54240,0,'N',0,'N','N','N',0,'N',1,'N','N','N','Y','e54d9fa8-48c3-4371-9f5e-fa3765d11864',NOW(),'Y','IsInTransit','In Transit','Y','Y',0,0,'N','N',0,0,NOW(),'EE01','N','N',NULL,( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsInTransit'),20,190)
-- (1001526,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','73ed6558-23dc-4480-a675-f4405cb590fb',NOW(),'N','MOLI_GeoRefCode_ID','Geo Ref Code ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_GeoRefCode_ID'),19,190)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- Regulation_Form_Line OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002233,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','35eaa553-4cb7-4e51-b7ba-c2bcc063c414',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000082),
(1002234,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','552935ee-a745-453c-8c5b-67f767f4b124',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000082),
(1002235,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','6a67ac83-d34d-4b9a-bc7a-2f6800a214c0',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000082),
(1002236,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','5aab4e46-0bf6-4619-8625-5dca208fab0b',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000082),
(1002237,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','176d0578-15e3-450c-919e-a104b2930b64',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000082),
(1002238,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','cd8421fe-335f-4e4b-963e-0faf96255af5',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000082),
(1002239,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','0ddb240a-0ae8-4890-86a3-c41ea6de6a4e',NOW(),'Y','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000082),
(1002240,0,'N',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','d87daedb-612d-435e-8145-9eb61d56d9f8',NOW(),'N','MOLI_RegFormLine_ID','Regulation Form Line','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormLine_ID'),13,1000082),
(1002241,0,'N',0.0,'N','N','N',0,'N',36,'N','N','N','Y','60c691fe-8e02-4212-b903-448743b19a0e',NOW(),'Y','MOLI_RegFormLine_UU','Regulation_Form_Line_UU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormLine_UU'),200231,1000082),
(1002242,10,'N',0.0,'N','N','N',0,'N',40,'Y','N','N','Y','d8be9f88-2a19-42be-a4fe-d32bbe594f02',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000082),
(1002243,20,'N',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','32c90aa0-179f-4116-a6b7-2138682aed34',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000082),
(1002244,0,'N',0.0,'N','N','N',0,'N',255,'N','N','N','Y','3d95f637-9ef4-4820-ac7c-b0eb61c73091',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000082),
(1002270,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','a6af0e50-c11a-4310-ac8e-a74059b9e841',NOW(),'Y','MOLI_ActionRequired','Accion Requerida','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_ActionRequired'),20,1000082),
(1002271,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','8b14f199-67cd-44ba-937e-d4cf510191ff',NOW(),'Y','MOLI_DateCDAR','Fecah CDAR','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCDAR'),16,1000082),
(1002272,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','89149f65-aeb8-49fd-ba58-b6edbfbf6363',NOW(),'Y','MOLI_DateCLV','Fecha CLV','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCLV'),16,1000082),
(1002273,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','e618a2d4-fc39-4d4a-99f0-11f6a3340edf',NOW(),'Y','MOLI_DateCP','Fecha CP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateCP'),16,1000082),
(1002274,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','eccf37f0-aa0f-4f58-b630-b8338e178ded',NOW(),'Y','MOLI_DateFormula','Fecha Formula','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateFormula'),16,1000082),
(1002275,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','f26e8589-59ad-41e2-90b0-c34bd83f2bdb',NOW(),'Y','MOLI_DateGMP','Fecha GMP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateGMP'),16,1000082),
(1002276,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','ef3aef64-2eca-4b3c-aa25-07e8a35a0daa',NOW(),'Y','MOLI_DateKBIS','Fecha KBISS','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_DateKBIS'),16,1000082),
(1002277,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','5305143a-02e3-4148-961a-9b292d8aedfe',NOW(),'Y','MOLI_IsCartaPoder','Es carta Poder','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCartaPoder'),20,1000082),
(1002278,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','86ea6e90-bcb5-4fd1-91b5-62f225f4ca04',NOW(),'Y','MOLI_IsCDAR','Es CDAR','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCDAR'),20,1000082),
(1002279,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','1871e0ee-d76f-46bc-ab1a-59cde8b4a1b4',NOW(),'Y','MOLI_IsCLV','Es CLV','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsCLV'),20,1000082),
(1002280,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','8d622981-ff9a-4b23-8c4b-d5e5c85e8b3e',NOW(),'Y','MOLI_IsFormula','Es Formula','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsFormula'),20,1000082),
(1002281,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','e12441b8-3973-4176-b9f7-7ca93e9f261b',NOW(),'Y','MOLI_IsGMP','Es GMP','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsGMP'),20,1000082),
(1002282,0,'N',0,'Y','N','N',0,'N',1,'N','N','N','Y','33e68330-166d-4eca-afc0-ded7aa16866b',NOW(),'Y','MOLI_IsKBIS','Es KBISS','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_IsKBIS'),20,1000082),
(1002283,0,'N',0,'Y','N','N',0,'Y',22,'N','N','N','Y','b34e2af1-d7e9-4f5c-b53c-0dd7c52c0cd3',NOW(),'N','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),30,1000082),
(1002284,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','31fc2672-46c5-499f-ba77-8b8c4f309e93',NOW(),'Y','MOLI_RgmStatus','Rgm Status','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RgmStatus'),17,1000082),
(1002285,0,'N',0,'N','N','N',0,'N',2,'N','N','N','Y','a71655a3-43a4-4152-90f8-9b4f295578ff',NOW(),'Y','MOLI_StatusType','Tipo de Estado','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_StatusType'),17,1000082),
(1002326,0,'N',0,'N','N','N',0,'N',7,'N','N','N','Y','9bae1a87-2222-427b-a2f0-f7daac4d4d7d',NOW(),'Y','Date1','Date','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Date1'),15,1000082)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
-- Table
-- Regulation_Form_Product OK
INSERT INTO AD_Column (
AD_Column_ID, SeqNoSelection, IsSyncDatabase, Version, IsMandatory, IsTranslated, IsIdentifier, SeqNo, IsParent, FieldLength, IsSelectionColumn, IsKey, IsAutocomplete, IsAllowLogging, AD_Column_UU, Updated, IsUpdateable, ColumnName,
Name, IsAllowCopy, IsActive, CreatedBy, UpdatedBy, IsToolbarButton, IsAlwaysUpdateable, AD_Client_ID, AD_Org_ID, Created, EntityType, IsEncrypted, IsSecure, FKConstraintType, AD_Element_ID, AD_Reference_ID, AD_Table_ID
)
VALUES
(1002248,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','e95fd611-1d05-4ac3-a018-60f32d2ab4ef',NOW(),'N','AD_Client_ID','Tenant','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Client_ID'),30,1000083),
(1002249,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','df3f5008-6cea-4859-82e3-97ed20024ce7',NOW(),'N','AD_Org_ID','Organization','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_Org_ID'),19,1000083),
(1002250,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','51980108-3f15-4d0a-9666-937f750703c6',NOW(),'N','Created','Created','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Created'),16,1000083),
(1002251,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','48527be0-0f45-400c-aaf2-98b0a99aa841',NOW(),'N','CreatedBy','Created By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CreatedBy'),30,1000083),
(1002252,0,'N',0.0,'Y','N','N',0,'N',7,'N','N','N','Y','e8606d5f-0655-46c1-b16d-139dfbb56daa',NOW(),'N','Updated','Updated','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Updated'),16,1000083),
(1002253,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','dd59b2f8-fccb-41fc-ae21-2b7c84ec772b',NOW(),'N','UpdatedBy','Updated By','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'UpdatedBy'),30,1000083),
(1002254,0,'N',0.0,'Y','N','N',0,'N',1,'N','N','N','Y','b988e015-e95f-4b9c-8763-3f101bd7b895',NOW(),'Y','IsActive','Active','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'IsActive'),20,1000083),
(1002255,0,'N',0.0,'Y','N','N',0,'N',22,'N','Y','N','Y','9a338ebe-8970-4323-8370-a611e2015796',NOW(),'N','MOLI_RegFormProduct_ID','Regulation Form Product','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormProduct_ID'),13,1000083),
(1002256,0,'N',0.0,'N','N','N',0,'N',36,'N','N','N','Y','ce39f803-526b-41d3-8846-5971f7c8f583',NOW(),'Y','MOLI_RegFormProduct_ID_UU','Regulation_Form_Product_UU','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegFormProduct_ID_UU'),200231,1000083),
(1002257,10,'N',0.0,'N','N','N',0,'N',40,'Y','N','N','Y','a31d17fc-f076-4458-a4e3-71ed4e320aa2',NOW(),'Y','Value','Search Key','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Value'),10,1000083),
(1002258,20,'N',0.0,'Y','N','Y',0,'N',60,'Y','N','N','Y','8cb5723e-217a-4dbe-89c6-02f3b62ca2ce',NOW(),'Y','Name','Name','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name'),10,1000083),
(1002259,0,'N',0.0,'N','N','N',0,'N',255,'N','N','N','Y','76a9abdb-4b9a-4bf0-9dc1-cccf586c586b',NOW(),'Y','Description','Description','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Description'),10,1000083),
(1002260,30,'N',0.0,'N','N','N',0,'N',30,'Y','N','N','Y','94bf431d-6e71-417f-9b53-7eafd6212e61',NOW(),'Y','DocumentNo','Document No','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'DocumentNo'),10,1000083),
(1002261,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','39a0ab2f-9328-4050-9184-12813dfb4c01',NOW(),'Y','SalesRep_ID','Sales Representative','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SalesRep_ID'),30,1000083),
(1002262,0,'N',0.0,'Y','N','N',0,'N',10,'N','N','N','Y','5c3d05ef-a694-403f-b794-f5a7c8b6c21d',NOW(),'Y','AD_User_ID','User/Contact','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'AD_User_ID'),30,1000083),
(1002263,40,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','a346ec99-bdbf-4e09-b362-811b3838e5ab',NOW(),'N','CategoryName','Category Name','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'CategoryName'),10,1000083),
(1002265,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','d06751a7-d514-47e6-ba7c-15da6204a92f',NOW(),'Y','MOLI_RegForm_ID','Regulation Form ID','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'MOLI_RegForm_ID'),30,1000083),
(1002266,0,'N',0,'N','N','N',0,'N',22,'N','N','N','Y','a3849894-6715-4e4d-bbf4-efd1b0549508',NOW(),'Y','M_Product_ID','Product','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'M_Product_ID'),30,1000083),
(1002267,50,'N',0,'N','N','N',0,'N',60,'Y','N','N','Y','1b83ac77-474d-4aaa-9b47-3a0ad396b213',NOW(),'N','Name2','Name 2','Y','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'Name2'),10,1000083),
(1002268,0,'N',0,'N','N','N',0,'N',40,'N','N','N','Y','80d2a845-c3c5-4d6a-8160-0bd909c97abc',NOW(),'N','ProductBrand_Value','ProductBrand  Key','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'ProductBrand_Value'),10,1000083),
(1002269,0,'N',0,'N','N','N',0,'N',30,'N','N','N','Y','0e2b312e-f812-4d9a-bb6d-4790584f3795',NOW(),'N','SKU','SKU','N','Y',100,100,'N','N',0,0,NOW(),'U','N','N','N',( SELECT AD_Element_ID FROM AD_Element WHERE columnname = 'SKU'),10,1000083)
ON CONFLICT (AD_Column_UU)
DO UPDATE SET
        Name                = EXCLUDED.Name,
    ColumnName          = EXCLUDED.ColumnName,
    IsMandatory         = EXCLUDED.IsMandatory,
    IsUpdateable        = EXCLUDED.IsUpdateable,
    IsAlwaysUpdateable  = EXCLUDED.IsAlwaysUpdateable,
    IsIdentifier        = EXCLUDED.IsIdentifier,
    IsSelectionColumn   = EXCLUDED.IsSelectionColumn,
    IsActive            = EXCLUDED.IsActive,
    Updated             = NOW(),
    UpdatedBy           = 100;
--
-- EOF
--
-- 
-- SEQUENCE
-- UPDATES SEquence for AD_Table
UPDATE AD_Sequence
SET CurrentNext = (
    SELECT MAX(AD_Column_ID) + 1
    FROM AD_Column
)
WHERE Name = 'AD_Column';
--
-- EOF
--