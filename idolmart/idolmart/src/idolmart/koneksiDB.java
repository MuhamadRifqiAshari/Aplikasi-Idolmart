/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package idolmart;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class koneksiDB {
    Connection koneksi=null;
    public static Connection konek(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection koneksi = DriverManager.getConnection("jdbc:mysql://localhost/idolmart","root","");
            return koneksi;
        }catch(Exception e){
           JOptionPane.showMessageDialog(null, e);
           return null;
        }
     }    
}
