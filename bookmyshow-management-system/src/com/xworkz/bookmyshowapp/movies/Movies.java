package com.xworkz.bookmyshowapp.movies;

public class Movies {
    public  String movieName;
    public int ticketPrice;
    public int noOfTickets;

    public void onCreateDetails(){
        System.out.println("The Movie name is " +  this.movieName);
        System.out.println("The ticket Price is " + this.ticketPrice);
        System.out.println("The number of tickets is " + this.noOfTickets);
    }
}
