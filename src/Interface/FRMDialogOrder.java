package Interface;

import java.awt.Color;
import java.util.HashMap;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import pos.Logic;

/**
 * Dialogue to place an order. And Create new instances of the FRMDialogOrder
 * class
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class FRMDialogOrder extends javax.swing.JDialog {

    private Logic logic;
    static HashMap<Integer, Integer> addedRow;
    static int quantity = 0;
    static DefaultTableModel tmp;
    String table = "";
    static JLabel labelStatus;
    static boolean orderStatus;
    static JPanel jpBackgroundTable;

    /**
     * Constructor of the FRMDialogOrder class. Calls the constructor of the
     * parent class (JDialog) passing the main frame and the mode flag. Call the
     * initComponents() method to initialize the window components. Creates new
     * form FRMDialogPedido
     *
     * @param parent The main frame (parent window) that displays this dialog.
     * @param modal Specifies whether the dialog is modal or not.
     */
    public FRMDialogOrder(java.awt.Frame parent, boolean modal, String table, JLabel status, boolean orderStatus,JPanel jpBackgroundTable) {
        super(parent, modal);
        logic = new Logic(); // Initialize the Logic instance

        initComponents();
        logic.readMenu(jtMenu); // Read menu from logic and display it in jtMenu table
        addedRow = new HashMap<>(); // Initialize the addedRow map to track the rows added to the order
        tmp = (DefaultTableModel) jtOrder.getModel(); // Get the model from the jtOrder table and assign it to tmp
        this.table = table;
        this.orderStatus = orderStatus;
        this.labelStatus = status;
        this.jpBackgroundTable = jpBackgroundTable;
        System.out.println("Mesa en dialogo: " + table);
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
        jPanel2 = new javax.swing.JPanel();
        txtComment = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAddComment = new javax.swing.JButton();
        btnDeleteComment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtOrder = new javax.swing.JTable();
        jltotalBill = new javax.swing.JLabel();
        btnconfirmOrder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jtMenu = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        btnAddOrder = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jSplitPane1.setDividerLocation(530);

        jPanel2.setBackground(new java.awt.Color(65, 128, 171));

        txtComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCommentActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Comentario:");

        btnAddComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        btnAddComment.setText("Agregar");
        btnAddComment.setToolTipText("Agregar Comentario");
        btnAddComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCommentActionPerformed(evt);
            }
        });

        btnDeleteComment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/garbage.png"))); // NOI18N
        btnDeleteComment.setToolTipText("Eliminar Pedido");
        btnDeleteComment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCommentActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Pedidos:");

        jtOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Cantidad", "Precio", "Categoría", "Comentario"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jtOrder);

        btnconfirmOrder.setText("Confirmar pedido");
        btnconfirmOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmOrderActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo pequeño.png"))); // NOI18N
        jLabel4.setText("jLabel4");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Pedido");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtComment, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnAddComment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDeleteComment, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnconfirmOrder))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jltotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jLabel5)))
                .addGap(8, 8, 8)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jltotalBill, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeleteComment)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtComment, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddComment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(105, 105, 105)
                                .addComponent(btnconfirmOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)))))
                .addGap(38, 38, 38))
        );

        jSplitPane1.setLeftComponent(jPanel2);

        jPanel5.setBackground(new java.awt.Color(189, 209, 222));

        jtMenu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Precio", "Categoría"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtMenu.getTableHeader().setReorderingAllowed(false);
        jScrollPane3.setViewportView(jtMenu);
        if (jtMenu.getColumnModel().getColumnCount() > 0) {
            jtMenu.getColumnModel().getColumn(0).setResizable(false);
            jtMenu.getColumnModel().getColumn(1).setResizable(false);
            jtMenu.getColumnModel().getColumn(2).setResizable(false);
            jtMenu.getColumnModel().getColumn(3).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Menu:");

        btnAddOrder.setBackground(new java.awt.Color(0, 153, 153));
        btnAddOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnAddOrder.setText("Agregar");
        btnAddOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(btnAddOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(88, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel5);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Handles the click event on the "Add Order" button. Get the index of the
     * selected row in the jtMenu using the getSelectedRow() method. Check if a
     * row has been selected in the jtMenu using the condition selectedRow !=
     * -1. Get the originalModel and targetModel table models from jtMenu and
     * jtOrder, respectively. A row array is created to store the values of the
     * selected row in the jtMenu. The values of the selected row in the jtMenu
     * are copied to the row array in the corresponding order. Check if the row
     * has already been added previously in jtOrder using the containsKey()
     * method of addedRow. If the row has already been added previously, get the
     * index of the row in jtOrder and update the quantity by adding 1 to it. If
     * the row has not been previously added, add the row to the jtOrder model
     * and set the initial quantity to 1. The value "-" is also assigned to the
     * "Comment" column of the added row. And finally the total payment is
     * updated
     *
     * @param evt The action event generated by the button.
     */
    private void btnAddOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddOrderActionPerformed
        // Get the selected row in the jtMenu table
        int selectedRow = jtMenu.getSelectedRow();
        if (selectedRow != -1) { // Se ha seleccionado una row
            DefaultTableModel originalModel = (DefaultTableModel) jtMenu.getModel();
            DefaultTableModel targetModel = (DefaultTableModel) jtOrder.getModel();
            jtOrder.setDefaultEditor(Object.class, null);

            Object[] row = new Object[originalModel.getColumnCount()];

            // Copy the values of the selected row to the array row
            for (int i = 0; i < originalModel.getColumnCount(); i++) {
                if (i == 0) {
                    row[i] = originalModel.getValueAt(selectedRow, i + 1);

                } else {
                    row[i] = originalModel.getValueAt(selectedRow, i);
                }

            }

            // Check if the row has already been added previously
            if (addedRow.containsKey(selectedRow)) {

                int rowIndex = addedRow.get(selectedRow);
                quantity = Integer.parseInt(jtOrder.getValueAt(rowIndex, 1).toString());

                quantity++; // Increase the quantity

                targetModel.setValueAt(quantity, rowIndex, 1); // Update the quantity in the target JTable
                logic.totalPay(jtOrder, jltotalBill); // Calculate the total to pay
            } else {
                addedRow.put(selectedRow, targetModel.getRowCount());
                row[1] = 1; // Set the initial amount to 1

                targetModel.addRow(row); // Add the row to the destination JTable

                quantity = 1;
                targetModel.setValueAt("-", addedRow.get(selectedRow), 4); // Set the "Remarks" field to "-"
                logic.totalPay(jtOrder, jltotalBill); // Calculate the total to pay
            }
        } else {
            JOptionPane.showMessageDialog(null, "Ninguna fila del menu fue agregada");
        }
        jtMenu.clearSelection(); // Clear the selection in the jtMenu table
    }//GEN-LAST:event_btnAddOrderActionPerformed

    private void txtCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCommentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCommentActionPerformed

    /**
     * Handles the click event on the "Add Comment" button. The comment field
     * (txtComment) is checked for empty using the getText() method and compared
     * to an empty string. If the comment field is empty, a dialog message is
     * displayed prompting the user to type a comment. If the comment field
     * contains text, the value of the field is obtained and assigned to the
     * "Comment" column of the selected row in jtOrder using the setValueAt()
     * method of the tmp table model. Then, the comment field is cleared by
     * calling the setText("") method. Finally, the selection in the jtOrder
     * table is cleared by calling the clearSelection() method.
     *
     * @param evt The action event generated by the button.
     */
    private void btnAddCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddCommentActionPerformed
        // Check if the comment field is empty
        if (txtComment.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "ESCRIBA UN COMENTARIO");
        } else {
            // Get the value of the comment field and assign it to the "Comment" column of the selected row in jtOrder
            tmp.setValueAt(txtComment.getText(), jtOrder.getSelectedRow(), 4);
            // Clear the comment field
            txtComment.setText("");
            // Clear the selection in the jtOrder table
            jtOrder.clearSelection();
        }

    }//GEN-LAST:event_btnAddCommentActionPerformed

    /**
     * Handles the click event on the "Confirm Order" button. Iterates through
     * the rows in the tmp table model, which corresponds to the JTable jtOrder.
     * The values of each column of the current row are obtained and stored in
     * corresponding variables: productName, count, price, and comment. Check if
     * the comment is empty using the isEmpty() method of the comment string. If
     * the comment is empty, the value "-" is assigned to the variable comment.
     * The logic object is used to save the order by calling the saveOrder()
     * method and passing the obtained values as parameters: productName, count,
     * price, and comment.
     *
     * @param evt The action event generated by the button.
     */
    private void btnconfirmOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmOrderActionPerformed
        if (tmp.getRowCount() > 0) {
            for (int i = 0; i < tmp.getRowCount(); i++) {
                String productName = tmp.getValueAt(i, 0).toString();
                int count = Integer.parseInt(tmp.getValueAt(i, 1).toString());
                double price = Double.parseDouble(tmp.getValueAt(i, 2).toString());
                String comment = tmp.getValueAt(i, 4).toString();
                String category = tmp.getValueAt(i, 3).toString();

                // Check if the comment is empty and assign "-" instead
                if (comment.isEmpty()) {

                    comment = "-";
                }
                String plateState = "En espera";
                // Save the order using the logic object and the returned values
                logic.saveOrder(productName, count, price, comment, table.replaceAll("Mesa: ", ""), plateState, category);

            }
            JOptionPane.showMessageDialog(null, "pedido ingresado exitosamente");

            logic.readStatus();
            logic.setStatusOcupado(Integer.parseInt(table.replaceAll("Mesa: ", "")) - 1);
            labelStatus.setText("Estado: " + logic.listStatus.get(Integer.parseInt(table.replaceAll("Mesa: ", "")) - 1));
            jpBackgroundTable.setBackground(Color.red);
            logic.saveStatusTxt();
            
            dispose();
        } else {
            JOptionPane.showMessageDialog(null, "Sin pedidos agregados");
        }
  
    }//GEN-LAST:event_btnconfirmOrderActionPerformed

    private void btnDeleteCommentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteCommentActionPerformed
    //  logic.deleteTableRow(jtOrder);
 
    }//GEN-LAST:event_btnDeleteCommentActionPerformed

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
            java.util.logging.Logger.getLogger(FRMDialogOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRMDialogOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRMDialogOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRMDialogOrder.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                FRMDialogOrder dialog = new FRMDialogOrder(new javax.swing.JFrame(), true, "", null, false, null);
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
    private javax.swing.JButton btnAddComment;
    private javax.swing.JButton btnAddOrder;
    private javax.swing.JButton btnDeleteComment;
    private javax.swing.JButton btnconfirmOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel jltotalBill;
    private javax.swing.JTable jtMenu;
    private javax.swing.JTable jtOrder;
    private javax.swing.JTextField txtComment;
    // End of variables declaration//GEN-END:variables
}
