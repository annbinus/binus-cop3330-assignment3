/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex45;

import java.io.*;
import java.util.*;


public class fileOutput {
    private static final Scanner scan = new Scanner(System.in);

    public void writeOut(String fileText){

        //open file with the desired file name

        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(FileName()+".txt"));

            //write the modified version of the text
            writer.write(fileText);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String FileName(){
        System.out.print("Please enter the name of the output file. ");
        return scan.nextLine();
    }
}
