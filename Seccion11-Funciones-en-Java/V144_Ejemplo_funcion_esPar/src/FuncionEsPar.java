import java.util.Scanner;

public class FuncionEsPar {

    // Definir Función
    static boolean esPar(int numero){
        return numero % 2 == 0;
    }

    public static void main(String[] args) {

        System.out.print("Proporciona un valor entero: ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Número par? " + esPar(numero));

    }
}
