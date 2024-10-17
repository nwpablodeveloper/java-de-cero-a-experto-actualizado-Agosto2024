# Seccion12: Clases y Objetos en java
* [V147 Clases y Objetos en Java - Video Udemy](https://www.udemy.com/course/universidad-java-especialista-en-java-desde-cero-a-master/learn/lecture/44850085#overview)
    - Java es un lenguaje orientado a objetos.
    - Un objeto es una representación de una entidad de la vida real    
        en nuestro programa.
    - Para crear un objeto primero necesitamos crear una Clase o plantilla.
    - Una Clase representa las características en común de nuestros objetos. Es
        una abstracción.
    - Una clase se compone de atributos y métodos.
        * Los Atributos son las características de nuestros objetos
        * Los métodos son las acciones que puede realizar nuestros Objetos. En si,
            estas acciones son funciones, pero cuando se asocian a una Clase se
            las llama métodos.
    - Una vez que hemos definido nuestra Clase, podemos crear Objetos, a esto
        se le llama instanciar una Clase.
    * [Ejemplo de la creación de objetos - JPG](V147_Clases_y_Objetos_en_Java/Docs/Ejemplo-Objetos.jpg)
* [V148 Creación Clase Persona en Java - .java](V148_Creacion_Clase_Persona_en_Java/src/Persona.java)
    - Un archivo de Java puede tener varias Clases, pero solo 1 Clase puede
        ser Public.
* [V149 Creacón Objeto de tipo Persona en Java - .java](V149_Creacion_Objeto_de_Tipo_Persona_en_Java/src/Persona.java)
* [V150 Clase Arítmetica en Java - .java](V150_Clase_Aritmetica_en_Java/src/Aritmetica.java)
* [V151 Constructores en Java - .java](V151_Constructores_en_Java/src/Aritmetica.java)
    - Java genere un constructor vacio de forma automatica.
    - En el caso de crear un constructor con parametros, estamos obligados
        a crear manualmente un cosntructor vacio. 
    - Podemos crear los constructores para inicializar los atributos de nuestros
        objetos en el momento de la instancia.
* [V152 Sobrecarga de Constructores - .java](V152_Sobrecarga_de_Constructores/src/Aritmetica.java)
* [V153 Operador THIS en Java - .java](V153_Operador_This_en_Java/src/Aritmetica.java)
    - El operador THIS apunta al objeto que se esta ejecuntando en el momento.
    - El Operador THIS solo se puede usar dentro de su misma Clase.
* [V154 Paquetes en Java - paquete](V154_Paquetes_en_Java/src)
    - Un paquete es unc colección de archivos y directorios, Nos permite
        organizar las Clases.
    - Para definir los nombres de los paquetes de mas de 1 palabras vamos a 
        usar SnakeCase (Ej: paquete_principal)
    - Necesitamos poner el modificador de acceso Public a los métodos
        para poder llamarlos desde otra Clase.
    * [paquete artimetica - paquete](V154_Paquetes_en_Java/src/aritmetica)
    * [paquete prueba - paquete](V154_Paquetes_en_Java/src/prueba)
* [V155 Encapsulamiento en Java - paquete](V155_Encapsulamiento_en_Java/)
    - El encapsulamiento no s permite controlar el acceso a los atributos de 
        nuestra Clase.
    - Pare evitar acceder a los atritubos directamente usaremos el modificador
        de acceso "private"
        y para poder leer o modificar los atributos crearemos métodos conocidos
        "get" y "set"
        Los métodos "get"(obtener) nos permiten leer el valor de un atributo
        Los métodos "set"(poner) nos permite modificar el valor del atributo
        * [Encapsulamiento - jpg](V155_Encapsulamiento_en_Java/Docs/encapsulamiento.jpg)
    - Los nombres de los métodos "get" y "set" los iniciaremos en mayusculas.
* [V156 Ejemplo de Encapsulamiento en java - paquete](V156_Ejemplo_de_Encapsulamiento_en_Java/src)
    - Los atributos se recomiendan encapsular de forma Pirvate
    * [Clase Aritmetica - .java](V156_Ejemplo_de_Encapsulamiento_en_Java/src/aritmetica/Aritmetica.java)
    * [Clase main PruebaArtimetica - .java](V156_Ejemplo_de_Encapsulamiento_en_Java/src/prueba/PruebaAritmetica.java)
* [V157 Reto Encapsulamiento Clase Persona - .java](V157_Reto_Encapsulamiento_Clase_Persona/src)
    - Aplicar las mejores vistas hasta el momento a la clase Persona.
        * Convertir los atributos de nombre y apellido a privados.
        * Agregar un constructor públic con los 2 argumentos de nombre y apellido.
        * Utilizar el Operdor this en todos los lugares posibles dentro de la clase
        * Agregar los métodos "get" y "set" de cada atributo para aplicar encapsulamiento
        * Mover la clase a un paquete llamado persona y hacer la prueba desde
            "PruebaPersona" dentro del mismo paquete.
    * [Clase-Persona-Encapsulada - .jpg](V157_Reto_Encapsulamiento_Clase_Persona/Docs/Clase-Persona-Encapsulada.jpg)
    * [Clase Persona - .java](V157_Reto_Encapsulamiento_Clase_Persona/src/persona/Persona.java)
    * [Clase PruebaPersona - .java](V157_Reto_Encapsulamiento_Clase_Persona/src/persona/PruebaPersona.java)
* [V158 Solución - Encapsulamiento Clase Persona - .java](V158_Solucion_Encapsulamiento_Clase_Persona/src/)
    * [Clase Persona - .java](V158_Solucion_Encapsulamiento_Clase_Persona/src/persona/Persona.java)
    * [Clase PruebaPersona - .java](V158_Solucion_Encapsulamiento_Clase_Persona/src/persona/PruebaPersona.java)
* [V1559 Herencia en Java - .jpg](V159_Herencia_en_Java/Dcos)
    - [Partiremos de una Clase principal (o Superclase) que la llamaremos Clase Padre](V159_Herencia_en_Java/Dcos/Clase-Padre-e-hijas.jpg)
    - [Las Clases Hijas (o SubClases) van a heredar todos los métodos y atributos de la SuperClase](V159_Herencia_en_Java/Dcos/Clase-hija-o-SubClase.jpg)
* [V160 Hereancia en Java, Parte I ](V160_Herencia_en_Java_Parte_1)

[Volver](../)