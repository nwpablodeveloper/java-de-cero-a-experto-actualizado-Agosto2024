package gm.zona_fit.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

/*
    Entity Para representar a una Clase como una entidad de Base de
    datos, representara a cada instancia como un registro
*/

// ANOTACIONES Jakarta
@Entity             // Declarmos a esta Clase como Clase de Identidad
// ANOTACIONES lombok
@Data               // Generar los metodos Gets y Sets de cada atributo declarado
@NoArgsConstructor  // Declara constructor sin argumentos
@AllArgsConstructor // Constructor con todos los argumentos
@EqualsAndHashCode  // Comparador Equals and Hash
@ToString           // Metodo toString
public class Cliente {

    @Id // Indicamos a "jakarte" como Clave primaria
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    /*
        IDENTITY El valor de la clave primaria se genera por la base de datos misma
        MySql en este caso
     */

    private Integer Id;         // Al ser Integer por default es Null y no 0
    private String nombre;
    private String apellido;
    private Integer membresia;
}
