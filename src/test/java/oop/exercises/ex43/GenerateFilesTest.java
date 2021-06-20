/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex43;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenerateFilesTest {

    @Test
    void genWebsite_returns_right_value() {
        GenerateFiles check = new GenerateFiles();

        assertEquals("Created ./awesome\n", check.genWebsite("awesome"));
    }

    @Test
    void JSFile_returns_right_value() {

        GenerateFiles check = new GenerateFiles();

        assertEquals("Created ./awesome/js/\n", check.JSFile("awesome", true));
    }

    @Test
    void CSSFile_returns_right_value() {
        GenerateFiles check = new GenerateFiles();

        assertEquals("Created ./awesome/css/\n", check.CSSFile("awesome", true));
    }

    @Test
    void indexFile_returns_right_value() {
        GenerateFiles check = new GenerateFiles();

        assertEquals("Created ./awesome/index.html\n", check.indexFile("awesome", ""));
    }
}