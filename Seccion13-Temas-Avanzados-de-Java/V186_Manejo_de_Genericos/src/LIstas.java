import java.util.ArrayList;
import java.util.List;

public class LIstas {
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

    }
}
