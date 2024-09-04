public class IndicesCadena {
    public static void main(String[] args) {
        System.out.println("Menejo de indices en una cadena");
        
        var cadena1 = "Hola Mundo";
        
        
        // Recuperar el 1er caracter
        var primerCaracter = cadena1.charAt(0);
        System.out.println("primerCaracter = " + primerCaracter);

        // Recuperar el ultimo caracter
        var ultimoCaracter = cadena1.charAt(9);
        System.out.println("ultimoCaracter = " + ultimoCaracter);

        // Imprimire letra "M"
        var imprimerM = cadena1.charAt(5);
        System.out.println("imprimerM = " + imprimerM);
        
    }
}
