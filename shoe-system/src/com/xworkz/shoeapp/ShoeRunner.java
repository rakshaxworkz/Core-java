package com.xworkz.shoeapp;

import com.xworkz.shoeapp.customer.Customer;

public class ShoeRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setShoeId(1);
        customer.setShoeBrand("Crocs");
        customer.setSize(8);
        customer.setPrice(5600.0);



        Shoe shoe = new Shoe(customer);
        shoe.getCustomerDetails();
    }
}
