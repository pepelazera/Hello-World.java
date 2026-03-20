package AulaPolimorfismo;

public class Uzumaki2 extends NinjaAula2 implements NinjaInterface {

    @Override
    public void habilidadeEspecial() {
        System.out.printf("Meu nome é %s. Esse é meu ataque especial: %s\n", nome, ataqueEspecial);
    }

    @Override
    public void nomeDoNinja() {
        System.out.println("Meu nome é %s");
    }

    public void tacarUmaShuriken() {
        System.out.println("Eu taquei uma shuriken");
    }

}
