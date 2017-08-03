package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    private List<Book> books = Arrays.asList(
            new Book("Book1", "Author1", 2013),
            new Book("Book2", "Author2", 2014),
            new Book("Book3", "Author3", 2015));

    public List<Book> getListBooks() {
        return books;
    }

    public List<Book> getListBooksAvaliable() {

        List<Book> listBooksAvaliable = new ArrayList<Book>();
        for (Book book: books) {
            if (book.getAvaliable())
                listBooksAvaliable.add(book);

        }
        return listBooksAvaliable;
    }

    public Book getBook(int position) {


        return books.get(position);

    }
}
