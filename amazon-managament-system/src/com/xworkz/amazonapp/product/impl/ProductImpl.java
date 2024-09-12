package com.xworkz.amazonapp.product.impl;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;

public class ProductImpl implements Product {
    Customer customer[] = {null,null};
    int index;
    @Override
    public boolean addCustomer(Customer customer) {
        boolean isAdded = false;
        //System.out.println("Add customer Method started");
        if(customer!= null){
            if(customer.getCustomerName() != null){
                this.customer[index++]=customer;
                //System.out.println("Customer Added successfully");
                isAdded = true;
            }
           // else System.out.println("Customer Added is not Successfull");
        }
       // System.out.println("Add customer Method Ended");
        return isAdded;
    }

    @Override
    public void getCustomerDetails() {
        //System.out.println("Get customer Details Method started");
       for (Customer customer : customer){
           System.out.println(customer);
       }
        //System.out.println("Get customer Details Method started");
    }

    @Override
    public long updateCustomerPhoneNumber(long newPhoneNumber) {
//        System.out.println("Update Customer PhoneNumber Method started");
//        if(newPhoneNumber > 0){
//            this.customer.setPhoneNumber(newPhoneNumber);
//        }
//        else System.out.println("Phone Number is invalid");
//        System.out.println("Update Customer PhoneNumber Method Ended");
        return newPhoneNumber;
    }

    @Override
    public boolean deleteCustomer() {
//        System.out.println("Delete customer Method started");
 //          boolean isDeleted= false;
//        if(customer!=null){
//            if(customer.getCustomerName() != null){
//                this.customer = null;
//                System.out.println("Deleted customer Successfully");
//                isDeleted = true;
//            }
//            else System.out.println("Delete of customer is not successfull");
//        }
//
//        System.out.println("Delete customer Method started");
        return false;
    }
}
