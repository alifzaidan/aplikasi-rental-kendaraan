/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import main.formPengembalian;
import super_interface.pengembalianIntrfc;

/**
 *
 * @author Alif
 */
public class pengembalianCtr implements pengembalianIntrfc {

    private static formPengembalian pbn;

    public pengembalianCtr(formPengembalian pbn) {
        this.pbn = pbn;
    }

    public void ubahstatus() throws SQLException {
        if (pbn.getKendaraan().getText().equalsIgnoreCase("Mobil")) {
            String sql = "UPDATE tb_mobil SET status='Tersedia' WHERE nopol = '" + pbn.getNopol().getText() + "'";
            java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
        } else if (pbn.getKendaraan().getText().equalsIgnoreCase("Motor")) {
            String sql = "UPDATE tb_motor SET status='Tersedia' WHERE nopol = '" + pbn.getNopol().getText() + "'";
            java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
            java.sql.PreparedStatement pstm = con.prepareStatement(sql);
            pstm.execute();
        }
    }

    @Override
    public void tampilankosong() {
        pbn.getNama().setEditable(true);
        pbn.getNama().setText("");
        pbn.getNik().setText("");
        pbn.getTipe().setText("");
        pbn.getNopol().setText("");
        pbn.getHarga().setText("");
        pbn.getTglpinjam().setText("");
        pbn.getTglkembali().setText("");
        pbn.getLama().setText("");
        pbn.getTotal().setText("");
    }

    @Override
    public void kembalikan() {
        try {
            if (JOptionPane.showConfirmDialog(null, "Yakin Mengembalikan Kendaraan ?", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                String sql = "DELETE FROM tb_peminjam WHERE nopol='" + pbn.getNopol().getText() + "'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Kendaraan Telah Dikembalikan\nTerima Kasih :)");
            }
            ubahstatus();
            tampilankosong();
        } catch (SQLException ex) {
            Logger.getLogger(formPengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void cari() {
        if (pbn.getNama().getText().isEmpty()) {
            tampilankosong();
        } else {
            try {
                String sql = "SELECT * FROM tb_peminjam WHERE nama LIKE '%" + pbn.getNama().getText() + "%'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.Statement stm = con.createStatement();
                java.sql.ResultSet res = stm.executeQuery(sql);
                while (res.next()) {
                    pbn.getNik().setText(res.getString("nik"));
                    pbn.getTipe().setText(res.getString("tipe"));
                    pbn.getNopol().setText(res.getString("nopol"));
                    pbn.getHarga().setText(res.getString("harga"));
                    pbn.getTglpinjam().setText(res.getString("tgl_pinjam"));
                    pbn.getTglkembali().setText(res.getString("tgl_kembali"));
                    pbn.getLama().setText(res.getString("lama"));
                    pbn.getTotal().setText(res.getString("total"));
                    pbn.getKendaraan().setText(res.getString("jeniskendaraan"));
                }
            } catch (SQLException ex) {
                Logger.getLogger(formPengembalian.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
