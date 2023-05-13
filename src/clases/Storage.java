package clases;

public class Storage {

    private String productName;
    private int quantity;
    private String category;

    public Storage() {
    }

    public Storage(String productName, int quantity, String category) {
        this.productName = productName;
        this.quantity = quantity;
        this.category = category;
    }

    /**
     * @return the productName
     */
    public String getProductName() {
        return productName;
    }

    /**
     * @param productName the productName to set
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * @return the quantity
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * @param quantity the quantity to set
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Storage{" + "productName=" + productName + ", quantity=" + quantity + ", category=" + category + '}';
    }
    
}