package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppZonaFit {
    public static void main(String[] args) {

        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        IClienteDAO clienteDao = new ClienteDAO();

        System.out.println("\n*** Sistema Zona Fit ***");

        while (!salir){
            try{
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpcion(opcion, consola, clienteDao);
            }catch (Exception e){
                System.out.println("Error en la opción del menú: " + e.getMessage());
            }

        }
    }

    public static int mostrarMenu(Scanner consola){
        System.out.print("""
                \nMenú:
                1. Listar todos los Clientes
                2. Buscar Cliente por ID
                3. Agregar un Cliente
                4. Modificar un Cliente
                5. Eliminar un Cliente
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    public static boolean ejecutarOpcion(int opcion, Scanner consola, IClienteDAO clienteDAO ){
        var salir = false;
        switch (opcion){
            case 1 -> listarClientes(clienteDAO);
            case 2 -> buscarClienteporId(consola, clienteDAO);
            case 6 -> {
                System.out.println("Lo esperamos de regreso, Bye!");
                salir = true;
            }
            default -> {
                System.out.println("Opción no valida");
            }
        }
        return salir;
    }

    public static void listarClientes(IClienteDAO clienteDAO){
        limpiarConsola();
        System.out.println("\n--- Lista de Clientes ---");
        List<Cliente> clientes;
        clientes = clienteDAO.listarClientes();
        clientes.forEach(System.out::println);
    }

    public static void buscarClienteporId(Scanner consola, IClienteDAO clienteDAO){
        System.out.println("\n--- Buscar Cliente por ID ---");
        System.out.print("Ingrese el ID del cliente: ");
        clienteDAO.buscarClientePorId(new Cliente(Integer.parseInt(consola.nextLine())));

    }

    public static void limpiarConsola(){
        for (var i = 0; i <50; i ++)
            System.out.println();
    }
}
