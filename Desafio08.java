/*
    Desafio 08: Contador até Número Positivo

    Peça ao usuário para digitar um número inteiro positivo.

    Use um laço while para contar de 1 até esse número, pulando os números múltiplos de 4 com continue.

    Exiba os números na tela.

    Se o usuário digitar um número negativo ou zero, mostre uma mensagem de erro e pare o programa com break.
 */

package aulasjava01;
import java.util.Scanner;

public class Desafio08 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int c = 1;
        String cont = " ";

        System.out.print("Digite um número inteiro positivo: ");
        int num = keyboard.nextInt();

        if (num <= 0) {
            System.out.println("ERRO: Não é permitido digitar números negativos e nem zero.");
            return;
        }
        while (c <= num) {
            if (c % 4 == 0) {
                c++;
                continue;
            } else {
                cont += c + " ";
                c++;
            }
        }
        System.out.println(cont);
    }
}
