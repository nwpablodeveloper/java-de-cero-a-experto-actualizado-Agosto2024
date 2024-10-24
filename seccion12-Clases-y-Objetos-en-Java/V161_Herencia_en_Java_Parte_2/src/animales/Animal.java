package animales;

public class Animal {

    // Usaremos el modifcador protected para que puedan acceder sus clases hijas
    protected void comer(){
        System.out.println("Como muchas veces al día");
    }
    // Usaremos el modifcador protected para que puedan acceder sus clases hijas
    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

}

class Perro extends Animal{

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de herencia ***");

        System.out.println("\nClase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();
        // animal1.hacerSonido(); Este método no existe en la clase padre

        System.out.println("\nClase Hija, soy un perro");
        var perro = new Perro();
        perro.comer();      // Metodo heredado de la clase padre
        perro.dormir();     // Método heredado de la superClase
        perro.hacerSonido();


    }

}