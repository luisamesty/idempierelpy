# LPY-71 Actualizar los modelo de todas las tablas con campos MOLI o similares

Proyecto idempiereLPY, Tarea LPY-71 Actualizar los modelo de todas las tablas con campos MOLI o similares, utilizados como ampliación de funciones específicas a las aplicaciones  de  la adaptación al grupo de empresas Monalisa.

Se evalua hacer Packs inicialmente.
Luego de varios intentos con los Packs de las tablas y ventanas de compiere que utilizan campos MOLI. Se decide hacer por la vía de Migraciones con Querys SQL.


## Orden correcto para Migración 

### 1️⃣ AD_Element

AD_Element ✔️ Primero siempre

Distinguimos dos tipos:

- Tablas Compiere que utilizan campos nuevos MOLI.
	Ver archivos AD_Element_Compiere y AD_Element_MOLI
- Tablas MOLI.
    Ver archivos AD_Element_MOLI

Para poder actualizar se toman los valores de la BBDD Monalisa y el análisis hecho en la Hoja Excel y la query para determinar los campos nuevos.

[MOLI_Tables_Fields.xlsx](MOLI_Tables_Fields.xlsx)
[MOLI_Tables_Fields.sql](MOLI_Tables_Fields.sql)

Se elaboran una funcion y un procedimiento en BBDD, que permite hacer UPDATE o INSERTAR si no exite el registro de los Elementos nuevos.

Ambos se incluyen en el Script de migración **`20260422_001_LPY-71.sql`**

- Migration/AD_Element/amf_upsert_ad_element.sql
- Migration/AD_Element/amf_run_upsert_ad_element.sql

Se elaboran dos script utilizando:

AD_Element_MOLI.sql

- AD_Element_Compiere_UPSERTS.sql
- AD_Element_MOLI_UPSERTS.sql

Ambos generan dos scripts de migración 

- **`20260422_002_LPY-71.sql`**
- **`20260422_003_LPY-71.sql`**

---

### 2️⃣ AD_Reference + AD_Val_Rule (nivel base de metadatos)

#### AD_Reference

AD_Reference

Se evalúan las nuevas referecias con la Query **`AD_Reference_All.sql`**
Encontrandose solamente una Refrencia (JSON)

Se ignoran las referencias segun la query **AD_Reference_STD.sql`** que se ejecuta en una BBDD Seed.

La query **`AD_Reference_UPSERTS.sql`** Actualiza o inserta el registro.

Se incluye en el script de migración 20260422_004_LPY-71.sql

#### AD_Val_Rule

AD_Val_Rule

✔️ Matiz importante:

**Deben existir antes de ser usadas por columnas**

La query **`AD_Val_Rule_STD.sql`** La query se ejecuta en una BDDD Seed para determinar las que se ignoran. 
La query **`AD_Val_Rule_All.sql`** devuelve la que hay que incluir.

El fichero **`AD_Val_Rule_All.csv`** contiene las que hay que incluir.

La query  **`AD_Val_Rule_UPSERTS.sql`** Actualiza o inserta los registros

Se incluye en el script de migración 20260422_004_LPY-71.sql

---

### 3️⃣ AD_Table

AD_Table
✔️ Define la estructura base

Tablas:
- AD_Table_All.csv
- AD_Table_ALL.sql

Create UPSERTS

- AD_Table_All_Create_UPSERTS.sql
- AD_Table_UPSERTS.sql

La Query AD_Table_UPSERTS.sql se agrega a 

---

### 4️⃣ AD_Column

AD_Column
✔️ Consume todo lo anterior:

* AD_Table ✔️
* AD_Reference ✔️
* AD_Val_Rule ✔️

---


## 🧭 UI Interface / Tab / Field

** EN DESARROLLO **

En iDempiere la UI del diccionario sigue esta cadena:

```text
AD_Window
   ↓
AD_Tab
   ↓
AD_Field
```

---

### 1️⃣ AD_Window (** EN DESARROLLO **)

AD_Window

👉 Es el contenedor principal

* Define la pantalla
* No tiene columnas aún
* Solo estructura

✔️ Depende indirectamente de:

* AD_Table (porque los tabs apuntan a tablas)

---

## 2️⃣ AD_Tab (** EN DESARROLLO **)

AD_Tab

👉 Aquí se conecta la ventana con los datos

* Cada tab apunta a una `AD_Table`
* Define qué registros se muestran
* Maneja filtros, secuencia, transacciones

✔️ Depende de:

* AD_Window ✔️
* AD_Table ✔️

---

## 3️⃣ AD_Field (** EN DESARROLLO **)

AD_Field

👉 Es la capa visual de las columnas

* Cada field apunta a una `AD_Column`
* Define cómo se ve el dato en pantalla
* Orden, read-only, display logic, etc.

✔️ Depende de:

* AD_Tab ✔️
* AD_Column ✔️

---

## 🧠 Orden correcto completo (ya con UI)

Ahora sí, el flujo completo correcto queda así:

```text
1. AD_Element
2. AD_Reference
3. AD_Val_Rule
4. AD_Table
5. AD_Column
6. AD_Window
7. AD_Tab
8. AD_Field
```

---

# 🔥 Regla clave (muy importante en iDempiere)

👉 El UI siempre está “encima” del modelo de datos

| Nivel            | Qué representa |
| ---------------- | -------------- |
| Element          | concepto       |
| Table/Column     | datos          |
| Window/Tab/Field | interfaz       |

---

## 🚀 Resumen final claro

✔ UI siempre después del modelo de datos:

```text id="m7xq9p"
AD_Element
AD_Reference
AD_Val_Rule
AD_Table
AD_Column
→ AD_Window
→ AD_Tab
→ AD_Field
```

---

