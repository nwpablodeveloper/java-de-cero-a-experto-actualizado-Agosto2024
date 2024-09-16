import java.util.Scanner;

public class ValorDentroRango {
    public static void main(String[] args) {
        /*
            - Realizar un programa para saber si el valor proporcionado se
            encentra dentro de un rango definido ( Entre 0 y 5 )
         */
        System.out.println("\n*** Valor dentro Rango ***");

        // Definir los limites
        final int MINIMO = 0;
        final int MAXIMO = 5;
        
        // Solicitar un valor entre 0 y 5
        System.out.print("\nProporciona un valor entre 0 y 5: ");

        int dato = new Scanner(System.in).nextInt();

        // Verificar si esta dentro de rango
        var estaDentroRango = dato >= MINIMO && dato <= MAXIMO ;
        System.out.println("Esta dentro de Rango?: " + estaDentroRango);


    }
}
