/*
    El nombre del paquete debe de ser lo primero que se tiene
    que ver en la definición de una Clase
 */
package aritmetica;

public class Aritmetica {

    int operando1;
    int operando2;

    public Aritmetica(){
    }

    public Aritmetica(int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public void sumar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("Suma = " + resultado);
    }

    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("Resta = " + resultado);
    }


}
