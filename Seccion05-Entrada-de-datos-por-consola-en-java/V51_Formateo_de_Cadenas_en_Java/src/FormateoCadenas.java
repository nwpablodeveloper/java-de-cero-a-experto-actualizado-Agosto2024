public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("\n*** Formateo de Cadenas ***");

        var nombre = "Matías";
        var edad = 35;
        var salario = 21000.50;

        // String Format
        // %s es donde vamos a sustituir por un String
        // %d es donde vamos a sustituir por un Integer
        // %f es donde vamos a sustituro por un Float
        // %.xf "x es el valor a indicar de la cantidad de decimales deseados
        var mensaje = String.format(
                "Nombre: %s, Edad: %d, Salario: $ %.3f",
                nombre, edad, salario
        );
        System.out.println(mensaje);

        // Método pintf
        // %n Salto de linea en el formateo con "printf"
        System.out.printf("%n%nNombre: %s, Edad: %d, Salario: $ %.3f",
                nombre, edad, salario);
    }
}
