package Interface;

import javax.swing.table.DefaultTableModel;
import pos.Logic;

/**
 * The logic is instantiated which will be private and and Creates an instance
 * of DefaultTableModel for the table model.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class JIFUsers extends javax.swing.JInternalFrame {

    Logic logic;
    static DefaultTableModel model;

    /**
     * Creates new form JIFUsers. Initializes the logic, the gui components and
     * loads the user data into a table.
     */
    public JIFUsers() {
        logic = new Logic(); // Instance of the Logic class for user business logic
        initComponents(); // Initialize the components of the graphical interface
        logic.loadUserTxt(jtUsers); // Load the user data into a table
        model = new DefaultTableModel(); // empty table model

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
        JScrollPane = new javax.swing.JScrollPane();
        jtUsers = new javax.swing.JTable();
        btnRegisterUser = new javax.swing.JButton();
        btnDeleteUser = new javax.swing.JButton();
        btnUpdateTable = new javax.swing.JButton();

        setClosable(true);
        setTitle("Módulo de Usuario");

        jPanel1.setBackground(new java.awt.Color(189, 209, 222));

        jtUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario", "Contraseña", "Role"
            }
        ));
        JScrollPane.setViewportView(jtUsers);

        btnRegisterUser.setText("Registrar Usuario");
        btnRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterUserActionPerformed(evt);
            }
        });

        btnDeleteUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/garbage.png"))); // NOI18N
        btnDeleteUser.setToolTipText("Eliminar Usuario");
        btnDeleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteUserActionPerformed(evt);
            }
        });

        btnUpdateTable.setText("Actualizar");
        btnUpdateTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTableActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(136, 136, 136)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnUpdateTable, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnDeleteUser, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(92, Short.MAX_VALUE))
        );

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
     * Handles the action event when the "btnRegisterUser" button is clicked.
     * Create and display a modal dialog to register a new user.
     *
     * @param evt The action event that fires the method.
     */
    private void btnRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterUserActionPerformed
        // Crear una instancia de la clase FRMDialogOrder, que es un diálogo para crear un pedido
        FRMDialogRegisterUser dialogRegisterUser = new FRMDialogRegisterUser(null, true);
        dialogRegisterUser.setLocationRelativeTo(null);
        // Establecer el diálogo como modal y hacerlo visible
        dialogRegisterUser.setVisible(true);
    }//GEN-LAST:event_btnRegisterUserActionPerformed
    /**
     * Handles the action event when the "btnDeleteUser" button is clicked. This
     * button load the list back to the table to show the new changes made
     */
    private void btnUpdateTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTableActionPerformed

        logic.loadUserTxt(jtUsers);

    }//GEN-LAST:event_btnUpdateTableActionPerformed
    /**
     * Handles the action event when the "btnDeleteUser" button is clicked. This
     * button removes the selected user from the user table and save the txt
     * with the Users.
     *
     * @param evt The action event that fires the method.
     */
    private void btnDeleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteUserActionPerformed
        logic.deleteTableRow(jtUsers);
        logic.loadUsersTable(jtUsers);
        logic.saveUsersToFile();
    }//GEN-LAST:event_btnDeleteUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane JScrollPane;
    private javax.swing.JButton btnDeleteUser;
    private javax.swing.JButton btnRegisterUser;
    private javax.swing.JButton btnUpdateTable;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTable jtUsers;
    // End of variables declaration//GEN-END:variables
}
