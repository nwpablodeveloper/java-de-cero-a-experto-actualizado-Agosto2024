# Sección 15: Conexión a Base de Datos con Java JDBC y MySql
* [V211 Introducción a las Bases de Datos](V211_Introducción_a_las_Bases_de_Datos)
    - Una base de datos nos permite almacenar información, de manera organizada en forma de tablas,
        agregando relaciones entre ellas.
    - Para usar una base de datos (DB - DATA BASE), se utiliza un gestor de base de datos.
        (DBMS - Data Base Managment System)
    - Con Java podemos trabajar con la información de varias bases de datos, como:
        * PostgreSql
        * MySqul
        * Oracle
        * Sql Server
        * etc
    - SQL (Structured Query Languge, es un lenguaje utilizado para consultar o
        manipular la información de una DB.
    - Las sentencias que utilizaremos más frecuentemente para manipular la información
        de una DB son:
        * SELECT -> Selecciona la información
        * INSERT -> Agrega información
        * UDATE -> Actualiza información
        * DELETE -> Eliminar Información
* [V212 Demo App de Zona Fit con Java JDBC y MySql](V212_Demo_Aplicacion_de_Zona_Fit_con_JavaJDBC_y_MySql)   
    * [Capas de la App.](V212_Demo_Aplicacion_de_Zona_Fit_con_JavaJDBC_y_MySql/aplicacion.jpg)
    * [Demo de la App](V212_Demo_Aplicacion_de_Zona_Fit_con_JavaJDBC_y_MySql/demo1.jpg)
        * [1. listar clientes](V212_Demo_Aplicacion_de_Zona_Fit_con_JavaJDBC_y_MySql/listar-clientes.jpg)
* [V213 Instalación de MySql]()
    * [Download Community Server](https://dev.mysql.com/downloads/mysql/8.0.html)
    - Schema o Base de Datos es lo mismo
* [V214 Cración de la Tabla Cliente](V214_Creacion_de_la_Tabla_Cliente_de_la_App_Zona_Fit/tabla-cliente.jpg)
    - Crear Schema (Base de Datos)
        > Click derecho y New Schema (tambien desde el icono DB con el +)
        ```sql
            -- Crando una base de datos llamada "zona_fit_db"
            CREATE SCHEMA `zona_fit_db` ;
        ```
        > Set as defoult Schema (para seleccionar como db por defecto)
    - [Create Table (Tables de la db)](V214_Creacion_de_la_Tabla_Cliente_de_la_App_Zona_Fit/tabla-clientes.sql)
    ```sql
        -- SELECT * FROM zona_fit_db.clientes;
        -- No es necesario indicar la DB si ya estamos conectados a la misma
        SELECT * FROM clientes;
    ```
       

[Volver](../)