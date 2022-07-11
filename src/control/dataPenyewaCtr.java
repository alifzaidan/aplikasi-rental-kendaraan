/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import main.dataPenyewa;
import super_interface.dataPenyewaIntrfc;

/**
 *
 * @author Alif
 */
public class dataPenyewaCtr implements dataPenyewaIntrfc{
    
    private static dataPenyewa dp;
    
    public dataPenyewaCtr(dataPenyewa dp) {
        this.dp = dp;
    }
    
    @Override
    public void tampilkan_data() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nama");
        model.addColumn("NIK");
        model.addColumn("Alamat");
        model.addColumn("No. Telpon");
        model.addColumn("Email");
        model.addColumn("Merk");
        model.addColumn("Tipe");
        model.addColumn("Tahun Produksi");
        model.addColumn("No. Polisi");
        model.addColumn("Harga/hari");
        model.addColumn("Tanggal Peminjaman");
        model.addColumn("Tanggal Pengembalian");
        model.addColumn("Lama Peminjaman");
        model.addColumn("Total Harga");

        try {
            String sql = "SELECT * FROM tb_peminjam";
            java.sql.Connection con = (Connection) koneksiDB.koneksi.connectionDB();
            java.sql.Statement stm = con.createStatement();
            java.sql.ResultSet res = stm.executeQuery(sql);

            while (res.next()) {
                model.addRow(new Object[]{res.getString("nama"),
                    res.getString("nik"),
                    res.getString("alamat"),
                    res.getString("telp"),
                    res.getString("email"),
                    res.getString("merk"),
                    res.getString("tipe"),
                    res.getString("tahun"),
                    res.getString("nopol"),
                    res.getString("harga"),
                    res.getString("tgl_pinjam"),
                    res.getString("tgl_kembali"),
                    res.getString("lama"),
                    res.getString("total")});
            }
            dp.getTabelPeminjam().setModel(model);

        } catch (SQLException e) {
            System.out.println("Error " + e.getMessage());
        }
    }
    
}
