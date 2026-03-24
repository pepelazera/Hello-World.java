package AulasHeranca;

import Aulas.NivelNinja;

public abstract class Ninja {

    //TODO: Incluir 2 novos atributos: numMissoesConcluidas, rank
    // TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    String ataqueEspecial;
    int numMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade, String ataqueEspecial) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.ataqueEspecial = ataqueEspecial;
    }

    //TODO: Sobrecarga do construtor chamando os novos atributos

    // Nas sobrecargas de métodos, você não precisa redeclarar o construtor, somente os novos atributos
    public Ninja(String nome, String aldeia, int idade, String ataqueEspecial, int numMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade, ataqueEspecial); // Referencio o construtor antigo usando o this e colocando os antigos parâmetros
        this.numMissoesConcluidas = numMissoesConcluidas;
        this.rank = rank;
    }


    public void MostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia : " + aldeia);
        System.out.println("Idade: "+idade);
    }

}
