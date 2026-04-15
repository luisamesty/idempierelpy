-- AD_Reference_All
-- JSON
INSERT INTO AD_Reference (
    AD_Client_ID,  AD_Org_ID, IsActive, Created, CreatedBy, Updated, UpdatedBy, Name, ValidationType, EntityType, 
    AD_Reference_ID, AD_Reference_UU
)
VALUES (
    0,   0,  'Y', NOW(), 100, NOW(), 100,  'JSON',  'D',   'U', 200267, 'b6fcc751-edd8-4421-acd0-3cde02a9576d'
)
ON CONFLICT (Name)
DO UPDATE SET
    IsActive = 'Y',
    Updated = NOW(),
    UpdatedBy = 100,
    AD_Reference_ID = 200267,
    AD_Reference_UU='b6fcc751-edd8-4421-acd0-3cde02a9576d';
--    
-- UPDATES SEquence for AD_Reference
UPDATE AD_Sequence
SET CurrentNext = (
    SELECT MAX(AD_Reference_ID) + 1
    FROM AD_Reference
)
WHERE Name = 'AD_Reference';