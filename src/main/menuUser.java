/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Alif
 */
public class menuUser extends javax.swing.JFrame {

    /**
     * Creates new form menuUser
     */
    public menuUser() {
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
        jLabel2 = new javax.swing.JLabel();
        btSewa = new javax.swing.JButton();
        btKembalikan = new javax.swing.JButton();
        btLogout = new javax.swing.JButton();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(100, 50));
        setPreferredSize(new java.awt.Dimension(1190, 660));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setText("MENU");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel2.setText("RENTAL");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        btSewa.setBackground(new java.awt.Color(243, 179, 4));
        btSewa.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btSewa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/car2.png"))); // NOI18N
        btSewa.setText("Sewa");
        btSewa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btSewa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSewaActionPerformed(evt);
            }
        });
        getContentPane().add(btSewa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 60));

        btKembalikan.setBackground(new java.awt.Color(243, 179, 4));
        btKembalikan.setFont(new java.awt.Font("Century Gothic", 0, 20)); // NOI18N
        btKembalikan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/car3.png"))); // NOI18N
        btKembalikan.setText("Kembalikan");
        btKembalikan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btKembalikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKembalikanActionPerformed(evt);
            }
        });
        getContentPane().add(btKembalikan, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 180, 60));

        btLogout.setBackground(new java.awt.Color(255, 51, 51));
        btLogout.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        btLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/logout.png"))); // NOI18N
        btLogout.setText("Logout");
        btLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 540, -1, -1));
        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 970, 620));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/bg2.png"))); // NOI18N
        getContentPane().add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 957, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btSewaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSewaActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        formIsiData id = new formIsiData();
        id.setVisible(true);
        jDesktopPane1.add(id);
    }//GEN-LAST:event_btSewaActionPerformed

    private void btKembalikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKembalikanActionPerformed
        jDesktopPane1.removeAll();
        jDesktopPane1.repaint();
        formPengembalian pb = new formPengembalian();
        pb.setVisible(true);
        jDesktopPane1.add(pb);
    }//GEN-LAST:event_btKembalikanActionPerformed

    private void btLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLogoutActionPerformed
        this.dispose();
        login l = new login();
        l.setVisible(true);
    }//GEN-LAST:event_btLogoutActionPerformed

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
            java.util.logging.Logger.getLogger(menuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bg;
    private javax.swing.JButton btKembalikan;
    private javax.swing.JButton btLogout;
    private javax.swing.JButton btSewa;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
