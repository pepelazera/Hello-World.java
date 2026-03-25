package AulaHerancaMultipla;

public class Uchiha2 extends NinjaAula2 implements NinjaInterface, SharinganInterface {

    public Uchiha2() {
    }

    public Uchiha2(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
    }

    @Override
    public void HabilidadeEspecial() {
        System.out.printf("Meu nome é %s. Esse é meu ataque especial: %s\n", nome, ataqueEspecial);
    }

    // Esse método vem direto da interface
    @Override
    public void SharinganAtivado() {
        System.out.printf("%s É um Uchiha. Por isso, ele é um portador do Sharingan", nome);
    }
}
