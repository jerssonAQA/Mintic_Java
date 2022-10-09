package reto_05;

import model.Producto;
import model.ProductoDTO;
import view.VentanaPrincipal;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.table.DefaultTableModel;

public class Controller implements ActionListener {
    
    public VentanaPrincipal vista;
    private ProductoDTO dto;

    public Controller() {
        dto = new ProductoDTO();
        vista = new VentanaPrincipal();
        asignarOyentes();
    }
    
    public void asignarOyentes() {
        vista.getPdatos().getLista_codigo().addActionListener(this);
        vista.getPdatos().getBlistar().addActionListener(this);
        vista.getPdatos().getBmodificar().addActionListener(this);
        vista.getPdatos().getBeliminar().addActionListener(this);
        //vista.getPdatos().getLista_nombre().addActionListener(this);
    }

    public void insertarProducto() {
        System.out.println("Nombre mascota: ");
        if (dto.getProducto_dao().InsertarRegistro(4, "v", 1, 2, 3, "n")) {
            System.out.println("Se insertó");
        } else {
            System.out.println("No se insertó");
        }
    }

    public List<Producto> verListado() {
        return dto.getProducto_dao().Vertodos();
    }

    public Producto buscarProducto(int codigo) {
        Producto rta = dto.getProducto_dao().consultarID(codigo);
        if (rta != null) {
            System.out.println(rta.toString());
        } else {
            System.out.println("No se encontró en la BD");
        }
        return rta;
    }
    
    public void eliminarProducto() {
        int n = 2;
        if (dto.getProducto_dao().eliminarProducto(n)) {
            System.out.println("Se eliminó registro");
        } else {
            System.out.println("No se eliminó registro");
        }
    }

    public void modificarProducto() {
        int n = 3;
        if (dto.getProducto_dao().consultarID(n) != null) {
            if (dto.getProducto_dao().modificarProducto(n, "Nombre", n, n, n, "categoria")) {
                System.out.println("Se actualizó registro");
            } else {
                System.out.println("No se actualizó registro");
            }
        } else {
            System.out.println("No se actualizó registro");
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();
        if (comando.equals("LISTA1")) {

            int pos2 = vista.getPdatos().getLista_codigo().getSelectedIndex();
            String codigo = vista.getPdatos().getLista_codigo().getItemAt(pos2);
            Producto producto = buscarProducto(Integer.parseInt(codigo));

            vista.getPinformacion().getEnombre2().setText(producto.getNombre());
            vista.getPinformacion().getE_compra2().setText(producto.getV_compra() + "");
            vista.getPinformacion().getE_venta2().setText(producto.getV_venta() + "");
            vista.getPinformacion().getEcodigo2().setText(producto.getCodigo() + "");
            vista.getPinformacion().getEcantidad2().setText(producto.getCantidad() + "");
            vista.getPinformacion().getEcategoria2().setText(producto.getCategoria());
            
        } else if (comando.equals("LISTAR")) {

            int pos2 = vista.getPdatos().getLista_codigo().getSelectedIndex();
            String n = vista.getPdatos().getLista_codigo().getItemAt(pos2);
            String arreglo= "";
            arreglo = "ID\t nombre\t\t V_compra\t\t V_venta \t\t Cantidad\t\t Categoria\n";

            DefaultTableModel tmO = (DefaultTableModel) vista.getPinformacion().getEblanco2().getModel();
            Object[] lista = new Object[verListado().size()];
            for (Producto producto : verListado()){
                lista[0] = producto.getCodigo();
                lista[1] = producto.getNombre();
                lista[2] = producto.getV_compra();
                lista[3] = producto.getV_venta();
                lista[4] = producto.getCantidad();
                lista[5] = producto.getCategoria();
                tmO.addRow(lista);
            }
        }

    }
}
