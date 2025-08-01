/*
    Desafio 06 – Calculadora de IMC com Classificação e Recomendação
    Crie um programa em Java que:

    Solicite ao usuário o peso (em kg) e a altura (em metros).

    Calcule o Índice de Massa Corporal (IMC) usando a fórmula IMC = peso / (altura²).

    Classifique o IMC de acordo com a faixa:

    Abaixo de 18.5 → "Abaixo do peso"

    De 18.5 até 24.9 → "Peso normal"

    De 25.0 até 29.9 → "Sobrepeso"

    De 30.0 até 34.9 → "Obesidade grau I"

    35.0 ou mais → "Obesidade grau II"

    Com base na classificação, use um switch para exibir uma mensagem de recomendação, como:

    Caso 1 → “Recomenda-se procurar orientação nutricional.”

    Caso 2 → “Continue mantendo hábitos saudáveis!”

    Outros → “Consulte um profissional de saúde para orientação.”

 */

package aulas;
import java.util.Scanner;

public class Desafio06 {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        float peso = teclado.nextFloat();

        System.out.print("Digite sua altura: ");
        float altura = teclado.nextFloat();

        float IMC = (peso) / (altura * altura);

        int categoria = -1;

        if (IMC < 18.5) {
            categoria = 0;
        } else if (IMC < 25) {
            categoria = 1;
        } else if (IMC < 30) {
            categoria = 2;
        } else if (IMC < 35 ){
            categoria = 3;
        } else {
            categoria = 4;
        }

        String tipo;
        String resultado = "";

        switch (categoria) {
            case 0:
                tipo = "abaixo do peso";
                resultado = "Você está com "+tipo+". Recomenda-se procurar orientação nutricional.";
                break;
            case 1:
                tipo = "peso normal";
                resultado = "Você está com o "+tipo+". Continue mantendo hábitos saudáveis!";
                break;
            case 2:
                tipo = "sobrepeso";
                resultado = "Você está com "+tipo+ ". Recomenda-se procurar orientação nutricional.";
                break;
            case 3:
                tipo = "Obesidade grau I";
                resultado = "Você está com "+tipo+". Consulte um profissional de saúde para orientação.";
                break;
            case 4:
                tipo = "Obesidade grau II";
                resultado = "Você está com "+tipo+". Consulte um profissional de saúde para orientação.";
                break;
        }
        System.out.println(resultado);
    }
}
