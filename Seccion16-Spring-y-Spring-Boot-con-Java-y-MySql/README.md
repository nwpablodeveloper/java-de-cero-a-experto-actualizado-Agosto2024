# Sección 16: Spring y Spring Boot con Java y MySql
* [V237 Demo Zona Fit](V237_Demo_Zona_Fit/Docs/Arquitectura.jpg)
* [V238 Introducción a Spring Boot](V238_Introduccion_a_Spring_y_Spring_Boot/Docs/)
    * [Spring Frameworks](V238_Introduccion_a_Spring_y_Spring_Boot/Docs/introduccion_Spring.jpg)
    * [Spring Frameworks](V238_Introduccion_a_Spring_y_Spring_Boot/Docs/spring-boot.jpg)
* [V239 Creación Proyecto con Spring y Spring boot](239_Creación_Proyecto_con_Spring_y_Spring_Boot)
    - Vamos al siguiente link y configuramos el Framwork
    * [Spring Initiazlizr](https://start.spring.io/)
        - MAVEN - Para administrar facilmente nuestras librerias
        - Lenguaje - Java
        - Versión por default
        - Enpaquetemiento de tipo "JAR" - por que es una App de Consola
        - Versión de Java mas reciente
    * Dependencias
        - JPA - Spring Data JPA - Nos va a permitir establecer la conexión con la DB
        - MySql Driver
        - Lombok - Esta libreria reduce el código repetitivo
* [V240 Abrir proyecto de Spring con IntellijIDEA]()
    * Invalidate Caches del IDE
* [V241 Configuracion Inicial Proyecto Zona Fita](V241_Configuracion_Inicial_Proyecto_Zona_Fita)
    - [Configurar Base de datos](V241_Configuracion_Inicial_Proyecto_Zona_Fita/src/main/resources/application.properties)
    - [Este archivo evita enviar mucha info a la consola](V241_Configuracion_Inicial_Proyecto_Zona_Fita/src/main/resources/logback-spring.xml)
* [V242 Arquitectura con Spring Framework]()
* [V243 Creacion de la Clase de Entidad de Cliente con JPA](V243_Creacion_de_la_Clase_de_Entidad_de_Cliente_con_JPA)
    * [Clase Cliente con Jakarta y Lombok](V243_Creacion_de_la_Clase_de_Entidad_de_Cliente_con_JPA/src/main/java/gm/zona_fit/modelo/Cliente.java)
    - Jakarta Genera la identidad de la Clase para guardar en la Base de Datos
    - Lombok - Ahorra código generando de forma automatica
* [V244 Cracon Interface de Repositorio de Cliente Con Spring](V244_Cracon_Interface_de_Repositorio_de_Cliente_Con_Spring/src/main/java/gm/zona_fit/repositorio/ClienteRepositorio.java)
    - Paquete de repositorio - Spring lo pide
    * [Clase Repositorio para el tipo Cliente](V244_Cracon_Interface_de_Repositorio_de_Cliente_Con_Spring/src/main/java/gm/zona_fit/repositorio/ClienteRepositorio.java)
        - Esta Clase te genera los metodos necesario para hacer un CRUD
            Con la entidad a trabajar (en este Claso la Entidad Cliente)
* [V255 Creacion Interface de ClienteServicio](V245_Creacion_Interface_de_ClienteServicio/src/main/java/gm/zona_fit/servicio/IClienteServicio.java)
* [V246 Creacion Clase ClienteServicio con Spring](V246_Creacion_Clase_ClineteServicio_con_Spring/src/main/java/gm/zona_fit/servicio/ClienteServicio.java)
* [V247]()
    - Instalar Pluging de Lombok
        - Settings -> Plugins
* [V248 clase Presentacion Zona Fit](V248_clase_Presentacion_Zona_Fit/src/main/java/gm/zona_fit/ZonaFitApplication.java)
* [V249 Menu App Zona Fit con Spring](V249_Menu_App_Zona_Fit_con_Spring/src/main/java/gm/zona_fit/ZonaFitApplication.java)

[Volver](../)