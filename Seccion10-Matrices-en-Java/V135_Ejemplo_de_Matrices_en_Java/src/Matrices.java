public class Matrices {
    public static void main(String[] args) {

        // Definimos una matriz
        // var matriz2 = new int[2][3];

        int[][] matriz = new int[2][3];

        // Modificar valores
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // Accedemos a los valores
        System.out.println("Valor 1 [0][0] = " + matriz[0][0]);
        System.out.println("Valor 2 [0][1] = " + matriz[0][1]);
        System.out.println("Valor 3 [0][2] = " + matriz[0][2]);
        System.out.println("Valor 4 [1][0] = " + matriz[1][0]);
        System.out.println("Valor 5 [1][1] = " + matriz[1][1]);
        System.out.println("Valor 6 [1][2] = " + matriz[1][2]);
    }
}
