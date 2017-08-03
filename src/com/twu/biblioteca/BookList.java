package com.twu.biblioteca;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookList {

    private List<Book> books;

    private  List<Book> booksAvaliable;

    BookList() {
        this.books =  Arrays.asList(
                new Book("Book1", "Author1", 2013),
                new Book("Book2", "Author2", 2014),
                new Book("Book3", "Author3", 2015));

        this.booksAvaliable = new ArrayList<Book>(books);
    }

    public List<Book> getListBooks() {
        return books;
    }

    public List<Book> getListBooksAvaliable() {
        return booksAvaliable;
    }

    public Book getBook(int position) {
        return books.get(position);
    }


    public boolean checkoutBook(Book book) {
        return booksAvaliable.remove(book);
    }

    public boolean returnBook(Book book) {

        if (!booksAvaliable.contains(book)) {
            booksAvaliable.add(book);
            return true;
        }
        return false;
    }
}
