package com.twu.biblioteca;

public class User {
    private String login;
    private String password;
    private boolean isLibrarian;

    public User(String login, String password, boolean isLibrarian) {
        this.login = login;
        this.password = password;
        this.isLibrarian = isLibrarian;
    }

    @Override
    public boolean equals(Object obj) {

        if(obj instanceof User) {

            User user = (User) obj;

            return user.login.equals(this.login) && user.password.equals(this.password);
        }

        return false;
    }

    @Override
    public String toString() {
        return this.login + " - " + this.password;
    }

    public boolean isLibrarian() {
        return isLibrarian;
    }
}
