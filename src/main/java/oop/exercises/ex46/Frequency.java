package oop.exercises.ex46;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Frequency {

    public String getInput(){
        String text = "";
        File file = new File("exercise46_input.txt");

        try {
            text = Files.readString(file.toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }

    public ArrayList<Word> addWord(String text){

        Scanner scan = new Scanner(text);

        ArrayList<Word> list = new ArrayList<Word>();

       while(scan.hasNext()){
           String word = scan.next();
           int count = 0;

           while(text.contains(word)){
               text = text.replaceFirst(word, "");
               count++;
           }

           Word w = new Word(word, count);
           list.add(w);
           scan = new Scanner(text);
       }
       scan.close();
       return list;
    }
}
