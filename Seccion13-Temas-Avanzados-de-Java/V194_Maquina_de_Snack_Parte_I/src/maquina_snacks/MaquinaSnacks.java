package maquina_snacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
;

public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        // Creamos la lista de productos de tipo Snack
        List<Snack> productos = new ArrayList<>();
        System.out.println("\n*** Maquína de Snacks ***");
        Snacks.mostrarSnacks();

        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
//                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.printf("""
                Menú:
                1. Comprar Snack
                2. Mostrar Ticket
                3. Agregar nuevo snack
                4. Salir
                Eleige una opción:\s""");
        return consola.nextInt();

    }

}
