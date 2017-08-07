package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class MovieListTest {

    private MovieList movieList = new MovieList();

    @Test
    public void shouldReturnMovieListAvaliable() {

        List<Movie> movieListExpected = new ArrayList<Movie>();

        movieListExpected.add(new Movie("Movie1", 2010, "Director1", "Unrated"));

        assertEquals(movieListExpected, movieList.getMovieListAvaliable());

    }

    @Test
    public void shouldReturnMovieAtPosition() {

        Movie movieExpected = new Movie("Movie1", 2010, "Director1", "Unrated");

        assertEquals(movieExpected, movieList.getMovieAtPosition(0));
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnErrorAtInvalidPosition() {

        movieList.getMovieAtPosition(10);
    }

    @Test
    public  void shouldGetCheckoutMovie() {

        Movie movie = movieList.getMovieAtPosition(0);

        assertEquals(true, movieList.checkoutMovie(movie));
    }
}
