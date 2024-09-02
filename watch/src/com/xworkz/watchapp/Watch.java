package com.xworkz.watchapp;

import com.xworkz.watchapp.customer.Customer;

public class Watch {
    Customer customer;
    public Watch(Customer customer){
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
        System.out.println("Watch Brand name is " + customer.getBrandName());
        System.out.println("Watch Price is " + customer.getPrice());

    }

}
