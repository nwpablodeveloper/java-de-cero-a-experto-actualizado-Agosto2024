public class Cadenas {
    public static void main(String[] args) {

        System.out.println("Manejo de Cadenas");

        // Sintaxis simplificada para crear cadenas
        var cadena1 = "Hola";
        System.out.println("cadena1 = " + cadena1);

        /*
        Sintaxis formal
        La palabra reservada "new" reserva un espacio en memoria Heap para
        darle lugar a un objeto
         */
        var cadena2 = new String("Mundo");
        System.out.println("cadena2 = " + cadena2);

        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);

        // Text block
        var cadena4 = """
                Este
                es un texto
                multilinea
                """;
    }
}
