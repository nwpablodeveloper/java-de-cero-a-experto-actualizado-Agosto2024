import java.util.Scanner;

public class RetoSumaDiagonal {
    public static void main(String[] args) {
        // Reto sumar la diagonal de una matriz

        var consola = new Scanner(System.in);

        System.out.print("Cantidad de columnas y filas de la matriz por igual? ");
        var dimension = consola.nextInt();
        var matriz = new int[dimension][dimension];

        for (var ren = 0; ren < matriz.length; ren++){
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.print("Ingrese el valor de ["+ren+"]["+col+"]: ");
                matriz[ren][col] = consola.nextInt();
            }
        }

        var sumaDiagonal = 0;
        for (var ren = 0; ren < matriz.length; ren++){
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.print("|"+matriz[ren][col]);
                if (ren == col){
                    sumaDiagonal += matriz[ren][col];
                }
            }
            System.out.println("|");
        }
        System.out.println("sumaDiagonal = " + sumaDiagonal);
    }
}
