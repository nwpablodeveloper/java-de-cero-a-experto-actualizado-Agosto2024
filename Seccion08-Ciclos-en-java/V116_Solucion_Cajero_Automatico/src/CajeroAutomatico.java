import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println();

        var consola = new Scanner(System.in);
        var saldo = 1000.0;
        var salir = false;

        // Menú de la aplicación
        while ( !salir ){
            System.out.print("""
                    *** Aplicación de Cajero Automático ***
                    Operaciones a realizar
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();
            // Procesamos cada caso
            switch ( opcion ){
                case 1 -> System.out.printf("Tu saldo actual es: $ %.2f%n%n", saldo);
                case 2 -> {
                    System.out.print("Ingresa el monto a retirar: ");
                    var retiro = consola.nextDouble();
                    if ( retiro <= saldo ){
                        saldo -= retiro;
                        System.out.printf("Tu nuevo saldo es: $ %.2f%n%n", saldo);
                    } else
                        System.out.printf("No cuentas con el saldo suficiente. " +
                                "Saldo actual: $ %.2f%n%n", saldo);
                }
                case 3 -> {
                    System.out.print("Ingresa el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.printf("Tu nuevo saldo es: $ %.2f%n%n", saldo);
                }
                case 4 -> {
                    System.out.println("Saliendo del cajero automático. Hasta Pronto!");
                    salir = true;
                }
                default -> System.out.println("Opción invalida. " +
                        "Selecciona otra opción\n\n");
            }

        }
    }
}
