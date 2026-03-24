package AulasHeranca;

import Aulas.NivelNinja;

public class Uchiha extends Ninja implements SharinganInterface {

    String ataqueEspecial;

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
        this.habilidadeEspecial();
    }

    public Uchiha(String nome, String aldeia, int idade, String ataqueEspecial, int numeroMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, ataqueEspecial, numeroMissoesConcluidas, rank);
        this.habilidadeEspecial();
    }

    public void habilidadeEspecial() {
        System.out.printf("Esse é meu ataque especial: %s", ataqueEspecial);
    }

    @Override
    public void SharinganAtivado() {
        System.out.printf("Nome do usuário: %s - Sharingan ativado\n", nome);
    }
}
