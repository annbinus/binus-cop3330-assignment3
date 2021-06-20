/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class printOutputTest {

    @Test
    void histogram() {
        printOutput check = new printOutput();
        ArrayList<Word> list =new ArrayList<>();
        list.add(new Word("badger", 2));
        list.add(new Word("mushroom", 3));

        assertEquals("mushroom: ***\nbadger:   **\n", check.histogram(list));
    }
}