package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.util.List;

public interface IClienteDAO {
    List<Cliente> listarClientes();
    boolean insertarCliente(Cliente cliente);
    boolean actualizarClientePorId(Cliente cliente);
    boolean eliminarCliente(Cliente cliente);
}
