public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        // Reemplazar subcadenas
        
        var cadena = "Hola Mundo";
        System.out.println("cadena = " + cadena);

        // Reemplazar la subcadena "Mundo" x "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        // Reemplazar hola por saludos
        nuevaCadena = cadena.replace("Hola", "saludos");
        System.out.println("nuevaCadena = " + nuevaCadena);

        
    }
}
