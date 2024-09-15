public class OperadoresUnarios {
    public static void main(String[] args) {
        System.out.println("*** Operadores Unarios***");

        int a = 3, b = -2, resultado;
        var c = true;

        System.out.println("\na = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println();

        // Operador unario +
        resultado = +a; // Es opcional por que su valor ya es positivo
        System.out.println("Unario +a:  " + +a);

        // Operador unario -
        resultado = -a; // Es opcional por que su valor ya es positivo
        System.out.println("Unario -a:  " + resultado);

        // Operadores unarios incremente/decremento
        // Pre-incrementeo
        a = 3;
        System.out.println("Pre-incremento ++a = " + ++a);

        // Pre-decremento
        a = 3;
        System.out.println("Pre-decremento --a = " + --a);

        // Post-incremento
        a = 3;
        System.out.println("Post-incremento a++:  " + a++);
        System.out.println("a = " + a);

        // Post-decremento
        a = 3;
        System.out.println("Post-decremento a--:  " + a--);
        System.out.println("a = " + a);





    }
}
