import java.util.Scanner;

public class SistemaEmpleados {
    public static void main(String[] args) {

        /*
             - Crear un programa para padir la información de un empleado. Los datos solicitados
                se deben introducir por consola:
             * Nombre del Empleado ( String )
             * Edad ( int)
             * Salario ( dobule )
             * Es Jefe de Departamento ( Boolean )

             * Una vez capturado los datos, se deben mandar a imprimir por consola
         */

        Scanner consola = new Scanner(System.in);

        System.out.println("*** Sistema de Empleados ***");

        // Nombre del Empleado
        System.out.print("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        // Edad del empleado
        System.out.print("Edad del empleado: ");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        // Salario del Empleado
        System.out.print("Salario del empleado: ");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        // Es jefe de departamento
        System.out.print("Es jefe del departamento: (true/false): ");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir los valores del empleado
        System.out.println("\nDatos del Empleado");
        System.out.println("\tNombre: " + nombreEmpleado);
        System.out.println("\tEdad: " + edadEmpleado + " Años ");

        // Formato de decimales al imprimir %.8f
        // La variable se va a imprimir donde esta el simbolo de porcentaje
        System.out.println("\tSalario: $ %.8f".formatted(salarioEmpleado));
        // Factorizado
        System.out.printf("\tSalario: $ %.8f%n", salarioEmpleado);

        System.out.println("\tEs jefe de Departamento?: " + esJefeDepartamento);

    }
}
