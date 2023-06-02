package pos;

import Interface.FRMAdmin;
import Interface.FRMBartender;
import Interface.FRMChef;
import Interface.FRMLogin;
import Interface.FRMWaiter;
import Interface.JIFTable;
import classes.Billing;
import classes.Billing.Builder;
import classes.Client;
import classes.Product;
import classes.User;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 * Logic class. Initializes the data structures and models necessary for the
 * program logic. Create LinkedList instances to store the state of tables,
 * patrons, and inventory. Creates an instance of DefaultTableModel for the
 * table model.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Logic {

    public LinkedList<String> listStatus = new LinkedList<>();
//    public LinkedList<Object[]> deletedRows = new LinkedList<>(); 
//    public Object[] deletedRowData;
    public LinkedList<User> users;
    public LinkedList<Product> storage;
    public LinkedList<Product> inventory;
    public LinkedList<Product> tableOrder;
    public LinkedList<Product> listTableChefBart;
    public LinkedList<Billing> listBilling;
    public HashMap<String, Integer> reportList;

    static DefaultTableModel model;
    static User user;

    /**
     * Constructor of the Logic class. Initializes the data structures and
     * models necessary for the program logic. Create LinkedList instances to
     * store the state of tables, patrons, and inventory. Creates an instance of
     * DefaultTableModel for the table model.
     */
    public Logic() {

        reportList = new HashMap();
        storage = new LinkedList<>();
        listTableChefBart = new LinkedList<>();
        inventory = new LinkedList<>();
        users = new LinkedList<>();
        tableOrder = new LinkedList<>();
        listBilling = new LinkedList<>();
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

    }

    /**
     * The "deleteTableRow" method that has tbUsers as parameter allows deleting
     * a selected row from a table. To do this, the table from which the row
     * will be removed must be passed as a parameter. Gets the selected row
     * using int selectedRow = getSelectedRow(). If selectedRow has a value
     * other than -1, it indicates that a valid row has been selected. Inside
     * the if, you use model.removeRow(selectedRow); to remove the selected row
     * of the model from the table. In case it has not been no rows selected, a
     * warning dialog is displayed using JOptionPane.showMessageDialog
     *
     * @param jtTable The users table (JTable) from which the row will be
     * removed.
     */
    public void deleteTableRow(JTable jtTable) {
        // Get the model of the table
        DefaultTableModel model = (DefaultTableModel) jtTable.getModel();

        // Get the selected row
        int selectedRow = jtTable.getSelectedRow();
        if (selectedRow != -1) {
            // If a valid row has been selected, it is removed from the table model
            model.removeRow(selectedRow);
        } else {
            JOptionPane.showMessageDialog(null, "Ninguna fila fue seleccionada");
        }

    }

//    public void deleteTableOrderRow(JTable jtTable) {
//        DefaultTableModel model = (DefaultTableModel) jtTable.getModel();
//        int selectedRow = jtTable.getSelectedRow();
//        if (selectedRow != -1) {
//            // Obtener los datos de la fila seleccionada
//            deletedRowData = new Object[model.getColumnCount()];
//            for (int i = 0; i < model.getColumnCount(); i++) {
//                deletedRowData[i] = model.getValueAt(selectedRow, i);
//            }
//
//            // Eliminar la fila del modelo
//            model.removeRow(selectedRow);
//        } else {
//            JOptionPane.showMessageDialog(null, "Ninguna fila fue seleccionada");
//        }
//    }
//
//    public void restoreDeletedRow(JTable jtTable) {
//        DefaultTableModel model = (DefaultTableModel) jtTable.getModel();
//        if (deletedRowData != null) {
//            // Agregar la fila nuevamente al modelo
//            model.addRow(deletedRowData);
//
//            // Reiniciar los datos de la fila eliminada
//            deletedRowData = null;
//        } else {
//            JOptionPane.showMessageDialog(null, "No hay filas eliminadas para restaurar");
//        }
//    }
    /**
     * The "loadUsersTable" method that has tbUsers as a parameter is
     * responsible for loading user data from a table (JTable) into a list of
     * users. This is done by getting the values for each row in the table and
     * adding those values as a new user to the list. The method begins by
     * getting the model of the table using the line of code DefaultTableModel
     * model = (DefaultTableModel) tbUsers.getModel(); . This is done to be able
     * to access the data stored in the table. The existing user list is cleared
     * using users.clear(). the "addUser" method is called passing the values
     * obtained from the table as parameters.
     *
     * @param tbUsers The users table (JTable) from which the data will be
     * loaded.
     */
    public void loadUsersTable(JTable tbUsers) {
        // Get the model of the table
        DefaultTableModel model = (DefaultTableModel) tbUsers.getModel();

        // Clear the list of users
        users.clear();
        for (int i = 0; i < model.getRowCount(); i++) {

            // Get the values of each column of the current row
            String username = model.getValueAt(i, 0).toString();
            String password = model.getValueAt(i, 1).toString();
            String role = model.getValueAt(i, 2).toString();

            // Add the user to the user list
            addUser(username, password, role);
        }
    }

    /**
     * This loadUserTxt method with jtUsers as parameter loads user data from a
     * text file into a table. Cell editing is disabled in the table, the table
     * model is reset, the necessary columns are added, and each line of the
     * text file is read to add it as a new row in the table model.
     *
     * @param jtUsers The user table (JTable) into which the data will be
     * loaded.
     */
    public void loadUserTxt(JTable jtUsers) {
        DefaultTableModel model = (DefaultTableModel) jtUsers.getModel();

        // Configuración inicial de la tabla
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

                // Agrega la fila a la tabla
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

    /**
     * The "createTable" method is responsible for creating and displaying a
     * series of table windows in a JDesktopPane. The method receives as a
     * parameter the JDesktopPane "DesktopWaiter" in which the table windows
     * will be displayed. The windows are positioned in a grid and configured
     * with specific titles. Table windows are created using the JIFTable class.
     *
     * @param DesktopWaiter The JDesktopPane in which to display the desktop
     * windows.
     * @throws IOException If an input/output error occurs.
     */
    public void createTable(JDesktopPane DesktopWaiter) throws IOException {
        int x = 10;
        int y = 10;
        int i = 0;
        JIFTable listTable[] = new JIFTable[10];

        // Create and configure the table windows
        for (int j = 0; j < 10; j++) {
            JIFTable window = new JIFTable();
            window.setBounds(x, y, 220, 220);
            window.setTitle("Mesa: " + (j + 1));

            // Update the position coordinates of the windows
            if (j == 4) {
                y = y + 250;
                x = 5;
            } else {
                x = x + 240;
            }
            // Add the table window to the list
            listTable[j] = window;

        }
        // Show the table windows in the JDesktopPane
        for (JIFTable table : listTable) {

            table.setVisible(true);
            DesktopWaiter.add(table);
        }

    }

    /**
     * The "setStatusOccupado" method, which takes index as parameter, is used
     * to establish the status of a table as "Occupied". Inside the method, the
     * list "listStatus" is accessed and the "set" method is used to replace the
     * value at the specified index with "Busy".
     *
     * @param index The index of the table whose state will be updated.
     */
    public void setStatusOcupado(int index) {
        listStatus.set(index, "Ocupado");
    }

    /**
     * The "setStatusDisponible" method is used to set the status of a table as
     * "Available". It receives as a parameter the index of the table (in the
     * "listStatus" list) whose status is to be updated. Inside the method, the
     * list "listStatus" is accessed and the "set" method is used to replace the
     * value at the specified index with "Available".
     *
     * @param index The index of the table whose state will be updated.
     */
    public void setStatusDisponible(int index) {
        listStatus.set(index, "Disponible");
    }

    /**
     * It saves the states of the tables in a text file called "Estados.txt".
     * The statuses are obtained from the "listStatus" list. in case If an I/O
     * exception occurs, an error message is displayed using
     * JOptionPane.showMessageDialog.
     */
    public void saveStatusTxt() {
        try {

            // Create a BufferedWriter to write to the file "States.txt"
            BufferedWriter writer = new BufferedWriter(new FileWriter("Estados.txt"));

            // Write each table state to a new line in the file
            for (String status : listStatus) {
                writer.write(status);
                writer.newLine();
            }
            // Close the BufferedWriter
            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "estado no ingresado a la base de datos" + e);
        }
    }

    /**
     * The "readStatus" method is responsible for reading the table statuses
     * from the "Estados.txt" text file and adds them to the "listStatus" list.
     * Inside the method, a BufferedReader object is used to read the file
     * "States.txt" using a FileReader.
     */
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

    /**
     * The "readIndexStatus" method is responsible for reading the table status
     * index from the text file "indexMesa.txt" and returns it as a integer
     * value. Within the method, the variable "index" is initialized with the
     * value 0. A BufferedReader object is used to read the file "indexMesa.txt"
     * using a FileReader.
     *
     * @return The table state index read from the file.
     */
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

    /**
     * The "writeIndexStatus" method is used to write the table status index to
     * the "indexMesa.txt" text file. The method receives as a parameter the
     * table state index to write. Inside the method, a BufferedWriter object is
     * created to write to the file "indexMesa.txt" using a FileWriter.
     *
     * @param index The table state index to write to.
     * @throws IOException If an I/O error occurs while writing to the file.
     */
    public void writeIndexStatus(int index) throws IOException {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("indexMesa.txt"));
            // Convert the index to a string and write it to the file
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
    public void saveOrder(String productName, int quantity, double price, String comment, String mesa, String plateState, String category) {
        Product product = new Product(productName, quantity, price, comment, plateState, category);

        storage.add(product);
        subtractQuantity(inventory, product);
        saveOrderTxt(mesa);
        System.out.println("se añadio " + productName + " " + quantity + " " + price + " " + comment);
    }

    /**
     * The "subtractQuantity" method is used to subtract the quantity of a
     * product from inventory. It receives as parameters a linked list of
     * products "inventory" and the product "product" whose quantity will be
     * subtracted from the inventory.
     *
     * @param inventory The linked list of inventory products.
     * @param product The product whose quantity will be subtracted from
     * inventory.
     */
    public void subtractQuantity(LinkedList<Product> inventory, Product product) {
        for (Product productInventory : inventory) {
            if (productInventory.getProductName().equals(product.getProductName())) {

                // Calculate the remaining quantity by subtracting the quantity of the product from inventory
                int remainingQuantity = productInventory.getQuantity() - product.getQuantity();
                productInventory.setQuantity(remainingQuantity);

                // Save the changes to the products file
                savePlateToFile();

            }

        }

    }

    /**
     * This method passes a String table parameter, what it does is write back
     * the txt of the table with all its data that this order needs so that it
     * is saved in each table in which the order is being made.
     *
     * @param mesa
     */
    public void saveOrderTxt(String mesa) {

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("mesa" + mesa + ".txt"));
            for (Product product : storage) {
                writer.write(product.getProductName() + "," + product.getQuantity() + "," + product.getPrice()
                        + "," + product.getComment() + "," + product.getPlateState() + "," + product.getCategory());
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
    public void totalPay(JTable jtOrder, JLabel jlTotal) {
        double fullPay = 0.00;
        int numFila = jtOrder.getRowCount();
        for (int i = 0; i < numFila; i++) {
            double cal = Double.parseDouble(String.valueOf(jtOrder.getModel().getValueAt(i, 2)));
            int quantity = Integer.parseInt(jtOrder.getValueAt(i, 1).toString());

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
                if (Integer.parseInt(row[2]) <= 5) {
                    JOptionPane.showMessageDialog(null, "El producto " + row[1] + " Tiene menos de 5 raciones");
                }
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
     * added in inventory.
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
     * This registerInventory method saves the data in a list passing 4
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
     * This method addNewInventory has as parameters 4 attributes that are a
     * String productName, a double price, a String category and int quantity.
     * This method is What it does is enter a condition where it would use the
     * addNewInventoryExist method and pass productName as a parameter, if this
     * attribute is different from the other attributes that are in the list, it
     * would register the plate in the registerInventory method and pass the 3
     * parameters to that method and then I would save it in the inventory.txt
     * with the savePlateToFile method.
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
            for (Product product : inventory) {
                if (product.getProductName().equals(productName)) {
                    product.setQuantity(product.getQuantity() + quantity);
                    break;
                }
            }
            savePlateToFile();
            JOptionPane.showMessageDialog(null, "se ha agregado cantidad a producto existente");
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

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Inventario.txt"));
            for (Product product : inventory) {
                writer.write(product.getId() + "," + product.getProductName() + "," + product.getQuantity() + "," + product.getPrice() + "," + product.getCategory());
                writer.newLine();

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

    /**
     * This method billingSave writes to the client class and the builder class
     * the data that contained the invoice and then they are saved in the data
     * in a list called listBilling.
     *
     * @param billingNumber
     * @param date
     * @param name
     * @param idClient
     * @param mail
     * @param totalPrice
     * @param change
     * @param cash
     */
    public void billingSave(String billingNumber, String date, String name, String idClient, String mail, double totalPrice, double change, double cash) {
        Client client = new Client(name, idClient, mail);
        Builder builder = new Billing.Builder();
        builder.totalPrice(totalPrice)
                .billingNumber(billingNumber)
                .date(date)
                .change(change)
                .cash(cash)
                .client(client);

        Billing billing = builder.build();
        listBilling.add(billing);

    }

    /**
     * This method viewBill passes as parameters 8 parameters of type JLabel
     * which assigns to it a data from the invoice to each one and they are
     * saved in that JLabel to be used the impression of the invoice.
     *
     * @param lblBillingNumber
     * @param lblCash
     * @param lblChange
     * @param lblDate
     * @param lblEmail
     * @param lblIdClient
     * @param lblNameCustomer
     * @param lblTotalPrice
     */
    public void viewBill(JLabel lblBillingNumber, JLabel lblCash, JLabel lblChange, JLabel lblDate, JLabel lblEmail, JLabel lblIdClient, JLabel lblNameCustomer, JLabel lblTotalPrice) {

        lblBillingNumber.setText(listBilling.get(0).getBillingNumber());
        lblCash.setText(String.valueOf(listBilling.get(0).getCash()));
        lblChange.setText(String.valueOf(listBilling.get(0).getChange()));
        lblDate.setText(listBilling.get(0).getDate());

        lblEmail.setText(listBilling.get(0).getClient().getMail());
        lblIdClient.setText(listBilling.get(0).getClient().getId());
        lblNameCustomer.setText(listBilling.get(0).getClient().getName());
        lblTotalPrice.setText(String.valueOf(listBilling.get(0).getTotalPrice()));
    }

    /**
     * What this method actualDate does is write the current system date which
     * it does a format and passes them to String and returns a resetDate.
     *
     * @return
     */
    public String actualDate() {

        Date updateDate = new Date();

        // Create a format to display the date
        SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");

        // Format current date as text string
        String resetDate = formatDate.format(updateDate);

        return resetDate;
    }

    /**
     * This method totalChange passes as parameters a double total and a double
     * cash which which means that if the cash is greater than the total, it
     * subtracts the cash from the total and returns the change.
     *
     * @param total
     * @param cash
     * @return
     */
    public double totalChange(double total, double cash) {
        double change = 0;
        if (cash > total) {
            change = cash - total;

        }
        return change;
    }

    /**
     * This method loadChefBartView passes as a parameter a JTable jtTables
     * which writes all the tables that are occupied in a table so that the
     * bartender or chef can be shown.
     *
     * @param jtTables
     */
    public void loadChefBartView(JTable jtTables) {
        model.addColumn("Mesas");
        jtTables.setModel(model);
        String row[] = new String[1];
        for (int i = 0; i < listStatus.size(); i++) {
            if (listStatus.get(i).equals("Ocupado")) {
                row[0] = "mesa" + (i + 1);
                model.addRow(row);
            }

        }
    }

    /**
     * This method loadTableChefBart passes a String table as a parameter, what
     * it does is load the data of the selected table that the chef or bartender
     * selected and saves it in a listTableChefBart.
     *
     * @param table
     */
    public void loadTableChefBart(String table) {
        try (BufferedReader br = new BufferedReader(new FileReader(table + ".txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length > 1) {
                    String productName = data[0];
                    int quantity = Integer.parseInt(data[1]);
                    double price = Double.parseDouble(data[2]);
                    String comment = data[3];
                    String plateState = data[4];
                    String category = data[5];
                    Product product = new Product(productName, quantity, price, comment, plateState, category);
                    listTableChefBart.add(product);
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method loadListToTableChef passes a JTable jtChefOrder as
     * parameters, what it does is load the table order in the chef table where
     * the columns are added, and load the data in the table but only the orders
     * of the table that are food.
     *
     * @param jtChefOrder
     */
    public void loadListToTableChef(JTable jtChefOrder) {
        DefaultTableModel model = (DefaultTableModel) jtChefOrder.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Comentario");
        model.addColumn("Estado");
        jtChefOrder.setDefaultEditor(Object.class, null);
        // Assign the DefaultTableModel to the JTable

        for (Product product : listTableChefBart) {

            if (product.getCategory().equals("Comida")) {
                String[] row = new String[4];
                row[0] = product.getProductName();
                row[1] = Integer.toString(product.getQuantity());
                row[2] = product.getComment();
                row[3] = product.getPlateState();
                model.addRow(row);
            }
        }

    }

    /**
     * This method loadListToTableBart passes as a parameter JTable jtBartOrder
     * to load the order of the table only the drinks of the table, then it adds
     * the columns, and loop through listTableChefBart to add them to the table
     * but only drinks.
     *
     * @param jtBartOrder
     */
    public void loadListToTableBart(JTable jtBartOrder) {
        DefaultTableModel model = (DefaultTableModel) jtBartOrder.getModel();
        model.setColumnCount(0);
        model.setRowCount(0);
        model.addColumn("Nombre");
        model.addColumn("Cantidad");
        model.addColumn("Comentario");
        model.addColumn("Estado");
        jtBartOrder.setDefaultEditor(Object.class, null);
        // Assign the DefaultTableModel to the JTable

        for (Product product : listTableChefBart) {

            if (product.getCategory().equals("Bebida")) {
                String[] row = new String[4];
                row[0] = product.getProductName();
                row[1] = Integer.toString(product.getQuantity());
                row[2] = product.getComment();
                row[3] = product.getPlateState();
                model.addRow(row);
            }
        }
    }

    /**
     * This method donePlate passes as a parameter a String of productName which
     * what it does is to search the list for the product that is the same and
     * if the dish is on hold, it will be makes a set to pass it to ready.
     *
     * @param productName
     */
    public void donePlate(String productName) {

        for (Product product : listTableChefBart) {
            if (productName.equals(product.getProductName())) {
                if (product.getPlateState().equals("En espera")) {
                    product.setPlateState("Listo");
                } else {
                    product.setPlateState("En espera");
                }
            }
        }

    }

    /**
     * This method saveOrderChefBart passes a String table as parameters, what
     * it does is write in the txt the new data to the table of the part of the
     * chef or bartender, since the status of the dish is changed to ready.
     *
     * @param table
     */
    public void saveOrderChefBart(String table) {
        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("mesa" + table + ".txt"));
            for (Product product : listTableChefBart) {
                writer.write(product.getProductName() + "," + product.getQuantity() + "," + product.getPrice()
                        + "," + product.getComment() + "," + product.getPlateState() + "," + product.getCategory());
                writer.newLine();
            }
            writer.close();

        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "pedido no ingresado a la base de datos" + e);
        }
    }

    /**
     * This method deleteTable passes a String table as a parameter and what it
     * does is write to the table in which an empty space is located so that the
     * order of that table and can be cleaned to be used again after it is
     * finished The Billing.
     *
     * @param table
     */
    public void deleteTable(String table) {

        try {
            // Create a BufferedWriter with a FileWriter in write mode
            BufferedWriter writer = new BufferedWriter(new FileWriter("mesa" + table + ".txt"));

            // Write an empty string to the file
            writer.write("");

            // Close the BufferedWriter
            writer.close();

            System.out.println("Contenido del archivo eliminado correctamente.");
        } catch (IOException e) {
            System.out.println("Ocurrió un error al intentar borrar el contenido del archivo.");
            e.printStackTrace();
        }
    }

    /**
     * This method readHelpTxt takes as parameters a String of nameFrame, a
     * JtextArea, what it does is load the content in a specific help txt so
     * that is written to in a textArea called jtahelpText and the user can see
     * the help of the part in which it is of the page.
     *
     * @param nameFrame
     * @param jtaHelpText
     * @throws IOException
     */
    public void readHelpTxt(String nameFrame, JTextArea jtaHelpText) throws IOException {

        // Read the content of the file and save it in a StringBuilder
        try {
            BufferedReader reader = new BufferedReader(new FileReader(nameFrame + ".txt"));
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            reader.close();
            // Sets the content of the StringBuilder in the JTextArea
            jtaHelpText.setText(sb.toString());
        } catch (IOException iOException) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo" + iOException);
        }

    }

    /**
     * this method mostSellingPlate contains 2 parameters and what it does is
     * Load the list of the most sold dishes and enter the amounts if the dish
     * already exists and if the amount is not going to go up, the dish will
     * stay like this and is saved again in the txt
     *
     * @param productName
     * @param quantity
     */
    public void mostSellingPlate(String productName, int quantity) {
        upLoadReport();

        if (reportList.containsKey(productName)) {
            int cantidadExistente = reportList.get(productName);
            reportList.put(productName, cantidadExistente + quantity);
        } else {
            reportList.put(productName, quantity);
        }
        quantity = 0;

        savePlateReport(reportList);

    }

    /**
     * this method downloads the report txt and saves it in a hashMap.
     */
    public void upLoadReport() {
        try (BufferedReader br = new BufferedReader(new FileReader("reporte.txt"))) {
            String line;

            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                if (data.length > 1) {
                    String productName = data[0];
                    int quantity = Integer.parseInt(data[1]);

                    Product product = new Product(productName, quantity);
                    reportList.put(productName, quantity);
                }

            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * This method saves the Updated hashMap data again in the report txt
     * separated by a comma
     *
     * @param comidas
     */
    public void savePlateReport(Map<String, Integer> comidas) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("reporte.txt"))) {
            for (Map.Entry<String, Integer> entry : comidas.entrySet()) {
                String linea = entry.getKey() + "," + entry.getValue();
                bw.write(linea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
