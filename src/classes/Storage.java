package classes;

import java.util.LinkedList;

/**
 * Contains a list to hold the data that comes from the Product class
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Storage {

    public LinkedList<Product> storage;

    /**
     * empty constructor
     */
    public Storage() {

    }

    /**
     * @return the storage
     */
    public LinkedList<Product> getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(LinkedList<Product> storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Storage{" + "storage=" + storage + '}';
    }

}
