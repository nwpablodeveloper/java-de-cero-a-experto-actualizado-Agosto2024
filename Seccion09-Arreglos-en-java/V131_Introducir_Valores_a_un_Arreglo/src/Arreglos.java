import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Introducir valores a un Arreglo ***");

        var consola = new Scanner(System.in);

        // Declarar Arreglo
        System.out.print("Proporciona el largo del Arreglo: ");
        var largoArreglo = consola.nextInt();

        // Crear de manera dinámica el arreglo
        var enteros = new int[largoArreglo];

        // solicitar los valores del arreglo
        for (var i = 0; i < enteros.length ; i++){
            System.out.print("Proporcione el valor para el indice ["+i+"]: ");
            enteros[i] = consola.nextInt();
        }

        // Imprimiendo los valores de cada indice del arreglo
        for (var i = 0; i < enteros.length; i++)
            System.out.println(enteros[i]);

    }
}
