package com.xworkz.bag;

import com.xworkz.bag.customer.Customer;

public class Bag {
    Customer customer;
    public Bag(Customer customer){
        this.customer = customer;
    }
    public void getCustomerDetails(){
        System.out.println("Bag Id is " + customer.getBagId());
        System.out.println("Bag Brand is " + customer.getBagBrand());
        System.out.println("Bag Color is " + customer.getColor());
        System.out.println("Bag price is " + customer.getPrice());
        System.out.println("Bag No of Compartments is " + customer.getNoOfCompartments());
    }
}
