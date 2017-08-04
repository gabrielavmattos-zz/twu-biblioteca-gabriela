package com.twu.biblioteca;

import java.util.Arrays;
import java.util.List;

public class UserList {

    private List<User> users;

    public UserList() {
        users = Arrays.asList(
                new User("111-1111", "xxxx", true),
                new User("222-2222", "YYYY", false));
    }
    public boolean loginUser(User user) {

        System.out.println(user);
        return users.contains(user);

    }

    public User getUser (int position) {
        return users.get(position);
    }
}
