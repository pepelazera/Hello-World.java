package ExerciseSection10;
import java.util.Locale;
import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values do you will write ? ");
        int n = sc.nextInt();

        float vect[] = new float[n];

        float sum = 0;
        float avg = 0;

        // Save values
        for (int i=0; i<vect.length; i++) {
            System.out.print("Write a number: ");
            vect[i] = sc.nextFloat();

        }


        // The sum
        for (int i=0; i<vect.length; i++) {
            sum += vect[i];

        }

        // The average
        for (int i=0; i<vect.length; i++) {
            avg += vect[i]/n;

        }

        System.out.print("\nValues: ");
        for (int i=0; i<vect.length; i++) {
            System.out.printf(" '%s' ", vect[i]);

        }

        System.out.printf("\nThe sum of all the numbers are: %.2f%n",sum);
        System.out.printf("The average of all the numbers are: %.2f%n",avg);

    }
}
