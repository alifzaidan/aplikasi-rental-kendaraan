/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.transaksiMotorCtr;
import com.toedter.calendar.JDateChooser;
import javax.swing.JLabel;
import super_interface.transaksiKendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class formTransaksiMotor extends javax.swing.JInternalFrame {

    private transaksiKendaraanIntrfc trans;
    
    /**
     * Creates new form formTransaksiMotor
     */
    public formTransaksiMotor(String nama, String nik, String alamat, String tlp, String email, String merk, String tipe, String tahun, String nopol, String harga, String status) {
        initComponents();
        trans = new transaksiMotorCtr(this);
        lbl_nama.setText(nama);
        lbl_nik.setText(nik);
        lbl_alamat.setText(alamat);
        lbl_tlp.setText(tlp);
        lbl_email.setText(email);
        lbl_merk.setText(merk);
        lbl_tipe.setText(tipe);
        lbl_tahun.setText(tahun);
        lbl_nopol.setText(nopol);
        lbl_harga.setText(harga);
        lbl_status.setText(status);
    }
    
    public JDateChooser getjDateChooser1() {
        return jDateChooser1;
    }

    public JDateChooser getjDateChooser2() {
        return jDateChooser2;
    }

    public JLabel getAlamat() {
        return lbl_alamat;
    }

    public JLabel getEmail() {
        return lbl_email;
    }

    public JLabel getHarga() {
        return lbl_harga;
    }

    public JLabel getLama() {
        return lbl_lama;
    }

    public JLabel getMerk() {
        return lbl_merk;
    }

    public JLabel getNama() {
        return lbl_nama;
    }

    public JLabel getNik() {
        return lbl_nik;
    }

    public JLabel getNopol() {
        return lbl_nopol;
    }

    public JLabel getStatus() {
        return lbl_status;
    }

    public JLabel getTahun() {
        return lbl_tahun;
    }

    public JLabel getTipe() {
        return lbl_tipe;
    }

    public JLabel getTlp() {
        return lbl_tlp;
    }

    public JLabel getTotal() {
        return lbl_total;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        lbl_nama = new javax.swing.JLabel();
        lbl_nik = new javax.swing.JLabel();
        lbl_alamat = new javax.swing.JLabel();
        lbl_tlp = new javax.swing.JLabel();
        lbl_email = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        lbl_status = new javax.swing.JLabel();
        lbl_merk = new javax.swing.JLabel();
        lbl_tipe = new javax.swing.JLabel();
        lbl_tahun = new javax.swing.JLabel();
        lbl_nopol = new javax.swing.JLabel();
        lbl_harga = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel30 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel31 = new javax.swing.JLabel();
        btHitung = new javax.swing.JButton();
        jLabel33 = new javax.swing.JLabel();
        lbl_total = new javax.swing.JLabel();
        btSubmit = new javax.swing.JButton();
        lbl_lama = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btKembali = new javax.swing.JButton();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setText("DETAIL PEMINJAMAN MOTOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        jPanel1.setBackground(new java.awt.Color(206, 228, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Nama");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("NIK");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("Alamat");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("No. Telpon");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel9.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel9.setText("Email");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        lbl_nama.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_nama.setText(" ");
        jPanel1.add(lbl_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, -1, -1));

        lbl_nik.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_nik.setText(" ");
        jPanel1.add(lbl_nik, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 50, -1, -1));

        lbl_alamat.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_alamat.setText(" ");
        jPanel1.add(lbl_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, -1, 30));

        lbl_tlp.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_tlp.setText(" ");
        jPanel1.add(lbl_tlp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, -1, -1));

        lbl_email.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_email.setText(" ");
        jPanel1.add(lbl_email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel13.setText("Merk Mobil");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel14.setText("Tipe Mobil");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, -1, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel15.setText("Tahun Produksi");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel16.setText("No. Polisi");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel17.setText("Harga/hari");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, -1, -1));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel19.setText(":");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 10, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel20.setText(":");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 250, 10, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel21.setText(":");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 290, 10, -1));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel22.setText(":");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 10, -1));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel23.setText(":");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 370, 10, -1));

        lbl_status.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_status.setText(" ");
        jPanel1.add(lbl_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, -1, -1));

        lbl_merk.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_merk.setText(" ");
        jPanel1.add(lbl_merk, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, -1, -1));

        lbl_tipe.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_tipe.setText(" ");
        jPanel1.add(lbl_tipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, -1, -1));

        lbl_tahun.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_tahun.setText(" ");
        jPanel1.add(lbl_tahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        lbl_nopol.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_nopol.setText(" ");
        jPanel1.add(lbl_nopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, -1, 30));

        lbl_harga.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        lbl_harga.setText(" ");
        jPanel1.add(lbl_harga, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 370, -1, -1));

        jLabel24.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel24.setText(":");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel25.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel25.setText(":");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 50, 10, -1));

        jLabel26.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel26.setText(":");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 90, 10, -1));

        jLabel27.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel27.setText(":");
        jPanel1.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 10, -1));

        jLabel28.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel28.setText(":");
        jPanel1.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, 10, -1));

        jLabel29.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel29.setText(":");
        jPanel1.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 210, 10, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel18.setText("Tanggal Peminjaman");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 10, -1, -1));

        jDateChooser2.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 120, 250, 30));

        jLabel30.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel30.setText("Tanggal Pengembalian");
        jPanel1.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 90, -1, -1));

        jDateChooser1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 40, 250, 30));

        jLabel31.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel31.setText("Lama Peminjaman");
        jPanel1.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, 30));

        btHitung.setBackground(new java.awt.Color(243, 179, 4));
        btHitung.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btHitung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hitung.png"))); // NOI18N
        btHitung.setText("Hitung");
        btHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHitungActionPerformed(evt);
            }
        });
        jPanel1.add(btHitung, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel33.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel33.setText("Rp.");
        jPanel1.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 340, -1, -1));

        lbl_total.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        lbl_total.setText("Total");
        jPanel1.add(lbl_total, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 340, -1, -1));

        btSubmit.setBackground(new java.awt.Color(243, 179, 4));
        btSubmit.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btSubmit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/submit.png"))); // NOI18N
        btSubmit.setText("Submit");
        btSubmit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 400, -1, -1));

        lbl_lama.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jPanel1.add(lbl_lama, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel8.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel8.setText("Total Biaya Peminjaman");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 920, 460));

        btKembali.setBackground(new java.awt.Color(243, 179, 4));
        btKembali.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/back.png"))); // NOI18N
        btKembali.setText("Kembali");
        btKembali.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembaliActionPerformed(evt);
            }
        });
        getContentPane().add(btKembali, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 957, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHitungActionPerformed
        trans.hitung();
    }//GEN-LAST:event_btHitungActionPerformed

    private void btSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSubmitActionPerformed
        trans.submit();
    }//GEN-LAST:event_btSubmitActionPerformed

    private void btKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembaliActionPerformed
        trans.kembali();
    }//GEN-LAST:event_btKembaliActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btHitung;
    private javax.swing.JButton btKembali;
    private javax.swing.JButton btSubmit;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_alamat;
    private javax.swing.JLabel lbl_email;
    private javax.swing.JLabel lbl_harga;
    private javax.swing.JLabel lbl_lama;
    private javax.swing.JLabel lbl_merk;
    private javax.swing.JLabel lbl_nama;
    private javax.swing.JLabel lbl_nik;
    private javax.swing.JLabel lbl_nopol;
    private javax.swing.JLabel lbl_status;
    private javax.swing.JLabel lbl_tahun;
    private javax.swing.JLabel lbl_tipe;
    private javax.swing.JLabel lbl_tlp;
    private javax.swing.JLabel lbl_total;
    // End of variables declaration//GEN-END:variables
}