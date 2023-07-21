/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Koneksii;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author AXIOO
 */
public class Koneksi {
    Connection koneksi;
    
    public static Connection Koneksi(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/app_vaksin_cecilia","root","");
          
          return koneksi;
      } catch (Exception e){
          JOptionPane.showMessageDialog(null, e);
          
          return null;
      }
    }
}
