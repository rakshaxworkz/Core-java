package com.xworkz.watchapp.customer;

public class Customer {
    private int id;
    private String brandName;
    private double price;

    public void setId(int id) {
        this.id = id;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setPrice(double price) {
        this.price = price;
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

}
