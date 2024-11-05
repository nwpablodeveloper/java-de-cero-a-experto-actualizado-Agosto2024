package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.List;
import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {

        ZonaFitApp();

    }

    private static void ZonaFitApp(){
        boolean salir = false;
        Scanner consola = new Scanner(System.in);
        IClienteDAO clienteDao = new ClienteDAO();

        while (!salir){
            try{
                int opcion = mostrarMenu(consola);
                salir = ejecutarOpcion(opcion, consola, clienteDao);
            }catch (Exception e){
                System.out.println("Error al elegir la opción del menú: " + e.getMessage());
            }
        }

    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                \n*** Zona Fit App ***
                Menú:
                1. Listar Clientes
                2. Agregar nuevo cliente
                3. Buscar Cliente por ID
                4. Modificar cliente
                5. Eliminar cliente
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpcion(int opcion, Scanner consola, IClienteDAO clienteDao){
        var salir = false;
        switch(opcion){
            case 1 -> listarClientes(clienteDao);
            case 2 -> agregarCliente(consola, clienteDao);
            case 3 -> buscarClientePorId(consola, clienteDao);
            case 4 -> modificarCliente(consola, clienteDao);
            case 5 -> eliminarCliente(consola, clienteDao);
            case 6 -> {
                System.out.println("Lo esperamos pronto, Bye!");
                return true;
            }
            default -> {
                System.out.println("Opción no valida");
            }
        }
        return salir;
    }

    private static void listarClientes(IClienteDAO clienteDAO){
        List<Cliente> clientes;
        clientes = clienteDAO.listarClientes();

        if (!clientes.isEmpty())
            clientes.forEach(System.out::println);
        else
            System.out.println("No hay clientes cargados");
    }

    private static void agregarCliente(Scanner consola, IClienteDAO clienteDao){
        Cliente cliente = new Cliente();
        System.out.print("Nombre del cliente: ");
        cliente.setNombre(consola.nextLine());
        System.out.print("Apellido del cliente: ");
        cliente.setApellido(consola.nextLine());
        System.out.print("Membresia del cliente: ");
        cliente.setMembresia(Integer.parseInt(consola.nextLine()));

        if(clienteDao.agregarCliente(cliente)){
            System.out.printf("""
                    Cliente: %s
                    Fue agregado exitosamente
                    """, cliente);
        }
    }

    private static void buscarClientePorId(Scanner consola, IClienteDAO clienteDao){

        System.out.print("Ingrese el nro. de ID de Cliente: ");
        Cliente cliente = new Cliente(Integer.parseInt(consola.nextLine()));

        if(clienteDao.buscarClientePorId(cliente))
            System.out.println("Se encontro 1 cliente con ID: " + cliente.getId());
        else
            System.out.println("No se encontraron resultados");

    }

    private static void modificarCliente(Scanner consola, IClienteDAO clienteDao){
        Cliente cliente = new Cliente();
        System.out.print("ID del cliente a modificar? ");
        cliente.setId(Integer.parseInt(consola.nextLine()));
        System.out.print("Nombre a modificar? ");
        cliente.setNombre(consola.nextLine());
        System.out.print("Apellido a modifar? ");
        cliente.setApellido(consola.nextLine());

        if(clienteDao.modificarCliente(cliente)) {
            System.out.println("El cliente fue modifado exitosamente");
            listarClientes(clienteDao);
        }
    }

    private static void eliminarCliente(Scanner consola, IClienteDAO clienteDao){
        Cliente cliente = new Cliente();
        System.out.print("Cúal es el ID del cliente que quiere borrar? ");
        cliente.setId(Integer.parseInt(consola.nextLine()));

        if(clienteDao.eliminarCliente(cliente)){
            System.out.println("Se elimino el cliente con ID: " + cliente.getId());
        }

    }
}


















