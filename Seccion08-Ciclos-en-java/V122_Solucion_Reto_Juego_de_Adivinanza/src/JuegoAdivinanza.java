import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        System.out.println("*** Juego de Adivinanza ***");
        var consola = new Scanner(System.in);
        var random = new Random();

        // Generamos un numero aleatorio entre 1 y 50
        var numeroSecreto = random.nextInt(50) + 1;
        var intentos = 0;
        var adivinanza = 0;
        final var INTENTOS_MAXIMO = 5;

        while (adivinanza != numeroSecreto && intentos < INTENTOS_MAXIMO) {
            System.out.print("Adivina el número secreto (1-50): ");
            adivinanza = consola.nextInt();

            // Agregar ayuda para orientar al jugador
            if (adivinanza < numeroSecreto)
                System.out.println("El número secreto es mayor");
            else if (adivinanza > numeroSecreto)
                System.out.println("El número secreto es menor");

            // Incrementamos la variable de intentos
            intentos++;


        }

        if (adivinanza == numeroSecreto){
            System.out.printf("Felicidades, adivinaste el número secreto " +
                    "en %d intentos%n", intentos);
        }else {
            System.out.printf("""
                    Lo siento, has agotado tus " +
                    "intentos máximos: %d%n
                    El número secreto era: %d%n""", INTENTOS_MAXIMO, numeroSecreto);
        }

    }
}
