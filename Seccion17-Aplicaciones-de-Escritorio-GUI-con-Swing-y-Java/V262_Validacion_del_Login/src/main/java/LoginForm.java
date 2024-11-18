import com.formdev.flatlaf.FlatDarculaLaf;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel PanelPrincipal;
    private JTextField usuarioTexto;
    private JPasswordField passwordTexto;
    private JButton enviarBoton;

    public LoginForm(){
        inicializarForma();
        enviarBoton.addActionListener(e -> validar());
    }

    private void validar(){
        var usuario = this.usuarioTexto.getText();
        var password = new String(this.passwordTexto.getPassword());
        if ("root".equals(usuario) && "admin".equals(password))
            mostrarMensaje("Datos correctos, BENVENUTI");
        else if ("root".equals(usuario))
            mostrarMensaje("El password no es valido");
        else
            mostrarMensaje("Usuario incorrecto");
    }

    private void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
        JOptionPane.showMessageDialog(this, mensaje);
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
