package Exercicios;
import java.util.Scanner;
import java.util.Locale;

public class ExHeightUdemy {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n, nUnder;
        double totalHeight, avgHeight, percentUnder16;

        System.out.print("How many people do you want to register ? ");
        n = sc.nextInt();

        String[] names = new String[n];
        int[] ages = new int[n];
        double[] heights = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("%so. person information: \n", i + 1);

            System.out.print("Name: ");
            names[i] = sc.next();

            System.out.print("Age: ");
            ages[i] = sc.nextInt();

            System.out.print("Height: ");
            heights[i] = sc.nextDouble();
        }

        nUnder = 0;
        totalHeight = 0;

        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                nUnder++;
            }
            totalHeight += heights[i];
        }

        avgHeight = totalHeight / n;
        percentUnder16 = ((double) nUnder / n) * 100.0;

        System.out.printf("\nAverage Height: %.2f\n", avgHeight);
        System.out.printf("People under 16 years old: %.1f%%\n", percentUnder16);

        for (int i = 0; i < n; i++) {
            if (ages[i] < 16) {
                System.out.printf("%s\n", names[i]);
            }
        }

        sc.close();
    }
}