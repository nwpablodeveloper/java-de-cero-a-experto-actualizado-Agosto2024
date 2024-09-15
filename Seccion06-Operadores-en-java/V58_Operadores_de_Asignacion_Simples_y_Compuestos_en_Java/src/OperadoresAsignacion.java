public class OperadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("*** Operadores de Asignacón ***");

        // Operador de Asignación simple =
        int miNumero = 10;
        System.out.println("\nmiNumero = " + miNumero);

        // Operador de Asignación Compuesto
        // +=
        miNumero += 5;
        System.out.println("miNumero += 5 => " + miNumero);

        // *= x
        miNumero *= 2;
        System.out.println("miNumero *= 2 => " + miNumero);

        // /= x
        miNumero /= 6;
        System.out.println("miNumero /= 6 => " + miNumero);

        // %= 2
        miNumero %= 2;
        System.out.println("miNumero %= 2 => " + miNumero);

        // Asignación de variables multiples
        int a = 10, b = 15, c = 20; // Inicializamos con el mismo tipo de dato
        System.out.printf("""
                %nAsignación multiple
                a = %d, b = %d, c = %d
                """, a,b,c);

    }
}
