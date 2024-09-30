public class SumaAcumulativoaCicloFor {
    public static void main(String[] args) {
        /*
            - Realizar la suma de los primeros 5 números
                (1 + 2 +3 + 4 + 5 = 15) utilizando un
                Ciclo For
         */

        final var MAXIMO = 5;
        var sumaAcumulativa = 0;

        for ( var i = 1; i <= MAXIMO; i++ ) sumaAcumulativa += i;

        System.out.println(sumaAcumulativa);
    }
}
