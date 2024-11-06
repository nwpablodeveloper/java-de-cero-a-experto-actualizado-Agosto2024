package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;

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
                clientes.forEach(System.out::print);
            }
        }
        return salir;
    }
}
