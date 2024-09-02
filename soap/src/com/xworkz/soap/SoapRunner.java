package com.xworkz.soap;

import com.xworkz.soap.customer.Customer;

public class SoapRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setSoapId(1);
        customer.setSoapName("Dove");
        customer.setPrice(65);
        Soap soap = new Soap(customer);
        soap.addCustomer(customer);
        soap.getDetails();

    }
}
