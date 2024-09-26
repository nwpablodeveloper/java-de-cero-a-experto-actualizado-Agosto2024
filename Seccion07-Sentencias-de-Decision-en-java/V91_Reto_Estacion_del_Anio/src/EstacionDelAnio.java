import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        /*

            - Identificar la estación del año.

            - Se solicita porporcionar el valor de un mes ( entre 1 y 12 )
                e indicar la estación del año según lo siguiente:
                1. Meses 1, 2, 12 => Invierno
                2. Meses 3, 4, 5 => Primavera
                3. Meses 6, 7, 8 => Verano
                4. Meses 9, 10, 11 => Otoño

            - Cualquier otro valor => Estación desconocida

         */

        System.out.println("\n**** Reto - Estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporciona el número del mes: ");
        var mes = Integer.parseInt(consola.nextLine());

        if ( mes == 1 || mes == 2 || mes == 12 ){
            System.out.println("Invierno");
        } else if ( mes >= 3 && mes <= 5 ) {
            System.out.println("Es Primavera");
        } else if ( mes >= 6 && mes <= 8 ) {
            System.out.println("Es Verano");
        } else if ( mes >= 9 && mes <= 11 ) {
            System.out.println("Es Otoño");
        } else {
            System.out.println("Estación desconocida");
        }
    }
}
