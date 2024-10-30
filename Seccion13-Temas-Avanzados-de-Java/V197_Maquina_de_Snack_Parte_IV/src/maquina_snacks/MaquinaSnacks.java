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
                
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch (Exception e){
                System.out.println("Ocurrio un error: " + e.getMessage());
            }finally {
                System.out.println();
            }
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                Menú:
                1. Comprar Snack
                2. Mostrar Ticket
                3. Agregar nuevo snack
                4. Salir
                Eleige una opción:\s""");
        return Integer.parseInt(consola.nextLine());

    }

    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos){
        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, productos);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Gracias por su visita");
                salir = true;
            }
            default -> System.out.println("OPCIÓN NO VALIDA");
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos){
        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        System.out.println("idSnack = " + idSnack);

        // Validar que el snack exista en la lista de snacks
        var snackEncontrado = false;
        for(var snack : Snacks.getSnacks()){
            if(idSnack == snack.getIdSnack()){
                // Agregamos el snak a la lista de productos
                productos.add(snack);
                System.out.println("Ok, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("id de Snack no encontrado: " + idSnack);
        }
    }

    private static void mostrarTicket(List<Snack> productos){
        var ticket = "*** Ticket de Venta ***";
        var total = 0.0;
        for (var producto : productos){
            ticket += "\n\t- " + producto.getNombre() + " - $ " + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $ " + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola){
        System.out.print("Nombre del nuevo Snack? ");
        var nombre = consola.nextLine();
        System.out.print("Precios del nuevo Snack? ");
        var precio = Double.parseDouble(consola.nextLine());
        Snacks.agregarSnack(new Snack(nombre, precio));
        Snacks.mostrarSnacks();

    }
}
