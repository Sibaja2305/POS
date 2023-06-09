package Interface;

import java.awt.Color;
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
public class FRMLogin extends javax.swing.JFrame {

    private Logic logic;
    int xMouse;
    int yMouse;

    /**
     * Initializes the data structures and models necessary for the program
     * FRMLogin.
     */
    public FRMLogin() {
        super("login");
        logic = new Logic();
        System.out.println("Registros en el login");
        logic.readUser();
        System.out.println("------------------------");
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        Backgroud = new javax.swing.JPanel();
        Ilustration = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        User = new javax.swing.JLabel();
        nameLogo = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        txtUser = new javax.swing.JTextField();
        userSeparator = new javax.swing.JSeparator();
        icoPassword = new javax.swing.JLabel();
        Password = new javax.swing.JLabel();
        icoUser = new javax.swing.JLabel();
        passwordSeparator = new javax.swing.JSeparator();
        txtPass = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JLabel();
        blueBackgroud = new javax.swing.JLabel();
        toolbar = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        jcRole = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Backgroud.setBackground(new java.awt.Color(255, 255, 255));
        Backgroud.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Ilustration.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Sibaja Chef.png"))); // NOI18N
        Ilustration.setText("jLabel1");
        Backgroud.add(Ilustration, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, 290, 430));

        Login.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        Login.setForeground(new java.awt.Color(51, 51, 51));
        Login.setText("Iniciar Sesión");
        Backgroud.add(Login, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 310, 40));

        User.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        User.setForeground(new java.awt.Color(51, 51, 51));
        User.setText("Usuario");
        Backgroud.add(User, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        nameLogo.setFont(new java.awt.Font("Goudy Old Style", 1, 48)); // NOI18N
        nameLogo.setForeground(new java.awt.Color(255, 153, 0));
        nameLogo.setText("SIBAJA'S RESTAURANT");
        Backgroud.add(nameLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 530, -1));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        Backgroud.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 20, -1, 170));

        txtUser.setBackground(new java.awt.Color(255, 255, 255));
        txtUser.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtUser.setForeground(new java.awt.Color(204, 204, 204));
        txtUser.setText("Ingrese el correo de usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserMousePressed(evt);
            }
        });
        Backgroud.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, 20));
        Backgroud.add(userSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 390, 20));

        icoPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ico password.png"))); // NOI18N
        Backgroud.add(icoPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 320, -1, -1));

        Password.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        Password.setForeground(new java.awt.Color(51, 51, 51));
        Password.setText("Contraseña");
        Backgroud.add(Password, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        icoUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Ico user.png"))); // NOI18N
        Backgroud.add(icoUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, -1, -1));
        Backgroud.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 350, 390, 20));

        txtPass.setBackground(new java.awt.Color(255, 255, 255));
        txtPass.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(204, 204, 204));
        txtPass.setText("********");
        txtPass.setBorder(null);
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        Backgroud.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 260, -1));

        btnExit.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnExit.setForeground(new java.awt.Color(102, 102, 102));
        btnExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExit.setText("X");
        btnExit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnExitMouseExited(evt);
            }
        });
        Backgroud.add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 0, 34, 36));

        blueBackgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/blue Backgroud.jpg"))); // NOI18N
        blueBackgroud.setText("jLabel2");
        Backgroud.add(blueBackgroud, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 0, 250, -1));

        toolbar.setBackground(new java.awt.Color(255, 255, 255));
        toolbar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                toolbarMouseDragged(evt);
            }
        });
        toolbar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                toolbarMousePressed(evt);
            }
        });

        javax.swing.GroupLayout toolbarLayout = new javax.swing.GroupLayout(toolbar);
        toolbar.setLayout(toolbarLayout);
        toolbarLayout.setHorizontalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        toolbarLayout.setVerticalGroup(
            toolbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        Backgroud.add(toolbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 70));

        btnLogin.setBackground(new java.awt.Color(0, 102, 204));
        btnLogin.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        Backgroud.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jcRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Chef", "Mesero", "Bartender" }));
        Backgroud.add(jcRole, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 150, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Backgroud, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * This event gets the position of the mouse in X and Y when it is clicked on the taskbar
 * @param evt generates a toolbar so that the event has a position
 */
    private void toolbarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_toolbarMousePressed
    /**
     * This event makes it possible to change position when dragging the window
     * on the taskbar.
     *
     * @param evt makes it possible to change position when dragging the window
     * on the taskbar
     */
    private void toolbarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_toolbarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_toolbarMouseDragged
    /**
     * Close botton This button causes the FRMLogin to close completely when
     * pressed.
     *
     * @param evt  buttom exit
     */
    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnExitMouseClicked

    /**
     * This button makes when passing over it change color to red
     *
     * @param evt  exit button color
     */
    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        btnExit.setForeground(Color.red);
    }//GEN-LAST:event_btnExitMouseEntered
    /**
     * This button makes it change color to gray when you stop passing over
     *
     * @param evt exit button color
     */
    private void btnExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseExited
        btnExit.setForeground(Color.gray);
    }//GEN-LAST:event_btnExitMouseExited

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
    private void txtUserMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMousePressed
        // Check if the text in the text field is equal to "Enter user email"
        if (txtUser.getText().equals("Ingrese el correo de usuario")) {
            // If equal, clear the text and set the text color to black
            txtUser.setText("");
            txtUser.setForeground(Color.black);
        }
        // Check if the password field is empty
        if (String.valueOf(txtPass.getPassword()).isEmpty()) {
            // If empty, set the text to "********" and the text color to gray
            txtPass.setText("********");
            txtPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtUserMousePressed

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
     */
    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        if (txtUser.getText().isEmpty()) {
            txtUser.setText("Ingrese el correo de usuario");
            txtUser.setForeground(Color.gray);
        }
        if (String.valueOf(txtPass.getPassword()).equals("********")) {
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
    }//GEN-LAST:event_txtPassMousePressed

    /**
     * Method called when the login button is clicked. Retrieves the username,
     * password, and role entered by the user. Calls the logic to evaluate the
     * user with the supplied data. Closes the current window after executing
     * the action.
     *
     * @param evt The action event generated by the login button.
     */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // Get the username from the txtUser text field
        String username = txtUser.getText();
        // Get the password from the txtPass text field and convert it to a string
        String password = new String(txtPass.getPassword());
        // Get the selected role from the JComboBox jcRole
        String role = (String) jcRole.getSelectedItem();
        try {
            // Call the logic to evaluate the user with the provided data
            if (logic.login(username, password, role)) {
                logic.evaluateUser(username, password, role);
                dispose();
            }

        } catch (IOException ex) {
            Logger.getLogger(FRMLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        // Close the current window (dispose() is a method of the JFrame class)

    }//GEN-LAST:event_btnLoginActionPerformed

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
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {

                new FRMLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Backgroud;
    private javax.swing.JLabel Ilustration;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel Password;
    private javax.swing.JLabel User;
    private javax.swing.JLabel blueBackgroud;
    private javax.swing.JLabel btnExit;
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel icoPassword;
    private javax.swing.JLabel icoUser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JComboBox<String> jcRole;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel nameLogo;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JPanel toolbar;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUser;
    private javax.swing.JSeparator userSeparator;
    // End of variables declaration//GEN-END:variables
}
