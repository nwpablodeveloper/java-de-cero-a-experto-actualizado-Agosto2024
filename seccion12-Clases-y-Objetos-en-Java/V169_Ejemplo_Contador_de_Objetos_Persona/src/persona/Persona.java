package persona;

public class Persona {

    /*
        Variable Estática para contar Objetos creados de esta Clase.
        Es común inicializar la variable con algun valor.
        Los atributos Estáticos se asocian con la Clase
     */
    static int contadorPeronas = 0;

    // Estos atributos se asocian con los Objetos
    private String nombre;
    private String apellido;

    public Persona(){

    }

    void mostrarPersona(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);
    }

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
