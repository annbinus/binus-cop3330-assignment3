/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex42;

import java.util.ArrayList;

public class printOutput {


    //split the data
    public String[] splitData(String data){
        String[] row = data.split(",");
        return row;
    }

    //print on output file
    public void printList(ArrayList<String> list){

        System.out.print("Last      First     Salary\n--------------------------\n");

        for (String id: list) {
            String[] row = splitData(id);
            for (String a: row) {
                System.out.format("%-10s", a);
            }
            System.out.print("\n");
        }
    }

}
