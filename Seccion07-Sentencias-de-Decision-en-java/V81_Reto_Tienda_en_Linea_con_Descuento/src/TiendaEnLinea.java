import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("\n*** Tienda en Linea con Descuento");
        /*
            - Crear un sistema que ofrezca descuentos dependiendo del
                monto de la compra, o si es miembro de la tienda.

            - Si ha comprado más de $ 1.000 y es miembro de la tienda:
                10% de descuento.

            - Si solo es miebro de la tienda
                5% de descuento.

            - Si compro menos de $ 1.000 y NO es miembro
                0% de descuento.
         */

        Scanner consola = new Scanner(System.in);
        final int MINIMO = 1000;

        System.out.print("Cuál fue el monto de la compra? ");
        double monto = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda (true/false)? ");
        boolean esMiembro = Boolean.parseBoolean(consola.nextLine());

        System.out.println();

        if ( monto >= MINIMO && esMiembro){
            var descuento = monto * 0.1;
            System.out.println("Felicidades, has obtenido un descuento del 10%.");
            System.out.println("Monto del descuento: $ " + descuento);
            System.out.println("Monto final de compra: $ " + (monto - descuento) );
        } else if (esMiembro) {
            var descuento = monto * 0.05;
            System.out.println("Felicidades, has obtenido un descuento del 5%.");
            System.out.println("Monto del descuento: $ " + descuento);
            System.out.println("Monto final de compra: $ " + (monto - descuento) );
        } else {
            System.out.printf("""
                    No obtuviste ningún tipo de descuento
                    Te invitamos a hacerte miembro de la tienda
                    Monto final de la compra: $ %.2f
                    """, monto);
        }


    }
}
