package model;

import model.persistence.Conexion;
import model.persistence.ProductoDAO;

public class ProductoDTO {
    private ProductoDAO producto_dao;
    private Conexion conexion;

    public ProductoDTO() {
        conexion = new Conexion();
        producto_dao = new ProductoDAO(conexion);
    }

    public ProductoDAO getProducto_dao() {
        return producto_dao;
    }

    public void setProducto_dao(ProductoDAO producto_dao) {
        this.producto_dao = producto_dao;
    }

    public Conexion getConexion() {
        return conexion;
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    
    
}
