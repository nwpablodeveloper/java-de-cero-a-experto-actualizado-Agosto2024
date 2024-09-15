public class OperadoresComparacion {
    public static void main(String[] args) {
        System.out.println("\n*** Operadores de Comparación o relacionales ***");

        int a = 3, b = 2;
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Igualdad ==
        var resultado = a == b;
        System.out.println("Igualdad a == b             => " + resultado);

        // Distinto !=
        resultado = a != b;
        System.out.println("Distinto a != b             => " + resultado);

        // Mayor que:
        resultado = a > b;
        System.out.println("Mayor que a > b             => " + resultado);

        // Mayor o igual que:
        resultado = a >= b;
        System.out.println("Mayor o igual que: a >= b   => " + resultado);

        // Menor que:
        resultado = a < b;
        System.out.println("Menor que a < b             => " + resultado);

        // Menor o igual que:
        resultado = a <= b;
        System.out.println("Menor o igual que: a <= b   => " + resultado);

    }
}
