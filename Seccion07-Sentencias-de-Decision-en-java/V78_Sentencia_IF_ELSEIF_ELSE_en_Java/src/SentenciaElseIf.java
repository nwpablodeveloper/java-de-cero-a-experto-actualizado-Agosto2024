public class SentenciaElseIf {
    public static void main(String[] args) {
        System.out.println("\n*** Sentencia Else if");

        var edad = 18;

        if ( edad >= 18 ){
            System.out.println("Es mayor de edad");
        } else if ( edad >= 13 && edad < 18 ){
            System.out.println("Eres un adolescente");
        } else {
            System.out.println("Eres un niño");
        }
    }
}
