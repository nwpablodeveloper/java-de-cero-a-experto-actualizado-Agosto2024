public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Reserva de hoteles ***");

        // Definimos variables
        var nombreCliente = "Miguel Flores";
        var diasEstancia = 7;
        var tarifaDiaria = 1300.00;
        var tieneVistarAlMar = true;

        // Mostrar detalle de la reserva
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistarAlMar = " + tieneVistarAlMar);

        // Modificamos algunos valores
        diasEstancia = 5;
        tarifaDiaria = 900.00;
        tieneVistarAlMar = false;

        System.out.println();
        System.out.println("Nuevos datos de la reserva");
        System.out.println("nombreCliente = " + nombreCliente);
        System.out.println("diasEstancia = " + diasEstancia);
        System.out.println("tarifaDiaria = " + tarifaDiaria);
        System.out.println("tieneVistarAlMar = " + tieneVistarAlMar);

    }
}
