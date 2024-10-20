package persona;

public class PruebaPersona {
    public static void main(String[] args) {

        var persona1 = new Persona("Pablo", "Veiga");

        /*
            Si la clase tiene un metodo toString declarado, solo con imprimir
            el objeto va a ser llamado de forma automatica.
            Es decir que se va a llamar el metodo toString que fue sobreescrito
            y no se va a usar el toString de  la clase padre que no inidica
            la dirección de memoria del objeto
         */
        System.out.println(persona1);




    }
}
