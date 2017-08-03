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

    public String menu(int option) {

        switch (option) {
            case 1:
                return "List Books";
            case 0:
                return "Quit";
            default:
                return "Select a valid option!";
        }

    }

    public List<Book> getListBooksAvaliable() {
        books.get(1).checkout();
        List<Book> listBooksAvaliable = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getAvaliable())
                listBooksAvaliable.add(book);

        }
        return listBooksAvaliable;
    }
}
