package aulasjava01;
import java.util.Scanner;

public class Desafio14V3Posto {
    public static void main(String[] arg) {
        Scanner kb = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            System.out.println(
                    "[1] Álcool" +
                            "\n[2] Gasolina" +
                            "\n[3] Diesel" +
                            "\n[4] Sair");
            System.out.print("Sua opção: ");
            int resp = kb.nextInt();

            if (resp == 1) {
                System.out.println("\nUsário escolheu Álcool.\n");
                alcool++;
            } else if (resp == 2) {
                System.out.println("\nUsuário escolheu Gasolina.\n");
                gasolina++;
            } else if (resp == 3) {
                System.out.println("\nUsuário escolheu Diesel.\n");
                diesel++;
            } else if (resp == 4) {
                System.out.println("\nEncerrando atendimento...\n");
                break;
            } else {
                System.out.println("Opção Inválida.");
                System.out.println();
            }
        }
        System.out.printf("Ácool: %s\n", alcool);
        System.out.printf("Gasolina: %s\n", gasolina);
        System.out.printf("Diesel: %s\n", diesel);
        System.out.println("Obrigado! Volte sempre!");
    }
}
