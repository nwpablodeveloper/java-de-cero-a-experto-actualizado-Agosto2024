public class ReglasNombresVariables {
    public static void main(String[] args) {
        // Reglas nombres varialbes
        String nombreCompleto = "Juan Carlos";
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "Juan Carlos 2";
        System.out.println("NombreCompleto = " + NombreCompleto);

        // Incorrecto el "-"
        //String nombre-completo = "Juan Carlos",

        // En python se suca snape_case
        // No aplica a buenas practicas de JAVA
        String nombre_completo = "Juan Carlos ( Snape )";

        // Caracteres permitidos  al inicio
        String _nombre = "Juan";
        String $apellido = "Carlos";

        // No es buena practica una variable muy abreviada
        int topPzs = 10;

        // Recomendada
        int totalPiezas = 10;

        // Recomendaciones para variables de tipo Boolean
        boolean casado = false; // Correcto, pero se puede mejorar
        boolean esCasado = false; // Recomendado
        boolean isCasado = false; // Recomendado
        boolean tieneSaldo = true; // tiene, es recomendado
        boolean hasSaldo = true; // tiene, es recomendado


    }


}
