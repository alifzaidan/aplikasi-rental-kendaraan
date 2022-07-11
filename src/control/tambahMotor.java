/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.formTambahMotor;
import super_interface.kendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class tambahMotor implements kendaraanIntrfc{
    
    private static formTambahMotor mtr;
    
    public tambahMotor(formTambahMotor mtr) {
        this.mtr = mtr;
    }
    
    @Override
    public void kosongkan_form() {
        mtr.getMerk().setEditable(true);
        mtr.getMerk().setText("");
        mtr.getTipe().setText("");
        mtr.getTahun().setSelectedItem("2022");
        mtr.getNopol().setText("");
        mtr.getHarga().setText("");
    }
    
    @Override
    public void tampilkan_data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Tahun Produksi");
        model.addColumn("No. Polisi");
        model.addColumn("Harga/hari");
        model.addColumn("Status");

        try {
            String sql = "SELECT * FROM tb_motor";
            java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{res.getString("merk"),
                    res.getString("tipe"),
                    res.getString("tahun"),
                    res.getString("nopol"),
                    res.getString("harga"),
                    res.getString("status")});
            }
            mtr.getTabelMotor().setModel(model);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
    @Override
    public void tambah(){
        try {
            
            if (!mtr.getMerk().getText().isEmpty() && !mtr.getTipe().getText().isEmpty() && !mtr.getNopol().getText().isEmpty() && !mtr.getHarga().getText().isEmpty()) {
                String sql = "INSERT INTO tb_motor VALUES ("
                        + "'" + mtr.getMerk().getText()
                        + "','" + mtr.getTipe().getText()
                        + "','" + mtr.getTahun().getSelectedItem()
                        + "','" + mtr.getNopol().getText()
                        + "','" + mtr.getHarga().getText()
                        + "','" + mtr.getStatus().getSelectedItem() + "')";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Motor Berhasil Disimpan");
                tampilkan_data();
                kosongkan_form();
            } else {
                JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
            }

        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error input data " + e.getMessage());
        }
    }
    
    @Override
    public void edit(){
        try {    
            if (!mtr.getMerk().getText().isEmpty() && !mtr.getTipe().getText().isEmpty() && !mtr.getNopol().getText().isEmpty() && !mtr.getHarga().getText().isEmpty()) {
                String sql = "UPDATE tb_motor SET merk='" + mtr.getMerk().getText()
                        + "',tipe='" + mtr.getTipe().getText()
                        + "',tahun='" + mtr.getTahun().getSelectedItem()
                        + "',harga='" + mtr.getHarga().getText()
                        + "',status='" + mtr.getStatus().getSelectedItem()
                        + "' WHERE nopol = '" + mtr.getNopol().getText() + "'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Motor Berhasil Diedit");
            } else {
                JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error edit data " + e.getMessage());
        }
    }
    
    @Override
    public void hapus(){
        try {
            if (JOptionPane.showConfirmDialog(null, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                String sql = "DELETE FROM tb_motor WHERE nopol='" + mtr.getNopol().getText() + "'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Motor Berhasil Dihapus");
            } else {
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    @Override
    public void cari(){
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Tahun Produksi");
        model.addColumn("No. Polisi");
        model.addColumn("Harga/hari");
        model.addColumn("Status");
       
        if (mtr.getSearch().getText().isEmpty()) {
            tampilkan_data();
        } else {
            try {
                Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                String sql = "Select * from tb_motor where merk LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR tipe LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR merk LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR nopol LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR harga LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR tahun LIKE '%" 
                        + mtr.getSearch().getText() + "%' OR status LIKE '%" 
                        + mtr.getSearch().getText() + "%'";
                Statement stat = con.createStatement();
                ResultSet res = stat.executeQuery(sql);
                while (res.next()) {
                    model.addRow(new Object[]{
                        res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("tahun"),
                        res.getString("nopol"),
                        res.getString("harga"),
                        res.getString("status")});
                }
                mtr.getTabelMotor().setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pencarian Error");
            }
        }
    }
    
    public void klikTabel(java.awt.event.MouseEvent evt){
        int baris = mtr.getTabelMotor().rowAtPoint(evt.getPoint());
        String merk = mtr.getTabelMotor().getValueAt(baris, 0).toString();
        mtr.getMerk().setText(merk);

        String tipe = mtr.getTabelMotor().getValueAt(baris, 1).toString();
        mtr.getTipe().setText(tipe);

        String tahun = mtr.getTabelMotor().getValueAt(baris, 2).toString();
        mtr.getTahun().setSelectedItem(tahun);

        String nopol = mtr.getTabelMotor().getValueAt(baris, 3).toString();
        mtr.getNopol().setText(nopol);

        String harga = mtr.getTabelMotor().getValueAt(baris, 4).toString();
        mtr.getHarga().setText(harga);

        String status = mtr.getTabelMotor().getValueAt(baris, 5).toString();
        mtr.getStatus().setSelectedItem(status);
    }

}
