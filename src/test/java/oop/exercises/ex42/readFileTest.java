/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class readFileTest {

    @Test
    void getLine_returns_correct_answer() {
        readFile read = new readFile();

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/input/exercise42_input.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        assertEquals("Ling,Mai,55900", read.getLine(reader));

        }


}