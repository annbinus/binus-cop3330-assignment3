/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex46;

import java.util.ArrayList;
import java.util.Comparator;

public class printOutput {

    //create histogram for the words
    public String histogram(ArrayList<Word> list){
        StringBuilder result = new StringBuilder();

        //make an ordered list
        Comparator<Word> comparator = (obj1, obj2) -> obj2.wordCount -  obj1.wordCount;
        list.sort(comparator);

        //print histogram
        for(Word w : list){
            StringBuilder builder = new StringBuilder(String.format("%-10s", w.word + ":"));

            //print "*" for every count
            while(w.wordCount > 0){
                builder.append("*");
                w.wordCount--;
            }
            result.append(builder).append("\n");
        }
        return result.toString();
    }
}
