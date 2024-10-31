package archivos;

import java.io.*;

public class CrearArchivo {
    public static void main(String[] args) {
        var nombreArhivo = "mi_archivo.txt";
        var archivo = new File(nombreArhivo);

        try {

            if (archivo.exists()){
                System.out.println("El archivo ya existe");
            }else {
                // Creamos el archivo
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Archivos creado: " + nombreArhivo);
            }

        }catch (IOException e){
            System.out.println("Error al crear el archivo:  " + e.getMessage());
            e.printStackTrace(); // Ver el error de forma detallada
        }
    }
}
