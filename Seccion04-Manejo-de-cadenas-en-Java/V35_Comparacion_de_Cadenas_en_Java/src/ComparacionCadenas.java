public class ComparacionCadenas {
    public static void main(String[] args) {
        System.out.println("*** Comparación de cadenas y pool de cadenas ***");
        System.out.println();

        /*
        Si no se usa la sintaxis normal de la creación  de  objetos:
        new String("Cadena") los objetos se almacenan en un Pool de cadenas
        en la memoria lo que significa que en esta sección de memoria se van
        a reutilizar objetos de tipo String

         */
        // Reutilización de Objetos de tipo String del Pool
        var cadena1 = "Java";
        var cadena2 = "Java"; // Misma referencia que en cadena1

        /*
        La Variable cadena2 no crea un nuevo objeto en memoria, si no, que
        reutiliza el objeto ya creado en el Pool de la variable cadena1
         */

        // Comparación de cadenas
        System.out.print("Cadena1 == en referencia a cadena2: ");
        System.out.println(cadena1 == cadena2);

        // Vamos a crear una nueva referencia en memoria
        var cadena3 = new String("Java");
        System.out.print("Cadena1 == en referencia a cedena3: ");
        System.out.println(cadena1 == cadena3);

        // Comparar respecto a su contenido y no a su referencia
        // método equeals
        System.out.print("Cadena1 == en contenido a cadena3: ");
        System.out.println(cadena1.equals(cadena3));

        // El operador == hace comparación respecto a la referencia
    }
}
