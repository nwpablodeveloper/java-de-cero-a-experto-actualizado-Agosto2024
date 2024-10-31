package archivos;

import java.nio.file.*;
import java.util.List;

public class LeerTodo {
    public static void main(String[] args) {
        var nombreArchivo = "mi_archivo.txt";

        try{
            // Leer todas las lineas del archivo
            List<String> lineas = Files.readAllLines(Paths.get(nombreArchivo));
            System.out.println("List<String> = " + lineas);

            /*for (var linea : lineas){
                System.out.println( linea);
            }*/

            // Interar con expresiónLambda
            lineas.forEach(System.out::println);

        }catch (Exception e){
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

    }
}
