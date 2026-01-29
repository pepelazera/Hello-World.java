package Exercises;

/*
    Faça um programa para ler dois números inteiros M e N, e depois ler uma matriz e M linhas por N colunas contendo números inteiros, podendo haver repetições. (okay)
    Em seguida, ler um número X que pertence à matriz. (okay)
    Para cada ocorrência de X, mostrar os valores à esquerda, acima à direita e abaixo de X, quando houver, conforme exemplo.
 */

import java.util.Arrays;
import java.util.Scanner;

public class MatrixConstruction {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Put the value of M: ");
        int M = sc.nextInt();

        System.out.print("Put the value of N: ");
        int N = sc.nextInt();

        Integer[][] matrix = new Integer[M][N];

        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Put the value [%s][%s] of the matrix: ", (i + 1), (j + 1));
                matrix[i][j] = sc.nextInt();
            }
        }

        for (Integer[] value : matrix) {
            System.out.println(Arrays.toString(value));
        }

        System.out.print("Put some value that is in the matrix: ");
        int X = sc.nextInt();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (X == matrix[i][j]) {
                    System.out.printf("Position of value %s: line [%s], colum [%s]", matrix[i][j], (i + 1), (j + 1));

                    if (j > 0) {
                        System.out.printf("\nLeft: %s", matrix[i][j-1]); // If you want to find the left position, you need to less 1 of the index 'j'.
                    }

                    if (i > 0) {
                        System.out.printf("\nUp: %s", matrix[i-1][j]); // Now, that is what do you need to do to find the value is upside the 'X'
                    }

                    if (j < matrix[i].length - 1) {
                        System.out.printf("\nRight: %s", matrix[i][j+1]); // Here is a method if you want to find the number in the right. Only need to add 1 of the index 'j'.
                    }

                    if (i < matrix[i].length - 1) {
                        System.out.printf("\nDown: %s", matrix[i+1][j]); // And here is the method that you use to find the values is downside the 'X'.
                    }
                }
            }
        }

        System.out.println();

        sc.close();
    }
}

