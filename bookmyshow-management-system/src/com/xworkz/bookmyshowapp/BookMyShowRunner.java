package com.xworkz.bookmyshowapp;

import com.xworkz.bookmyshowapp.bookmyshow.BookMyShow;
import com.xworkz.bookmyshowapp.movies.Movies;

public class BookMyShowRunner {
    public static void main(String[] args) {
        Movies movies = new Movies();
        movies.movieName = "KGF";
        movies.ticketPrice = 450;
        movies.noOfTickets = 5;

        BookMyShow bookMyShow = new BookMyShow(movies);

        bookMyShow.showMovieInfo();
    }
}
