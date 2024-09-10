import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Generación de numeros Aleatorios

        System.out.println("\n*** Números Aleatorios ***");

        var random = new Random();
        
        // Generar un número aleatorio entre 0 y 100
        var numeroAleatorio = random.nextInt(100);
        System.out.println("numeroAleatorio = " + numeroAleatorio);

        // Generar un número aleatorio entre 1 y 100
        numeroAleatorio = random.nextInt(100) + 1;
        System.out.println("numeroAleatorio = " + numeroAleatorio);
        
        // Generar un número flotante entre 0.0 y 1.0
        var flotanteAleatorio = random.nextFloat();
        System.out.println("flotanteAleatorio = " + flotanteAleatorio);

        // Simular el lanzamiento de un dado ( 1 a 6 )
        var dado = random.nextInt(6) + 1;
        System.out.println("dado = " + dado);
    }
}
