import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {

        /*
            Creaciones de colecciones de Interfaces de tipo Set
            Este tipo de coleccion tambien es conocida como estructura de datos
         */

        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Pablo");
        conjunto.add("Pablo"); // El Set va a ignorar los valores Repetidos
        conjunto.add("Sophia");
        conjunto.add("Sophia");
        conjunto.add("Sophia");
        conjunto.add("Romina");
        conjunto.add("Romina");
        conjunto.add("Romina");

        conjunto.forEach(System.out::println);

        // Remover un elemento
        conjunto.remove("Romina");

        System.out.println("\nNuevos elementos del Set: ");
        conjunto.forEach(System.out::println);

    }
}
