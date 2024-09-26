import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {
        /*

            - Crear un program para indicar cual es el mayor
                de los dos números.

            - El programa debe pedir al usuario dos números enteros.

            - Posteriormete se deben comparar y mandar a imprimir el nro. mayor:

         */

        System.out.println("\n*** Reto número Mayor ***");

        var consola = new Scanner(System.in);

        System.out.print("\nIngrese el primer número: ");
        var nro1 = consola.nextInt();

        System.out.print("Ingrese el segundo número: ");
        var nro2 = consola.nextInt();

        System.out.printf("""
                %n ------- Reto mostrar el numero mayor -------
                El número mayor es: %d
                """,
                nro1 > nro2 ? nro1 : nro2
                );
    }
}
