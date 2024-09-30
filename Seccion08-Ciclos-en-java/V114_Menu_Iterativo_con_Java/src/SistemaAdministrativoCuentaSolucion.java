import java.util.Scanner;

public class SistemaAdministrativoCuentaSolucion {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        var salir = false;

        // Comenzar con la iteración del menú

        while ( !salir ){
            System.out.print("""
                    *** Sistema de Administración de Cuentas ***
                    menú:
                    1. Crear Cuenta
                    2. Eliminar Cuenta
                    3. Salir
                    Escoje una opción:\s """);
            var opcion = consola.nextInt();
            switch ( opcion ){
                case 1 -> System.out.println("Crearndo tu cuenta...\n");
                case 2 -> System.out.println("Eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.println("Saliendo del sistema. Hastá pronto");
                    salir = true;
                }
                default -> System.out.println("Opción invalida");
            }
        }
        System.out.println("Fin del sistema de administarción de cuentas");
    }
}
