
package com.conexion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;


public class conexion {
    private final String user="root";
 private final String pass="";
 private final String url="jdbc:mysql://localhost:3306/mysql";
 
 public void conectorMySQL(){ 
 Connection con = null;
 try{
 con = (Connection) DriverManager.getConnection(url, user, pass);
 JOptionPane.showMessageDialog(null, "La Conexión a MySQL Fue Éxitosa");
 System.out.println(con);
 }
 catch (Exception e){
 JOptionPane.showMessageDialog(null, "Ocurrio Un Error de Conexión a MySQL");
 System.out.println(con);
 } 
 } 
    }
     





