/*
UCF COP3330 Summer 2021 Assignment 3 Solution
Copyright 2021 Ann Binus
*/
package oop.exercises.ex44;

public class Product {
    String name;
    String price;
    String quantity;

    //constructor for Product
    public Product(String name, String price, String quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //print data
    public String data() {
        return  "Name: " + name +
                "\nPrice: " + price +
                "\nQuantity: " + quantity;
    }
}
