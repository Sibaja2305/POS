package pos;

import Interface.FRMAdmin;
import Interface.FRMBartender;
import Interface.FRMChef;
import Interface.FRMLogin;
import Interface.FRMWaiter;
import clases.Product;
import clases.Storage;
import clases.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author yorda
 */
public class Logic {

    public LinkedList<User> users;
    public LinkedList<Product> storage;
    public LinkedList<Product> menu;
    static DefaultTableModel model;  
    public Logic() {
        menu=new LinkedList<>();
        users = new LinkedList<>();
        storage=new LinkedList<>();
        model=new DefaultTableModel();
    }

    /**
     * añade usuarios a la lista users
     *
     * @param username
     * @param password
     * @param role
     */
    public void addUser(String username, String password, String role) {
        User newUser = new User(username, password, role);
        users.add(newUser);
        System.out.println("se añadio " + username + " " + password + " " + role);
    }

    /**
     * compara el usuario, contraseña y rol digitados en la interfaz grafica con
     * cada uno de los integrantes de la lista de usuarios para verificar si
     * coinciden y si es asi permite ingresar a la siguiente ventana
     *
     * @param username
     * @param password
     * @param role
     * @return
     */
    public boolean login(String username, String password, String role) {
        for (User user : users) {

            if (user.getIdUser().equals(username) && user.getPasswordUser().equals(password) && user.getUserType().equals(role)) {
                return true;
            }

        }
        return false;

    }

    /**
     * Regresa al login
     */
    public void lockOut() {
        FRMLogin ventana = new FRMLogin();
        ventana.setVisible(true);

    }

    /**
     * Verifica si el nuevo usuario ya existe en la lista
     *
     * @param username
     * @return
     */
    public boolean userExists(String username) {
        for (User user : users) {
            if (user.getIdUser().equals(username)) {
                return true;
            }
        }
        return false;
    }

    /**
     * Escribe los usuarios de la lista en un archivo txt para su almacenamiento
     * persistente
     */
    public void saveUsersToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Usuario.txt"));
            for (User user : users) {
                writer.write(user.getIdUser() + "," + user.getPasswordUser() + "," + user.getUserType());
                writer.newLine();
            }
            writer.close();
            System.out.println("Usuarios guardados exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los usuarios en el archivo." + e);
        }
    }

    /**
     * Carga los usuarios en el txt y los guarda en la lista de usuarios
     */
    public void readUser() {

        try {
            // lee los usuarios del archivo de texto
            BufferedReader reader = new BufferedReader(new FileReader("Usuario.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                String username = data[0];
                String password = data[1];
                String role = data[2];
                addUser(username, password, role);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo de usuarios" + e);
        }
    }

    /**
     * Utiliza el metodo addUser para añadir un nuevo usuario si este no existe
     * en la lista users
     *
     * @param username
     * @param password
     * @param role
     */
    public void addNewUser(String username, String password, String role) {
        if (!userExists(username)) {
            addUser(username, password, role);
            saveUsersToFile(); // guardar usuarios en el archivo
            JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
        }
    }

    /**
     * Se carga el menu, se lloro pero se logro :)
     *
     * @param tbMenu
     */
    public void readMenu(JTable tbMenu) {
        
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Categoria");

        // Asignar el DefaultTableModel a la JTable
        tbMenu.setModel(model);

        try (BufferedReader br = new BufferedReader(new FileReader("Menu.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");

                model.addRow(row);

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     * Evalua los usuarios
     *
     * @param username
     * @param password
     * @param role
     */
    public void evaluateUser(String username, String password, String role) {
        if (login(username, password, role)) {
            JOptionPane.showMessageDialog(null, "¡Bienvenido " + username + "!");
            if (role.equals("Administrador")) {
                // Abrir la interfaz de administrador
                FRMAdmin adminFrame = new FRMAdmin();
                adminFrame.setVisible(true);

            } else if (role.equals("Bartender")) {
                // Abrir la interfaz de bartender
                FRMBartender bartenderFrame = new FRMBartender();
                bartenderFrame.setVisible(true);

            } else if (role.equals("Chef")) {
                // Abrir la interfaz de chef
                FRMChef chefFrame = new FRMChef();
                chefFrame.setVisible(true);

            } else if (role.equals("Mesero")) {
                // Abrir la interfaz de mesero
                FRMWaiter meseroFrame = new FRMWaiter();
                meseroFrame.setVisible(true);

            } else {

                JOptionPane.showMessageDialog(null, "Nombre de usuario, contraseña o rol incorrectos");
            }

        }
    }

 
     public void totalPay(JTable jtOrder, JLabel jlTotal, int quantity) {
        double fullPay = 0.00;
        int numFila = jtOrder.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(jtOrder.getModel().getValueAt(i, 2)));
            quantity = Integer.parseInt(jtOrder.getValueAt(i, 1).toString());
            
            fullPay += cal*quantity;
        }
        jlTotal.setText(String.format("%.2f", fullPay));
    }
     
    public void readStorage(JTable tbStorage){
    
        
        model.addColumn("Nombre");
        model.addColumn("Raciones");
        model.addColumn("Categoría");

        // Asignar el DefaultTableModel a la JTable
        tbStorage.setModel(model);

        try (BufferedReader br = new BufferedReader(new FileReader("Inventario.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                model.addRow(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

}
    
    public void searchResult(JTable jtSearchResult, JTextField txtSearch, JTable jtStorage){
        String search = txtSearch.getText();
        DefaultTableModel originalModel = (DefaultTableModel) jtStorage.getModel();
        DefaultTableModel targetModel = (DefaultTableModel) jtSearchResult.getModel();
        Object[] row = new Object[originalModel.getColumnCount()];
        
        for (int j = 0; j < originalModel.getRowCount(); j++) {
            if (search.equals(originalModel.getValueAt(j, 0).toString())){
                for(int i = 0; i < originalModel.getColumnCount(); i++){
                    row[i] = originalModel.getValueAt(j, i);
                }
            }
        }
        targetModel.addRow(row);
    }
    public void saveOrder(String productName,int quantity,double price, String comment){
        Product product = new Product(productName, quantity, price,comment);
        storage.add(product);
        saveOrderTxt();
        System.out.println("se añadio " + productName + " " + quantity + " " + price+" "+comment);
    }
    public void saveOrderTxt (){
        int mesa=1;
        try {
          
            BufferedWriter writer = new BufferedWriter(new FileWriter("mesa"+mesa+".txt"));
            for (Product product : storage) {
                writer.write(product.getProductName() + "," + product.getQuantity() + "," + product.getPrice() +"," +product.getComment());
                writer.newLine();
            }
            writer.close();
            JOptionPane.showMessageDialog(null, "pedido ingresado exitosamente");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "pedido no ingresado a la base de datos"+e);
        }  
    }
    public void registerPlate(String productName, double price, String category){
         Product product=new Product(productName,price,category);
                menu.add(product);
        
        
        
    }
    public void readMenuTxt(){
        try (BufferedReader br = new BufferedReader(new FileReader("Menu.txt"))) {
            String line;

             while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                String productName = data[1];
                double price =Double.parseDouble(data[2]);
                String category = data[3];
              registerPlate(productName,price,category);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
   public void addNewPlate(String productName,double price, String category){
       if (!addNewPlateExist(productName)) {
            registerPlate(productName,price,category);
            savePlateToFile(); // guardar plato en el archivo
            JOptionPane.showMessageDialog(null, "plato agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre del plato ya existe");
        }
   }
   public boolean addNewPlateExist(String productName) {
        for (Product product : menu) {
            if (product.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }
    public void savePlateToFile() {
        int i=1;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("menu.txt"));
            for (Product product : menu) {
                writer.write(i + "," + product.getProductName() + "," + product.getPrice() + "," + product.getCategory());
                writer.newLine();
                i++;
            }
            
            writer.close();
            System.out.println("plato guardados exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los platos en el archivo." + e);
        }
    }
     
   
    
}