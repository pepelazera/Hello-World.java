package AulaHeranca;

public class Uzumaki extends Ninja{

    public void ChakraInfinito() {
        System.out.printf("%s é um membro do clã Uzumaki, por isso ele tem chakra quase que infinito", nome);
    }

    public void mostrarInfos() {
        System.out.println("Nome: " + nome);
        System.out.println("Aldeia: " + aldeia);
        System.out.println("Idade: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("Status da missao: " + StatusDaMissao);
        System.out.printf("Por se tratar de um membro do clã Uzumaki, %s tem chakra quase infinito", nome);
    }
}
