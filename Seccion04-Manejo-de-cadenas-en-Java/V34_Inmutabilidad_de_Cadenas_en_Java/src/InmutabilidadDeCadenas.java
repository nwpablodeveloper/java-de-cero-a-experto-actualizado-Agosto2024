public class InmutabilidadDeCadenas {
    public static void main(String[] args) {
        System.out.println("Inmutabilidad de Cadenas");

        /*
        Se crea el objeto "Hola" en la memora Heap y es referenciado por la
        variable "Cadena1" en la memora Stack
         */
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);

        /*
        Para no perder la referencia
         */
        var cadena2 = cadena1;

        /*
        Se crea un nuevo objeto "Adio" en la memoria Heap y es referenciado
        por la variabloe "cadena1" en la memoria Stack.
        El objeto "Hola" ya no es referenciado por ninguna variable y ahora
        queda como basura para ser eliminado por el recolector de residuos
        de VMJ
         */

        cadena1 = "Adios";
        System.out.println("cadena1 modificado = " + cadena1);

        /*
        Cadena2 Mantiene el objeto "Hola" por que se referencio anteriormente
         */
        System.out.println("cadena2 = " + cadena2);
    }
}
