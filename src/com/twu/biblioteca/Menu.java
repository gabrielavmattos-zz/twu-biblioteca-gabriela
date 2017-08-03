package com.twu.biblioteca;

public class Menu {
    
    private BookList bookList = new BookList();

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

    public String showMessageCheckout(Book book) {
        
        if (bookList.checkout(book))
            return "Thank you! Enjoy the book.";

        return "That book is not available.";
    }

    public BookList getBookList() {
        return bookList;
    }
}
