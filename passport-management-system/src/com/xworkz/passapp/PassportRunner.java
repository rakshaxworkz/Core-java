package com.xworkz.passapp;

import com.xworkz.passapp.customer.Customer;
import com.xworkz.passapp.user.User;
import com.xworkz.passapp.user.impl.UserImpl;

public class PassportRunner {
    public static void main(String[] args) {
        //Abstraction
        User user = new UserImpl();
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setCustomerName("Raksha");
        customer.setPhoneNumber(8197614012L);
        customer.setAge(21);

        boolean add = user.addUser(customer);
        System.out.println(add);
        user.getUserDetails();
        int age= user.updateUserAge(30);
        System.out.println(age);
        user.getUserDetails();
        boolean delete = user.deleteUser();
        System.out.println(delete);
        user.getUserDetails();

    }
}
