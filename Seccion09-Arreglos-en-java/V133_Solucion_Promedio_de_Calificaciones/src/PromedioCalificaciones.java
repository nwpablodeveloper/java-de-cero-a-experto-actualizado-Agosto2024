import java.util.Scanner;

public class PromedioCalificaciones {
    public static void main(String[] args) {
        System.out.println("*** Promedio Calificaciones ***");

        var consola = new Scanner(System.in);
        System.out.print("Cuantas Calificaciones deseas agregar? ");
        var totalCalificaciones = Integer.parseInt(consola.nextLine());

        // Creamos el arreglo
        var calificaciones = new int[totalCalificaciones];

        // Solicitar los valores de cada calificación
        for (var i = 0; i < calificaciones.length; i++){
            System.out.print("Calificaciones["+i+"] = ");
            calificaciones[i] = Integer.parseInt(consola.nextLine());
        }

        // Obtener el promedio de las calificaciones
        var sumaCalificaciones = 0;
        for (var i = 0; i < calificaciones.length; i++){
            sumaCalificaciones += calificaciones[i];
        }

        var promedio = sumaCalificaciones / totalCalificaciones;
        System.out.println("Promedio de las calificaciones es: " + promedio);

    }
}
