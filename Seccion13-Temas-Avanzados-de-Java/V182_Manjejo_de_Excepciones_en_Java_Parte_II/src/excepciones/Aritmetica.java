package excepciones;

import java.util.concurrent.TimeoutException;

public class Aritmetica {

    public static int division(int numerador, int denominador){

        if (denominador == 0){
            /*
                disparamos un error en tiempo de ejecución
                Esta Excepción se va a reportar a la clase por cual fue llamada
             */
            throw new RuntimeException("División entre Cero");
        }

        var resultado = numerador /  denominador;
        return resultado;

    }
}
