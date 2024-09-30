public class NumerosInversosConDoWhile {
    public static void main(String[] args) {
        /*
            - Imprimir los números del 1 al 10 de forma inversa
                con Do-While
         */
        System.out.println("\n*** Ejemplo números inversos del n al 10 ***");

        var contador = 10;
        do {
            System.out.print(contador-- + " ");
        } while ( contador > 0 );

    }
}
