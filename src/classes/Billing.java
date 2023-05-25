package classes;

import java.util.Date;

public class Billing {
    private Double totalPrice;
    private String billingNumber;
    private String date;
    private double change;
    private double cash;
    private Client client;

    private Billing(Builder builder) {
        this.totalPrice = builder.totalPrice;
        this.billingNumber = builder.billingNumber;
        this.date=builder.date;
        this.change = builder.change;
        this.cash = builder.cash;
        this.client = builder.client;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public String getBillingNumber() {
        return billingNumber;
    }

    public String getDate() {
        return date;
    }

    public double getChange() {
        return change;
    }

    public double getCash() {
        return cash;
    }

    public Client getClient() {
        return client;
    }
    

    
    public static class Builder {
        private Double totalPrice;
        private String billingNumber;
        private String date;
        private double change;
        private double cash;
        private Client client;

        public Builder() {
           
        }

        

        public Builder totalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder billingNumber(String billingNumber) {
            this.billingNumber = billingNumber;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder change(double change) {
            this.change = change;
            return this;
        }

        public Builder cash(double cash) {
            this.cash = cash;
            return this;
        }

        public Billing build() {
            return new Billing(this);
        }

        public void client(Client client) {
        }
    }

  
}