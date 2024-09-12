package com.xworkz.amazonapp;

import com.xworkz.amazonapp.customer.Customer;
import com.xworkz.amazonapp.product.Product;
import com.xworkz.amazonapp.product.impl.ProductImpl;

import java.util.Scanner;

public class AmazonRunner {
    public static void main(String[] args) {
        Product product = new ProductImpl();

        Scanner scanner = new Scanner(System.in);
        for (int index = 0; index < 2; index++) {

            Customer customer = new Customer();
            System.out.println("Enter the Customer id");
            int customerId = scanner.nextInt();
            customer.setCustomerId(customerId);
            System.out.println("Enter the Customer Name");
            String cNAme = scanner.next();
            customer.setCustomerName(cNAme);
            System.out.println("Enter the Phone Number");
            long pnum = scanner.nextLong();
            customer.setPhoneNumber(pnum);
            System.out.println("Enter the account status");
            String status = scanner.next();
            customer.setCustomerStatus(status);

            boolean addedCustomer =  product.addCustomer(customer);
            System.out.println("Customer Added Successfully" + addedCustomer);

        }
        product.getCustomerDetails();



//        Customer customer1 = new Customer();
//        customer1.setCustomerId(2);
//        customer1.setCustomerName("Sinchana");
//        customer1.setPhoneNumber(9877838393L);
//        customer1.setCustomerStatus("NotActive");



//        product.addCustomer(customer1);
//        product.getCustomerDetails();
       // product.updateCustomerPhoneNumber(7619628657L);
       // product.getCustomerDetails();
        //product.deleteCustomer();
       // product.getCustomerDetails();

    }
}
