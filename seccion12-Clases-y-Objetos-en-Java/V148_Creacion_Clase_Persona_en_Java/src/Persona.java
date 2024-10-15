public class Persona {

    // Atributos
    // var nombre = null; // No podemos asignar null a un var
    String nombre; // Por defecto son null
    String apellido;

    // Métodos
    void mostrarPersona(){
        System.out.printf("""
                Nombre: %s
                Apellido: %s""", nombre, apellido);
        /*
            Podemos ver que cuando usamos los atributos de la Clase
            IntellijIDEA los resalta con otro color
         */

    }
}