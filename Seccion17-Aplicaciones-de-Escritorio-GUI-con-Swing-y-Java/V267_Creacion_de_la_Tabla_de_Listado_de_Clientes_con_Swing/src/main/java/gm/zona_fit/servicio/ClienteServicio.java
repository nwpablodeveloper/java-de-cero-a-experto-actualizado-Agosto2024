package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;
import gm.zona_fit.repositorio.ClienteRespositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServicio implements IClienteServicio{

    @Autowired
    ClienteRespositorio clienteServicio;

    @Override
    public List<Cliente> listarClientes() {
        return clienteServicio.findAll();
    }

    @Override
    public Cliente buscarClientePorId(Integer idCliente) {
        return clienteServicio.findById(idCliente).orElse(null);
    }

    @Override
    public void guardarModidifcarCliente(Cliente cliente) {
        clienteServicio.save(cliente);
    }

    @Override
    public void eliminiarCliente(Cliente cliente) {
        clienteServicio.delete(cliente);
    }
}
