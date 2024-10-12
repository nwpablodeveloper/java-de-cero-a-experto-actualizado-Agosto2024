public class Matrices {
    public static void main(String[] args) {
        // Definir con Sitaxis simplificada

        var matriz = new int[][]{
                {100,200,300,400,},
                {500,600,700,800,900}
        };

        for (var ren = 0; ren < matriz.length; ren++){
            for (var col = 0; col < matriz[ren].length; col++){
                System.out.println("Valor["+ren+"]["+col+"] = " + matriz[ren][col]);
            }
        }
    }
}
