package aulasjava01;
import java.util.Scanner;

public class Desafio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String palavraOriginal = sc.nextLine();

        String nome = contarVogaisConsoantes(palavraOriginal);

        sc.close();
    }

    public static String contarVogaisConsoantes(String texto) {
        int vogais = 0;
        int consoantes = 0;
        String[] arrayNomes = {texto};
        for (String nomes: arrayNomes) {
            String nomesParaLeitura = nomes.toLowerCase(); // converte tudo para minúsculo, facilitanto a leitura
            for (int i = 0; i < nomesParaLeitura.length(); i++) {
                char caracteres = nomesParaLeitura.charAt(i);
                if (Character.isLetter(caracteres)) { // verifica as letras da variável caracteres.
                    if (caracteres == 'a' || caracteres == 'e' || caracteres == 'i' || caracteres == 'o' || caracteres == 'u') {
                        vogais++; // verifica e coloca só as vogais na variável vogal
                    }
                    else {
                        consoantes++; // faz a mesma coisa com as consoantes
                    }
                }
            }
            System.out.printf("A quantidade de vogais presentes no nome: %s, são: %s\n", nomesParaLeitura, vogais);
            System.out.printf("A quantidade de consoantes presentes no nome: %s, são: %s", nomesParaLeitura, consoantes);
        }
        return texto;
    }
}
