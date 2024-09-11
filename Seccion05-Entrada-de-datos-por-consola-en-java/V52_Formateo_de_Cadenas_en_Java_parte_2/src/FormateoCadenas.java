public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.printf("%n *** Formateo de Cadenas parte 2 ***");

        //Formateo con Text Block
        var nombre = "Matías";
        var edad = 35;
        var salario = 250000.52;
        var numeroEmpleado = 192;

        var mensaje = """
                %nDetalle de Persona:\s
                ----------------------
                \tNombre: %s
                \tNúmero de empleado: %08d
                \tEdad: %d años
                \tSalario: $ %.2f
                """.formatted(nombre, numeroEmpleado,edad, salario);

        System.out.printf(mensaje);

        // Formateo de text Block y printf directamente
        System.out.printf("""
                %nDetalle de Persona:\s
                ----------------------
                \tNombre: %s
                \tNúmero de empleado: %08d
                \tEdad: %d años
                \tSalario: $ %.2f
                """, nombre, numeroEmpleado,edad,salario);
    }
}
