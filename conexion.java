/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionpostgressql;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.*;

public class conexion {
    private final String HOST = "localhost";
    private final String PUERTO = "5432";
    private final String DB = "postgres poo";
    private final String USER = "postgres";
    private final String PASSWORD = "123";
    
   public Connection getconexion(){
       Connection conexion = null;
       
      try{
          Class.forName("org.postgressql.Driver");
          String url = "jdbc:pstgresqsl://"+HOST+":"+PUERTO+"/"+DB;
          conexion = DriverManager.getConnection(url, USER, PASSWORD);
          JOptionPane.showMessageDialog(null,"conexion exitosa");
       }catch(Exception e){
           JOptionPane.showMessageDialog(null,e.getMessage());
       }
      return conexion;
   } 
   
   
}
