package aulasjava01;/*
1.
Receber um número inteiro positivo: Peça ao usuário para digitar um número inteiro positivo (maior que zero).
Este número representará o total de espécies que você precisa catalogar. (Feito)

2.
Contagem Progressiva: Utilizando um laço de repetição (for ou while),
faça o programa exibir uma contagem progressiva, de 1 até o número digitado pelo usuário.
A cada número, exiba a mensagem: "Catalogando espécie [número]...". (Feito)

3.
Identificação de Espécies Especiais: Durante a contagem, o programa deve identificar e exibir mensagens especiais para:
Espécies Pares: Se o número da espécie for par, exiba: "Espécie [número] - PAR: Encontrada em área úmida!". (Feito)
Espécies Ímpares: Se o número da espécie for ímpar, exiba: "Espécie [número] - ÍMPAR: Encontrada em área seca!". (Feito)

4.
Alerta de Espécie Rara: Se o número da espécie fu seja, divisível poor um múltiplo de 7 (or 7), exiba um alerta adicional:
 "ALERTA: Espécie [número] - RARA! Cuidado ao manusear!". Esta mensagem deve aparecer além da mensagem de par/ímpar. (Feito)
Requisitos Técnicos:
Utilize a classe Scanner para receber a entrada do usuário. (Feito)
Utilize apenas um laço de repetição (for ou while) para a contagem. (Feito)
Utilize estruturas condicionais (if, else if, else) para as verificações de par/ímpar e múltiplo de 7. (Feito)
O programa deve ser claro e amigável para o usuário, com mensagens explicativas.
Certifique-se de que o programa lide com a entrada de um número positivo. (Feito)
Se o usuário digitar um número zero ou negativo, o programa deve pedir para digitar novamente até que um número positivo seja fornecido. (Feito)
 */


import java.util.Scanner;

public class Desafio11_CatalogoDeEspecies {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        int numEspecies; // Inicia a variável que será utilizada como entrada
    
        while (true) { // Cria um looping no qual sempre que o usuário digitar 0 ou um número negativo, o programa aponta um erro e pede para ele escrever novamente
            System.out.print("Digite um número inteiro e positivo: ");
            numEspecies = keyboard.nextInt();

            if (numEspecies <= 0) {
                System.out.println("ERRO: Por favor, digite novamente logo abaixo:\n");
                continue;
            } else {
                break; // Quebra do looping caso o número digitado seja positivo e/ou maior que 0
            }
        }

        int ContProgss = 0;

        // Parte da contagem das espécies
        while (ContProgss <= (numEspecies - 1)) {
            ContProgss++;
            System.out.printf("\nCatalogando espécie n° %s.\n", ContProgss); // Traz de maneira formatada cada espécie que foi catalogada

            if (ContProgss % 7 == 0) {
                System.out.printf("ALERTA: Espécie [%s] - RARA! Cuidado ao manusear!\n", ContProgss); // Identifica se há alguma espécie que seja divisível por 7, e caso tenha, cataloga a mesma como rara
            }

            if (ContProgss % 2 == 0) {
                System.out.printf("Espécie [%s] - PAR: Encontrada em área úmida.\n", ContProgss); // Identifica se é uma espécie par e exibe a mensagem
                System.out.println();
            } else {
                System.out.printf("Espécie [%s] - ÍMPAR: Encontrada em área seca.\n", ContProgss); // Identifica se é uma espécie ímpar e exibe a mensagem
            }
        }
    }
}
