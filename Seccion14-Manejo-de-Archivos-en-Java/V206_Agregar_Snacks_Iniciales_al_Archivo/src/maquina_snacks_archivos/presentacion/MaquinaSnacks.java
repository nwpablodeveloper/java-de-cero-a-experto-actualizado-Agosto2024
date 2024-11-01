package maquina_snacks_archivos.presentacion;

import maquina_snacks_archivos.dominio.Snack;
import maquina_snacks_archivos.servicio.IServicioSnacks;
import maquina_snacks_archivos.servicio.ServicioSnacksArchivos;
import maquina_snacks_archivos.servicio.ServicioSnacksLista;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MaquinaSnacks {
    public static void main(String[] args) {
        maquinaSnacks();
    }

    public static void maquinaSnacks(){
        var salir = false;
        var consola = new Scanner(System.in);

        // Instanciamos la capa de servicios
        IServicioSnacks servicioSnacks = new ServicioSnacksArchivos();

        List<Snack> productos = new ArrayList<>();
        System.out.println("*** Maquína de Snacks ***");
        servicioSnacks.mostrarSnacks();

        while (!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos, servicioSnacks);
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

    private static boolean ejecutarOpciones(
            int opcion,
            Scanner consola,
            List<Snack> productos,
            IServicioSnacks servicioSnacks){

        var salir = false;
        switch (opcion){
            case 1 -> comprarSnack(consola, productos, servicioSnacks);
            case 2 -> mostrarTicket(productos);
            case 3 -> agregarSnack(consola, servicioSnacks);
            case 4 -> {
                System.out.println("Gracias por su visita");
                salir = true;
            }
            default -> System.out.println("OPCIÓN NO VALIDA");
        }
        return salir;
    }

    private static void comprarSnack(Scanner consola, List<Snack> productos, IServicioSnacks serviciosSnacks){
        System.out.print("Que snack quieres comprar (id)? ");
        var idSnack = Integer.parseInt(consola.nextLine());
        System.out.println("idSnack = " + idSnack);

        // Validar que el snack exista en la lista de snacks
        var snackEncontrado = false;
        for(var snack : serviciosSnacks.getSnacks()){
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

    private static void agregarSnack(Scanner consola, IServicioSnacks serviciosSnacks){
        System.out.print("Nombre del nuevo Snack? ");
        var nombre = consola.nextLine();
        System.out.print("Precios del nuevo Snack? ");
        var precio = Double.parseDouble(consola.nextLine());
        serviciosSnacks.agregarSnack(new Snack(nombre, precio));
        serviciosSnacks.mostrarSnacks();

    }
}
