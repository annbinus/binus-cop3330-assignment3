/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import java.io.*;
import java.util.ArrayList;

public class printOutput {

    private BufferedWriter writer;


    //open output file
    public void openOutput() {

        try {
            writer = new BufferedWriter(new FileWriter("exercise42_output.txt"));
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    //split the data
    public String[] splitData(String data){
        String[] row = data.split(",");
        return row;
    }

    //print on output file
    public void printList(ArrayList<String> list){

                try {
                    writer.write("Last      First     Salary\n-----------------------\n");

                    for (String id : list) {
                        for (String a : splitData(id)) {
                             writer.write(String.format("%-10s", a));
                        }
                        writer.write("\n");
                    }
                }catch (IOException e) {
                    e.printStackTrace();
                }
        }


    //close writer file
    public void closeFile() {
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
