package oop.exercises.ex43;

import java.io.File;

public class GenerateFiles {

    private promptUser user = new promptUser();
    String path = new File("/src/main/java/oop/exercises/ex43/").getAbsolutePath();


    //function to create a new file and directory
    public void makeFile(String path){
        File file = new File(path);
        file.mkdir();
    }

    //create website
    public void genWebsite(){
        makeFile(path + "/" + user.getSiteName());
        System.out.print("Created ./" + user.getSiteName() + "/css/");
    }

    //generate a JS file if needed
    public void JSFile(){
        if(user.folderJS()){
            makeFile(path + user.getSiteName()+"/js");
            System.out.print("Created ./" + user.getSiteName() + "/js/");
        }
    }

    //generate a CSS file if needed
    public void CSSFile(){
        if(user.folderCSS()){
            makeFile(path + user.getSiteName()+"/css");
            System.out.print("Created ./" + user.getSiteName() + "/css/");
        }
    }

    //Generate an index file
    public void indexFile(){
        GenerateHTML index = new GenerateHTML();
        index.writeHTML(path +"/" + user.getSiteName() + "/index.html", user.getSiteName(), user.getAuthor());
        System.out.println("Created ./" + user.getSiteName());
    }
}
