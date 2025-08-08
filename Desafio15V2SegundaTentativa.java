package aulasjava01;
import java.util.Scanner;

public class Desafio15V2SegundaTentativa {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.print("Digite a quantidade de valores que quer receber: ");
        int n = keyboard.nextInt();
        int n1 = (n-1);

        for (int i = 0; i <= n1; i++) {
            System.out.print("Digite um valor: ");
            int x = keyboard.nextInt();
            if (x >= 10 && x <= 20) {
                in++;
            }
            else {
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
