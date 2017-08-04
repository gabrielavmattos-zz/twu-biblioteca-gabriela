package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class CheckoutTest {

    @Test
    public void shouldReturnWhoCheckout() {
        Checkout checkout = new Checkout();

        User userExpect = new User ("222-2222", "yyyy", true);
        Book book = new Book("Book2", "Author2", 2014);
        checkout.checkoutBook(userExpect, book);

        assertEquals(userExpect, checkout.getWhoCkeckout(book));
    }




    @Test
    public void checkoutBook() {
        Checkout checkout = new Checkout();

        Book book = new Book("Book2", "Author2", 2014);
        User user = new User ("111-1111", "xxxx" , false);

        assertEquals(true, checkout.checkoutBook(user, book));
    }



    @Test
    public void showListBookAvaliable() {
        Checkout checkout = new Checkout();

        Book book = new Book("Book2", "Author2", 2014);
        User user = new User ("111-1111", "xxxx" , false);
        checkout.checkoutBook(user, book);

        List<Book> booksExpectedAvaliable = new ArrayList<Book>();

        booksExpectedAvaliable.add(new Book("Book1", "Author1", 2013));
        booksExpectedAvaliable.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpectedAvaliable, checkout.getListBooksAvaliable());

    }


   @Test
    public void checkoutUnavaliableBook() {
        Checkout checkout = new Checkout();

        Book book = new Book("Book2", "Author2", 2014);
        User user = new User ("111-1111", "xxxx" , false);
        checkout.checkoutBook(user, book);

        assertEquals(false, checkout.checkoutBook(user, book));
    }

    @Test
    public void returnBook() {
        Checkout checkout = new Checkout();

        Book book = new Book("Book2", "Author2", 2014);
        User user = new User ("111-1111", "xxxx" , false);
        checkout.checkoutBook(user, book);

        assertEquals(true, checkout.returnBook(book));
    }
}
