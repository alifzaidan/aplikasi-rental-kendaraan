/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksiDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Alif
 */
public class koneksi {

    private static Connection con;

    public static Connection connectionDB() {
        if (con == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/dbrental";
                String user = "root";
                String pass = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                con = DriverManager.getConnection(url,user,pass);
            } catch (SQLException e) {
                System.out.println("Koneksi ke Database Gagal " + e.getMessage());
            }
        }
        return con;
        
    }

}
