package aulas;

public class Aula06CursoEmVideo {
    public static void main(String[] agrs) {

        // 4 famílias diferentes (e é claro que tem muito mais)

        String nome = "Gustavo";
        int idade = 23;
        float nota = 8.5f;
        char letra = 'g';
        boolean casado = true;
        //System.out.printf("A nota de %s é %.1f",nome, nota); -> print formatado
        System.out.println("\nEla tem "+ idade + " anos");
        System.out.printf("Sua nota é %.1f", nota);
        System.out.format("\nA nota de %s é %.1f",nome, nota); // -> print formatado também kkkkk
    }
}