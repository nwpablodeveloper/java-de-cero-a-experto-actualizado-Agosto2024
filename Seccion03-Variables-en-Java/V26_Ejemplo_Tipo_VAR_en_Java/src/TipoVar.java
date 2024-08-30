public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en Java");
        /*
            Podemos inferir el tipo de dato usando la palabra reservada
            "var". La variable var son locales solo existe y se puede usar
            dentro del metodo que fue declarada.

         */

        // Se debe definir su valor al inicializarlas
        // var precio; // Error
        var precio = 354.34F;
        System.out.println("precio = " + precio);

        // Se debe poder inferir el tipo de dato
        // var apellido = null; // Error

        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1 = " + nombre1);

        // Con el uso de var
        var nombre2 = "Carlos"; // va a inferir que es de tipo String
        // y ya no puede ser modificado el tipo de dato
        System.out.println("nombre2 = " + nombre2);
        
        // Otras variables usando var

        var edad = 36; // Infiere que sea de tipo integer
        System.out.println("edad = " + edad);

        var sueldao = 1700.34F; // Infiere que sea tipo flotante
        System.out.println("sueldao = " + sueldao);

        var esCasado = false; // Infiere que sea de tipo boolean
        System.out.println("esCasado = " + esCasado);

        esCasado = true; // Podemos modificar su valor respestando el tipo de dato
        // esCasado = "No"; // esto es Error por que la variable es Boolean


    }
}
