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
import main.formPilihMotor;
import main.formTransaksiMotor;
import main.menuUser;

/**
 *
 * @author Alif
 */
public class pilihMotorCtr extends pilihKendaraanSuper{
    private static formPilihMotor pmt;

    public pilihMotorCtr(formPilihMotor pmt) {
        this.pmt = pmt;
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
            pmt.getTabelMotor().setModel(model);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }

    @Override
    public void berikutnya() {
        if (!pmt.getStatus().getText().equalsIgnoreCase("Tersedia")) {
            JOptionPane.showMessageDialog(null, "Maaf motor ini sedang tidak tersedia");
        } else {
            String merk = pmt.getMerk().getText();
            String tipe = pmt.getTipe().getText();
            String tahun = pmt.getTahun().getText();
            String nopol = pmt.getNopol().getText();
            String harga = pmt.getHarga().getText();
            String status = pmt.getStatus().getText();

            menuUser.jDesktopPane1.removeAll();
            menuUser.jDesktopPane1.repaint();
            formTransaksiMotor ft = new formTransaksiMotor(nama, nik, alamat, tlp, email, merk, tipe, tahun, nopol, harga, status);
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

        if (pmt.getSearch().getText().isEmpty()) {
            tampilkan_data();
        } else {
            try {
                Connection con = (Connection) koneksiDB.koneksi.connectionDB();
                String sql = "Select * from tb_motor where merk LIKE '%" + pmt.getSearch().getText()
                        + "%' OR tipe LIKE '%" + pmt.getSearch().getText()
                        + "%' OR merk LIKE '%" + pmt.getSearch().getText()
                        + "%' OR nopol LIKE '%" + pmt.getSearch().getText()
                        + "%' OR harga LIKE '%" + pmt.getSearch().getText()
                        + "%' OR tahun LIKE '%" + pmt.getSearch().getText()
                        + "%' OR status LIKE '%" + pmt.getSearch().getText() + "%'";
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
                pmt.getTabelMotor().setModel(model);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Pencarian Error");
            }
        }
    }

    @Override
    public void klikTabel(java.awt.event.MouseEvent evt) {
        int baris = pmt.getTabelMotor().rowAtPoint(evt.getPoint());
        String merk = pmt.getTabelMotor().getValueAt(baris, 0).toString();
        pmt.getMerk().setText(merk);

        String tipe = pmt.getTabelMotor().getValueAt(baris, 1).toString();
        pmt.getTipe().setText(tipe);

        String tahun = pmt.getTabelMotor().getValueAt(baris, 2).toString();
        pmt.getTahun().setText(tahun);

        String nopol = pmt.getTabelMotor().getValueAt(baris, 3).toString();
        pmt.getNopol().setText(nopol);

        String harga = pmt.getTabelMotor().getValueAt(baris, 4).toString();
        pmt.getHarga().setText(harga);

        String status = pmt.getTabelMotor().getValueAt(baris, 5).toString();
        pmt.getStatus().setText(status);
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
