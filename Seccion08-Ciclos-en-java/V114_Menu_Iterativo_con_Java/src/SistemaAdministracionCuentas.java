import java.util.Scanner;

public class SistemaAdministracionCuentas {
    public static void main(String[] args) {
        /*
            - Crear un menú para administración de cuentas donde el usuario
                pueda elegir las siguientes opciones:
                * 1 Crear Cuenta -> Mensaje "Crando cuenta..."
                * 2 Eliminar Cuenta -> Mensaje "Eliminando tu cuenta.."
                * 3 Salir -> Mensaje "Saliendo del sistema. Hastá pronto"
         */
        System.out.println("\n*** Sistema de Administración de Cuentas ***");

        var consola = new Scanner(System.in);
        var opcion = 0;

        do{

            System.out.printf("""
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    """);
            System.out.print("Escoja una opción: ");
            opcion = consola.nextInt();

            switch ( opcion ){
                case 1 -> System.out.println("Creadno Cuenta...");
                case 2 -> System.out.println("Eliminando Cuenta...");
                case 3 -> System.out.println("Saliendo del sistema. Hastá pronto");
                default -> System.out.println("Opción invalida.");
            }

        } while ( opcion != 3 );

        System.out.println("Saliendo del sistema Administrativo de Cuentas");
    }
}
