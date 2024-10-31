package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        /*
            Se puede acceder a los atributos y métodos estaticos sin necesidad de
            crear objetos
         */
        /*
            Llamaremos al metodo estatico pera que se encargue de llamar al atributo
            estatico privado
         */
        System.out.println("Variable Estática: "
                + Persona.getContadorPeronas());

        var persona1 = new Persona("Pablo", "Veiga");
        System.out.println(persona1);
        System.out.println("Variable Estática: "+ Persona.getContadorPeronas());

        var persona2 = new Persona("Romina", "Diaz");
        System.out.println(persona2);

        System.out.println("Variable Estática: "+ Persona.getContadorPeronas());

    }
}
