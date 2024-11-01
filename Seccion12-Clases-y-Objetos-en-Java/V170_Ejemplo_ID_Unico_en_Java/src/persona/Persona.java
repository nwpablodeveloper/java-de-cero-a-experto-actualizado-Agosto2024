package persona;

public class Persona {

    /*
        Variable Estática para contar Objetos creados de esta Clase.
        Es común inicializar la variable con algun valor.
        Los atributos Estáticos se asocian con la Clase
     */
    static int contadorPeronas = 0;


    // Estos atributos se asocian con los Objetos
    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(){

    }

    // Usaremos el atributo Estático en el constructor
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        // Atributo Estático

        this.idPersona = ++Persona.contadorPeronas; // Generador de id Único
    }


    @Override
    public String toString(){
        return "Id: " + this.idPersona
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido
                + "\n\nLLamando al toString de la clase Object Padre de los padres\n" +
                // Imprimir la dirección de memoria usando el metodo sin Sobreescribir
                super.toString();
    }

    public String getNombre(){
        return this.nombre;
    }

    // Atributo de solo lectura
    public int getIdPersona(){
        return this.idPersona;
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
