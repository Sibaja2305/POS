package Interface;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.Logic;

/**
 * The logic is instantiated which will be private
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class FRMWaiter extends javax.swing.JFrame {

    private Logic logic;

    /**
     * The FRMWaiter instantiates the Logic class, initializes the GUI
     * components, and calls the createTable() method to load the data into the
     * table as soon as you enter
     */
    public FRMWaiter() throws IOException {
        logic = new Logic();
        initComponents();
        logic.createTable(DesktopWaiter);
        this.setExtendedState(this.MAXIMIZED_BOTH);

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
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel3 = new javax.swing.JPanel();
        DesktopWaiter = new javax.swing.JDesktopPane();
        jPanel4 = new javax.swing.JPanel();
        btnSignOff = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmHelpWaiter = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopWaiterLayout = new javax.swing.GroupLayout(DesktopWaiter);
        DesktopWaiter.setLayout(DesktopWaiterLayout);
        DesktopWaiterLayout.setHorizontalGroup(
            DesktopWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        DesktopWaiterLayout.setVerticalGroup(
            DesktopWaiterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopWaiter)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DesktopWaiter))
        );

        jSplitPane1.setRightComponent(jPanel3);

        jPanel4.setBackground(new java.awt.Color(65, 128, 171));

        btnSignOff.setBackground(new java.awt.Color(153, 153, 153));
        btnSignOff.setText("Cerrar Sesion");
        btnSignOff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignOffActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo pequeño.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, Short.MAX_VALUE)
            .addComponent(btnSignOff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 297, Short.MAX_VALUE)
                .addComponent(btnSignOff, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jSplitPane1.setLeftComponent(jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmHelpWaiter.setText("Ayuda");
        jmHelpWaiter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmHelpWaiterMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmHelpWaiter);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method called when the "Logout" button is clicked. Call logic to perform
     * logout. Closes the current window after executing the action.
     *
     * @param evt The action event generated by the "Logout" button.
     */
    private void btnSignOffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignOffActionPerformed
        // Call logic to perform logout
        logic.lockOut();
        // Close the current window (dispose() is a method of the JFrame class)
        dispose();
    }//GEN-LAST:event_btnSignOffActionPerformed
    /**
     * This button assigns a String with "Waiter" so that the FRMDialogHelp can
     * read text that contains the help to later display the dialog in the
     * center of the screen
     *
     * @param evt
     */
    private void jmHelpWaiterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmHelpWaiterMouseClicked
        try {
            String nameFrame = "Mesero";
            FRMDialogHelp dialogHelp = new FRMDialogHelp(null, true, nameFrame);
            dialogHelp.setLocationRelativeTo(null);
            dialogHelp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FRMWaiter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmHelpWaiterMouseClicked

    /**
     * Java application entry point.
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
            java.util.logging.Logger.getLogger(FRMWaiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMWaiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMWaiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMWaiter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new FRMWaiter().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(FRMWaiter.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopWaiter;
    private javax.swing.JButton btnSignOff;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenu jmHelpWaiter;
    // End of variables declaration//GEN-END:variables
}
