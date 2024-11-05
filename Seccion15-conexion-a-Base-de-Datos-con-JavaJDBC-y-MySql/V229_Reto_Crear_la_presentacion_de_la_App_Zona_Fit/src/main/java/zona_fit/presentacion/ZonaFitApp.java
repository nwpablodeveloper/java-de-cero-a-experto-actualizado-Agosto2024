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
}


















