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
        int contadorIntentos = 0, opcion = 0, numeroRandom = 0, numeroElegido = 0, limiteIntentos = 0;
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
            opcion = consola.nextInt();


            switch (opcion){
                case 1, 2 -> {
                    contadorIntentos = 1;
                    numeroRandom = random.nextInt(50) + 1;
                    System.out.println("numeroRandom = " + numeroRandom);
                    if (opcion == 2){
                        System.out.print("Limitar la cantidad de intentos a: ");
                        limiteIntentos = consola.nextInt();
                    }
                    System.out.print("\nQue número pensas que es?: ");
                    numeroElegido = consola.nextInt();

                    do{
                        mayorMenor = ( numeroElegido > numeroRandom ) ? "ALTO" :  "BAJO";

                        if (numeroElegido == numeroRandom){
                            System.out.printf("""
                                    %nFelicidades! Acertaste en %d intentos
                                    %n""",contadorIntentos);
                            contadorIntentos = opcion == 1 ? 0 : limiteIntentos;
                        }else{
                            System.out.printf("""
                                    %nIntento nro. %d fue %s
                                    Ingrese otro:\s""", contadorIntentos, mayorMenor);
                            numeroElegido = consola.nextInt();
                            if (contadorIntentos == limiteIntentos){
                                System.out.printf("Se te acabaron los intentos%n%n");
                            }
                            ++contadorIntentos;
                        }
                    }while (contadorIntentos != limiteIntentos);
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
