package aulasjava01;
import java.util.Scanner;
import java.util.Locale;

public class Desafio19 {
    public static void main(String[] arg) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas contas você quer fazer ? ");
        int N = sc.nextInt();
        float num;
        float den;

        for(int i=1; i<=N;i++) {
            System.out.print("Digite o numerador: ");
            num = sc.nextFloat();
            System.out.print("Digite o denominador: ");
            den = sc.nextFloat();
            float div = (num / den);
            if (den == 0) {
                System.out.println("ERRO: Impossível gerar divisão por zero.");
            } else {
                System.out.printf("Resultado: %.2f\n",div);
            }
        }

        sc.close();
    }
}
