/*
    Leia um valor inteiro N. Este valor será a quantidade de valor inteiros X que serão lidos em seguida. (feito)
    Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
    essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).
 */


package aulasjava01;
import java.util.Scanner;

public class Desafio17V2 {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores que serão lidos: ");
        int x = sc.nextInt(); // Quantidade de valores que serão lidos no looping
        int ins = 0; // Onde serão armazenados os números que estão dentro do intervalo [10,20]
        int out = 0; // Onde serão armazenados os números que estão fora

        for (int i = 1; i <= x; i++) { // Looping no qual o i vai de 1 até o número que foi digitado pelo usuário (nesse caso o valor X)
            System.out.print("Digite o valor: ");
            int v = sc.nextInt();
            if (v >= 10 && v <= 20) {
                ins++;
            }
            else {
                out++;
            }
        }
        System.out.println(ins + " inside");
        System.out.println(out + " outside");
    }
}
