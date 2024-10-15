/*
    El nombre del paquete debe de ser lo primero que se tiene
    que ver en la definición de una Clase
 */
package aritmetica;

public class Aritmetica {

    int operando1;
    int operando2;

    public Aritmetica(){
        System.out.println("Constructor vacio");
    }

    public Aritmetica(int operando1, int operando2){
        System.out.println("Constructor de sobrecarga con parametros");

        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Dir. del Objeto que se ejectua: " + this);
    }

    void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Suma = " + resultado);
    }

    void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resta = " + resultado);
    }

    public static void main(String[] args) {

        var aritmetica1 = new Aritmetica(5, 7);
        aritmetica1.sumar();
        aritmetica1.restar();
        var aritmetica2 = new Aritmetica(55, 7);
        aritmetica2.sumar();
        aritmetica2.restar();

        System.out.println("Dir. Mememoria Objeto1: " + aritmetica1);
        System.out.println("Dir. Mememoria Objeto2: " + aritmetica2);


    }

}
