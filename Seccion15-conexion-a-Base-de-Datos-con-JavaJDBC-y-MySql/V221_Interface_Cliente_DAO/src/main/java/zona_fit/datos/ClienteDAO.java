package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteDAO implements IClienteDAO{

    @Override
    public List<Cliente> listarClientes(){
        return null;
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
}
