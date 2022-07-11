/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import javax.swing.JOptionPane;

/**
 *
 * @author Alif
 */
public class loadingScreen extends javax.swing.JFrame {

    /**
     * Creates new form loadingScreen
     */
    public loadingScreen() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        loadingtxt = new javax.swing.JLabel();
        persentxt = new javax.swing.JLabel();
        loadingBar = new javax.swing.JProgressBar();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(200, 50));
        setMinimumSize(new java.awt.Dimension(960, 600));
        setPreferredSize(new java.awt.Dimension(972, 640));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 200, -1, -1));

        loadingtxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        loadingtxt.setText("Loading...");
        getContentPane().add(loadingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 540, -1, -1));

        persentxt.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        persentxt.setText("0 %");
        getContentPane().add(persentxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 540, -1, -1));

        loadingBar.setBackground(new java.awt.Color(89, 34, 29));
        loadingBar.setForeground(new java.awt.Color(89, 34, 29));
        getContentPane().add(loadingBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 574, 940, 20));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(loadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(loadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(loadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(loadingScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        loadingScreen ls = new loadingScreen();
        ls.setVisible(true);
        login lgn = new login();
        try {
            
            for (int i = 0; i <= 100; i++) {
                Thread.sleep(70);
                ls.persentxt.setText(i + "%");
                
                if (i==0) {
                    ls.loadingtxt.setText("Memulai Aplikasi...");
                }
                if (i==20) {
                    ls.loadingtxt.setText("Memuat Aplikasi...");
                }
                if (i==45) {
                    ls.loadingtxt.setText("Menyambungkan Database...");
                }
                if (i==65) {
                    ls.loadingtxt.setText("Database Tersambung !!");
                }
                if (i==75) {
                    ls.loadingtxt.setText("Memulai Aplikasi...");
                }
                ls.loadingBar.setValue(i);
                if(i==100){
                    ls.setVisible(false);
                    lgn.setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JProgressBar loadingBar;
    private javax.swing.JLabel loadingtxt;
    private javax.swing.JLabel persentxt;
    // End of variables declaration//GEN-END:variables
}