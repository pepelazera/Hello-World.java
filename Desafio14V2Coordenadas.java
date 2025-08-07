package aulasjava01;
import java.util.Scanner;

public class Desafio14V2Coordenadas {
    public static void main(String[] arg) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x: ");
        int x = sc.nextInt();
        System.out.print("Digite o valor de y: ");
        int y = sc.nextInt();

        // Caso eu coloque || no lugar de &&, para encerrar o programa, precisarei colocar o X sendo 0 e o  sendo 0 também
        while (x != 0 && y != 0 ) { // Se um dos valores forem 0 nesse caso, o programa será encerrado
            if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            }
            else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            }
            else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            }
            else {
                System.out.println("Quarto");
            }
            System.out.print("Digite outro valor para x: ");
            x = sc.nextInt();
            System.out.print("Digite outro valor para y: ");
            y = sc.nextInt();
        }
        System.out.println("Encerrando programa...");
        sc.close();
    }
}
