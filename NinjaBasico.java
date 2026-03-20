package Desafio4Java10x;

public class NinjaBasico implements Ninja {

    String nome;
    int idade;
    String habilidade;
    TipoHabilidade tipoDaHabilidade;

    public NinjaBasico(String nome, int idade, String habilidade, TipoHabilidade tipoDaHabilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.tipoDaHabilidade = tipoDaHabilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("\nNome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade: " + habilidade);
        System.out.println("Tipo de habilidade: " + tipoDaHabilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Sou um ninja iniciante, por isso sou capaz de usar apenas 1 elemento");
    }

}
