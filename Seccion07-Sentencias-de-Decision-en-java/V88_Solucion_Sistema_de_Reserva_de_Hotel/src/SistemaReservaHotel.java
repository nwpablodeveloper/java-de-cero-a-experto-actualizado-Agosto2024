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
        System.out.println("\n*** Sistema de Reserva de hotel ***");

        // Variables del hotel
        final var TARIFA_DIARIA_SIN_VISTA_AL_MAR = 150.50;
        final var TARIFA_DIARIA_CON_VISTA_AL_MAR = 190.50;

        // Pedimos la info al cliente
        var consola = new Scanner(System.in);

        System.out.print("\nNombre del Clientes: ");
        var nombreClientes = consola.nextLine();

        System.out.print("Días de estadía: ");
        var diasEstadia = Integer.parseInt(consola.nextLine());

        System.out.print("Con vista al mar (true/false)");
        var conVistaAlMar = Boolean.parseBoolean(consola.nextLine());

        // Cálculo de costo total de la estadía
        var costoTotal = 0.0;

        if (conVistaAlMar)
            costoTotal = diasEstadia * TARIFA_DIARIA_CON_VISTA_AL_MAR;
        else
            costoTotal = diasEstadia * TARIFA_DIARIA_SIN_VISTA_AL_MAR;

        // Mostramos los detalles de la reserva
        System.out.printf("""
                %n--------- Detalle de la Reservación -----------
                Cliente: %s
                Días de estadía: %d
                Costo total: $ %.2f
                Con vista al mar: %s
                """, nombreClientes, diasEstadia, costoTotal,
                conVistaAlMar ? "Si :)" : "No :(");

    }
}













