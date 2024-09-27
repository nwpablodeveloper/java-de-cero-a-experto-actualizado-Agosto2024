import java.util.Scanner;

public class SistemaEnvios {
    public static void main(String[] args) {
        System.out.println("\n*** Solución Sistema de Envios ***");

        // Definimos las tarifas por kg
        final var TARIFA_NACIONAL = 10.0;
        final var TARIFA_INTERNACIONAL = 20.0;

        // Solicitamos los valores de destino y peso
        var consola = new Scanner(System.in);

        System.out.print("\nIngresa el destino del paquete ( Nacional/Internacional: ");
        var destino = consola.nextLine().strip().toLowerCase();

        System.out.print("Ingresa el peso del paquete en kilogramo: ");
        var peso = consola.nextDouble();

        // Calculo del envio del paquete

        var  costoEnvio = switch (destino){
            case "nacional" -> TARIFA_NACIONAL * peso;
            case "internacional" -> TARIFA_INTERNACIONAL * peso;
            default -> {
                System.out.println("Ingresa Nacional o Internacional");
                yield null;
            }
        };

        if ( costoEnvio != null )
            System.out.println("El costo el envío es de: " + costoEnvio);

    }
}
