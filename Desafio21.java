/*
Desafio 1: Calculadora Simples

Crie um programa em Java que contenha as seguintes funções:

1.
somar(int a, int b): Recebe dois números inteiros e retorna a soma deles.

2.
subtrair(int a, int b): Recebe dois números inteiros e retorna a subtração deles.

3.
multiplicar(int a, int b): Recebe dois números inteiros e retorna a multiplicação deles.

4.
dividir(int a, int b): Recebe dois números inteiros e retorna a divisão deles. Considere o caso de divisão por zero.

No método main, peça ao usuário para inserir dois números e uma operação (soma, subtração, multiplicação ou divisão). Chame a função apropriada e exiba o resultado.


 */

package maratonajava;
import java.util.Scanner;

public class Desafio21 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        int a = sc.nextInt();
        System.out.println("Digite o valor de b: ");
        int b = sc.nextInt();

        int sum1 = sums(a, b);
        int sub1 = subs(a, b);
        int mult1 = multis(a, b);
        int div1 = div(a, b);

        System.out.printf("A soma dos dois valores é %s\n", sum1);
        System.out.printf("A subtração dos dois valores é %s\n", sub1);
        System.out.printf("A multiplicação dos dois valores é %s\n", mult1);
        System.out.printf("A divisão dos dois valores é %s\n", div1);

    }

    public static int sums(int x, int y) {
        int sum;
        sum = x + y;
        return sum;
    }

    public static int subs(int x2, int y2) {
       int sub;
       sub = x2 - y2;
       return sub;
    }

    public static int multis(int x3, int y3) {
        int mult;
        mult = x3 * y3;
        return mult;
    }

    public static int div(int x4, int y4) {
        int div;
        div = x4 / y4;
        return div;
    }
}
