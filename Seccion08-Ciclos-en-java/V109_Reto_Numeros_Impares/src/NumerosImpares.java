public class NumerosImpares {
    public static void main(String[] args) {
        /*
            - Imprimir los números impares del 0 al 20 utilizando
                un Ciclo Do-While
         */
        System.out.println("\n*** Reto - números impares con Do-While");

        var contador = 0;

        do {
            if ( contador % 2 != 0)
                System.out.print(contador + " ");
            contador++;
        } while ( contador <= 20);
    }
}
