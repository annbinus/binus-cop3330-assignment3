/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex41;

import java.io.*;
import java.util.*;

public class sortNames {

    BufferedWriter writer;
    private ArrayList<String> List = new ArrayList<String>();

    //create a function to get list
    public void getList(ArrayList<String> List){
        this.List = List;
    }

    //create a function to sort names
    public ArrayList<String> sortList(){
        Collections.sort(List);
        return List;
    }

    //create a function to print list
    public void printList(ArrayList<String> newList) throws IOException {

        //open the output file to print
        try {
            writer = new BufferedWriter(new FileWriter("exercise41_output.txt"));
        } catch (IOException e) {
            System.out.print("Error opening file!");
        }

        writer.write("Total of " + newList.size() + " names\n" + "-----------------\n");

        //loop through the list and add name in a table format
        for (String s : newList) {
            writer.write(s + "\n");
        }
        writer.close();

    }

}
