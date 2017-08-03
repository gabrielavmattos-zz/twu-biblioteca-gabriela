package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    @Test
    public void showListBooks() {

        BookList bookList = new BookList();

        List<Book> booksExpected = new ArrayList<Book>();
        booksExpected.add(new Book("Book1", "Author1", 2013));
        booksExpected.add(new Book("Book2", "Author2", 2014));
        booksExpected.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpected, bookList.getListBooks());
    }


    @Test
    public void showListBookAvaliable() {

        BookList bookList = new BookList();
        Book bookCheckout = bookList.getBook(1);
        bookList.checkout(bookCheckout);

        List<Book> booksExpectedAvaliable = new ArrayList<Book>();

        booksExpectedAvaliable.add(new Book("Book1", "Author1", 2013));
        booksExpectedAvaliable.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpectedAvaliable, bookList.getListBooksAvaliable());

    }

    @Test
    public void shouldReturnBookAtPosition() {

        BookList bookList = new BookList();

        Book bookExpect = new Book("Book2", "Author2", 2014);

        assertEquals(bookExpect, bookList.getBook(1) );
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnErrorAtInvalidPosition() {
        BookList bookList = new BookList();

        bookList.getBook(10);
    }

    @Test
    public void checkoutBook () {

        BookList bookList = new BookList();

        Book book = bookList.getBook(1);

        assertEquals("Thank you! Enjoy the book.", bookList.checkout(book));
    }

    @Test
    public void checkoutUnavaliableBook () { //question


        BookList bookList = new BookList();

        Book book = bookList.getBook(1);
        bookList.checkout(book);

        assertEquals("That book is not available.", bookList.checkout(book));
    }

}
