import java.util.Scanner;

public class ValorPositivo {
    public static void main(String[] args) {
        /*
            - Ingresar un número entero e imprimir si el mismo es Positivo,
                Negativo o es igual a Cero.
         */

        System.out.println("\n*** Ejemplo número positivo ***");

        Scanner consola = new Scanner(System.in);

        System.out.print("\nIngrese un número: ");
        var numero = Integer.parseInt(consola.nextLine());

        if ( numero > 0 ) {
            System.out.println("El número es positivo");
        } else if ( numero < 0) {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es 0");
        }
    }
}
