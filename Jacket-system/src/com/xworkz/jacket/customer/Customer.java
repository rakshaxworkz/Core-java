package com.xworkz.jacket.customer;

public class Customer {
    private int id;
    private String brandName;
    private double price;
    private String color;
    private int noOfPockets;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNoOfPockets(int noOfPockets) {
        this.noOfPockets = noOfPockets;
    }

    public int getId() {
        return id;
    }

    public String getBrandName() {
        return brandName;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getNoOfPockets() {
        return noOfPockets;
    }
}
