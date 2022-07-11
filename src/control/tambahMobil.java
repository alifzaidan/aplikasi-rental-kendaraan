/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.awt.HeadlessException;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import main.formTambahMobil;
import super_interface.kendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class tambahMobil implements kendaraanIntrfc {

    private static formTambahMobil mbl;

    public tambahMobil(formTambahMobil mbl) {
        this.mbl = mbl;
    }

    @Override
    public void kosongkan_form() {
        mbl.getMerk().setEditable(true);
        mbl.getMerk().setText("");
        mbl.getTipe().setText("");
        mbl.getTahun().setSelectedItem("2022");
        mbl.getNopol().setText("");
        mbl.getHarga().setText("");
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
            String sql = "SELECT * FROM tb_mobil";
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
            mbl.getTabelMobil().setModel(model);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void tambah() {
        try {

            if (!mbl.getMerk().getText().isEmpty() && !mbl.getTipe().getText().isEmpty() && !mbl.getNopol().getText().isEmpty() && !mbl.getHarga().getText().isEmpty()) {
                String sql = "INSERT INTO tb_mobil VALUES ("
                        + "'" + mbl.getMerk().getText()
                        + "','" + mbl.getTipe().getText()
                        + "','" + mbl.getTahun().getSelectedItem()
                        + "','" + mbl.getNopol().getText()
                        + "','" + mbl.getHarga().getText()
                        + "','" + mbl.getStatus().getSelectedItem() + "')";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Disimpan");
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
    public void edit() {
        try {
            if (!mbl.getMerk().getText().isEmpty() && !mbl.getTipe().getText().isEmpty() && !mbl.getNopol().getText().isEmpty() && !mbl.getHarga().getText().isEmpty()) {
                String sql = "UPDATE tb_mobil SET merk='" + mbl.getMerk().getText()
                        + "',tipe='" + mbl.getTipe().getText()
                        + "',tahun='" + mbl.getTahun().getSelectedItem()
                        + "',harga='" + mbl.getHarga().getText()
                        + "',status='" + mbl.getStatus().getSelectedItem()
                        + "' WHERE nopol = '" + mbl.getNopol().getText() + "'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Diedit");
            } else {
                JOptionPane.showMessageDialog(null, "Data isian ada yang kosong");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error edit data " + e.getMessage());
        }
    }

    @Override
    public void hapus() {
        try {
            if (JOptionPane.showConfirmDialog(null, "Yakin menghapus data", "Peringatan", JOptionPane.OK_CANCEL_OPTION) == JOptionPane.OK_OPTION) {
                String sql = "DELETE FROM tb_mobil WHERE nopol='" + mbl.getNopol().getText() + "'";
                java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                java.sql.PreparedStatement pstm = con.prepareStatement(sql);
                pstm.execute();
                JOptionPane.showMessageDialog(null, "Data Mobil Berhasil Dihapus");
            } else {
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }

    @Override
    public void cari() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Tahun Produksi");
        model.addColumn("No. Polisi");
        model.addColumn("Harga/hari");
        model.addColumn("Status");

        if (mbl.getSearch().getText().isEmpty()) {
            tampilkan_data();
        } else {
            try {
                Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                String sql = "Select * from tb_mobil where merk LIKE '%"
                        + mbl.getSearch().getText() + "%' OR tipe LIKE '%"
                        + mbl.getSearch().getText() + "%' OR merk LIKE '%"
                        + mbl.getSearch().getText() + "%' OR nopol LIKE '%"
                        + mbl.getSearch().getText() + "%' OR harga LIKE '%"
                        + mbl.getSearch().getText() + "%' OR tahun LIKE '%"
                        + mbl.getSearch().getText() + "%' OR status LIKE '%"
                        + mbl.getSearch().getText() + "%'";
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
                mbl.getTabelMobil().setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pencarian Error");
            }
        }
    }

    @Override
    public void klikTabel(java.awt.event.MouseEvent evt) {
        int baris = mbl.getTabelMobil().rowAtPoint(evt.getPoint());
        String merk = mbl.getTabelMobil().getValueAt(baris, 0).toString();
        mbl.getMerk().setText(merk);

        String tipe = mbl.getTabelMobil().getValueAt(baris, 1).toString();
        mbl.getTipe().setText(tipe);

        String tahun = mbl.getTabelMobil().getValueAt(baris, 2).toString();
        mbl.getTahun().setSelectedItem(tahun);

        String nopol = mbl.getTabelMobil().getValueAt(baris, 3).toString();
        mbl.getNopol().setText(nopol);

        String harga = mbl.getTabelMobil().getValueAt(baris, 4).toString();
        mbl.getHarga().setText(harga);

        String status = mbl.getTabelMobil().getValueAt(baris, 5).toString();
        mbl.getStatus().setSelectedItem(status);
    }

}
