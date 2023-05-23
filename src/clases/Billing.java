package clases;

import java.util.Date;

public class Billing {

    private Order order;

    private Double totalPrice;

    private String billingNumber;

    private Date date;
    
    
     public Billing(Builder builder) {
        this.order = builder.order;
        this.totalPrice = builder.totalPrice;
        this.billingNumber = builder.billingNumber;
        this.date = builder.date;
    }

    public Order getOrder() {
        return order;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public String getBillingNumber() {
        return billingNumber;
    }

    public Date getDate() {
        return date;
    }
     public static class Builder {
        private Order order;
        private Double totalPrice;
        private String billingNumber;
        private Date date;

        public Builder order(Order order) {
            this.order = order;
            return this;
        }

        public Builder totalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Builder billingNumber(String billingNumber) {
            this.billingNumber = billingNumber;
            return this;
        }

        public Builder date(Date date) {
            this.date = date;
            return this;
        }

        public Billing build() {
            return new Billing(this);
        }
    }
     

}
