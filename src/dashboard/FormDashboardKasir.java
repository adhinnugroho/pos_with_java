/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dashboard;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author y0nd4n
 */
public class FormDashboardKasir extends javax.swing.JFrame {

    /**
     * Creates new form dashboardKasir
     */
    public FormDashboardKasir() {
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

        Selamat1 = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        TombolTransaksi = new javax.swing.JMenu();
        Transaksi = new javax.swing.JMenuItem();
        TombolLogout = new javax.swing.JMenu();
        Logoutbtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Selamat1.setFont(new java.awt.Font("Poppins", 0, 18)); // NOI18N
        Selamat1.setText("Welcome To Aplikasi Point of Sales");

        TombolTransaksi.setText("Transaksi");

        Transaksi.setText("Transaksi");
        Transaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TransaksiActionPerformed(evt);
            }
        });
        TombolTransaksi.add(Transaksi);

        MenuBar.add(TombolTransaksi);

        TombolLogout.setText("Logout");

        Logoutbtn.setText("Logout");
        Logoutbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogoutbtnActionPerformed(evt);
            }
        });
        TombolLogout.add(Logoutbtn);

        MenuBar.add(TombolLogout);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Selamat1)
                .addContainerGap(100, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Selamat1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TransaksiActionPerformed

    }//GEN-LAST:event_TransaksiActionPerformed

    private void LogoutbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogoutbtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_LogoutbtnActionPerformed

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
            java.util.logging.Logger.getLogger(FormDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormDashboardKasir.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormDashboardKasir().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Logoutbtn;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JLabel Selamat1;
    private javax.swing.JMenu TombolLogout;
    private javax.swing.JMenu TombolTransaksi;
    private javax.swing.JMenuItem Transaksi;
    // End of variables declaration//GEN-END:variables
}