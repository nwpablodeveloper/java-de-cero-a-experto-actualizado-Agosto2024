import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        /*
            - Considerando que estamos dentro de un sistema bancario, se
                solicita preguntar al usuario si desea continuar
                dentro del sistema

            - Utilizando el operador not (!) para aplicar una lógica inversa
                se debe programar las siguientes condiciones:

                1. Si no deseamos salir del sistema, imprimir:
                    Continuamos dentro del sistema...

                2. De lo contrario, imprimir:
                    Saliendo del sistema
         */

        System.out.println("\n*** Bienvendios al sistema bancario ***");

        var consola = new Scanner(System.in);

        System.out.print("\n Desea salir del sitema (true/false): ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if( !salirSistema ){
            System.out.println("Continuamos dentro del sistema");
        } else {
            System.out.println("Saliendo del sistema");
        }
    }
}
