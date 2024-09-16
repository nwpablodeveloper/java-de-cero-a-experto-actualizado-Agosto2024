import java.util.Scanner;

public class SistemaPrestamoLibros {
    public static void main(String[] args) {
        /*

            - Se pide crear un sistema para una biblioteca, la cual desea
                prestar libros si cumple con cualquiera de las
                siguientes condiciones.

             * El usuario tiene credencial de estudiante
             * El usuario vive a no más de 3km a la redonda
             * Si cumple con cualquiera de estas condiciones se le
                puede pretar el libro
         */

        System.out.println("\n*** Sistema Prestamo de Libros");

        final var DISTANCIA_PERMITIDA_KM = 3;
        Scanner consola = new Scanner(System.in);

        // Comprobar si tiene credenciales
        System.out.print("\nTiene credencial (true/false): ");
        boolean tieneCredencial = Boolean.parseBoolean(consola.nextLine());

        // Comprobar si vive a menos de 3 km
        System.out.print("A cuantos km vives de la biblioteca?: ");
        int distanciaBibliotecaKm = Integer.parseInt(consola.nextLine());

        boolean esElegiblePrestamo =
                tieneCredencial ||
                distanciaBibliotecaKm <= DISTANCIA_PERMITIDA_KM;

        System.out.println("Se le puede prestar el libro: " + esElegiblePrestamo);


    }
}
