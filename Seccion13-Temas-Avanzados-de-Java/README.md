# Seccion13: Temas Avanzados de Java
* [V177 Argumentos Variables en Java](V177_Argumentos_Variables_en_Java/src/ArgumentosVariables.java)
    - varargs (Argumentos Variables)
* [V178 Ciclo ForEach](V178_Ciclo_ForEach_en_Java/src/ForEach.java)
    - Each (cada elemento)
* [V179 Clases Abstractas](V179_Clases_Abstractas_en_Java/src/ClaseAbstracta.java)
    - Una clase abstracta no se puede instanciar
    - Define uns estructura común
    - Sirve como base para otras clases
* [V180 Interfaces en Java](V180_Interfaces_en_Java/src/Traductor.java)
    - Es similar a una clase Abstracta, la Interface se enfoca más en estandareizar el
        comportamiento de nuestro código y la clase abstracta se enfoca mas en abstraer
        características en común. 
    - La Interface es un conjunto de métodos que una clase debe cumplir  
        es como un contrato que asegura que las clases que la implemente
        tendrán ciertas funcionalidades
    ```
        public interface NombreClase{
            // Conjunto de métodos a para que las clases implementen
        }
    ```
    - No permite crear Objetos del tipo Interfaces, no se puede
* [V181 JavaBeans en Java](V181_JavaBeans_en_Java/src/JavaBeans.java)
    - Es una clase de Java que debe cubrir ciertas características.
        * Debe de tener un constructor vacío. Aunque puede tener más constructores
        * Debe aplicar el concepto de encapsulamiento, támbien debe de tener 
            sus Setters y Gettesrs para acceder a los atributos.
        * Debe implementar la Interface Seralizable. (Permite enviar a nuestros
            objetos por la red o adiscos duros)
* [V182 Manejo de Excepciones en Java](V182_Manjejo_de_Excepciones_en_Java/src/excepciones)
    - Las excepciones pueden aparecer en tiempo de ejecución
        por ejemplo dividir a un numero entre 0 va dar un error en ejecución y no de código.
* [V183 Manejo de Excepciones en Java Parte II](V183_Manjejo_de_Excepciones_en_Java_Parte_II/src/excepciones/)
    * [Excepción de Aritmetica](V183_Manjejo_de_Excepciones_en_Java_Parte_II/src/excepciones/Aritmetica.java)
    * [Clase de Prueba](V183_Manjejo_de_Excepciones_en_Java_Parte_II/src/excepciones/PruebaAritmetica.java)
* [V184 Colecciones en Java](V184_Colecciones_en_Java/Docs/Colecciones.jpg)
    - Una colección representa un grupo de objetos. Algunas colecciones permiten elementos duplicados
        y otras no, algunas tienen sus elementos oredenados y otras no. 
        * java.util (paquete)
            - Tiene la INTERFACE Collection, es la colección padre de todo los tipos de colecciones.
                Algunas de sus interfaces hijas son List y Set.
                - Interface List - Permite elementos duplicados y mantienen un orden en el que se agregan
                    los elementos.
                    Para crear objetos (LAS INTERFACES NO PERMITEN CREAR OBJETOS) vamos a usar
                    la Clase ArrayList.
                - Interface Set - No permiten elementos duplicados y son desordenadas. En esta caso
                    vamos a usar la Clase SortedSet para crear Objetos, la misma nos va a ayudar
                    a crear un orden ya que por defecto la Interfacse Set no lo hace. (Sorted = oredenar y Set = no
                    permitir elementos duplicados).
                - Interface Map (o Diccionario) - Permite crear un mapa de los elementos como un diccionario,
                    vamos a tener la información en forma de llave/valor y para ello vamos a hacer 
                        uso de la Clase HashMap.
* [V185 Listas en Java](V185_Listas_en_Java/src/Listas.java)
    - Las listas PERMITEN ELEMENTOS DUPLICADOS y mantienen el orden en que se fue creando
* [V186 Manejos de Genéricos](V186_Manejo_de_Genericos/src/Listas.java)
    - Definir el tipo de dato para las listas
* [V187 Funciones Lambda en Java](V187_Funciones_Lambda/src/Listas.java)
    ```
        miLista.forEach(elemento -> {
            // Codigo acá
        });
    ``` 
* [V188 Métdos de Referencia en Java](V188_Metodos_de_Referencia_en_Java/src/Listas.java)
* [V189 Sets en Java](V189_Sets_en_Java/src/Sets.java)
    - Los Sets No permiten elementos duplicados y NO mantiene el orden en que fue creado
* [V190 Manejo de Mpas en java](V190_Manejo_de_Mapas/src/Mapa.java)
* [V191 Presentación Proyecto de Maquina de Snack - JPG](V191_Proyecto_de_Maquina_de_Snack/Docs/proyecto-maquina-de-Snacks.jpg)
    - [proyecto maquina de Snacks - JPG](V191_Proyecto_de_Maquina_de_Snack/Docs/proyecto-maquina-de-Snacks.jpg)
    - [app proyecto maquina de Snacks - JPG](V191_Proyecto_de_Maquina_de_Snack/Docs/app-proyecto-maquina-de-Snacks.jpg)
* [V192 Proyecto Maquina de Snacks](V192_Cracion_de_la_Clase_Snack/src/maquina_snacks)
    - [Clase Sncack](V192_Cracion_de_la_Clase_Snack/src/maquina_snacks/Snack.java)
                        

[Volver](../)