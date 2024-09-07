
public class GeneradorEmail {
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

        String nombreUsuario = "    Pablo Andres Veiga     ";
        String empresa = "   Global Mentoring  ";
        String dominio = "    com.mx  ";

        nombreUsuario = nombreUsuario.trim().toLowerCase().replace(" ", ".");
        empresa = empresa.trim().toLowerCase().replace(" ", "");
        dominio = dominio.trim();
        
        StringBuilder email = new StringBuilder();
        email.append(nombreUsuario);
        email.append("@");
        email.append(empresa + dominio);

        System.out.println("nombreUsuario = " + nombreUsuario);
        System.out.println("empresa = " + empresa);
        System.out.println("dominio = " + dominio);
        System.out.println("email = " + email);

    }
}
