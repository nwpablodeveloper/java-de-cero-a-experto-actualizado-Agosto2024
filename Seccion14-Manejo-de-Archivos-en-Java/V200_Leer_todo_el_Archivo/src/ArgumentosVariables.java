public class ArgumentosVariables {
    public static void main(String[] args) {

        imprimirNumeros(1, 2, 3, 4, 5);
        System.out.println();
        imprimirNumeros(1,  7, 8, 9, 10);

        System.out.println("Varios argumentos de diferente tipo y varArgs");
        // Los argumentos que son variables tienen que ir al final de la firma
        variosParametros("Pablo", 36, 9, 35);


    }
/*
//    Los argumentos variables siempre tienen que estar al final de la firma
    static void variosParametros(int... numeros, String nombre){
        System.out.println(nombre);
        imprimirNumeros(numeros);
    }
*/

    static void variosParametros(String nombre, int... numeros){
        System.out.println(nombre);
        imprimirNumeros(numeros);
    }

    /*
        Con no sabemos la cantidad de paramaetros a recibir podemos definir
        el tipo de dato seguido de 3 puntos, de forma automatica se va a generar
        un arreglo de ese tipo de datos con todos los parametros recibidos
     */
    static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
/*
    private static void imprimirNumeros(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
    }
*/

}
