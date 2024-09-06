public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        // Más formas de concatenar cadenas en java

        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        System.out.println("cadena3 = " + cadena3);
        
        // Método concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 = " + cadena3);


        /*
        Método StringBuilder
        Es mas efisciente por que solo crea un objeto de tipo cadena
        en memoria
         */
        var stringBuilder = new StringBuilder();
        stringBuilder.append(cadena1)
                .append(" ")
                .append(cadena2);
        var resultado = stringBuilder.toString();
        System.out.println("stringBuilder = " + resultado);


        /*
        Es similar a StringBuilder y se recomienda para usar cuando estamos
        trabajando con varios hilos ( varios procesos en simultaneo )
         */
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1)
                .append(" ")
                .append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + resultado);
        

        /*
        Método Join, unir 2 o más cadenas con un cáracter
         */
        resultado = String.join(" ", cadena1, cadena2, "Adios!");
        System.out.println("Resultado Join = " + resultado);
    }
}
