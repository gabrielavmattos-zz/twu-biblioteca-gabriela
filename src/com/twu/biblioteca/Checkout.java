package com.twu.biblioteca;

import java.util.*;

public class Checkout {

    private Map<User, List<Book>> checkouts = new HashMap<User, List<Book>>();
    private List<Book> booksAvaliable =  new ArrayList<Book>();

    public Checkout () {
        initBooksavailable();
    }

    private void initBooksavailable() {
        booksAvaliable.add(new Book("Book1", "Author1", 2013));
        booksAvaliable.add(new Book("Book2", "Author2", 2014));
        booksAvaliable.add(new Book("Book3", "Author3", 2015));
    }

    public boolean checkoutBook(User user, Book book) {

        if (booksAvaliable.remove(book)) {
            if (checkouts.containsKey(user)) {
                checkouts.get(user).add(book);
            } else {
                checkouts.put(user, Arrays.asList(book));
            }
            return true;
        }
        return false;
    }


    public List<Book> getListBooksAvaliable() {
        return booksAvaliable;
    }
    public boolean returnBook(Book book) {

        if (!booksAvaliable.contains(book)) {
            booksAvaliable.add(book);
            return true;
        }
        return false;
    }

    public User getWhoCkeckout(Book book) {

        //checkouts.values();
    }
}
