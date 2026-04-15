
-- 20260422_001_LPY-71.sql
-- Creates FUNCTION amf_upsert_ad_element
-- Creates PROCEDURE amf_run_upsert_ad_element

-- amf_upsert_ad_element
CREATE OR REPLACE FUNCTION amf_upsert_ad_element(
    p_columnname    VARCHAR,
    p_ad_element_uu VARCHAR,
    p_name          VARCHAR DEFAULT NULL,
    p_printname     VARCHAR DEFAULT NULL,
    p_description   VARCHAR DEFAULT NULL,
    p_help          VARCHAR DEFAULT NULL,
    p_entitytype    VARCHAR DEFAULT 'U'
)
RETURNS VOID AS
$$
DECLARE
    v_id NUMERIC;
BEGIN
    -- 1. Buscar por UUID
    SELECT AD_Element_ID
    INTO v_id
    FROM AD_Element
    WHERE AD_Element_UU = p_ad_element_uu;

    IF v_id IS NOT NULL THEN
        -- UPDATE por UUID
        UPDATE AD_Element
        SET
            ColumnName = p_columnname,
            Name = COALESCE(p_name, Name),
            PrintName = COALESCE(p_printname, PrintName),
            Description = COALESCE(p_description, Description),
            Help = COALESCE(p_help, Help),
            EntityType = p_entitytype,
            Updated = NOW()
        WHERE AD_Element_ID = v_id;

    ELSE
        -- 2. Buscar por ColumnName (evitar duplicados)
        SELECT AD_Element_ID
        INTO v_id
        FROM AD_Element
        WHERE ColumnName = p_columnname;

        IF v_id IS NOT NULL THEN
            -- Reutilizar registro existente
            UPDATE AD_Element
            SET
                AD_Element_UU = p_ad_element_uu,
                EntityType = p_entitytype,
                Updated = NOW()
            WHERE AD_Element_ID = v_id;

        ELSE
			-- BUSCA EL SIGUIENTE
                SELECT MAX(AD_Element_ID)
		        INTO v_id
        		FROM AD_Element;
			-- INSERT sin ID (usa secuencia automática)
            INSERT INTO AD_Element (
				AD_Element_ID,
                AD_Client_ID,
                AD_Org_ID,
                IsActive,
                Created,
                CreatedBy,
                Updated,
                UpdatedBy,
                ColumnName,
                Name,
                PrintName,
                Description,
                Help,
                EntityType,
                AD_Element_UU
            )
            VALUES (
				v_id,
                0,
                0,
                'Y',
                NOW(),
                100,
                NOW(),
                100,
                p_columnname,
                COALESCE(p_name, p_columnname),
                COALESCE(p_printname, p_columnname),
                p_description,
                p_help,
                p_entitytype,
                p_ad_element_uu
            );
        END IF;
    END IF;
	COMMIT;
END;


-- Eliminar si ya existe para evitar conflictos al recrear
DROP PROCEDURE IF EXISTS amf_run_upsert_ad_element;

CREATE OR REPLACE PROCEDURE amf_run_upsert_ad_element(
    p_columnname    VARCHAR,
    p_ad_element_uu VARCHAR,
    p_name          VARCHAR DEFAULT NULL,
    p_printname     VARCHAR DEFAULT NULL,
    p_description   VARCHAR DEFAULT NULL,
    p_help          VARCHAR DEFAULT NULL,
    p_entitytype    VARCHAR DEFAULT 'U'
)
LANGUAGE plpgsql
AS $$
BEGIN
    -- Ejecutar la lógica de inserción/actualización
    PERFORM amf_upsert_ad_element(
        p_columnname,
        p_ad_element_uu,
        p_name,
        p_printname,
        p_description,
        p_help,
        p_entitytype
    );

    -- Confirmar los cambios
    COMMIT;
END;
$$; 