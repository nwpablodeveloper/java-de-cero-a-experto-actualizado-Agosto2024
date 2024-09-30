public class SumaAcumulativaConCicloDoWhile {
    public static void main(String[] args) {
        /*
            - Realizar la suma de los primeros 5 números
                (1 + 2 +3 + 4 + 5 = 15) utilizando un
                Ciclo Do-While
         */

        final var MAXIMO = 5;
        var sumaAcumulativa = 0;
        var i = 0;

        do {
            sumaAcumulativa += i++;
        } while ( i <= MAXIMO );
        System.out.println("sumaAcumulativa = " + sumaAcumulativa);

    }
}
