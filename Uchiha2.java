package Aulas;

public class Uchiha2 extends NinjaAula2 implements NinjaInterface {

    public Uchiha2() {
    }

    public Uchiha2(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
    }

    @Override
    public void habilidadeEspecial() {
        System.out.printf("Meu nome é %s. Esse é meu ataque especial: %s\n", nome, ataqueEspecial);
    }
}
