/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex45;

import java.io.IOException;
import java.nio.file.*;

public class replaceWord {

    private static Path path = Paths.get("exercise45_input.txt");

    public String getFile(){
        String text = "";

        try {
            //Convert file text to string
            text = Files.readString(path);
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
