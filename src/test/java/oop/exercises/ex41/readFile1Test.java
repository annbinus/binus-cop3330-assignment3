/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex41;

import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class readFile1Test {

    @Test
    void getList_returns_correct_name() throws IOException {
        readFile1 read = new readFile1();
        read.openFile();
        read.addName();
        assertEquals("Ling, Mai", read.getList().get(0));
    }

    @Test
    void getName_returns_true() throws IOException {
        readFile1 read = new readFile1();
        read.openFile();
        assertEquals("Ling, Mai", read.getName());
    }
}