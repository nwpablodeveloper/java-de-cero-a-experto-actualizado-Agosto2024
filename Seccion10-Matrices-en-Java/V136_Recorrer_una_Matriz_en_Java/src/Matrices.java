public class Matrices {
    public static void main(String[] args) {

        // Definimos la matriz

        final int RENGLONES = 2;
        final int COLUMNAS = 3;

        int[][] matriz = new int[RENGLONES][COLUMNAS];

        // Cargar valores
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        // 1. Ciclo mas externo para recorrer los rengloes
        for (var ren = 0; ren < RENGLONES; ren++){
            // 1. Ciclo mas interno para recorrer las columnas
            for (var col = 0; col < COLUMNAS; col++){
                System.out.println("Valor["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }



    }
}
