import java.util.Random;
import java.util.Scanner;

public class RetoJuegoAdivinanza {
    public static void main(String[] args) {
        /*
            - Crea un juego donde el jugador deba adivinar un
                número secreto.
            - Puedes usar un ciclo While hasta que el jugador
                adivine correctamente.
            - El número secreto se puede crear utilizando la
                clase Random para generar un valor entre 1 y 50.
            - Por cada intento fallido se debe incrementar una variable
                que lleve el conteo de intentos.
            - El programa debe orientar al jugador indicando si el valor que
                proporcionó fue mayor o menor que el número secreto.
            - Finalmente si adivina el número secreto debe felicitar al usuario
                e indicar cuántos intentos realizo.
            - Opcionalmente, se puede limitar el juego a un número de intentos
                máximo ( ej. 10 ) de lo contrario termina el juego.
         */
        System.out.println("*** Reto - Juego de Adivinanza ***");

        var consola = new Scanner(System.in);
        var random = new Random();

        var numeroSecreto = random.nextInt(50) + 1;
        System.out.println("numeroSecreto = " + numeroSecreto);
        int intentos = 0;

        System.out.print("ingresa el nro. a adivinar: ");
        var numero = consola.nextInt();

        while ( numero != numeroSecreto){
            System.out.println("\nIntento nro. " + ++intentos);
            System.out.println("jaja no adivinaste, prueba con otro: ");
            if ( numero > numeroSecreto)
                System.out.print("Pista: Tu nro. fue ALTO. Elige otro: ");
            else
                System.out.print("Pista: Tu nro. fue BAJO. Elige otro: ");
            numero = consola.nextInt();
        }
        System.out.printf("Felicidades acertaste al número secreto en %d intentos.", intentos);

    }
}
