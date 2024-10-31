import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        /*
            Cración de Colección de Interface de tipo Map.
            En este ejemplo el tipo de dato para sus llaves va ser String
            y para sus valores tambien va a ser String
            <String, String>
         */

        Map<String, String> persona = new HashMap();

        persona.put("nombre", "Pablo");
        persona.put("apellido", "Veiga");
        persona.put("calle", "Benteveo");
        persona.put("edad", "30");
        // miMapa.put("edad", "36"); // IGNORA las llaves duplicadas

        System.out.println("\n Imprimir los valores del mapa o diccionario: ");

        persona.entrySet().forEach(System.out::println);


        persona.put("edad", "36"); // Para reemplazar el valor en una llava
        persona.remove("calle"); // Remueve una llave y su valor

        System.out.println("\nValores editados: ");
        persona.entrySet().forEach(System.out::println);

        // Iterar sobre los elementos del mapa por separado
        System.out.println("\nInterar los elementos del mapa juntos o por separado: ");
        /*
        persona.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
        */
        persona.forEach((key, value) -> System.out.println(key + ": " + value));
    }
}
