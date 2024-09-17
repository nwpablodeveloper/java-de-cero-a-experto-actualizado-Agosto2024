import java.util.Scanner;

public class RangoVariable {
    public static void main(String[] args) {
        System.out.println("\nValor Fuera de Rango");

        Scanner consola = new Scanner(System.in);

        System.out.printf("Proporciones un dato entero: ");
        var dato = Integer.parseInt(consola.nextLine());

        // Revisamos si está dentro de rango ( entre 1 y 10)

        var estaDentroRango = dato >= 1 && dato <= 10;
        System.out.println("Varible dentro de rango (1 y 10)? " + estaDentroRango);

        // Revisar la logíca inversa, si el dato está fuera de rango
        var estaFueraRango = !( dato >= 1 && dato <= 10);
        System.out.println("Variable fuera de rango ( 1 y 10)? " + estaFueraRango);

    }
}
