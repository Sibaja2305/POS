package classes;

import java.util.Date;

/**
 *
 * This class contains necessary attributes for invoice creation and also, it
 * contains the data of the client class, the pattern of Builder layout.
 *
 * @author Diego Herrera López
 * @author Kevin Sibaja Granados
 * @author Yordany Navarro Hernandez
 * @author Tiffany Hernández Rodriguez
 * @author Jonathan Alfaro Herrera
 */
public class Billing {

    private Double totalPrice;
    private String billingNumber;
    private String date;
    private double change;
    private double cash;
    private Client client;

    /**
     * empty constructor
     */
    public Billing() {
    }

    /**
     * This Billing constructor has the Builder class as a parameter, which this
     * constructor contains all the attributes of the Billing class
     *
     * @param builder
     */
    private Billing(Builder builder) {
        this.totalPrice = builder.totalPrice;
        this.billingNumber = builder.billingNumber;
        this.date = builder.date;
        this.change = builder.change;
        this.cash = builder.cash;
        this.client = builder.client;
    }

    /**
     * This method returns the total price
     *
     * @return
     */
    public Double getTotalPrice() {
        return totalPrice;
    }

    /**
     * This method returns the invoice number
     *
     * @return
     */
    public String getBillingNumber() {
        return billingNumber;
    }

    /**
     * This method returns the invoice date
     *
     * @return
     */
    public String getDate() {
        return date;
    }

    /**
     * This method returns the bill change
     *
     * @return
     */
    public double getChange() {
        return change;
    }

    /**
     * This method returns the money method that the user entered
     *
     * @return
     */
    public double getCash() {
        return cash;
    }

    /**
     * This method returns the Attributes of the client class
     *
     * @return
     */
    public Client getClient() {
        return client;
    }

    /**
     * This method returns all the data from the Billing class
     *
     * @return
     */
    @Override
    public String toString() {
        return "Billing{" + "totalPrice=" + totalPrice + ", billingNumber=" + billingNumber + ", date=" + date + ", change=" + change + ", cash=" + cash + ", client=" + client + '}';
    }

    /**
     * This static class contains all the attributes that the class contained
     * Billing and what is used is to change the data of each attribute
     */
    public static class Builder {

        private Double totalPrice;
        private String billingNumber;
        private String date;
        private double change;
        private double cash;
        private Client client;

        /**
         * empty constructor
         */
        public Builder() {

        }

        /**
         * this method sets the value of the total price
         *
         * @param totalPrice
         * @return
         */
        public Builder totalPrice(Double totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        /**
         * This method sets invoice number value
         *
         * @param billingNumber
         * @return
         */
        public Builder billingNumber(String billingNumber) {
            this.billingNumber = billingNumber;
            return this;
        }

        /**
         * This method sets the date value
         *
         * @param date
         * @return
         */
        public Builder date(String date) {
            this.date = date;
            return this;
        }

        /**
         * This method sets the change value
         *
         * @param change
         * @return
         */
        public Builder change(double change) {
            this.change = change;
            return this;
        }

        /**
         * This method sets the value of money
         *
         * @param cash
         * @return
         */
        public Builder cash(double cash) {
            this.cash = cash;
            return this;
        }

        /**
         * This method establishes the billing method
         *
         * @return
         */
        public Billing build() {
            return new Billing(this);
        }

        /**
         * This method sets the client method
         *
         * @param client
         * @return
         */
        public Builder client(Client client) {
            this.client = client;
            return this;
        }
    }

}
