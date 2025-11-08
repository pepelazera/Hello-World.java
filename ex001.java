package ExerciseSection10;
import java.util.Scanner;
import java.util.Locale;

public class ex001 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many values do you will write ? ");
        int n = sc.nextInt();

        int[] vect = new int[n];


        for (int i=0; i<vect.length; i++) {

            System.out.printf("\nWrite the %so. number: ", i+1);
            vect[i] += sc.nextInt();
        }

        for (int i=0; i<vect.length; i++) {

            if (vect[i]<0) {
                System.out.printf("\nNumber: %s",vect[i]);

            }
        }



        sc.close();
    }
}
