package Aplications;

import java.util.Locale;
import java.util.Scanner;

public class BulletinProgram {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int students = 2;
        String[] disciplines = {"Math", "Phys", "Prog"};

        Double[][] notes = new Double[students][disciplines.length];
        Double[] lines = new Double[students];
        Double[] columns = new Double[disciplines.length];

        for (int i=0; i<notes.length; i++) {

            for (int j=0; j<notes[i].length; j++) {
                System.out.printf("Put the note[%s][%s] of student  %s: ", (i+1), (j+1), (i+1));
                notes[i][j] = sc.nextDouble();
            }
        }

        System.out.println();

        for (int i=0; i<notes.length; i++) {
            double sumStudents = 0.0;

            for (int j=0; j<notes[i].length; j++) {
                sumStudents += notes[i][j];
            }

            lines[i] = sumStudents / notes[i].length;
            System.out.printf("\nAverage notes of %so student: %.2f", (i+1), lines[i]);
        }

        System.out.println();

        for (int j=0; j<disciplines.length; j++) {
            double sumDisciplines = 0.0;

            for (int i=0; i<students; i++) {
                sumDisciplines += notes[i][j];
            }

            columns[j] = sumDisciplines / students;
            System.out.printf("\nAverage notes of %s discipline: %.2f", disciplines[j], columns[j]);
        }
        System.out.println();

        double bigger = notes[0][0];
        double smaller = notes[0][0];

        for (int i=0; i< notes.length; i++) {
            for (int j=0; j<notes[i].length; j++) {

                if (notes[i][j] > bigger) {
                    bigger = notes[i][j];
                }

                if (notes[i][j] < smaller) {
                    smaller = notes[i][j];
                }
            }
        }

        double wantedNumber = 0.0;

        System.out.println("\n=== Biggest number in the matrix ===");
        for (int i=0; i<notes.length; i++) {
            for (int j=0; j<notes[i].length; j++) {
                wantedNumber = notes[i][j];
                if (wantedNumber == bigger) {
                    wantedNumber = bigger;

                    System.out.printf("The biggest number (%s) was found in position: Line [%s] and Colum [%s] of the matrix", wantedNumber, (i+1), (j+1));
                }
            }
        }

        System.out.println();

        System.out.println();
        System.out.println("=== Biggest and smallest value of all disciplines ===");
        System.out.printf("Biggest note: %.2f", bigger);
        System.out.printf("\nSmallest note: %.2f", smaller);

        System.out.println("\n");
        System.out.print("           ");
        for (String discipline : disciplines) {
            System.out.print(discipline + "   ");
        }

        System.out.println();
        for (int i=0; i<notes.length; i++) {
            System.out.printf("Student %s: ", (i+1));
            System.out.print("[ ");

            for (int j=0; j<notes[i].length; j++) {
                System.out.print(notes[i][j] + "   ");
            }

            System.out.println("]");
        }

        sc.close();
    }
}
