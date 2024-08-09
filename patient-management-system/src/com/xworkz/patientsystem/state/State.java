package com.xworkz.patientsystem.state;

import com.xworkz.patientsystem.city.City;

public class State {
    City city ;
    public String stateName;
    public State(City city){
        this.city = city;
    }

    public void printCity(){
        System.out.println("The state name is " + this.stateName);
        this.city.printArea();
    }

}
