package ExerciseSection10;
import java.util.Locale;
import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int evenNumbers = 0;
        
        System.out.print("How many numbers do you want to write ? ");
        int n = sc.nextInt();

        int vect[] = new int[n];

        for(int i=0; i<vect.length; i++) {
            System.out.printf("Write the %s number: ", i+1);
            vect[i] += sc.nextInt();
        }

        System.out.println("Numbers: ");
        for(int i=0; i<vect.length;i++) {
            if (vect[i] % 2 == 0) {
                System.out.printf("%s  ",vect[i]);
                evenNumbers++;
            }

        }

        System.out.printf("\nEven numbers: %s", evenNumbers);

        sc.close();
    }
}
