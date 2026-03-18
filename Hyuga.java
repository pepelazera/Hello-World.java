package AulaHeranca;

public class Hyuga extends Ninja {

    public void ByakuganAtivado() {
        System.out.printf("Meu nome eh %s. Sou um membro do cla Hyuga. Ativando meu Byakugan", nome);
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("Status da missao: " + StatusDaMissao);
        System.out.printf("Por se tratar de um membro do clã Hyuga, %s é um portador do Byakugan", nome);
    }

}
