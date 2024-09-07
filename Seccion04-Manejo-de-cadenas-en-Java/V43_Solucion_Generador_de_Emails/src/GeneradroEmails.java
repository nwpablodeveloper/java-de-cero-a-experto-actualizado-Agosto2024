public class GeneradroEmails {
    public static void main(String[] args) {
        /*
        * Crear un programa para generar un email a partir de los siguientes datos
          - Nombre: Pablo Andres Veiga
          - Empresa: Global Mentoring
          - Dominio: com.mx

         * La salida tiene que quedar
          - Nombre Normalizado: pablo.andres.veiga
          - E-mail Normalizado: pablo.andres.veiga@globalmentoring.com.mx
         */

        var nombreCompleto = " Ubaldo Acosta Soto ";
        System.out.println("\nnombreCompleto = " + nombreCompleto);

        // Procesar o normalizar el nombre del usuario
        // Limpiar espacios en blanco al inicio y al final
        var nombreNormalizado = nombreCompleto.strip();
        
        // Reemplazar espacios en blanco por puntos
        nombreNormalizado = nombreNormalizado.replace(" ", ".");
        
        // Convertir a minusculas
        nombreNormalizado = nombreNormalizado.toLowerCase();
        System.out.println("nombreNormalizado = " + nombreNormalizado);

        // DATOS DE LA EMPRESA
        var nombreEmpresa = "  Global Menotring  ";
        System.out.println("\nnombreEmpresa = " + nombreEmpresa);
        var extensionDominio = ".com.mx";
        System.out.println("extensionDominio = " + extensionDominio);
        
        // Quitar espacios en blancos y convertir a minisculas
        var nombreEmpresaNormalizado = nombreEmpresa.strip().replace(" ", ".").toLowerCase();
        var dominioEmailNormalizado = "@" + nombreEmpresaNormalizado + extensionDominio;
        System.out.println("dominioEmailNormalizado = " + dominioEmailNormalizado);
        
        // Crear el email final
        var emailNormalizado = nombreNormalizado + dominioEmailNormalizado;
        System.out.println("emailNormalizado = " + emailNormalizado);
        

    }
}
