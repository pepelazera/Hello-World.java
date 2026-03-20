package Desafio4Java10x;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade; // Habilidade especial do Ninja
    TipoHabilidade tipoDaHabilidade;

    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade, TipoHabilidade tipoDaHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
        this.tipoDaHabilidade = tipoDaHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Especialidade: " + especialidade);
        System.out.println("Tipo da habilidade: " + tipoDaHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Sou um ninja avançado, por isso sou capaz de usar mais de 2 elementos");
    }
}
