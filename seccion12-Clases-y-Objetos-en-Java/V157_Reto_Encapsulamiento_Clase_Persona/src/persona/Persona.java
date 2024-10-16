package persona;

public class Persona {
    /*
        - Aplicar las mejores vistas hasta el momento a la clase Persona.
            * Convertir los atributos de nombre y apellido a privados.
            * Agregar un constructor públic con los 2 argumentos de nombre y apellido.
            * Utilizar el Operdor this en todos los lugares posibles dentro de la clase
            * Agregar los métodos "get" y "set" de cada atributo para aplicar encapsulamiento
            * Mover la Clase a un paquete llamado persona y hacer la prueba desde
                "PruebaPersona" dentro del mismo paquete.

     */

    private String nombre;
    private String apellido;

    public Persona(){}

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getApellido(){
        return this.apellido;
    }

    public void setApellido(String apellido){
        this.apellido = apellido;
    }

}
