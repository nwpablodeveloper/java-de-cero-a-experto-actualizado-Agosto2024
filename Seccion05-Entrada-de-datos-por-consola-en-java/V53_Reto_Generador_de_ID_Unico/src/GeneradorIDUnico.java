import java.util.Random;
import java.util.Scanner;

public class GeneradorIDUnico {
    public static void main(String[] args) {
        /*
            - Crear un programa para generar un valor único.
                Se va a solicitar los siguientes datos
             * Nombre
             * Apellido
             * Año de Nacimiento (YYYY)

            - El programa debera generar un numero aleatorio entre 1 y 9999.
                Si el nro. generado es menor a 4 dígitos se debe completar el valor
                con ceros a la izquierda. Finalmente con los datos obtenidos se
                debe generar un valor de ID único, uniendo los valores de la
                siguiente forma:

             * Nombre: Juan     => Obtener JU
             * Apellido: Perez  => Obtener PE
             * Año: 1995        => 95
             * Aleatorio: 0789  => de 4 digitos
             * ID Generado: JUPE950789.

             SALIDA:
             Hola Juan,
                Tu número de identificación (ID) generado por el sistema es:
                JUPE950789
                Felicitaciones!
         */

        System.out.printf("%n*** Generador de ID ***");

        Scanner consola = new Scanner(System.in);

        // Ingresar nombre
        System.out.printf("%nNombre: ");
        var nombre = consola.nextLine().strip().toUpperCase();

        // Ingresar Apellido
        System.out.print("Apellido: ");
        var apellido = consola.nextLine().strip().toUpperCase();

        // Ingresar su año de nacimiento
        System.out.print("Año de Nacimiento: ");
        var anio = consola.nextLine().strip();

        // Generar numero aleatorio
        var random = new Random();
        var numeroAleatorio = random.nextInt(9999) + 1;

        System.out.printf("""
                %nHola %s,
                \tTu número de identificación (ID) generado por el sistema es:
                \t%s%s%s%04d
                Felicitaciones!
                """,
                nombre,
                nombre.substring(0,2),
                apellido.substring(0,2),
                anio.substring(2,4),
                numeroAleatorio);






    }

}
