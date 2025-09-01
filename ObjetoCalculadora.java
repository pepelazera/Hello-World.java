package aulasjavapoo;
import java.util.Scanner;

public class ObjetoCalculadora {
    Scanner sc = new Scanner(System.in);
    protected float soma;
    protected float subtracao;
    protected float multiplicacao;
    protected float divisao;

    public void status() {
        System.out.print("Escolha uma operação para fazer: ");
        String operacao = sc.nextLine();

        switch (operacao) {
            case "+" -> {
                System.out.print("Escreva valor de X: ");
                float x = sc.nextFloat();

                System.out.print("Escreva o valor de Y: ");
                float y = sc.nextFloat();

                soma = x + y;
                System.out.printf("%s + %s = %s", x, y, soma);

            }
            case "-" -> {
                System.out.print("Escreva o valor de X: ");
                float x = sc.nextFloat();

                System.out.print("Escreva o valor de Y: ");
                float y = sc.nextFloat();

                subtracao = x - y;
                System.out.printf("%s - %s = %s", x, y, subtracao);
            }
            case "*" -> {
                System.out.print("Escreva o valor de X: ");
                float x = sc.nextFloat();

                System.out.print("Escreva o valor de Y: ");
                float y = sc.nextFloat();

                multiplicacao = x * y;
                System.out.printf("%s * %s = %s", x, y, multiplicacao);
            }
            case "/" -> {
                System.out.print("Escreva o valor de X: ");
                float x = sc.nextFloat();

                System.out.println("Escreva o valor de Y: ");
                float y = sc.nextFloat();

                divisao = x / y;
                System.out.printf("%s / %s = %s", x, y, divisao);
            }
        }
        
    }
}
