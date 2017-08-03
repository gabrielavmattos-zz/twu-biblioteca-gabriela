package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    @Test
    public void shouldReturnMovieListAvaliable() {

        MovieList movieList = new MovieList();
        List<Movie> movieListExpected = new ArrayList<Movie>();

        movieListExpected.add(new Movie("Movie1", 2010, "Director1", "Unrated"));

        assertEquals(movieListExpected, movieList.getMovieListAvaliable());

    }
}
