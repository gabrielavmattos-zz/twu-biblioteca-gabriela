package com.twu.biblioteca;

public class Menu {

    public String selectOption(int option) {
        switch (option) {
            case 1:
                return "List Books";
            case 0:
                return "Quit";
            default:
                return "Select a valid option!";
        }
    }
}
