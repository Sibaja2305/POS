package Interface;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import pos.Logic;

/**
 * Class that represents the manager window in the application.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class FRMAdmin extends javax.swing.JFrame {

    private Logic logic; // Instance of the Logic class to handle the manager logic

    private JIFMenu menu;
    private JIFInventory inventoryWindow;
    private JIFUsers userWindow;
    private JIFReport report;

    /**
     * Constructor of the FRMAdmin class. Create a new instance of the Logic
     * class and call the initComponents() method to initialize the window
     * components. Creates new form FRMAdmin
     */
    public FRMAdmin() {

        logic = new Logic();
        initComponents(); // Initialize window components
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
        btnMenu = new javax.swing.JButton();
        btnInventary = new javax.swing.JButton();
        btnTable = new javax.swing.JButton();
        btnReport = new javax.swing.JButton();
        btnUsers = new javax.swing.JButton();
        btnLockOut = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        desktopAdmin = new javax.swing.JDesktopPane();
        jPanel2 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jmHelpAdmin = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(-4);

        jPanel3.setBackground(new java.awt.Color(65, 128, 171));

        btnMenu.setBackground(new java.awt.Color(227, 167, 47));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnInventary.setBackground(new java.awt.Color(227, 167, 47));
        btnInventary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/inventory.png"))); // NOI18N
        btnInventary.setText("Inventario");
        btnInventary.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventaryActionPerformed(evt);
            }
        });

        btnTable.setBackground(new java.awt.Color(227, 167, 47));
        btnTable.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/draft.png"))); // NOI18N
        btnTable.setText("Mesas");

        btnReport.setBackground(new java.awt.Color(227, 167, 47));
        btnReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/report.png"))); // NOI18N
        btnReport.setText("Reporte");
        btnReport.setToolTipText("");
        btnReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReportActionPerformed(evt);
            }
        });

        btnUsers.setBackground(new java.awt.Color(227, 167, 47));
        btnUsers.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/users.png"))); // NOI18N
        btnUsers.setText("Usuario");
        btnUsers.setToolTipText("");
        btnUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsersActionPerformed(evt);
            }
        });

        btnLockOut.setBackground(new java.awt.Color(153, 153, 153));
        btnLockOut.setForeground(new java.awt.Color(0, 0, 0));
        btnLockOut.setText("Cerrar Sesión");
        btnLockOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLockOutActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/businessman.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btnLockOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInventary, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(btnTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsers, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnInventary, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnTable, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReport, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUsers, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(btnLockOut, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jSplitPane1.setLeftComponent(jPanel3);

        javax.swing.GroupLayout desktopAdminLayout = new javax.swing.GroupLayout(desktopAdmin);
        desktopAdmin.setLayout(desktopAdminLayout);
        desktopAdminLayout.setHorizontalGroup(
            desktopAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 668, Short.MAX_VALUE)
        );
        desktopAdminLayout.setVerticalGroup(
            desktopAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopAdmin))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(desktopAdmin))
        );

        jSplitPane1.setRightComponent(jPanel4);

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
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSplitPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jmHelpAdmin.setText("Ayuda");
        jmHelpAdmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmHelpAdminMouseClicked(evt);
            }
        });
        jMenuBar1.add(jmHelpAdmin);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * Method that is executed when an action is performed in "jmHelpAdmin"
 * of the ToolBar. A dialog of type "FRMDialogHelp" is created to which
 * a variable of type String with the name of the frame will be passed
 * as a parameter. The created dialog will be placed in the center of
 * the screen and will be set visible
 * 
 * @param evt admin help button
 */
    private void jmHelpAdminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmHelpAdminMouseClicked
        try {
            String nameFrame = "Admin";
            FRMDialogHelp dialogHelp = new FRMDialogHelp(null, true, nameFrame);
            dialogHelp.setLocationRelativeTo(null);
            dialogHelp.setVisible(true);
        } catch (IOException ex) {
            Logger.getLogger(FRMAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jmHelpAdminMouseClicked

    /**
     * Method that is executed when an action is performed on the "btnLockOut"
     * button. Call the "lockOut()" method of the "logic" class instance. Close
     * the current window "dispose()"
     *
     * @param evt The action event associated with the "btnLockOut" button.
     */
    private void btnLockOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLockOutActionPerformed
        logic.lockOut();
        dispose();
    }//GEN-LAST:event_btnLockOutActionPerformed

    /**
     * Method that is executed when an action is performed on the
     * "btnRegisterUser" button. Creates an instance of the "JIFRegister" class
     * and displays it. Add the "JIFRegister" instance to the "desktopAdmin".
     *
     * @param evt The action event associated with the "btnRegisterUser" button.
     */
    private void btnUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsersActionPerformed

        if (userWindow == null || !userWindow.isShowing()) {

            userWindow = new JIFUsers();
            userWindow.setVisible(true);
            desktopAdmin.add(userWindow);

        }
    }//GEN-LAST:event_btnUsersActionPerformed

    private void btnReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReportActionPerformed
         if (report == null || !report.isShowing()) {
            report = new JIFReport();
            report.setVisible(true);
            desktopAdmin.add(report);

        }
    }//GEN-LAST:event_btnReportActionPerformed

    /**
     * Method that is executed when an action is performed on the "btnInventory"
     * button. Creates an instance of the "JIFInventory" class and displays it.
     * Add the instance of "JIFInventory" to the "desktopAdmin".
     *
     * @param evt The action event associated with the "btnInventary" button.
     */
    private void btnInventaryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventaryActionPerformed
        if (inventoryWindow == null || !inventoryWindow.isShowing()) {
            inventoryWindow = new JIFInventory();
            inventoryWindow.setVisible(true);
            desktopAdmin.add(inventoryWindow);

        }
    }//GEN-LAST:event_btnInventaryActionPerformed

    /**
     * Method that is executed when an action is performed on the "btnMenu"
     * button. Creates an instance of the "JIFMenu" class and displays it. Add
     * the instance of "JIFMenu" to the "desktopAdmin".
     *
     * @param evt The action event associated with the "btnMenu" button.
     */
    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        if (menu == null || !menu.isVisible()) {
            menu = new JIFMenu();
            menu.setVisible(true);
            desktopAdmin.add(menu);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    /**
     * Java application entry point.
     *
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
            java.util.logging.Logger.getLogger(FRMAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FRMAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInventary;
    private javax.swing.JButton btnLockOut;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnReport;
    private javax.swing.JButton btnTable;
    private javax.swing.JButton btnUsers;
    private javax.swing.JDesktopPane desktopAdmin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenu jmHelpAdmin;
    // End of variables declaration//GEN-END:variables
}
