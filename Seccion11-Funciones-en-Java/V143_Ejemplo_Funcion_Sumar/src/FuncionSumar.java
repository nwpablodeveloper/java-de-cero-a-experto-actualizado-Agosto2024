public class FuncionSumar {

    // Definir función de sumar
    static int sumar(int a, int b){
        var resultado =  a + b;
        return resultado;
    }

    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        var resultadoFuncion = sumar(arg1, arg2);
        System.out.println("resultadoFuncion = " + resultadoFuncion);
    }
}
