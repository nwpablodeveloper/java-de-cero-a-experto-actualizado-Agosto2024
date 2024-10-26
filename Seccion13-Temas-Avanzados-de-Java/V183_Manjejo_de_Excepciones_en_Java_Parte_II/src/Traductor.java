public interface Traductor {
    // por default los metodos son publicos y abstractos

    void traducir();

    // Metodos con implementación por default
    default void iniciarTraductor(){
        System.out.println("Se disparo el método iniciarTraductor");
    }

}

class Ingles implements Traductor{

    @Override
    public void traducir(){
        System.out.println("Traduzco a Ingles...");
    }

}

class Frances implements Traductor{

    @Override
    public void traducir(){
        System.out.println("Traduzco al Frances... ");
    }

    @Override
    public void iniciarTraductor() {
        Traductor.super.iniciarTraductor();
        System.out.println("Iniciando Traductor en frances");
    }
}

class pruebaTraductor{
    public static void main(String[] args) {
        Traductor idioma = new Ingles();
        idioma.iniciarTraductor();
        idioma.traducir();

        idioma = new Frances();
        idioma.iniciarTraductor();
        idioma.traducir();

    }
}
