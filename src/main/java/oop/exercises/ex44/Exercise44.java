/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex44;

import java.util.List;
import java.util.Scanner;

public class Exercise44 {

    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        String product;

        System.out.print("What is the product name? ");
        product = scan.nextLine();

        //get list of products
        deserializeJSON check = new deserializeJSON();
        List<Product> list = check.getData();

        int flag=0;

        //check for the asked product
        while(flag==0)
        {
            //find the object which contains the product
           for(Product a : list) {
               if (a.getName().equals(product)) {
                   System.out.println(a.data());
                   flag = 1;
               }
           }
           //if not found, prompt the user again
           if(flag==0){
               System.out.print("Sorry, that product was not found in our inventory.");
               product = scan.nextLine();
           }
       }
    }
}
