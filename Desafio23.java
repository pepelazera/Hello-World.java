/*
    calcularFatorial(int numero): Recebe um número inteiro não negativo e retorna o seu fatorial. O fatorial de um número inteiro positivo n é o produto de todos os inteiros positivos menores ou iguais a n. O fatorial de 0 é 1.

    No método main, peça ao usuário para inserir um número e exiba o seu fatorial. Certifique-se de tratar casos de entrada inválida (números negativos).
 */

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
