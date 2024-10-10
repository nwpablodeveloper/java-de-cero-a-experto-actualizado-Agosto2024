public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Sintaxis simplificadas para Arreglos");
        // Arreglos

        // Especificando el tipo de dato
        int[] enteros = {100, 200, 300, 400};

        // Si es var tambien tengo que indicar el tipo de dato
        var enteros2 = new int[]{100, 200, 300, 400};

        System.out.println("Valor 0 = "+ enteros2[0]);
        System.out.println("Valor 1 = "+ enteros2[1]);
        System.out.println("Valor 2 = "+ enteros2[2]);
        System.out.println("Valor 3 = "+ enteros2[3]);

        // direccion de memoria del Arreglo
        System.out.println("enteros = " + enteros);
    }
}
