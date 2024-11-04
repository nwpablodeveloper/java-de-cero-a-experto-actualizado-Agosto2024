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
* [V215 Sentencia SELECT e INSERT en MySql](V215_Sentencia_SELECT_e_INSERT_en_MySql)
    * [select.sql](V215_Sentencia_SELECT_e_INSERT_en_MySql/select.sql)
    * [insert.sql](V215_Sentencia_SELECT_e_INSERT_en_MySql/insert.sql)
* [V216 Sentencias UPDATE y DELETE en MySql](V216_Sentencias_UPDATE_y_DELETE_en_MySql)
    * [update.sql](V216_Sentencias_UPDATE_y_DELETE_en_MySql/update.sql)
    * [delete.sql](V216_Sentencias_UPDATE_y_DELETE_en_MySql/delete.sql)
* [V217 Creación de la Aplicación Zona Fit con Java y Maven](V217_Creacion_de_la_Aplicacion_Zona_fit_con_Java_y_Maven)
    - Creamos el proyecto con Maven
    - Directorio: 
        - resources -> sirve para poner contenido estatico como imagenes
        - java -> Código fuente
        - test -> para las pruebas de nuestra App.
    - [pom.xml - Archivo para administrar las librerias](V217_Creacion_de_la_Aplicacion_Zona_fit_con_Java_y_Maven/pom.xml)
    ```xml
        <dependencies>
            <dependency>
                <groupId>com.mysql</groupId>
                <artifactId>mysql-connector-j</artifactId>
                <version>8.0.33</version>
            </dependency>
        </dependencies>
    ```
> [!WARNING]  
> 1. Agragar la dependencia de MySql
> 2. Luego click en el icono de Maven (barra lateral derecha)
> 3. Reload All Maven
* [V218 Clase de Conexión a la Base de Datos](V218_Clase_de_Conexion_a_la_Base_de_Datos_con_Java_JDBC/src/main/java/zona_fit/conexion/Conexion.java)
    - Crear un objeto de tipo Conexión
* [V219 Creación de la Clase de Dominio](V219_Creacion_Clase_de_Dominio/src/main/java/zona_fit/dominio/Cliente.java)
* [V220 Patrón de diseño DAO](V220_Patron_de_Disenio_DAO/Docs/patron-de-disenio-DAO.jpg)
* [V221 Interface de Cliente DAO](V221_Interface_Cliente_DAO/src/main/java/zona_fit/datos)
    * [IClienteDAO](V221_Interface_Cliente_DAO/src/main/java/zona_fit/datos/IClienteDAO.java)
    * [ClienteDAO](V221_Interface_Cliente_DAO/src/main/java/zona_fit/datos/ClienteDAO.java)
* [V222 Listar Clientes desde la DB](V222_Listar_Clientes/src/main/java/zona_fit/datos/ClienteDAO.java)
    - Interface PreparedStatement - Evita inyección de SQL. Támbin nos va ayudar a preparar la sentencia SQL
    - Interface ResultSet - Guarda los datos obtenido de una DB y nos deja navegar por filas en ellos
* [V223 Prueba Listar Clientes - psvm](V222_Listar_Clientes/src/main/java/zona_fit/datos/ClienteDAO.java)
* [V224 Buscar Cliente por ID en la DB](V224_Buscar_Cliente_por_Id/src/main/java/zona_fit/datos/ClienteDAO.java)
* [V225 Agregar Cliente a la DB]()


[Volver](../)