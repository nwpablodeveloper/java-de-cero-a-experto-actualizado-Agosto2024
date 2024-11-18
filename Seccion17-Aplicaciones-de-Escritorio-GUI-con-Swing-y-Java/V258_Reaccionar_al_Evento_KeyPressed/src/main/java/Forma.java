import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Forma extends JFrame {

    private JPanel panelPrincipal;
    private JTextField campoTexto;
    private JPanel replicadorLabel;

    public Forma(){
        inicializarForma();

        /*
            // Poner el moouse sobre ActionListener y convertir a Lambda
        campoTexto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });*/

        // Conversión simplificada Lambda
        campoTexto.addActionListener(e -> {
            System.out.println("Se dispara");
        });
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
