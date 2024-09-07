public class CaracteresEspeciales {
    public static void main(String[] args) {
        System.out.println("*** Carácteres Especiales ***");
        
        // \n - Imprimir Salto de linea
        var cadena1 = "Hola \nMundo";
        System.out.println("alto de linea = " + cadena1);
        
        // \t - tabulador
        cadena1 = "\tHola \tMundo";
        System.out.println("tabulador = " + cadena1);
        
        // \' - Comilla Simple
        cadena1 = "\'Hola  Mundo\'";
        System.out.println("Comilla Simple = " + cadena1);

        // \" - Comilla Doble
        cadena1 = "\"Hola Mundo\"";
        System.out.println("Comilla Doble = " + cadena1);
        
        // \\ - Diagonal inversa
        cadena1 = "Hola \\ Mundo";
        System.out.println("Diagonal inversa = " + cadena1);
    }
}
