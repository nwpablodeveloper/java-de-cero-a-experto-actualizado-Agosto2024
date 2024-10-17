package animales;

public class Animal {

    protected void comer(){
        System.out.println("Como muchas veces al día");
    }

    protected void dormir(){
        System.out.println("Duermo muchas horas");
    }

}

class Perro extends Animal{

    public void hacerSonido(){
        System.out.println("Puedo ladrar");
    }

    // Para sobreescribir tenemos que usar la misma firma
    @Override // Anotación de sobreescritura, no es necesario, pero si son buenas practicas
    protected void dormir(){
        System.out.println("Dueromo 15 horas al día");
    }

}

class PruebaAnimal{
    public static void main(String[] args) {
        System.out.println("*** Ejemplo de herencia ***");

        System.out.println("\nClase Padre, soy un animal");
        var animal1 = new Animal();
        animal1.comer();
        animal1.dormir();

        System.out.println("\nClase Hija, soy un perro");
        var perro = new Perro();
        perro.comer();      // Metodo heredado de la clase padre
        perro.dormir();     // Método heredado de la superClase
        perro.hacerSonido();


    }

}