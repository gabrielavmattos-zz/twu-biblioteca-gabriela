package com.twu.biblioteca;

public class Menu {
    
    private BookList bookList = new BookList();
    private User user;
    private Checkout checkout = new Checkout();

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
        
        if (checkout.checkoutBook(user, book))
            return "Thank you! Enjoy the book.";
        return "That book is not available.";
    }

    public BookList getBookList() {
        return bookList;
    }

    public String showMessageReturn(Book book) {

        if (checkout.returnBook(book))
            return "Thank you for returning the book.";
        return "That is not a valid book to return.";
    }

    public Checkout getCheckout() {
        return checkout;
    }
}
