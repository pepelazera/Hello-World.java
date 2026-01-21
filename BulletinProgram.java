package Aplications;

import java.util.Scanner;

public class BulletinProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] disciplines = {"Math", "Physic", "Programming"};
        Integer students = 4;
        Double noteLines = 0.0;
        Double noteColumns = 0.0;

        Double[][] notes = new Double[2][3];

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                System.out.printf("Note #%s, Discipline #%s: ", (i + 1), (j + 1));
                notes[i][j] = sc.nextDouble();
            }
        }

        System.out.print("            ");
        for (String discipline : disciplines) {
            System.out.print(discipline + "  ");
        }

        System.out.println();
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            System.out.print("[ ");
            for (int j = 0; j < notes[i].length; j++) {
                System.out.print(notes[i][j] + "    ");
            }
            System.out.println("]");
        }

        sc.close();
    }
}

