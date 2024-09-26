import java.util.Scanner;

public class MayorDeDosNumeros {
    public static void main(String[] args) {
        /*
            - Crear un program para indicar cual es el mayor
                de los dos números.

            - El programa debe pedir al usuario dos números enteros.

            - Posteriormete se deben comparar y mandar a imprimir el nro. mayor:
         */

        System.out.println("\n *** El mayor de dos números ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporciona el número 1: ");
        var numero1 = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona el número 2: ");
        var numero2 = Integer.parseInt(consola.nextLine());

        // El mayor de dos números
        if ( numero1 > numero2 )
            System.out.println("El número 1 es mayor: " + numero1);
        else
            System.out.println("El número 2 es mayor: " + numero2);
    }
}
