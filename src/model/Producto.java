package model;

public class Producto {
    
    private int Codigo;
    private String Nombre;
    private int V_compra;
    private int V_venta;
    private int cantidad;
    private String categoria;

    public Producto(int Codigo, String Nombre, int V_compra, int V_venta, int cantidad, String categoria) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.V_compra = V_compra;
        this.V_venta = V_venta;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getV_compra() {
        return V_compra;
    }

    public void setV_compra(int V_compra) {
        this.V_compra = V_compra;
    }

    public int getV_venta() {
        return V_venta;
    }

    public void setV_venta(int V_venta) {
        this.V_venta = V_venta;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return Codigo + "\t" + Nombre + "\t\t" + V_compra + "\t\t" + V_venta + "\t\t" + cantidad + "\t\t" + categoria + '\n';
    }
    
    
}
