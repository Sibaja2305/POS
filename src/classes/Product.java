package classes;

/**
 * This class contains the necessary data for the creation of menu, inventory
 * and orders regarding each meal
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Product {

    private String id;
    private double price;
    private int quantity;
    private String category;
    private String comment;
    private String productName;
    private String plateState;

    /**
     * empty constructor
     */
    public Product() {
    }

    /**
     * This constructor is used for inventory, since these are the data you need
     *
     * @param id
     * @param productName
     * @param quantity
     * @param price
     * @param category
     */
    public Product(String id, String productName, int quantity, double price, String category) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.productName = productName;
    }

    /**
     * This constructor is created for orders, since it contains the data that
     * need the order
     *
     * @param productName
     * @param quantity
     * @param price
     * @param comment
     */
    public Product(String productName, int quantity, double price, String comment) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.comment = comment;
    }

    /**
     * Constructor used for the menu, since it contains necessary for the menu
     *
     * @param id
     * @param productName
     * @param price
     * @param category
     */
    public Product(String id, String productName, double price, String category) {
        this.id = id;
        this.price = price;
        this.category = category;
        this.productName = productName;
    }

    /**
     * constructor to create a new product to inventory
     *
     * @param productName
     * @param price
     * @param category
     */
    public Product(String productName, double price, String category) {
        this.price = price;
        this.category = category;
        this.productName = productName;
    }

    /**
     * constructor to pass each customer's order to use in chef and bartender
     *
     * @param productName
     * @param quantity
     * @param price
     * @param comment
     * @param plateState
     * @param category
     */
    public Product(String productName, int quantity, double price, String comment, String plateState, String category) {
        this.quantity = quantity;
        this.category = category;
        this.comment = comment;
        this.productName = productName;
        this.plateState = plateState;
        this.price = price;
    }

    /**
     * @return the plateState
     */
    public String getPlateState() {
        return plateState;
    }

    /**
     * @param plateState the plateState to set
     */
    public void setPlateState(String plateState) {
        this.plateState = plateState;
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
        return "Product{" + "id=" + id + ", price=" + price + ", quantity=" + quantity + ", category=" + category + ", comment=" + comment + ", productName=" + productName + ", plateState=" + plateState + '}';
    }

}
