package ExerciseSection10;
import java.util.Scanner;

public class Altura {
    Scanner sc = new Scanner(System.in);

    private String nome;
    private int idade;
    private float altura;

    public void infoPessoas() {
        System.out.print("Quantas pessoas deseja cadastrar ? ");
        int n = sc.nextInt();
        float sumAlturas = 0;
        float media = 0;
        int pessoasMenores = 0;
        float porcentMenores = 0;
        String nomeMenores = "";

        int[] vect = new int[n];

        for (int i=0; i<vect.length; i++) {
            System.out.printf("Nome da %sa. pessoa: ", i+1);
            this.setNome(sc.nextLine());
            sc.nextLine();

            System.out.printf("Idade da %sa. pessoa: ", i+1);
            this.setIdade(sc.nextInt());

            System.out.printf("Altura da %sa. pessoa: ", i+1);
            this.setAltura(sc.nextFloat());
            System.out.println();
            sumAlturas += this.altura;

            media = sumAlturas / n;

            if (this.getIdade() < 16) {
                pessoasMenores++;
            }
        }

        porcentMenores = (float) pessoasMenores / n*100;

        System.out.printf("A media das alturas eh: %.2f", media);
        System.out.printf("\nPessoas com menos de 16 anos: %.2f", porcentMenores);

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

    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }

}
