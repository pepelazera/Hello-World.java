package Aplications;

import Entities.Bulletin;

import java.util.Scanner;

public class BulletinProgram {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] disciplines = {"Math", "Physic", "Programming"};
        int students = 4;
        Double[] noteLines = new Double[0];
        Double[] noteColumns = new Double[0];

        Double[][] notes = new Double[2][3];

        Bulletin bulletin = new Bulletin(disciplines, students, notes);

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                System.out.printf("Note #%s, Discipline #%s: ", (i + 1), (j + 1));
                notes[i][j] = sc.nextDouble();

                Bulletin blt = new Bulletin();

            }
        }

        System.out.println();
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

    public static Double avgNotes(Double[][] notes, Double[] notesLines, Double[] noteColumns) {
        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                notesLines = notes[i];
                noteColumns = notes[j];
            }
        }
        return null;
    }
}
