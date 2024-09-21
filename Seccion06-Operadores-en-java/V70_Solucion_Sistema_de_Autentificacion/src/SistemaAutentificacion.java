import java.util.Scanner;

public class SistemaAutentificacion {
    public static void main(String[] args) {
        /*
            - Crear un programa para validar el usuario y password proporcionados
                por el usuario

            - Crea 2 Constantes con los valores correctos y posteriormente
                compara que el usuario y password proporcionados por
                el usuario sea válidos

            - Debe solicitar el usuario y el password al usuario y si son iguales
                que los valores correctos almacenados en las constantes de imprimir true,
                de lo contrario debe imprimir false
         */

        System.out.println("\n*** Sistema de Autenticacion");

        final var USUARIO_VALIDO = "admin";
        final var PASSWORD_VALIDO = "123";

        var consola = new Scanner(System.in);

        System.out.print("\nCúal es tu usuario? ");
        var usuarioIngresado = consola.nextLine();

        System.out.print("Cúal es tu password? ");
        var passwordIngresado = consola.nextLine();

        var sonDatosCorrectos = usuarioIngresado.equals(USUARIO_VALIDO)
                && passwordIngresado.equals(PASSWORD_VALIDO);

        System.out.println("son Datos Correctos?  " + sonDatosCorrectos);


    }
}
