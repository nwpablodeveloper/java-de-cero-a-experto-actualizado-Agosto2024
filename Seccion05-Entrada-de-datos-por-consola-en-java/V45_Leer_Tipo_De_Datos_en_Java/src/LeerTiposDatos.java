import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        // Como leer distintos tipos de datos

        // Leer un tipo Int
        var consola = new Scanner(System.in);
        System.out.print("Ingresa tu edad: ");
        var edad = consola.nextInt();  // No consume el carácter de salto de linea
        System.out.println("edad = " + edad);
        
        // Leer un tipo double
        System.out.print("Ingrese su altura: ");
        var altura = consola.nextDouble(); // No consume el carácter de salto de linea
        System.out.println("altura = " + altura);

        // Consumir el carácter de salto de linea
        consola.nextLine();

        // Leer un tipo String

        System.out.print("Ingresa tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
