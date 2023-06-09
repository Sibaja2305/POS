package Interface;

import java.io.IOException;
import pos.Logic;

/**
 * Class that represents the table window in the application.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class JIFTable extends javax.swing.JInternalFrame {

    static boolean orderStatus;
    static int index;
    Logic logic;

    /**
     *
     * Create a JIFTable Initializes the logic, the gui components in addition
     * to modifying the state of the table if you have an order and the color
     * according to this state.
     *
     * @throws IOException If a read error occurs.
     */
    public JIFTable() throws IOException {

        logic = new Logic();
        initComponents();
        logic.readStatus();

        index = logic.readIndexStatus();

        lblStatus.setText(lblStatus.getText() + " " + logic.listStatus.get(index));
        index = index + 1;
        if (index > 9) {
            index = 0;
        }

        logic.writeIndexStatus(index);

        btnCreateOrder.setContentAreaFilled(false);
        if (lblStatus.getText().equals("Estado: Ocupado")) {
            jpBackgroundTable.setBackground(new java.awt.Color(255, 102, 102));
        } else {
            jpBackgroundTable.setBackground(new java.awt.Color(153, 255, 153));
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpBackgroundTable = new javax.swing.JPanel();
        lblStatus = new javax.swing.JLabel();
        btnCreateOrder = new javax.swing.JButton();

        setTitle("Módulo de mesas");

        jpBackgroundTable.setBackground(new java.awt.Color(255, 102, 102));

        lblStatus.setText("Estado:");

        btnCreateOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/table.png"))); // NOI18N
        btnCreateOrder.setToolTipText("Crear orden");
        btnCreateOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpBackgroundTableLayout = new javax.swing.GroupLayout(jpBackgroundTable);
        jpBackgroundTable.setLayout(jpBackgroundTableLayout);
        jpBackgroundTableLayout.setHorizontalGroup(
            jpBackgroundTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpBackgroundTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCreateOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpBackgroundTableLayout.createSequentialGroup()
                        .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jpBackgroundTableLayout.setVerticalGroup(
            jpBackgroundTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpBackgroundTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreateOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpBackgroundTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This button to create order can have 2 options, check the txt of the
     * table If it is empty, it directs it to an interface to create the order
     * and if it is already full it takes them to the interface to see order, it
     * cleans the list each time it enters this button and does the if to find
     * out if there is something in the txt.
     *
     * @param evt The action event generated by the create an order button.
     */
    private void btnCreateOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateOrderActionPerformed
        logic.tableOrder.clear();

        logic.readTable(this.getTitle().replaceAll("Mesa: ", ""));

        if (logic.tableOrder.isEmpty()) {
            FRMDialogOrder dialogOrder = new FRMDialogOrder(null, true, this.getTitle(), this.lblStatus, orderStatus, jpBackgroundTable);
            dialogOrder.setLocationRelativeTo(null);
            // Set the dialog as modal and make it visible
            dialogOrder.setVisible(true);

        } else {
            // Create an instance of the FRMDialogOrder class, which is a dialog for creating an order
            FRMDialogViewOrder viewOrder = new FRMDialogViewOrder(null, true, this.getTitle(), this.lblStatus, jpBackgroundTable);
            viewOrder.setLocationRelativeTo(null);
            viewOrder.setVisible(true);

        }


    }//GEN-LAST:event_btnCreateOrderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateOrder;
    private javax.swing.JPanel jpBackgroundTable;
    private javax.swing.JLabel lblStatus;
    // End of variables declaration//GEN-END:variables
}
