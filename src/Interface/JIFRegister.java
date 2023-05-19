/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Interface;

import java.awt.Color;
import pos.Logic;

/**
 *
 * @author yorda
 */
public class JIFRegister extends javax.swing.JInternalFrame {
    private Logic logic;
    /**
     * Creates new form jipRegister
     */
    public JIFRegister() {
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
        lblRegisterUser = new javax.swing.JLabel();
        lblRegisterPassword = new javax.swing.JLabel();
        txtRegisterUser = new javax.swing.JTextField();
        txtRegisterPass = new javax.swing.JPasswordField();
        btnRegisterNewUser = new javax.swing.JButton();
        jcRegisterRole = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Módulo de Registrar");

        lblRegisterUser.setText("Usuario");

        lblRegisterPassword.setText("Contraseña");

        txtRegisterUser.setText("Ingrese el correo de usuario");
        txtRegisterUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRegisterUserMousePressed(evt);
            }
        });
        txtRegisterUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterUserActionPerformed(evt);
            }
        });

        txtRegisterPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtRegisterPassMousePressed(evt);
            }
        });
        txtRegisterPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegisterPassActionPerformed(evt);
            }
        });

        btnRegisterNewUser.setText("Registrar");
        btnRegisterNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterNewUserActionPerformed(evt);
            }
        });

        jcRegisterRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Chef", "Mesero", "Bartender" }));

        jLabel1.setText("Asignar Rol");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblRegisterUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblRegisterPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtRegisterUser)
                        .addComponent(txtRegisterPass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jcRegisterRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(btnRegisterNewUser)))
                .addContainerGap(351, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(lblRegisterUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtRegisterUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(lblRegisterPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtRegisterPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcRegisterRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegisterNewUser))
                .addGap(63, 63, 63))
        );

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

    private void txtRegisterUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterUserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterUserActionPerformed

    private void txtRegisterPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegisterPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRegisterPassActionPerformed

    private void txtRegisterPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterPassMousePressed
         if(txtRegisterUser.getText().isEmpty()){
        txtRegisterUser.setText("Ingrese el correo de usuario");
        txtRegisterUser.setForeground(Color.gray);
        }
        if(String.valueOf(txtRegisterPass.getPassword()).equals("********")){
        txtRegisterPass.setText("");
        txtRegisterPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtRegisterPassMousePressed

    private void txtRegisterUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtRegisterUserMousePressed
        if(txtRegisterUser.getText().equals("Ingrese el correo de usuario") ){
        txtRegisterUser.setText("");
        txtRegisterUser.setForeground(Color.black);
        }
        if(String.valueOf(txtRegisterPass.getPassword()).isEmpty()){
        txtRegisterPass.setText("********");
        txtRegisterPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtRegisterUserMousePressed

    private void btnRegisterNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterNewUserActionPerformed
        String username = txtRegisterUser.getText();
        String password = new String(txtRegisterPass.getPassword());
        String role = (String) jcRegisterRole.getSelectedItem();
        System.out.println("cargados antes de añadir");
        logic.readUser();
        System.out.println("-------------------------");
        logic.addNewUser(username, password, role);
    }//GEN-LAST:event_btnRegisterNewUserActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegisterNewUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jcRegisterRole;
    private javax.swing.JLabel lblRegisterPassword;
    private javax.swing.JLabel lblRegisterUser;
    private javax.swing.JPasswordField txtRegisterPass;
    private javax.swing.JTextField txtRegisterUser;
    // End of variables declaration//GEN-END:variables
}