package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {

        try {
            /*
                LLamamos directamente al metodo estatico por que el mismo se asocia
                con la clase y no con los objetos
             */
            var resultado = Aritmetica.division(5,0);
            System.out.println("resultado = " + resultado);
        }catch (Exception e){
            System.out.println("Error:\n\t" + e);
        } finally {
            System.out.println("Este bloque siempre se ejecuta sin importar " +
                    "si hay o no hay error");
        }
    }
}
