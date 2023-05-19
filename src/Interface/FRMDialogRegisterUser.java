package Interface;

import java.awt.Color;
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
public class FRMDialogRegisterUser extends javax.swing.JDialog {

    private Logic logic;

    /**
     * Creates new form FRMDialogRegisterUser Creates new form jipRegister Here
     * the logic is instantiated and the components are initialized with
     * initComponents() for their proper execution in the interface
     */
    public FRMDialogRegisterUser(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        logic = new Logic();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtRegisterUser = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRegisterPass = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jcRegisterRole = new javax.swing.JComboBox<>();
        btnRegisterNewUser = new javax.swing.JButton();
        btnCancelRegisterUser = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Usuario:");

        txtRegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRegisterUserMousePressed(evt);
            }
        });

        jLabel2.setText("Contraseña:");

        txtRegisterPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRegisterPassMousePressed(evt);
            }
        });

        jLabel3.setText("Asiganar Rol:");

        jcRegisterRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Mesero", "Chef", "Bartender" }));

        btnRegisterNewUser.setText("Registrar");
        btnRegisterNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewUserActionPerformed(evt);
            }
        });

        btnCancelRegisterUser.setText("Cancelar");
        btnCancelRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelRegisterUserActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(txtRegisterPass, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnRegisterNewUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcRegisterRole, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(btnCancelRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(289, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRegisterPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcRegisterRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegisterNewUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method called when the button to register a new user is clicked. Gets the
     * text entered in the user field (txtRegisterUser). Gets the text entered
     * in the password field (txtRegisterPass) by converting it to a string.
     * Gets the value selected in the role field (jcRegisterRole). Call the
     * logic.readUser() method to read existing users. Call the
     * logic.addNewUser() method to add a new user with the input data.
     *
     * @param evt The action event generated by the register a new user button.
     */
    private void btnRegisterNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewUserActionPerformed
        // Get the text entered in the user field (txtRegisterUser)
        String username = txtRegisterUser.getText();
        // Get the text entered in the password field (txtRegisterPass) by converting it to a string
        String password = new String(txtRegisterPass.getPassword());
        // Get the selected value in the role field (jcRegisterRole)
        String role = (String) jcRegisterRole.getSelectedItem();
        // Call the logic.readUser() method to read existing users
        System.out.println("cargados antes de añadir");
        logic.readUser();
        System.out.println("-------------------------");
        // Call the logic.addNewUser() method to add a new user with the input data
        logic.addNewUser(username, password, role);
      dispose();
    }//GEN-LAST:event_btnRegisterNewUserActionPerformed
    /**
     * Handles the mouse click event on the password text field. Handles the
     * mouse click event on the user text field. It is verified if the text in
     * the text field txtUser is equal to "Enter the user email". If so, the
     * text is cleared and the text color is set to gray. Then, it is checked if
     * the txtPass password field is empty. The
     * String.valueOf(txtPass.getPassword()) method is used to get the content
     * of the password field and checked if it is empty using isEmpty(). If the
     * password field is empty, the text is set to "********" and the text color
     * to black.
     *
     * @param evt The mouse event generated by the text field.
     * @param evt
     */
    private void txtRegisterUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterUserMousePressed
        if (txtRegisterUser.getText().equals("Ingrese el correo de usuario")) {
            txtRegisterUser.setText("");
            txtRegisterUser.setForeground(Color.black);
        }
        if (String.valueOf(txtRegisterPass.getPassword()).isEmpty()) {
            txtRegisterPass.setText("********");
            txtRegisterPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtRegisterUserMousePressed

    /**
     * Handles the mouse click event on the user text field. It is verified if
     * the text in the text field txtUser is equal to "Enter the user email". If
     * so, the text is cleared and the text color is set to black. Then, it is
     * checked if the txtPass password field is empty. The
     * String.valueOf(txtPass.getPassword()) method is used to get the content
     * of the password field and checked if it is empty using isEmpty(). If the
     * password field is empty, the text is set to "********" and the text color
     * to gray.
     *
     * @param evt The mouse event generated by the text field.
     */
    private void txtRegisterPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterPassMousePressed
        if (txtRegisterUser.getText().isEmpty()) {
            txtRegisterUser.setText("Ingrese el correo de usuario");
            txtRegisterUser.setForeground(Color.gray);
        }
        if (String.valueOf(txtRegisterPass.getPassword()).equals("********")) {
            txtRegisterPass.setText("");
            txtRegisterPass.setForeground(Color.black);
        }

    }//GEN-LAST:event_txtRegisterPassMousePressed

    private void btnCancelRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelRegisterUserActionPerformed
      dispose();
    }//GEN-LAST:event_btnCancelRegisterUserActionPerformed

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
            java.util.logging.Logger.getLogger(FRMDialogRegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMDialogRegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMDialogRegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMDialogRegisterUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRMDialogRegisterUser dialog = new FRMDialogRegisterUser(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelRegisterUser;
    private javax.swing.JButton btnRegisterNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcRegisterRole;
    private javax.swing.JPasswordField txtRegisterPass;
    private javax.swing.JTextField txtRegisterUser;
    // End of variables declaration//GEN-END:variables
}
