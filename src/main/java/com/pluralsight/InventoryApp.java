package com.pluralsight;

//Import methods

import java.util.*;
import java.io.*;
import java.util.ArrayList;;


public class InventoryApp {

    public static void main(String[] args) {
        //Main Class
        //Keep it clean
        //Add majority of work into other methods, then call those methods to the main method

        getInventory();

    }

    //Other methods
    //To be run in the main method when finished

    //Start with a method that gets the inventory from the array list
    //Add add .length method to see length of inventory just in case

    //Create an arraylist that will hold 5 values right now


    public static void getInventory() {




        //Create list of items

        //List the 5 products
        Inventory product1 = new Inventory(100, "PlayStation Portable (Psp)", 89.99);
        Inventory product2 = new Inventory(200, "Nintendo Switch", 169.99);
        Inventory product3 = new Inventory(300, "Wii", 74.99);
        Inventory product4 = new Inventory(400, "PlayStation 5 Pro", 399.99);
        Inventory product5 = new Inventory(500, "Nintendo GameCube", 119.99);

        //Number the products for the list
        Inventory[] products = new Inventory[5];
        products[0] = product1;
        products[1] = product2;
        products[2] = product3;
        products[3] = product4;
        products[4] = product5;


        Scanner myScanner = new Scanner(System.in);




        //Add while statement
        boolean appRunning = true;
        while (appRunning) {

            //Welcome message
            System.out.println("Welcome To The Inventory App");
            System.out.println("What would you like to do?\n" +
                    "1. List All Products\n" +
                    "2. Exit Program");


            //Store the answer
            int command = myScanner.nextInt();
            switch (command) {
                case 1:
                    listAllProducts(products);
                    break;
                case 2:
                    System.out.println("Exiting The Inventory App");
                    appRunning = false;
                    break;
            }

        }


    }

    //Add welcome message
    //Create method for listing all of the products
    public static void listAllProducts(Inventory[] product) {
        System.out.println("|========= Full Inventory =========|");
        System.out.println(product[0].getProductId() + " " + product[0].getNameOfItem() + " " + product[0].getPrice());
        System.out.println(product[1].getProductId() + " " + product[1].getNameOfItem() + " " + product[1].getPrice());
        System.out.println(product[2].getProductId() + " " + product[2].getNameOfItem() + " " + product[2].getPrice());
        System.out.println(product[3].getProductId() + " " + product[3].getNameOfItem() + " " + product[3].getPrice());
        System.out.println(product[4].getProductId() + " " + product[4].getNameOfItem() + " " + product[4].getPrice());
    }


    //Create a method for welcome message
    public static void welcomeApp(Scanner myScanner) {
        myScanner = new Scanner(System.in);
        System.out.print("Welcome to Inventory App\n" +
                "What would you like to do?");
        myScanner.nextLine();

    }



//End curly brace end entire class method
}












