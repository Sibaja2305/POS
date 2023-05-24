package classes;

public enum PaymentMethods {

    SinpeMovil("SinpeMovil"), 
    Cash("Efectivo"), 
    Card("Tarjeta");
    
    private String description;

    private PaymentMethods(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return description;
    }
    
    
    
}

