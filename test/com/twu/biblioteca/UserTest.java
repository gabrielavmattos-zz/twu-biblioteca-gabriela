package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldCheckoutTypeUserIsLibrarian() {
        User user = new User("111-1111", "xxxx", true);

        assertEquals(true, user.isLibrarian());

    }
}
