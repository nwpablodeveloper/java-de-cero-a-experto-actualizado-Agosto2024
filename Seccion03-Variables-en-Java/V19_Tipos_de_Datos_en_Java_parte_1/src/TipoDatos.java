public class TipoDatos {
    public static void main(String[] args) {
        // Tipos de datos Enteros
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

        // PUNTO FLOTANTES
        // Reserva hasta 32 bits
        float tipoFloat = 3.4028235E38F; // Aclaramos con una "F o f" al final
        System.out.println("tipoFloat = " + tipoFloat);

        // Reserva hasta 64 bits
        double tipoDouble = 1.7976931348623157E308;
        System.out.println("tipoDouble = " + tipoDouble);
    }
}
