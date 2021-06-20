/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex44;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void getName_returns_right_values() {
        Product prod =new Product("Mac", "15.00", "2");
        assertEquals("Mac", prod.name);
    }

    @Test
    void data_returns_right_values() {
        Product prod =new Product("Mac", "15.00", "2");
        assertEquals("Name: Mac\nPrice: 15.00\nQuantity: 2" , prod.data());
    }
}