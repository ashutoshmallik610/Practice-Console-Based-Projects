package com.ecom.order.mngmt;

public class Customer {

    private String customerId;
    private String customerName;

    public Customer(String customerId, String customerName) {

        this.customerId = customerId;
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void customerDetails() {

        System.out.println("Customer Id : " + customerId);
        System.out.println("Customer Name : " + customerName);
    }
}