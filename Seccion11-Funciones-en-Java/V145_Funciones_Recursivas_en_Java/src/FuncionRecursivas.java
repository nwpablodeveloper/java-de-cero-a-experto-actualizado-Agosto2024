public class FuncionRecursivas {

    /*
        Imprimir los valores del 1 al 5
     */

    static void funcionRecursiva(int numero){
        // Caso base
        if(numero == 1){
            System.out.print(numero + " ");
        }else{
            // Caso recursivo
            funcionRecursiva(numero - 1);
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
