/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus

Exercise 41 - Name Sorter

Alphabetizing the contents of a file, or sorting its contents, is a great way to get comfortable manipulating a file in your program.

Create a program that reads in the following list of names from a file called `exercise41_input.txt` and sorts the list alphabetically:

Ling, Mai
Johnson, Jim
Zarnecki, Sabrina
Jones, Chris
Jones, Aaron
Swift, Geoffrey
Xiong, Fong
Then print the sorted list to a file called `exercise41_output.txt` that looks like the following example output.

Example Output
Total of 7 names
-----------------
Johnson, Jim
Jones, Aaron
Jones, Chris
Ling, Mai
Swift, Geoffrey
Xiong, Fong
Zarnecki, Sabrina

Constraint
Don't hard-code the number of names.
Challenges
Implement this program by reading in the names from the user, one at a time, and printing out the sorted results to a file.
Use the program to sort data from a large data set (e.g. census data) and use a profiler to analyze its performance.

*/
package oop.exercises.ex41;


import java.io.IOException;
import java.util.ArrayList;

public class Exercise41 {


    public static void main(String[] args) throws IOException {

        //Create a class to read file and add names
        readFile file = new readFile();
        file.openFile();
        file.addName();
        ArrayList<String> list = file.getList();


        //Create a class to print the names
        sortNames sort = new sortNames();
        sort.getList(list);
        ArrayList<String> newSortedList = sort.sortList();

        //print list table
        sort.printList(newSortedList);

    }

}
