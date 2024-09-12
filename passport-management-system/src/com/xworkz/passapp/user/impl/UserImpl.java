package com.xworkz.passapp.user.impl;

import com.xworkz.passapp.customer.Customer;
import com.xworkz.passapp.user.User;

public class UserImpl implements User {
    Customer customer;
    @Override
    public boolean addUser(Customer customer) {
        boolean isAdded= false;
        if(customer != null){
            if(customer.getCustomerName() != null){
                this.customer = customer;
                System.out.println("Customer Added Successfully");
                isAdded = true;
            }
        }
        return isAdded;
    }

    @Override
    public void getUserDetails() {
        System.out.println(customer);
    }

    @Override
    public int updateUserAge(int newAge) {
        if(newAge >0) {
            this.customer.setAge(newAge);
        }
        return newAge;
    }

    @Override
    public boolean deleteUser() {
        boolean isDeleted = false;
        if(customer != null){
            if(customer.getCustomerName() != null){
                this.customer=null;
                System.out.println("Customer Deleted Successfully");
                isDeleted = true;
            }
        }
        return isDeleted;
    }
}
