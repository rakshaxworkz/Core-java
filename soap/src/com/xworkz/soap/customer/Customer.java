package com.xworkz.soap.customer;

public class Customer {
    private int soapId;
    private String soapName;
    private double price;

    public void setSoapId(int soapId) {
        this.soapId = soapId;
    }

    public void setSoapName(String soapName) {
        this.soapName = soapName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSoapId() {
        return soapId;
    }

    public String getSoapName() {
        return soapName;
    }

    public double getPrice() {
        return price;
    }
}
