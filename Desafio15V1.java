package aulasjava01;
import java.util.Scanner;

public class Desafio15V1 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int x;
        System.out.print("Digite um valor: ");
        int y = keyboard.nextInt();

        for (x = 1; x <= y; x++) {
            if (x % 2 != 0) {
                System.out.println(x);
            }
        }
    }
}
