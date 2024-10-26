import java.io.Serializable;

public class JavaBeans {
    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.setNombre("Pablo");
        persona.setApellido("Veiga");
        System.out.println(persona);
    }
}

// Debemos implementar la interfaces Serializable
class Persona implements Serializable {

    // Tener encapsulamiento
    private String nombre;
    private String apellido;

    // JavaBeans debe de tener como minimo un constructor vacio
    public Persona(){

    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}
