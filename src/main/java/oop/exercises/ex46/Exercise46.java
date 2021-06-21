/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex46;

import java.util.ArrayList;

public class Exercise46 {
    public static void main(String[] args) {

        //read text and return a list of words
        Frequency freq = new Frequency();
        String text = freq.getInput();

        //create histogram
        ArrayList<Word> list = freq.addWord(text);
        printOutput print = new printOutput();
        System.out.println(print.histogram(list));

    }
}
