import java.util.Scanner;

public class Matrices {
    public static void main(String[] args) {
        // Introducir datos de manera dianámica en una matriz

        var consola = new Scanner(System.in);

        System.out.print("Proporciona la cantidad de renglones de la matriz: ");
        var renglones = consola.nextInt();

        System.out.print("Proporciona la columnas de columans de la matriz: ");
        var columnas = consola.nextInt();

        var matriz = new int[renglones][columnas];

        for (var ren = 0; ren < matriz.length; ren++ ){
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.print("Ingresar valor ["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }
        for (var ren = 0; ren < matriz.length; ren++ ){
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.println("Ingresar valor ["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }
    }
}
