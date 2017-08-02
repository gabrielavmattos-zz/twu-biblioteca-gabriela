package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BibliotecaApp {

    private List<Book> books = Arrays.asList(
            new Book("Book1", "Author1", 2013),
            new Book("Book2", "Author2", 2014),
            new Book("Book3", "Author3", 2015)

    );
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public String startAplication() {
        String message = "Hi, welcome! Biblioteca is avaliable!";
        return message;
    }


    public List getListBooks() {
        return books;
    }
}
