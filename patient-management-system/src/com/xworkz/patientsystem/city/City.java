package com.xworkz.patientsystem.city;

import com.xworkz.patientsystem.area.Area;

public class City {
    public String cityName;
    Area area ;
    public City(Area area){
        this.area = area;
    }


    public void printArea(){
        this.area.printStreet();
        System.out.println("The city name is " + this.cityName);
    }


}
