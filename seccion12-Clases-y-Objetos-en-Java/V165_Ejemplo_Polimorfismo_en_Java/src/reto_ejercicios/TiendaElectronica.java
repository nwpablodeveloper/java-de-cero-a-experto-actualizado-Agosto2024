package reto_ejercicios;

public class TiendaElectronica {
    /*
        Tienda de Electrónicos
        Clases: Producto, Computadora, Celular, Televisor.
        Polimorfismo: El metodo mostrarInformacion() se sobrescribe en cada subclase para mostrar
            detalles específicos de cada producto (procesador, cámara, resolución, etc.).
        Ejercicio: Crea un arreglo de objetos Producto y recorre el arreglo, llamando al
            metodo mostrarInformacion() para cada elemento.
            Observa cómo se muestra la información de cada producto de forma diferente.
     */

    static void mostrarInformacion(Producto producto){
        producto.mostrarInformacion();
    }

    public static void main(String[] args) {

    }

}

class Producto {

    protected void mostrarInformacion(){
        System.out.println("Detalle del prodúcto");
    }

}

class Computadora extends Producto{

    @Override
    public void  mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("");
    }
}

class Celular extends Producto{

}

class Televisor extends Producto{

}

