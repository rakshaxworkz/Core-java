package com.xworkz.jacket;

import com.xworkz.jacket.customer.Customer;

public class Jacket {
    Customer customer;
    public Jacket(Customer customer){
        this.customer = customer;
    }

    public boolean addCustomer(Customer customer){
        boolean isAdded = false;
        if(customer!=null){
            this.customer=customer;
            isAdded = true;
        }
        return isAdded;

    }
    public void getDetails(){
        System.out.println("Customer Id is " + customer.getId());
        System.out.println("Jacket Brand name is " + customer.getBrandName());
        System.out.println("Jacket Price is " + customer.getPrice());
        System.out.println("Jacket color is " + customer.getColor());
        System.out.println("Jacket no of pockets is " + customer.getNoOfPockets());

    }
}
