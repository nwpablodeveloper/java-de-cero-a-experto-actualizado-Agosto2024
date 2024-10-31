package prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {

        var aritmetica1 = new Aritmetica(5, 7);
        /*
            Acceder a los atributos de ls Clase por medio de los Métodos
            públicos Get y Set
         */
        System.out.println("\nAtributo operando1 = " + aritmetica1.getOperador1());
        System.out.println("Atributo operando2 = " + aritmetica1.getOperador2());
        aritmetica1.sumar();
        aritmetica1.restar();

        // Modificar
        aritmetica1.setOperador1(9);
        aritmetica1.setOperador2(10);
        System.out.println("\nAtributo operando1 = " + aritmetica1.getOperador1());
        System.out.println("Atributo operando2 = " + aritmetica1.getOperador2());
        aritmetica1.sumar();
        aritmetica1.restar();


    }
}
