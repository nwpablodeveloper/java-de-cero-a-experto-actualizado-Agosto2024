public class Aritmetica {

    // Atributos
    int operando1;
    int operando2;

    // Métodos

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Suma = " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resta = " + resultado);
    }

    public static void main(String[] args) {

        // Creación del 1er objeto
        var arimetica1 = new Aritmetica(); // Instanciamos
        arimetica1.operando1 = 5;
        arimetica1.operando2 = 7;
        arimetica1.sumar();
        arimetica1.restar();

        System.out.println();

        // Creación del 2do Objeto
        var aritmetica2 = new Aritmetica(); // Instanciamos
        aritmetica2.operando1 = 12;
        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();

    }

}
