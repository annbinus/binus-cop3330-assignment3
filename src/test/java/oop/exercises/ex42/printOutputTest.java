/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.*;

class printOutputTest {

    @Test
    void splitData_returns_correct_answer() {

        printOutput print = new printOutput();

        try {
            BufferedReader br = new BufferedReader(new FileReader("exercise42_input.txt"));
            String []row = print.splitData(br.readLine());
            assertEquals("Ling", row[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}