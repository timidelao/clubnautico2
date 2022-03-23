/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author lalo_
 */
public class ConexionBD implements iConexionBD {
    public String cadenaConexion="jdbc:mysql://localhost/clubnautico";
    public String usuario="root";
    public String password="123456";

    public ConexionBD() {
    }
    

    @Override
    public Connection crearConexion() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(cadenaConexion,usuario ,password);
            return conexion;
        } catch(Exception ex){
          System.err.println(ex.getMessage());
        }
        return null;
    }

    

}
