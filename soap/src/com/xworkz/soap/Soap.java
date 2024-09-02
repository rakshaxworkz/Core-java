package com.xworkz.soap;

import com.xworkz.soap.customer.Customer;

public class Soap {
    Customer customer;
    public Soap(Customer customer){
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
        System.out.println("Customer Id is " + customer.getSoapId());
        System.out.println("Soap name is " + customer.getSoapName());
        System.out.println("Soap Price is " + customer.getPrice());

    }
}
