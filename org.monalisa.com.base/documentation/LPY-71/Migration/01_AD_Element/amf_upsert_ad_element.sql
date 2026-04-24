-- DROP FUNCTION adempiere.amf_upsert_ad_element(varchar, varchar, varchar, varchar, varchar, varchar, varchar);

CREATE OR REPLACE FUNCTION adempiere.amf_upsert_ad_element(p_columnname character varying, p_ad_element_uu character varying, p_name character varying DEFAULT NULL::character varying, p_printname character varying DEFAULT NULL::character varying, p_description character varying DEFAULT NULL::character varying, p_help character varying DEFAULT NULL::character varying, p_entitytype character varying DEFAULT 'U'::character varying)
 RETURNS void
 LANGUAGE plpgsql
AS $function$
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
                SELECT MAX(AD_Element_ID) +1
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
END;
$function$
;
