package AulasHeranca;

public class Haruno extends Ninja {

    String ataqueEspecial;

    public Haruno() {
        super();
    }

    public Haruno(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
        this.habilidadeEspecial();
    }

    public void curaAcimaDoNormal() {
        System.out.printf("Meu nome é %s. Sou um Haruno, por isso possuo uma cura acima do normal\n", nome);
    }

    public void habilidadeEspecial() {
        System.out.printf("Esse é meu ataque especial: %s", ataqueEspecial);
    }

}
