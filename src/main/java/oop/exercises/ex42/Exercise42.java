/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus

Exercise 42 - Parsing a Data File

Sometimes data comes in as a structured format that you have to break down and turn into records so you can process them. CSV, or comma-separated values, is a common standard for doing this.

Construct a program that reads in the following data file (you will need to create this data file yourself; name it `exercise42_input.txt`):

Ling,Mai,55900
Johnson,Jim,56500
Jones,Aaron,46000
Jones,Chris,34500
Swift,Geoffrey,14200
Xiong,Fong,65000
Zarnecki,Sabrina,51500
Process the records and display the results formatted as a table, evenly spaced, as shown in the example output.

Example Output
Last      First     Salary
--------------------------
Ling      Mai       55900
Johnson   Jim       56500
Jones     Aaron     46000
Jones     Chris     34500
Swift     Geoffrey  14200
Xiong     Fong      65000
Zarnecki  Sabrina   51500

Constraints
Write your own code to parse the data. Don't use a CSV parser.

Challenges
Make each column one space longer than the longest value in the column.
Format the salary as currency with dollar signs and commas.
Sort the results by salary from highest to lowest.
Rework your program to use a CSV parsing library and compare the results.
 */
package oop.exercises.ex42;


import java.io.BufferedReader;
import java.util.ArrayList;

public class Exercise42 {
    public static void main(String[] args) {

        readFile file = new readFile();

        //open file
        BufferedReader reader = file.openFile();

        //read and add each data to a list
        file.addLine(reader);

        //get list
        ArrayList<String> list = file.getList();



        printOutput print = new printOutput();
        //print data
        print.printList(list);

        //close input file
        file.closeFile();

    }
}
