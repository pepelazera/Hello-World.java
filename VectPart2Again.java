package Section10;
import java.util.Locale;
import java.util.Scanner;
import Section10.Product;

public class VectPart2Again {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("How many products do you want to buy ? ");
        int n = sc.nextInt();
        Product[] vect = new Product[n];

        for (int i=0; i<vect.length; i++) { // vect.length is the quantities of elements in the vect
            sc.nextLine();
            System.out.print("Product name: ");
            String name = sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();

            vect[i] = new Product(name, price);

            System.out.println();
        }

        double sum = 0.0;

        for (int i=0; i<vect.length; i++) {
            sum += vect[i].getPrice();
        }

        double avg = sum / vect.length;

        System.out.printf("\nAverage Price: U$%.2f%n", avg);

        sc.close();
    }
}
