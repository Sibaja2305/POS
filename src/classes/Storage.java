package classes;

import java.util.LinkedList;

public class Storage {

    public LinkedList<Product> storage;

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
