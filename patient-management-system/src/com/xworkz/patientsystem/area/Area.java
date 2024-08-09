package com.xworkz.patientsystem.area;

import com.xworkz.patientsystem.street.Street;

public class Area {
            public  String areaName;
           Street street;
           public Area(Street street){
               this.street = street;
           }


           public void printStreet(){
               this.street.streetDetails();
               System.out.println("The Area name is " + this.areaName);
           }



}
