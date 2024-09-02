package com.xworkz.bag.customer;

public class Customer {
        private int bagId;
        private String bagBrand;
        private double price;
        private String color;
        private int noOfCompartments;

    public void setBagId(int bagId) {
        this.bagId = bagId;
    }

    public void setBagBrand(String bagBrand) {
        this.bagBrand = bagBrand;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setNoOfCompartments(int noOfCompartments) {
        this.noOfCompartments = noOfCompartments;
    }

    public int getBagId() {
        return bagId;
    }

    public String getBagBrand() {
        return bagBrand;
    }

    public double getPrice() {
        return price;
    }

    public String getColor() {
        return color;
    }

    public int getNoOfCompartments() {
        return noOfCompartments;
    }
}

