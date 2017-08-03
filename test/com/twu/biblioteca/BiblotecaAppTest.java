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

}