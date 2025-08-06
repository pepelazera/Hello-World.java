/*
    Enunciado:
    Crie um programa em Java que peça ao usuário para digitar quantos números quiser.
    A cada número digitado, o programa deve somar ao total geral.
    Quando o usuário responder que não quer continuar, o programa deve mostrar:

    A soma total dos números digitados

    A quantidade de números que foram digitados
 */

package aulasjava01;
import java.util.Scanner;

public class Desafio10 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        String resp;

        do {
            System.out.print("Digite um número: ");
            int num = keyboard.nextInt();

            soma += num;
            contador+=1;

            System.out.print("Deseja continuar ? (S/N): ");
            resp = keyboard.next();
        } while (resp.equals("s")); { // Lembre-se do "equal". A função dele é analisar o que está escrito DENTRO do objeto.
            System.out.printf("A soma dos valores digitados é %s.\n", soma);
            System.out.printf("A quantidade de números digitados foi %s.", contador);
        }
    }

}