import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;

public class LoginForm extends JFrame{
    private JPanel PanelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
    }

    private void inicializarForma(){
        setContentPane(PanelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(250,400);
        setLocationRelativeTo(null); // Centrar la ventana
    }

    public static void main(String[] args) {
        FlatDarculaLaf.setup();
        LoginForm loginForm = new LoginForm();
        loginForm.setVisible(true);
    }
}
