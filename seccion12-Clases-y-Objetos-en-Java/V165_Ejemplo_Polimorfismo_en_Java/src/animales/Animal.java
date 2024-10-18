package animales;

public class Animal {

    protected void hacerSonido(){
        System.out.println("El Animal hace un sonido");
    }


}

class Perro extends Animal{

    @Override
    public void hacerSonido(){
        System.out.println("El perro hace Guau!");
    }
}

class Gato extends Animal{

    @Override
    protected void hacerSonido() {
        System.out.println("El Gato hace miau!");
    }
}

class PruebaAnimal{

    /*
        Usando polimorfismo podemos usar el tipo de dato más GENÉRICO de la
        clase (con mas jerarquia) y así el puede apuntar a objetos de sus
        mismo tipo o a objetos de clases hijas
     */
    // Método Polimorfico
    // Los métodos que se llamado del método MAIN tambien tiene que ser Static
    static void imprimirSonido(Animal animal){
        animal.hacerSonido();
    }

    public static void main(String[] args) {
        // Objeto de la clase Padre (Animal)
        var animal = new Animal();
        imprimirSonido(animal);

        animal = new Perro();
        imprimirSonido(animal);

        animal = new Gato();
        imprimirSonido(animal);

    }

}