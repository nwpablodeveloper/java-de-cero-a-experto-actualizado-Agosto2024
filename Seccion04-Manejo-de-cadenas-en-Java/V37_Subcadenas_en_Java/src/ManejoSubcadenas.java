public class ManejoSubcadenas {
    public static void main(String[] args) {
        System.out.println("** Subcadenas en Java ***");

        /*
        Una Subcadena es obtener una parte de la cadena original
         */

        System.out.println("cadena1 = 0123456789 <= index");
        var cadena1 ="Hola Mundo";
        System.out.println("cadena1 = " + cadena1);
        
        // Subcadena
        System.out.println("substring 2 = " + cadena1.substring(2));
        System.out.println("substring 0, 4 = " + cadena1.substring(0,4));
        System.out.println("substring 5, 10 = " + cadena1.substring(5,10));



    }
}
