/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import java.io.*;
import java.util.ArrayList;


public class readFile {

    BufferedReader reader;
        private ArrayList<String> list = new ArrayList<String>();

        //create a function to open file
        public BufferedReader openFile(){

            try {
               reader = new BufferedReader(new FileReader("src/main/resources/input/exercise42_input.txt"));
            } catch (FileNotFoundException e) {
                System.out.print("Error when opening file!");
            }
            return reader;
        }

        //create a function to get data from each line
        public String getLine(BufferedReader reader)  {
            String name = "";

            try {
                name = reader.readLine();
            } catch (IOException e) {
                System.out.print("Error when opening file!");
            }

            return name;
        }

        //create a function to add data
        public void addLine(BufferedReader reader) {

            String name;

            while ((name = getLine(reader)) != null) {
                list.add(name);
            }

        }
            //close reader file
            public void closeFile() {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        //create a function to return list of data
        public ArrayList<String> getList(){
            return list;
        }

}
