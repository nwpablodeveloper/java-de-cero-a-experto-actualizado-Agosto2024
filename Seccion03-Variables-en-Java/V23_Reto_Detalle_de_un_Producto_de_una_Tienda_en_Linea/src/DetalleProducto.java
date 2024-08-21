public class DetalleProducto {
    public static void main(String[] args) {
        // Declaro y cargo variables
        String nombreProducto = "Computadora";
        double precio = 1356.20;
        int stock = 33;
        boolean isVenta = true;

        // Imprimo las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("stock = " + stock);
        System.out.println("isVenta = " + isVenta);

        // Modifico las varialbes
        nombreProducto = "Impresora";
        precio = 123.54;
        stock = 0;
        isVenta = false;

        // Vuelvo a imprimir las variables
        System.out.println("nombreProducto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("stock = " + stock);
        System.out.println("isVenta = " + isVenta);

    }
}
