package Section10;
import java.util.Scanner;

public class Vetor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor inicial: ");
        int n = sc.nextInt();

        double[] vect = new double[n]; // Cria um vetor e determina o tamanho dele

        for (int i = 0; i < n; i++) {

            System.out.print("\nDigite o "+(i+1)+"o. valor: ");
            vect[i] = sc.nextDouble();
            System.out.printf("\n%so. valor: %s", (i+1), vect[i]);
            System.out.println();

        }

        double sum = 0;

        for (int i=0; i<n; i++) {
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("Average height = %.2f%n",avg);

        sc.close();
    }
}
