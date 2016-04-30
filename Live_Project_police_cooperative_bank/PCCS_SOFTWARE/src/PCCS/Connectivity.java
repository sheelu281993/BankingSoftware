/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package PCCS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Connectivity {
     public static Connection connectDatabase(String USERNAME,String PASSWORD)
    {
       Connection con;
    try
    { 
      Class.forName("com.mysql.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pccs",USERNAME,PASSWORD);
      return con;
    }
    catch (ClassNotFoundException | SQLException e) 
    {
       
      return null;
     }

    }
}
