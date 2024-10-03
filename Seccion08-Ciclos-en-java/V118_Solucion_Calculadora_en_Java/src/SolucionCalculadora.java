import java.util.Scanner;

public class SolucionCalculadora {
    public static void main(String[] args) {
        System.out.println("\n*** Solución Reto de Calculadora ***");

        var consola = new Scanner(System.in);
        double operando1 = 0, operando2 = 0, resultado;
        var salir = false;

        while ( !salir ){
            System.out.print("""
                    *** Caluculadora en java
                    1. Suma
                    2. Resta
                    3. Multiplicación
                    4. División
                    5. Salir
                    Escoge una opcion:\s""");
            var opcion = consola.nextInt();

            if ( opcion >= 1 && opcion <= 4){
                System.out.print("Dame el valor 1: ");
                operando1 = consola.nextDouble();
                System.out.print("Dame el valor 2: ");
                operando2 = consola.nextDouble();
            }

            switch ( opcion ){
                case 1 -> {
                    resultado = operando1 + operando2;
                    System.out.printf("Resultado suma: %.2f%n%n",resultado);
                }
                case 2 -> {
                    resultado = operando1 - operando2;
                    System.out.printf("Resultado resta: %.2f%n%n",resultado);
                }
                case 3 -> {
                    resultado = operando1 * operando2;
                    System.out.printf("Resultado multiplicación: %.2f%n%n",resultado);
                }
                case 4 -> {
                    if ( operando2 != 0 ) {
                        resultado = operando1 / operando2;
                        System.out.printf("Resultado división: %.2f%n%n", resultado);
                    } else {
                        System.out.println("Error: división entre cero.\n");
                    }
                }
                case 5 -> {
                    System.out.println("Saliendo de la Calculadora");
                    salir = true;
                }
                default -> System.out.println("Opción no valida");
            }

        }

    }
}
