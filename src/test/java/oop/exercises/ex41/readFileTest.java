package oop.exercises.ex41;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class readFileTest {

    @Test
    void getList_returns_correct_name() {
        readFile read = new readFile();
        read.openFile();
        read.addName();
        assertEquals("Ling, Mai", read.getList().get(0));
    }

    @Test
    void getName_returns_true() {
        readFile read = new readFile();
        read.openFile();
        assertEquals("Ling, Mai", read.getName());
    }
}