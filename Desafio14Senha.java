package aulasjava01;
import java.util.Scanner;

public class Desafio14Senha {
    public static void main(String[] arg) {
        Scanner keyboard = new Scanner(System.in);

        while (true) {
            System.out.print("Digite a senha: ");
            int senha = keyboard.nextInt();

            if (senha == 2002) {
                System.out.println("Acesso autorizado.");
                break;
            } else {
                System.out.println("Senha inválida");
            }
        }
    }
}
