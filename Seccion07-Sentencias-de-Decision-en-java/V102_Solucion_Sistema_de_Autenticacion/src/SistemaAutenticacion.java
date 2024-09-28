import java.util.Scanner;

public class SistemaAutenticacion {
    public static void main(String[] args) {
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
        System.out.println("\n*** Solución Sistema de Autenticación ***");

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("\nIngrese su usuario: ");
        var usuario = consola.nextLine().strip();

        System.out.print("Ingresa tu password: ");
        var password = consola.nextLine().strip();

        // Cada caso de validación de usuario y password

        var mensajeAutenticacion = switch (usuario){
            case USUARIO_VALIDO -> {
                if ( PASSWORD_VALIDO.equals(password) ){
                    yield "Binevenido al sistema";
                }else{
                    yield "Password incorrecto";
                }
            }
            default -> {
                if ( PASSWORD_VALIDO.equals(password)){
                    yield "Usuario Incorrecto";
                } else {
                    yield "Usuario y Passwrod Incorrectos";
                }
            }

        };

        System.out.println(mensajeAutenticacion);

    }
}
