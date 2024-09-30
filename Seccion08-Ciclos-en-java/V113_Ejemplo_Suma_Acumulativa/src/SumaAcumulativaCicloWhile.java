public class SumaAcumulativaCicloWhile {
    public static void main(String[] args) {
        /*
            - Realizar la suma de los primeros 5 números utilizando
                un Ciclo While:
                * 1 + 2 +3 + 4 + 5 = 15
         */

        System.out.println("\n*** Suma Acumulativa con While***");

        final var MAXIMO = 5;
        var acumuladorSuma = 0;

        // Iterar los valores
        var numero = 1;
        while ( numero <= MAXIMO ){
            acumuladorSuma += numero++;
        }

        System.out.println("La suma de los primierso " + MAXIMO + " es: " + acumuladorSuma);

    }
}
