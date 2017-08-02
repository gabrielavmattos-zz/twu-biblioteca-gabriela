package com.twu.biblioteca;


import org.junit.Test;
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

        assertEquals("Book1, Book2, Book3", app.getListBooks());
    }

}