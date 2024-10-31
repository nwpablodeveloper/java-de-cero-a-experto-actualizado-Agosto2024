public class Aritmetica {

    // Atributos
    int operando1;
    int operando2;

    /*
        Debemos de tener un constructor vacio si es que queremos instanciar
        Objetos sin valores a los atributos
     */
    public Aritmetica(){
        System.out.println("Constructor vacio");
    }

    /*
        Ahora obtendremos un sobrecarga de constructores al tener declarado
        más de un constructor
     */
    public Aritmetica(int op1, int op2){
        System.out.println("Constructor de sobrecarga con parametros");
        operando1 = op1;
        operando2 = op2;
    }

    void sumar(){
        var resultado = operando1 + operando2;
        System.out.println("Suma = " + resultado);
    }

    void restar(){
        var resultado = operando1 - operando2;
        System.out.println("Resta = " + resultado);
    }

    public static void main(String[] args) {
        /*
            Para instaciar el objeto sin pasar valores de los atributos
            debemos de tener un constructor vacio.
         */
        var aritmetica1 = new Aritmetica();
        aritmetica1.sumar();

        // Creando un Objeto con un constructor de sobrecarga
        var artimetica2 = new Aritmetica(2, 3);
        artimetica2.sumar();

    }

}
