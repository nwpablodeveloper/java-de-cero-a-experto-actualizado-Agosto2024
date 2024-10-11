import java.util.Scanner;

public class RetoPromedioCalificaciones {
    public static void main(String[] args) {
        /*
            - Indicar la cantidad de calificaciones a promediar en un arreglo
            - Calcular el promedio de todas las calificaciones ingresadas
         */
        System.out.println("*** Reto Promediar las calificaciones ***");

        var consola = new Scanner(System.in);

        System.out.print("Cuántas calficaciones vas a promediar?: ");
        double[] calificaciones = new double[consola.nextInt()];

        for (var i = 0; i < calificaciones.length; i++){
            System.out.print("Ingrese la calificación nro. "+ i +": ");
            calificaciones[i] = consola.nextDouble();
        }

        double promedio = 0.0;
        for (var i = 0; i < calificaciones.length; i++){
            promedio += calificaciones[i];
        }
        System.out.println("promedio = " + promedio / calificaciones.length);
    }
}
