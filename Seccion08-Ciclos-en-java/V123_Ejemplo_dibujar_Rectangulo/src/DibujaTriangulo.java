import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        System.out.println("*** Dibuja un triangulo ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporcione el número de filas: ");
        var numerofilas = consola.nextInt();

        // Iteramos sobre cada fila del triángulo
        for (var fila = 1; fila <= numerofilas; fila++){
            var espacios = " ".repeat(numerofilas - fila);
            var ateriscos = "*".repeat(fila * 2 -1);
            System.out.println(espacios + ateriscos);
        }
        
        
    }
}
