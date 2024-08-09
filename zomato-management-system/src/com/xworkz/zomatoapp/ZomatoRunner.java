package com.xworkz.zomatoapp;

import com.xworkz.zomatoapp.food.Food;
import com.xworkz.zomatoapp.zomato.Zomato;

public class ZomatoRunner {
    public static void main(String[] args) {
        Food food = new Food();

        food.hotelName = "Udupi Hotel";
        food.foodName = "Dose";
        food.foodPrice = 70;
        food.noOfItems = 3;

        Zomato zomato = new Zomato(food);
        zomato.orderFood();
    }




}
