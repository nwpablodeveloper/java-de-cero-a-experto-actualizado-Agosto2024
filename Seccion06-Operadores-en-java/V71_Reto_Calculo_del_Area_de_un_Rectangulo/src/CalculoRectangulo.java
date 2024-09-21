import java.util.Scanner;

public class CalculoRectangulo {
    public static void main(String[] args) {
        /*
            - Se colicita calcular el área y perímetro de un rectángulo aplicando
                las siguientes formulas:

            - area = base * altura
            - perimetro = 2 ( base * altura )
         */

        System.out.println("\n*** Calcular el Área y el Perímetro de un rectangulo ***");

        Scanner consola = new Scanner(System.in);

        System.out.print("Ingrese la base del rectangulo: ");
        var base = Double.parseDouble(consola.nextLine());

        System.out.print("Ingrese la altura del rectangulo: ");
        var altura = Double.parseDouble(consola.nextLine());

        var area = base * altura;
        var perimetro = 2 * area;

        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
}
