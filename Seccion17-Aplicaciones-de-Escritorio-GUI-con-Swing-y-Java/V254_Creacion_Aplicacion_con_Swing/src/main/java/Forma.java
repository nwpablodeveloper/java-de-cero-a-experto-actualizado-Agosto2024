import javax.swing.*;

public class Forma extends JFrame{
    private JPanel panel1;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panel1);

        // Cerrar la App al cerrar la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Tamaño de la App
        setSize(600,400);

        // Centrar la ventana
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Forma forma = new Forma();
        forma.setVisible(true);
    }
}
