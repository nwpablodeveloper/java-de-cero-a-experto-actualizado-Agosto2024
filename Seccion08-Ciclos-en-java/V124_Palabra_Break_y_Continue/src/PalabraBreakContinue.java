public class PalabraBreakContinue {
    public static void main(String[] args) {
        System.out.println("*** Palabra Break y Continue ***");

        // Ejemplo break, imprimir solo el primer nùmero par
        System.out.println("Uso de Break");
        for (int i = 1; i < 10 ; i++) {
            if ( i % 2 == 0 ) {
                System.out.println(i);
                break;
            }
        }

        // Ejemplo con Continuo, imprimir solo números pares
        System.out.println("Uso de Continue");
        for (var i = 0; i <= 20; i++ ){
            if (i % 2 == 1){
                continue;
            }
            System.out.printf("%d es par%n",i);
        }
    }
}
