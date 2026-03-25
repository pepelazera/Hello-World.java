package AulaHerancaMultipla;

public class Hatake extends NinjaAula2 implements SharinganInterface, AnbuInterface, HokageInterface {

    public void aps() {
        System.out.printf("%s é um membro do clã Hatake", nome);
    }

    public Hatake(String nome, String aldeia, int idade, String ataqueEspecial) {
        super(nome, aldeia, idade, ataqueEspecial);
    }

    @Override
    public void SharinganAtivado() {
        System.out.printf("%s é um portador do Sharingan, mas não é um Uchiha\n", nome);
    }

    @Override
    public void MembroDaAnbu() {
        System.out.printf("%s é um membro da Anbu\n", nome);
    }

    @Override
    public void HokageAtivo() {
        System.out.printf("%s é o Hokage atual, o 6° hokage", nome);
    }
}
