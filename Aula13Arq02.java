package aulasjava01;

public class Aula13Arq02 {
    public static void main(String[] arg) {
        for (int i = 1; i <= 3; i += 1) { // Teste de estruturas de repetições aninhadas
            for (int j = 0; j <= 2; j += 2) {
                System.out.print(i + " ");
                System.out.print(j);
                System.out.println();
            }
        }
    }
}