package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserListTest {

    @Test
    public void shouldReturnTrueIfSuccessLogin() {
        UserList userList = new UserList();
        User user = new User("111-1111", "xxxx", 0);

        assertEquals(true, userList.loginUser(user));
    }


}
