package com.principal;
import com.conexion.conexion;
import com.conexion.conexionpostgresql;
import java.awt.Color;
import java.awt.Rectangle;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
public class myframe extends JFrame{
 
public void componentes(JPanel panel){
 panel.setLayout(null); 
 
 JLabel etiqueta = new JLabel("Datos: ");
 etiqueta.setBounds(10, 20, 60, 25);
 panel.add(etiqueta);
 
 JTextField nombre = new JTextField(20);
 nombre.setBounds(80, 20, 250, 25);
 panel.add(nombre);

 JButton enviar = new JButton("Ingresar");
 enviar.setBounds(80, 80, 100, 25); 
 panel.add(enviar);
 
 JButton limpiar = new JButton("Limpiar");
 limpiar.setBounds(new Rectangle(210, 80, 100, 25)); 
 panel.add(limpiar);
 
 JLabel etiqueta1 = new JLabel(" ");
 etiqueta1.setBounds(50, 120, 300, 50);
 etiqueta1.setBorder (BorderFactory.createLineBorder(Color.red, 1));
 panel.add(etiqueta1);
 
 JButton conemysql = new JButton("MYSQL");
 conemysql.setBounds(80, 200, 100, 25); 
 panel.add(conemysql);
 
 JButton conepost = new JButton("POSTGRESQL");
 conepost.setBounds(210, 200, 100, 25); 
 panel.add(conepost);
 
 enviar.addActionListener((java.awt.event.ActionEvent e) -> {
     String str= nombre.getText();
     etiqueta1.setText(str);
 });
 
 limpiar.addActionListener((java.awt.event.ActionEvent e) -> {
     etiqueta1.setText(" ");
 });
 conemysql.addActionListener((java.awt.event.ActionEvent e) ->{
       conexion cn = new conexion();
       cn.conectorMySQL();
 });
 conepost.addActionListener((java.awt.event.ActionEvent e) ->{
       conexionpostgresql cp = new conexionpostgresql();
        cp.realizarConexion();
      
 });
 
 
 } public static void main(String[] args) throws SQLException{
 
 JFrame ventana = new JFrame("My Ventana No1");
 ventana.setSize(400, 400);
 ventana.setResizable(false);
 ventana.setLocationRelativeTo(null);
 ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 JPanel contenedor = new JPanel();
 ventana.add(contenedor);
 
 myframe objeto = new myframe();
 objeto.componentes(contenedor);
 ventana.setVisible(true); 
 
}
}