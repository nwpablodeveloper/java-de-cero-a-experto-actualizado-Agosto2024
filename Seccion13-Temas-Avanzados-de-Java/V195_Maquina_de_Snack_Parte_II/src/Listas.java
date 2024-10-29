import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        List<String> miLista = new ArrayList();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Acepta Duplicados

        /*
        for (String dia : miLista){
            System.out.println("Día de la semana: " + dia);
        }
        */

        /*
            Otra forma de poder interar los elementos de nuestra lista es con una
            Funciones Lambda, es una fución anoníma de un codigo muy compacto.
            Tambien conocida como programación funcional
        System.out.println();
        System.out.println("Funcion Lambda");
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        });
         */

        // Uso de Metodo Referenciado
        miLista.forEach(System.out::println);


        // Otra Forma de crear una lista
        System.out.println("\nLista de Nombres: ");
        List<String> nombres = Arrays.asList("Pablo", "Romina", "Sophia");

        nombres.forEach(System.out::println);

    }
}
