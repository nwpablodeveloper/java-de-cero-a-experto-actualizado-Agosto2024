public class NumerosParesConWhile {
    public static void main(String[] args) {
        /*
            - Imprimir los números pares del 1 al 20 usando un Ciclo While.
         */
        System.out.println("\n*** Ejemplo números pares ***");

        var contador = 1;
        while (contador <= 20){
            // Revisamos si es un número par
            if (contador % 2 == 0){
                System.out.print(contador + " ");
            }
            contador++;
        }


    }
}
