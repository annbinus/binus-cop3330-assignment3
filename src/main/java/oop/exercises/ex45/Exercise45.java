/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus

Exercise 45 - Word Finder

There will be times when you'll need to read in one file, modify it, and then write a modified version of that file to a new file.

Given an input file named `exercise45_input.txt`, read the file and look for all occurrences of the word utilize. Replace each occurrence with use. Write the modified file to a new file.

Example Output
Given the input file of

One should never utilize the word "utilize" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
utilizes an IDE to write her Java programs".
The program should generate

One should never use the word "use" in writing. Use "use" instead.
For example, "She uses an IDE to write her Java programs" instead of "She
uses an IDE to write her Java programs".

Constraints
Prompt for the name of the output file.
Write the output to a new file.

Challenges
Modify the program to track the number of replacements and report that to the screen when the program finishes.
Create a configuration file that maps “bad” words to “good” words and use this file instead of a hard-coded value.
Modify the program so it can handle every file a folder of files instead of a single file.

*/
package oop.exercises.ex45;

public class Exercise45 {
    public static void main(String[] args){
        replaceWord word = new replaceWord();

        //open and read input file
        String text = word.getFile();

        //Modify the input file with the word to replace
        text = word.replace(text);

        //Create a new file and write the modified file
        fileOutput writer = new fileOutput();
        writer.writeOut(text);
    }
}
