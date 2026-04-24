## M_Movement

Al revisar el recuento total de las filas (71 frente a 47), se observa que la diferencia es de **24 campos adicionales** en el archivo nuevo. Los que te mencioné anteriormente son los más destacados por su funcionalidad, pero aquí tienes la lista completa y detallada de todos los campos que aparecen en la versión **M_Movement_MOLI** y que no están en la **STD**:

### Campos de Identificadores Universales (UUID)
Estos campos terminados en `_UU` son esenciales para la portabilidad de datos en iDempiere:
* **AD_Org_ID_UU**
* **AD_Table_ID_UU**
* **C_DocType_ID_UU**
* **Created_UU**
* **Updated_UU**
* **M_Movement_ID_UU**
* **M_Warehouse_ID_UU**
* **M_WarehouseTo_ID_UU**
* **C_Project_ID_UU**
* **C_Activity_ID_UU**
* **C_Campaign_ID_UU**
* **AD_User_ID_UU**
* **C_BPartner_ID_UU**
* **User1_ID_UU**
* **User2_ID_UU**

### Campos de Funcionalidad "MOLI" (Personalizados)
Estos campos gestionan procesos específicos de comunicación y control interno:
* **MOLI_SendMail**: Control de activación para correos.
* **MOLI_StatusMail**: Registro del estado del envío.
* **MOLI_In_Out**: Dirección del flujo del material.
* **MOLI_IsConsolidated**: Flag de consolidación de registros.
* **MOLI_Production_ID**: Enlace con órdenes de producción.
* **MOLI_Production_ID_UU**: UUID de la orden de producción.

### Campos de Referencia y Auditoría Adicionales
* **AD_User_ID**: Usuario responsable asociado.
* **C_BPartner_ID**: Tercero (Socio de Negocio) asociado al movimiento.
* **C_Project_ID**: Enlace a un proyecto específico.

---

**Análisis de la diferencia:**
La versión **MOLI** está mucho más preparada para entornos de **sincronización de datos** (debido a los UUIDs) y tiene una integración más profunda con el módulo de **Producción** y **Notificaciones Automáticas** que la versión estándar de iDempiere.