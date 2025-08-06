/*
    Desafio – Média de idades usando do…while

    Escreva um programa em Java que leia várias idades informadas pelo usuário e calcule a média das idades informadas. O programa deve cumprir os seguintes requisitos:

    Entrada em loop: O programa deve solicitar ao usuário que digite uma idade. Logo em seguida, pergunte se ele deseja
    continuar inserindo idades (respostas “S” para sim ou “N” para não), semelhante ao exemplo apresentado em aula
    raw.githubusercontent.com

    Estrutura do…while: Utilize um bloco do…while para garantir que ao menos uma idade seja lida; o laço deve continuar enquanto a resposta do usuário for “S” (ignorando maiúsculas/minúsculas).

    Cálculo da média: Armazene as idades em um acumulador e contabilize a quantidade de entradas. Após o usuário informar que não deseja continuar, calcule e exiba a média das idades digitadas.

    Saída: Mostre no final a média das idades informadas com uma mensagem amigável, por exemplo: “A média das idades informadas é X anos.”
 */

package aulasjava01;
import java.util.Scanner;

public class Desafio09 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int num, media, contador = 0;
        int sm = 0;
        String resp;


        do {
            contador+=1;

            System.out.print("Digite uma idade: ");
            num = keyboard.nextInt(); // Sem nextLine() pois iremos tratar de números inteiros
            sm += num;

            System.out.print("Deseja continuar ? (S/N): ");
            resp = keyboard.next();
        } while (resp.equals("s")); {
            media = sm / contador;
            System.out.println("A média das idades é aproximadamente "+ media);
            return;
        }
    }
}
