package com.twu.biblioteca;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    @Test
    public void shouldReturnNameCustomer() { // apenas esse teste é suficiente?

        Customer customerExpected = new Customer("111-1111", "xxxx", "Name1", "name@email.com", "(11) 1111-1111");

        String nameExpected = "Name1";
        assertEquals(nameExpected, customerExpected.getName());



    }
}
