package Section10;
import java.util.Scanner;
import java.util.Locale;

public class VectPart2 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many products do you wanna register ? ");
        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int i=0; i<n; i++) {
            System.out.print("Product name: ");
            String name = sc.nextLine();
            sc.nextLine();

            System.out.print("Product price: ");
            double price = sc.nextDouble();
            vect[i] = price;

            System.out.println();
        }

        double sumPrice = 0;

        for (int i=0; i<n; i++) {
            sumPrice += vect[i];

        }

        double avg = sumPrice / n;
        System.out.printf("\nAverage Price: U$%.2f%n", avg);

        sc.close();
    }
}
