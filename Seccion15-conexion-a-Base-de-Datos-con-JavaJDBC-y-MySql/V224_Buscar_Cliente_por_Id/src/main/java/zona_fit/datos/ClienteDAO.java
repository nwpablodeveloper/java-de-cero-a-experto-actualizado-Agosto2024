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
    public boolean actualizarClientePorId(Cliente cliente) {
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        return false;
    }

    @Override
    public boolean insertarCliente(Cliente cliente) {
        return false;
    }

    public static void main(String[] args) {
        System.out.println("*** Listado de Clientes ***");
        var clienteDao = new ClienteDAO();
        var clientes = clienteDao.listarClientes();
        clientes.forEach(elem -> {
            System.out.println("cliente = " + elem);
        });
    }
}
