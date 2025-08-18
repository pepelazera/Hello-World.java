package aulasjava01;

import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int higher = max(a, b, c);

        showResults(higher);

        sc.close();
    }

    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        }
        else if (y > z){
            aux = y;
        }
        else {
            aux = z;
        }
        return aux;
    }

    public static void showResults(int value) {
        System.out.println("Higher = "+ value);
    }

}
