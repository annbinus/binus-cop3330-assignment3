/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex43;

import java.util.Scanner;

public class promptUser {

    private Scanner scan = new Scanner(System.in);
    public String siteName;
    public String author;

    //ask author for site name and their name
    public void authorSiteName(){
        System.out.print("Site name: ");
        siteName = scan.nextLine();

        System.out.print("Author: ");
        author = scan.nextLine();
    }

    //ask if they want folder for JS
    public boolean folderJS(){
        System.out.print("Do you want a folder for JavaScript? ");
        String answer = scan.nextLine();
        return (answer.equals("y") || answer.equals("Y"));
    }

    //ask if they want folder for CSS
    public boolean folderCSS(){
        System.out.print("Do you want a folder for CSS? ");
        String answer = scan.nextLine();
        return (answer.equals("y") || answer.equals("Y"));
    }

    public String getSiteName(){
        return siteName;
    }

    public String getAuthor(){
        return author;
    }
}
