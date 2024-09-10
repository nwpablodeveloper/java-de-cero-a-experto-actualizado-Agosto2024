import java.util.Scanner;

public class RecetasCocina {
    public static void main(String[] args) {
        /*

            - Crear un programa para solicitar los valores más importantes de una receta de cocina.
                Los valores que debe introducir el usuario son:
             * Nombre de la receta
             * Ingredientes principales separados por una coma
             * Tiempo de preparación ( min )
             * Dificultad ( Facil, Media o Altá )

            - Al finalizar se debe mandar a imprimir la receta.
        */
        System.out.println();
        System.out.println("*** Programa Recetas de Cocina ***");
        System.out.println();

        Scanner consola = new Scanner(System.in);

        // Nombre de la receta
        System.out.print("Nombre de la Receta: ");
        String nombreReceta = consola.nextLine();

        // Ingredientes para la receta
        System.out.print("Ingredientes para la Receta: ");
        String ingredientesReceta = consola.nextLine();

        // Tiempo de preparación en minutos
        System.out.print("Tiempo de preparación: ");
        int tiempoPreparacion = Integer.parseInt(consola.nextLine());

        // Dificultad
        System.out.print("Dificultad: ");
        String dificultad = consola.nextLine();

        System.out.println();

        System.out.println("Receta: " + nombreReceta);
        System.out.println("Ingredientes: " + ingredientesReceta);
        System.out.println("Tiempo: " + tiempoPreparacion);
        System.out.println("Dificultad: " + dificultad);





    }
}
