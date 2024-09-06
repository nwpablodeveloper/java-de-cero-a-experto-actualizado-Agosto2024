public class BusquedaDeSubcadenas {
    public static void main(String[] args) {
        /*
        Buscar Subcadenas
        indexOf - Devuelve el indice de la primera aparición de la
        subcadena
         */

        var cadena1 = "mundo hola mas hola texto de relleno hola y ultima palabra";
        System.out.println("cadena1 = " + cadena1);
        
        // Buscar la 1er aparición de "Hola"
        System.out.println("Subcadena 1er aparición hola: " + cadena1.indexOf("hola"));

        // Buscar la ultima aparición "hola"
        System.out.println("buscar ultimo aparición de  \"hola\": " + cadena1.lastIndexOf("hola"));
    
        /*
        Para la subcadena no encontrada devuelve -1
         */
        System.out.println("cadena no encontrada = " + cadena1.indexOf("Java"));
    
    }
    
}
