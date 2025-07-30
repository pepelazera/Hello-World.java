package aulas;
import java.util.Scanner;

public class Aula09Teste {
    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a data de nascimento do usuário: ");
        int nasc = teclado.nextInt();
        int idade = 2025 - nasc;
        if (idade>= 18) {
            System.out.println("Indivíduo maior de idade.");
        }
        else {
            System.out.println("Indivíduo menor de idade.");
        }
    }
}
