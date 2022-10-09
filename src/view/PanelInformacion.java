package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.TextArea;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.table.TableColumn;

public class PanelInformacion extends JPanel {

    private JLabel eblanco1;
    private JTable eblanco2;
    private JLabel enombre1;
    private JLabel enombre2;
    private JLabel ecodigo1;
    private JLabel ecodigo2;
    private JLabel e_compra1;
    private JLabel e_compra2;
    private JLabel e_venta1;
    private JLabel e_venta2;
    private JLabel ecantidad1;
    private JLabel ecantidad2;
    private JLabel ecategoria1;
    private JLabel ecategoria2;
    private JScrollPane jScrollPane;

    public PanelInformacion() {        
        setLayout(null);
        inicializarComponentes();
        setVisible(true);
    }

    public void inicializarComponentes() {

        int x_label = 5;
        int x_text = 150;
        int y_label = 10;
        setBackground(Color.lightGray);
        setPreferredSize(new Dimension(800, 200));
        setBorder(new TitledBorder("Características del producto"));

        enombre1 = new JLabel("Nombre: ");
        enombre1.setBounds(x_label, y_label, 100, 50);
        add(enombre1);

        enombre2 = new JLabel();
        enombre2.setBounds(x_text, y_label, 100, 50);
        add(enombre2);

        y_label += 40;
        ecodigo1 = new JLabel("Código: ");
        ecodigo1.setBounds(x_label, y_label, 100, 50);
        add(ecodigo1);

        ecodigo2 = new JLabel();
        ecodigo2.setBounds(x_text, y_label, 100, 50);
        add(ecodigo2);

        y_label += 40;
        e_compra1 = new JLabel("Valor compra: ");
        e_compra1.setBounds(x_label, y_label, 100, 50);
        add(e_compra1);

        e_compra2 = new JLabel();
        e_compra2.setBounds(x_text, y_label, 100, 50);
        add(e_compra2);

        y_label += 40;
        e_venta1 = new JLabel("Valor Venta: ");
        e_venta1.setBounds(x_label, y_label, 100, 50);
        add(e_venta1);

        e_venta2 = new JLabel();
        e_venta2.setBounds(x_text, y_label, 100, 50);
        add(e_venta2);

        y_label += 40;
        ecantidad1 = new JLabel("Cantidad: ");
        ecantidad1.setBounds(x_label, y_label, 100, 50);
        add(ecantidad1);
        
        ecantidad2 = new JLabel();
        ecantidad2.setBounds(x_text, y_label, 100, 50);
        add(ecantidad2);

        y_label += 40;
        ecategoria1 = new JLabel("Categoría: ");
        ecategoria1.setBounds(x_label, y_label, 100, 50);
        add(ecategoria1);

        ecategoria2 = new JLabel();
        ecategoria2.setBounds(x_text, y_label, 100, 50);
        add(ecategoria2);

        eblanco1 = new JLabel("Listar");
        eblanco1.setBounds(x_text*2, 30, 100, 10);
        add(eblanco1);
        
        eblanco2 = new JTable();
        eblanco2.setBounds(x_text*2+5, 50, 500, 150);
        eblanco2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {},
            new String [] {
                "Codigo", "Nombre", "V_compra", "V_venta","Cantidad","Categoria"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Long.class, java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane = new JScrollPane();
        jScrollPane.setViewportView(eblanco2);
        if (eblanco2.getColumnModel().getColumnCount() > 0) {
            eblanco2.getColumnModel().getColumn(0).setResizable(false);
            eblanco2.getColumnModel().getColumn(0).setPreferredWidth(1);
            eblanco2.getColumnModel().getColumn(1).setResizable(false);
            eblanco2.getColumnModel().getColumn(2).setResizable(false);
            eblanco2.getColumnModel().getColumn(2).setPreferredWidth(1);
            eblanco2.getColumnModel().getColumn(3).setResizable(false);
            eblanco2.getColumnModel().getColumn(3).setPreferredWidth(1);
            eblanco2.getColumnModel().getColumn(4).setResizable(false);
            eblanco2.getColumnModel().getColumn(4).setPreferredWidth(1);
        }
        jScrollPane.setBounds(x_text*2+5, 50, 450, 150);
        add(jScrollPane);
    }

    public JLabel getEnombre1() {
        return enombre1;
    }

    public void setEnombre1(JLabel enombre1) {
        this.enombre1 = enombre1;
    }

    public JLabel getEnombre2() {
        return enombre2;
    }

    public void setEnombre2(JLabel enombre2) {
        this.enombre2 = enombre2;
    }

    public JLabel getEblanco1() {
        return eblanco1;
    }

    public void setEblanco1(JLabel eblanco) {
        this.eblanco1 = eblanco;
    }

    public JLabel getEcodigo1() {
        return ecodigo1;
    }

    public void setEcodigo1(JLabel ecodigo1) {
        this.ecodigo1 = ecodigo1;
    }

    public JLabel getEcodigo2() {
        return ecodigo2;
    }

    public void setEcodigo2(JLabel ecodigo2) {
        this.ecodigo2 = ecodigo2;
    }

    public JLabel getE_compra1() {
        return e_compra1;
    }

    public void setE_compra1(JLabel e_compra1) {
        this.e_compra1 = e_compra1;
    }

    public JLabel getE_compra2() {
        return e_compra2;
    }

    public void setE_compra2(JLabel e_compra2) {
        this.e_compra2 = e_compra2;
    }

    public JLabel getE_venta1() {
        return e_venta1;
    }

    public void setE_venta1(JLabel e_venta1) {
        this.e_venta1 = e_venta1;
    }

    public JLabel getE_venta2() {
        return e_venta2;
    }

    public void setE_venta2(JLabel e_venta2) {
        this.e_venta2 = e_venta2;
    }

    public JLabel getEcantidad1() {
        return ecantidad1;
    }

    public void setEcantidad1(JLabel ecantidad1) {
        this.ecantidad1 = ecantidad1;
    }

    public JLabel getEcantidad2() {
        return ecantidad2;
    }

    public void setEcantidad2(JLabel ecantidad2) {
        this.ecantidad2 = ecantidad2;
    }

    public JLabel getEcategoria1() {
        return ecategoria1;
    }

    public void setEcategoria1(JLabel ecategoria1) {
        this.ecategoria1 = ecategoria1;
    }

    public JLabel getEcategoria2() {
        return ecategoria2;
    }

    public void setEcategoria2(JLabel ecategoria2) {
        this.ecategoria2 = ecategoria2;
    }

    public JTable getEblanco2() {
        return eblanco2;
    }

    public void setEblanco2(JTable eblanco2) {
        this.eblanco2 = eblanco2;
    }

    public JScrollPane getjScrollPane() {
        return jScrollPane;
    }

    public void setjScrollPane(JScrollPane jScrollPane) {
        this.jScrollPane = jScrollPane;
    }
    
    

}
