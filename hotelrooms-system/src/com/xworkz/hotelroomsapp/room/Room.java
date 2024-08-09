package com.xworkz.hotelroomsapp.room;

public class Room {
    public String hotelName;
    public int hotelPrice;
    public boolean isFoodAvailable;
    public int noOfPerson;

    public void displayInfo(){
        System.out.println("The Name of hotel " + this.hotelName);
        System.out.println("The Hotel Price " + this.hotelPrice);
        System.out.println("Is food available " + this.isFoodAvailable);
        System.out.println("Number of Person " + this.noOfPerson);
    }
}
