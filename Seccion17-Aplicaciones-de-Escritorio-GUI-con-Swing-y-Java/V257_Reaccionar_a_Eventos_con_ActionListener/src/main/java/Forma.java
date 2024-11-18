import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class Forma extends JFrame {

    private JPanel panelPrincipal;
    private JTextField campoTexto;

    public Forma(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,350);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        Forma forma = new Forma();
        forma.setVisible(true);
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
