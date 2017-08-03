package com.twu.biblioteca;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BookListTest {

    private BookList bookList = new BookList();

    @Test
    public void showListBooks() {

        List<Book> booksExpected = new ArrayList<Book>();
        booksExpected.add(new Book("Book1", "Author1", 2013));
        booksExpected.add(new Book("Book2", "Author2", 2014));
        booksExpected.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpected, bookList.getListBooks());
    }


    @Test
    public void showListBookAvaliable() {

        Book bookCheckout = bookList.getBook(1);
        bookList.checkout(bookCheckout);

        List<Book> booksExpectedAvaliable = new ArrayList<Book>();

        booksExpectedAvaliable.add(new Book("Book1", "Author1", 2013));
        booksExpectedAvaliable.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpectedAvaliable, bookList.getListBooksAvaliable());

    }

    @Test
    public void shouldReturnBookAtPosition() {

        Book bookExpect = new Book("Book2", "Author2", 2014);

        assertEquals(bookExpect, bookList.getBook(1) );
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void shouldReturnErrorAtInvalidPosition() {

        bookList.getBook(10);
    }

    @Test
    public void checkoutBook () {


        Book book = bookList.getBook(1);

        assertEquals(true, bookList.checkout(book));
    }

    @Test
    public void checkoutUnavaliableBook () {

        Book book = bookList.getBook(1);
        bookList.checkout(book);

        assertEquals(false, bookList.checkout(book));
    }

}
