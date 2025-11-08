package Section10;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja digitar posteriormente ? ");
        int n = sc.nextInt();
        double[] vetor = new double[n];

        for(int i = 0; i < n; i++) {

            System.out.printf("Digite o %so. elemento: ", i+1);
            vetor[i] = sc.nextDouble();

        }

        double soma = 0.0;

        for (int i = 0; i < n; i++) {
            soma += vetor[i];

        }

        double media = soma / n;

        System.out.printf("\nMedia das alturas: %.2f%n", media);

        sc.close();
    }
}


