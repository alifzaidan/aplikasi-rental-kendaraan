/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import main.formPilihMobil;
import main.formTransaksiMobil;
import main.menuUser;
import super_interface.transaksiKendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class transaksiMobilCtr implements transaksiKendaraanIntrfc{
    
    private static formTransaksiMobil tmb;

    public transaksiMobilCtr(formTransaksiMobil tmb) {
        this.tmb = tmb;
    }
    
    public void ubahstatus() throws SQLException {
        String sql = "UPDATE tb_mobil SET status='Keluar' WHERE nopol = '" + tmb.getNopol().getText() + "'";
        java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
        java.sql.PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute();
    }
    
    public void submit(){
        try {
            if (!tmb.getNama().getText().isEmpty() && !tmb.getLama().getText().isEmpty()) {
                java.util.Date tgl_sewa = (java.util.Date) tmb.getjDateChooser1().getDate();
                java.util.Date tgl_kembali = (java.util.Date) tmb.getjDateChooser2().getDate();

                String sql = "INSERT INTO tb_peminjam VALUES ('" + tmb.getNama().getText()
                        + "','" + tmb.getNik().getText()
                        + "','" + tmb.getAlamat().getText()
                        + "','" + tmb.getTlp().getText()
                        + "','" + tmb.getEmail().getText()
                        + "','" + "Mobil"
                        + "','" + tmb.getMerk().getText()
                        + "','" + tmb.getTipe().getText()
                        + "','" + tmb.getTahun().getText()
                        + "','" + tmb.getNopol().getText()
                        + "','" + tmb.getHarga().getText()
                        + "','" + new java.sql.Date(tgl_sewa.getTime()).toString()
                        + "','" + new java.sql.Date(tgl_kembali.getTime()).toString()
                        + "','" + tmb.getLama().getText()
                        + "','" + tmb.getTotal().getText() + "')";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                ubahstatus();
                tmb.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error input data " + e.getMessage());
        }
    }
    
    @Override
    public void hitung() {
        try {
            SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
            String strDate1 = df.format(tmb.getjDateChooser1().getDate());
            String strDate2 = df.format(tmb.getjDateChooser2().getDate());
            Date Tanggal1 = df.parse(strDate1);
            Date Tanggal2 = df.parse(strDate2);
            long Hari1 = Tanggal1.getTime();
            long Hari2 = Tanggal2.getTime();
            long diff = Hari2 - Hari1;
            long Lama = diff / (24 * 60 * 60 * 1000);
            String Hasil = (Long.toString(Lama));
            tmb.getLama().setText(Hasil + " Hari");

            int harga_sewa = Integer.parseInt(tmb.getHarga().getText()); 
            int lama_sewa = Integer.parseInt(Hasil);
            int Total = harga_sewa * lama_sewa;
            String a = Integer.toString(Total);
            tmb.getTotal().setText(a);

        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Peminjaman dan Tanggal Pengembalian");
        }
    }
    
    @Override
    public void kembali(){
        menuUser.jDesktopPane1.removeAll();
        menuUser.jDesktopPane1.repaint();
        formPilihMobil fp = new formPilihMobil(tmb.getNama().getText(), tmb.getNik().getText(), tmb.getAlamat().getText(), tmb.getTlp().getText(), tmb.getEmail().getText());
        fp.setVisible(true);
        menuUser.jDesktopPane1.add(fp);
    }
}
