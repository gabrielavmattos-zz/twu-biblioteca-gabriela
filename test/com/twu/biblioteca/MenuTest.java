package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MenuTest {

    @Test
    public void selectOptionListBookMenu() {

        Menu menuExpeceted = new Menu();

        assertEquals("List Books", menuExpeceted.selectOption(1));


    }

    @Test
    public void selectionOptionQuitMenu() {

        Menu menuExpected = new Menu();

        assertEquals("Quit", menuExpected.selectOption(0));
    }

    @Test
    public void selectionInvalideOptionMenu() {

        Menu menuExpected = new Menu();

        assertEquals("Select a valid option!", menuExpected.selectOption(10));
    }

    @Test
    public void shouldMessageSuccessfulCheckout() {

        Menu menuExpected = new Menu();
        Book book = new Book("Book1", "Author1", 2013);

        assertEquals("Thank you! Enjoy the book.", menuExpected.showMessageCheckout(book));
    }

    @Test
    public void shouldMessageUnsuccessfulCheckout() {

        Menu menuExpected = new Menu();
        Book book = new Book("Book1", "Author1", 2013);
        menuExpected.getBookList().checkoutBook(book);

        assertEquals("That book is not available.", menuExpected.showMessageCheckout(book));
    }

}
