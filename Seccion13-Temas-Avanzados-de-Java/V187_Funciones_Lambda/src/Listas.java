import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {

        /*
            Usamos Picos Parentesis para indicar el tipo de dato que va almacenar
            nuestra lista
         */
        List<String> miLista = new ArrayList();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Acepta Duplicados
        // miLista.add(3434); ERROR, Ya definimos la Lista que almacena solo Strings

        // Ya le podemos indicar el tipo de dato para interar la lista
        for (String dia : miLista){
            System.out.println("Día de la semana: " + dia);
        }

        /*
            Otra forma de poder interar los elementos de nuestra lista es con una
            Funciones Lambda, es una fución anoníma de un codigo muy compacto.
            Tambien conocida como programación funcional
         */
        System.out.println();
        System.out.println("Funcion Lambda");
        miLista.forEach( elemento -> {
            System.out.println("Elemento: " + elemento);
        });



    }
}
