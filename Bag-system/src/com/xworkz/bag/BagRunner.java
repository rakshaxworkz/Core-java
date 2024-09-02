package com.xworkz.bag;

import com.xworkz.bag.customer.Customer;

public class BagRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setBagId(1);
        customer.setBagBrand("Puma");
        customer.setColor("Blue");
        customer.setPrice(5699);
        customer.setNoOfCompartments(7);
        Bag bag = new Bag(customer);
        bag.getCustomerDetails();
    }

}
