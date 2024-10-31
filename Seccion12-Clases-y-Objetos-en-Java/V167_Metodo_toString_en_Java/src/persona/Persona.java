package persona;

// De manerea automatica esta clase hereda de la clase Object
public class Persona {

    private String nombre;
    private String apellido;

    public Persona(){

    }

    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

    /*
        Si no lo declaramos al metodo toString, se va a llamar al metodo
        toString de la clase padre eso nos va a dar la dirección
        de memoria del objeto
     */

    @Override
    public String toString(){
        return "Nombre: " + this.nombre + ", Apellido: " + this.apellido
                + "\n\nLLamando al toString de la clase Object\n" +
                super.toString();
    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
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
