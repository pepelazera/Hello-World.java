package AulaPolimorfismo;

public class Uchiha2 extends NinjaAula2{

    @Override
    public void habilidadeEspecial() {
        System.out.printf("Meu nome é %s. Esse é meu ataque especial: %s\n", nome, ataqueEspecial);
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é %s");
    }
}
