import java.util.Scanner;

public class ConversionTipoDatos {
    public static void main(String[] args) {

        /*
            El método nextLine() recibe todo los datos ingresados por el usuario
            en forma de String
         */

        // Conversión de datos
        var consola = new Scanner(System.in);

        // Conversión a Integer
        System.out.print("Proporciona un valor entero: ");
        var enteroString = consola.nextLine(); // Es String
        var entero = Integer.parseInt(enteroString); // Convertir a Integer
        System.out.println("entero = " + entero);

        // Conversión a Flotante
        System.out.print("Ingrese un valor de tipo Flotante: ");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Conversión Double
        System.out.print("Ingrese un numero para convertir a double: ");
        var convertirDouble = Double.parseDouble(consola.nextLine());
        System.out.println("convertirDouble = " + convertirDouble);


    }
}
