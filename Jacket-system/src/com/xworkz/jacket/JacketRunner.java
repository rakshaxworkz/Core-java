package com.xworkz.jacket;

import com.xworkz.jacket.customer.Customer;

public class JacketRunner {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId(1);
        customer.setBrandName("Puma");
        customer.setPrice(3500);
        customer.setColor("Grey");
        customer.setNoOfPockets(6);
        Jacket jacket = new Jacket(customer);
        jacket.addCustomer(customer);
        jacket.getDetails();
    }
}
