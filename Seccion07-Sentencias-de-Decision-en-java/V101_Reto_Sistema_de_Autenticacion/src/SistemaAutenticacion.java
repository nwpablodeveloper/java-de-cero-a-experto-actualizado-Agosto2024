import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("\n*** Sistema de Autenticación ***");

        /*
            - Crear un sistema para validar los valores de usuario y
                password proporcionados

            - Se deben definir 2 constantes con los valores válidos de usuario
                y password

            - El sistema debe comparar los valores validos contra los
                valores proporcionados

            - Se debe conciderar 4 casos:
                1. Usuario y password válidos
                    imprimir "Bienvendido al Sistema"
                2. Usuario Invalido
                3. Password Invalido
                4. Usuario y Password Invalido
         */
        System.out.println("\n*** Reto - Sistema de Autentificación ***");

        final var USUARIO_VALIDO = "user";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("\nIngrese su usuario: ");
        var usuario = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingrese su password: ");
        var password = consola.nextLine().strip().toLowerCase();

        if (!usuario.equals(USUARIO_VALIDO) && !password.equals(PASSWORD_VALIDO)) {
            System.out.println("Usuario y Password invalido");
        } else if ( !usuario.equals(USUARIO_VALIDO) )
            System.out.println("Usuario Invalido");
        else if ( !password.equals(PASSWORD_VALIDO))
            System.out.println("Password Invalido");
        else
            System.out.println("Bienvenido al Sistema");


    }

}
