/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex45;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class replaceWord {


    public String getFile(){
        String text = "";
        File file = new File("exercise45_input.txt");

        try {
            //Convert file text to string
            text = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return text;
    }

    public String replace(String text){

        //Replace 'utilize' with 'use'
        text = text.replaceAll("utilize","use");

        return text;
    }
}
