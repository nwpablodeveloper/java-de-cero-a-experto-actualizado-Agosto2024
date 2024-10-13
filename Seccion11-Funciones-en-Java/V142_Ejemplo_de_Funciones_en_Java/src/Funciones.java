public class Funciones {

    /*
        Función declarada, los contenidos recibidos son llamados como
        parametros
     */
    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    public static void main(String[] args) {
        // Funciones en Java
        // Los contendios enviados los llamamos Argumentos
        saludar("Hola desde Java");
        saludar("Adios!");
    }
}
