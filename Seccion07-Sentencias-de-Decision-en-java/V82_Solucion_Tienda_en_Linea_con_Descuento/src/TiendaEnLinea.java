import java.util.Scanner;

public class TiendaEnLinea {
    public static void main(String[] args) {
        /*

            - Crear un sistema que ofrezca descuentos dependiendo del monto de la compra,
                o si es miembro de la tienda.

            - Si ha comprado más de $ 1.000 y es miembro de la tienda:
                10% de descuento

            - Si solo es miebro de la tienda
                5% de descuento

            - Si compro menos de $ 1.000 y NO es miembro
                0% de descuento

         */
        System.out.println("\n*** Tiende en Línea con dEscuentos ***");

        // Condiciones
        final var MONTO_COMPRA_DESC = 1000.00;

        var consola = new Scanner(System.in);

        System.out.print("\nCuál fue el monto de tu compra? ");
        var montoCompra = Double.parseDouble(consola.nextLine());

        System.out.print("Eres miembro de la tienda? ");
        var eresMiembro = Boolean.parseBoolean(consola.nextLine());

        // Calculamos el descuento
        var descuento = 0.0;

        // Verificamos cada caso, con los datos proporcionados
        if ( montoCompra >= MONTO_COMPRA_DESC && eresMiembro ){
            descuento = 0.1; // Descuento del 10 %
        } else if ( eresMiembro ) {
            descuento = 0.05; // Descuento del 5 %
        } else {
            descuento = 0; // Descuento del 0 %
        }

        // Hacemos los calculos para obtener el monto final
        if( descuento != 0 ){
            var montoDescuento = montoCompra * descuento;
            var montoFinal = montoCompra - montoDescuento;
            System.out.printf("""
                    %nFelicidades!, has obtenido un descuento del %.2f %%
                    Monto de la compra: $ %.2f
                    Monto del descuento: $ %.2f
                    Monto final de la compra con el descuento $ %.2f
                    """, descuento * 100, montoCompra, montoDescuento, montoFinal);

        } else {
            System.out.printf("""
                    %nNo obtuviste ningún tipo de descuento
                    Te invitamos a hacerte de la tienda!
                    Monto final de la compra: $ %.2f
                    """, montoCompra);
        }
    }
}
