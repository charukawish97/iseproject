/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;



public class DBconect {
    
    public static Connection connect()
    {
     Connection conn=null;
     try
     
     {
       Class.forName("com.mysql.jdbc.Driver");
       conn=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/praveen ","root","");
       
     }
     
     catch(Exception e)
         
     {
         JOptionPane.showMessageDialog(null, e);
     }
     return conn;
    }
    
}
