package com.pluralsight;

import java.util.*;
import java.io.*;

public class InventoryApp {

    public static void main(String[] args) {

        // Load CSV before opening the menu
        loadInventory();

        // Start application
        optionsMenu();
    }

    // Load products from CSV
    public static void loadInventory() {

        //Add try statement to read from FileReader/BufferedReader
        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            //Add while loop to run into there are no more products
            while ((line = bufferedReader.readLine()) != null) {

                //Split the products by the Pipe(|)
                String[] lineSplit = line.split("\\|");

                //Have to parse int and double
                //Because they arent Strings so must convert
                int productId = Integer.parseInt(lineSplit[0]);
                String productName = lineSplit[1];
                double productPrice = Double.parseDouble(lineSplit[2]);

                //Initialize new inventory for added products
                Inventory addedProduct = new Inventory(
                        productId, productName, productPrice
                );

                Inventory.products.add(addedProduct);
            }

           //Close the BufferedReader!!
            bufferedReader.close();

           //Catch the end of the try
           //FileNotFoundException if the file cannot be found
           //Io exception if the file cannot be written into
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());

        }
    }

    // Main menu
    public static void optionsMenu() {

       //Add scanner system
        Scanner myScanner = new Scanner(System.in);

        //Add boolean AppRunning to keep the options menu running with the while loop
        boolean appRunning = true;
        //While loop to go along with the boolean statement
        while (appRunning) {

            System.out.println("Welcome To The Inventory App");
            System.out.println("What would you like to do?\n" +
                    "1. List All Products\n" +
                    "2. Lookup Item by Id\n" +
                    "3. Lookup Item by Price\n" +
                    "4. Add New Product\n" +
                    "5. Exit");

            int command = myScanner.nextInt();

            //Insert switch statements for options menu
            //1. ListAllProducts
            //2. Lookup product by ID
            //3 Lookup item by price (coming soon)
            //4 Adding a new product
            //5 exiting the app
            //Default if invalid
            switch (command) {

                case 1:
                    listAllProducts(Inventory.products);
                    break;

                case 2:
                    lookUpProduct();
                    break;

                case 3:
                    System.out.println("Price lookup coming soon.");
                    break;

                case 4:
                    addNewProduct();
                    break;

                case 5:
                    System.out.println("Exiting The Inventory App");
                    appRunning = false;
                    break;

                default:
                    System.out.println("Invalid selection.");
            }
        }
    }

    // Display all products
    public static void listAllProducts(ArrayList<Inventory> products) {

        System.out.println("|========= Full Inventory =========|");

        for (Inventory product : products) {

            System.out.println(
                    product.getProductId() + " " +
                            product.getNameOfItem() + " " +
                            product.getPrice()
            );
        }
    }

    // Look up product by ID
    public static void lookUpProduct() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product ID (0 to exit):");

        int productId = scanner.nextInt();

        for (Inventory product : Inventory.products) {

            if (product.getProductId() == productId) {

                System.out.println("Product Name: " +
                        product.getNameOfItem());

                System.out.println("Total Price: " +
                        product.getPrice());

                return;
            }
        }

        if (productId != 0) {
            System.out.println("Product not found.");
        }
    }

    // Add new products
    public static void addNewProduct() {

        Scanner scanner = new Scanner(System.in);

        boolean appRunning = true;

        while (appRunning) {

            System.out.println("Enter Product ID (0 to exit):");

            int productId = scanner.nextInt();

            if (productId == 0) {
                break;
            }

            scanner.nextLine();

            System.out.println("Enter Product Name:");

            String productName = scanner.nextLine();

            System.out.println("Enter Product Price:");

            double productPrice = scanner.nextDouble();

            Inventory addedProduct = new Inventory(
                    productId, productName, productPrice
            );

            Inventory.products.add(addedProduct);

            System.out.println("Product Successfully Added!");

            System.out.println("Total Products: " +
                    Inventory.products.size());
        }
    }

    public static void lookUpProductByPrice() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Price Range: (0 to exit):");

        double price = scanner.nextInt();

        for (Inventory product : Inventory.products) {

            if (product.getPrice() >= 100) {

                System.out.println("Product Name: " +
                        product.getNameOfItem());

                System.out.println("Total Price: " +
                        product.getPrice());

                return;
            } else if (product.getPrice() <= price) {
            }
        }

        if (price != 0) {
            System.out.println("Product not found.");
        }
    }
}















