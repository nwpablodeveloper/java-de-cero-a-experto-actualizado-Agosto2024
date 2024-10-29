package maquina_snacks;

import java.util.ArrayList;
import java.util.List;

public class Snacks {

    private static final List<Snack> snacks;

    // Bloque de tipo Estatico inicializador
    // Inicializar atributos estaticos
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    public static void agregarSnack(){
        var inventarioSnacks = "";
        for (var snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }
}
