
&lArr;[Install PostgreSQL 15](./InstallPostgreSQL.md) | | [Installing CentOS](./README_installCentOS.md) | [Install JAVA OpenJDK17 ](./Install_JAVA_OpenJDK17.md) &rArr;

#### DATABASE MACHINE
Install on the machine that runs the database manager.

````
ssh root@maquina-postgresql.com -p 22
````
##### Execute Postgres 
Execute postgres on the machine that runs the database manager.
<div style="padding-left: 20px;">

````
OS Command:
$ sudo psql -p 5432 postgres -U postgres
password user postgres: PostgreSQLPassword 	# Enter postgres password
````
</div>

##### CREATE ROLE
Create idempiere role and any other if necessary.
<div style="padding-left: 20px;">

````
Postgres Commands:
# CREATE ROLE adempiere SUPERUSER LOGIN PASSWORD 'adempiere';
# CREATE ROLE luisamesty SUPERUSER LOGIN PASSWORD '5167830';
````
</div>

##### CREATE Database: idempiereSeed11
Create Database entity (idempiereSeed11). It is created empty. 
<div style="padding-left: 20px;">
DROP IF NECESSARY ONLY

````
Postgres Commands:
# DROP DATABASE "idempiereSeed11";

# CREATE DATABASE "idempiereSeed11"
    WITH 
    OWNER = adempiere
    ENCODING = 'UTF8'
   TABLESPACE = pg_default
    CONNECTION LIMIT = -1;

# ALTER DATABASE "idempiereSeed11"
    SET search_path TO adempiere;   
````
</div>

##### EXIT Postgres
<div style="padding-left: 20px;">
DROP IF NECESSARY ONLY

````
Postgres Commands:
# \q
````
</div>

##### IMPORT DATABASE idempiereSeed11 FROM Adempiere_pg.jar 

* Locate in: sources/iDempiere11/idempiere/org.adempiere.server-feature/data/seed
* Unzip Adempiere_pg.jar from /home/Adempiere_pg.jar to Adempiere_pg.dmp

<div style="padding-left: 20px;">

````
$ cd /home
$ ls -l
total 53488
-rw-r--r--. 1 root root 44945504 Mar 21 10:05 Adempiere_pg.dmp
-rw-r--r--. 1 root root  9818290 Mar 21 09:08 Adempiere_pg.jar
-- EXECUTE POSTGRES COMMAND
$ psql -d idempiereSeed11 -U adempiere -f Adempiere_pg.dmp
password user adempiere: adempiere 
````
</div>

DATABASE IS CREATED

VERIFY Database is created with pgadmin4
Schema: adempiere should be created with 899 tables, 160 Views, 70 Functions.

</div>
