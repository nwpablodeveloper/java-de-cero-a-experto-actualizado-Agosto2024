import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        /*
            - Crear una aplicación de calculadora con las opciones de:
                * Suma
                * Resta
                * Multiplicación
                * División
                * Salir.
            - El programa debe mostrar un menú con cada opción, y debe
                solicitar los valores del operando 1 y operando 2 para
                realizar la operación seleccionada.
         */
        System.out.println("\n*** Reto - Calculadora ***");

        var consola = new Scanner(System.in);
        var salir = false;
        var opcionElegida = "";
        var resultado = 0.0;
        double nro1 = 0.0, nro2 = 0.0;

        while ( !salir ){
            System.out.print("""
                    \n\nCalculadora en Java
                    1 - Suma
                    2 - Resta
                    3 - Multiplicar
                    4 - División
                    5 - Salir
                    Escoge una opción:\s""");

            var opcion = consola.nextInt();

            if ( opcion >= 1  && opcion <= 4) {
                System.out.print("Ingrese el 1er nro.: ");
                nro1 = consola.nextDouble();
                System.out.print("Ingrese el 2do nro.: ");
                nro2 = consola.nextDouble();
            }

            switch ( opcion ){
                case 1 -> {
                    opcionElegida = "Suma";
                    resultado = nro1 + nro2;
                }
                case 2 -> {
                    opcionElegida = "Resta";
                    resultado = nro1 - nro2;
                }
                case 3 -> {
                    opcionElegida = "Multiplicación";
                    resultado = nro1 * nro2;
                }
                case 4 -> {
                    if(nro2 != 0 ){
                        opcionElegida = "División";
                        resultado = nro1 / nro2;
                    }else{
                        System.out.println("Error al dividir con 0");
                    }
                }
                case 5 -> salir = true;
                default -> System.out.println("Opción no valida");
            }
            System.out.printf("""
                    El resultado de la %s es: %f""", opcionElegida, resultado);
        }

    }
}





















