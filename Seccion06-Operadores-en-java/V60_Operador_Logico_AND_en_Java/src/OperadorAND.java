public class OperadorAND {
    public static void main(String[] args) {
        System.out.println("\n *** Operador Lógico AND ***");

        boolean a = true, b = false, c = true;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // and ( regresa true si ambos valores son true
        boolean resultado = a && b;
        System.out.println("\na y b son verdaderos: = " + resultado);

        resultado = a && c;
        System.out.println("a y c son verdaderos: = " + resultado);


    }
}
