public class PrecedenciaOperadores {
    public static void main(String[] args) {
        // Precendencia de Operadores en Java:
        // 1. Parentesis y Corchetes () []
        // 2. Operadores Unarios -, ++, --
        // 3. Operadores aritmeticos *, / y %
        // 4. Operadores aritmeticos + y -
        // 5. Relacionales <, <=, >, >=
        // 6. Equivalencia ==, !?
        // 7. Lógicos && y ||
        // 8. Asignación =, +=, -=, /=, etc.

        // Expresión

        var a = 12 / 3 + 2 * 3 - 1;
        //  a =   4 + 6 - 1
        //  a =      9
        System.out.println("\na = " + a);

        var b = 12 / 3 + 2 * ( 3 - 1 );
        //  b =   12 / 3 + 2 * 2
        //  b =      4 + 4
        //  b =        8
        System.out.println("b = " + b);

        var c = 12 / ( 3 + 2 ) * 3 - 1 ;
        //  c =   12 / 5 * 3 - 1
        //  c =
        System.out.println("c = " + c);
    }
}
