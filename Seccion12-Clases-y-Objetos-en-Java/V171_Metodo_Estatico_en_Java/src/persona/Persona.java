package persona;

public class Persona {

    private static int contadorPeronas = 0;

    private int idPersona;
    private String nombre;
    private String apellido;

    public Persona(){

    }

    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.apellido = apellido;
        this.idPersona = ++Persona.contadorPeronas;
    }

    /*
        Accederemos al atributo privado estatico por medio de un metodo
        estatico
     */
    public static int getContadorPeronas(){
        return Persona.contadorPeronas;
    }


    @Override
    public String toString(){
        return "Id: " + this.idPersona
                + "\nNombre: " + this.nombre
                + "\nApellido: " + this.apellido;
//                + "\n\nLLamando al toString de la clase Object Padre de los padres\n";
                // Imprimir la dirección de memoria usando el metodo sin Sobreescribir
//                super.toString();
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
