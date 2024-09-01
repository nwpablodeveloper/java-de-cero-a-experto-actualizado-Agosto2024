public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        
        final var DIAS_SEMANA = 7;
        System.out.println("DIAS_SEMANA = " + DIAS_SEMANA);

        // DIAS_SEMANA = 8; // Error, no se puede modificar la constante

        final double PI = 3.1416;
        System.out.println("PI = " + PI);

        // Constantes ya definidas en java desde la biblioteca
        System.out.println("Math PI: " + Math.PI);

        // Mas ejemplos
        final String MENSAJE_BIENVENIDA = "Bienvenid@ a la Universidad Java";
        System.out.println("MENSAJE_BIENVENIDA = " + MENSAJE_BIENVENIDA);
        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println("SEGUNDOS_POR_MINUTO = " + SEGUNDOS_POR_MINUTO);

    }
}
