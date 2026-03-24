package AulasHeranca;

public class Hyuga extends Ninja {

    String ataqueEspecial;

    public Hyuga() {
        super();
    }

    public Hyuga(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
        this.habilidadeEspecial();
    }

    public void byakuganAtivado() {
        System.out.printf("Meu nome é %s. Sou um Hyuga, por isso possuo um byakugan\n", nome);
    }

    public void habilidadeEspecial() {
        System.out.printf("Esse é meu ataque especial: %s", ataqueEspecial);
    }

}
