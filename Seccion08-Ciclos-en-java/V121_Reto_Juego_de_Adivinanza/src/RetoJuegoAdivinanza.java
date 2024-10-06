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
        System.out.println("*** Reto - Juego de Adivinanza ***\n");

        var consola = new Scanner(System.in);
        var random = new Random();
        var numeroRandom = random.nextInt(50) + 1;
        var salir = false;
        var intentos = 1;
        var mayorMenor = "";

        while ( !salir ) {
            System.out.print("""
                    \nMenú
                    1. Jugar libre
                    2. Personalizar Juego
                    3. salir
                    Eliga una opción:\s""");

            var opcion = consola.nextInt();

            switch ( opcion ) {
                case 1 -> {

                    System.out.printf("""
                            %nJuego normal: Random %d
                            Ingresa el número a adivinar:\s""", numeroRandom);
                    var nro = consola.nextInt();

                    while ( nro != numeroRandom ){

                        if ( nro > numeroRandom )
                            mayorMenor = "ALTO";
                        else
                            mayorMenor = "BAJO";

                        System.out.printf("""
                                %nIntento nro. %d. jaja no acertaste.
                                Tu número fue: %s
                                Elige otro:\s""", intentos++, mayorMenor);
                        nro = consola.nextInt();
                    }

                }
                case 2 -> {
                    System.out.print("Máximo de números random: ");
                    var numerosMaximos = consola.nextInt();
                    numeroRandom = random.nextInt(numerosMaximos) + 1;

                    System.out.print("Limite de intentos: ");
                    var limiteIntentos = consola.nextInt();

                    System.out.printf("""
                            %nRandom: %d
                            %nAdivine el nro random entre 1 y %d
                            Intentos configurados: %d
                            Ingrese el nro.\s""", numerosMaximos, limiteIntentos);
                    var nro = consola.nextInt();

                    while ( nro != numeroRandom ){

                    }
                }
                case 3 -> {
                    salir = true;
                    System.out.println("Bye!");
                }
                default -> System.out.println("Opción no valida.");
            }
            System.out.printf("""
                    %nMuy bien, acertastes en %d intentos""",intentos);

        }



        /*

        var numeroSecreto = random.nextInt(50) + 1;
        System.out.println("numeroSecreto = " + numeroSecreto);
        int intentos = 1;
*/

/*

        while ( numero != numeroSecreto){
            System.out.println("\nIntento nro. " + ++intentos);
            System.out.println("jaja no adivinaste, prueba con otro: ");
            if ( numero > numeroSecreto)
                System.out.print("Pista: Tu nro. fue ALTO. Elige otro: ");
            else
                System.out.print("Pista: Tu nro. fue BAJO. Elige otro: ");
            numero = consola.nextInt();
        }
        System.out.printf("Felicidades acertaste al número secreto en %d intentos. %n", intentos);
*/

    }
}
