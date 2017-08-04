package com.twu.biblioteca;

public class User {
    private String login;
    private String password;
    private boolean isLibrarian;
    private String name;
    private String email;
    private String phoneNumber;

    public User(String login, String password, boolean isLibrarian) {
        this.login = login;
        this.password = password;
        this.isLibrarian = isLibrarian;
    }

    public User(String login, String password, boolean isLibrarian, String name, String email, String phoneNumber) {
        this.login = login;
        this.password = password;
        this.isLibrarian = isLibrarian;
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
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

    public String getInformationUser() {
        return this.name + " - " + this.email + " - " + this.phoneNumber;
    }
}
