import java.util.Scanner;

public class SaludYFitness {
    public static void main(String[] args) {
        /*

            - Se solicita crear una aplicación de salud y fitness que solicite
                lo siguiente:
                1. Nombre del usuario
                2. Pasos caminados en el día

            - Ademas definiremos las siguientes constantes:
                1. META_PASOS_DIARIOS = 10000
                2. CALORIAS_POR_PASO = 0.04

            - Con los valores anteriores debemos calcular las calorias
                quemadas según los pasos caminados.
                calorias_quemadas = pasos_diarios * CALORIAS_POR_PASO;

            - Y verificamos si se cumplió la meta de pasos diarios
                meta_alcanzada = pasos_diarios >= META_PASOS_DIARIOS
         */
        System.out.println("\n*** Salud y Fitness ***");

        // Constantes
        final int META_PASOS_DIARIOS = 10000;
        final double CALORIAS_POR_PASO = 0.04;

        // Pedimos los valores al usuario
        var consola = new Scanner(System.in);

        System.out.print("\nCuál es tu nombre? ");
        var nombreUsuario = consola.nextLine();

        System.out.print("Cúantos pasos has caminado hoy? ");
        var pasosDiarios = Integer.parseInt(consola.nextLine());

        // Verificar si el usuario alcanzo la meta de pasos diarios
        var metaAlcanzada = pasosDiarios >= META_PASOS_DIARIOS ? "Si :)" : "No :(";

        // Calculamos las calorias quemadas
        var caloriasQuemadas = pasosDiarios * CALORIAS_POR_PASO;

        System.out.printf("""
                %nUsuario: %s
                Pasos dados hoy: %d
                Calorias quemadas: %.2f
                Meta de pasos diarios alcanzada: %s
                -------------------------------------
                La meta de pasos diarios es de: %d pasos
                """, nombreUsuario, pasosDiarios,
                caloriasQuemadas, metaAlcanzada,
                META_PASOS_DIARIOS
                );

    }
}
