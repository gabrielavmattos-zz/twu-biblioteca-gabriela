package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MovieList {
    private List<Movie> movieListAvaliable;

    MovieList() {

        this.movieListAvaliable =  Arrays.asList(
                new Movie("Movie1", 2010, "Director1", "Unrated"));

    }

    public List<Movie> getMovieListAvaliable() {
        return movieListAvaliable;
    }


}
