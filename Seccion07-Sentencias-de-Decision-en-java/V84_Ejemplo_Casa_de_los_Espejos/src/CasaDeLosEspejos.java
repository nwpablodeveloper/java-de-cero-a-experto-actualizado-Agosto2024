import java.util.Scanner;

public class CasaDeLosEspejos {
    public static void main(String[] args) {
        System.out.println("\n**Bienvenido a la casa de los Espejos ***");

        /*
            - Supón que estas en un parque de diversiones y quieres entrar a la
                casa de los espejos.
                Sin  embargo debes de cumplir con algunas condiciones.
                1. Debes de tener más de 10 años.
                2. No debe darte miedo la oscuridad

            - Si se cumplen las condiciones anteriores puedes entrar.

            - Para realizar este ejemplo vamos a utilizar el oprador NOT
                para aplicar la lógica inversa
         */

        var consola = new Scanner(System.in);

        System.out.print("\nCuál es tu edad: ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Te da miedo la oscuridad (true/false): ");
        var tienesMiedoOscuridad = Boolean.parseBoolean(consola.nextLine());


        if ( edad >= 10 && !tienesMiedoOscuridad) {
            System.out.println("Puedes entrar a la casa de los espejos");
        } else {
            System.out.println("Lo siento, la casa de los espejos podría darte miedo.");
        }

    }
}
