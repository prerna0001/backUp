package com.stackroute;

public class Customer {
    private int customerId;
    private String customerName;
    private char customerGender;

    public Customer() {
    }

    public Customer(int customerId, String customerName, char customerGender) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerGender = customerGender;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public char getCustomerGender() {
        return customerGender;
    }

    public void setCustomerGender(char customerGender) {
        this.customerGender = customerGender;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", customerName='" + customerName + '\'' +
                ", customerGender=" + customerGender +
                '}';
    }
}
