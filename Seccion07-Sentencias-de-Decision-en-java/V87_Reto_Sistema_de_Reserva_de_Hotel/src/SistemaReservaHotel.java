import java.util.Scanner;

public class SistemaReservaHotel {
    public static void main(String[] args) {
        /*

            - Se solicita  crear un sistema de reservación de un hotel.
                1. Nombre del cliente
                2. Días de estadia en el hotel
                3. Cuarto con vista al mar?

            - El hotel tiene las siguientes tarifas:
                1. Cuarto sin vista al mar: $ 150.50 por día
                2. Cuarto con vista al mar: $ 190.50 por día

            - El sistema de calcular el costo total de la estadía
                dependiendo si escogío un cuarto con vista al mar o no
                Además de indicar si escogió un cuarto con vista al mar o no

         */
        System.out.println("\n*** Sistema de reserva de Hotel ***");

        final var CUARTO_SIN_VISTA_AL_MAR = 150.50;
        final var CUARTO_CON_VISTA_AL_MAR = 190.50;

        var consola = new Scanner(System.in);

        System.out.print("\nNombre de Cliente: ");
        var nombreCliente = consola.nextLine();

        System.out.print("Días de estadia: ");
        var diasDeEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Cuarto con vista al mar (true/false)");
        var cuartoConVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Calculos
        var costoTotalEstadia = cuartoConVistaAlMar
                ? diasDeEstadia * CUARTO_CON_VISTA_AL_MAR
                : diasDeEstadia * CUARTO_SIN_VISTA_AL_MAR;

        System.out.printf("""
                Cliente: %s
                Dias de estadia: %d
                Total: $ %.2f
                """, nombreCliente, diasDeEstadia, costoTotalEstadia);
    }
}
