import java.util.Scanner;

public class RetoValidacionPassword {
    public static void main(String[] args) {
        /*
            - Crear un programa para solicitar la validación al momento de
                crear un valor de un password
            - La contraseña debe tener al menos 6 caracteres
            - en caso de no coumplir con este condición el programa debe
                volver a solicitar un nuevo valor hastá que cumpla con
                la condición.
            - Si el valor proporcionado es válido, se debe imprimir:
                "Password Válido" y debe terminar la ejecución del sistema.
         */
        System.out.println("\n*** Reto - Validar Password ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingrese un password: ");
        var password = consola.nextLine();

        while ( password.length() < 6  ) {
            System.out.print("""
                    \nEl password debe de tener como
                    minimo 6 caracteres.
                    Ingrese nuevamente:\s""");
            password = consola.nextLine();
        }
        System.out.println("Password Válido");

    }
}
