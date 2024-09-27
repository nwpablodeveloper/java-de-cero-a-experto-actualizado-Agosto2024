import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        /*
            - Crar un programa para convertir una calificación numérica ( 0 - 10 )
                a una letra ( de la F a la A )

                1. Si es mayor o igual a 9 y menor o igual a 10 es una A
                2. Si es mayor o igual a 8 y menor a 9 es una B
                3. Si es mayor o igual a 7 y menor a 8 es una C
                4. Si es mayor o igual a 6 y menor a 7 es una D
                5. Si es mayor o igual a 0 y menor a 6 es una F
                6. En cualquier otro caso imprimir "Valor Desconocido"

         */

        System.out.println("\n*** Reto - sistema de calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporcione una calificación: ");
        var calificacion = consola.nextDouble();

        String resultadoCalificacion = "";

        if ( calificacion > 10 || calificacion < 0 ) {
            resultadoCalificacion = "Calificación no valida";
        } else if ( calificacion >= 9 && calificacion < 10 ) {
            resultadoCalificacion = "A";
        } else if ( calificacion >= 8 && calificacion < 9 ) {
            resultadoCalificacion = "B";
        } else if ( calificacion >= 7 && calificacion < 8 ) {
            resultadoCalificacion = "C";
        } else if ( calificacion >= 6 && calificacion < 7 ) {
            resultadoCalificacion = "D";
        } else {
            resultadoCalificacion = "F";
        }


        System.out.printf("%nSu calificación es: %s",resultadoCalificacion);
    }
}
