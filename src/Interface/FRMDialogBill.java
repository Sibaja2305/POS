package Interface;

import classes.PaymentMethods;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import pos.Logic;

/**
 *
 * @author user
 */
public class FRMDialogBill extends javax.swing.JDialog {

    /**
     * Creates new form FRMDialogBill
     */
    Logic logic;
    static String table = "";
    static JLabel labelStatus;

    public FRMDialogBill(java.awt.Frame parent, boolean modal, String table, JLabel status) {
        super(parent, modal);
        logic = new Logic();
        initComponents();
        this.table = table;
        this.labelStatus = status;

        logic.tableOrder.clear();

        logic.readTable(table.replaceAll("Mesa: ", ""));

        logic.viewTableOrder(jtOrder);
        logic.totalPay(jtOrder, lblTotalBillAmount);

        lblTotalBill.setVisible(true);
        lblTotalBillAmount.setVisible(true);
        lblCash.setVisible(false);
        txtCash.setVisible(false);
        lblChange.setVisible(false);
        lblChangeAmount.setVisible(false);

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
        lblBillNumber = new javax.swing.JLabel();
        txtBillNumber = new javax.swing.JTextField();
        lblCostumerName = new javax.swing.JLabel();
        txtCostumerName = new javax.swing.JTextField();
        lblCostumerId = new javax.swing.JLabel();
        txtCostumerId = new javax.swing.JTextField();
        lblCostumerGmail = new javax.swing.JLabel();
        txtCostumerGmail = new javax.swing.JTextField();
        lblPaymentMethod = new javax.swing.JLabel();
        jcPaymentMethod = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtOrder = new javax.swing.JTable();
        btnfinishBill = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblTotalBill = new javax.swing.JLabel();
        lblCash = new javax.swing.JLabel();
        txtCash = new javax.swing.JTextField();
        lblChange = new javax.swing.JLabel();
        lblTotalBillAmount = new javax.swing.JLabel();
        lblChangeAmount = new javax.swing.JLabel();
        btnchange = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblBillNumber.setText("Número de factura");

        txtBillNumber.setToolTipText("");
        txtBillNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBillNumberActionPerformed(evt);
            }
        });

        lblCostumerName.setText("Nombre:");

        txtCostumerName.setToolTipText("Nombre del Cliente");
        txtCostumerName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostumerNameActionPerformed(evt);
            }
        });

        lblCostumerId.setText("ID Cliente:");

        txtCostumerId.setToolTipText("ID del Cliente");
        txtCostumerId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostumerIdActionPerformed(evt);
            }
        });

        lblCostumerGmail.setText("Gmail:");

        txtCostumerGmail.setToolTipText("Gmail del Cliente");
        txtCostumerGmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostumerGmailActionPerformed(evt);
            }
        });

        lblPaymentMethod.setText("Metodo de pago:");

        jcPaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Efectivo", "Tarjeta", "SinpeMovil" }));
        jcPaymentMethod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcPaymentMethodActionPerformed(evt);
            }
        });

        jtOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Comentario"
            }
        ));
        jScrollPane1.setViewportView(jtOrder);

        btnfinishBill.setBackground(new java.awt.Color(0, 153, 153));
        btnfinishBill.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnfinishBill.setText("Finalizar Factura");
        btnfinishBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfinishBillActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("FACTURACIÓN");

        lblTotalBill.setText("TOTAL");

        lblCash.setText("EFECTIVO");

        txtCash.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                txtCashComponentAdded(evt);
            }
        });

        lblChange.setText("CAMBIO");

        btnchange.setText("Listo");
        btnchange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnchangeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(310, 310, 310)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(119, 119, 119)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblCash, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblTotalBill, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtCash, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                    .addComponent(lblChangeAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(lblTotalBillAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnchange)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblBillNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtBillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblCostumerName)
                        .addGap(65, 65, 65)
                        .addComponent(txtCostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCostumerId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCostumerId, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblCostumerGmail)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCostumerGmail, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblPaymentMethod)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(307, 307, 307)
                        .addComponent(btnfinishBill, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtBillNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBillNumber))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCostumerName)
                            .addComponent(txtCostumerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCostumerId)
                            .addComponent(txtCostumerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCostumerGmail)
                            .addComponent(txtCostumerGmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPaymentMethod)
                            .addComponent(jcPaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblTotalBillAmount))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCash, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCash, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblChange, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblChangeAmount))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnchange)
                        .addGap(41, 41, 41)
                        .addComponent(btnfinishBill, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void txtBillNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBillNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBillNumberActionPerformed

    private void txtCostumerNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostumerNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostumerNameActionPerformed

    private void txtCostumerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostumerIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostumerIdActionPerformed

    private void txtCostumerGmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostumerGmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostumerGmailActionPerformed

    /**
     * If the seletion of the "jcPaymentMethod" matches with the payment method
     * "Cash", it turns visible another section where you can enter the amount
     * to cancel the bill.
     *
     * @param evt
     */
    private void jcPaymentMethodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcPaymentMethodActionPerformed

        PaymentMethods paymentMethod = PaymentMethods.Cash;
        String method = paymentMethod.toString();

        if (method == jcPaymentMethod.getSelectedItem()) {
            lblTotalBill.setVisible(true);
            lblTotalBillAmount.setVisible(true);
            lblCash.setVisible(true);
            txtCash.setVisible(true);
            lblChange.setVisible(true);
            lblChangeAmount.setVisible(true);
        } else {
            lblTotalBill.setVisible(true);
            lblTotalBillAmount.setVisible(true);
            lblCash.setVisible(false);
            txtCash.setVisible(false);
            lblChange.setVisible(false);
            lblChangeAmount.setVisible(false);
        }
    }//GEN-LAST:event_jcPaymentMethodActionPerformed

    private void btnfinishBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfinishBillActionPerformed
        String billingNumber = txtBillNumber.getText();
        String date = logic.actualDate();
        String name = txtCostumerName.getText();
        String idCustomer = txtCostumerId.getText();
        String email = txtCostumerGmail.getText();
        double totalPrice = Double.parseDouble(lblTotalBillAmount.getText());
        double cash = Double.parseDouble(txtCash.getText());
        double change = Double.parseDouble(lblChangeAmount.getText());
        logic.billingSave(billingNumber, date, name, idCustomer, email, totalPrice, change, cash);
        FRMDialogViewBill viewBill = new FRMDialogViewBill(null, true, billingNumber, date, name, idCustomer, email, totalPrice, change, cash, table);
        viewBill.setVisible(true);

    }//GEN-LAST:event_btnfinishBillActionPerformed

    private void txtCashComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_txtCashComponentAdded
//        double total=Double.parseDouble(lblTotalBillAmount.getText());
//        double cash=Double.parseDouble(txtCash.getText());
//        double change=0;
//        change=logic.totalChange(total, cash);
//        lblChangeAmount.setText(String.valueOf(change));
    }//GEN-LAST:event_txtCashComponentAdded

    private void btnchangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnchangeActionPerformed
        double total = Double.parseDouble(lblTotalBillAmount.getText());
        double cash = Double.parseDouble(txtCash.getText());
        double change = 0;
        change = logic.totalChange(total, cash);
        lblChangeAmount.setText(String.valueOf(change));
    }//GEN-LAST:event_btnchangeActionPerformed

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
            java.util.logging.Logger.getLogger(FRMDialogBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMDialogBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMDialogBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMDialogBill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FRMDialogBill dialog = new FRMDialogBill(new javax.swing.JFrame(), true, "", null);
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
    private javax.swing.JButton btnchange;
    private javax.swing.JButton btnfinishBill;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcPaymentMethod;
    private javax.swing.JTable jtOrder;
    private javax.swing.JLabel lblBillNumber;
    private javax.swing.JLabel lblCash;
    private javax.swing.JLabel lblChange;
    private javax.swing.JLabel lblChangeAmount;
    private javax.swing.JLabel lblCostumerGmail;
    private javax.swing.JLabel lblCostumerId;
    private javax.swing.JLabel lblCostumerName;
    private javax.swing.JLabel lblPaymentMethod;
    private javax.swing.JLabel lblTotalBill;
    private javax.swing.JLabel lblTotalBillAmount;
    private javax.swing.JTextField txtBillNumber;
    private javax.swing.JTextField txtCash;
    private javax.swing.JTextField txtCostumerGmail;
    private javax.swing.JTextField txtCostumerId;
    private javax.swing.JTextField txtCostumerName;
    // End of variables declaration//GEN-END:variables
}
