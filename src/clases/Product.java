package clases;

public class Product {
    private String id;
    private double price;
    private int quantity;
    private String category;
    private String comment;
    private String productName;
    
    

    public Product() {
    }

    public Product(String id, String productName,  int quantity,double price, String category) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.productName = productName;
    }

    public Product(String productName,int quantity, double price, String comment) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.comment = comment;
    }

    public Product(String id, String productName, double price, String category) {
        this.id = id;
        this.price = price;
        this.category = category;
        this.productName = productName;
    }

    public Product(String productName, double price, String category) {
        this.price = price;
        this.category = category;
        this.productName = productName;
    }

   
    
    

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
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

    /**
     * @return the comment
     */
    public String getComment() {
        return comment;
    }

    /**
     * @param comment the comment to set
     */
    public void setComment(String comment) {
        this.comment = comment;
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

    @Override
    public String toString() {
        return "Product{" + "id=" + id + ", price=" + price + ", quantity=" + quantity + ", category=" + category + ", comment=" + comment + ", productName=" + productName + '}';
    }

}