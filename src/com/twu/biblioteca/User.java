package com.twu.biblioteca;

public class User {
    private String login;
    private String password;
    private int type;

    public User(String login, String password, int type) {
        this.login = login;
        this.password = password;
        this.type = type;
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

        if (type == 0)
            return true;
        return false;
    }
}
