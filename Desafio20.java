package aulasjava01;
import java.util.Scanner;

public class Desafio20 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("ERRO! Não é possível calcular o fatorial de um número negativo.");
        }

        int fat = 1;
        for (int i = 1; i <= n; i++) {
            fat *= i; // enquanto o i não alcançar o valor de n, ele não para de multiplicar
            if (i == 0) {
                i = 1;
            }
        }
        System.out.println(fat);
    }
}
