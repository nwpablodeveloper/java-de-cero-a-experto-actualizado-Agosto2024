import java.util.Scanner;

public class EstacionAnio {
    public static void main(String[] args) {
        System.out.println("\n*** Solución - Estación del Año ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporciones el valor del mes ( 1-12 ): ");
        var mes = Integer.parseInt(consola.nextLine());

        var estacion = "";

        if ( mes == 1 || mes == 2 || mes == 12 )
            estacion = "Inviertno";
        else if ( mes == 3 || mes == 4 || mes == 5 )
            estacion = "Primavera";
        else if ( mes == 6 || mes == 7 || mes == 8 )
            estacion = "Verano";
        else if ( mes == 9 || mes == 10 || mes == 11 )
            estacion = "Otoño";
        else
            estacion = "Estación desconocida";

        // Imprimir el resultado
        System.out.printf("La estación para el mes %d es %s",mes, estacion);

    }
}
