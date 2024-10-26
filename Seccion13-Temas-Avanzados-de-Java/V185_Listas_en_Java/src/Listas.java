import java.util.ArrayList;
import java.util.List;

public class LIstas {
    public static void main(String[] args) {

        /*
            Usamos el timpo mas generico de la interface y luego instanciamos una
            de sus Clases Hijas
         */
        List miLista = new ArrayList();

        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        miLista.add("Domingo"); // Acepta Duplicados
        miLista.add("Domingo");

        for (Object dia : miLista){
            System.out.println("Día de la semana: " + dia);
        }

    }
}
