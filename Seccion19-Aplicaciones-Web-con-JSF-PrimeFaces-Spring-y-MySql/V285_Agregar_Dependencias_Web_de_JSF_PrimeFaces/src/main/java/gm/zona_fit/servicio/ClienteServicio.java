package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import gm.zona_fit.repositorio.ClienteRepositorio;

import java.util.List;

public class ClienteServicio implements IClienteServicio{

    @Autowired
    ClienteRepositorio clienteRepositorio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteRepositorio.findAll();
    }

    @Override
    public Cliente buscarCliente(Integer idCliente) {
        return clienteRepositorio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarCliente(Cliente cliente) {
        clienteRepositorio.save(cliente);
    }

    @Override
    public void eliminarCliente(Cliente cliente) {
        clienteRepositorio.delete(cliente);
    }
}
