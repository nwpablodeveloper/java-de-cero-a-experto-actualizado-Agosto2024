public class DiaSeamana {
    public static void main(String[] args) {
        System.out.println("\n*** Día de la Semana con Switch ***");

        var dia = 8;

        switch ( dia ){
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miercoles");
                break;
            case 4:
                System.out.println("Jueves");
                break;
            case 5:
                System.out.println("Viernes");
                break;
            case 6:
                System.out.println("Sabado");
                break;
            case 7:
                System.out.println("Domingo");
                break;
            default:
                System.out.println("Día invalido: " + dia);
                break;
        }
    }
}
