package view;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;

public class VentanaPrincipal extends JFrame {

    private PanelDatos pdatos;
    private PanelInformacion pinformacion;


    public VentanaPrincipal() {
        setTitle("APP FERRETERIA");
        setSize(800, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(new Color(201, 148, 3));
        getContentPane().setLayout(new BorderLayout(20, 20));

        inicializarComponentes();

        //setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void inicializarComponentes() {
        pdatos = new PanelDatos();
        getContentPane().add(pdatos, BorderLayout.NORTH);

        pinformacion = new PanelInformacion();
        getContentPane().add(pinformacion, BorderLayout.WEST);
    }

    public PanelDatos getPdatos() {
        return pdatos;
    }

    public void setPdatos(PanelDatos pdatos) {
        this.pdatos = pdatos;
    }

    public PanelInformacion getPinformacion() {
        return pinformacion;
    }

    public void setPinformacion(PanelInformacion pinformacion) {
        this.pinformacion = pinformacion;
    }
    
    
}
