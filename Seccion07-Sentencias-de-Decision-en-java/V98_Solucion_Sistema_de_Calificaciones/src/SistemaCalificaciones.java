import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("\n*** Sistema de calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("\nProporciona una calificación entre 0 y 10: ");
        var calificacion = consola.nextDouble();
        var calificacionLetra = "";

        // Revisamos si está en los siguientes rangos
        if ( calificacion >= 9 && calificacion <= 10 )
            calificacionLetra = "A";
        else if ( calificacion >= 8 && calificacion < 9 )
            calificacionLetra = "B";
        else if ( calificacion >= 7 && calificacion < 8 )
            calificacionLetra = "C";
        else if ( calificacion >= 6 && calificacion < 7 )
            calificacionLetra = "D";
        else if ( calificacion >= 0 && calificacion < 6 )
            calificacionLetra = "F";
        else
            calificacionLetra = "Calificación no valida";

        System.out.println("Su calificación es: " + calificacionLetra);
    }
}
