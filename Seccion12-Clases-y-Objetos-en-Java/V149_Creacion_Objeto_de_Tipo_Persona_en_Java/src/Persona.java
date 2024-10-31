public class Persona {

    // Atributos
    // var nombre = null; // No podemos asignar null a un var
    String nombre; // Por defecto son null
    String apellido;

    // Métodos
    void mostrarPersona(){
        System.out.printf("""
                
                Nombre: %s
                Apellido: %s
                """, nombre, apellido);
        /*
            Podemos ver que cuando usamos los atributos de la Clase
            IntellijIDEA los resalta con otro color
         */

    }

    public static void main(String[] args) {
        System.out.println("*** Creación de Clase y Objetos de tipo Persona ***");

        var objeto1 = new Persona();
        objeto1.nombre = "Pablo";
        objeto1.apellido = "Veiga";
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        objeto2.nombre = "Romina";
        objeto2.apellido = "Diaz";
        objeto2.mostrarPersona();
    }
}