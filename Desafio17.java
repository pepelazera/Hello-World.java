package aulasjava01;
import java.util.Scanner;

public class Desafio17 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de valores inteiros que serão digitados: ");
        int N = sc.nextInt();

        int in = 0;
        int out = 0;

        for (int i = 1; i <= N; i++) {
            int x = sc.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            } else {
                out++;
            }
        }
        System.out.println(in + " inside");
        System.out.println(out + " outside");
    }
}
