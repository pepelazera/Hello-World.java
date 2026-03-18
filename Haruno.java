package AulaHeranca;

public class Haruno extends Ninja {

    public void CuraAprimorada() {
        System.out.printf("Sou a %s. Gracas ao meu cla, tenho uma cura aprimorada", nome);
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("Status da missao: " + StatusDaMissao);
        System.out.printf("Por se tratar de um membro do clã Haruno, %s tem uma habilidade de cura mais avançada", nome);
    }

}
