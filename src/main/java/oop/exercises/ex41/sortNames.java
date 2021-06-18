/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex41;

import java.util.ArrayList;
import java.util.Collections;

public class sortNames {

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
    public void printList(ArrayList<String> newList){
        String result = "Total of " + newList.size() + " names\n" + "-----------------\n";

        for (String s : newList) {
            result += s + "\n";
        }
        System.out.print(result);
    }

}
