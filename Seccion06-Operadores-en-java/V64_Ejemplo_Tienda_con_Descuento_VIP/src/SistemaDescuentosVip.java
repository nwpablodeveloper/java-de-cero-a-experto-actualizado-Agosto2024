import java.util.Scanner;

public class SistemaDescuentosVip {
    public static void main(String[] args) {
        System.out.println("\n*** Sistema de Descuentos VIP ***");
        /*

            - Una Tienda de supermercado ofrece un descuento especial a clientes
            que compren 10 o más artículos por día y además sean miembros
            de la tienda.

            - El sistema de solicitar al cliente que indique cuántos artículos
            ha comprado en el día y preguntarle si cuenta con la membresía
            de la tienda.

            -En caso de haber comprado 10 o más productos y ser miembre de
            la tienda entonces tendrá acceso al descuento VIP

         */
        final int NRO_PRODUCTOS_DESCUENTO = 10;
        Scanner consola = new Scanner(System.in);

        System.out.print("\nCuántos productos compraste hoy?: ");
        int cantidadProductos = Integer.parseInt(consola.nextLine());

        System.out.print("Tienes la membresia (true/false): ");
        boolean tienesMembresia = Boolean.parseBoolean(consola.nextLine());

        boolean esElegibleDescuento = cantidadProductos
                >= NRO_PRODUCTOS_DESCUENTO &&
                tienesMembresia;

        System.out.println("Tienes acceso al descuento VIP? " + esElegibleDescuento);


    }
}
