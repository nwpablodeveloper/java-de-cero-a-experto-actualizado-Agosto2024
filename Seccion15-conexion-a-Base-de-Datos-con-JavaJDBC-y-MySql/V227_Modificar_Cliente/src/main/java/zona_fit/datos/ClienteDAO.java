package zona_fit.datos;

import static  zona_fit.conexion.Conexion.getConection;
import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes(){
        List<Cliente> clientes = new ArrayList<>();
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConection();
        var sql = "SELECT * FROM clientes ORDER BY id";
        try {
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()){ // Leemos linea por linea, si no hay es null
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        }catch (Exception e){
            System.out.println("Error al listar clientes de la DB: " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la coneción: " + e.getMessage());
            }
        }

        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente){
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConection();
        var sql = "SELECT * FROM clientes WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId()); // Indicamos el ID a buscar con este argumento
            rs = ps.executeQuery();
            if(rs.next()){
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        }catch (Exception e){
            System.out.println("Error al buscar al cliente por ID: " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conección al buscar por ID: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConection();
        var sql = "INSERT INTO clientes (nombre, apellido, membresia)" +
                "VALUES (?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3, cliente.getMembresia());
            ps.execute();
            return true;
        }catch (Exception e){
            System.out.println("Error al agregar cliente: " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch (Exception e){
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        return false;
    }

    public static void main(String[] args) {
        var clienteDao = new ClienteDAO();

        // ------------------------------------------------------


        // ------------------------------------------------------
        System.out.println("\n*** Buscar Cliente por id ***");

        var cliente1 = new Cliente(5);
        // Mostramos el resto de los atributos que estan por default
        System.out.println("ID 5:  " + cliente1);
        var encontrado = clienteDao.buscarClientePorId(cliente1);
        if (encontrado){
            System.out.println("encontrado = " + encontrado);
        }else{
            System.out.println("No se encontro ningun cliente de ID: " + cliente1.getId());
        }

        // ------------------------------------------------------
        System.out.println("\n*** Agregar Cliente ***");
        var nuevoCliente = new Cliente("Pablo", "Veiga", 151);
        System.out.println("Se agrega: " + nuevoCliente);
        var agregado = clienteDao.agregarCliente(nuevoCliente);
        if (agregado)
            System.out.println("Cliente Agregado: " + nuevoCliente);
        else
            System.out.println("No se agrego el Cliente");
        // ------------------------------------------------------

        System.out.println("\n*** Listado de Clientes ***");

        var clientes = clienteDao.listarClientes();
        clientes.forEach(elem -> {
            System.out.println("cliente = " + elem);
        });


    }
}
