package aritmetica;

public class Aritmetica {

    public int operador1;
    public int operador2;

    public Aritmetica() {
    }

    public Aritmetica(int operador1, int operador2) {
        this.operador1 = operador1;
        this.operador2 = operador2;
    }

    public void sumar(){
        var resultado = this.operador1 + this.operador2;
        System.out.println("Resultado suma = " + resultado);
    }

    public void restar() {
        var resultado = this.operador1 - this.operador2;
        System.out.println("Resultado resta = " + resultado);
    }

    public int getOperador1(){
        return this.operador1;
    }

    public void setOperador1(int operando1){
        this.operador1 = operando1;
    }

    public int getOperador2(){
        return this.operador2;
    }

    public void setOperador2(int operador2){
        this.operador2 = operador2;
    }


}
