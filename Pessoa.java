package ProjetoAula14;

import java.util.Scanner;

public class Pessoa {
    protected String nome;
    protected int idade;
    protected String sexo;
    protected int experiencia;
    protected String classificacao;


    // Metodos
    public void status () {
        System.out.println("=== Informações da pessoa ===");
        System.out.println("Nome: "+this.getNome());
        System.out.println("Idade: "+this.getIdade()+" anos");
        System.out.println("Sexo: "+this.getSexo());
        System.out.println("Tempo de experiencia: "+this.getExperiencia()+" anos");
        System.out.println("Categoria: "+this.getClassificacao());
    }


    public void tempoExp() {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Tempo de experiencia: ");
            this.setExperiencia(sc.nextInt());


            if (this.getExperiencia() > 0 && this.getExperiencia() < 3) {
                this.setClassificacao("Junior");
                break;
            }

            else if (this.getExperiencia() >= 4 && this.getExperiencia() < 6) {
                this.setClassificacao("Pleno");
                break;
            }

            else if (this.getExperiencia() >= 6) {
                this.setClassificacao("Senior");
                break;
            }

            else {
                System.out.println("ERRO: Nao entendi, por favor, repita sua quantos anos de experiencia voce tem para eu poder continuarr:");
            }

            sc.close();
        }
    }


    // Getters e Setters
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


    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


    public int getExperiencia() {
        return experiencia;
    }
    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }


    public String getClassificacao() {
        return classificacao;
    }
    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }


}
