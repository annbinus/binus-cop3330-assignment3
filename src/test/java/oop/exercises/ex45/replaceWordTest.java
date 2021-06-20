/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex45;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class replaceWordTest {

    @Test
    void getFile_returns_right_answer() {
        replaceWord check =new replaceWord();
        assertEquals("One should never utilize the word \"utilize\" in writing. Use \"use\" instead. For example, \"She uses an IDE to write her Java programs\" instead of \"She utilizes an IDE to write her Java programs\".", check.getFile());
    }

    @Test
    void replace_returns_right_answer() {
        replaceWord check = new replaceWord();
        assertEquals("use", check.replace("utilize"));
    }
}