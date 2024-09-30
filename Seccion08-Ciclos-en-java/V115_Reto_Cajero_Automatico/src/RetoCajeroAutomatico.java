import java.util.Scanner;

public class RetoCajeroAutomatico {
    public static void main(String[] args) {
        /*
            - Se les deja crear la aplicación de Cajero Automático.
            - Las funciones principales de un cajero automático son:
                * 1 - Depositar
                * 2 - Retirar
                * 3 - Consultar Saldo
                * 4 - Salir
            - El saldo puede tener un valor inicial Ej. $ 1.000.
            - Si haces un retiro se resta de tu saldo. Y si haces un depósito se
                suma a tu saldo.
         */

        var consola = new Scanner(System.in);
        var saldo = 1000.00;
        var salir = false;

        while ( !salir ){
            System.out.print("""
                    \n*** Reto Aplicación Cajero Automático ***
                    Operaciones que puedes realizar:
                    1. Consultar Saldo
                    2. Retirar
                    3. Depositar
                    4. Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            switch ( opcion ){
                case 1 -> System.out.println("Tu saldo actual es: " + saldo);
                case 2 -> {
                    System.out.print("Ingrese el monto a retirar: ");
                    var retiro = consola.nextDouble();
                    if ( retiro > saldo ) {
                        System.out.println("No cuentas con el saldo suficiente");
                    }else {
                        saldo -= retiro;
                        System.out.println("Tu nuevo Saldo es: $ " + saldo);
                    }
                }
                case 3 ->{
                    System.out.print("Ingrese el monto a depositar: ");
                    var deposito = consola.nextDouble();
                    saldo += deposito;
                    System.out.println("Su saldo actual es de: $" + saldo);
                }
                case 4 -> salir = true;
                default -> System.out.println("Opcion no valida");
            }

            System.out.println("Saliendo del cajero automático. Hasta pronto!");

        }

    }
}
