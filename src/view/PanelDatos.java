package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

public class PanelDatos extends JPanel {

    private JLabel ecodigo;
    private JComboBox<String> lista_codigo;
    private JButton Blistar ;
    private JButton Bmodificar;
    private JButton Beliminar ;

    public PanelDatos() {
        setLayout(new GridLayout(1, 4, 5, 5));

        inicializarComponentes();

        setVisible(true);
    }

    public void inicializarComponentes() {

        setBackground(new Color(240, 183, 8));
        setPreferredSize(new Dimension(800, 60));
        setBorder(new TitledBorder("SELECCIONE UNA OPCION"));

        ecodigo = new JLabel("Seleccione un ID del producto:");
        add(ecodigo);
        

        lista_codigo = new JComboBox<String>();
        Blistar = new JButton("Listar");
        Bmodificar = new JButton("Modificar");
        Beliminar = new JButton("Eliminar");
        lista_codigo.setActionCommand("LISTA1");
        lista_codigo.addItem("1");
        lista_codigo.addItem("2");
        lista_codigo.addItem("3");
        lista_codigo.addItem("4");
        lista_codigo.addItem("5");
        lista_codigo.addItem("6");
//        lista_codigo.addItem("7");
//        lista_codigo.addItem("8");
//        lista_codigo.addItem("9");
        Blistar.setActionCommand("LISTAR");
        Bmodificar.setActionCommand("MODIFICAR");
        Beliminar.setActionCommand("ELIMINAR");
        add(lista_codigo);
        add(Blistar);
        add(Bmodificar);
        add(Beliminar);
    }
    
    public JLabel getECodigo() {
        return ecodigo;
    }

    public void setEcodigo(JLabel ecodigo) {
        this.ecodigo = ecodigo;
    }

    public JComboBox<String> getLista_codigo() {
        return lista_codigo;
    }

    public void setLista_codigo(JComboBox<String> lista_genero) {
        this.lista_codigo = lista_genero;
    }
    
    public JButton getBlistar() {
        return Blistar;
    }

    public void setBlistar(JButton Blistar) {
        this.Blistar = Blistar;
    }

    public JButton getBmodificar() {
        return Bmodificar;
    }

    public void setBmodificar(JButton Bmodificar) {
        this.Bmodificar = Bmodificar;
    }

    public JButton getBeliminar() {
        return Beliminar;
    }

    public void setBeliminar(JButton Beliminar) {
        this.Beliminar = Beliminar;
    }
    
   
}
