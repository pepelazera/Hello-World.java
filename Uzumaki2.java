package Aulas;

public class Uzumaki2 extends NinjaAula2 implements NinjaInterface {

    public Uzumaki2() {
    }

    public Uzumaki2(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.printf("Meu nome é %s. Esse é meu ataque especial: %s\n", nome, ataqueEspecial);
    }

}
