package AulaPolimorfismo;

public abstract class Hokages {

    // Argumentos
    String nome;
    int idade;
    boolean emAtividade;

    public abstract void sabedoriaHokage();

    public void mostrarInfos() {
        System.out.println("\nNome do Hokage: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Em atividade (true/false): " + emAtividade);
    }
}
