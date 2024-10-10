public class Arreglos {
    public static void main(String[] args) {
        System.out.println("*** Lectura los indices del Arreglo ***");

        // Declarar el arreglo y reservamos el espacio en memoria
        var enteros = new int[5];

        // Modificamos algunos valores
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;

        // leer los valores del Arreglo
        System.out.println("Valor 0 = " + enteros[0]);
        System.out.println("Valor 1 = " + enteros[1]);
        System.out.println("Valor 4 = " + enteros[4]);

    }
}
