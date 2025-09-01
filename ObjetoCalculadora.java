package aulasjavapoo;
import java.util.Scanner;

public class ObjetoCalculadora {
    Scanner sc = new Scanner(System.in);
    private float soma;
    private float subtracao;
    private float multiplicacao;
    private float divisao;
    private String resp;

    public void status() {
        System.out.print("Escolha uma operação para fazer: ");
        String operacao = sc.nextLine();

        if (operacao.equals("+")) {
            System.out.print("Escreva valor de X: ");
            float x = sc.nextFloat();

            System.out.print("Escreva o valor de Y: ");
            float y = sc.nextFloat();

            soma = x + y;
            System.out.printf("%s + %s = %s", x, y, soma);
        } else if (operacao.equals("-")) {
            System.out.print("Escreva o valor de X: ");
            float x = sc.nextFloat();

            System.out.print("Escreva o valor de Y: ");
            float y = sc.nextFloat();

            subtracao = x - y;
            System.out.printf("%s - %s = %s", x, y, subtracao);
        } else if (operacao.equals("*")) {
            System.out.print("Escreva o valor de X: ");
            float x = sc.nextFloat();

            System.out.print("Escreva o valor de Y: ");
            float y = sc.nextFloat();

            multiplicacao = x * y;
            System.out.printf("%s * %s = %s", x, y, multiplicacao);
        } else if (operacao.equals("/")) {
            System.out.print("Escreva o valor de X: ");
            float x = sc.nextFloat();

            System.out.println("Escreva o valor de Y: ");
            float y = sc.nextFloat();

            divisao = x / y;
            System.out.printf("%s / %s = %s", x, y, divisao);
        }
    }
}

