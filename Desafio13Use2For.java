package aulasjava01;

public class Desafio13Use2For {
    public static void main(String[] arg) {
        int linha;
        int coluna;

        for (linha = 1; linha <= 10; linha += 1) {
            for (coluna = 1; coluna <= linha; coluna += 1) {
                System.out.print(linha + " ");
            }
            if (linha % 2 == 0) {
                System.out.print("*");
            } else {
                System.out.print("#");
            }
            System.out.println();
            }
        }
    }