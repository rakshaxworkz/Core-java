package com.xworkz.supermarketapp;

import com.xworkz.supermarketapp.supermarket.SuperMarket;
import com.xworkz.supermarketapp.workers.Workers;

public class SuperMarketRunner {
    public static void main(String[] args) {
        Workers workers = new Workers();
        workers.name = "Sinchana Shetty";
        workers.phoneNumber = 817382828882L;
        workers.age=35;
        workers.salary=35000;

        SuperMarket superMarket = new SuperMarket(workers);
        superMarket.workersDetails();
    }
}
