package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks{

    private final String NOMBRE_ARCHIVO = "snacks.txt";

    // Crear la lista de Snacks
    private List<Snack> snacks = new ArrayList<>();

    // Constructor de la Clase
    public ServicioSnacksArchivos(){
        // Crear el archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try{
            existe = archivo.exists();
            if (existe){
                // Si existe leemos el archivo
                this.snacks = obtenerSnacks();
            }else{
                // Si no existe lo creamos
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close(); // Si no lo cerramos el archivo no se guarda en el Disco
                System.out.println("\nSe ha creado el archivo: " + NOMBRE_ARCHIVO);
            }
        }catch (Exception e){
            System.out.println("Error al crear el archivo: " + e.getMessage());
        }
        // Si no existe, vamos a cargar algunos Snacks iniciales
        if (!existe){
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales(){
        this.agregarSnack(new Snack("papas", 1.2));
        this.agregarSnack(new Snack("Refresco", .96));
        this.agregarSnack(new Snack("Sandwich", .2));
        this.agregarSnack(new Snack("Refresco", .96));
    }

    private List<Snack> obtenerSnacks(){
        var snacks = new ArrayList<Snack>();
        try{
            List<String> lineas  = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            lineas.forEach(linea -> {
                String[] lineaSnack = linea.split(",");// Parseo
                var idSnack = lineaSnack[0];
                var nombre = lineaSnack[1];
                var precio = lineaSnack[2];
                var snack = new Snack(nombre, Double.parseDouble(precio));
                snacks.add(snack);
            });
        }catch (Exception e){
            System.out.println("Error al leer archivo de Snacks: " + e.getMessage());
        }
        return snacks;
    }

    @Override
    public void agregarSnack(Snack snack) {
        // Agregamos el nuevo Snack,
        // Paso 1 lo agregamos en la lista en memoria
        this.snacks.add(snack);
        // 2. Guardamos el Snack en el archivo
        this.agregarSnackArchivo(snack);
    }

    private void agregarSnackArchivo(Snack snack){
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try{
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        }catch (Exception e){
            System.out.println("Error al agregar los Snack:  " + e.getMessage());
        }
    }
    @Override
    public void mostrarSnacks() {
        System.out.println("--- Snacks en el Inventario ---");
        var inventarioSnacks = "";
        for (var snack : this.snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}