package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    public static Connection getConection(){
        Connection conexion = null;
        var baseDatos = "zona_fit_db";
        var url = "jdbc:mysql://localhost:3306/"+baseDatos;
        var usuario = "root";
        var password = "admin";

        try {
            // Esto se conoce como la clase de conexión a la DB
            // Se van a cargar los siguientes paquetes a la Clase en memoria
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e){
            System.out.println("Error al conectarse a la DB: " + e.getMessage());
        }

        return conexion;
    }

    // Probando la conexión
    public static void main(String[] args) {
        var conexion = Conexion.getConection();
        if (conexion != null){
            System.out.println("conexion = " + conexion);
        }else{
            System.out.println("Error al conectarse");
        }

    }
}
