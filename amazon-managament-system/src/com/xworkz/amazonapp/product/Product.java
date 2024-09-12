package com.xworkz.amazonapp.product;

import com.xworkz.amazonapp.customer.Customer;

public interface Product {
    boolean addCustomer(Customer customer);
    void getCustomerDetails();
    long updateCustomerPhoneNumber(long newPhoneNumber);
    boolean deleteCustomer();
}
