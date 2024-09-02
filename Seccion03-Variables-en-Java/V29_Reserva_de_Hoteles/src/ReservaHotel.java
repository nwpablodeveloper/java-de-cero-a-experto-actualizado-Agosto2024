public class ReservaHotel {
    public static void main(String[] args) {
        System.out.println("*** Reto reserva de hotel ***");

        String nombreCliente = "Pablo Vegia";
        System.out.println("nombreCliente = " + nombreCliente);
        
        int diasEstancia = 20;
        System.out.println("diasEstancia = " + diasEstancia);
        
        double tarifa = 80.75;
        System.out.println("tarifa = " + tarifa);
        
        boolean tieneVistaMar = true;
        System.out.println("tieneVistaMar = " + tieneVistaMar);
        
        // Modifando variables
        System.out.println();
        System.out.println("Modificando valores");
        
        diasEstancia = 25;
        System.out.println("diasEstancia = " + diasEstancia);
        tarifa = 125.35;
        System.out.println("tarifa = " + tarifa);
        tieneVistaMar = true;
        System.out.println("tieneVistaMar = " + tieneVistaMar);
        
        
    }
}
