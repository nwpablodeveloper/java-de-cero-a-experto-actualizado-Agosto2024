package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ClienteServicio implements IClienteServicio{

    @Autowired
    ClienteRepositorio clienteServicio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteServicio.findAll();
    }

    @Override
    public Cliente buscarclientePorId(Integer idCliente) {
        return clienteServicio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteServicio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteServicio.delete(cliente);
    }
}
