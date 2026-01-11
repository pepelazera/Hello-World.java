package Exercises;

import java.util.Locale;
import java.util.Scanner;

public class SistemOfNotes {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double avg = 0;

        System.out.print("How many notes do you want to register ? ");
        int n = sc.nextInt();

        double[] notes = new double[n];


        for (int i = 0; i < notes.length; i++) {
            System.out.print("Note #" + (i+1) + ": ");
            notes[i] = sc.nextDouble();

            double totalGrade = notes[i];
            avg += totalGrade / notes.length;
        }

        double bigger = notes[0];
        double smaller = notes[0];

        System.out.println();
        System.out.println("=== Total grades within the average ===");
        for (Double note : notes) {
            if (note > bigger) {
                bigger = note;
            }

            if (note < smaller) {
                smaller = note;
            }

            if (note > 7) {
                System.out.println(note);
            }
        }

        System.out.println();
        System.out.println("Bigger grade: " + bigger);
        System.out.println("Smaller grade: " + smaller);
        System.out.printf("Average of the grades: %.2f", avg);
    }
}
