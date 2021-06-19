/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class printOutputTest {

    @Test
    void splitData_returns_correct_answer() {

        printOutput print = new printOutput();
        String[] row = print.splitData("the,car,hit,the,bus");

        assertEquals("the", row[0]);
    }
}