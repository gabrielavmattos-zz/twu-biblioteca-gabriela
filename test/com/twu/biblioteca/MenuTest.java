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

}
