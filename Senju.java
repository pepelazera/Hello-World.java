package AulaPolimorfismo;

public class Senju extends Hokages {

    @Override
    public void sabedoriaHokage() {
        System.out.println("Você ganhou sabedoria, " + nome);
    }

    // All args Constructor = Constructor com todos os argumentos
    public Senju(String nome, int idade, boolean emAtividade) {
        this.nome = nome;
        this.idade = idade;
        this.emAtividade = emAtividade;
    }

    public Senju() {
        // Construtor vazio, sem argumentos
        // O java já cria esse construtor vazio sempre que o usuario cria uma classe
    }
}
