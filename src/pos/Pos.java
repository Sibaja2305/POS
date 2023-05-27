package pos;

import Interface.FRMLogin;
import classes.User;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.LinkedList;

/**
 * The main class that contains the main method of the point of sale (POS)
 * program. The main method takes care of setting up the screen, creating an
 * instance of the login interface (FRMLogin), setting its size to fill the
 * entire screen, and displaying it. It also instantiates User as an
 * administrator and adds it to a LinkedList User .
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Pos {

    /**
     * Main method of the point of sale program. Configures the screen, creates
     * an instance of FRMLogin, sets its size, and displays it. Creates an
     * instance of User as an administrator and adds it to a LinkedList User.
     *
     * @param args The command line arguments (not used in this case).
     */
    public static void main(String[] args) {
        // Get screen size

        double width = 800;
        double height = 500;

        //Create an instance of FRMLogin (login interface)
        FRMLogin pos = new FRMLogin();

        // Set the window size to fill the entire screen
//        pos.setBounds(0, 0, ((int) width), ((int) height));
        // Show login window
        pos.setVisible(true);

        // Create an instance of User as administrator
        User admin = new User("admin", "1", "1");

        // Create a LinkedList<User> and add the admin to the list
        LinkedList<User> lista = new LinkedList<>();
        lista.add(admin);
    }
}
