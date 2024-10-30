public class ClaseAbstracta {
    public static void main(String[] args) {

        // Error, No se puede instanciar una clase Abstracta
        // FiguraGeometrica figura = new FiguraGeometrica();

        FiguraGeometrica figuraGeometrica = new Rectangulo();
        figuraGeometrica.dibujar();

        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}

/*
    Clase Abstracta,
    - No se puede instanciar
    - Define una estructura común
    - Sirve como base para otras clases
 */

abstract class FiguraGeometrica{
    public abstract void dibujar();
}


class Rectangulo extends FiguraGeometrica{

    // Se requiere declarar los métodos heredados de la clase abstracta
    @Override
    public void dibujar() {
        System.out.println("Se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica{

    @Override
    public void dibujar() {
        System.out.println("Se dibuja un circulo");
    }
}