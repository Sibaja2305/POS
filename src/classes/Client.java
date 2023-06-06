package classes;

/**
 * This Client class inherits from the Person class and passes the data from
 * person to customer.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Client extends Person {
  /**
   * empty constructor
   */
    public Client() {
    }
/**
 * This constructor contains the data that I inherit from the Person class.
 * @param name passes the name data of the person attribute
 * @param id pass the id data of the person attribute
 * @param mail pass the data of the person attribute mail
 */
    public Client(String name, String id, String mail) {
        super(name, id, mail);
    }

}
