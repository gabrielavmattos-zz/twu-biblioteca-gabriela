package com.twu.biblioteca;


import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BiblotecaAppTest {

    @Test
    public void test() {
        assertEquals(1, 1);
    }

    @Test
    public void showWelcomeMessage() {

        BibliotecaApp app = new BibliotecaApp();

        assertEquals("Hi, welcome! Biblioteca is avaliable!", app.startAplication());

    }

    @Test
    public void showListBooks() {

        BibliotecaApp app = new BibliotecaApp();
        List<Book> booksExpected = new ArrayList<Book>();
        booksExpected.add(new Book("Book1", "Author1", 2013));
        booksExpected.add(new Book("Book2", "Author2", 2014));
        booksExpected.add(new Book("Book3", "Author3", 2015));

        assertEquals(booksExpected, app.getListBooks());
    }

    @Test
    public void selectOptionListBookMenu() {

        BibliotecaApp app = new BibliotecaApp();

        assertEquals("List Books", app.menu(1));


   }

   @Test
    public void selectionOptionQuitMenu() {

        BibliotecaApp app = new BibliotecaApp();

        assertEquals("Quit", app.menu(0));
   }

}