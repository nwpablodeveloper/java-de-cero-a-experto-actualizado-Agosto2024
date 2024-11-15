package gm.zona_fit.repositorio;

import gm.zona_fit.modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/*
    Extendemos de la clase JpaRepository
    - Indicamos con el Tipo de dato que vamos a trabajar (Cliente en este caso )
    - Indicamos el tipo de dato de la llave primaria (Integer)
    Con estos datos vamos a poder recuperar los objetos del tipo de dato
    a trabajar
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer> {
    /*
        Esta interfaces extiende de la Interface JpaRepository
        Se encarga de trabajar todos los metodos para trabjar con la
        base de datos de la Entidad declarada, en este caso estamos con la
        entidad Cliente
        @Entity en la clase
     */
}
