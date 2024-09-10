import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {

        System.out.println("\n*** Recestas de Cocina\n");


        var consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Ingrese el nombre de la receta: ");
        var nombreReceta = consola.nextLine();

        // Ingredientes
        System.out.print("Ingresa los ingredientes: ");
        var ingredientes = consola.nextLine();

        // Tiempo de prepración
        System.out.print("Ingresa el tiempo de preparación en minutos: ");
        var tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Ingrese la dificultad (Fácil/Medio/Dificil): ");
        var dificultadPreparacion = consola.nextLine();


        // Imprimir los valores de la receta
        System.out.println("\n--- Receta de Cocina ---");
        System.out.println("\tNombre de la receta: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultadPreparacion);


    }
}
