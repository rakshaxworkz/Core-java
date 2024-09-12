package com.xworkz.amazonapp.customer;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Customer {
    private int customerId;
    private String customerName;
    private long phoneNumber;
    private String customerStatus;
}
