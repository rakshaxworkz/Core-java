package com.xworkz.passapp.user;

import com.xworkz.passapp.customer.Customer;

public interface User {
    boolean addUser(Customer customer);
    void getUserDetails();
    int updateUserAge(int newAge);
    boolean deleteUser();
}
