package AulasHeranca;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface, HokageInterface {

    // Aqui será iniciado o conceito de herança múltipla

    public Hatake() {
    }

    public Hatake(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
    }

    public void boasVindas() {
        System.out.printf("%s: Eu sou um Hatake", nome);
    }

    // Esse método vem direto da interface
    @Override
    public void SharinganAtivado() {
        System.out.printf("Nome do usuário: %s - Sharingan ativado\n", nome);
    }

    @Override
    public void MembroDaAnbu() {
        System.out.printf("%s é um membro da Anbu\n", nome);
    }

    @Override
    public void HokageAtivo() {
        System.out.printf("%s é o atual líder da %s, o 6° Hokage\n",nome, aldeia);
    }
}
