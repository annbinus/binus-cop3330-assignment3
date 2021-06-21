/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex46;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {

    //open input file and convert text to string
    public String getInput(){
        String text = "";
        File file = new File("input/exercise46_input.txt");

        try {
            text = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    //add the words and its frequency to a list of objects
    public ArrayList<Word> addWord(String text){

        Scanner scan = new Scanner(text);

        ArrayList<Word> list = new ArrayList<Word>();

        //check for each word and its count
       while(scan.hasNext()){
           String word = scan.next();
           int count = 0;

           //increase count and remove the word to not read it again
           while(text.contains(word)){
               text = text.replaceFirst(word, "");
               count++;
           }

           //create new object and add object to list
           Word w = new Word(word, count);
           list.add(w);
           scan = new Scanner(text);
       }
       scan.close();
       return list;
    }
}
