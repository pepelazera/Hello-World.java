package aulasjava01;
import java.util.Scanner;

public class Aula14 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int mask = 32;

        if ((N & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}
