public class ForEach {
    public static void main(String[] args) {

        int edades[] = {10,20,30,50,9,8,36,35};

        /*
            A diferencia del ciclo for normal ahora simplificaremos con una variable
            que se va a encargar de almacenar el valor que intere el ciclo.
            Desventaja, no tenemos acceso a los indice
         */
        for (int edad : edades){
            System.out.println("Edad: " + edad);
        }
    }
}
