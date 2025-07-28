package aulas;
import java.util.Scanner;

public class Aula06CursoEmVideo {
    public static void main(String[] agrs) {

        // 4 famílias diferentes (e é claro que tem muito mais)

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();
        System.out.print("Digite a nota do aluno: ");
        float nota = teclado.nextFloat();
        char letra = 'g';
        boolean casado = true;
        //System.out.printf("A nota de %s é %.1f",nome, nota); -> print formatado
        System.out.format("\nA nota de %s é %.1f",nome, nota); // -> print formatado também kkkkk
    }
}
