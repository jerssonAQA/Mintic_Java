package model.persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private Connection conexion;
    
    public Conexion() {
        conexion = null;
    }

      public void EstableciendoConexion() {
        String dbURL = "jdbc:mysql://localhost:3306/reto5";
        String username = "root";
        String password = "mysql";
        try {
            conexion = DriverManager.getConnection(dbURL, username, password);
            if (conexion != null) {
                System.out.println("Conectado");
            }
        } catch (SQLException ex) {
            System.out.println("Error" + ex);
        }
    }
      
    public void closeConnection() {
        try {
            conexion.close();
        } catch (SQLException e) {
            System.out.println("Problema al cerrar la conexion de la Base de Datos");
        }
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    
}
