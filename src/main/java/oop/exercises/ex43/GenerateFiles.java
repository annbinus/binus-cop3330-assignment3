/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
 */
package oop.exercises.ex43;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class GenerateFiles {

     promptUser user = new promptUser();
    String path = new File("").getAbsolutePath();


    //function to create a new file and directory
    public void makeFile(String path){
        try {

            Path p = Paths.get(path);

            //java.nio.file.Files;
            Files.createDirectories(p);

        } catch (IOException e) {
            System.err.println("Failed to create directory!" + e.getMessage());
        };
    }

    //create website
    public void genWebsite(String name){
        makeFile(path + "/" + name);
        System.out.print("Created ./" + name + "\n");
    }

    //generate a JS file if needed
    public void JSFile(String name, boolean js){
        if(js){
            makeFile(path+ "/" + name +"/js");
            System.out.print("Created ./" + name + "/js/\n");
        }
    }

    //generate a CSS file if needed
    public void CSSFile(String name, boolean css){
        if(css){
            makeFile(path + "/"+ name+"/css");
            System.out.print("Created ./" + name + "/css/\n");
        }
    }

    //Generate an index file
    public void indexFile(String name, String author){
        GenerateHTML index = new GenerateHTML();
        index.writeHTML(path +"/" + name + "/index.html", name, author);
        System.out.print("Created ./" + name + "/index.html\n");
    }
}
