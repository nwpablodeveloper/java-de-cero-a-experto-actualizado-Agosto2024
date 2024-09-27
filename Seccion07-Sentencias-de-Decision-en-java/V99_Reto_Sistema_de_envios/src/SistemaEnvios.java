import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        /*
            - Crear un programa para determinar el costo de envío de un paquete
                según su el destino ( Nacional o Internacion ) y el pseo
                del paquete.

            - Constatnes
                1. Tarifa Nacional = 10 x kilo
                2. Tarifa Internacional = 20 x kilo

            - El programa debe solicitar 2 valores:
                1. Destino ( Nacional o Internacional )
                2. Peso ( Kilogramo )

            - Al final debe imprimir el costo de envío del paquete
         */
        System.out.println("\n*** Reto - Sistema de envios ***");

        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        var consola = new Scanner(System.in);

        System.out.print("\nProporciones el destino: ");
        var destino = consola.nextLine();

        System.out.print("Proporcione el peso del paquete: ");
        var peso = consola.nextDouble();

        var costoFinal = 0.0;

        if ( destino.equals("Nacional") )
            costoFinal = TARIFA_NACIONAL * peso;
        else
            costoFinal = TARIFA_INTERNACIONAL * peso;

        System.out.printf("%nEl Costo del envío es de: %.2f", costoFinal);



    }
}
