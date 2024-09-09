import java.util.Scanner;

public class ManejoConsola {
    public static void main(String[] args) {
        System.out.println("*** Manejo de datos por consola ***");

        var consola = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
    }
}
