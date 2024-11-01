package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Ventas ***");

        var producto1 = new Producto("Monitor", 170.80);
        var producto2 = new Producto("Mother", 230);
        var producto3 = new Producto("Teclado", 10.5);
        var producto4 = new Producto("HDD", 60.34);
        var producto5 = new Producto("Mouese", 40.30);
        var producto6 = new Producto("CPU", 620);
        var producto7 = new Producto("Escritorio", 400.3);
        var producto8 = new Producto("Auriculares", 80);
        var producto9 = new Producto("Silla", 335);
        var producto10 = new Producto("Memoria RAM", 120);
        var producto11 = new Producto("SSD", 130);

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);
        orden1.agregarProducto(producto6);
        orden1.agregarProducto(producto7);
        orden1.agregarProducto(producto8);
        orden1.agregarProducto(producto9);
        orden1.agregarProducto(producto10);

        var orden2 = new Orden();
        orden2.agregarProducto(producto11);
    /*
        orden1.mostrarOrden();
        orden2.mostrarOrden();
    */
        System.out.println(orden1);
    }
}
