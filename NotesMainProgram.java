package Aplications;

import Entities.Notes;

import java.util.Locale;
import java.util.Scanner;

public class NotesMainProgram extends Notes {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Notes notes = new Notes();

        double avg = 0;

        System.out.print("How many notes do you want to register ? ");
        notes.setN(sc.nextInt());

        double[] grades = new double[notes.getN()];

        notes.setBigger(grades[0]);
        notes.setSmaller(grades[0]);

        for (int i = 0; i < grades.length; i++) {
            System.out.print("Grade #" + (i+1) + ": ");
            grades[i] = sc.nextDouble();

            double total = grades[i];
            avg += total / notes.getN();
        }

        System.out.println("=== Total of grades ===");
        for (double grade : grades) {
            if (grade > avg) {
                System.out.println(grade);
            }

            if (grade > notes.getBigger()) {
                notes.setBigger(grade);
            }

            if (grade < notes.getSmaller()) {
                notes.setSmaller(grade);
            }
        }

        System.out.println();
        System.out.println("Biggest grade: " + notes.getBigger());
        System.out.println("Smallest grade: " + notes.getSmaller());
        System.out.printf("Average of grades: %.2f", avg);
    }
}
