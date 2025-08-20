package aulasjava01;
import java.util.Scanner;

public class Desafio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int valor1 = sc.nextInt();

        int calculoFatorial = calcularFatorial(valor1);
        System.out.printf("O valor de %s! é: %s", valor1, calculoFatorial);

        sc.close();
    }

    public static int calcularFatorial(int n) {
        int fatorial = 1;
        for(int i = 1; i <= n; i++) {
            fatorial *= i;
            if (i == 0) {
                i = 1;
            }
        }
        return fatorial;
    }
}

