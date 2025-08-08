package aulasjava01;
import java.util.Scanner;

public class Desafio15V2 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Digite uma quantidade: ");
        int n = keyboard.nextInt();
        int n1 = (n - 1);

        int contIn = 0;
        int contOut = 0;


        for (int i = 0; i <= n1; i++){
            System.out.print("\nDigite um valor: ");
            int x = keyboard.nextInt();
            if (x >= 10 && x <= 20) {
                contIn++;
            }
            else {
                contOut++;
            }
        }
        System.out.println(contIn + " in");
        System.out.println(contOut + " out");

        keyboard.close();
    }
}
