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
* [V181 JavaBeans en Java](V181_JavaBeans_en_Java/src/JavaBeans.java)
    - Es una clase de Java que debe cubrir ciertas características.
        * Debe de tener un constructor vacío. Aunque puede tener más constructores
        * Debe aplicar el concepto de encapsulamiento, támbien debe de tener 
            sus Setters y Gettesrs para acceder a los atributos.
        * Debe implementar la Interface Seralizable. (Permite enviar a nuestros
            objetos por la red o adiscos duros)
* [V182 Manejo de Excepciones en Java](V182_Manjejo_de_Excepciones_en_Java/src/Excepciones.java)
    - Las excepciones pueden aparecer en tiempo de ejecución
        por ejemplo dividir a un numero entre 0 va dar un error en ejecución y no de código.
* [V182 Manejo de Excepciones en Java Parte II](V182_Manjejo_de_Excepciones_en_Java_Parte_II/src/excepciones/)

[Volver](../)