package com.xworkz.supermarketapp.supermarket;

import com.xworkz.supermarketapp.workers.Workers;

public class SuperMarket {
    Workers workers;
    public SuperMarket(Workers workers){
        this.workers = workers ;
    }
    public void workersDetails(){
        if(workers!=null)
            this.workers.displayInfo();
        else
            System.out.println("Workers not found");
    }
}
