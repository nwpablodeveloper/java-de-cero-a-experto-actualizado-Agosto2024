package prueba;
import aritmetica.Aritmetica;

public class PruebaAritmetica {

    public static void main(String[] args) {

        var aritmetica1 = new Aritmetica(5, 7);
        /*
            Necesitamos que los métodos sean declarados de forma Public
            para poder hacer uso de los mimso desde otro paquete
         */

        aritmetica1.sumar();
        aritmetica1.restar();
        var aritmetica2 = new Aritmetica(55, 7);
        aritmetica2.sumar();
        aritmetica2.restar();
    }

}
