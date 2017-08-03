package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class UserList {

    private List<User> users;

    public UserList() {
        users = Arrays.asList(
                new User("111-1111", "xxxx", 0));
    }
    public boolean loginUser(User user) {

        System.out.println(user);
        return users.contains(user);

    }
}
