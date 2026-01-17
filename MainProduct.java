package Aplications;

import Entities.Product2;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class MainProduct {

    public static void main(String[] args) {

        int id;
        String name;
        double price;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Product2> products2 = new ArrayList<>();

        System.out.print("How many products do you want to register ? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println();
            System.out.println("Product #" + (i + 1));

            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            name = sc.nextLine();

            System.out.print("Price: U$ ");
            price = sc.nextDouble();

            Product2 product2 = new Product2(id, name, price);

            products2.add(product2);
        }

        System.out.println();
        System.out.println("=== Product Information ===");
        for (Product2 product2 : products2) {
            System.out.println(product2);
        }

        while (true) {
            System.out.println();
            System.out.print("Put the Id of the product that you want to increase the price: ");
            int idPrice = sc.nextInt();

            Product2 product2 = products2.stream().filter(x -> x.getId() == idPrice).findFirst().orElse(null);

            if (product2 == null) {
                System.out.println("This Id doesn't exist! Try again: ");
            } else {
                System.out.print("Put the percentage do you want to increase: ");
                double percent = sc.nextDouble();
                product2.increasePrice(percent);
                break;
            }
        }

        System.out.println();
        System.out.println("=== Updated Product Information ===");
        for (Product2 product : products2) {
            System.out.println(product);
        }

        sc.close();
    }
}