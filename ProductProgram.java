package Aplications;

/*
The New Scenario: Inventory Control Instead of complex employees, let's manage Products. The goal is to increase the price of a specific item in the inventory. Challenge requirements:
    1. Product Class: Must have id (Integer), name (String), and price (Double). (okay)
    2. Encapsulation: The price field must be private. Create a method increasePrice(double percentage) to change it. (okay)
    3. The List: Create an ArrayList to store N products. (okay)
    4. The Operation: Ask the user for an ID. If the ID exists in the list, apply a 10% increase. If it does not exist, warn: "ID not found". (okay)
*/

import Entities.Product;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class ProductProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id;
        String name;
        double price;

        List<Product> products = new ArrayList<>();

        System.out.print("How many products do you want to register ? ");
        int n = sc.nextInt();

        for (int i=0; i<n; i++) {

            System.out.printf("\nProduct #%s: \n", (i+1));

            System.out.print("Id: ");
            id = sc.nextInt();
            while (hasId(products, id)) {
                System.out.print("This id already exist! Try again: ");
                id = sc.nextInt();
            }
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Price: U$ ");
            price = sc.nextDouble();

            Product product = new Product(id, name, price);

            products.add(product);
        }

        System.out.println();
        System.out.println("=== Product details ===");
        for (Product product1 : products) {
            System.out.println(product1);
            System.out.println();
        }

        while (true) {

            System.out.print("Enter the product id that will have salary increase: ");
            int increasedId = sc.nextInt();

            Product prod = products.stream().filter(x -> x.getId() == increasedId).findFirst().orElse(null);

            if (prod == null) {
                System.out.print("This id doesn't exist! Please, put a existent id: ");
            } else {
                System.out.print("Enter the percentage: ");
                double percent = sc.nextDouble();
                prod.increasePrice(percent);
                break;
            }
        }

        System.out.println();
        System.out.println("=== Product details ===");
        for (Product p : products) {
            System.out.println(p);
            System.out.println();
        }

        sc.close();
    }

    public static Integer position(List<Product> products, int id) {
        for (int i=0; i<products.size(); i++) {
            if (products.get(i).getId() == id) {
                return i;
            }
        }
        return null;
    }

    public static Boolean hasId(List<Product> products, int id){
        Product prod = products.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
        return prod != null;
    }
}
