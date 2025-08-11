package aulasjava01;
import java.util.Scanner;

public class Desafio16 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para contagem de ímpares: ");
        int x = sc.nextInt();

        System.out.print("Valores ímpares: ");
        for (int indice = 0; indice <= x; indice++) {
            if (indice % 2 != 0) {
                System.out.print(indice + "  ");
            }
        }
    }
}
