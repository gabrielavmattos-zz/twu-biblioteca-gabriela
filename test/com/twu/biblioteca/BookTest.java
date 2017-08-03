package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    @Test
    public void checkoutBook () {
        Book bookExpected = new Book("Book1", "Author1", 2013);

        assertEquals("Thank you! Enjoy the book.", bookExpected.checkout());
    }

    @Test
    public void checkoutUnavaliableBook () { //question

        Book bookExpected = new Book("Book1", "Author1", 2013);
        bookExpected.checkout();

        assertEquals("That book is not available.", bookExpected.checkout());
    }
}