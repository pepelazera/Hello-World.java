package Exercicio;

import java.util.Scanner;

public class Personagem extends Haki {

    String nome;
    int idade;
    boolean akumaNoMi;
    String tripulacao;
    String raca;
    String statusSocial;

    String nomeAkumaNoMi;
    TipoAkumaNoMi tipoAkumaNoMi;



    public Personagem() {
    }

    public Personagem(String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial) {
        this.nome = nome;
        this.idade = idade;
        this.akumaNoMi = akumaNoMi;
        this.tripulacao = tripulacao;
        this.raca = raca;
        this.statusSocial = statusSocial;
    }

    public Personagem(String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial, String nomeAkumaNoMi, TipoAkumaNoMi tipoAkumaNoMi) {
        this(nome, idade, akumaNoMi, tripulacao, raca, statusSocial);
        this.nomeAkumaNoMi = nomeAkumaNoMi;
        this.tipoAkumaNoMi = tipoAkumaNoMi;
    }

    // Usuario dos Hakis sem uma Akuma no Mi
    public Personagem(String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial,
                      boolean hakiDaObservacao, boolean hakiDOArmamento, boolean hakiDoRei,
                      boolean hakiDaObservacaoAvancado, boolean hakiDoArmamentoAvancado, boolean hakiDoReiAvancado) {
        this(nome, idade, akumaNoMi, tripulacao, raca, statusSocial);
        this.hakiDaObservacao = hakiDaObservacao;
        this.hakiDoArmamento = hakiDOArmamento;
        this.hakiDoRei = hakiDoRei;

        this.hakiDaObervacaoAvancado = hakiDaObservacaoAvancado;
        this.hakiDOArmamentoAvancado = hakiDoArmamentoAvancado;
        this.hakiDoReiAvancado = hakiDoReiAvancado;
    }

    // Usuario dos Hakis com uma Akuma no Mi
    public Personagem(String nome, int idade, boolean akumaNoMi, String tripulacao, String raca, String statusSocial, String nomeAkumaNoMi, TipoAkumaNoMi tipoAkumaNoMi,
                      boolean hakiDaObservacao, boolean hakiDOArmamento, boolean hakiDoRei,
                      boolean hakiDaObservacaoAvancado, boolean hakiDoArmamentoAvancado, boolean hakiDoReiAvancado) {
        this(nome, idade, akumaNoMi, tripulacao, raca, statusSocial, nomeAkumaNoMi, tipoAkumaNoMi);
        this.hakiDaObservacao = hakiDaObservacao;
        this.hakiDoArmamento = hakiDOArmamento;
        this.hakiDoRei = hakiDoRei;

        this.hakiDaObervacaoAvancado = hakiDaObservacaoAvancado;
        this.hakiDOArmamentoAvancado = hakiDoArmamentoAvancado;
        this.hakiDoReiAvancado = hakiDoReiAvancado;
    }

    public void usuarioAkumaNoMi(String nomeAkumaNoMi, TipoAkumaNoMi tipoAkumaNoMi) {
        this.nomeAkumaNoMi = nomeAkumaNoMi;
        this.tipoAkumaNoMi = tipoAkumaNoMi;

        if (akumaNoMi) {
            System.out.printf("%s eh um usuario da %s, uma Akuma no Mi do tipo %s\n", nome, nomeAkumaNoMi, tipoAkumaNoMi);
        } else {
            System.out.printf("%s nao possui uma Akuma no Mi", nome);
        }
    }

    public void InfoPersonagem() {
        Scanner ct = new Scanner(System.in);

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Tripulacao: " + tripulacao);
        System.out.println("Raca: " + raca);
        System.out.printf("%s eh um usuario de Akuma no Mi ? %s\n", nome, akumaNoMi);

        if (akumaNoMi) {
            System.out.println("Nome da fruta: " + nomeAkumaNoMi);
            System.out.println("Tipo: " + tipoAkumaNoMi);
        }

        System.out.println("\nTipos de Haki: ");

        System.out.println("Tem Haki da observacao: " + hakiDaObservacao);
        System.out.println("Tem Haki do armamento: " + hakiDoArmamento);
        System.out.println("Tem Haki do rei: " + hakiDoRei);

        System.out.println("Tem Haki da observacao avancado: " + hakiDaObervacaoAvancado);
        System.out.println("Tem Haki do armamento avancado: " + hakiDOArmamentoAvancado);
        System.out.println("Tem Haki do rei avancado: " + hakiDoReiAvancado);
    }
}
