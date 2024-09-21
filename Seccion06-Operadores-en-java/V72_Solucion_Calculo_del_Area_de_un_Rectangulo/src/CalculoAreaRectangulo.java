import java.util.Scanner;

public class CalculoAreaRectangulo {
    public static void main(String[] args) {
        /*
            - Se colicita calcular el área y perímetro de un rectángulo aplicando
                las siguientes formulas:

            - area = base * altura

            - perimetro = 2 ( base + altura )

         */

        System.out.println("\n*** Calculo Área de un Rectángulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la base: ");
        var base = Integer.parseInt(consola.nextLine());

        System.out.print("Proporciona la altura: ");
        var altura = Integer.parseInt(consola.nextLine());

        // Realizamos el calculo del área
        var areaRectangulo = base * altura;
        System.out.println("Área del rectángulo:  " + areaRectangulo);

        // Realizamos el cálculo del perímetro
        var perimetroRectangulo = 2 * ( base + altura );
        System.out.println("Perímetro del Rectángulo: " + perimetroRectangulo);

    }
}
