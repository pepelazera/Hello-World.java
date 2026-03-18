package AulaHeranca;

public class Uchiha extends Ninja {

    public void SharinganAtivado() {
        System.out.printf("%s é um membro do cla Uchiha", nome);
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("Status da missao: " + StatusDaMissao);
        System.out.printf("Por se tratar de um membro do clã Uchiha, %s é um portador do sharingan", nome);
    }
}
