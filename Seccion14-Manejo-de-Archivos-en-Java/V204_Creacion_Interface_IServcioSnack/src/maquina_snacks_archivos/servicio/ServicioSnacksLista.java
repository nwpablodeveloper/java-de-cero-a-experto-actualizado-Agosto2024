package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {

    private static final List<Snack> snacks;

    // Bloque de tipo Estatico inicializador
    // Inicializar atributos estaticos
    static {
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas", 70));
        snacks.add(new Snack("Refresco", 50));
        snacks.add(new Snack("Sandwich", 120));
    }

    @Override
    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    @Override
    public  void mostrarSnacks(){
        var inventarioSnacks = "";
        for (var snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks(){
        return snacks;
    }

}
