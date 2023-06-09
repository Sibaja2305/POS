package Interface;

import classes.Product;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.swing.JRViewer;

/**
 * The logic is instantiated which will be private
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class JIFReport extends javax.swing.JInternalFrame {

    /**
     * Create a new JIFReport form and initialize the components
     */
    public JIFReport() {
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

        jpReport = new javax.swing.JPanel();
        btnAddReport = new javax.swing.JButton();

        setClosable(true);
        setTitle("Módulo de reporte");

        jpReport.setBackground(new java.awt.Color(189, 209, 222));

        btnAddReport.setText("Generar reporte");
        btnAddReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpReportLayout = new javax.swing.GroupLayout(jpReport);
        jpReport.setLayout(jpReportLayout);
        jpReportLayout.setHorizontalGroup(
            jpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReportLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(btnAddReport, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(282, Short.MAX_VALUE))
        );
        jpReportLayout.setVerticalGroup(
            jpReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpReportLayout.createSequentialGroup()
                .addGap(158, 158, 158)
                .addComponent(btnAddReport, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(215, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Method executed when the btnAddReport" button is clicked. Generates and
     * displays a report using data from a text file.
     *
     * @param evt The action event generated by the button.
     */
    private void btnAddReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddReportActionPerformed
        try {
            // Path of the .jrxml file of the report
            String reportPath = "C:\\Users\\Hp EliteBook\\JaspersoftWorkspace\\MyReports\\reportePos.jrxml";

            // Crear una lista enlazada para almacenar los objetos de tipo Product
            LinkedList<Product> listReport = new LinkedList<>();

            // Ruta del archivo de texto que contiene los datos del informe
            String filePath = "reporte.txt";
            try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
                String line;
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(",");
                    String productName = data[0];
                    int quantity = Integer.parseInt(data[1]);

                    // Crear un objeto Product con los datos obtenidos
                    Product product = new Product(productName, quantity);
                    listReport.add(product);
                }
            }
            // Compilar el informe
            JasperReport report = (JasperReport) net.sf.jasperreports.engine.JasperCompileManager.compileReport(reportPath);
            // Crear una fuente de datos utilizando la lista de productos
            JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(listReport);
            // Llenar el informe con los datos
            JasperPrint print = JasperFillManager.fillReport(report, null, dataSource);

            JRViewer viewer = new JRViewer(print);

            jpReport.add(viewer, BorderLayout.CENTER);

            // Agregar jpReport al contenedor principal
            getContentPane().add(jpReport);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "En mantenimiento :(");
        }

    }//GEN-LAST:event_btnAddReportActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddReport;
    private javax.swing.JPanel jpReport;
    // End of variables declaration//GEN-END:variables
}
