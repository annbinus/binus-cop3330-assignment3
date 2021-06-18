/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/

package oop.exercises.ex41;

import java.io.*;
import java.util.ArrayList;

public class readFile {

    private BufferedReader reader;
    private ArrayList<String> list = new ArrayList<String>();

    //create a function to open file
    public void openFile(){
        try {
            reader = new BufferedReader(new FileReader("exercise41_input.txt"));
        } catch (FileNotFoundException e) {
            System.out.print("Error when opening file!");
        }

    }

    //create a function to get name from each line
    public String getName()  {
        String name = "";

        try {
            name = reader.readLine();
        } catch (IOException e) {
            System.out.print("Error when opening file!");
        }

        return name;
    }

    //create a function to add name
    public void addName() throws IOException {

        String name;
        while((name = getName()) != null){
            list.add(name);
        }
        reader.close();
    }

    //create a function to return list of names
    public ArrayList<String> getList(){
        return list;
    }

}
