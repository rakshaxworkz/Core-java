package com.xworkz.shoeapp;

import com.xworkz.shoeapp.customer.Customer;

public class Shoe {
    Customer customer;
    public Shoe(Customer customer){
        this.customer = customer;
    }
    public void getCustomerDetails(){
        System.out.println("Shoe Id is " + customer.getShoeId());
        System.out.println("Shoe Brand Name is " + customer.getShoeBrand());
        System.out.println("Shoe Price is " + customer.getPrice());
        System.out.println("Shoe size is " + customer.getSize());
    }
}
