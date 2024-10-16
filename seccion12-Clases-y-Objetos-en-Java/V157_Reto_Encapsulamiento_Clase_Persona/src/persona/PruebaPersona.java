package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        // Creaciones de objetos del tipo Persona
        var persona1 = new Persona("Pablo", "Veiga");
        var persona2 = new Persona("Sophiaaa", "Veaiga");

        // Mostrar el Objeto persona 1 usando los métodos publicos
        System.out.println("Persona 1");
        System.out.println("Nombre = " + persona1.getNombre());
        System.out.println("Apellido = " + persona1.getApellido());

        // Mostrar Objeto Persona 2 usando los métodos públicos
        System.out.println("\nPersona 2: ");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());

        // Corregir los errores en el nombre y apellido usando los métodos públicos set
        persona2.setNombre("Sophia");
        persona2.setApellido("Veiga");

        // Mostrar Objeto Persona 2 usando los métodos públicos
        System.out.println("\nPersona 2 Corrección de nombre y apellido: ");
        System.out.println("Nombre: " + persona2.getNombre());
        System.out.println("Apellido: " + persona2.getApellido());
    }
}
