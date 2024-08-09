package com.xworkz.zomatoapp.food;

public class Food {
    public String hotelName;
    public String foodName;
    public int foodPrice;
    public int noOfItems;

    public void foodDisplayInfo(){
        System.out.println("The Hotel name is " + this.hotelName);
        System.out.println("The Food Name is " + this.foodName);
        System.out.println("The Food Price is " + this.foodPrice);
        System.out.println("The number of Items is " + this.noOfItems);
    }
}
