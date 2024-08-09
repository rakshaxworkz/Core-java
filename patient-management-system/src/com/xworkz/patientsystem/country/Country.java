package com.xworkz.patientsystem.country;

import com.xworkz.patientsystem.state.State;

public class Country {
    State state;
    public String countryName;
    public Country(State state){
        this.state = state;
    }

   public void printState(){
      this.state.printCity();
        System.out.println("The Country name is " + this.countryName);
    }

}
