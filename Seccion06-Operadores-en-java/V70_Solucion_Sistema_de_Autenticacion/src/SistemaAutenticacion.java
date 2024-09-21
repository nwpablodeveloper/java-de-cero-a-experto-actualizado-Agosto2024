import java.util.Scanner;

public class SistemaAutenticacion {
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

        final String USUARIO = "nwpablo";
        final String PASSWORD = "123456";

        Scanner consola = new Scanner(System.in);

        System.out.print("\nIngrese su usuario: ");
        String usuarioIngresado = consola.nextLine();

        System.out.print("Ingrese su constraseña: ");
        String passwordIngresado = consola.nextLine();

        boolean tieneAcceso = usuarioIngresado.equals(USUARIO) &&
                passwordIngresado.equals(PASSWORD);

        System.out.println("Acceso: " + tieneAcceso);


    }



}
