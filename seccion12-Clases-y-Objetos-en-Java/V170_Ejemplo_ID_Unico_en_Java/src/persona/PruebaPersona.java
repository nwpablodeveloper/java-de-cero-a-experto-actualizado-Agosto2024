package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        // Imprimimos variable estática para conocer su valor inicial
        System.out.println("Variable Estática: "+ Persona.contadorPeronas);

        var persona1 = new Persona("Pablo", "Veiga");
        System.out.println(persona1);
        System.out.println("Variable Estática: "+ Persona.contadorPeronas);

        var persona2 = new Persona("Romina", "Diaz");
        System.out.println(persona2);

        // Desde el Objeto si podemos acceder al contexto Static
        System.out.println("Variable Estática: "+ persona2.contadorPeronas);

    }
}
