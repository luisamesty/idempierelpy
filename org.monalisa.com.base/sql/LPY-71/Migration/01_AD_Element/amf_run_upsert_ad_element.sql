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