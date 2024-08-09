package com.xworkz.bookmyshowapp.bookmyshow;

import com.xworkz.bookmyshowapp.movies.Movies;

public class BookMyShow {
    Movies movies;
    public BookMyShow(Movies movies){
        this.movies = movies;
    }
    public void showMovieInfo(){
        if(movies!=null)
            this.movies.onCreateDetails();
        else
            System.out.println("No Movies found");
    }
}
