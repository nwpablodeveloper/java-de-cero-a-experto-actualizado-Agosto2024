public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Iterar un Arreglo con ciclos ***");

        var enteros = new int[]{100, 200, 300, 400, 500};

        for (var i = 0; i < enteros.length; i++)
            System.out.println("Valor del indice: " + i + " = " + enteros[i]);

    }
}
