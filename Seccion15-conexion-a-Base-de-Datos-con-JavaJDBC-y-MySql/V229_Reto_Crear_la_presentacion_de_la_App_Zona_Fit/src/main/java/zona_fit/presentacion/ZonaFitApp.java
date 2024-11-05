package zona_fit.presentacion;

import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDAO;

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
            }catch (Exception e){
                System.out.println("Error al elegir la opción del menú: " + e.getMessage());
            }
        }

    }

    private static int mostrarMenu(Scanner consola){
        System.out.print("""
                *** Zona Fit App ***
                Menú:
                1. Listar Clientes
                2. Buscar Cliente por ID
                3. Agregar nuevo cliente
                4. Modificar cliente
                5. Eliminar cliente
                6. Salir""");
        return Integer.parseInt(consola.nextLine());
    }
}
