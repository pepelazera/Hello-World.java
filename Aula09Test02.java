package aulas;
import java.util.Scanner;

public class Aula09Test02 {
    public static void main(String[] arg){
        Scanner teclado = new Scanner(System.in);

        System.out.print("Valor 1: ");
        int n1 = teclado.nextInt();

        System.out.print("Valor 2: ");
        int n2 = teclado.nextInt();
        System.out.println();

        if  (n1 % 2 == 0) {
            System.out.println("O valor "+n1+" é par.");
        }
        else {
            System.out.println("O valor "+n1+" é ímpar.");
        }

        if (n2 % 2 == 0) {
            System.out.println("O valor "+n2+" é par.");
        }
        else {
            System.out.println("O valor "+n2+" é ímpar.");
        }
    }
}
