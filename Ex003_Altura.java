package ExerciseSection10;
import java.util.Scanner;

public class Ex003_Altura {

    Scanner sc = new Scanner(System.in);

    private String nome;
    private int idade;
    private double altura;

    public void infoPessoas() {

        int n, nMenores;
        double alturaTotal, alturaMedia, percentualMenores;

        System.out.print("Quantas pessoas serao cadastradas ? ");
        n = sc.nextInt();

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i=0; i<n; i++) {

            System.out.printf("Dados da %da pessoa:\n", i+1);

            System.out.print("Nome: ");
            sc.nextLine();
            nomes[i] = sc.nextLine();

            System.out.print("Idade: ");
            idades[i] = sc.nextInt();

            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();

        }

        nMenores = 0;
        alturaTotal = 0;
        for (int i=0; i<n; i++){
            if (idades[i] < 16) {
                nMenores++;
            }
            alturaTotal += alturas[i];
        }

        alturaMedia = alturaTotal / n;
        percentualMenores = ((double) nMenores / n) * 100.0;

        System.out.printf("\nMedia das alturas = %.2f", alturaMedia);
        System.out.printf("\nPessoas com menos de 16 anos: %.1f%%", percentualMenores);

        for (int i=0; i<n; i++) {
            if (idades[i] < 16) {
                System.out.printf("\n%s", nomes[i]);
            }
        }

        sc.close();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
}
