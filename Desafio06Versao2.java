/*
    Crie um programa em Java que:

    Solicite ao usuário três notas (de 0 a 10).

    Calcule a média aritmética das três notas.

    Com if/else, determine a situação do aluno:

    Média ≥ 7 → Aprovado

    Média ≥ 5 e < 7 → Recuperação

    Média < 5 → Reprovado

    Use um switch para associar a média a um conceito:

    A → média ≥ 9

    B → média ≥ 7 e < 9

    C → média ≥ 5 e < 7

    D → média ≥ 3 e < 5

    E → média < 3

    Exiba uma mensagem personalizada com base no conceito:

    Conceito A ou B → “Parabéns pelo ótimo desempenho!”

    Conceito C → “Você está na média, mas pode melhorar!”

    Conceito D ou E → “Dedique-se mais aos estudos!”
 */

package aulas;
import java.util.Scanner;

public class Desafio06Versao2 {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float nota1 = keyboard.nextFloat();

        System.out.print("Segunda nota: ");
        float nota2 = keyboard.nextFloat();

        System.out.print("Terceira nota: ");
        float nota3 = keyboard.nextFloat();

        float media = (nota1 + nota2 + nota3 ) / 3;
        System.out.printf("Sua média foi %.2f\n", media);

        if (nota1 > 10 || nota2 > 10 || nota3 > 10 || nota1 < 0 || nota2 < 0 || nota3 < 0) {
            System.out.println("Erro: notas devem estar entre 0 e 10.");
            return;
        } else if (media == 10) {
            System.out.println("Parabéns pelo ótimo resultado! Você ficou com média máxima!");
        } else if (media >= 7) {
            System.out.println("Parabéns pelo ótimo desempenho!");
        } else if (media >= 5 && media < 7) {
            System.out.println("Você está na média, mas pode melhorar!");
        }
        else {
            System.out.println("Você está de recuperação. Dedique-se mais aos estudos!");
        }
    }
}
