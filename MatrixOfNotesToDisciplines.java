package Exercises;

import java.util.Scanner;

public class MatrixOfNotesToDisciplines {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        /*
            Crie um sistema que gerencie as notas de alunos em múltiplas
            disciplinas usando uma matriz bidimensional. O programa deve:

            Criar uma matriz double[][] notas de dimensão 4x3 (4 alunos, 3
            disciplinas)
                • Preencher a matriz com notas entre 0 e 10
                • Calcular a média de cada aluno (linha)
                • Calcular a média de cada disciplina (coluna)
                • Identificar o aluno com melhor desempenho geral
                • Identificar a disciplina com maior média
         */

        Double[][] notes = new Double[2][3];

        for (int i = 0; i < notes.length; i++) {
            for (int j = 0; j < notes[i].length; j++) {
                System.out.printf("Put the note[%d][%d]: ", i + 1, j + 1);
                notes[i][j] = sc.nextDouble();
            }
        }

        System.out.print("              |     Math      |  Physic       |   Chemical       |    Avg         |\n");
        System.out.println("-----------------------------------------------------------------------------------");
        for (int i = 0; i < notes.length; i++) {
            System.out.printf("Student %d: ",i + 1);

            double sum = 0.0;

            for (int j = 0; j < notes[i].length; j++) {
                System.out.printf("   |      %-6.2f", notes[i][j]);
                sum += notes[i][j];
            }

            double avg = sum / notes[i].length;

            System.out.printf("      |       %.2f      |\n", avg);
        }

        sc.close();
    }
}
