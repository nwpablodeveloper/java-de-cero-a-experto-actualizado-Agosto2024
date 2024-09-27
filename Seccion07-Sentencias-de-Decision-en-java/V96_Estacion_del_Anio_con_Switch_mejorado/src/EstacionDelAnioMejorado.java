import java.util.Scanner;

public class EstacionDelAnioMejorado {
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
        System.out.println("\n*** Reto - Estación del Año con Switch mejorado ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporciones el més del Año: ");
        var mes = consola.nextInt();

        String estacion = switch ( mes ){
          case 1,2,12 -> "Inviertno";
          case 3,4,5 -> "Primavera";
          case 6,7,8 -> "Verano";
          case 9,10,11 -> "Otoño";
          default -> "Més Invalido";
        };
        System.out.printf("El nro.: %d es: %s",mes,estacion);
    }
}
