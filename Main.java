package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Product p = new Product();

        int count = 0;
        double total = 0.0;
        int n;

        System.out.print("How many foods do you want to put ? ");
        n = sc.nextInt();

        Product[] products = new Product[n];

        for(int i=0; i< products.length;i++) {
            System.out.print("Product code: ");
            p.setCode(sc.nextInt());
            sc.nextLine();

            System.out.print("Product name: ");
            p.setName(sc.nextLine());

            System.out.print("Product price: ");
            p.setPrice(sc.nextDouble());

            System.out.print("Product amount: ");
            p.setAmount(sc.nextInt());

            System.out.println();
            System.out.println(p.toString());

            System.out.println();
        }

        System.out.printf("\nTotal price: U$ %.2f", p.ValueOnStock());
        sc.close();
    }
}
