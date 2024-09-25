public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("\n***Operador Ternario ***");

        // Sintaxis
        // Condición ? exp1 : expr2;

        // Determinar si un número es par
        var numero = 3;
        
        var resultado = numero % 2 == 0 ? "Par" : "Impar";

        System.out.printf("""
                El número: %d
                Es %s
                """,numero,resultado);

        // Calcular si es mayor de edad;
        var edad = 17;
        var mensaje = edad >= 18 ? "Eres Mayor" : "Eres Menor";
        System.out.println("Edad: "+ edad +", " + mensaje);

        // Valor positvo, negetivo o cero ( operador ternario anidado)
        numero = -10;
        resultado = ( numero > 0 ) ? "Es positivo"
                : ( numero < 0) ? "Es Negativo"
                : "Es CERO";
        System.out.println("Numero: "+ numero +", " + resultado);
        
    }
}
