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
import javax.swing.table.DefaultTableModel;
import main.formIsiData;
import super_interface.pilihKendaraanSuper;
import main.formPilihMobil;
import main.formTransaksiMobil;
import main.menuUser;

/**
 *
 * @author Alif
 */
public class pilihMobilCtr extends pilihKendaraanSuper {

    private static formPilihMobil pmb;

    public pilihMobilCtr(formPilihMobil pmb) {
        this.pmb = pmb;
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
            pmb.getTabelMobil().setModel(model);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void berikutnya() {
        if (!pmb.getStatus().getText().equalsIgnoreCase("Tersedia")) {
            JOptionPane.showMessageDialog(null, "Maaf mobil ini sedang tidak tersedia");
        } else {
            String merk = pmb.getMerk().getText();
            String tipe = pmb.getTipe().getText();
            String tahun = pmb.getTahun().getText();
            String nopol = pmb.getNopol().getText();
            String harga = pmb.getHarga().getText();
            String status = pmb.getStatus().getText();

            menuUser.jDesktopPane1.removeAll();
            menuUser.jDesktopPane1.repaint();
            formTransaksiMobil ft = new formTransaksiMobil(nama, nik, alamat, tlp, email, merk, tipe, tahun, nopol, harga, status);
            ft.setVisible(true);
            menuUser.jDesktopPane1.add(ft);
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

        if (pmb.getSearch().getText().isEmpty()) {
            tampilkan_data();
        } else {
            try {
                Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                String sql = "Select * from tb_mobil where merk LIKE '%" + pmb.getSearch().getText()
                        + "%' OR tipe LIKE '%" + pmb.getSearch().getText()
                        + "%' OR merk LIKE '%" + pmb.getSearch().getText()
                        + "%' OR nopol LIKE '%" + pmb.getSearch().getText()
                        + "%' OR harga LIKE '%" + pmb.getSearch().getText()
                        + "%' OR tahun LIKE '%" + pmb.getSearch().getText()
                        + "%' OR status LIKE '%" + pmb.getSearch().getText() + "%'";
                Statement stat = con.createStatement();
                ResultSet res = stat.executeQuery(sql);
                while (res.next()) {
                    model.addRow(new Object[]{res.getString("merk"),
                        res.getString("tipe"),
                        res.getString("tahun"),
                        res.getString("nopol"),
                        res.getString("harga"),
                        res.getString("status")});
                }
                pmb.getTabelMobil().setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pencarian Error");
            }
        }
    }

    @Override
    public void klikTabel(java.awt.event.MouseEvent evt) {
        int baris = pmb.getTabelMobil().rowAtPoint(evt.getPoint());
        String merk = pmb.getTabelMobil().getValueAt(baris, 0).toString();
        pmb.getMerk().setText(merk);

        String tipe = pmb.getTabelMobil().getValueAt(baris, 1).toString();
        pmb.getTipe().setText(tipe);

        String tahun = pmb.getTabelMobil().getValueAt(baris, 2).toString();
        pmb.getTahun().setText(tahun);

        String nopol = pmb.getTabelMobil().getValueAt(baris, 3).toString();
        pmb.getNopol().setText(nopol);

        String harga = pmb.getTabelMobil().getValueAt(baris, 4).toString();
        pmb.getHarga().setText(harga);

        String status = pmb.getTabelMobil().getValueAt(baris, 5).toString();
        pmb.getStatus().setText(status);
    }

    @Override
    public void kembali() {
        menuUser.jDesktopPane1.removeAll();
        menuUser.jDesktopPane1.repaint();
        formIsiData fi = new formIsiData();
        fi.setVisible(true);
        menuUser.jDesktopPane1.add(fi);
    }

}
