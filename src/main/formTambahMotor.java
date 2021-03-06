/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import control.tambahMotor;
import java.awt.event.KeyEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import validasi.validasi;
import super_interface.kendaraanIntrfc;

/**
 *
 * @author Alif
 */
public class formTambahMotor extends javax.swing.JInternalFrame {
    
    private kendaraanIntrfc motorCtr;
    
    validasi Valid = new validasi();
    
    public formTambahMotor() {
        initComponents();
        motorCtr = new tambahMotor(this);
        motorCtr.tampilkan_data();
    }

    public JComboBox<String> getTahun() {
        return cbTahun;
    }

    public JTextField getHarga() {
        return tfHarga;
    }

    public JTextField getMerk() {
        return tfMerk;
    }

    public JTextField getNopol() {
        return tfNopol;
    }

    public JTextField getTipe() {
        return tfTipe;
    }

    public JComboBox<String> getStatus() {
        return cbStatus;
    }

    public JTextField getSearch() {
        return tfSearch;
    }

    public JTable getTabelMotor() {
        return tabelMotor;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tfMerk = new javax.swing.JTextField();
        tfTipe = new javax.swing.JTextField();
        tfNopol = new javax.swing.JTextField();
        tfHarga = new javax.swing.JTextField();
        cbTahun = new javax.swing.JComboBox<>();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btTambah = new javax.swing.JButton();
        btEdit = new javax.swing.JButton();
        btHapus = new javax.swing.JButton();
        tfSearch = new javax.swing.JTextField();
        btSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelMotor = new javax.swing.JTable();
        bg = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(206, 228, 237));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setText("Status");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel3.setText("Merk Motor");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel4.setText("Tipe Motor");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, -1));

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel5.setText("Tahun Produksi");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel6.setText("No. Polisi");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, -1, 30));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel7.setText("Harga Sewa");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, -1, -1));

        tfMerk.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfMerk.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfMerk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfMerkActionPerformed(evt);
            }
        });
        jPanel1.add(tfMerk, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 190, 30));

        tfTipe.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfTipe.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfTipe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfTipeActionPerformed(evt);
            }
        });
        jPanel1.add(tfTipe, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 190, 30));

        tfNopol.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfNopol.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfNopol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfNopolActionPerformed(evt);
            }
        });
        jPanel1.add(tfNopol, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 190, 30));

        tfHarga.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        tfHarga.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tfHarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHargaActionPerformed(evt);
            }
        });
        jPanel1.add(tfHarga, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 120, 190, 30));

        cbTahun.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbTahun.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2021", "2020", "2019", "2018", "2017", "2016", "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000" }));
        cbTahun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTahunActionPerformed(evt);
            }
        });
        jPanel1.add(cbTahun, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 190, -1));

        cbStatus.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tersedia", "Keluar" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });
        jPanel1.add(cbStatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, 190, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/ilustrasi3.png"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 830, 250));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel2.setText("TAMBAH MOTOR");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, -1));

        btTambah.setBackground(new java.awt.Color(243, 179, 4));
        btTambah.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah.png"))); // NOI18N
        btTambah.setText("Tambah");
        btTambah.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTambahActionPerformed(evt);
            }
        });
        getContentPane().add(btTambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 180, 40));

        btEdit.setBackground(new java.awt.Color(243, 179, 4));
        btEdit.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/edit.png"))); // NOI18N
        btEdit.setText("Edit");
        btEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditActionPerformed(evt);
            }
        });
        getContentPane().add(btEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 180, 40));

        btHapus.setBackground(new java.awt.Color(243, 179, 4));
        btHapus.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btHapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/hapus.png"))); // NOI18N
        btHapus.setText("Hapus");
        btHapus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHapusActionPerformed(evt);
            }
        });
        getContentPane().add(btHapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 340, 180, 40));

        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
        });
        getContentPane().add(tfSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 350, 190, 30));

        btSearch.setBackground(new java.awt.Color(243, 179, 4));
        btSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/search.png"))); // NOI18N
        btSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSearchActionPerformed(evt);
            }
        });
        getContentPane().add(btSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 350, 50, 30));

        tabelMotor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMotorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelMotor);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 830, 190));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 957, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfMerkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfMerkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfMerkActionPerformed

    private void tfTipeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfTipeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfTipeActionPerformed

    private void tfNopolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfNopolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfNopolActionPerformed

    private void tfHargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHargaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHargaActionPerformed

    private void cbTahunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTahunActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbTahunActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed

    private void btTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTambahActionPerformed
        motorCtr.tambah();
    }//GEN-LAST:event_btTambahActionPerformed

    private void btEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditActionPerformed
        motorCtr.edit();
        motorCtr.tampilkan_data();
        motorCtr.kosongkan_form();
    }//GEN-LAST:event_btEditActionPerformed

    private void btHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHapusActionPerformed
        motorCtr.hapus();
        motorCtr.tampilkan_data();
        motorCtr.kosongkan_form();
    }//GEN-LAST:event_btHapusActionPerformed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed

    }//GEN-LAST:event_tfSearchActionPerformed

    private void btSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSearchActionPerformed
        motorCtr.cari();
        motorCtr.kosongkan_form();
    }//GEN-LAST:event_btSearchActionPerformed

    private void tabelMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMotorMouseClicked
        motorCtr.klikTabel(evt);
    }//GEN-LAST:event_tabelMotorMouseClicked

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){
            btSearchActionPerformed(null);
        }else{
            Valid.pindah(evt, tfSearch, btSearch);
        }
    }//GEN-LAST:event_tfSearchKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btEdit;
    private javax.swing.JButton btHapus;
    private javax.swing.JButton btSearch;
    private javax.swing.JButton btTambah;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTahun;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelMotor;
    private javax.swing.JTextField tfHarga;
    private javax.swing.JTextField tfMerk;
    private javax.swing.JTextField tfNopol;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JTextField tfTipe;
    // End of variables declaration//GEN-END:variables
}
