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
* [V159 Herencia en Java - pquete](V159_Herencia_en_Java/Docs)
    - [Partiremos de una Clase principal (o Superclase) que la llamaremos Clase Padre](V159_Herencia_en_Java/Docs/Clase-Padre-e-hijas.jpg)
    - [Las Clases Hijas (o SubClases) van a heredar todos los métodos y atributos de la SuperClase](V159_Herencia_en_Java/Docs/Clase-hija-o-SubClase.jpg)
* [V160 Hereancia en Java, Parte I - paquete](V160_Herencia_en_Java_Parte_1/src)
    - "Protected" es el modificador que usaremos en las clases padres para que
        puedan ser accedidos por sus clase hijas
* [V161 Hereancia en Java, Parte II - paquete](V161_Herencia_en_Java_Parte_2/src)
* [V162 Sobreescritura - paquete](V162_Sobreescritura/src)
    - Sobreescritura significa que vamos a modificar el comportamiento que 
        estamos heredando de la Clase Padre.
    - En la subClase tenemos que usar la misma firma que tiene la superClase
        para poder realizar la sobreescritura.
* [V163 Sobreescritura palabra Super - .java](V163_Sobreescritura_Palabra_Super/src/animales/Animal.java)
    - La palabra Super en una sobeescritura nos permite volver a acceder a la 
        funcionalidad definida en la clase padre.
* [V164 Polimorfismo en Java](V164_Polimorfismo_en_Java/Docs/polimorfismo.jpg)
    - Polimorfismo significa multiple Formas.
    - Se necesita aplicar el concepto de HERENCIA y SOBREESCRITURA
* [V165 Ejemplo Polimorfismo en Java - .java](V165_Ejemplo_Polimorfismo_en_Java/src/animales/Animal.java)
    - Los modificadores de acceso en las firmas puden ser usados en las
        sobreescrituras del mas restringido al menos restringido.
        * Private
        * default
        * Protected
        * Public
* [V166 Clase Object en Java](V166_Clase_Object_en_Java/Docs/Clase_Object_Padre_de_los_Padres.jpg)
    - La Clase Object es la clase Padre de todas las clase en Java. 
    - Contiene métodos como:
        * equals() - Sirve para comparar si 2 objetos son iguales
        * toString() - para imprimir el estado de un objeto en cierto momento
        * hashCode() - Para generar un valor númerico para representar al
            objeto en memoria
* [V167 Método toString en Java](V167_Metodo_toString_en_Java/src/persona)
* [V168 Contexto Estático en Java](V168_Contexto_Estatico_en_Java/Docs/Contexto_estatico_Variable_Estatica.jpg)
    - La creación de clases es el contexto estático.
    - La creación de Objetos es el contexto dinámico.
    - El Contexto "ESTÁTICO" no puede acceder al contexto dinámico.
    - El contexto "DINÁMICO" si puede acceder al contexto estático.
        - [Ejemplo:](V168_Contexto_Estatico_en_Java/Docs/Contexto_estatico_Variable_Estatica.jpg)
            * Definir una variable Estática para contabilizar los obejtos 
                creados de un tipo de Clase, esa variable va a ser declarada
                dentro de la misma clase.
* [V169 Ejemplo contador de Objetos del tipo Persona](V169_Ejemplo_Contador_de_Objetos_Persona/src/persona/)
    * [Clase Persona](V169_Ejemplo_Contador_de_Objetos_Persona/src/persona/Persona.java)
    * [Clase PruebaPersona](V169_Ejemplo_Contador_de_Objetos_Persona/src/persona/PruebaPersona.java)
> [!NOTE]
> Los Atributos Estáticos se asocian con la Clase y se
> definen con algun valor inicial
> Los atributos de instancias se asocian con el Objeto creado
* [V170 Ejemplo ID Único en Java](V170_Ejemplo_ID_Unico_en_Java/src/persona)
    * [Clase Persona](V170_Ejemplo_ID_Unico_en_Java/src/persona/Persona.java)
    * [Clase PruebaPersona](V170_Ejemplo_ID_Unico_en_Java/src/persona/PruebaPersona.java)
* [V171 Método Estático en Java](V171_Metodo_Estatico_en_Java/src)

[Volver](../)