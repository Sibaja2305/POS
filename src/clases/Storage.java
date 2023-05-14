package clases;

import java.util.LinkedList;

public class Storage {

   private LinkedList<Product> storage;

    public Storage(LinkedList<Product> storage) {
        this.storage = storage;
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
