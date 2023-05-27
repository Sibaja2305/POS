package classes;
/**
 * Contains the payment methods that are going to have the invoice part
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public enum PaymentMethods {

    SinpeMovil("SinpeMovil"), 
    Cash("Efectivo"), 
    Card("Tarjeta");
    
    private String description;
  /**
   * What this method does is put a description of each payment method
   * @param description 
   */
    private PaymentMethods(String description) {
        this.description = description;
    }
 /**
  * This method returns the description of each payment method
  * @return 
  */
    @Override
    public String toString() {
        return description;
    }
    
    
    
}

