Sección 17: Aplicaciones de Escritorio (GUI) con Swing y Java
* [V253 Introducción a Swing](V253_Introduccion_a_Swing)
    - Java Swing es una libreria de Java para crear aplicaciones gráficas GUI
        (Graphical User Interface) o también conocidas como aplicaciones
        de escritorio
    - [Con Swing podemos aplicar el patrón de diseño MVC | Modelo - Vista - Controlador|](V253_Introduccion_a_Swing/introduccion-swing.jpg)
        * Vista -> Formulario con los componentes visuales
        * Modelo -> Clases de Dominio del problema
        * Controlador -> Clase de con la funcionalidad de la aplicación
    - [Componentes Swing](V253_Introduccion_a_Swing/componentes.jpg)
        * JFrame -> Es el componente principal 
        * Jpanel -> Esta detro de un JFrame 
        * JButon, JTextFieldName, JPassword, etc. -> Estan dentron de un JPanel
* [V254 V254 Creacion Aplicacion con Swing](V254_Creacion_Aplicacion_con_Swing)
    1. Crear Proyecto
    2. Dentro del directorio main->java - New->Swing UI Designer->GUI Form
    * [Formulario App](V254_Creacion_Aplicacion_con_Swing/src/main/java/Forma.form)
    * [Controlador del Form](V254_Creacion_Aplicacion_con_Swing/src/main/java/Forma.java)
* [V255 Agregar Modo oscuro a la App de Swing]()
    - Agregar dependencias de estilos pom.xml
 ```
    <dependencies>
        <dependency>
            <groupId>com.formdev</groupId>
            <artifactId>flatlaf</artifactId>
            <version>3.0</version>
        </dependency>
    </dependencies>
 ```
 ```
    // Dentro del main como primera linea
    FlatDarculaLaf.setup();
 ```
* [V256 Componente Caja de Texto con Swing](V256_Componente_Caja_de_Texto_con_Swing/src/main/java)
* [V257 Reaccionar a Eventos con ActionListener](V257_Reaccionar_a_Eventos_con_ActionListener/src/main/java/Forma.java)
* [V258 Reaccionar al Evento KeyPressed](V258_Reaccionar_al_Evento_KeyPressed/src/main/java/Forma.java)
* [V259 Demo App Login con Swing](V259_Demo_App_Login_con_Swing/demo-login.jpg)
* [V260 Creacion del Componente de Vista del Login con Swing](V260_Creacion_del_Componente_de_Vista_del_Login_con_Swing/src/main/java)
* [V261 Crear Objeto Login Form con Swing](V261_Crear_Objeto_Login_Form_con_Swing/src/main/java/LoginForm.java)
* [V262 Validacion del Login](V262_Validacion_del_Login/src/main/java/LoginForm.java)
* [V263 Demo App Zona Fit con Swing y Spring](V263_Demo_App_Zona_Fit_con_Swing_y_Spring/demo-zona-fit.jpg)
* [V264 Creacion de la Clase Forma con Swing]()
* [V265 Ejecucion Inicial App Zona Fit con Swing y Spring](V265_Ejecucion_Inicial_App_Zona_Fit_con_Swing_y_Spring)
* [V266 Activar modo oscuro](V267_Creacion_de_la_Tabla_de_Listado_de_Clientes_con_Swing/src/main/java/gm/zona_fit/ZonaFitSwing.java)
* [V267 Creacion de la Tabla de Listado de Clientes con Swing](V267_Creacion_de_la_Tabla_de_Listado_de_Clientes_con_Swing)
    * Activar el Scroll para la tabla
        - JTable
        - Click derecho en la tabla->Surround With...
        - JScrollPanel
* [V268 Creacion de los Cabeceros de la Tabla Swing](V268_Creacion_de_los_Cabeceros_de_la_Tabla_Swing/src/main/java/gm/zona_fit/gui)
* [V269 Listado de Clientes con Swing](V269_Listado_de_Clientes_con_Swing/src/main/java/gm/zona_fit/gui/ZonaFitForma.java)
* [V270 Formulario para Agregar un Nuevo Cliente con Swing](V270_Formulario_para_Agregar_un_Nuevo_Cliente_con_Swing/src/main/java/gm/zona_fit/gui)
* [V271 Metodo para Agregar un Nuevo Cliente](V271_Metodo_para_Agregar_un_Nuevo_Cliente/src/main/java/gm/zona_fit/gui/ZonaFitForma.java)
* [V274 Eliminar Cliente App Zona Fit con Swing y Spring](V274_Eliminar_Cliente_App_Zona_Fit_con_Swing_y_Spring/src/main/java/gm/zona_fit/gui)
* [V275 Limpiar Formulario App Zona Fit con Swing y Spring](V275_Limpiar_Formulario_App_Zona_Fit_con_Swing_y_Spring/src/main/java/gm/zona_fit/gui)

[Volver](../)