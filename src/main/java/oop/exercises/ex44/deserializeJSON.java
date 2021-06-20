/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex44;

import com.google.gson.*;

import java.io.*;
import java.util.*;

public class deserializeJSON {

    //create a function to return list of products
    public static List<Product> getData() {

        File file = new File("input/exercise44_input.json");

        //create List of products
        List<Product> products = null;
        try {
            JsonElement fileElement = JsonParser.parseReader(new FileReader(file));
            JsonObject fileObject = fileElement.getAsJsonObject();

            //create JsonArray
            JsonArray jsonArrayOfProducts = fileObject.get("products").getAsJsonArray();
            products = new ArrayList<>();

            //loop through the array to add each product
            for (JsonElement productElement : jsonArrayOfProducts) {

                JsonObject productJsonObject = productElement.getAsJsonObject();

                //Extract data
                String name = productJsonObject.get("name").getAsString();
                String price = productJsonObject.get("price").getAsString();
                String quantity = productJsonObject.get("quantity").getAsString();

                //Add each product to the list
                Product product = new Product(name, price, quantity);
                products.add(product);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return products;
    }
}
