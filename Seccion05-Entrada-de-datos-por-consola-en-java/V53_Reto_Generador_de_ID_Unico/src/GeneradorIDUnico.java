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

        System.out.printf("%nNombre: ");
        var nombre = consola.nextLine();
        




    }

}
