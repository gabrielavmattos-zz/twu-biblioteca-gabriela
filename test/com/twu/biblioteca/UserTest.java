package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void shouldReturnTrueIfLibrarian() {
        User user = new User("111-1111", "xxxx", true);

        assertEquals(true, user.isLibrarian());

    }

    @Test
    public void shouldReturnInformationUser(){

        User user = new User("111-1111", "xxxx", true, "Name1", "name@email.com", "(11) 1111-1111");

        assertEquals("Name1 - name@email.com - (11) 1111-1111", user.getInformationUser());
    }


}
