package model.persistence;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Producto;

public class ProductoDAO {
    
    private Conexion conexion;

    public ProductoDAO(Conexion conexion) {
        this.conexion = conexion;
    }
    
    public List<Producto> Vertodos() {
        conexion.EstableciendoConexion();
        List<Producto> productos = new ArrayList<>();
        String listado = "";
        PreparedStatement ps;
        ResultSet result;
        String sql = "SELECT * FROM Producto";
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            result = ps.executeQuery();
            while (result.next()) {
                    int Codigo = result.getInt(1);
                    String nombre = result.getString(2);
                    int v_compra = result.getInt(3);
                    int v_venta = result.getInt(4);
                    int cantidad = result.getInt(5);
                    String categoria = result.getString(6);
                    Producto producto = new Producto(Codigo,nombre,v_compra,v_venta,cantidad,categoria);
                    productos.add(producto);
            }
            for(Producto product : productos){
                listado = listado.concat(product.toString() + "\n");
            }
            return productos;
            } catch (SQLException ex) {
                System.out.println("Problema al imprimir la información." + ex);
            }
        conexion.closeConnection();
        return productos;
    }
    
    public Producto consultarID(int id) {
        conexion.EstableciendoConexion();
        Producto productoEncontrado;
        PreparedStatement ps;
        ResultSet result;
        String sql = "SELECT * FROM Producto WHERE Codigo = ? ";
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            result = ps.executeQuery();
            if (result.next()){
                int Codigo = result.getInt(1);
                String nombre = result.getString(2);
                int v_compra = result.getInt(3);
                int v_venta = result.getInt(4);
                int cantidad = result.getInt(5);
                String categoria = result.getString(6);
                productoEncontrado = new Producto(Codigo,nombre,v_compra,v_venta,cantidad,categoria);
            }
            else{
                productoEncontrado = null;
            }
            conexion.closeConnection();
        } catch (SQLException e) {
            System.out.println("Sin resgistro:" + e);
            productoEncontrado = null;
        }
        conexion.closeConnection();
        return productoEncontrado;
    }

    public boolean InsertarRegistro(int id,String Nombre, int v_compra, int v_venta, int cantidad, String categoria) {
        conexion.EstableciendoConexion();
        PreparedStatement statement;
        String sql = "INSERT INTO Producto (Codigo , nombre ,V_compra ,V_venta ,cantidad , categoria ) VALUES( ?, ?,  ?,  ?,  ?,  ?)";
        try {
            statement = conexion.getConexion().prepareStatement(sql);
            statement.setInt(1, id);
            statement.setString(2, Nombre);
            statement.setInt(3, v_compra);
            statement.setInt(4, v_venta);
            statement.setInt(5, cantidad);
            statement.setString(6, categoria);
            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            return false;
        }
    }
    
    public boolean eliminarProducto(int id) {
        conexion.EstableciendoConexion();
        PreparedStatement ps;
        String sql = "DELETE FROM Producto where Codigo = ?";
        try {
            ps = conexion.getConexion().prepareStatement(sql);
            ps.setInt(1, id);
            int contador = ps.executeUpdate();
            if (contador > 0) {
                conexion.closeConnection();
                return true;
            } else {
                conexion.closeConnection();
                return false;
            }
        } catch (SQLException e) {
            conexion.closeConnection();
            System.out.println("Problema eliminado producto:" + e);
            return false;
        }
    }
    
    public boolean modificarProducto(int id,String Nombre, int v_compra, int v_venta, int cantidad, String categoria) {
        conexion.EstableciendoConexion();
        PreparedStatement statement;
        String sql = "UPDATE producto SET nombre=? ,V_compra=? ,V_venta=? ,cantidad=?, categoria=?  where Codigo = ?";
        try {
            statement = conexion.getConexion().prepareStatement(sql);
            statement.setString(1, Nombre);
            statement.setInt(2, v_compra);
            statement.setInt(3, v_venta);
            statement.setInt(4, cantidad);
            statement.setString(5, categoria);
            statement.setInt(6, id);
            int contador = statement.executeUpdate();
            if (contador > 0) {
                conexion.closeConnection();
                return true;
            } else {
                conexion.closeConnection();
                return false;
            }
        } catch (SQLException e) {
            conexion.closeConnection();
            System.out.println(e);
            return false;
        }
    }

}
