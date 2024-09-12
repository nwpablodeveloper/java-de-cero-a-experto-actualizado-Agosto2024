import java.util.Random;
import java.util.Scanner;

public class GeneradorIdUnico {
    public static void main(String[] args) {
        System.out.print("%n Sistema Generador de ID Único");

        var consola = new Scanner(System.in);
        var aleatorio = new Random();

        // Solicitamos el nombre del usuario
        System.out.print("\nCual es tu nombre? ");
        var nombre = consola.nextLine();

        // Solicitar apellido
        System.out.print("Cual es tu apellido? ");
        var apellido = consola.nextLine();

        // Solicitar el año de nacimiento
        System.out.print("Cual es tu año de nacimiento (YYYY)? ");
        var anioNacimiento = consola.nextLine();

        // Normalizar los valores
        var nombre2 = nombre.trim().toUpperCase().substring(0,2);
        var apellido2 = apellido.trim().toUpperCase().substring(0,2);
        var anioNacimiento2 = anioNacimiento.trim().substring(2);

        // Generar valor aletario ( 1 y 9999)
        var numeroAletario = aleatorio.nextInt(9999) + 1;

        // Formato de 4 digitos
        var numeroAletarioFormato = String.format("%04d", numeroAletario);

        // Generar el ID Único
        var idUnico = nombre2 + apellido2 + anioNacimiento2 + numeroAletarioFormato;

        // Imprimir el ID Único
        System.out.printf("""
                Hola %s,
                \tTu nuevo número de identificación (ID) generado por el sistema es:
                \t%s
                \t¡Felicidades!
                """, nombre.trim(), idUnico);
    }
}
