package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {

    private List<Movie> movies;
    private List<Movie> moviesAvaliable;

    MovieList() {

        this.movies = Arrays.asList(
                new Movie("Movie1", 2010, "Director1", "Unrated"));


        this.moviesAvaliable =  new ArrayList<Movie>(this.movies);
    }

    public List<Movie> getMovieListAvaliable() {
        return moviesAvaliable;
    }


    public Movie getMovieAtPosition(int position) {

        return movies.get(position);
    }

    public boolean checkoutMovie(Movie movie) {

        return moviesAvaliable.remove(movie);
    }
}
