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
        var consola = new Scanner(System.in);
        var random = new Random();
        var mayorMenor = "";
        var salir = false;

        System.out.println("\n*** Benvenidos al Reto de adivinar el número ***\n");

        while (!salir) {
            System.out.print("""
                    Menú:
                    1. Juego Normal
                    2. Juego Con intentos limitados
                    3. Salir
                    Eliga una opción:\s""");
            var opcion = consola.nextInt();


            switch (opcion){
                case 1, 2 -> {
                    var limiteIntentos = -1;
                    var contadorIntentos = 0;
                    var numeroRandom = random.nextInt(50) + 1;
                    if (opcion == 2){
                        System.out.print("Limitar la cantidad de intentos a: ");
                        limiteIntentos = consola.nextInt();
                    }

                    var numeroElegido = 0;
                    do {

                        System.out.print("\nQue número pensas que es?: ");
                        numeroElegido = consola.nextInt();
                        if (numeroElegido < 1 || numeroElegido > 50)
                            System.out.print("""
                                    El número tiene que ser entre 1 y 50
                                    Elige otro.\s""");
                    } while(numeroElegido < 1 || numeroElegido > 50);

                    while (contadorIntentos != limiteIntentos){
                        mayorMenor = ( numeroElegido > numeroRandom ) ? "ALTO" :  "BAJO";

                        if (numeroElegido == numeroRandom){
                            System.out.printf("""
                                    %nFelicidades! Acertaste en %d intentos
                                    %n""",contadorIntentos + 1);
                            contadorIntentos = opcion == 1 ? -1 : limiteIntentos;
                        }else{
                            contadorIntentos++;
                            if (contadorIntentos == limiteIntentos){
                                System.out.printf("Se te acabaron los intentos%n%n");
                            }else {
                                System.out.printf("""
                                        %nIntento nro. %d fue %s
                                        Ingrese otro:\s""", contadorIntentos, mayorMenor);
                                numeroElegido = consola.nextInt();
                            }
                        }
                    }
                }
                case 3 -> {
                    salir = true;
                    System.out.println("Espero volverte a ver pronto. Bye!\n");
                }
                default -> System.out.println("Opción no valida.\n");
            }
        }
    }
}
