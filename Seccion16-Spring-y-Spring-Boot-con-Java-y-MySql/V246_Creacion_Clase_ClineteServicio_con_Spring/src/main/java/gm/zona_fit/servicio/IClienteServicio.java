package gm.zona_fit.servicio;

import gm.zona_fit.modelo.Cliente;

import java.util.List;

public interface IClienteServicio {
    public List<Cliente> listarClientes();
    public Cliente buscarCliente(Integer idCliente);

    // Actualiza o guarda dependiendo del ID si lo recibe Null o no
    public  void guardarCliente(Cliente cliente);

    public void eliminarCliente(Cliente cliente);
}
