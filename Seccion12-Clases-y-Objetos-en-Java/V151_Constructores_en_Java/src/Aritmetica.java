public class Aritmetica {

    // Atributos
    int operando1;
    int operando2;

    /*
        Constructor
        El constructor se va a ejecutar cada vez que se instancia un objeto
        Podemos recibir directamente los argumentos para dar valor a los
        atributos en el momento de la instancia del objeto.
     */
    public Aritmetica(int op1, int op2){
        System.out.println("Ejecuntando el Constructor");
        operando1 = op1;
        operando2 = op2;
    }

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
        // Usamos el constructor para cargar los valores de los atributos
        var arimetica1 = new Aritmetica(5, 7); // Instanciamos
//        arimetica1.operando1 = 5;
//        arimetica1.operando2 = 7;
        arimetica1.sumar();
        arimetica1.restar();

        System.out.println();

        // Creación del 2do Objeto
        // Usamos el constructor para cargar los valores de los atributos
        var aritmetica2 = new Aritmetica(12, 16);
//        aritmetica2.operando1 = 12;
//        aritmetica2.operando2 = 16;
        aritmetica2.sumar();
        aritmetica2.restar();
    }

}
