package pos;

import Interface.FRMAdmin;
import Interface.FRMBartender;
import Interface.FRMChef;
import Interface.FRMLogin;
import Interface.FRMWaiter;
import Interface.JIFTable;
import classes.Product;
import classes.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * In the Logic class users, storage, inventory were instantiated in a
 * LinkedList and Creates an instance of DefaultTableModel for the table model.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Logic {

    public LinkedList<String> listStatus = new LinkedList<>();
    public LinkedList<User> users;
    public LinkedList<Product> storage;
    public LinkedList<Product> inventory;
    public LinkedList<Product> tableOrder;
    static DefaultTableModel model;
    static User user;

    /**
     * Logic class. Initializes the data structures and models necessary for the
     * program logic. Create LinkedList instances to store the menu, users, and
     * storage. Creates an instance of DefaultTableModel for the table model.
     */
    public Logic() {
        // Storage st = new Storage();
        //st.getStorage();
        storage = new LinkedList<>();
        inventory = new LinkedList<>();
        users = new LinkedList<>();
        tableOrder = new LinkedList<>();
        user = User.getInstance();
        model = new DefaultTableModel();

    }

    /**
     * This method called addUser takes three parameters: username, password,
     * and role. The method creates a new User object with the supplied values
     * for username, password, and role. It then adds the new user to a list
     * called users, which stores User objects. Finally, a message is printed to
     * the console indicating that the new user has been added, displaying the
     * provided username, password, and role.
     *
     * @param username the username provided by the user.
     * @param password the password provided by the user.
     * @param role the role of the user (Administrator, Chef, Waiter and
     * Bartender)
     */
    public void addUser(String username, String password, String role) {
        User newUser = new User(username, password, role);
        users.add(newUser);
        System.out.println("se añadio " + username + " " + password + " " + role);
    }

    /**
     * This method called login receives three parameters: userName, password
     * and role iterates over a list of objects of type User called users. which
     * contains information of registered users in the system. Then for each
     * user object the user is compared with the getIdUser().equals(username),
     * password user.getPasswordUser().equals(password) and role
     * user.getUserType().equals(role) these typed in the graphical interface
     * with each one of the members of the user list to verify if they match and
     * if so, it allows entering the following window.
     *
     * @param username the username provided by the user.
     * @param password the password provided by the user.
     * @param role the role of the user (Administrator, Chef, Waiter and
     * Bartender)
     * @return true if the user is authenticated successfully, false otherwise.
     */
    public boolean login(String username, String password, String role) {
        for (User user : users) {

            if (user.getIdUser().equals(username) && user.getPasswordUser().equals(password) && user.getUserType().equals(role)) {
                return true;
            }

        }
        JOptionPane.showMessageDialog(null, "Nombre de usuario, contraseña o rol incorrectos");
        return false;

    }

    /**
     * This method called lockOut creates a new instance of the FRMLogin class
     * and displays the login window on the system which is the login.
     */
    public void lockOut() {
        FRMLogin ventana = new FRMLogin();
        ventana.setVisible(true);

    }

    /**
     * This method userExists takes a parameter called username which checks if
     * a user with the given username exists in the system. It then iterates
     * over a list of User objects called users which contains the registered
     * user information which is used to check if a user with a specific
     * username exists in the system. Returns true if the user exists by
     * comparing the user ID of the User object with the supplied username. If
     * they are the same, it is considered a successful match. and false
     * otherwise.
     *
     * @param username the username to verify
     * @return true if the user exists, false otherwise
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
     * This saveUsersToFile() method saves the list of users to a text file. The
     * file is called "User.txt" and is stored in the current directory. Each
     * user is written on a separate line in the format
     * "idUser,passwordUser,userType".
     *
     */
    public void saveUsersToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Usuario.txt"));
            //Write each user to a separate line in the file.
            for (User user : users) {
                writer.write(user.getIdUser() + "," + user.getPasswordUser() + "," + user.getUserType());
                writer.newLine();
            }
            // Closes the BufferedWriter and displays a success message.
            writer.close();
            System.out.println("Usuarios guardados exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los usuarios en el archivo." + e);
        }
    }

    /**
     * This readUser method reads user data from a text file and adds it. The
     * file must be in the format "username,password,role" for each line. The
     * data for each user is passed to the addUser(username, password, role)
     * method. If any error occurs while reading the file, an error message is
     * displayed.
     */
    public void readUser() {

        try {
            // read the users from the text file
            BufferedReader reader = new BufferedReader(new FileReader("Usuario.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into the user data using the comma as separator
                String[] data = line.split(",");
                // Extract the username, password and role of the user
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
     * This method called addNewUser() takes three parameters username, password
     * and role. It checks if the user already exists using the method
     * userExists(username), If the user does not exist. userExists(username)
     * returns false), the code block inside the if is executed. The addUser
     * method is called to add the new user to some data structure that contains
     * the users. The saveUsersToFile() method is called to save the users to a
     * file. A dialog is displayed using JOptionPane.showMessageDialog() with
     * the message "User added successfully" and otherwise "Username already
     * exists".
     *
     * @param username the username provided by the user.
     * @param password the password provided by the user.
     * @param role the role of the user (Administrator, Chef, Waiter and
     * Bartender)
     */
    public void addNewUser(String username, String password, String role) {
        if (!userExists(username)) {
            addUser(username, password, role);
            saveUsersToFile(); // save users to file
            JOptionPane.showMessageDialog(null, "Usuario agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe");
        }
    }

    /**
     * This method evaluateUser which receives three parameters username,
     * password and role. Evaluates a user's login credentials and takes action
     * based on the result. If the credentials are valid, it displays a welcome
     * message and opens the interface corresponding to the user's role. If the
     * credentials are invalid, it displays an error message.
     *
     * @param username the username provided by the user.
     * @param password the password provided by the user.
     * @param role the role of the user (Administrator, Chef, Waiter and
     * Bartender)
     */
    public void evaluateUser(String username, String password, String role) throws IOException {
        //      if (login(username, password, role)) {
        JOptionPane.showMessageDialog(null, "¡Bienvenido " + username + "!");
        if (role.equals("Administrador")) {
            // Open the admin interface
            FRMAdmin adminFrame = new FRMAdmin();
            adminFrame.setVisible(true);

        } else if (role.equals("Bartender")) {
            // Open the bartender interface
            FRMBartender bartenderFrame = new FRMBartender();
            bartenderFrame.setVisible(true);

        } else if (role.equals("Chef")) {
            // Open the chef interface
            FRMChef chefFrame = new FRMChef();
            chefFrame.setVisible(true);

        } else if (role.equals("Mesero")) {
            // Open the server interface
            FRMWaiter meseroFrame = new FRMWaiter();
            meseroFrame.setVisible(true);

        }

        //  }else{
        //          JOptionPane.showMessageDialog(null, "Nombre de usuario, contraseña o rol incorrectos");
        //     }
    }

    public void deleteTableUser(JTable tbUsers) {
        DefaultTableModel model = (DefaultTableModel) tbUsers.getModel();

        int selectedRow = tbUsers.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Ningun usuario fue seleccionado");
        }

    }

    public void loadUsersTable(JTable tbUsers) {
        DefaultTableModel model = (DefaultTableModel) tbUsers.getModel();
        users.clear();
        for (int i = 0; i < model.getRowCount(); i++) {
            String username = model.getValueAt(i, 0).toString();
            String password = model.getValueAt(i, 1).toString();

            String role = model.getValueAt(i, 2).toString();

            addUser(username, password, role);
        }
    }

    public void loadUserTxt(JTable jtUsers) {
        DefaultTableModel model = (DefaultTableModel) jtUsers.getModel();
        //tbUsers.setEnabled(false);
        jtUsers.setDefaultEditor(Object.class, null);
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Usuario");
        model.addColumn("Contraseña");
        model.addColumn("Role");

        try (BufferedReader br = new BufferedReader(new FileReader("Usuario.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] row = line.split(",");
                model.addRow(row);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //fin de la los metodos del login y registrar usuarios
    /**
     * This readMenu method which receives a tbMenu parameter. Read menu data
     * from a text file and display it in a JTable. The file must be in the
     * format "ID,Name,Price,Category" for each line. The data for each line is
     * added as rows to the JTable using a DefaultTableModel. If any error
     * occurs while reading the file, the exception is printed.
     *
     * @param jtMenu The JTable in which the inventory data will be displayed.
     */
    public void readMenu(JTable jtMenu) {

        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Precio");
        model.addColumn("Categoria");

        // Assign the DefaultTableModel to the JTable
        jtMenu.setModel(model);
        jtMenu.setDefaultEditor(Object.class, null);
        readInventoryTxt();

        for (Product product : inventory) {
            String[] row = new String[4];
            row[0] = product.getId();
            row[1] = product.getProductName();
            row[2] = Double.toString(product.getPrice());
            row[3] = product.getCategory();
            model.addRow(row);

        }

    }
    //metodos de orden

    public void createTable(JDesktopPane DesktopWaiter) throws IOException {
        int x = 10;
        int y = 10;
        int i = 0;
        JIFTable listTable[] = new JIFTable[10];
        for (int j = 0; j < 10; j++) {
            JIFTable window = new JIFTable();
            window.setBounds(x, y, 220, 220);
            window.setTitle("Mesa: " + (j + 1));

            if (j == 4) {
                y = y + 250;
                x = 5;
            } else {
                x = x + 240;
            }
            listTable[j] = window;

        }

        for (JIFTable table : listTable) {

            table.setVisible(true);
            DesktopWaiter.add(table);
        }

    }

    public void setStatusOcupado(int index) {
        System.out.println(index);
        listStatus.set(index, "Ocupado");
        System.out.println(index);
    }

    public void saveStatusTxt() {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("Estados.txt"));
            for (String status : listStatus) {
                writer.write(status);
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "estado no ingresado a la base de datos" + e);
        }
    }

    public void readStatus() {
        try (BufferedReader br = new BufferedReader(new FileReader("Estados.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                for (int i = 0; i < data.length; i++) {

                    listStatus.add(data[i]);
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int readIndexStatus() {
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("indexMesa.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                index = Integer.parseInt(line);

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return index;

    }

    public void writeIndexStatus(int index) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("indexMesa.txt"));
            String x = String.valueOf(index);
            writer.write(x);

            writer.close();

        } catch (IOException e) {
            System.out.println("Error al guardar index." + e);
        }
    }

    /**
     * This saveOrder method passes 3 parameters where these are saved in a
     * constructor of the Product class is loaded in the storage list, after
     * saving in the constructor the saveOrderTxt method is used to save it in
     * the txt of the assigned table.
     *
     * @param productName
     * @param quantity
     * @param price
     * @param comment
     */
    public void saveOrder(String productName, int quantity, double price, String comment, String mesa) {
        Product product = new Product(productName, quantity, price, comment);

        storage.add(product);
        saveOrderTxt(mesa);
        System.out.println("se añadio " + productName + " " + quantity + " " + price + " " + comment);
    }

    public void saveOrderTxt(String mesa) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("mesa" + mesa + ".txt"));
            for (Product product : storage) {
                writer.write(product.getProductName() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getComment());
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "pedido no ingresado a la base de datos" + e);
        }
    }

    /**
     * The total to pay passes 3 parameters, what this method does is save, add
     * the multiplied price to know the total of the order and each time a data
     * is passed to the table on request, it will add it.
     *
     * @param jtOrder
     * @param jlTotal
     * @param quantity
     */
    public void totalPay(JTable jtOrder, JLabel jlTotal, int quantity) {
        double fullPay = 0.00;
        int numFila = jtOrder.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(jtOrder.getModel().getValueAt(i, 2)));
            quantity = Integer.parseInt(jtOrder.getValueAt(i, 1).toString());

            fullPay += cal * quantity;
        }
        jlTotal.setText(String.format("%.2f", fullPay));
    }
    //fin de metodos de orden

    /**
     * This readStorage method passes tbStorage as a JTable parameter where it
     * is going to load the data that is in Inventory.txt to the
     * inventory table.
     *
     * @param tbInventory
     */
    public void readInventory(JTable tbInventory) {

        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("ID");
        model.addColumn("Nombre");
        model.addColumn("Raciones");
        model.addColumn("Precio");
        model.addColumn("Categoría");
        tbInventory.setDefaultEditor(Object.class, null);
        // Assign the DefaultTableModel to the JTable
        tbInventory.setModel(model);

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

    /**
     * The searchResult method passes 3 parameters, what this method makes is a
     * text Field writes the product in the inventory then an array of the
     * Object class is created and it looks for what you wrote with column 0
     * that has the name and you can see if it is already has that product
     * added in inventory
     *
     * @param jtSearchResult
     * @param txtSearch
     * @param jtInventory
     */
    public void searchResult(JTable jtSearchResult, JTextField txtSearch, JTable jtInventory) {
        String search = txtSearch.getText();
        DefaultTableModel originalModel = (DefaultTableModel) jtInventory.getModel();
        DefaultTableModel targetModel = (DefaultTableModel) jtSearchResult.getModel();
        Object[] row = new Object[originalModel.getColumnCount()];

        for (int j = 0; j < originalModel.getRowCount(); j++) {
            if (search.equals(originalModel.getValueAt(j, 1).toString())) {
                for (int i = 0; i < originalModel.getColumnCount(); i++) {
                    row[i] = originalModel.getValueAt(j, i);
                }
            }
        }
        targetModel.addRow(row);
    }

    /**
     * This registerInventory method saves the data in a list passing 3
     * parameters and these will be saved in the constructor of the Product
     * class and that data is loaded in the inventory list.
     *
     * @param productName
     * @param quantity
     * @param price
     * @param category
     */
    public void registerInventory(String productName, int quantity, double price, String category) {
        int x = 1;
        for (int i = 0; i < inventory.size(); i++) {
            x++;
        }

        String id = String.valueOf(x);
        Product product = new Product(id, productName, quantity, price, category);
        System.out.println(product.toString());
        inventory.add(product);

    }

    /**
     * What this readinventoryTxt method does is save the data in the method
     * registerInventory to be able to save them in a list for use, you can Save
     * each data separated by commas in an array and be able to separate it
     * from the other data.
     */
    public void readInventoryTxt() {
        try (BufferedReader br = new BufferedReader(new FileReader("Inventario.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                String productName = data[1];
                int quantity = Integer.parseInt(data[2]);
                double price = Double.parseDouble(data[3]);
                String category = data[4];
                registerInventory(productName, quantity, price, category);

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method addNewInventory has as parameters 3 attributes that are a
     * String productName, a double price and a String category, this method is
     * What it does is enter a condition where it would use the
     * addNewInventoryExist method and pass productName as a parameter, if this
     * attribute is different from the other attributes that are in the list, it
     * would register the plate in the registerInventory method and pass the 3
     * parameters to that method and then I would save it in the inventory.txt
     * with the savePlateToFile method
     *
     * @param productName
     * @param price
     * @param category
     */
    public void addNewInventory(String productName, int quantity, double price, String category) {
        if (!addNewInventoryExist(productName)) {
            registerInventory(productName, quantity, price, category);
            savePlateToFile(); // save dish to file
            JOptionPane.showMessageDialog(null, "se ha agregado exitosamente");
        } else {
            JOptionPane.showMessageDialog(null, "El producto ya existe en el inventario");
        }
    }

    /**
     * This method addNewInventoryExist is passed as a parameter of a String
     * productName it will enter the inventory list and search the entire list
     * if there is an equal name in the productName part, if it finds it, it
     * returns true and if it does not find it, it returns false
     *
     * @param productName
     * @return
     */
    public boolean addNewInventoryExist(String productName) {
        for (Product product : inventory) {
            if (product.getProductName().equals(productName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * What this savePlateToFile method does is save the inventory list in a txt
     * called inventory.txt where it writes by 4 parameters divided by a comma,
     * and saves them that way to the txt, it is used in
     * bufferedWriter for this method
     */
    public void savePlateToFile() {
        //  int i = 1;
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Inventario.txt"));
            for (Product product : inventory) {
                writer.write(product.getId() + "," + product.getProductName() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getCategory());
                writer.newLine();
                //         i++;
            }

            writer.close();
            System.out.println("Plato guardados exitosamente en el archivo.");
        } catch (IOException e) {
            System.out.println("Error al guardar los platos en el archivo." + e);
        }
    }

    /**
     *
     * This method contains a parameter to a JTable called jtInventory, which
     * which deletes the selected row, then that product, which was saved in the
     * table, will be deleted.
     *
     * @param jtInventory
     */
    public void deleteTableInventory(JTable jtInventory) {
        DefaultTableModel model = (DefaultTableModel) jtInventory.getModel();

        int selectedRow = jtInventory.getSelectedRow();
        if (selectedRow != -1) {
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Ningun producto fue seleccionado");
        }

    }

    /**
     * The loadInventoryTable method passes as a parameter a JTable jtInventory
     * which this method cleans the inventory list and saves the data of each
     * row of the jtInventory table which is stored in the registerInventory
     * method each row.
     *
     * @param jtInventory
     */
    public void loadInventoryTable(JTable jtInventory) {
        DefaultTableModel model = (DefaultTableModel) jtInventory.getModel();
        inventory.clear();
        for (int i = 0; i < model.getRowCount(); i++) {

            String id = model.getValueAt(i, 0).toString();
            String productName = model.getValueAt(i, 1).toString();
            int quantity = Integer.parseInt(model.getValueAt(i, 2).toString());
            double price = Double.parseDouble(model.getValueAt(i, 3).toString());
            String category = model.getValueAt(i, 4).toString();
            registerInventory(productName, quantity, price, category);
        }
    }

    /**
     *
     * This readTable method passes as a parameter a String table to know the
     * table number being worked on, then loads the list of the table that is at
     * that moment and if the txt is greater than 1 save the products in
     * constructor containing productName, quantity, price and comment and saves
     * them in the tableOrder list.
     *
     * @param table
     */
    public void readTable(String table) {
        try (BufferedReader br = new BufferedReader(new FileReader("mesa" + table + ".txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length > 1) {
                    String productName = data[0];
                    int quantity = Integer.parseInt(data[1]);
                    double price = Double.parseDouble(data[2]);
                    String comment = data[3];
                    Product product = new Product(productName, quantity, price, comment);
                    tableOrder.add(product);
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * The viewTableOrder method passes as a parameter a JTable jtViewOrder
     * where the table is added and each column is assigned to the table and in
     * a for each it saves each part to the table so that the waiter can see it.
     *
     * @param jtViewOrder
     */
    public void viewTableOrder(JTable jtViewOrder) {

        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        model.addColumn("Comentario");
        jtViewOrder.setDefaultEditor(Object.class, null);
        // Assign the DefaultTableModel to the JTable
        jtViewOrder.setModel(model);

        for (Product product : tableOrder) {
            String[] row = new String[4];
            row[0] = product.getProductName();
            row[1] = Integer.toString(product.getQuantity());
            row[2] = Double.toString(product.getPrice());
            row[3] = product.getComment();
            model.addRow(row);

        }
    }

}
