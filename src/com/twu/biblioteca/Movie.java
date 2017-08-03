package com.twu.biblioteca;

public class Movie {

    private String title;
    private int year;
    private String director;
    private String rating;

    public Movie(String title, int year, String director, String rating) {

        this.title = title;
        this.year = year;
        this.director = director;
        this.rating = rating;

    }

    @Override
    public boolean equals(Object obj) {

        if (obj instanceof Movie) {

            Movie movie = (Movie) obj;

            return movie.title.equals(this.title) && movie.year == this.year && movie.director.equals(this.director) && movie.rating.equals(this.rating);
        }

        return false;
    }
}
