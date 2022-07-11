/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import main.login;
import super_interface.loginSuper;
import main.menuAdmin;
import main.menuUser;
import validasi.validasi;

/**
 *
 * @author Alif
 */
public class loginCtr extends loginSuper{

    validasi Valid = new validasi();
    private static login l;
    
    public loginCtr(login l) {
        this.l = l;
    }
    @Override
    public void masuk() {
        try {
            Connection con = (Connection) koneksiDB.koneksi.connectionDB();
            Statement s = con.createStatement();

            String sql = "SELECT * FROM user WHERE username='" + l.getUsername().getText()
                    + "' and password='" + l.getPassword().getText() + "'";

            ResultSet r = s.executeQuery(sql);

            while (r.next()) {
                id_user = r.getString("id_user");

                password = r.getString("password");
            }

        } catch (SQLException e) {
        }
        
        if (id_user != null) {
            
            if (password.equalsIgnoreCase("Admin")) {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                menuAdmin a = new menuAdmin();
                a.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(null, "Login Berhasil");
                menuUser u = new menuUser();
                u.setVisible(true);
            }
            l.setVisible(false);
        } else {
            JOptionPane.showMessageDialog(null, "Login Gagal, Coba Lagi!!");
        }
    }

}
