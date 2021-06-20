/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex46;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyTest {

    @Test
    void addWord_returns_right_answer() {
        Frequency check = new Frequency();
        ArrayList<Word> newList = check.addWord("badger mushroom");
        assertEquals("badger", newList.get(0).word);
    }

}