import java.util.Scanner;

public class TicketVenta {
    public static void main(String[] args) {
        /*
            - Supongamos que compramos vairos artículos en el
                supermercado y queremos obtener el ticket de
                vent total incluyendo impuestos

            - El sistema solicitará el precio de cada producto a comprar
                y el usuario deberá indicar su precio
                ( valor de tipo con punto decimal )

            - El sistema debe realizar la suma de cada producto, calcular el
                impuesto y finalmente imprimir el total de la compra
         */

        System.out.println("\n*** Sistema de ticket de venta ***");
        Scanner consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        double precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        double precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio carne: ");
        double precioCarne = Double.parseDouble(consola.nextLine());

        System.out.print("Precio Condimentos: ");
        double precioCondimentos = Double.parseDouble(consola.nextLine());

        // Cálculo del subtotal ( sin impuestos )
        double subtotal = precioPan + precioLeche + precioCarne + precioCondimentos;

        // Cálculo impuestos ( %21 )
        double impuestos = subtotal * 0.21;

        // Cálculo total de la compra ( con impuestos )
        double costoTotalCompra = impuestos + subtotal;

        // Imprimir ticket de venta
        System.out.printf("""
                Subtotal: $ %.2f
                Impuestos %% 21: $ %.2f
                TOTAL:  $ %.2f
                """, subtotal, impuestos, costoTotalCompra);
    }
}
