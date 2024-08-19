public class TipoDatos {
    public static void main(String[] args) {
        // TIPOS DE DATOS ENTEROS
        // Su valor por default es 0
        // Eneteros

        // Reserva 8 bits
        byte tipoByte = 127;
        System.out.println("tipoByte = " + tipoByte);

        // Reserva 16 bits
        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);

        // Reservar 32 bits
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);

        // Reservar 64 bits
        long tipoLong = 923372036854775807L; // Usar "L o l" para indicar el tipo
        System.out.println("tipoLong = " + tipoLong);

        // PUNTO FLOTANTES SU VALOR POR DEFAULT ES 0.0
        // Reserva hasta 32 bits
        float tipoFloat = 3.4028235E38F; // Aclaramos con una "F o f" al final
        System.out.println("tipoFloat = " + tipoFloat);

        // Reserva hasta 64 bits
        double tipoDouble = 1.7976931348623157E308;
        System.out.println("tipoDouble = " + tipoDouble);
        
        // Tipo Char -  Caracteres del juego unicode
        // Su valor por default es '\u0000'
        char tipoChar = 'A'; 
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 65;
        System.out.println("tipoChar = " + tipoChar);

        // TIPO BOOLEANO su valor por default es ( false )
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);
        tipoBoolean = false;
        System.out.println("tipoBoolean = " + tipoBoolean);

        // Dato de tipo referenciado ( Objeto )
        // Su valor por defecto es Null
        String tipoString = null;
        System.out.println("tipoString = " + tipoString);
        tipoString = "Pablito Veiga";
        System.out.println("tipoString = " + tipoString);
    }
}
