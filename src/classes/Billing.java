package classes;

import java.util.Date;

public class Billing {

    private Order order;
    private Double totalPrice;
    private String billingNumber;
    private Date date;
    private double change;
    private double cash;
    private Client client;

    private Billing(Builder builder) {
        this.order = builder.order;
        this.totalPrice = builder.totalPrice;
        this.billingNumber = builder.billingNumber;
        this.date = builder.date;
        this.change = builder.change;
        this.cash = builder.cash;
        this.client = builder.client;
    }

    // Métodos getter para los atributos de Billing

    public static class Builder {
        private Order order;
        private Double totalPrice;
        private String billingNumber;
        private Date date;
        private double change;
        private double cash;
        private Client client;

        public Builder(Order order, Client client) {
            this.order = order;
            this.client = client;
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
    }
}