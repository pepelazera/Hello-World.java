package AulasHeranca;

public class Uzumaki extends Ninja {

    String ataqueEspecial;

    public Uzumaki() {
        super();
    }

    public Uzumaki(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
        this.habilidadeEspecial();
    }

    public void chakraInfinito() {
        System.out.printf("Meu nome é %s. Sou um Uzumaki, por isso tenho um chakra quase infinito\n", nome);
    }

    public void habilidadeEspecial() {
        System.out.printf("Esse é meu ataque especial: %s", ataqueEspecial);
    }
}
