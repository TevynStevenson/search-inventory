package com.pluralsight;

//Import methods
import java.util.*;
import java.io.*;
import java.util.ArrayList;


//public class Inventory {

    //Will need to code the getInventory() method and create an initial inventory
    //Create it in an array list
    //Construct the list
    //Add getters/setters for products

    //Initialize ArrayList
    //ArrayList<Inventory> products = new ArrayList<Inventory>();

    //Add 5 items to the array list

    //Initialize parts of products
    //Construct productId + nameOfItem + price
    //int productId;
    //String nameOfItem;
    //Double price;

    //public Inventory(int productId, String nameOfItem, Double price) {
        //this.productId = productId;
        //this.nameOfItem = nameOfItem;
        //this.price = price;
    //}

    //Product Id Get/Set
    //public int getProductId() {
       // return productId;
    //}

    //public void setProductId(int productId) {
        //this.productId = productId;
    //}

    //Name of item Get/Set
    //public String getNameOfItem() {
        //return nameOfItem;
    //}

    //public void setNameOfItem(String nameOfItem) {
        //this.nameOfItem = nameOfItem;
    //}

    //Price Get/Set
    //public Double getPrice() {
        //return price;
    //}

    //public void setPrice(Double price) {
        //this.price = price;
    //}
//}


// Bonus for assignment
// Replace the code that loaded the ArrayList with inventory.csv code
// Initialize FileReader first
//Initialize BufferedReader second
//Split items by \\|
//Add object to the arraylist


//To import scanner
// To import FileWriter and Buffered Writer

public class Inventory{
    static ArrayList<Inventory> products = new ArrayList<Inventory>();

//Set variables
int productId;
String nameOfItem;
Double price;

    //Getter/Setter for product id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    //Getter/Setter for product name
    public String getNameOfItem() {
        return nameOfItem;
    }

    public void setProductName(String productName) {
        this.nameOfItem = productName;
    }

    //Getter/Setter for product price
    public Double getPrice() {
        return price;
    }

    public void setProductPrice(Double productPrice) {
        this.price = productPrice;
    }

    //Generate constructor for ProductId | ProductName | ProductPrice
    public Inventory(int productId, String productName, Double productPrice) {
        this.productId = productId;
        this.nameOfItem = productName;
        this.price = productPrice;

        //Initialize addProduct


    }
}