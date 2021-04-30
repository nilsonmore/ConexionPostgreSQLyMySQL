/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexionpostgresql {
    public void realizarConexion(){
 Connection conn = null;
 String url = "jdbc:postgresql://localhost:5432/sena3"; 
 try { 

 conn = DriverManager.getConnection(url, "sena6", "root");
 JOptionPane.showMessageDialog(null, "La Conexión a PostgreSQL Fue Éxitosa");
 return;
 } catch (SQLException e) {
 JOptionPane.showMessageDialog(null, "Ocurrio Un Error de Conexión a PostgreSQL");
 return;
 }
 }
}

