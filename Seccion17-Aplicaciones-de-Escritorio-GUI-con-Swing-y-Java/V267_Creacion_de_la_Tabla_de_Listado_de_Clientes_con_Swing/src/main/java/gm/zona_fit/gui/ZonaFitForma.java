package gm.zona_fit.gui;

import com.formdev.flatlaf.FlatDarculaLaf;
import gm.zona_fit.servicio.ClienteServicio;
import gm.zona_fit.servicio.IClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.swing.*;


@Component
public class ZonaFitForma extends JFrame{

    private JPanel panelPrincipal;
    private JTable clientesTabla;
    IClienteServicio clienteServicio;

    // Inyeccion de dependencias
    @Autowired
    public ZonaFitForma(ClienteServicio clienteServicio){
        FlatDarculaLaf.setup();
        this.clienteServicio = clienteServicio;
        iniciarForma();
    }

    private void iniciarForma(){
        setContentPane(panelPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(900,700);
        setLocationRelativeTo(null);
    }

}
