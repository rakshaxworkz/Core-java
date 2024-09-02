package com.xworkz.shoeapp.customer;

public class Customer {
    private int shoeId;
    private String shoeBrand;
    private double price;
    private int size;

    public void setShoeId(int shoeId) {
        this.shoeId = shoeId;
    }

    public void setShoeBrand(String shoeBrand) {
        this.shoeBrand = shoeBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getShoeId() {
        return shoeId;
    }

    public String getShoeBrand() {
        return shoeBrand;
    }

    public double getPrice() {
        return price;
    }

    public int getSize() {
        return size;
    }
}
