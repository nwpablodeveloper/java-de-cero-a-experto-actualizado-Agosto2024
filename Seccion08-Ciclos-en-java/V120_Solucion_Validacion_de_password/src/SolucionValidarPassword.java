import java.util.Scanner;

public class SolucionValidarPassword {
    public static void main(String[] args) {
        System.out.println("*** Validación de Password ***");

        var consola = new Scanner(System.in);

        System.out.print("Ingresa un password (de almenos 6 caracteres): ");
        var password = consola.nextLine();

        // Validar password
        while ( password.length() < 6 ){
            System.out.println("El password no cumple con los requisiteos" +
                    "(de al menos 6 carácteres)");

            System.out.print("Ingresa un nuevo password: ");
            password = consola.nextLine();
        }
        System.out.println("Password Valido");
    }
}
