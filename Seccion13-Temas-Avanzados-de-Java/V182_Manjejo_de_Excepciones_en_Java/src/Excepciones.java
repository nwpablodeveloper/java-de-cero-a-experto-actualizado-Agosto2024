public class Excepciones {
    public static void main(String[] args) {

        int valor1 = 10, valor2 = 0;

        // Controlar un excepción
        try{
            int resultado = valor1 / valor2;
            System.out.println("resultado = " + resultado);
            // Expception es la clase Padre de todas ls Excepciones
        }catch (Exception e){
            System.out.println("Ocurrio un error: \n\t" + e);
        }

    }
}
