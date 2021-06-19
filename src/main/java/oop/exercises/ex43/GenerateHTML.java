package oop.exercises.ex43;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHTML {
    public void writeHTML(String path, String siteName, String author){
        try {
            BufferedWriter br = new BufferedWriter(new FileWriter(path));
            br.write("\n" +
                    "<!DOCTYPE html>\n" +
                    "<html>\n" +
                    "<head>\n"+
                    "<title>"+siteName+"</title>\n"+
                    "<meta name=\"author\" content=\""+author+"\">\n"+
                    "</head>\n"+
                    "<body>\n" +
                    "<h1>My First Heading</h1>\n" +
                    "</body>\n" +
                    "</html>\n");

            br.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
