package com.xworkz.watchapp;

import com.xworkz.watchapp.customer.Customer;

public class WatchRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setBrandName("Sonata");
        customer.setPrice(3500);

        Watch watch = new Watch(customer);
        watch.addCustomer(customer);
        watch.getDetails();

    }
}
