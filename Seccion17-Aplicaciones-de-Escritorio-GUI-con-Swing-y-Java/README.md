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

[Volver](../)