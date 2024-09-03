public class CadenasEnJava {
    public static void main(String[] args) {
        System.out.println("*** Cadenas en Java ***");

        /*
        Las cadenas son objetos referenciados que se almacenan en la memoria
        Heap.
         */

        var cadena1 = "Hola";
        var cadena2 = new String("Mundo"); // Uso de manera formal
        var cadena3 = cadena1 + " " + cadena2;

        // Cadenas con saltos de lineas
        var cadena4 = """
                Este
                es un texto
                multilinea
                """;

        System.out.println("cadena1 = " + cadena1);
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena3 = " + cadena3);
        System.out.println("cadena4 = " + cadena4);
    }
}
