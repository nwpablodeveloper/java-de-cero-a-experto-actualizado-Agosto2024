package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitApp {
    public static void main(String[] args) {
        ZonaFitApp();
    }

    private static void ZonaFitApp(){
        var salir = false;
        var consola = new Scanner(System.in);

        // Creamos un objeto de la clase ClienteDao
        IClienteDAO clienteDao = new ClienteDAO();

        while (!salir) {
            try{
                var opcion =mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            }catch (Exception e){
                System.out.println("Error al ejecutar opciones del menú: " + e.getMessage());
            }
            System.out.println();
        }
    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** zona Fit (GYM)
                1. Listar Clientes
                2. Buscar Cliente
                3. Agregar Cliente
                4. Modificar Cliente
                5. Eliminar Cliente
                6. Salir
                Elige una opción:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion, IClienteDAO clienteDao){
        var salir = false;
        switch (opcion){
            case 1 -> { // 1. Listar Clientes
                var clientes = clienteDao.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 -> { // 2. Buscar Cliente por ID
                System.out.print("Introduce el ID del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDao.buscarClientePorId(cliente);
                if(encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else
                    System.out.println("No se encontro ningun cliente");
            }
            case 3 -> { // 3. Agregar Cliente
                System.out.println("--- Agregar Cliente ---");
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());

                // Creamos el objeto
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDao.agregarCliente(cliente);
                if (agregado)
                    System.out.println("Cliente agregado");
                else
                    System.out.println("No se agrego");
            }
            case 4 -> { // 4. Modificar cliente
                System.out.println("--- Modificar Cliente ---");
                System.out.print("ID cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.print("Nombre: ");
                var nombre = consola.nextLine();
                System.out.print("Apellido: ");
                var apellido = consola.nextLine();
                System.out.print("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente, nombre, apellido, membresia);
                var modificado = clienteDao.modificarCliente(cliente);
                if (modificado)
                    System.out.println("El cliente fue modificado");
                else
                    System.out.println("No se pudo modificar");
            }
            case 5 -> { // 5. Eliminar cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.print("Id Cliente");
                var idCliente = Integer.parseInt(consola.nextLine());
                var eliminado = clienteDao.eliminarCliente(new Cliente(idCliente));
                if (eliminado)
                    System.out.println("Se elimino el Cliente");
                else
                    System.out.println("No se elimino ");
            }
            case 6 -> { // 6. Salir
                System.out.println("Hasta pronto");
                salir = true;
            }
            default -> {
                System.out.println("Opción no reconocida");
            }
        }
        return salir;
    }



}
