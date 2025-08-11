package aulasjava01;
import java.util.Locale;
import java.util.Scanner;

public class Desafio18 {
    public static void main(String[] arg){

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas médias serão calculadas: ");
        int N = sc.nextInt(); // Quantas vezes o for vai ser repetido

        for (int i = 0; i < N; i++) {

            double n1 = sc.nextDouble();
            double n2 = sc.nextDouble();
            double n3 = sc.nextDouble();

            double media = ((n1*2.0) + (n2*3.0) + (n3*5.0)) / 10.0;

            System.out.printf("%.1f%n", media);
            System.out.println();
        }

        sc.close();

    }
}
