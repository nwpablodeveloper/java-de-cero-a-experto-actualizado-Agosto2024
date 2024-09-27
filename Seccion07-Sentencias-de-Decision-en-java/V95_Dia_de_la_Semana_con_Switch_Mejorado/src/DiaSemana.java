import java.util.Scanner;

public class DiaSemana {
    public static void main(String[] args) {
        System.out.println("\n*** Día de la semana con Switch mejorado ***");

        var consola = new Scanner(System.in);

        System.out.print("Proporcione el día de la semana: ");
        var dia = Integer.parseInt(consola.nextLine());

        String nombreDia;

        nombreDia = switch (dia){
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoes";
            case 4 -> "Jueves";
            case 5 -> "Viernes";
            case 6 -> "Sabado";
            case 7 -> "Domingo";
            default -> "Día invalido";
        };

        System.out.printf("El día %d es: %s", dia, nombreDia);



    }
}
