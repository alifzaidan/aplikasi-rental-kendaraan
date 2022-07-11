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
import main.formPilihMotor;
import main.formTransaksiMotor;
import main.menuUser;
import super_interface.transaksiKendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class transaksiMotorCtr implements transaksiKendaraanIntrfc{
    
    private static formTransaksiMotor tmt;

    public transaksiMotorCtr(formTransaksiMotor tmt) {
        this.tmt = tmt;
    }
    
    public void ubahstatus() throws SQLException {
        String sql = "UPDATE tb_motor SET status='Keluar' WHERE nopol = '" + tmt.getNopol().getText() + "'";
        java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
        java.sql.PreparedStatement pstm = con.prepareStatement(sql);
        pstm.execute();
    }
    
    @Override
    public void submit(){
        try {
            if (!tmt.getNama().getText().isEmpty() && !tmt.getLama().getText().isEmpty()) {
                java.util.Date tgl_sewa = (java.util.Date) tmt.getjDateChooser1().getDate();
                java.util.Date tgl_kembali = (java.util.Date) tmt.getjDateChooser2().getDate();

                String sql = "INSERT INTO tb_peminjam VALUES ('" + tmt.getNama().getText()
                        + "','" + tmt.getNik().getText()
                        + "','" + tmt.getAlamat().getText()
                        + "','" + tmt.getTlp().getText()
                        + "','" + tmt.getEmail().getText()
                        + "','" + "Motor"
                        + "','" + tmt.getMerk().getText()
                        + "','" + tmt.getTipe().getText()
                        + "','" + tmt.getTahun().getText()
                        + "','" + tmt.getNopol().getText()
                        + "','" + tmt.getHarga().getText()
                        + "','" + new java.sql.Date(tgl_sewa.getTime()).toString()
                        + "','" + new java.sql.Date(tgl_kembali.getTime()).toString()
                        + "','" + tmt.getLama().getText()
                        + "','" + tmt.getTotal().getText() + "')";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan");
                ubahstatus();
                tmt.setVisible(false);
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
            String strDate1 = df.format(tmt.getjDateChooser1().getDate());
            String strDate2 = df.format(tmt.getjDateChooser2().getDate());
            Date Tanggal1 = df.parse(strDate1);
            Date Tanggal2 = df.parse(strDate2);
            long Hari1 = Tanggal1.getTime();
            long Hari2 = Tanggal2.getTime();
            long diff = Hari2 - Hari1;
            long Lama = diff / (24 * 60 * 60 * 1000);
            String Hasil = (Long.toString(Lama));
            tmt.getLama().setText(Hasil + " Hari");

            int harga_sewa = Integer.parseInt(tmt.getHarga().getText()); 
            int lama_sewa = Integer.parseInt(Hasil);
            int Total = harga_sewa * lama_sewa;
            String a = Integer.toString(Total);
            tmt.getTotal().setText(a);

        } catch (Exception a) {
            JOptionPane.showMessageDialog(null, "Masukan Tanggal Peminjaman dan Tanggal Pengembalian");
        }
    }
    
    @Override
    public void kembali(){
        menuUser.jDesktopPane1.removeAll();
        menuUser.jDesktopPane1.repaint();
        formPilihMotor fp = new formPilihMotor(tmt.getNama().getText(), tmt.getNik().getText(), tmt.getAlamat().getText(), tmt.getTlp().getText(), tmt.getEmail().getText());
        fp.setVisible(true);
        menuUser.jDesktopPane1.add(fp);
    }
}
