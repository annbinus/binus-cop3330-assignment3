/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus

Exercise 43 - Website Generator

Programming languages can create files and folders too.

Create a program that generates a website skeleton with the following specifications:

Prompt for the name of the site.
Prompt for the author of the site.
Ask if the user wants a folder for JavaScript files.
Ask if the user wants a folder for CSS files.
Generate an index.html file that contains the name of the site inside the <title> tag and the author in a <meta> tag.

Example Output
Site name: awesomeco
Author: Max Power
Do you want a folder for JavaScript? y
Do you want a folder for CSS? y
Created ./website/awesomeco
Created ./website/awesomeco/index.html
Created ./website/awesomeco/js/
Created ./website/awesomeco/css/
The user should then find these files and directories created in the working directory of your program.

Challenges
Implement this in a scripting language on Windows, OSX, and Linux.
Implement this as a web application that provides the specified site as a zip file.
 */

package oop.exercises.ex43;

public class Exercise43 {
    public static void main(String[] args) {
        //prompt user about the site
        promptUser prompt = new promptUser();
        prompt.authorSiteName();
        boolean js= prompt.folderJS();
        boolean css = prompt.folderCSS();

        //create folders
        GenerateFiles folder = new GenerateFiles();
        System.out.print(folder.genWebsite(prompt.getSiteName()));
        System.out.print(folder.indexFile(prompt.getSiteName(), prompt.getAuthor()));
        System.out.println(folder.JSFile(prompt.getSiteName(), js));
        System.out.println(folder.CSSFile(prompt.getSiteName(), css));



    }
}
