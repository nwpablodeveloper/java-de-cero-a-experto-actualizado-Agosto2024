package maquina_snacks_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

// Aplicamos el concepto de JavaBeans
public class Snack implements Serializable {

    private static int contadorSnacks = 0;
    private int idSnack;
    private String nombre;
    private double precio;


    public Snack(){
        this.idSnack = Snack.contadorSnacks++;
    }

    public Snack(String nombre, double precio){
        this();                 // Llamamos al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public static int getContadorSnack() {
        return Snack.contadorSnacks;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
