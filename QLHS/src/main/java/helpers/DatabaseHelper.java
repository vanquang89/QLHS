/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author PC
 */
public class DatabaseHelper {
    public static Connection openConnection() throws Exception{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl = "jdbc:sqlserver://localhost;database=QLHSCap3;";
            String dbusername = "admin";
            String password = "123";
            Connection con = DriverManager.getConnection(connectionUrl,dbusername,password);       
    return con;
    }
}
